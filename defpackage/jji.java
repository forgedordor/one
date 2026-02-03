package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jji extends fdbr implements fdap {
    public static final jji a = new jji();

    public jji() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        hxi hxiVar = (hxi) obj;
        hnl.b(hxiVar, AndroidCompositionLocals_androidKt.a);
        return ((Context) hnl.b(hxiVar, AndroidCompositionLocals_androidKt.b)).getResources();
    }
}
