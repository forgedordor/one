package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejyk {
    static final ejxr a = new ejxw(new ejyf());
    static final ejya b;
    ejzs g;
    ejzs h;
    ejvp k;
    ejvp l;
    ejya m;
    ejyj o;
    ejyi p;
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    long i = -1;
    long j = -1;
    final ejxr n = a;

    static {
        new ejyo();
        b = new ejyg();
    }

    private final void g() {
        if (this.o == null) {
            ejwl.m(this.f == -1, "maximumWeight requires weigher");
        } else if (this.c) {
            ejwl.m(this.f != -1, "weigher requires maximumWeight");
        } else if (this.f == -1) {
            ejyh.a.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    public final ejye a() {
        g();
        ejwl.m(true, "refreshAfterWrite requires a LoadingCache");
        return new ejzn(new ekak(this, null));
    }

    public final ejyq b(ejyn ejynVar) {
        g();
        return new ejzm(this, ejynVar);
    }

    final ejzs c() {
        return (ejzs) ejwg.c(this.g, ejzs.STRONG);
    }

    final ejzs d() {
        return (ejzs) ejwg.c(this.h, ejzs.STRONG);
    }

    public final void e(long j, TimeUnit timeUnit) {
        long j2 = this.i;
        ejwl.o(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        ejwl.u(j >= 0, j, timeUnit);
        this.i = timeUnit.toNanos(j);
    }

    public final void f(long j) {
        long j2 = this.e;
        ejwl.o(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f;
        ejwl.o(j3 == -1, "maximum weight was already set to %s", j3);
        ejwl.m(this.o == null, "maximum size can not be combined with weigher");
        ejwl.b(j >= 0, "maximum size must not be negative");
        this.e = j;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        int i = this.d;
        if (i != -1) {
            ejwfVarB.f("concurrencyLevel", i);
        }
        long j = this.e;
        if (j != -1) {
            ejwfVarB.g("maximumSize", j);
        }
        long j2 = this.f;
        if (j2 != -1) {
            ejwfVarB.g("maximumWeight", j2);
        }
        long j3 = this.i;
        if (j3 != -1) {
            ejwfVarB.b("expireAfterWrite", j3 + "ns");
        }
        long j4 = this.j;
        if (j4 != -1) {
            ejwfVarB.b("expireAfterAccess", j4 + "ns");
        }
        ejzs ejzsVar = this.g;
        if (ejzsVar != null) {
            ejwfVarB.b("keyStrength", ejuf.c(ejzsVar.toString()));
        }
        ejzs ejzsVar2 = this.h;
        if (ejzsVar2 != null) {
            ejwfVarB.b("valueStrength", ejuf.c(ejzsVar2.toString()));
        }
        if (this.k != null) {
            ejwfVarB.a("keyEquivalence");
        }
        if (this.l != null) {
            ejwfVarB.a("valueEquivalence");
        }
        if (this.p != null) {
            ejwfVarB.a("removalListener");
        }
        return ejwfVarB.toString();
    }
}
