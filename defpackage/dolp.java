package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dolp implements dolv, dong {
    private dojm a;
    private String b;
    private Map c;
    private String d;
    private int e;
    private int f;
    private long g;
    private Instant h;
    private dltc i;
    private Duration j;
    private short k;

    @Override // defpackage.dlvw
    public final dltc a() {
        throw null;
    }

    @Override // defpackage.dlwe
    public final /* bridge */ /* synthetic */ dltd b() {
        int i = ~this.k;
        if ((i & 1011) == 0) {
            return new doju(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, i & 12);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" format");
        }
        if ((this.k & 2) == 0) {
            sb.append(" url");
        }
        if ((this.k & 16) == 0) {
            sb.append(" widthPx");
        }
        if ((this.k & 32) == 0) {
            sb.append(" heightPx");
        }
        if ((this.k & 64) == 0) {
            sb.append(" sizeBytes");
        }
        if ((this.k & 128) == 0) {
            sb.append(" dateModified");
        }
        if ((this.k & 256) == 0) {
            sb.append(" source");
        }
        if ((this.k & 512) == 0) {
            sb.append(" duration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.h = instant;
        this.k = (short) (this.k | 128);
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.d = str;
        this.k = (short) (this.k | 8);
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void e(doig doigVar) {
        w(doigVar);
    }

    @Override // defpackage.dlvw
    public final /* bridge */ /* synthetic */ void g(dltc dltcVar) {
        this.i = dltcVar;
        this.k = (short) (this.k | 256);
    }

    public final void i(Duration duration) {
        this.j = duration;
        this.k = (short) (this.k | 512);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void j(dogj dogjVar) {
        this.a = (dojm) dogjVar;
        this.k = (short) (this.k | 1);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void k(Map map) {
        this.c = map;
        this.k = (short) (this.k | 4);
    }

    @Override // defpackage.dong
    public final /* bridge */ /* synthetic */ void l(int i) {
        this.f = i;
        this.k = (short) (this.k | 32);
    }

    @Override // defpackage.dond
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void r(long j) {
        this.g = j;
        this.k = (short) (this.k | 64);
    }

    @Override // defpackage.dond
    /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void u(String str) {
        this.b = str;
        this.k = (short) (this.k | 2);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void o(doin doinVar) {
        x(doinVar);
    }

    @Override // defpackage.dong
    public final /* bridge */ /* synthetic */ void v(int i) {
        this.e = i;
        this.k = (short) (this.k | 16);
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
