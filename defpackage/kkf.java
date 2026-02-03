package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkf extends fdbr implements fdap {
    final /* synthetic */ kkt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkf(kkt kktVar) {
        super(1);
        this.a = kktVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jfh jfhVar = (jfh) obj;
        AndroidComposeView androidComposeView = jfhVar instanceof AndroidComposeView ? (AndroidComposeView) jfhVar : null;
        if (androidComposeView != null) {
            kkt kktVar = this.a;
            androidComposeView.F().removeViewInLayout(kktVar);
            HashMap map = androidComposeView.F().b;
            Object objRemove = androidComposeView.F().a.remove(kktVar);
            fdcm.g(map);
            map.remove(objRemove);
            kktVar.setImportantForAccessibility(0);
        }
        this.a.removeAllViewsInLayout();
        return fctx.a;
    }
}
