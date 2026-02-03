package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjk extends fdbr implements fdap {
    final /* synthetic */ hox a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjk(hox hoxVar) {
        super(1);
        this.a = hoxVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Configuration configuration = new Configuration((Configuration) obj);
        hpt hptVar = AndroidCompositionLocals_androidKt.a;
        this.a.b(configuration);
        return fctx.a;
    }
}
