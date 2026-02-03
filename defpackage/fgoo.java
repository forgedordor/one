package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgoo extends fgms {
    public final fgmu g;

    protected fgoo(fgmu fgmuVar) {
        if (fgmuVar == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.g = fgmuVar;
    }

    @Override // defpackage.fgms
    public abstract int a(long j);

    @Override // defpackage.fgms
    public int b(Locale locale) {
        int iC = c();
        if (iC >= 0) {
            if (iC < 10) {
                return 1;
            }
            if (iC < 100) {
                return 2;
            }
            if (iC < 1000) {
                return 3;
            }
        }
        return Integer.toString(iC).length();
    }

    @Override // defpackage.fgms
    public abstract int c();

    @Override // defpackage.fgms
    public long e(long j, int i) {
        return q().a(j, i);
    }

    @Override // defpackage.fgms
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.fgms
    public abstract long g(long j);

    @Override // defpackage.fgms
    public abstract long h(long j, int i);

    @Override // defpackage.fgms
    public long i(long j, String str, Locale locale) {
        return h(j, y(str, locale));
    }

    @Override // defpackage.fgms
    public String k(int i, Locale locale) {
        return m(i, locale);
    }

    @Override // defpackage.fgms
    public String l(long j, Locale locale) {
        return k(a(j), locale);
    }

    @Override // defpackage.fgms
    public String m(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.fgms
    public String n(long j, Locale locale) {
        return m(a(j), locale);
    }

    @Override // defpackage.fgms
    public final String o() {
        return this.g.y;
    }

    @Override // defpackage.fgms
    public final fgmu p() {
        return this.g;
    }

    @Override // defpackage.fgms
    public abstract fgna q();

    @Override // defpackage.fgms
    public fgna r() {
        return null;
    }

    @Override // defpackage.fgms
    public boolean t(long j) {
        return false;
    }

    public final String toString() {
        return "DateTimeField[" + o() + "]";
    }

    @Override // defpackage.fgms
    public final boolean u() {
        return true;
    }

    public int w(long j) {
        return c();
    }

    protected int y(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new fgnd(this.g, str);
        }
    }
}
