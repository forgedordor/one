package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klk extends fdbr implements fdap {
    final /* synthetic */ klm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klk(klm klmVar) {
        super(1);
        this.a = klmVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        klm klmVar = this.a;
        ifn ifnVar = (ifn) obj;
        View viewB = klj.b(klmVar);
        if (!viewB.isFocused() && !viewB.hasFocus()) {
            if (!ifw.e(viewB, ifw.d(ifnVar.a), klj.a(((AndroidComposeView) jbg.f(klmVar)).i, jbh.a(klmVar), viewB))) {
                ifnVar.a();
            }
        }
        return fctx.a;
    }
}
