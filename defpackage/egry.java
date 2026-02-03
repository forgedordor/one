package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egry extends egsn {
    public final Class a;
    public final pzj b;
    public final ejwi c;
    public final egsl d;
    public final ejwi e;
    public final pzs f;
    public final ejwi g;
    public final ejwi h;
    public final ekhx i;
    public final ejwi j;
    public final ejwi k;
    public final ejwi l;

    public egry(Class cls, pzj pzjVar, ejwi ejwiVar, egsl egslVar, ejwi ejwiVar2, pzs pzsVar, ejwi ejwiVar3, ejwi ejwiVar4, ekhx ekhxVar, ejwi ejwiVar5, ejwi ejwiVar6, ejwi ejwiVar7) {
        this.a = cls;
        this.b = pzjVar;
        this.c = ejwiVar;
        this.d = egslVar;
        this.e = ejwiVar2;
        this.f = pzsVar;
        this.g = ejwiVar3;
        this.h = ejwiVar4;
        this.i = ekhxVar;
        this.j = ejwiVar5;
        this.k = ejwiVar6;
        this.l = ejwiVar7;
    }

    @Override // defpackage.egsn
    public final pzj a() {
        return this.b;
    }

    @Override // defpackage.egsn
    public final pzs b() {
        return this.f;
    }

    @Override // defpackage.egsn
    public final egsj c() {
        return new egrx(this);
    }

    @Override // defpackage.egsn
    public final egsl d() {
        return this.d;
    }

    @Override // defpackage.egsn
    public final ejwi e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egsn) {
            egsn egsnVar = (egsn) obj;
            if (this.a.equals(egsnVar.m()) && this.b.equals(egsnVar.a()) && this.c.equals(egsnVar.g()) && this.d.equals(egsnVar.d()) && this.e.equals(egsnVar.h()) && this.f.equals(egsnVar.b()) && this.g.equals(egsnVar.i()) && this.h.equals(egsnVar.k()) && this.i.equals(egsnVar.l()) && this.j.equals(egsnVar.f()) && this.k.equals(egsnVar.e()) && this.l.equals(egsnVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.egsn
    public final ejwi f() {
        return this.j;
    }

    @Override // defpackage.egsn
    public final ejwi g() {
        return this.c;
    }

    @Override // defpackage.egsn
    public final ejwi h() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // defpackage.egsn
    public final ejwi i() {
        return this.g;
    }

    @Override // defpackage.egsn
    public final ejwi j() {
        return this.l;
    }

    @Override // defpackage.egsn
    public final ejwi k() {
        return this.h;
    }

    @Override // defpackage.egsn
    public final ekhx l() {
        return this.i;
    }

    @Override // defpackage.egsn
    public final Class m() {
        return this.a;
    }

    public final String toString() {
        ejwi ejwiVar = this.l;
        ejwi ejwiVar2 = this.k;
        ejwi ejwiVar3 = this.j;
        ekhx ekhxVar = this.i;
        ejwi ejwiVar4 = this.h;
        ejwi ejwiVar5 = this.g;
        pzs pzsVar = this.f;
        ejwi ejwiVar6 = this.e;
        egsl egslVar = this.d;
        ejwi ejwiVar7 = this.c;
        pzj pzjVar = this.b;
        return "TikTokWorkSpec{workerClass=" + this.a.toString() + ", constraints=" + pzjVar.toString() + ", expedited=" + String.valueOf(ejwiVar7) + ", initialDelay=" + egslVar.toString() + ", nextScheduleTimeOverride=" + String.valueOf(ejwiVar6) + ", inputData=" + pzsVar.toString() + ", periodic=" + String.valueOf(ejwiVar5) + ", unique=" + String.valueOf(ejwiVar4) + ", tags=" + ekhxVar.toString() + ", backoffPolicy=" + String.valueOf(ejwiVar3) + ", backoffDelayDuration=" + String.valueOf(ejwiVar2) + ", targetProcess=" + String.valueOf(ejwiVar) + "}";
    }
}
