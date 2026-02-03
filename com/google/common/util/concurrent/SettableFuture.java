package com.google.common.util.concurrent;

import defpackage.eooi;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SettableFuture<V> extends eooi.f<V> {
    public static final /* synthetic */ int a = 0;

    private SettableFuture() {
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // defpackage.eooi
    public boolean set(V v) {
        return super.set(v);
    }

    @Override // defpackage.eooi
    public boolean setException(Throwable th) {
        return super.setException(th);
    }
}
