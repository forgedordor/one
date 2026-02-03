package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxh implements vwv {
    public final long a;
    public final Duration b;
    public final vxg c;
    private final int d;
    private final boolean e;
    private final vzz f;
    private final vzx g;
    private final arwb h;
    private final waa i;
    private final fctc j;
    private final ajna k;
    private final ajna l;

    public vxh(long j, Duration duration, int i, boolean z, vzz vzzVar, vzx vzxVar, vxg vxgVar, arwb arwbVar) {
        duration.getClass();
        vzzVar.getClass();
        vzxVar.getClass();
        vxgVar.getClass();
        this.a = j;
        this.b = duration;
        this.d = i;
        this.e = z;
        this.f = vzzVar;
        this.g = vzxVar;
        this.c = vxgVar;
        this.h = arwbVar;
        this.i = vxgVar.c();
        this.j = fctd.a(new fdae() { // from class: vww
            @Override // defpackage.fdae
            public final Object invoke() {
                vxh vxhVar = this.a;
                vxg vxgVar2 = vxhVar.c;
                return new wlk(vxgVar2 instanceof vxa, vxhVar.a, vxgVar2.h(), vxgVar2.g(), vxgVar2.a(), vxhVar.b);
            }
        });
        this.k = vxgVar.d();
        this.l = vxgVar.e();
    }

    @Override // defpackage.vwv
    public final ajna a() {
        return this.k;
    }

    @Override // defpackage.vwv
    public final ajna b() {
        return this.l;
    }

    @Override // defpackage.vwv
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.wab
    public final int d() {
        return this.d;
    }

    @Override // defpackage.wab
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxh)) {
            return false;
        }
        vxh vxhVar = (vxh) obj;
        return this.a == vxhVar.a && fdbq.f(this.b, vxhVar.b) && this.d == vxhVar.d && this.e == vxhVar.e && fdbq.f(this.f, vxhVar.f) && fdbq.f(this.g, vxhVar.g) && fdbq.f(this.c, vxhVar.c) && fdbq.f(this.h, vxhVar.h);
    }

    @Override // defpackage.wab
    public final vzx f() {
        return this.g;
    }

    @Override // defpackage.wab
    public final vzz g() {
        return this.f;
    }

    @Override // defpackage.wab
    public final waa h() {
        return this.i;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.d) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f.hashCode()) * 31) + this.g.a) * 31) + this.c.hashCode()) * 31) + this.h.hashCode();
    }

    @Override // defpackage.wab
    public final wlk i() {
        return (wlk) this.j.a();
    }

    @Override // defpackage.wab
    public final String j() {
        return this.c.f();
    }

    @Override // defpackage.wab
    public final boolean k() {
        return this.c instanceof vxa;
    }

    @Override // defpackage.wab
    public final boolean l() {
        return this.c instanceof vxa;
    }

    @Override // defpackage.wab
    public final boolean m() {
        vxg vxgVar = this.c;
        return (vxgVar instanceof vxa) && ((vxa) vxgVar).c;
    }

    @Override // defpackage.wab
    public final boolean n() {
        vxg vxgVar = this.c;
        return (vxgVar instanceof vxa) && ((vxa) vxgVar).a.h;
    }

    @Override // defpackage.wab
    public final boolean o() {
        return this.c instanceof vxa;
    }

    @Override // defpackage.wab
    public final boolean p() {
        vxg vxgVar = this.c;
        return (vxgVar instanceof vxa) && ((vxa) vxgVar).e;
    }

    @Override // defpackage.wab
    public final boolean q() {
        return this.c instanceof vxa;
    }

    @Override // defpackage.wab
    public final boolean r() {
        return this.c instanceof vxa;
    }

    @Override // defpackage.wab
    public final boolean s() {
        vxg vxgVar = this.c;
        return (vxgVar instanceof vxa) && ((vxa) vxgVar).b == ajlj.GROUP;
    }

    @Override // defpackage.wab
    public final boolean t() {
        return this.c instanceof vxa;
    }

    public final String toString() {
        return "MapiTransportCapabilityDataImpl(maxMessageSizeBytes=" + this.a + ", maxVideoDuration=" + this.b + ", textLengthLimit=" + this.d + ", hasActiveSelfIdentity=" + this.e + ", sendIcon=" + this.f + ", directSendIcon=" + this.g + ", transportCapability=" + this.c + ", enableRcsEditFallbackSending=" + this.h + ")";
    }

    @Override // defpackage.wab
    public final boolean u() {
        vxg vxgVar = this.c;
        return (vxgVar instanceof vxa) && ((vxa) vxgVar).d;
    }

    @Override // defpackage.wab
    public final boolean v() {
        return this.c instanceof vxa;
    }

    @Override // defpackage.wab
    public final boolean w() {
        return this.c instanceof vxa;
    }

    @Override // defpackage.wab
    public final boolean x() {
        vxg vxgVar = this.c;
        if (vxgVar instanceof vxc) {
            return false;
        }
        if (!(vxgVar instanceof vxa)) {
            return true;
        }
        int iOrdinal = ((vxa) vxgVar).b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return true;
            }
            if (iOrdinal != 4) {
                throw new fctg();
            }
        }
        return false;
    }

    @Override // defpackage.wab
    public final boolean y() {
        return this.c instanceof vxf;
    }

    @Override // defpackage.wab
    public final boolean z() {
        return this.c instanceof vxa;
    }
}
