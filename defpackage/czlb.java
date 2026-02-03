package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czlb extends wr {
    private static final ekrg n = ekrg.c("com/google/android/apps/messaging/ui/mediapicker/camera/carousel/CarouselSmoothScroller");
    public czla a;
    protected PointF d;
    private final float o;
    protected final LinearInterpolator b = new LinearInterpolator();
    protected final DecelerateInterpolator c = new DecelerateInterpolator();
    protected int e = 0;
    protected int f = 0;

    public czlb(Context context, float f) {
        this.o = f / context.getResources().getDisplayMetrics().densityDpi;
    }

    public static final int b(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    private static int c(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected final int a(int i) {
        return (int) Math.ceil(Math.abs(i) * this.o);
    }

    @Override // defpackage.wr
    protected final void f() {
        this.f = 0;
        this.e = 0;
        this.d = null;
        Object obj = this.a;
        if (obj != null) {
            CarouselRecyclerView carouselRecyclerView = (CarouselRecyclerView) obj;
            int i = carouselRecyclerView.ac;
            if (i != -1 && carouselRecyclerView.aO(i) != -1) {
                ((RecyclerView) obj).at(carouselRecyclerView.ac);
            }
            int i2 = carouselRecyclerView.ad;
            if (i2 == -1 || carouselRecyclerView.aO(i2) == -1) {
                return;
            }
            ((RecyclerView) obj).aj(carouselRecyclerView.ad);
        }
    }

    @Override // defpackage.wr
    protected final void h(int i, int i2, wp wpVar) {
        if (j() == 0) {
            n();
            return;
        }
        int iC = c(this.e, i);
        this.e = iC;
        int iC2 = c(this.f, i2);
        this.f = iC2;
        if (iC == 0 && iC2 == 0) {
            PointF pointFL = l(this.g);
            if (pointFL == null || (pointFL.x == 0.0f && pointFL.y == 0.0f)) {
                wpVar.a = this.g;
                n();
                return;
            }
            o(pointFL);
            this.d = pointFL;
            this.e = (int) (pointFL.x * 10000.0f);
            this.f = (int) (pointFL.y * 10000.0f);
            int iA = a(10000);
            wpVar.b((int) (this.e * 1.2f), (int) (this.f * 1.2f), (int) (iA * 1.2f), this.b);
        }
    }

    @Override // defpackage.wr
    protected final void i(View view, wp wpVar) {
        int iB;
        PointF pointF = this.d;
        int i = 1;
        int iB2 = 0;
        int i2 = (pointF == null || pointF.x == 0.0f) ? 0 : this.d.x > 0.0f ? 1 : -1;
        wb wbVar = this.i;
        if (wbVar == null || !wbVar.ae()) {
            iB = 0;
        } else {
            wc wcVar = (wc) view.getLayoutParams();
            iB = b(wb.bp(view) - wcVar.leftMargin, wb.bs(view) + wcVar.rightMargin, wbVar.az(), wbVar.H - wbVar.aA(), i2);
        }
        PointF pointF2 = this.d;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i = 0;
        } else if (this.d.y <= 0.0f) {
            i = -1;
        }
        wb wbVar2 = this.i;
        if (wbVar2 != null && wbVar2.af()) {
            wc wcVar2 = (wc) view.getLayoutParams();
            iB2 = b(wb.bt(view) - wcVar2.topMargin, wb.bo(view) + wcVar2.bottomMargin, wbVar2.aB(), wbVar2.I - wbVar2.ay(), i);
        }
        int iCeil = (int) Math.ceil(a((int) Math.hypot(iB, iB2)) / 0.3356d);
        if (iCeil > 0) {
            wpVar.b(-iB, -iB2, iCeil, this.c);
        }
    }

    @Override // defpackage.wr
    public final PointF l(int i) {
        Object obj = this.i;
        if (obj instanceof wq) {
            return ((wq) obj).P(i);
        }
        ekrw ekrwVarJ = n.j();
        ekrwVarJ.X(eksq.a, "LinearSmoothScroller");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/mediapicker/camera/carousel/CarouselSmoothScroller", "computeScrollVectorForPosition", 353, "CarouselSmoothScroller.java")).t("You should override computeScrollVectorForPosition when the LayoutManager does not implement %s", wq.class.getCanonicalName());
        return null;
    }
}
