package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joy extends View implements jfe {
    public static Method a;
    public static Field b;
    public static boolean c;
    public static boolean d;
    private static final fdat g = jow.a;
    private static final ViewOutlineProvider h = new jov();
    public final jnt e;
    public boolean f;
    private final AndroidComposeView i;
    private final jmq j;
    private fdat k;
    private fdae l;
    private boolean m;
    private Rect n;
    private ikb o;
    private boolean p;
    private final ijc q;
    private final jnn r;
    private long s;
    private boolean t;
    private int u;

    public joy(AndroidComposeView androidComposeView, jmq jmqVar, fdat fdatVar, fdae fdaeVar) {
        super(androidComposeView.getContext());
        this.i = androidComposeView;
        this.j = jmqVar;
        this.k = fdatVar;
        this.l = fdaeVar;
        this.e = new jnt();
        this.q = new ijc();
        this.r = new jnn(g);
        this.s = ikz.a;
        this.t = true;
        setWillNotDraw(false);
        jmqVar.addView(this);
        View.generateViewId();
    }

    private final ikd n() {
        if (!getClipToOutline()) {
            return null;
        }
        jnt jntVar = this.e;
        if (jntVar.d()) {
            return null;
        }
        return jntVar.b();
    }

    private final void o() {
        Rect rect;
        if (this.m) {
            Rect rect2 = this.n;
            if (rect2 == null) {
                this.n = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.n;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void p(boolean z) {
        if (z != this.f) {
            this.f = z;
            this.i.I(this, z);
        }
    }

    private final void q() {
        setOutlineProvider(this.e.a() != null ? h : null);
    }

    @Override // defpackage.jfe
    public final long a(long j, boolean z) {
        return z ? this.r.b(this, j) : this.r.a(this, j);
    }

    @Override // defpackage.jfe
    public final void b() {
        p(false);
        AndroidComposeView androidComposeView = this.i;
        androidComposeView.L();
        this.k = null;
        this.l = null;
        androidComposeView.R(this);
        this.j.removeViewInLayout(this);
    }

    @Override // defpackage.jfe
    public final void c(ijb ijbVar, ini iniVar) {
        boolean z = getElevation() > 0.0f;
        this.p = z;
        if (z) {
            ijbVar.i();
        }
        this.j.a(ijbVar, this, getDrawingTime());
        if (this.p) {
            ijbVar.c();
        }
    }

    @Override // defpackage.jfe
    public final void d(float[] fArr) {
        float[] fArrG = this.r.g(this);
        if (fArrG != null) {
            iju.e(fArr, fArrG);
        }
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        boolean z;
        iic iicVar = this.q.a;
        Canvas canvas2 = iicVar.a;
        iicVar.a = canvas;
        if (n() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            iicVar.l();
            this.e.c(iicVar);
            z = true;
        }
        fdat fdatVar = this.k;
        if (fdatVar != null) {
            fdatVar.a(iicVar, null);
        }
        if (z) {
            iicVar.j();
        }
        iicVar.a = canvas2;
        p(false);
    }

    @Override // defpackage.jfe
    public final void e(ihp ihpVar, boolean z) {
        if (z) {
            this.r.e(this, ihpVar);
        } else {
            this.r.d(this, ihpVar);
        }
    }

    @Override // defpackage.jfe
    public final void f(long j) {
        int iA = kjb.a(j);
        if (iA != getLeft()) {
            offsetLeftAndRight(iA - getLeft());
            this.r.c();
        }
        int iB = kjb.b(j);
        if (iB != getTop()) {
            offsetTopAndBottom(iB - getTop());
            this.r.c();
        }
    }

    @Override // defpackage.jfe
    public final void g(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (i2 == getWidth() && i == getHeight()) {
            return;
        }
        setPivotX(ikz.a(this.s) * i2);
        setPivotY(ikz.b(this.s) * i);
        q();
        layout(getLeft(), getTop(), getLeft() + i2, getTop() + i);
        o();
        this.r.c();
    }

    @Override // defpackage.jfe
    public final void h(fdat fdatVar, fdae fdaeVar) {
        this.j.addView(this);
        this.r.f();
        this.m = false;
        this.p = false;
        this.s = ikz.a;
        this.k = fdatVar;
        this.l = fdaeVar;
        p(false);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.t;
    }

    @Override // defpackage.jfe
    public final void i(float[] fArr) {
        iju.e(fArr, this.r.h(this));
    }

    @Override // android.view.View, defpackage.jfe
    public final void invalidate() {
        if (this.f) {
            return;
        }
        p(true);
        super.invalidate();
        this.i.invalidate();
    }

    @Override // defpackage.jfe
    public final void j() {
        if (!this.f || d) {
            return;
        }
        jox.a(this);
        p(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017e  */
    @Override // defpackage.jfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.ikl r15) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.joy.k(ikl):void");
    }

    @Override // defpackage.jfe
    public final boolean l(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.m) {
            return fIntBitsToFloat >= 0.0f && fIntBitsToFloat < ((float) getWidth()) && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.e.e(j);
        }
        return true;
    }

    @Override // defpackage.jfe
    public final float[] m() {
        return this.r.h(this);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
