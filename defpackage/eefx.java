package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefx extends vx {
    public List a;
    private final Paint b;

    public eefx() {
        Paint paint = new Paint();
        this.b = paint;
        this.a = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.vx
    public final void k(Canvas canvas, RecyclerView recyclerView) throws Resources.NotFoundException {
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.b;
        paint.setStrokeWidth(dimension);
        for (eegf eegfVar : this.a) {
            paint.setColor(kzb.e(-65281, -16776961, eegfVar.c));
            if (((CarouselLayoutManager) recyclerView.o).g()) {
                float f = eegfVar.b;
                canvas.drawLine(f, ((CarouselLayoutManager) recyclerView.o).w(), f, ((CarouselLayoutManager) recyclerView.o).l(), paint);
            } else {
                float fR = ((CarouselLayoutManager) recyclerView.o).r();
                float f2 = eegfVar.b;
                canvas.drawLine(fR, f2, ((CarouselLayoutManager) recyclerView.o).s(), f2, paint);
            }
        }
    }
}
