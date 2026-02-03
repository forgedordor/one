package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inq implements inl {
    private static final Canvas a = new inp();
    private float A;
    private ikk B;
    private final inv b;
    private final ijc c;
    private final inu d;
    private final Resources e;
    private final Rect f;
    private Paint g;
    private int h;
    private int i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private long w;
    private long x;
    private float y;
    private float z;

    public /* synthetic */ inq(inv invVar) {
        ijc ijcVar = new ijc();
        imu imuVar = new imu();
        this.b = invVar;
        this.c = ijcVar;
        inu inuVar = new inu(invVar, ijcVar, imuVar);
        this.d = inuVar;
        this.e = invVar.getResources();
        this.f = new Rect();
        invVar.addView(inuVar);
        inuVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = ije.a;
        this.w = j;
        this.x = j;
    }

    private final Paint P() {
        Paint paint = this.g;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.g = paint2;
        return paint2;
    }

    private final void Q(int i) {
        inu inuVar = this.d;
        boolean z = true;
        if (inf.a(i, 1)) {
            inuVar.setLayerType(2, this.g);
        } else if (inf.a(i, 2)) {
            inuVar.setLayerType(0, this.g);
            z = false;
        } else {
            inuVar.setLayerType(0, this.g);
        }
        if (inuVar.c != z) {
            inuVar.c = z;
            inuVar.invalidate();
        }
    }

    private final void R() {
        int i = this.o;
        if (inf.a(i, 1) || !iis.b(this.n, 3)) {
            Q(1);
        } else {
            Q(i);
        }
    }

    @Override // defpackage.inl
    public final void A(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            this.q = false;
            inu inuVar = this.d;
            inuVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            inuVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.d.resetPivot();
            return;
        }
        this.q = true;
        inu inuVar2 = this.d;
        inuVar2.setPivotX(((int) (this.j >> 32)) / 2.0f);
        inuVar2.setPivotY(((int) (4294967295L & this.j)) / 2.0f);
    }

    @Override // defpackage.inl
    public final void B(int i, int i2, long j) {
        if (kjg.e(this.j, j)) {
            int i3 = this.h;
            if (i3 != i) {
                this.d.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                this.d.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (O()) {
                this.k = true;
            }
            inu inuVar = this.d;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            inuVar.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                inuVar.setPivotX(i5 / 2.0f);
                inuVar.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.inl
    public final void C(ikk ikkVar) {
        this.B = ikkVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(ikkVar != null ? ikkVar.b() : null);
        }
    }

    @Override // defpackage.inl
    public final void D(float f) {
        this.y = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.inl
    public final void E(float f) {
        this.z = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.inl
    public final void F(float f) {
        this.A = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.inl
    public final void G(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.inl
    public final void H(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.inl
    public final void I(float f) {
        this.v = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.inl
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            this.d.setOutlineSpotShadowColor(ijg.b(j));
        }
    }

    @Override // defpackage.inl
    public final void K(float f) {
        this.t = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.inl
    public final void L(float f) {
        this.u = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.inl
    public final /* synthetic */ boolean M() {
        return true;
    }

    @Override // defpackage.inl
    public final void N() {
        P().setColorFilter(null);
        R();
    }

    public final boolean O() {
        return this.m || this.d.getClipToOutline();
    }

    @Override // defpackage.inl
    public final float a() {
        return this.p;
    }

    @Override // defpackage.inl
    public final float b() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.inl
    public final float c() {
        return this.y;
    }

    @Override // defpackage.inl
    public final float d() {
        return this.z;
    }

    @Override // defpackage.inl
    public final float e() {
        return this.A;
    }

    @Override // defpackage.inl
    public final float f() {
        return this.r;
    }

    @Override // defpackage.inl
    public final float g() {
        return this.s;
    }

    @Override // defpackage.inl
    public final float h() {
        return this.v;
    }

    @Override // defpackage.inl
    public final float i() {
        return this.t;
    }

    @Override // defpackage.inl
    public final float j() {
        return this.u;
    }

    @Override // defpackage.inl
    public final int k() {
        return this.n;
    }

    @Override // defpackage.inl
    public final int l() {
        return this.o;
    }

    @Override // defpackage.inl
    public final long m() {
        return this.w;
    }

    @Override // defpackage.inl
    public final long n() {
        return this.x;
    }

    @Override // defpackage.inl
    public final Matrix o() {
        return this.d.getMatrix();
    }

    @Override // defpackage.inl
    public final ikk p() {
        return this.B;
    }

    @Override // defpackage.inl
    public final void q() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.inl
    public final void r(ijb ijbVar) {
        if (this.k) {
            inu inuVar = this.d;
            Rect rect = null;
            if (O() && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = inuVar.getWidth();
                rect.bottom = inuVar.getHeight();
            }
            inuVar.setClipBounds(rect);
        }
        if (iid.a(ijbVar).isHardwareAccelerated()) {
            inv invVar = this.b;
            inu inuVar2 = this.d;
            invVar.a(ijbVar, inuVar2, inuVar2.getDrawingTime());
        }
    }

    @Override // defpackage.inl
    public final void s(kio kioVar, kji kjiVar, ini iniVar, fdap fdapVar) {
        inu inuVar = this.d;
        if (inuVar.getParent() == null) {
            this.b.addView(inuVar);
        }
        inuVar.d = kioVar;
        inuVar.e = kjiVar;
        inuVar.f = fdapVar;
        inuVar.g = iniVar;
        if (inuVar.isAttachedToWindow()) {
            inuVar.setVisibility(4);
            inuVar.setVisibility(0);
            try {
                ijc ijcVar = this.c;
                Canvas canvas = a;
                iic iicVar = ijcVar.a;
                Canvas canvas2 = iicVar.a;
                iicVar.a = canvas;
                this.b.a(iicVar, inuVar, inuVar.getDrawingTime());
                iicVar.a = canvas2;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.inl
    public final void t(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.inl
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            this.d.setOutlineAmbientShadowColor(ijg.b(j));
        }
    }

    @Override // defpackage.inl
    public final void v(int i) {
        this.n = i;
        P().setXfermode(new PorterDuffXfermode(iib.b(i)));
        R();
    }

    @Override // defpackage.inl
    public final void w(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.inl
    public final void x(boolean z) {
        this.m = z && !this.l;
        this.k = true;
        this.d.setClipToOutline(z && this.l);
    }

    @Override // defpackage.inl
    public final void y(int i) {
        this.o = i;
        R();
    }

    @Override // defpackage.inl
    public final void z(Outline outline, long j) {
        inu inuVar = this.d;
        inuVar.b = outline;
        inuVar.invalidateOutline();
        if (O() && outline != null) {
            inuVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }
}
