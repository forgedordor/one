package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzv {
    public static final Duration a;
    public static final long b;
    public final fduf c;
    public final fdvc d;
    private final fdjx e;
    private fdlr f;

    static {
        Duration durationG = eoob.g(1);
        a = durationG;
        b = fdhi.j(fdhk.g(durationG.getSeconds(), fdhl.d), fdhk.f(durationG.getNano(), fdhl.a));
    }

    public dpzv(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.e = fdjxVar;
        fduf fdufVarA = fdvf.a(Duration.ZERO);
        this.c = fdufVarA;
        this.d = new fduh(fdufVarA);
    }

    public final void a() {
        this.c.f(Duration.ZERO);
    }

    public final void b() {
        this.c.f(Duration.ZERO);
        this.f = fdil.d(this.e, null, null, new dpzu(this, null), 3);
    }

    public final void c() {
        fdlr fdlrVar = this.f;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.f = null;
    }
}
