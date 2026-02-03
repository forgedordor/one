package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjz implements fgma {
    private static final fgmo a;
    private static final fgmo b;
    private static final fgmo c;
    private static final fgmo d;

    static {
        fgmn fgmnVarA = fgmo.a();
        fgmnVarA.b('0', '9');
        fgmnVarA.b('A', 'F');
        fgmnVarA.b('a', 'f');
        a = new fgmo(fgmnVarA);
        fgmn fgmnVarA2 = fgmo.a();
        fgmnVarA2.b('0', '9');
        b = new fgmo(fgmnVarA2);
        fgmn fgmnVarA3 = fgmo.a();
        fgmnVarA3.b('A', 'Z');
        fgmnVarA3.b('a', 'z');
        fgmo fgmoVar = new fgmo(fgmnVarA3);
        c = fgmoVar;
        fgmn fgmnVarB = fgmoVar.b();
        fgmnVarB.b('0', '9');
        d = new fgmo(fgmnVarB);
    }

    private static final fgkd b(fgme fgmeVar, fgmd fgmdVar) {
        return new fgkd(new fglo(fgkg.a(fgmeVar.e(fgmdVar, fgmeVar.f()).a())), fgmeVar.f());
    }

    @Override // defpackage.fgma
    public final fgkd a(fgmc fgmcVar) {
        fgme fgmeVar = ((fgje) fgmcVar).a;
        fgmd fgmdVarF = fgmeVar.f();
        fgmeVar.h();
        char cA = fgmeVar.a();
        if (cA != '#') {
            if (!c.c(cA)) {
                return null;
            }
            fgmeVar.m(d);
            if (fgmeVar.k(';')) {
                return b(fgmeVar, fgmdVarF);
            }
            return null;
        }
        fgmeVar.h();
        if (fgmeVar.k('x') || fgmeVar.k('X')) {
            int iM = fgmeVar.m(a);
            if (iM <= 0 || iM > 6 || !fgmeVar.k(';')) {
                return null;
            }
            return b(fgmeVar, fgmdVarF);
        }
        int iM2 = fgmeVar.m(b);
        if (iM2 <= 0 || iM2 > 7 || !fgmeVar.k(';')) {
            return null;
        }
        return b(fgmeVar, fgmdVarF);
    }
}
