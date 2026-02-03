package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjr implements fgma {
    private static final Pattern a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    private static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // defpackage.fgma
    public final fgkd a(fgmc fgmcVar) {
        fgme fgmeVar = ((fgje) fgmcVar).a;
        fgmeVar.h();
        fgmd fgmdVarF = fgmeVar.f();
        if (fgmeVar.b('>') > 0) {
            fglz fglzVarE = fgmeVar.e(fgmdVarF, fgmeVar.f());
            String strA = fglzVarE.a();
            fgmeVar.h();
            String strConcat = a.matcher(strA).matches() ? strA : b.matcher(strA).matches() ? "mailto:".concat(strA) : null;
            if (strConcat != null) {
                fgla fglaVar = new fgla(strConcat, null);
                fglo fgloVar = new fglo(strA);
                fgloVar.j(fglzVarE.b());
                fglaVar.h(fgloVar);
                return new fgkd(fglaVar, fgmeVar.f());
            }
        }
        return null;
    }
}
