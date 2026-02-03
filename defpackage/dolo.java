package defpackage;

import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dolo implements dolv, dong {
    private dohm a;
    private String b;
    private Map c;
    private String d;
    private int e;
    private int f;
    private long g;
    private Instant h;
    private dltc i;
    private short j;

    @Override // defpackage.dlvw
    public final dltc a() {
        throw null;
    }

    @Override // defpackage.dlwe
    public final /* bridge */ /* synthetic */ dltd b() {
        int i = ~this.j;
        if ((i & 499) == 0) {
            return new dojr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, i & 12);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" format");
        }
        if ((this.j & 2) == 0) {
            sb.append(" url");
        }
        if ((this.j & 16) == 0) {
            sb.append(" widthPx");
        }
        if ((this.j & 32) == 0) {
            sb.append(" heightPx");
        }
        if ((this.j & 64) == 0) {
            sb.append(" sizeBytes");
        }
        if ((this.j & 128) == 0) {
            sb.append(" dateModified");
        }
        if ((this.j & 256) == 0) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.h = instant;
        this.j = (short) (this.j | 128);
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
        this.i = dltcVar;
        this.j = (short) (this.j | 256);
    }

    @Override // defpackage.dond
    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void r(long j) {
        this.g = j;
        this.j = (short) (this.j | 64);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void j(dogj dogjVar) {
        this.a = (dohm) dogjVar;
        this.j = (short) (this.j | 1);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void k(Map map) {
        this.c = map;
        this.j = (short) (this.j | 4);
    }

    @Override // defpackage.dong
    public final /* bridge */ /* synthetic */ void l(int i) {
        this.f = i;
        this.j = (short) (this.j | 32);
    }

    @Override // defpackage.dond
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void u(String str) {
        this.b = str;
        this.j = (short) (this.j | 2);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void o(doin doinVar) {
        x(doinVar);
    }

    @Override // defpackage.dong
    public final /* bridge */ /* synthetic */ void v(int i) {
        this.e = i;
        this.j = (short) (this.j | 16);
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
