package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class essx {
    public final Status a;
    public final fbrg b;

    public essx(Status status, fbrg fbrgVar) {
        ejwl.m(!status.f(), "Error status must not be OK");
        this.a = status;
        this.b = fbrgVar;
    }
}
