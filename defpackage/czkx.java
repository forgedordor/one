package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czkx extends vo {
    public final CarouselRecyclerView a;
    public int e;
    public final czfz g;
    public int f = -1;
    public final List d = new ArrayList();

    protected czkx(CarouselRecyclerView carouselRecyclerView, czfz czfzVar) {
        this.a = carouselRecyclerView;
        this.g = czfzVar;
    }

    public final void F(Object obj) {
        this.d.add(obj);
    }

    public final void G(int i) {
        if (i != this.e) {
            this.e = i;
            czfz czfzVar = this.g;
            Object obj = this.d.get(i);
            int i2 = this.f;
            czfzVar.a.k(((czjw) obj).a, true != (i2 < 0 || i2 != this.a.a()) ? 2 : 4);
            this.a.performHapticFeedback(0);
            this.f = -1;
        }
    }

    @Override // defpackage.vo
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return 0;
    }

    @Override // defpackage.vo
    public void g(wv wvVar, int i) {
        throw null;
    }

    public int l(View view) {
        throw null;
    }
}
