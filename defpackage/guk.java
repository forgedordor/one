package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guk {
    public final fdis a;
    public final gul b;

    public guk(gul gulVar, fdis fdisVar) {
        this.b = gulVar;
        this.a = fdisVar;
    }

    public final void a() {
        fdis fdisVar = this.a;
        if (fdisVar.i()) {
            fdisVar.w(gvc.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        guk gukVar = (guk) obj;
        return fdbq.f(this.b, gukVar.b) && fdbq.f(this.a, gukVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
