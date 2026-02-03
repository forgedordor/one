package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doln implements dolv {
    private dogg a;
    private String b;
    private Map c;
    private String d;
    private long e;
    private Instant f;
    private dltc g;
    private Duration h;
    private dqbw i;
    private short j;

    @Override // defpackage.dlvw
    public final dltc a() {
        throw null;
    }

    @Override // defpackage.dlwe
    public final /* bridge */ /* synthetic */ dltd b() {
        int i = ~this.j;
        if ((i & 243) == 0) {
            return new dojp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, i & 268);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" format");
        }
        if ((this.j & 2) == 0) {
            sb.append(" url");
        }
        if ((this.j & 16) == 0) {
            sb.append(" sizeBytes");
        }
        if ((this.j & 32) == 0) {
            sb.append(" dateModified");
        }
        if ((this.j & 64) == 0) {
            sb.append(" source");
        }
        if ((this.j & 128) == 0) {
            sb.append(" duration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.f = instant;
        this.j = (short) (this.j | 32);
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.d = str;
        this.j = (short) (this.j | 8);
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void e(doig doigVar) {
        w(doigVar);
    }

    @Override // defpackage.dlvw
    public final /* bridge */ /* synthetic */ void g(dltc dltcVar) {
        this.g = dltcVar;
        this.j = (short) (this.j | 64);
    }

    public final void i(Duration duration) {
        this.h = duration;
        this.j = (short) (this.j | 128);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void j(dogj dogjVar) {
        this.a = (dogg) dogjVar;
        this.j = (short) (this.j | 1);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void k(Map map) {
        this.c = map;
        this.j = (short) (this.j | 4);
    }

    @Override // defpackage.dond
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void r(long j) {
        this.e = j;
        this.j = (short) (this.j | 16);
    }

    @Override // defpackage.dond
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void u(String str) {
        this.b = str;
        this.j = (short) (this.j | 2);
    }

    public final void n(dqbw dqbwVar) {
        this.i = dqbwVar;
        this.j = (short) (this.j | 256);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void o(doin doinVar) {
        x(doinVar);
    }

    @Override // defpackage.dolv
    public final /* synthetic */ void w(doig doigVar) {
        dolu.c(this, doigVar);
    }

    @Override // defpackage.dolv
    public final /* synthetic */ void x(doin doinVar) {
        doinVar.getClass();
    }
}
