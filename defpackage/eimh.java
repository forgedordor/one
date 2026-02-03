package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eimh implements eigy {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public eimh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
    }

    private static final boolean a(ejxr ejxrVar) {
        return ((eimm) ejxrVar.get()).c();
    }

    private static final boolean c(eimr eimrVar) {
        return ((eima) eimrVar).e;
    }

    @Override // defpackage.eigy
    public final void b(final eiii eiiiVar, final SparseArray sparseArray) {
        fcsu fcsuVar = this.a;
        if (((ejwi) fcsuVar.b()).g()) {
            dzus dzusVar = (dzus) ((ejwi) fcsuVar.b()).c();
            if (dzusVar.c()) {
                float f = dzusVar.f().a;
                final ejwi ejwiVarJ = eiil.a(eiiiVar.d, f) ? ejwi.j(Float.valueOf(f)) : ejud.a;
                if (ejwiVarJ.g()) {
                    new SparseArray();
                    eimr eimrVarA = eimq.a(eiiiVar, sparseArray, ((Float) ejwiVarJ.c()).floatValue());
                    ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: eimg
                        @Override // defpackage.ejxr
                        public final Object get() {
                            eimn eimnVarE = eimo.e();
                            eimnVarE.c(eiiiVar);
                            ((eily) eimnVarE).a = sparseArray;
                            eimnVarE.d(((Float) ejwiVarJ.c()).floatValue());
                            return eimp.a(eimnVarE.a());
                        }
                    });
                    fcsu fcsuVar2 = this.d;
                    if (((Boolean) fcsuVar2.b()).booleanValue() && c(eimrVarA)) {
                        return;
                    }
                    fcsu fcsuVar3 = this.e;
                    if (((Boolean) fcsuVar3.b()).booleanValue() && a(ejxrVarA)) {
                        return;
                    }
                    if (dzusVar.d()) {
                        eima eimaVar = (eima) eimrVarA;
                        ((dztw) this.c.b()).a(eimaVar.a, eimaVar.c, eimaVar.d, eimaVar.b);
                    }
                    if (((Boolean) this.f.b()).booleanValue()) {
                        eima eimaVar2 = (eima) eimrVarA;
                        ((dzuz) this.b.b()).g(((eimm) ejxrVarA.get()).b(), eimaVar2.f, eimaVar2.g, eimaVar2.b);
                        return;
                    }
                    if (((Boolean) fcsuVar2.b()).booleanValue()) {
                        if (c(eimrVarA)) {
                            return;
                        }
                        eima eimaVar3 = (eima) eimrVarA;
                        ((dzuz) this.b.b()).e(eimaVar3.f, eimaVar3.g, eimaVar3.b);
                    }
                    if (!((Boolean) fcsuVar3.b()).booleanValue() || a(ejxrVarA)) {
                        return;
                    }
                    eima eimaVar4 = (eima) eimrVarA;
                    ((dzuz) this.b.b()).f(((eimm) ejxrVarA.get()).b(), eimaVar4.a.a, eimaVar4.b);
                }
            }
        }
    }
}
