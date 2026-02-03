package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class estb {
    public static final estb a = new estb(1, null, null, null);
    public final essx b;
    public final fbnc c;
    public final int d;
    private final ListenableFuture e;

    public estb(int i, essx essxVar, ListenableFuture listenableFuture, fbnc fbncVar) {
        this.d = i;
        this.b = essxVar;
        this.e = listenableFuture;
        this.c = fbncVar;
    }

    public static estb b(Status status, fbrg fbrgVar) {
        status.getClass();
        ejwl.m(!status.f(), "Error status must not be ok");
        return new estb(2, new essx(status, fbrgVar), null, null);
    }

    public static estb c(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return new estb(4, null, listenableFuture, null);
    }

    public final ListenableFuture a() {
        ejwl.l(this.d == 4);
        return this.e;
    }
}
