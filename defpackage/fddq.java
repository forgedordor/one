package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fddq extends fddo implements fddn {
    public static final fddq d = new fddq(1, 0);

    public fddq(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.fddo, defpackage.fddn
    public final boolean a() {
        return this.a > this.b;
    }

    @Override // defpackage.fddn
    public final /* bridge */ /* synthetic */ Comparable b() {
        throw null;
    }

    @Override // defpackage.fddn
    public final /* bridge */ /* synthetic */ Comparable c() {
        throw null;
    }

    public final Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.fddo
    public final boolean equals(Object obj) {
        if (obj instanceof fddq) {
            if (a() && ((fddq) obj).a()) {
                return true;
            }
            fddq fddqVar = (fddq) obj;
            return this.a == fddqVar.a && this.b == fddqVar.b;
        }
        return false;
    }

    public final Integer f() {
        return Integer.valueOf(this.a);
    }

    public final boolean g(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.fddo
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.fddo
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
