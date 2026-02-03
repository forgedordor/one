package defpackage;

import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnwp implements dolv, dong {
    private String a;
    private String b;
    private String c;
    private boolean d;
    private dohm e;
    private Map f;
    private String g;
    private int h;
    private int i;
    private long j;
    private Instant k;
    private dltc l;
    private short m;

    @Override // defpackage.dlvw
    public final dltc a() {
        throw null;
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void c(Instant instant) {
        this.k = instant;
        this.m = (short) (this.m | 1024);
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void d(String str) {
        this.g = str;
        this.m = (short) (this.m | 64);
    }

    @Override // defpackage.dlty
    public final /* bridge */ /* synthetic */ void e(doig doigVar) {
        w(doigVar);
    }

    @Override // defpackage.dlvw
    public final /* bridge */ /* synthetic */ void g(dltc dltcVar) {
        this.l = dltcVar;
        this.m = (short) (this.m | 2048);
    }

    @Override // defpackage.dlwe
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final dnvg b() {
        int i = ~this.m;
        if ((i & 3) == 0) {
            return new dnvg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i & 4092);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" id");
        }
        if ((this.m & 2) == 0) {
            sb.append(" url");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void j(dogj dogjVar) {
        this.e = (dohm) dogjVar;
        this.m = (short) (this.m | 16);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void k(Map map) {
        this.f = map;
        this.m = (short) (this.m | 32);
    }

    @Override // defpackage.dong
    public final /* bridge */ /* synthetic */ void l(int i) {
        this.i = i;
        this.m = (short) (this.m | 256);
    }

    public final void m(String str) {
        this.a = str;
        this.m = (short) (this.m | 1);
    }

    public final void n(String str) {
        this.c = str;
        this.m = (short) (this.m | 4);
    }

    @Override // defpackage.dond
    public final /* bridge */ /* synthetic */ void o(doin doinVar) {
        x(doinVar);
    }

    public final void p(boolean z) {
        this.d = z;
        this.m = (short) (this.m | 8);
    }

    @Override // defpackage.dond
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void r(long j) {
        this.j = j;
        this.m = (short) (this.m | 512);
    }

    @Override // defpackage.dond
    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void u(String str) {
        this.b = str;
        this.m = (short) (this.m | 2);
    }

    @Override // defpackage.dong
    public final /* bridge */ /* synthetic */ void v(int i) {
        this.h = i;
        this.m = (short) (this.m | 128);
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
