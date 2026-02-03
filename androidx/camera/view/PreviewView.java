package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import defpackage.a;
import defpackage.azx;
import defpackage.azy;
import defpackage.bbs;
import defpackage.bbx;
import defpackage.bcg;
import defpackage.bdp;
import defpackage.bdu;
import defpackage.bir;
import defpackage.box;
import defpackage.bpc;
import defpackage.bpn;
import defpackage.bqk;
import defpackage.chm;
import defpackage.cht;
import defpackage.chu;
import defpackage.cig;
import defpackage.cii;
import defpackage.cim;
import defpackage.cin;
import defpackage.cio;
import defpackage.cip;
import defpackage.ciq;
import defpackage.cir;
import defpackage.cis;
import defpackage.civ;
import defpackage.ciy;
import defpackage.ciz;
import defpackage.cja;
import defpackage.cjh;
import defpackage.cjv;
import defpackage.cjw;
import defpackage.cjx;
import defpackage.cjz;
import defpackage.lcg;
import defpackage.ley;
import defpackage.lvy;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    public cir a;
    public final cja b;
    public final cig c;
    public boolean d;
    public final lvy e;
    public final AtomicReference f;
    public chu g;
    public cis h;
    public bir i;
    public final bcg j;
    public int k;
    private final cjv l;
    private MotionEvent m;
    private final cin n;
    private final View.OnLayoutChangeListener o;

    public PreviewView(Context context) {
        this(context, null);
    }

    public static boolean e(bdp bdpVar, int i) {
        boolean zEquals = bdpVar.f.f().m().equals("androidx.camera.camera2.legacy");
        boolean z = (cjz.a(SurfaceViewStretchedQuirk.class) == null && cjz.a(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (zEquals || z) {
            return true;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            return true;
        }
        Objects.toString(cio.a(i));
        throw new IllegalArgumentException("Invalid implementation mode: ".concat(cio.a(i)));
    }

    private final DisplayManager h() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    public final bcg a() {
        box.b();
        return this.j;
    }

    public final void b(boolean z) {
        int i;
        box.b();
        box.b();
        bdu bduVar = null;
        if (getDisplay() != null) {
            int rotation = getDisplay().getRotation();
            box.b();
            if (getWidth() != 0 && getHeight() != 0) {
                Rational rational = new Rational(getWidth(), getHeight());
                int iF = f();
                int i2 = iF - 1;
                if (iF == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    i = 0;
                } else if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        i = 3;
                        if (i2 != 3 && i2 != 4 && i2 != 5) {
                            int iF2 = f();
                            Objects.toString(cip.a(iF2));
                            throw new IllegalStateException("Unexpected scale type: ".concat(cip.a(iF2)));
                        }
                    }
                } else {
                    i = 1;
                }
                bduVar = new bdu(i, rational, rotation, getLayoutDirection());
            }
        }
        if (this.g == null || bduVar == null || !isAttachedToWindow()) {
            return;
        }
        try {
            chu chuVar = this.g;
            bcg bcgVarA = a();
            box.b();
            if (chuVar.p != bcgVarA) {
                chuVar.p = bcgVarA;
                chuVar.c.a(bcgVarA);
            }
            boolean z2 = chuVar.o == null || chuVar.d(bduVar) != chuVar.d(chuVar.o);
            chuVar.o = bduVar;
            ciz cizVar = chuVar.q;
            ScheduledExecutorService scheduledExecutorServiceA = bpn.a();
            chm chmVar = chuVar.B;
            synchronized (cizVar.a) {
                OrientationEventListener orientationEventListener = cizVar.b;
                if (orientationEventListener.canDetectOrientation()) {
                    cizVar.c.put(chmVar, new ciy(chmVar, scheduledExecutorServiceA));
                    orientationEventListener.enable();
                }
            }
            if (z2) {
                chuVar.n();
            }
            chuVar.l();
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            bbs.d("PreviewView", e.toString(), e);
        }
    }

    public final void c() {
        Rect rect;
        Display display;
        bir birVar;
        box.b();
        if (this.a != null) {
            if (this.d && (display = getDisplay()) != null && (birVar = this.i) != null) {
                cig cigVar = this.c;
                int iC = birVar.c(display.getRotation());
                int rotation = display.getRotation();
                if (cigVar.g) {
                    cigVar.c = iC;
                    cigVar.e = rotation;
                }
            }
            this.a.g();
        }
        cis cisVar = this.h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        box.b();
        synchronized (cisVar) {
            Matrix matrix = null;
            if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = cisVar.d) == null) {
                cisVar.e = null;
            } else {
                cig cigVar2 = cisVar.c;
                if (cigVar2.f()) {
                    matrix = new Matrix();
                    cigVar2.b(size, layoutDirection).invert(matrix);
                    Matrix matrix2 = new Matrix();
                    matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
                    matrix.postConcat(matrix2);
                }
                cisVar.e = matrix;
            }
        }
        if (this.g != null) {
            box.b();
            if (getWidth() != 0 && getHeight() != 0) {
                this.c.b(new Size(getWidth(), getHeight()), getLayoutDirection());
            }
            box.b();
        }
    }

    public final void d(int i) {
        box.b();
        this.k = i;
    }

    public final int f() {
        box.b();
        return this.c.h;
    }

    public final void g() {
        chu chuVar = this.g;
        if (chuVar == null) {
            bbs.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        cjx cjxVar = new cjx(cjw.PREVIEW_VIEW);
        cjw cjwVar = cjxVar.a;
        Map map = chuVar.z;
        cjx cjxVarE = chuVar.e();
        map.put(cjwVar, cjxVar);
        cjx cjxVarE2 = chuVar.e();
        if (cjxVarE2 == null || cjxVarE2.equals(cjxVarE)) {
            return;
        }
        chuVar.q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManagerH = h();
        if (displayManagerH != null) {
            displayManagerH.registerDisplayListener(this.n, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.o);
        cir cirVar = this.a;
        if (cirVar != null) {
            cirVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.o);
        cir cirVar = this.a;
        if (cirVar != null) {
            cirVar.e();
        }
        chu chuVar = this.g;
        if (chuVar != null) {
            chuVar.h();
        }
        DisplayManager displayManagerH = h();
        if (displayManagerH == null) {
            return;
        }
        displayManagerH.unregisterDisplayListener(this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186 A[PHI: r7
      0x0186: PHI (r7v5 boolean) = (r7v4 boolean), (r7v4 boolean), (r7v6 boolean) binds: [B:89:0x0162, B:91:0x0166, B:96:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.g != null) {
            MotionEvent motionEvent = this.m;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.m;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            chu chuVar = this.g;
            cis cisVar = this.h;
            if (chuVar.r()) {
                boolean z = chuVar.s;
                PointF pointF = new PointF(x, y);
                bbx bbxVarB = cisVar.b(pointF.x, pointF.y, 0.16666667f);
                bbx bbxVarB2 = cisVar.b(pointF.x, pointF.y, 0.25f);
                azx azxVar = new azx(bbxVarB);
                azxVar.a(bbxVarB2, 2);
                long j = chuVar.A;
                if (j > 0) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    lcg.b(true, "autoCancelDuration must be at least 1");
                    azxVar.d = timeUnit.toMillis(j);
                } else {
                    azxVar.d = 0L;
                }
                azy azyVar = new azy(azxVar);
                bbs.a("CameraController", "Tap to focus started: " + x + ", " + y);
                cht chtVar = chuVar.t;
                if (chtVar != null) {
                    chtVar.c();
                }
                lvy lvyVar = chuVar.u;
                lvyVar.j(new cjh(1));
                final cht chtVar2 = new cht(lvyVar);
                chuVar.t = chtVar2;
                bqk.i(chuVar.m.b().k(azyVar), chtVar2, bpc.a());
                long millis = TimeUnit.NANOSECONDS.toMillis(j);
                bbs.a("CameraController", a.A(millis, "Tap to focus auto cancel duration: ", " ms"));
                if (millis > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: chj
                        @Override // java.lang.Runnable
                        public final void run() {
                            cht chtVar3 = chtVar2;
                            synchronized (chtVar3.c) {
                                if (chtVar3.a) {
                                    return;
                                }
                                bbs.a("CameraController", "Tap-to-focus reset.");
                                chtVar3.b.j(new cjh(0));
                                chtVar3.a = true;
                            }
                        }
                    }, millis);
                }
            } else {
                bbs.f("CameraController", "Use cases not attached to camera.");
            }
        }
        this.m = null;
        return super.performClick();
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = 1;
        cig cigVar = new cig();
        this.c = cigVar;
        this.d = true;
        this.e = new lvy(ciq.IDLE);
        this.f = new AtomicReference();
        this.h = new cis(cigVar);
        this.n = new cin(this);
        this.o = new View.OnLayoutChangeListener() { // from class: cih
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                PreviewView previewView = this.a;
                previewView.c();
                previewView.b(true);
            }
        };
        this.j = new cim(this);
        box.b();
        Resources.Theme theme = context.getTheme();
        int[] iArr = civ.a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        ley.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, i2);
        try {
            int i3 = cigVar.h;
            int i4 = i3 - 1;
            if (i3 != 0) {
                int integer = typedArrayObtainStyledAttributes.getInteger(1, i4);
                int[] iArr2 = {1, 2, 3, 4, 5, 6};
                for (int i5 = 0; i5 < 6; i5++) {
                    int i6 = iArr2[i5];
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    if (i7 == integer) {
                        box.b();
                        this.c.h = i6;
                        c();
                        b(false);
                        int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                        int[] iArr3 = {1, 2};
                        for (int i8 = 0; i8 < 2; i8++) {
                            int i9 = iArr3[i8];
                            int i10 = i9 - 1;
                            if (i9 == 0) {
                                throw null;
                            }
                            if (i10 == integer2) {
                                d(i9);
                                typedArrayObtainStyledAttributes.recycle();
                                cii ciiVar = new cii(this);
                                context.getClass();
                                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                                this.l = new cjv(context, scaledTouchSlop + scaledTouchSlop, ciiVar);
                                if (getBackground() == null) {
                                    setBackgroundColor(getContext().getColor(R.color.black));
                                }
                                cja cjaVar = new cja(context);
                                this.b = cjaVar;
                                cjaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                                return;
                            }
                        }
                        throw new IllegalArgumentException(a.g(integer2, "Unknown implementation mode id "));
                    }
                }
                throw new IllegalArgumentException(a.g(integer, "Unknown scale type id "));
            }
            throw null;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
