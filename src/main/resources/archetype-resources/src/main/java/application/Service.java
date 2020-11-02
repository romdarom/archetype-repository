package ${groupId}.application;

import ${groupId}.port.Repository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class Service {

	private final Repository repository;

	@Inject
	public Service(final Repository pipelinesRepository) {
		this.repository = pipelinesRepository;
	}
}
