package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ark {
    public static final MeteringRectangle[] a = new MeteringRectangle[0];
    public final amb b;
    final Executor c;
    public final ScheduledExecutorService d;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public MeteringRectangle[] p;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    kog s;
    public boolean t;
    public ama u;
    private final axf v;
    public volatile boolean e = false;
    public volatile Rational f = null;
    public boolean g = false;
    Integer h = 0;
    long k = 0;
    boolean l = false;
    boolean m = false;
    public int n = 1;
    public ama o = null;

    public ark(amb ambVar, ScheduledExecutorService scheduledExecutorService, Executor executor, bly blyVar) {
        MeteringRectangle[] meteringRectangleArr = a;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = null;
        this.t = false;
        this.u = null;
        this.b = ambVar;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.v = new axf(blyVar);
    }

    private static int n(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    final ListenableFuture a(final boolean z) {
        if (Build.VERSION.SDK_INT < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + Build.VERSION.SDK_INT);
            return bqk.b(null);
        }
        if (this.b.a(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return bqk.b(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return kol.a(new koi() { // from class: aqx
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final ark arkVar = this.a;
                final boolean z2 = z;
                arkVar.c.execute(new Runnable() { // from class: aqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ark arkVar2 = arkVar;
                        amb ambVar = arkVar2.b;
                        ambVar.y(arkVar2.u);
                        arkVar2.t = z2;
                        final kog kogVar2 = kogVar;
                        if (!arkVar2.e) {
                            kogVar2.c(new ayw("Camera is not active."));
                            return;
                        }
                        final long jD = ambVar.d();
                        arkVar2.u = new ama() { // from class: aqz
                            @Override // defpackage.ama
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                int iIntValue = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue();
                                StringBuilder sb = new StringBuilder("enableExternalFlashAeMode: isAeModeExternalFlash = ");
                                boolean z3 = iIntValue == 5;
                                sb.append(z3);
                                bbs.a("FocusMeteringControl", sb.toString());
                                if (z3 != arkVar2.t || !amb.H(totalCaptureResult, jD)) {
                                    return false;
                                }
                                kog kogVar3 = kogVar2;
                                bbs.a("FocusMeteringControl", a.r(z3, "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = "));
                                kogVar3.b(null);
                                return true;
                            }
                        };
                        ambVar.n(arkVar2.u);
                    }
                });
                return "enableExternalFlashAeMode";
            }
        });
    }

    final ListenableFuture b() {
        return kol.a(new koi() { // from class: are
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final ark arkVar = this.a;
                arkVar.c.execute(new Runnable() { // from class: ard
                    @Override // java.lang.Runnable
                    public final void run() {
                        arkVar.j(kogVar);
                    }
                });
                return "triggerAePrecapture";
            }
        });
    }

    public final List c(List list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bbx bbxVar = (bbx) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f = bbxVar.a;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = bbxVar.b;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    axf axfVar = this.v;
                    Rational rational3 = bbxVar.d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointF = (i2 == 1 && axfVar.a.d(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f, f2) : new PointF(f, f2);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointF.y) * (1.0f / fDoubleValue);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointF.x) * (1.0f / fDoubleValue2);
                        }
                    }
                    float f3 = rect.left;
                    float fWidth = pointF.x * rect.width();
                    float f4 = rect.top;
                    float fHeight = pointF.y * rect.height();
                    float f5 = bbxVar.c;
                    float fWidth2 = rect.width() * f5;
                    int i3 = (int) (f4 + fHeight);
                    int iHeight = ((int) (f5 * rect.height())) / 2;
                    int i4 = (int) (f3 + fWidth);
                    int i5 = ((int) fWidth2) / 2;
                    Rect rect2 = new Rect(i4 - i5, i3 - iHeight, i4 + i5, i3 + iHeight);
                    rect2.left = n(rect2.left, rect.right, rect.left);
                    rect2.right = n(rect2.right, rect.right, rect.left);
                    rect2.top = n(rect2.top, rect.bottom, rect.top);
                    rect2.bottom = n(rect2.bottom, rect.bottom, rect.top);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    final void d(boolean z, boolean z2) {
        if (this.e) {
            bjj bjjVar = new bjj();
            bjjVar.n();
            bjjVar.b = this.n;
            ald aldVar = new ald();
            if (z) {
                aldVar.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                aldVar.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            bjjVar.f(aldVar.a());
            this.b.G(Collections.singletonList(bjjVar.b()));
        }
    }

    final void e() {
        l();
        i("Cancelled by cancelFocusAndMetering()");
        h();
        f();
        if (k()) {
            d(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = a;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.g = false;
        this.b.d();
    }

    public final void f() {
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.j = null;
        }
    }

    final void g(boolean z) {
        f();
        kog kogVar = this.s;
        if (kogVar != null) {
            kogVar.b(new azz(z));
            this.s = null;
        }
    }

    public final void h() {
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
    }

    public final void i(String str) {
        this.b.y(this.o);
        kog kogVar = this.s;
        if (kogVar != null) {
            kogVar.c(new ayw(str));
            this.s = null;
        }
    }

    final void j(kog kogVar) {
        bbs.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.e) {
            kogVar.c(new ayw("Camera is not active."));
            return;
        }
        bjj bjjVar = new bjj();
        bjjVar.b = this.n;
        bjjVar.n();
        ald aldVar = new ald();
        aldVar.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        bjjVar.f(aldVar.a());
        bjjVar.d(new arj(kogVar));
        this.b.G(Collections.singletonList(bjjVar.b()));
    }

    public final boolean k() {
        return this.p.length > 0;
    }

    public final void l() {
        this.b.y(null);
    }

    final void m(boolean z) {
        if (this.e) {
            bjj bjjVar = new bjj();
            bjjVar.b = this.n;
            bjjVar.n();
            ald aldVar = new ald();
            aldVar.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                aldVar.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.b.a(1)), bjp.HIGH_PRIORITY_REQUIRED);
            }
            bjjVar.f(aldVar.a());
            bjjVar.d(new ari());
            this.b.G(Collections.singletonList(bjjVar.b()));
        }
    }
}
