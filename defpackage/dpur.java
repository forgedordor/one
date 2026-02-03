package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpur extends fdcy {
    final /* synthetic */ dput a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpur(dput dputVar) {
        super(null);
        this.a = dputVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpxo dpxoVar = (dpxo) obj2;
        dpxo dpxoVar2 = (dpxo) obj;
        ((ekrd) dput.b.h().h("com/google/android/libraries/compose/ui/rendering/RenderingManager$special$$inlined$distinctObservable$1", "afterChange", 78, "RenderingManager.kt")).D("Screen switched from %s to %s", dpxoVar2, dpxoVar);
        final dput dputVar = this.a;
        if (dpxoVar2 != null) {
            dputVar.f.g(dpxoVar2);
            if (dputVar.d() != dpuv.d) {
                dputVar.k(dpxoVar2);
            }
        }
        if (dpxoVar != null) {
            Object obj3 = dputVar.g.get(dpxoVar.t());
            fdae fdaeVar = null;
            dpxoVar.bI(obj3 instanceof dpxp ? (dpxp) obj3 : null);
            fdae fdaeVar2 = new fdae() { // from class: dpuo
                @Override // defpackage.fdae
                public final Object invoke() {
                    dputVar.l();
                    return fctx.a;
                }
            };
            fdae fdaeVar3 = true != dpxoVar.bK() ? fdaeVar2 : null;
            if (fdaeVar3 == null) {
                fdaeVar2.invoke();
            } else {
                fdaeVar = fdaeVar3;
            }
            dpxoVar.aS = fdaeVar;
            dputVar.h(dpxoVar);
            dpwq dpwqVar = dputVar.f;
            dpwqVar.g = dpxoVar;
            dpwu dpwuVarC = dpwqVar.c();
            if (dpwuVarC != null) {
                dpwuVarC.a(dpxoVar, dpwqVar.d);
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
