package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgoe extends fgnx {
    public fgoe(fgnt fgntVar) {
        super(fgntVar);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int b(Locale locale) {
        return fgod.a(locale).l;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String k(int i, Locale locale) {
        return fgod.a(locale).e[i];
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String m(int i, Locale locale) {
        return fgod.a(locale).d[i];
    }

    @Override // defpackage.fgoo
    protected final int y(String str, Locale locale) {
        Integer num = (Integer) fgod.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new fgnd(fgmu.h, str);
    }
}
