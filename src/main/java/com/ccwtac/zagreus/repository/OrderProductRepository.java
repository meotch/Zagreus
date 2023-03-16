package com.ccwtac.zagreus.repository;

import com.ccwtac.zagreus.model.OrderProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class OrderProductRepository implements CrudRepository<OrderProduct, Long> {
    @Override
    public <S extends OrderProduct> S save(S entity) {
        return null;
    }

    @Override
    public <S extends OrderProduct> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<OrderProduct> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<OrderProduct> findAll() {
        return null;
    }

    @Override
    public Iterable<OrderProduct> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(OrderProduct entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends OrderProduct> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
