package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgnr extends fgoy {
    public fgnr() {
        super(fgmu.n, fgnt.s, fgnt.t);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int b(Locale locale) {
        return fgod.a(locale).m;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long i(long j, String str, Locale locale) {
        String[] strArr = fgod.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new fgnd(fgmu.n, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return h(j, length);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String m(int i, Locale locale) {
        return fgod.a(locale).f[i];
    }
}
