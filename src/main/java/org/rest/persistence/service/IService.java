package org.rest.persistence.service;

import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.rest.common.IEntity;
import org.rest.common.IRestDao;
import org.springframework.data.domain.Page;

public interface IService<T extends IEntity> extends IRestDao<T> {

    // search

    List<T> search(final ImmutablePair<String, ?>... constraints);

    // find - all

    Page<T> findPaginated(final int page, final int size, final String sortBy);

    // delete

    void deleteAll();

}
