package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjv implements fgma {
    @Override // defpackage.fgma
    public final fgkd a(fgmc fgmcVar) {
        fgme fgmeVar = ((fgje) fgmcVar).a;
        fgmd fgmdVarF = fgmeVar.f();
        int iC = fgmeVar.c('`');
        fgmd fgmdVarF2 = fgmeVar.f();
        while (fgmeVar.b('`') > 0) {
            fgmd fgmdVarF3 = fgmeVar.f();
            if (fgmeVar.c('`') == iC) {
                fgkn fgknVar = new fgkn();
                String strReplace = fgmeVar.e(fgmdVarF2, fgmdVarF3).a().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                    int length = strReplace.length();
                    if (fgmp.b(' ', strReplace, 0, length) != length) {
                        strReplace = strReplace.substring(1, strReplace.length() - 1);
                    }
                }
                fgknVar.a = strReplace;
                return new fgkd(fgknVar, fgmeVar.f());
            }
        }
        return new fgkd(new fglo(fgmeVar.e(fgmdVarF, fgmdVarF2).a()), fgmdVarF2);
    }
}
