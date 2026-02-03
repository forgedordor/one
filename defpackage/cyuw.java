package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyuw implements cyvc {
    public CoordinatorLayout a;
    public View b;
    public ContentGridView c;
    public boolean d = false;
    public final Compose2oFragment e;
    private final dakl f;

    public cyuw(Compose2oFragment compose2oFragment, dakl daklVar) {
        this.e = compose2oFragment;
        this.f = daklVar;
    }

    public final void a() {
        if (this.c == null) {
            return;
        }
        boolean zL = this.f.l();
        this.d = zL;
        this.e.av(zL);
    }
}
