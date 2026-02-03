package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgob extends fgoz {
    private final fgnt b;

    public fgob(fgnt fgntVar, fgna fgnaVar) {
        super(fgmu.m, fgnaVar);
        this.b = fgntVar;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        return this.b.O(j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int b(Locale locale) {
        return fgod.a(locale).k;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return 7;
    }

    @Override // defpackage.fgoz, defpackage.fgms
    public final int d() {
        return 1;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String k(int i, Locale locale) {
        return fgod.a(locale).c[i];
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String m(int i, Locale locale) {
        return fgod.a(locale).b[i];
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return this.b.d;
    }

    @Override // defpackage.fgoo
    protected final int y(String str, Locale locale) {
        Integer num = (Integer) fgod.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new fgnd(fgmu.m, str);
    }
}
