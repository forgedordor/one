package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czkz extends vx {
    @Override // defpackage.vx
    public final void a(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        super.a(rect, view, recyclerView, wsVar);
        vo voVar = recyclerView.n;
        czkx czkxVar = voVar instanceof czkx ? (czkx) voVar : null;
        if (czkxVar == null) {
            return;
        }
        int iC = recyclerView.c(view);
        if (iC == 0 || iC == czkxVar.a() - 1) {
            wc wcVar = (wc) view.getLayoutParams();
            int iL = czkxVar.l(view);
            CarouselRecyclerView carouselRecyclerView = (CarouselRecyclerView) recyclerView;
            int width = carouselRecyclerView.ae;
            if (width == 0) {
                width = carouselRecyclerView.getWidth();
                carouselRecyclerView.ae = width;
            }
            int layoutDirection = carouselRecyclerView.getLayoutDirection();
            if (iC != 0) {
                if (iC == czkxVar.a() - 1) {
                    int marginEnd = (width / 2) - ((iL / 2) + wcVar.getMarginEnd());
                    if (layoutDirection == 1) {
                        rect.left = marginEnd;
                        return;
                    } else {
                        rect.right = marginEnd;
                        return;
                    }
                }
                return;
            }
            int marginStart = (width / 2) - ((iL / 2) + wcVar.getMarginStart());
            if (layoutDirection == 1) {
                rect.right = marginStart;
            } else {
                rect.left = marginStart;
            }
            if (carouselRecyclerView.ab) {
                return;
            }
            carouselRecyclerView.ab = true;
            vo voVar2 = carouselRecyclerView.n;
            if (voVar2 instanceof czkx) {
            }
        }
    }
}
