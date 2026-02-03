package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czkv extends wo {
    final /* synthetic */ czkx a;

    public czkv(czkx czkxVar) {
        this.a = czkxVar;
    }

    @Override // defpackage.wo, defpackage.wf
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        czkx czkxVar = this.a;
        CarouselRecyclerView carouselRecyclerView = czkxVar.a;
        if (carouselRecyclerView.getVisibility() != 0) {
            return false;
        }
        int i = carouselRecyclerView.F;
        if (i != 0 && i != 1) {
            return false;
        }
        czkxVar.G(carouselRecyclerView.a());
        return false;
    }
}
