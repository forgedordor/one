package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afrq implements afrj {
    public final envd a;
    public final fcsu b;
    public final afsq c;
    public final ctnu d;
    public final afva e;
    private final fdjx f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final aftd j;
    private final aftr k;
    private final aftt l;
    private final asgv m;
    private final fdpl n;

    public afrq(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, envd envdVar, fcsu fcsuVar4, ctnu ctnuVar, afsq afsqVar, aftd aftdVar, aftr aftrVar, afva afvaVar, aftt afttVar, asgv asgvVar, afmz afmzVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        envdVar.getClass();
        fcsuVar4.getClass();
        afsqVar.getClass();
        aftdVar.getClass();
        aftrVar.getClass();
        afvaVar.getClass();
        afttVar.getClass();
        afmzVar.getClass();
        this.f = fdjxVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.a = envdVar;
        this.b = fcsuVar4;
        this.d = ctnuVar;
        this.c = afsqVar;
        this.j = aftdVar;
        this.k = aftrVar;
        this.e = afvaVar;
        this.l = afttVar;
        this.m = asgvVar;
        this.n = new fdua(ooy.a(new ouu(new ouv((int) ((Number) fcsuVar.b()).longValue(), (int) ((Number) fcsuVar3.b()).longValue(), false, (int) ((Number) fcsuVar2.b()).longValue(), 0, 0, 52), new fdae() { // from class: afrk
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.d.a(new fdap() { // from class: ctns
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((List) obj).getClass();
                        return fctx.a;
                    }
                });
            }
        }).a, fdjxVar), afmzVar.b(), new afrn(this, null));
    }

    @Override // defpackage.afrj
    public final afrs a() {
        return new afrs(this.j.a(), this.n, this.k.a, new afro(this.l), new afrp(this), new fdae() { // from class: afrl
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new afrr(this.m.a()));
    }
}
