package defpackage;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icw extends icr {
    public boolean a;
    private final boolean c = true;
    public boolean b = true;

    @Override // defpackage.icr
    public final void dU() {
        if (this.b) {
            if (this.a) {
                itw.d("invalid sensitive content state");
            }
            jbg.f(this).p();
            this.a = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icw)) {
            return false;
        }
        boolean z = ((icw) obj).c;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    @Override // defpackage.icr
    public final void s() {
        if (this.a) {
            Object objF = jbg.f(this);
            if (Build.VERSION.SDK_INT >= 35) {
                if (((AndroidComposeView) objF).T == 1) {
                    jiy.a.a((View) objF, false);
                }
                r1.T--;
            }
            this.a = false;
        }
    }

    public final String toString() {
        return "SensitiveContentNode(_isContentSensitive=true)";
    }
}
