package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqq implements dxqn {
    public final Set a;
    private final Throwable b;
    private final int c;

    public dxqq(Throwable th, Set set) {
        set.getClass();
        this.b = th;
        this.a = set;
        this.c = 39;
    }

    @Override // defpackage.dxfo
    public final Throwable a() {
        return this.b;
    }

    @Override // defpackage.dxfo
    public final int b() {
        return 39;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ Object c() {
        return dxfs.a(this);
    }

    @Override // defpackage.dxft
    public final /* synthetic */ Object d() {
        return dxfs.b(this);
    }

    @Override // defpackage.dxft
    public final /* synthetic */ String e() {
        return dxfs.c(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxqq)) {
            return false;
        }
        dxqq dxqqVar = (dxqq) obj;
        if (!fdbq.f(this.b, dxqqVar.b) || !fdbq.f(this.a, dxqqVar.a)) {
            return false;
        }
        int i = dxqqVar.c;
        return true;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ Throwable f() {
        return dxfs.d(this);
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + 39;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.dxft
    public final /* synthetic */ int k() {
        return dxfs.e(this);
    }

    public final String toString() {
        return "RpcBackendFailure(exception=" + this.b + ", accountsFailed=" + this.a + ", failureType=RPC_BACKEND_FAILURE)";
    }
}
