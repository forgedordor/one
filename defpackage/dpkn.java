package defpackage;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkn implements dpji {
    static final /* synthetic */ fdeh[] a;
    public static final /* synthetic */ int c = 0;
    public final eg b;
    private final dpkh d;
    private final fctc e;
    private final fdcz f;

    static {
        fdbv fdbvVar = new fdbv(dpkn.class, "state", "getState()Lcom/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorViewStrategy$Companion$State;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public dpkn(final Activity activity, dpkh dpkhVar) {
        activity.getClass();
        this.d = dpkhVar;
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        this.b = (eg) activity;
        this.e = fctd.a(new fdae() { // from class: dpki
            @Override // defpackage.fdae
            public final Object invoke() {
                int i = dpkn.c;
                return (ViewGroup) activity.findViewById(R.id.content);
            }
        });
        this.f = new dpkm(dpkk.a, this);
    }

    private final dpkl d() {
        return (dpkl) this.f.c(a[0]);
    }

    private final void e(dpkl dpklVar) {
        this.f.d(a[0], dpklVar);
    }

    @Override // defpackage.dpji
    public final void a(dpje dpjeVar) {
        if (d() instanceof dpkj) {
            throw new IllegalStateException("Detector view was already attached");
        }
        dpku dpkuVar = new dpku(this.b);
        dpkuVar.setTag("KEYBOARD_DETECTION");
        dpkuVar.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        dngc dngcVar = (dngc) this.d.a.b();
        dngcVar.getClass();
        e(new dpkj(dpkuVar, new KeyboardDetectorViewInsetsListener(dngcVar, dpkuVar), dpjeVar));
    }

    @Override // defpackage.dpji
    public final void b() {
        if (!(d() instanceof dpkj)) {
            throw new IllegalStateException("Detector view wasn't attached");
        }
        e(dpkk.a);
    }

    public final ViewGroup c() {
        return (ViewGroup) this.e.a();
    }
}
