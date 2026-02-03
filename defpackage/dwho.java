package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwho extends dwhq {
    private final int a;
    private final ejwi b;
    private final ejwi c;
    private final ejwi d;
    private final ejwi e;
    private final ejwi f;
    private final ejwi g;
    private final ejwi h;
    private final ejwi i;
    private final ejwi j;
    private final ejwi k;
    private final ekgb l;
    private final ejwi m;
    private final ejwi n;
    private final ejwi o;
    private final ejwi p;
    private final ejwi q;

    public dwho(int i, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, ejwi ejwiVar5, ejwi ejwiVar6, ejwi ejwiVar7, ejwi ejwiVar8, ejwi ejwiVar9, ejwi ejwiVar10, ekgb ekgbVar, ejwi ejwiVar11, ejwi ejwiVar12, ejwi ejwiVar13, ejwi ejwiVar14, ejwi ejwiVar15) {
        this.a = i;
        this.b = ejwiVar;
        this.c = ejwiVar2;
        this.d = ejwiVar3;
        this.e = ejwiVar4;
        this.f = ejwiVar5;
        this.g = ejwiVar6;
        this.h = ejwiVar7;
        this.i = ejwiVar8;
        this.j = ejwiVar9;
        this.k = ejwiVar10;
        this.l = ekgbVar;
        this.m = ejwiVar11;
        this.n = ejwiVar12;
        this.o = ejwiVar13;
        this.p = ejwiVar14;
        this.q = ejwiVar15;
    }

    @Override // defpackage.dwhq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dwhq
    public final ejwi b() {
        return this.q;
    }

    @Override // defpackage.dwhq
    public final ejwi c() {
        return this.e;
    }

    @Override // defpackage.dwhq
    public final ejwi d() {
        return this.f;
    }

    @Override // defpackage.dwhq
    public final ejwi e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwhq) {
            dwhq dwhqVar = (dwhq) obj;
            if (this.a == dwhqVar.a() && this.b.equals(dwhqVar.l()) && this.c.equals(dwhqVar.m()) && this.d.equals(dwhqVar.n()) && this.e.equals(dwhqVar.c()) && this.f.equals(dwhqVar.d()) && this.g.equals(dwhqVar.h()) && this.h.equals(dwhqVar.f()) && this.i.equals(dwhqVar.k()) && this.j.equals(dwhqVar.j()) && this.k.equals(dwhqVar.o()) && ekjz.h(this.l, dwhqVar.q()) && this.m.equals(dwhqVar.p()) && this.n.equals(dwhqVar.i()) && this.o.equals(dwhqVar.e()) && this.p.equals(dwhqVar.g()) && this.q.equals(dwhqVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwhq
    public final ejwi f() {
        return this.h;
    }

    @Override // defpackage.dwhq
    public final ejwi g() {
        return this.p;
    }

    @Override // defpackage.dwhq
    public final ejwi h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.dwhq
    public final ejwi i() {
        return this.n;
    }

    @Override // defpackage.dwhq
    public final ejwi j() {
        return this.j;
    }

    @Override // defpackage.dwhq
    public final ejwi k() {
        return this.i;
    }

    @Override // defpackage.dwhq
    public final ejwi l() {
        return this.b;
    }

    @Override // defpackage.dwhq
    public final ejwi m() {
        return this.c;
    }

    @Override // defpackage.dwhq
    public final ejwi n() {
        return this.d;
    }

    @Override // defpackage.dwhq
    public final ejwi o() {
        return this.k;
    }

    @Override // defpackage.dwhq
    public final ejwi p() {
        return this.m;
    }

    @Override // defpackage.dwhq
    public final ekgb q() {
        return this.l;
    }

    public final String toString() {
        return "LighterLogData{eventType=" + this.a + ", source=" + String.valueOf(this.b) + ", sourceRegistrationId=" + String.valueOf(this.c) + ", traceId=" + String.valueOf(this.d) + ", destContactId=" + String.valueOf(this.e) + ", destConversationId=" + String.valueOf(this.f) + ", lighterTransportEventType=" + String.valueOf(this.g) + ", eventDetail=" + String.valueOf(this.h) + ", rpcResponseCode=" + String.valueOf(this.i) + ", messageOrigin=" + String.valueOf(this.j) + ", unsupportedCapability=" + String.valueOf(this.k) + ", experimentIds=" + this.l.toString() + ", visualElementDetail=Optional.absent(), linkType=" + String.valueOf(this.n) + ", elapsedTimeUs=" + String.valueOf(this.o) + ", lighterMessageTypeDetail=" + String.valueOf(this.p) + ", bootstrapDetail=" + String.valueOf(this.q) + "}";
    }
}
