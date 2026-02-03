package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egxz extends egzb {
    public final ListenableFuture a;
    public final Object b;
    public final ejvr c;

    public egxz(ListenableFuture listenableFuture, Object obj, ejvr ejvrVar) {
        this.a = listenableFuture;
        this.b = obj;
        this.c = ejvrVar;
    }

    @Override // defpackage.egzb
    public final ejvr a() {
        return this.c;
    }

    @Override // defpackage.egzb
    public final ListenableFuture b() {
        return this.a;
    }

    @Override // defpackage.egzb
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ejvr ejvrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof egzb) {
            egzb egzbVar = (egzb) obj;
            if (this.a.equals(egzbVar.b()) && this.b.equals(egzbVar.c()) && ((ejvrVar = this.c) != null ? ejvrVar.equals(egzbVar.a()) : egzbVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        ejvr ejvrVar = this.c;
        return (iHashCode * 1000003) ^ (ejvrVar == null ? 0 : ejvrVar.hashCode());
    }

    public final String toString() {
        ejvr ejvrVar = this.c;
        Object obj = this.b;
        return "Mutation{future=" + this.a.toString() + ", key=" + obj.toString() + ", localOptimisticTransform=" + String.valueOf(ejvrVar) + "}";
    }
}
