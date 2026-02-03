package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgg {
    public static final long a = ijg.j(0.0f, 0.0f, 0.0f, 0.3f, null, 16);
    public static final fdap b = sgf.a;

    @fcsv
    public static final sgd a(hml hmlVar) {
        hmlVar.v(-715745933);
        hmlVar.v(1009281237);
        hng hngVar = AndroidCompositionLocals_androidKt.f;
        ViewParent parent = ((View) hmlVar.e(hngVar)).getParent();
        Window window = null;
        knm knmVar = parent instanceof knm ? (knm) parent : null;
        Window windowA = knmVar != null ? knmVar.a() : null;
        if (windowA == null) {
            Context context = ((View) hmlVar.e(hngVar)).getContext();
            context.getClass();
            while (true) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    context.getClass();
                } else {
                    window = ((Activity) context).getWindow();
                    break;
                }
            }
        } else {
            window = windowA;
        }
        hmw hmwVar = (hmw) hmlVar;
        hmwVar.ab();
        View view = (View) hmlVar.e(hngVar);
        hmlVar.v(-1633490746);
        boolean zD = hmlVar.D(window) | hmlVar.D(view);
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new sgd(view, window);
            hmwVar.af(objS);
        }
        sgd sgdVar = (sgd) objS;
        hmwVar.ab();
        hmwVar.ab();
        return sgdVar;
    }
}
