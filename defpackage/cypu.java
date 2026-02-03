package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ditto.CameraSourcePreview;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cypu implements cypd {
    public static final eksp a = eksp.c("BugleDitto");
    public static final cczi b = cdag.h(cdag.b, "enable_desktop_pair_with_test_only", false);
    public static final cczi c = cdag.g(cdag.b, "desktop_pair_with_test_only", "");
    public final cyqh d;
    public final fcsu e;
    public final cypi f;
    public final ehbb g;
    public final eigp h;
    public final Activity i;
    public final cypj j;
    public cypc k;
    public cypt l;
    public dekh m;
    public cypb n;
    public cypr o;
    public CameraSourcePreview p;
    public View q;
    public iv r;
    public ehba s;

    public cypu(cyqh cyqhVar, fcsu fcsuVar, cypi cypiVar, ehbb ehbbVar, eigp eigpVar, Activity activity, cypj cypjVar) {
        this.d = cyqhVar;
        this.e = fcsuVar;
        this.f = cypiVar;
        this.g = ehbbVar;
        this.h = eigpVar;
        this.i = activity;
        this.j = cypjVar;
    }

    @Override // defpackage.cypd
    public final void a(boolean z) {
        cypb cypbVar = this.n;
        if (cypbVar == null) {
            return;
        }
        if (z) {
            cypbVar.a(this.o);
        } else {
            cypbVar.a(new cyps());
        }
    }

    @Override // defpackage.cypd
    public final void b(boolean z, boolean z2) {
        if (this.j.aF()) {
            d();
            if (!z) {
                this.q.setVisibility(8);
                return;
            }
            ProgressBar progressBar = (ProgressBar) this.q.findViewById(R.id.qr_loading_progress_bar);
            View viewFindViewById = this.q.findViewById(R.id.qr_loading_overlay_background);
            if (!z2) {
                progressBar.setVisibility(0);
                viewFindViewById.setVisibility(0);
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(c(progressBar, viewFindViewById));
                animatorSet.start();
            }
        }
    }

    public final List c(View... viewArr) throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList(2);
        int integer = this.i.getResources().getInteger(android.R.integer.config_shortAnimTime);
        for (int i = 0; i < 2; i++) {
            View view = viewArr[i];
            if (view.getVisibility() != 0) {
                view.setAlpha(0.0f);
                view.setVisibility(0);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(integer);
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        return arrayList;
    }

    public final void d() {
        iv ivVar = this.r;
        if (ivVar != null) {
            ivVar.dismiss();
        }
        this.r = null;
    }

    public final void e() {
        CameraSourcePreview cameraSourcePreview;
        dekh dekhVar = this.m;
        if (dekhVar == null || (cameraSourcePreview = this.p) == null) {
            return;
        }
        try {
            cameraSourcePreview.b = dekhVar;
            if (cameraSourcePreview.d) {
                return;
            }
            cameraSourcePreview.c = true;
            cameraSourcePreview.a();
        } catch (IOException e) {
            cqca.h("Bugle", e, "Error starting QR Scanner");
            dekh dekhVar2 = this.m;
            if (dekhVar2 != null) {
                dekhVar2.a();
                this.m = null;
            }
            this.i.finish();
        }
    }
}
