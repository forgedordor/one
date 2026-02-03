package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejcp {
    public final eony a;
    public final fduf b;
    public final fduf c;
    public final fduf d;
    public final fduf e;
    public final fdvc f;
    public final fdvc g;
    public final fdvc h;
    public final fdvc i;
    public Instant j;

    public ejcp(eony eonyVar) {
        this.a = eonyVar;
        fduf fdufVarA = fdvf.a(false);
        this.b = fdufVarA;
        fduf fdufVarA2 = fdvf.a(0L);
        this.c = fdufVarA2;
        fduf fdufVarA3 = fdvf.a(0L);
        this.d = fdufVarA3;
        fduf fdufVarA4 = fdvf.a(false);
        this.e = fdufVarA4;
        this.f = new fduh(fdufVarA);
        this.g = new fduh(fdufVarA2);
        this.h = new fduh(fdufVarA3);
        this.i = new fduh(fdufVarA4);
        Instant instant = Instant.MIN;
        instant.getClass();
        this.j = instant;
    }

    public final void a() {
        Instant instantA = this.a.a();
        instantA.getClass();
        this.j = instantA;
    }

    public final void b() {
        this.b.g(true, false);
        this.d.f(0L);
        this.e.g(true, false);
        Instant instant = Instant.MIN;
        instant.getClass();
        this.j = instant;
    }

    public final boolean c() {
        return Duration.between(this.j, this.a.a()).toSeconds() > 5;
    }
}
