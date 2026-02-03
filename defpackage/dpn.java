package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpn implements dyb {
    public static final hyr a = new hyu(new fdat() { // from class: dpl
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return Integer.valueOf(((dpn) obj2).c());
        }
    }, new fdap() { // from class: dpm
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return new dpn(((Integer) obj).intValue());
        }
    });
    public float b;
    public final hri c = new hph(0);
    public final ebk d = new ebk();
    public final hri e = new hph(Alert.DURATION_SHOW_INDEFINITELY);
    private final dyb f = new dtd(new fdap() { // from class: dpi
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            float fFloatValue = ((Float) obj).floatValue();
            dpn dpnVar = this.a;
            float fC = dpnVar.c() + fFloatValue + dpnVar.b;
            float fE = fddu.e(fC, 0.0f, dpnVar.b());
            float fC2 = fE - dpnVar.c();
            int iRound = Math.round(fC2);
            dpnVar.f(dpnVar.c() + iRound);
            dpnVar.b = fC2 - iRound;
            if (fC != fE) {
                fFloatValue = fC2;
            }
            return Float.valueOf(fFloatValue);
        }
    });
    private final hsf g;
    private final hsf h;
    private final hri i;

    public dpn(int i) {
        this.i = new hph(i);
        fdae fdaeVar = new fdae() { // from class: dpj
            @Override // defpackage.fdae
            public final Object invoke() {
                dpn dpnVar = this.a;
                return Boolean.valueOf(dpnVar.c() < dpnVar.b());
            }
        };
        hxn hxnVar = hrp.a;
        this.g = new hnt(fdaeVar, null);
        this.h = new hnt(new fdae() { // from class: dpk
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.c() > 0);
            }
        }, null);
    }

    @Override // defpackage.dyb
    public final float a(float f) {
        return this.f.a(f);
    }

    public final int b() {
        return this.e.c();
    }

    public final int c() {
        return this.i.c();
    }

    public final Object d(int i, ddz ddzVar, fcxy fcxyVar) throws Throwable {
        Object objA = dww.a(this, i - c(), ddzVar, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dyb
    public final Object e(dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        Object objE = this.f.e(dodVar, fdatVar, fcxyVar);
        return objE == fcyl.a ? objE : fctx.a;
    }

    public final void f(int i) {
        this.i.i(i);
    }

    @Override // defpackage.dyb
    public final boolean g() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean h() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean i() {
        return this.f.i();
    }
}
