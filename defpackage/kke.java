package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kke extends fdbr implements fdap {
    final /* synthetic */ kkt a;
    final /* synthetic */ jcr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kke(kkt kktVar, jcr jcrVar) {
        super(1);
        this.a = kktVar;
        this.b = jcrVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jfh jfhVar = (jfh) obj;
        AndroidComposeView androidComposeView = jfhVar instanceof AndroidComposeView ? (AndroidComposeView) jfhVar : null;
        if (androidComposeView != null) {
            kkt kktVar = this.a;
            jcr jcrVar = this.b;
            androidComposeView.F().a.put(kktVar, jcrVar);
            androidComposeView.F().addView(kktVar);
            androidComposeView.F().b.put(jcrVar, kktVar);
            kktVar.setImportantForAccessibility(1);
            ley.p(kktVar, new jhe(androidComposeView, jcrVar, androidComposeView));
        }
        kkt kktVar2 = this.a;
        View view = kktVar2.c;
        if (view.getParent() != kktVar2) {
            kktVar2.addView(view);
        }
        return fctx.a;
    }
}
