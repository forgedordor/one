package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrx extends egsj {
    public Class a;
    public ejwi b;
    public egsl c;
    public ejwi d;
    public pzs e;
    private pzj f;
    private ejwi g;
    private ejwi h;
    private ekhx i;
    private ejwi j;
    private ejwi k;
    private ejwi l;

    public egrx() {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.d = ejudVar;
        this.g = ejudVar;
        this.h = ejudVar;
        this.j = ejudVar;
        this.k = ejudVar;
        this.l = ejudVar;
    }

    @Override // defpackage.egsj
    public final egsn a() {
        pzj pzjVar;
        egsl egslVar;
        pzs pzsVar;
        ekhx ekhxVar;
        Class cls = this.a;
        if (cls != null && (pzjVar = this.f) != null && (egslVar = this.c) != null && (pzsVar = this.e) != null && (ekhxVar = this.i) != null) {
            return new egry(cls, pzjVar, this.b, egslVar, this.d, pzsVar, this.g, this.h, ekhxVar, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" workerClass");
        }
        if (this.f == null) {
            sb.append(" constraints");
        }
        if (this.c == null) {
            sb.append(" initialDelay");
        }
        if (this.e == null) {
            sb.append(" inputData");
        }
        if (this.i == null) {
            sb.append(" tags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egsj
    public final void b(ejwi ejwiVar) {
        this.k = ejwiVar;
    }

    @Override // defpackage.egsj
    public final void c(ejwi ejwiVar) {
        this.j = ejwiVar;
    }

    @Override // defpackage.egsj
    public final void d(pzj pzjVar) {
        if (pzjVar == null) {
            throw new NullPointerException("Null constraints");
        }
        this.f = pzjVar;
    }

    @Override // defpackage.egsj
    public final void e(egsk egskVar) {
        this.g = ejwi.j(egskVar);
    }

    @Override // defpackage.egsj
    public final void f(Set set) {
        this.i = ekhx.o(set);
    }

    @Override // defpackage.egsj
    public final void g(egsm egsmVar) {
        this.h = ejwi.j(egsmVar);
    }

    public egrx(egsn egsnVar) {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.d = ejudVar;
        this.g = ejudVar;
        this.h = ejudVar;
        this.j = ejudVar;
        this.k = ejudVar;
        this.l = ejudVar;
        egry egryVar = (egry) egsnVar;
        this.a = egryVar.a;
        this.f = egryVar.b;
        this.b = egryVar.c;
        this.c = egryVar.d;
        this.d = egryVar.e;
        this.e = egryVar.f;
        this.g = egryVar.g;
        this.h = egryVar.h;
        this.i = egryVar.i;
        this.j = egryVar.j;
        this.k = egryVar.k;
        this.l = egryVar.l;
    }
}
