package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fddl extends fddj implements fddn {
    static {
        new fddl((char) 1, (char) 0);
    }

    public fddl(char c, char c2) {
        super(c, c2);
    }

    @Override // defpackage.fddj, defpackage.fddn
    public final boolean a() {
        return fdbq.a(this.a, this.b) > 0;
    }

    @Override // defpackage.fddn
    public final /* bridge */ /* synthetic */ Comparable b() {
        throw null;
    }

    @Override // defpackage.fddn
    public final /* bridge */ /* synthetic */ Comparable c() {
        throw null;
    }

    @Override // defpackage.fddj
    public final boolean equals(Object obj) {
        if (obj instanceof fddl) {
            if (a() && ((fddl) obj).a()) {
                return true;
            }
            fddl fddlVar = (fddl) obj;
            return this.a == fddlVar.a && this.b == fddlVar.b;
        }
        return false;
    }

    @Override // defpackage.fddj
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.fddj
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
