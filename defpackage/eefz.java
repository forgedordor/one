package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefz extends eegb {
    final /* synthetic */ CarouselLayoutManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eefz(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.a = carouselLayoutManager;
    }

    @Override // defpackage.eegb
    public final int a() {
        return this.a.I;
    }

    @Override // defpackage.eegb
    public final int b() {
        return this.a.az();
    }

    @Override // defpackage.eegb
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.a;
        return carouselLayoutManager.H - carouselLayoutManager.aA();
    }

    @Override // defpackage.eegb
    public final int d() {
        return 0;
    }

    @Override // defpackage.eegb
    public final int e() {
        return 0;
    }

    @Override // defpackage.eegb
    public final RectF f(float f, float f2, float f3, float f4) {
        return new RectF(0.0f, f3, f2, f - f3);
    }

    @Override // defpackage.eegb
    public final void g(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.top < rectF3.top && rectF2.bottom > rectF3.top) {
            float f = rectF3.top - rectF2.top;
            rectF.top += f;
            rectF3.top += f;
        }
        if (rectF2.bottom <= rectF3.bottom || rectF2.top >= rectF3.bottom) {
            return;
        }
        float f2 = rectF2.bottom - rectF3.bottom;
        rectF.bottom = Math.max(rectF.bottom - f2, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f2, rectF2.top);
    }

    @Override // defpackage.eegb
    public final void h(View view, int i, int i2) {
        int iB = b();
        wc wcVar = (wc) view.getLayoutParams();
        CarouselLayoutManager.bx(view, iB, i, CarouselLayoutManager.br(view) + wcVar.leftMargin + wcVar.rightMargin + iB, i2);
    }

    @Override // defpackage.eegb
    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            rectF.bottom = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.top = Math.min(rectF.top, rectF.bottom);
        }
        if (rectF2.top >= rectF3.bottom) {
            rectF.top = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.bottom = Math.max(rectF.top, rectF.bottom);
        }
    }

    @Override // defpackage.eegb
    public final void j(View view, Rect rect, float f, float f2) {
        view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
    }
}
