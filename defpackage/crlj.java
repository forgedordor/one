package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crlj implements crkx {
    public final fdjx a;
    public final cmfo b;
    public final fcsu c;
    private final eosc d;
    private final fdjx e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public crlj(eosc eoscVar, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, cmfo cmfoVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        eoscVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        fcsuVar4.getClass();
        this.d = eoscVar;
        this.e = fdjxVar;
        this.a = fdjxVar2;
        this.f = fcsuVar;
        this.b = cmfoVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.c = fcsuVar4;
    }

    private final void g(eiju eijuVar) {
        ((egzh) this.h.b()).a(eijuVar, "nudge_preference_key");
    }

    @Override // defpackage.crkx
    public final egyi a() {
        return new egys((egyt) this.g.b(), new eopk() { // from class: crkz
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                crlj crljVar = this.a;
                return new eopy(auvw.c(crljVar.a, fcyi.a, fdjz.a, new crlc(crljVar, null)));
            }
        }, "nudge_preference_key");
    }

    @Override // defpackage.crkx
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new crlb(this, null));
    }

    @Override // defpackage.crkx
    public final eiju c(boolean z) {
        if (tet.a() && ((Boolean) ((cczi) tet.c.get()).e()).booleanValue()) {
            eiju eijuVarC = auvw.c(this.a, fcyi.a, fdjz.a, new crle(this, z, null));
            g(eijuVarC);
            return eijuVarC;
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.crkx
    public final eiju d(final boolean z) {
        return (!((Optional) this.c.b()).isPresent() || z) ? e(new fdap() { // from class: crla
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                crku crkuVar = (crku) obj;
                crkuVar.getClass();
                crkt builder = crkuVar.toBuilder();
                builder.copyOnWrite();
                crku crkuVar2 = (crku) builder.instance;
                crkuVar2.b |= 1;
                crkuVar2.c = z;
                crku crkuVarBuild = builder.build();
                crkuVarBuild.getClass();
                return crkuVarBuild;
            }
        }) : auvw.i(this.a, new crlg(this, null));
    }

    public final eiju e(fdap fdapVar) {
        if (crbf.g()) {
            eiju eijuVarC = auvw.c(this.e, fcyi.a, fdjz.a, new crlh(this, fdapVar, null));
            g(eijuVarC);
            return eijuVarC;
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    public final Object f(final fdap fdapVar, fcxy fcxyVar) {
        Object objB = fdii.b(new fdkf[]{auvw.e(((ecjh) this.f.b()).b(new ejvr() { // from class: crky
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (crku) fdapVar.invoke(obj);
            }
        }, this.d)), fdin.b(this.e, eicg.a(fcyi.a), fdjz.a, new crli(null, this, fdapVar))}, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
