package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjo extends fdbr implements fdat {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ fdat b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjo(AndroidComposeView androidComposeView, fdat fdatVar, int i) {
        super(2);
        this.a = androidComposeView;
        this.b = fdatVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = hpy.a(this.c | 1);
        AndroidCompositionLocals_androidKt.a(this.a, this.b, (hml) obj, iA);
        return fctx.a;
    }
}
