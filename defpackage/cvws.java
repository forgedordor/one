package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvws implements fdat {
    final /* synthetic */ String a;

    public cvws(String str) {
        this.a = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String str = this.a;
            Locale localeC = craf.c((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b));
            localeC.getClass();
            String upperCase = str.toUpperCase(localeC);
            upperCase.getClass();
            gyj.c(upperCase, null, glz.a(hmlVar).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 131066);
        }
        return fctx.a;
    }
}
