package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edqn extends lxd {
    public final edln a;
    public final edlj b;
    public final edlv c;
    public final eduq d;
    public final lvx e;
    public final edqw f;
    public int g;

    public edqn(edln edlnVar, edlj edljVar, edlv edlvVar, eduq eduqVar) {
        this.a = edlnVar;
        this.b = edljVar;
        this.c = edlvVar;
        this.d = eduqVar;
        if (fbgv.n()) {
            this.f = new edqw(edlnVar, edljVar, edlvVar, eduqVar.e);
        } else {
            this.f = new edqw(edlnVar, edljVar, edlvVar, false);
        }
        lvx lvxVar = new lvx();
        this.e = lvxVar;
        lvxVar.p(this.f, new lvz() { // from class: edqm
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ekgb ekgbVarS;
                edqo edqoVar = (edqo) obj;
                edhe edheVar = (edhe) edqoVar.a().a().a(edqoVar.b().a()).a(edqoVar.c().a()).f();
                edqn edqnVar = this.a;
                if (edheVar == null) {
                    lvx lvxVar2 = edqnVar.e;
                    if (edqoVar.b().c().isEmpty()) {
                        ekgbVarS = !edqoVar.a().b().isEmpty() ? ekgb.s(edqs.a(edqoVar.a()), edqs.b(edqoVar.c(), 31, new edqr() { // from class: edqp
                            @Override // defpackage.edqr
                            public final edra a(ekgb ekgbVar) {
                                ekgbVar.getClass();
                                return new edqe(ekgbVar);
                            }
                        })) : !edqoVar.c().c().isEmpty() ? ekgb.r(edqs.b(edqoVar.c(), 39, new edqr() { // from class: edqp
                            @Override // defpackage.edqr
                            public final edra a(ekgb ekgbVar) {
                                ekgbVar.getClass();
                                return new edqe(ekgbVar);
                            }
                        })) : ekoe.a;
                    } else {
                        ekgbVarS = ekgb.t(edqs.b(edqoVar.b(), true != fbgv.k() ? 7 : 48, new edqr() { // from class: edqq
                            @Override // defpackage.edqr
                            public final edra a(ekgb ekgbVar) {
                                ekgbVar.getClass();
                                return new edqg(ekgbVar);
                            }
                        }), edqs.a(edqoVar.a()), edqs.b(edqoVar.c(), 23, new edqr() { // from class: edqp
                            @Override // defpackage.edqr
                            public final edra a(ekgb ekgbVar) {
                                ekgbVar.getClass();
                                return new edqe(ekgbVar);
                            }
                        }));
                    }
                    lvxVar2.j(new edqj(ekgbVarS, 4, ejud.a));
                    return;
                }
                if (!fbgv.u()) {
                    lvx lvxVar3 = edqnVar.e;
                    edqnVar.g = 5;
                    lvxVar3.j(edqx.d(5));
                } else {
                    edqnVar.g = 5;
                    lvx lvxVar4 = edqnVar.e;
                    int i = ekgb.d;
                    lvxVar4.j(new edqj(ekoe.a, 5, ejwi.j(edheVar)));
                }
            }
        });
        this.g = 1;
        lvxVar.j(edqx.d(1));
    }
}
