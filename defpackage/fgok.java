package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgok extends fgoo {
    final fgms a;
    final fgmz b;
    final fgna c;
    final boolean d;
    final fgna e;
    final fgna f;

    public fgok(fgms fgmsVar, fgmz fgmzVar, fgna fgnaVar, fgna fgnaVar2, fgna fgnaVar3) {
        super(fgmsVar.p());
        if (!fgmsVar.u()) {
            throw new IllegalArgumentException();
        }
        this.a = fgmsVar;
        this.b = fgmzVar;
        this.c = fgnaVar;
        this.d = fgom.O(fgnaVar);
        this.e = fgnaVar2;
        this.f = fgnaVar3;
    }

    private final int x(long j) {
        int iA = this.b.a(j);
        long j2 = iA;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return iA;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        return this.a.a(this.b.d(j));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int b(Locale locale) {
        return this.a.b(locale);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.fgms
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long e(long j, int i) {
        if (this.d) {
            long jX = x(j);
            return this.a.e(j + jX, i) - jX;
        }
        fgmz fgmzVar = this.b;
        return fgmzVar.m(this.a.e(fgmzVar.d(j), i), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgok) {
            fgok fgokVar = (fgok) obj;
            if (this.a.equals(fgokVar.a) && this.b.equals(fgokVar.b) && this.c.equals(fgokVar.c) && this.e.equals(fgokVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long f(long j) {
        return this.a.f(this.b.d(j));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        if (this.d) {
            long jX = x(j);
            return this.a.g(j + jX) - jX;
        }
        fgmz fgmzVar = this.b;
        return fgmzVar.m(this.a.g(fgmzVar.d(j)), j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgmz fgmzVar = this.b;
        fgms fgmsVar = this.a;
        long jH = fgmsVar.h(fgmzVar.d(j), i);
        long jM = fgmzVar.m(jH, j);
        if (a(jM) == i) {
            return jM;
        }
        fgne fgneVar = new fgne(jH, fgmzVar.c);
        fgnd fgndVar = new fgnd(fgmsVar.p(), Integer.valueOf(i), fgneVar.getMessage());
        fgndVar.initCause(fgneVar);
        throw fgndVar;
    }

    public final int hashCode() {
        fgmz fgmzVar = this.b;
        return fgmzVar.hashCode() ^ this.a.hashCode();
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long i(long j, String str, Locale locale) {
        fgms fgmsVar = this.a;
        fgmz fgmzVar = this.b;
        return fgmzVar.m(fgmsVar.i(fgmzVar.d(j), str, locale), j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String k(int i, Locale locale) {
        return this.a.k(i, locale);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String l(long j, Locale locale) {
        return this.a.l(this.b.d(j), locale);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String m(int i, Locale locale) {
        return this.a.m(i, locale);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final String n(long j, Locale locale) {
        return this.a.n(this.b.d(j), locale);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna q() {
        return this.c;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna r() {
        return this.f;
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return this.e;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final boolean t(long j) {
        return this.a.t(this.b.d(j));
    }

    @Override // defpackage.fgms
    public final void v() {
    }
}
