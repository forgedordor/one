package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kes implements kdm {
    public final int a;
    private final juo b;

    public kes(String str, int i) {
        this.b = new juo(str);
        this.a = i;
    }

    @Override // defpackage.kdm
    public final void a(kdq kdqVar) {
        if (kdqVar.k()) {
            int i = kdqVar.c;
            kdqVar.h(i, kdqVar.d, b());
            if (b().length() > 0) {
                kdqVar.i(i, b().length() + i);
            }
        } else {
            int i2 = kdqVar.a;
            kdqVar.h(i2, kdqVar.b, b());
            if (b().length() > 0) {
                kdqVar.i(i2, b().length() + i2);
            }
        }
        int iB = kdqVar.b();
        int i3 = this.a;
        int i4 = iB + i3;
        int i5 = fddu.i(i3 > 0 ? i4 - 1 : i4 - b().length(), 0, kdqVar.c());
        kdqVar.j(i5, i5);
    }

    public final String b() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kes)) {
            return false;
        }
        kes kesVar = (kes) obj;
        return fdbq.f(b(), kesVar.b()) && this.a == kesVar.a;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ')';
    }
}
