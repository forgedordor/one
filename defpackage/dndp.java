package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndp extends dndq {
    public final int a;
    public final int b;

    public dndp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dndq
    public final void a(vo voVar) {
        voVar.x(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dndp)) {
            return false;
        }
        dndp dndpVar = (dndp) obj;
        return this.a == dndpVar.a && this.b == dndpVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Removed(position=" + this.a + ", count=" + this.b + ")";
    }
}
