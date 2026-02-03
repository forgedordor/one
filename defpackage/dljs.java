package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljs {
    public static final hpt a = new hsg(new fdae() { // from class: dljo
        @Override // defpackage.fdae
        public final Object invoke() {
            return dljs.c(false);
        }
    });

    public static final dff a(final float f) {
        return dea.d(dea.c(1300, 0, new des() { // from class: dljp
            @Override // defpackage.des
            public final float a(float f2) {
                hpt hptVar = dljs.a;
                float f3 = f;
                return f2 < f3 ? f2 / f3 : (1.0f - f2) / (1.0f - f3);
            }
        }, 2), 1, 0L, 4);
    }

    public static final dia b() {
        return dea.c(333, 0, dev.b, 2);
    }

    public static final dljn c(boolean z) {
        return z ? new dljn(g(), h(), i(), j(), b(), m(), e(), dljr.a, d(), o(), p(), q(), k(), l(), r(), f(), dap.a, dar.a, n(), new dljl(null), new dljm(null)) : new dljn(g(), h(), i(), j(), b(), m(), e(), dljq.a, d(), o(), p(), q(), k(), l(), r(), f(), dae.l(dea.c(250, 500, null, 4), 2).a(dae.s(dea.c(500, 0, null, 6), null, 14)), dae.t(null, null, 15).a(dae.m(null, 3)), n(), new dljl(null), new dljm(null));
    }

    private static final dff d() {
        return dea.d(new dia(1300, BasePaymentResult.ERROR_REQUEST_FAILED, dev.d), 1, 0L, 4);
    }

    private static final dff e() {
        return dea.d(dea.c(1000, 0, dev.c, 2), 0, 0L, 6);
    }

    private static final dia f() {
        return dea.c(1000, 0, new den(0.0f, 0.4f, 1.0f, 0.6f), 2);
    }

    private static final dia g() {
        return dea.c(350, 0, new dljm(null).f, 2);
    }

    private static final dia h() {
        return dea.c(150, 0, new dljm(null).c, 2);
    }

    private static final dia i() {
        return new dia(150, 150, dev.b);
    }

    private static final dia j() {
        return dea.c(150, 0, dev.c, 2);
    }

    private static final dia k() {
        return dea.c(500, 0, det.a, 2);
    }

    private static final dia l() {
        return dea.c(1000, 0, det.b, 2);
    }

    private static final dia m() {
        return dea.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, null, 6);
    }

    private static final dia n() {
        return dea.c(250, 0, new den(0.0f, 0.0f, 0.0f, 1.0f), 2);
    }

    private static final dia o() {
        return dea.c(1, BasePaymentResult.ERROR_REQUEST_FAILED, null, 4);
    }

    private static final dia p() {
        return dea.c(600, 0, dev.a, 2);
    }

    private static final dia q() {
        return dea.c(250, 0, dev.a, 2);
    }

    private static final dia r() {
        return dea.c(1400, 0, dev.a, 2);
    }
}
