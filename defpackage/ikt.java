package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikt extends iiy {
    public final long a;

    public ikt(long j) {
        this.a = j;
    }

    @Override // defpackage.iiy
    public final void a(long j, ikb ikbVar, float f) {
        long jF;
        ikbVar.i(1.0f);
        if (f == 1.0f) {
            jF = this.a;
        } else {
            long j2 = this.a;
            jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), ije.a(j2) * f, ije.f(j2));
        }
        ikbVar.k(jF);
        if (((iii) ikbVar).c != null) {
            ikbVar.n(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikt)) {
            return false;
        }
        long j = this.a;
        long j2 = ((ikt) obj).a;
        long j3 = ije.a;
        return fcts.a(j, j2);
    }

    public final int hashCode() {
        long j = ije.a;
        return fctr.a(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) ije.g(this.a)) + ')';
    }
}
