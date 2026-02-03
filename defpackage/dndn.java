package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndn extends dndq {
    private final int a;
    private final int b;

    public dndn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dndq
    public final void a(vo voVar) {
        voVar.w(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dndn)) {
            return false;
        }
        dndn dndnVar = (dndn) obj;
        return this.a == dndnVar.a && this.b == dndnVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Inserted(position=" + this.a + ", count=" + this.b + ")";
    }
}
