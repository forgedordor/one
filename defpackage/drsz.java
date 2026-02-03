package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsz extends drtb {
    public final drta a;
    private final ListenableFuture c;
    private final druc d;

    public drsz(drta drtaVar, ListenableFuture listenableFuture, druc drucVar) {
        if (drtaVar == null) {
            throw new NullPointerException("Null drawParams");
        }
        this.a = drtaVar;
        this.c = listenableFuture;
        this.d = drucVar;
    }

    @Override // defpackage.drtb
    public final drta a() {
        return this.a;
    }

    @Override // defpackage.drtb
    public final ListenableFuture b() {
        return this.c;
    }

    @Override // defpackage.drtb
    public final druc c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drtb) {
            drtb drtbVar = (drtb) obj;
            if (this.a.b(drtbVar.a()) && this.c.equals(drtbVar.b()) && this.d.equals(drtbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        druc drucVar = this.d;
        ListenableFuture listenableFuture = this.c;
        return "DrawRequest{drawParams=" + this.a.toString() + ", future=" + listenableFuture.toString() + ", callback=" + drucVar.toString() + "}";
    }
}
