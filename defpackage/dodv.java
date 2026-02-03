package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dodv implements fdau {
    final /* synthetic */ doeb a;

    public dodv(doeb doebVar) {
        this.a = doebVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String string = ((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b)).getResources().getString(true != this.a.b() ? R.string.magic_compose_dismiss_error_button_text : R.string.magic_compose_retry_error_button_text);
            string.getClass();
            dthx.b(string, null, glz.a(hmlVar).b, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 65018);
        }
        return fctx.a;
    }
}
