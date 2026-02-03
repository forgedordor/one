package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpd extends fgms implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final fgmu b;
    private final fgna c;

    private fgpd(fgmu fgmuVar, fgna fgnaVar) {
        if (fgnaVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = fgmuVar;
        this.c = fgnaVar;
    }

    private Object readResolve() {
        return w(this.b, this.c);
    }

    public static synchronized fgpd w(fgmu fgmuVar, fgna fgnaVar) {
        HashMap map = a;
        fgpd fgpdVar = null;
        if (map == null) {
            a = new HashMap(7);
        } else {
            fgpd fgpdVar2 = (fgpd) map.get(fgmuVar);
            if (fgpdVar2 == null || fgpdVar2.c == fgnaVar) {
                fgpdVar = fgpdVar2;
            }
        }
        if (fgpdVar != null) {
            return fgpdVar;
        }
        fgpd fgpdVar3 = new fgpd(fgmuVar, fgnaVar);
        a.put(fgmuVar, fgpdVar3);
        return fgpdVar3;
    }

    private final UnsupportedOperationException x() {
        return new UnsupportedOperationException(this.b.y.concat(" field is unsupported"));
    }

    @Override // defpackage.fgms
    public final int a(long j) {
        throw x();
    }

    @Override // defpackage.fgms
    public final int b(Locale locale) {
        throw x();
    }

    @Override // defpackage.fgms
    public final int c() {
        throw x();
    }

    @Override // defpackage.fgms
    public final int d() {
        throw x();
    }

    @Override // defpackage.fgms
    public final long e(long j, int i) {
        return this.c.a(j, i);
    }

    @Override // defpackage.fgms
    public final long f(long j) {
        throw x();
    }

    @Override // defpackage.fgms
    public final long g(long j) {
        throw x();
    }

    @Override // defpackage.fgms
    public final long h(long j, int i) {
        throw x();
    }

    @Override // defpackage.fgms
    public final long i(long j, String str, Locale locale) {
        throw x();
    }

    @Override // defpackage.fgms
    public final String k(int i, Locale locale) {
        throw x();
    }

    @Override // defpackage.fgms
    public final String l(long j, Locale locale) {
        throw x();
    }

    @Override // defpackage.fgms
    public final String m(int i, Locale locale) {
        throw x();
    }

    @Override // defpackage.fgms
    public final String n(long j, Locale locale) {
        throw x();
    }

    @Override // defpackage.fgms
    public final String o() {
        return this.b.y;
    }

    @Override // defpackage.fgms
    public final fgmu p() {
        return this.b;
    }

    @Override // defpackage.fgms
    public final fgna q() {
        return this.c;
    }

    @Override // defpackage.fgms
    public final fgna r() {
        return null;
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return null;
    }

    @Override // defpackage.fgms
    public final boolean t(long j) {
        throw x();
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.fgms
    public final boolean u() {
        return false;
    }

    @Override // defpackage.fgms
    public final void v() {
    }
}
