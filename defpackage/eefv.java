package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefv extends uk {
    final /* synthetic */ CarouselLayoutManager f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eefv(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f = carouselLayoutManager;
    }

    @Override // defpackage.uk
    public final int b(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.f;
        if (carouselLayoutManager.d == null || !carouselLayoutManager.g()) {
            return 0;
        }
        return carouselLayoutManager.i(CarouselLayoutManager.bu(view));
    }

    @Override // defpackage.uk
    public final int c(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.f;
        if (carouselLayoutManager.d == null || carouselLayoutManager.g()) {
            return 0;
        }
        return carouselLayoutManager.i(CarouselLayoutManager.bu(view));
    }

    @Override // defpackage.wr
    public final PointF l(int i) {
        return this.f.P(i);
    }
}
