package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmry implements dmrz {
    public final int a;
    private final dpxd b;

    public dmry(int i, dpxd dpxdVar) {
        this.a = i;
        this.b = dpxdVar;
    }

    @Override // defpackage.dmrz
    public final dpxd a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmry)) {
            return false;
        }
        dmry dmryVar = (dmry) obj;
        return this.a == dmryVar.a && fdbq.f(this.b, dmryVar.b);
    }

    public final int hashCode() {
        dpxd dpxdVar = this.b;
        return (this.a * 31) + (dpxdVar == null ? 0 : dpxdVar.hashCode());
    }

    public final String toString() {
        return "ResourceIcon(resId=" + this.a + ", backgroundColor=" + this.b + ")";
    }
}
