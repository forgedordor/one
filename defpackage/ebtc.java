package defpackage;

import android.view.View;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebtc implements ebtb {
    private static final ekrg a = ekrg.c("com/google/android/libraries/smartmessaging/expressivetext/impl/ExpressiveTextControllerImpl");
    private final ExpressiveTextContext b;
    private final ebtg c;
    private final ebti d;
    private final ebtj e;

    public ebtc(ExpressiveTextContext expressiveTextContext, ebtg ebtgVar) {
        expressiveTextContext.getClass();
        ebtgVar.getClass();
        this.b = expressiveTextContext;
        this.c = ebtgVar;
        this.d = new ebti(expressiveTextContext);
        this.e = new ebtj(expressiveTextContext, ebtgVar);
    }

    private final void h() throws Throwable {
        ExpressiveTextContext expressiveTextContext = this.b;
        expressiveTextContext.d();
        ebtg ebtgVar = this.c;
        ebtgVar.d(expressiveTextContext.c(ebtgVar.e));
        ebtgVar.b(expressiveTextContext.b(ebtgVar.f));
        expressiveTextContext.f(ebtgVar.g);
        Float f = ebtgVar.k;
        if (f != null) {
            expressiveTextContext.i(f.floatValue());
        }
        expressiveTextContext.g(ebtgVar);
    }

    @Override // defpackage.ebtb
    public final /* synthetic */ View.OnTouchListener a() {
        return this.d;
    }

    @Override // defpackage.ebtb
    public final ebtj b() {
        return this.e;
    }

    @Override // defpackage.ebtt
    public final void c() {
        this.b.e();
        ebtg ebtgVar = this.c;
        ebtgVar.d(ebtg.a);
        ebtgVar.g(1);
        ebtgVar.a(-1);
        ebtgVar.b(ebtg.b);
        ebtgVar.f(-1);
        ebtgVar.c(0);
        ebtgVar.e(0);
        ebtgVar.m = "";
        ebtgVar.n = 0L;
    }

    @Override // defpackage.ebtt
    public final void d(GL10 gl10) {
        gl10.getClass();
        ExpressiveTextContext expressiveTextContext = this.b;
        if (expressiveTextContext.p() && !expressiveTextContext.o(System.currentTimeMillis())) {
            ((ekrd) a.j().h("com/google/android/libraries/smartmessaging/expressivetext/impl/ExpressiveTextControllerImpl", "onDrawFrame", 24, "ExpressiveTextControllerImpl.kt")).q("Rendering failed. Releasing context and becoming no-op renderer.");
            expressiveTextContext.e();
        }
    }

    @Override // defpackage.ebtt
    public final void f(GL10 gl10, int i, int i2) throws Throwable {
        gl10.getClass();
        ExpressiveTextContext expressiveTextContext = this.b;
        if (!expressiveTextContext.p()) {
            h();
        }
        expressiveTextContext.l(i, i2);
        if (this.c.l != null) {
            expressiveTextContext.k(r4.left, r4.top, r4.width(), r4.height());
        }
    }

    @Override // defpackage.ebtt
    public final void g(GL10 gl10, EGLConfig eGLConfig) throws Throwable {
        gl10.getClass();
        eGLConfig.getClass();
        h();
    }

    @Override // defpackage.ebtt
    public final void e() {
    }
}
