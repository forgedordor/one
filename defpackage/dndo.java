package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndo extends dndq {
    private final int a;
    private final int b;

    public dndo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dndq
    public final void a(vo voVar) {
        voVar.t(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dndo)) {
            return false;
        }
        dndo dndoVar = (dndo) obj;
        return this.a == dndoVar.a && this.b == dndoVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Moved(from=" + this.a + ", to=" + this.b + ")";
    }
}
