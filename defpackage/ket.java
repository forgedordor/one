package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ket implements kdm {
    private final int a;
    private final int b;

    public ket(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.kdm
    public final void a(kdq kdqVar) {
        int i = fddu.i(this.a, 0, kdqVar.c());
        int i2 = fddu.i(this.b, 0, kdqVar.c());
        if (i < i2) {
            kdqVar.j(i, i2);
        } else {
            kdqVar.j(i2, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ket)) {
            return false;
        }
        ket ketVar = (ket) obj;
        return this.a == ketVar.a && this.b == ketVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SetSelectionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
