package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eega extends eegb {
    final /* synthetic */ CarouselLayoutManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eega(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.a = carouselLayoutManager;
    }

    @Override // defpackage.eegb
    public final int a() {
        CarouselLayoutManager carouselLayoutManager = this.a;
        return carouselLayoutManager.I - carouselLayoutManager.ay();
    }

    @Override // defpackage.eegb
    public final int b() {
        return 0;
    }

    @Override // defpackage.eegb
    public final int c() {
        return this.a.H;
    }

    @Override // defpackage.eegb
    public final int d() {
        if (this.a.L()) {
            return c();
        }
        return 0;
    }

    @Override // defpackage.eegb
    public final int e() {
        return this.a.aB();
    }

    @Override // defpackage.eegb
    public final RectF f(float f, float f2, float f3, float f4) {
        return new RectF(f4, 0.0f, f2 - f4, f);
    }

    @Override // defpackage.eegb
    public final void g(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.left < rectF3.left && rectF2.right > rectF3.left) {
            float f = rectF3.left - rectF2.left;
            rectF.left += f;
            rectF2.left += f;
        }
        if (rectF2.right <= rectF3.right || rectF2.left >= rectF3.right) {
            return;
        }
        float f2 = rectF2.right - rectF3.right;
        rectF.right = Math.max(rectF.right - f2, rectF.left);
        rectF2.right = Math.max(rectF2.right - f2, rectF2.left);
    }

    @Override // defpackage.eegb
    public final void h(View view, int i, int i2) {
        int iE = e();
        wc wcVar = (wc) view.getLayoutParams();
        CarouselLayoutManager.bx(view, i, iE, i2, CarouselLayoutManager.bq(view) + wcVar.topMargin + wcVar.bottomMargin + iE);
    }

    @Override // defpackage.eegb
    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            rectF.right = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.left = Math.min(rectF.left, rectF.right);
        }
        if (rectF2.left >= rectF3.right) {
            rectF.left = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.right = Math.max(rectF.left, rectF.right);
        }
    }

    @Override // defpackage.eegb
    public final void j(View view, Rect rect, float f, float f2) {
        view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
    }
}
