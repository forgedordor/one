package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvm extends ehvs {
    public final String a;
    public final evuh b;
    public final ehvh c;
    public final ekgb d;
    public final ejwi e;
    public final ejwi f;
    public final Executor g;
    private final ejwi h;

    public ehvm(String str, ejwi ejwiVar, evuh evuhVar, ehvh ehvhVar, ekgb ekgbVar, ejwi ejwiVar2, ejwi ejwiVar3, Executor executor) {
        this.a = str;
        this.h = ejwiVar;
        this.b = evuhVar;
        this.c = ehvhVar;
        this.d = ekgbVar;
        this.e = ejwiVar2;
        this.f = ejwiVar3;
        this.g = executor;
    }

    @Override // defpackage.ehvs
    public final ehvh a() {
        return this.c;
    }

    @Override // defpackage.ehvs
    public final ejwi b() {
        return this.e;
    }

    @Override // defpackage.ehvs
    public final ejwi c() {
        return this.f;
    }

    @Override // defpackage.ehvs
    public final ejwi d() {
        return this.h;
    }

    @Override // defpackage.ehvs
    public final ekgb e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Executor executor;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehvs) {
            ehvs ehvsVar = (ehvs) obj;
            ehvsVar.i();
            if (this.a.equals(ehvsVar.g()) && this.h.equals(ehvsVar.d()) && this.b.equals(ehvsVar.f()) && this.c.equals(ehvsVar.a()) && ekjz.h(this.d, ehvsVar.e()) && this.e.equals(ehvsVar.b()) && this.f.equals(ehvsVar.c()) && ((executor = this.g) != null ? executor.equals(ehvsVar.h()) : ehvsVar.h() == null)) {
                ehvsVar.j();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ehvs
    public final evuh f() {
        return this.b;
    }

    @Override // defpackage.ehvs
    public final String g() {
        return this.a;
    }

    @Override // defpackage.ehvs
    public final Executor h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 385623362) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Executor executor = this.g;
        return ((((iHashCode * 1000003) ^ 2040732332) * 1000003) ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
    }

    public final String toString() {
        return "ProtoDataStoreConfig{blockingSafeReads=false, name=" + this.a + ", nameSuffix=Optional.absent(), schema=" + this.b.toString() + ", storage=" + this.c.toString() + ", migrations=" + String.valueOf(this.d) + ", handler=" + String.valueOf(this.e) + ", logger=Optional.absent(), ioExecutor=" + String.valueOf(this.g) + ", lamsConfig=null}";
    }

    @Override // defpackage.ehvs
    public final void i() {
    }

    @Override // defpackage.ehvs
    public final void j() {
    }
}
