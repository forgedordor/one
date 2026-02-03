package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsm {
    public static final hpt a = new hno(new fdap() { // from class: dsk
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            hpt hptVar = dsm.a;
            return !((Context) hnl.b((hxi) obj, AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback") ? dsi.b : dsm.b;
        }
    });
    public static final dsj b = new dsl();
}
