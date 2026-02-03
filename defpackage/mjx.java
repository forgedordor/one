package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjx implements mmk {
    private final Context b;
    private mka c;
    private final mag d;
    private EGLDisplay h;
    private int i = -1;
    private int j = -1;
    private mmi e = new mjv();
    private mmj f = new mjw();
    public mmh a = new mmh() { // from class: mjt
        @Override // defpackage.mmh
        public final void a(mcw mcwVar) {
            mff.d("DebugViewShaderProgram", "Exception caught by errorListener.", mcwVar);
        }
    };
    private Executor g = eoqg.a;

    public mjx(Context context, mag magVar) {
        this.b = context;
        this.d = magVar;
    }

    @Override // defpackage.mmk
    public final void c() {
        mka mkaVar = this.c;
        if (mkaVar != null) {
            mkaVar.c();
        }
        this.e.w();
        this.e.c();
    }

    @Override // defpackage.mmk
    public final void d(may mayVar, maz mazVar, long j) {
        try {
            int i = mazVar.d;
            int i2 = mazVar.e;
            if (this.h == null) {
                this.h = mev.h();
            }
            int[] iArr = mev.a;
            EGL14.eglGetCurrentContext();
            if (this.i == -1 || this.j == -1) {
                this.i = i;
                this.j = i2;
            }
            if (this.c == null) {
                ekfw ekfwVar = new ekfw();
                ekfwVar.h(mnm.i(this.i, this.j));
                Context context = this.b;
                ekgb ekgbVarG = ekfwVar.g();
                int i3 = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                mag magVar = this.d;
                this.c = mka.n(context, ekgbVarG, ekgbVar, magVar, magVar.e == 1 ? 2 : 0);
            }
            mee.f(this.c);
            throw null;
        } catch (mcw | meu e) {
            this.g.execute(new Runnable() { // from class: mju
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.a(mcw.a(e));
                }
            });
        }
    }

    @Override // defpackage.mmk
    public final void e() throws mcw {
        mka mkaVar = this.c;
        if (mkaVar != null) {
            mkaVar.e();
        }
        try {
            mev.m();
        } catch (meu e) {
            throw new mcw(e);
        }
    }

    @Override // defpackage.mmk
    public final void f(maz mazVar) {
        this.e.b(mazVar);
        this.e.c();
    }

    @Override // defpackage.mmk
    public final void g(Executor executor, mmh mmhVar) {
        this.a = mmhVar;
        this.g = executor;
    }

    @Override // defpackage.mmk
    public final void h(mmi mmiVar) {
        this.e = mmiVar;
        mmiVar.c();
    }

    @Override // defpackage.mmk
    public final void i(mmj mmjVar) {
        this.f = mmjVar;
    }

    @Override // defpackage.mmk
    public final void j() {
        this.f.a();
    }
}
