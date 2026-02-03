package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigp {
    public final eiha a;
    public final fcsu b;
    public final eiez c;
    public final int d = 2;

    public eigp(eiha eihaVar, final fcsu fcsuVar, Set set) {
        this.a = eihaVar;
        this.c = eiez.d(set);
        this.b = new fcsu() { // from class: eify
            @Override // defpackage.fcsu
            public final Object b() {
                return eiez.e(eiez.d((Set) fcsuVar.b()), this.a.c);
            }
        };
    }

    public final eieh a(String str) {
        return c(str, "", "", 0);
    }

    public final eieh b(String str, String str2, int i, Class cls, String str3) {
        return c(cls.getSimpleName() + ": " + str3, str, str2, i);
    }

    public final eieh c(String str, String str2, String str3, int i) {
        return this.a.b(str, (eiez) this.b.b(), this.d, str2, str3);
    }

    public final eieh d(String str, String str2, int i, String str3) {
        return f(str, str2, i, str3, eiey.a);
    }

    public final eieh e(String str, String str2, int i, long j, long j2) {
        return this.a.c((eiez) this.b.b(), j, j2, this.d, str, str2);
    }

    public final eieh f(String str, String str2, int i, String str3, eiez eiezVar) {
        return this.a.b(str3, eiez.e((eiez) this.b.b(), eiezVar), this.d, str, str2);
    }

    public final eifp g(String str, String str2, int i, String str3) {
        return !eidc.v() ? h(str, str2, i, str3, eiey.a) : new eifp() { // from class: eifv
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        };
    }

    public final eifm h(String str, String str2, int i, String str3, eiez eiezVar) {
        return this.a.d(str3, eiez.e((eiez) this.b.b(), eiezVar), this.d, str, str2);
    }
}
