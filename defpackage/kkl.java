package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkl extends fdbr implements fdap {
    final /* synthetic */ kkt a;
    final /* synthetic */ jcr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkl(kkt kktVar, jcr jcrVar) {
        super(1);
        this.a = kktVar;
        this.b = jcrVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WindowInsets windowInsetsE;
        kkt kktVar = this.a;
        kkv.d(kktVar, this.b);
        kktVar.d.B();
        View view = kktVar.c;
        int[] iArr = kktVar.o;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationOnScreen(iArr);
        long j = kktVar.p;
        long jG = ((ivy) obj).g();
        kktVar.p = jG;
        lgt lgtVar = kktVar.q;
        if (lgtVar != null && ((i != iArr[0] || i2 != iArr[1] || !kjg.e(j, jG)) && (windowInsetsE = kktVar.j(lgtVar).e()) != null)) {
            view.dispatchApplyWindowInsets(windowInsetsE);
        }
        return fctx.a;
    }
}
