package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kde implements kdm {
    public final int a;
    private final juo b;

    public kde(juo juoVar, int i) {
        this.b = juoVar;
        this.a = i;
    }

    @Override // defpackage.kdm
    public final void a(kdq kdqVar) {
        if (kdqVar.k()) {
            kdqVar.h(kdqVar.c, kdqVar.d, b());
        } else {
            kdqVar.h(kdqVar.a, kdqVar.b, b());
        }
        int iB = kdqVar.b();
        int i = this.a;
        int i2 = iB + i;
        int i3 = fddu.i(i > 0 ? i2 - 1 : i2 - b().length(), 0, kdqVar.c());
        kdqVar.j(i3, i3);
    }

    public final String b() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kde)) {
            return false;
        }
        kde kdeVar = (kde) obj;
        return fdbq.f(b(), kdeVar.b()) && this.a == kdeVar.a;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ')';
    }

    public kde(String str, int i) {
        this(new juo(str), i);
    }
}
