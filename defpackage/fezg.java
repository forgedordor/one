package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezg {
    public fezb a;
    public int b;
    public String c;
    public feyk d;
    public feyl e;
    public fezk f;
    public fezh g;
    public fezh h;
    public fezh i;
    public long j;
    public long k;
    public ffae l;
    private feyz m;

    public fezg() {
        this.b = -1;
        this.e = new feyl();
    }

    public static final void b(String str, fezh fezhVar) {
        if (fezhVar != null) {
            if (fezhVar.g != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            }
            if (fezhVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            if (fezhVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            if (fezhVar.j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }
    }

    public final fezh a() {
        int i = this.b;
        if (i < 0) {
            throw new IllegalStateException(a.g(i, "code < 0: "));
        }
        fezb fezbVar = this.a;
        if (fezbVar == null) {
            throw new IllegalStateException("request == null");
        }
        feyz feyzVar = this.m;
        if (feyzVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.c;
        if (str != null) {
            return new fezh(fezbVar, feyzVar, str, i, this.d, this.e.b(), this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(feyn feynVar) {
        this.e = feynVar.e();
    }

    public final void d(feyz feyzVar) {
        feyzVar.getClass();
        this.m = feyzVar;
    }

    public fezg(fezh fezhVar) {
        this.b = -1;
        this.a = fezhVar.a;
        this.m = fezhVar.b;
        this.b = fezhVar.d;
        this.c = fezhVar.c;
        this.d = fezhVar.e;
        this.e = fezhVar.f.e();
        this.f = fezhVar.g;
        this.g = fezhVar.h;
        this.h = fezhVar.i;
        this.i = fezhVar.j;
        this.j = fezhVar.k;
        this.k = fezhVar.l;
        this.l = fezhVar.m;
    }
}
