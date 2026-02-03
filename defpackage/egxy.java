package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxy {
    public ejvr a;
    private ListenableFuture b;
    private Object c;

    public final egzb a() {
        Object obj;
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture != null && (obj = this.c) != null) {
            return new egxz(listenableFuture, obj, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" future");
        }
        if (this.c == null) {
            sb.append(" key");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ListenableFuture listenableFuture) {
        if (listenableFuture == null) {
            throw new NullPointerException("Null future");
        }
        this.b = listenableFuture;
    }

    public final void c(Object obj) {
        this.c = obj;
    }
}
