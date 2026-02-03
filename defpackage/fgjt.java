package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjt implements fgma {
    private static final Pattern a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // defpackage.fgma
    public final fgkd a(fgmc fgmcVar) {
        fgme fgmeVar = ((fgje) fgmcVar).a;
        fgmeVar.h();
        char cA = fgmeVar.a();
        if (cA == '\n') {
            fgmeVar.h();
            return new fgkd(new fgku(), fgmeVar.f());
        }
        if (!a.matcher(String.valueOf(cA)).matches()) {
            return new fgkd(new fglo("\\"), fgmeVar.f());
        }
        fgmeVar.h();
        return new fgkd(new fglo(String.valueOf(cA)), fgmeVar.f());
    }
}
