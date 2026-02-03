package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpus extends fdcy {
    final /* synthetic */ dput a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpus(Object obj, dput dputVar) {
        super(obj);
        this.a = dputVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [dpvw, java.lang.Object] */
    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpuv dpuvVar = (dpuv) obj2;
        dpuv dpuvVar2 = (dpuv) obj;
        ((ekrd) dput.b.h().h("com/google/android/libraries/compose/ui/rendering/RenderingManager$special$$inlined$distinctObservable$2", "afterChange", 84, "RenderingManager.kt")).D("State switched from %s to %s", dpuvVar2, dpuvVar);
        dput dputVar = this.a;
        dpxo dpxoVarF = dputVar.f();
        if (dpxoVarF != null) {
            dpxoVarF.gx(dpuvVar);
        }
        dputVar.e.invoke(dpuvVar);
        dpwq dpwqVar = dputVar.f;
        dpuvVar2.getClass();
        dpuvVar.getClass();
        int iOrdinal = dpuvVar.ordinal();
        if (iOrdinal == 0) {
            dpwqVar.j(dpuvVar2 == dpuv.b ? dpwqVar.d.a() : dpwqVar.a());
            dpwqVar.k(0, dpwqVar.b());
            dpvh dpvhVar = dpwqVar.f;
            if (dpvhVar != 0) {
                dpvhVar.h = true;
                ?? Invoke = dpvhVar.d.invoke();
                if (Invoke != 0) {
                    dpvhVar.h(Invoke);
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            dpwq.m(dpwqVar, 0, 3);
            dpvh dpvhVar2 = dpwqVar.f;
            if (dpvhVar2 != null) {
                dpvhVar2.h = false;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            dpwqVar.k(0, -1);
        } else {
            if (iOrdinal != 3) {
                throw new fctg();
            }
            dpxo dpxoVar = dpwqVar.g;
            if (dpxoVar != null) {
                dpxoVar.gy();
            }
            dpwqVar.e();
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
