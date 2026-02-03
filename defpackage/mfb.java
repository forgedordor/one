package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfb {
    public final Object a;
    public maq b = new maq();
    public boolean c;
    public boolean d;

    public mfb(Object obj) {
        this.a = obj;
    }

    public final void a(mfa mfaVar) {
        this.d = true;
        if (this.c) {
            this.c = false;
            mfaVar.a(this.a, this.b.a());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mfb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
