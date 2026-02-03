package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxuy {
    public static int a(int i, int i2, int i3) {
        return kzb.g(kzb.h(i2, i3), i);
    }

    public static int b(DisplayMetrics displayMetrics, int i) {
        return (int) ((i * displayMetrics.density) + 0.5d);
    }

    public static int c(eyax eyaxVar) {
        float f;
        if ((eyaxVar.b & 1) != 0) {
            evsc evscVar = eyaxVar.f;
            if (evscVar == null) {
                evscVar = evsc.a;
            }
            f = evscVar.b;
        } else {
            f = 1.0f;
        }
        return Color.argb(((int) (f * 255.0f)) & 255, ((int) (eyaxVar.c * 255.0f)) & 255, ((int) (eyaxVar.d * 255.0f)) & 255, ((int) (eyaxVar.e * 255.0f)) & 255);
    }

    public static View d(Activity activity) {
        Window window;
        for (ea eaVar : ((eg) activity).a().o()) {
            if (eaVar instanceof dn) {
                View view = eaVar.Q;
                return (view != null || (window = ((dn) eaVar).d.getWindow()) == null) ? view : window.getDecorView();
            }
        }
        return null;
    }

    public static void e(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }
}
