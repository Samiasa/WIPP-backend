package gov.nist.itl.ssd.wipp.backend.argo.workflows.plugin;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 *
 * @author Philippe Dessauw <philippe.dessauw at nist.gov>
 */
@RepositoryRestResource
public interface PluginRepository extends MongoRepository<Plugin, String> {

}
