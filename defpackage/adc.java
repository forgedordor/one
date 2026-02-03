package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adc {
    public static final /* synthetic */ int a = 0;
    private static final hpt b = new hnz(hsi.a, new fdae() { // from class: adb
        @Override // defpackage.fdae
        public final Object invoke() {
            int i = adc.a;
            return null;
        }
    });

    public static final ach a(hml hmlVar) {
        ach achVar = (ach) hmlVar.e(b);
        Object obj = null;
        if (achVar == null) {
            hmlVar.v(1208426157);
            View view = (View) hmlVar.e(AndroidCompositionLocals_androidKt.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    achVar = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                ach achVar2 = tag instanceof ach ? (ach) tag : null;
                if (achVar2 != null) {
                    achVar = achVar2;
                    break;
                }
                Object objA = lib.a(view);
                view = objA instanceof View ? (View) objA : null;
            }
            hmlVar.o();
        } else {
            hmlVar.v(1208423708);
            hmlVar.o();
        }
        if (achVar != null) {
            hmlVar.v(1208423789);
            hmlVar.o();
            return achVar;
        }
        hmlVar.v(1208428160);
        Context baseContext = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof ach) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        ach achVar3 = (ach) obj;
        hmlVar.o();
        return achVar3;
    }
}
