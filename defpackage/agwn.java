package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agwn implements fdat {
    final /* synthetic */ agwq a;

    public agwn(agwq agwqVar) {
        this.a = agwqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            Context context = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
            hnj.a(dldw.a.c(new ije(ijg.c(context.getColor(R.color.google_default_color_background)))), hxe.d(117602897, new agwm(this.a, context), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
