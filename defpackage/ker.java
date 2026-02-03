package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ker implements kdm {
    private final int a;
    private final int b;

    public ker(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.kdm
    public final void a(kdq kdqVar) {
        if (kdqVar.k()) {
            kdqVar.f();
        }
        int i = fddu.i(this.a, 0, kdqVar.c());
        int i2 = fddu.i(this.b, 0, kdqVar.c());
        if (i != i2) {
            if (i < i2) {
                kdqVar.i(i, i2);
            } else {
                kdqVar.i(i2, i);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ker)) {
            return false;
        }
        ker kerVar = (ker) obj;
        return this.a == kerVar.a && this.b == kerVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingRegionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
