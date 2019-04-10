import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;

import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        GitHubClient client = new GitHubClient();
        client.setCredentials("", "");

        RepositoryService service = new RepositoryService(client);
        System.out.println(client);
//        for (Repository repo : service.getRepositories(client.getUser()))
//            System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
        try {
            List<Repository> repositories = service.getRepositories();
            String[] result = new String[repositories.size()];
            for (int i = 0; i < repositories.size(); i++) {
                System.out.println(repositories.get(i).getName());
                result[i] = repositories.get(i).getName();
            }

        } catch (IOException e) {
        //    return null;
        }
    }
}
