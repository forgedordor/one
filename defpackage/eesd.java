package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesd {
    public static eerv a(int i) {
        return i != 1 ? new eesg() : new eerw();
    }

    public static void b(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof eesc) {
            ((eesc) background).O(f);
        }
    }

    public static void c(View view) {
        Drawable background = view.getBackground();
        if (background instanceof eesc) {
            d(view, (eesc) background);
        }
    }

    public static void d(View view, eesc eescVar) {
        eejp eejpVar = eescVar.q.c;
        if (eejpVar == null || !eejpVar.a) {
            return;
        }
        eescVar.R(eemo.b(view));
    }
}
