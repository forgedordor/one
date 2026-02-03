package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlkg implements fdat {
    public static final dlkg a = new dlkg();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        ((Number) obj2).intValue();
        hmlVar.v(-422724762);
        Object systemService = ((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b)).getSystemService("activity");
        systemService.getClass();
        dljn dljnVarC = dljs.c(((ActivityManager) systemService).isLowRamDevice());
        hmlVar.o();
        return dljnVarC;
    }
}
