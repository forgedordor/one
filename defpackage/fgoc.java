package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgoc extends fgoo {
    private final fgnt a;

    public fgoc(fgnt fgntVar) {
        super(fgmu.b);
        this.a = fgntVar;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        return this.a.Y(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int b(Locale locale) {
        return fgod.a(locale).j;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return 1;
    }

    @Override // defpackage.fgms
    public final int d() {
        return 0;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        if (a(j) == 1) {
            return this.a.ae(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgot.c(this, i, 0, 1);
        if (a(j) == i) {
            return j;
        }
        fgnt fgntVar = this.a;
        return fgntVar.ae(j, -fgntVar.Y(j));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long i(long j, String str, Locale locale) {
        Integer num = (Integer) fgod.a(locale).g.get(str);
        if (num != null) {
            return h(j, num.intValue());
        }
        throw new fgnd(fgmu.b, str);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String m(int i, Locale locale) {
        return fgod.a(locale).a[i];
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna q() {
        return fgpe.h(fgnc.a);
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return null;
    }

    @Override // defpackage.fgms
    public final void v() {
    }
}
