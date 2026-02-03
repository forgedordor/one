package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dodw implements fdau {
    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String string = ((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b)).getResources().getString(R.string.magic_compose_storage_settings_link);
            string.getClass();
            dthx.b(string, null, 0L, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 65022);
        }
        return fctx.a;
    }
}
