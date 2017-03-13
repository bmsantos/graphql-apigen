package com.distelli.graphql;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface AsyncResolver<T> {
    CompletableFuture<List<T>> resolve(final List<T> unresolved);
    CompletableFuture<List<T>> resolve(final Object context, final List<T> unresolved);
}
