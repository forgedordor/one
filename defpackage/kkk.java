package defpackage;

import android.graphics.Canvas;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkk extends fdbr implements fdap {
    final /* synthetic */ kkt a;
    final /* synthetic */ jcr b;
    final /* synthetic */ kkt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkk(kkt kktVar, jcr jcrVar, kkt kktVar2) {
        super(1);
        this.a = kktVar;
        this.b = jcrVar;
        this.c = kktVar2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ijb ijbVarB = ((imz) obj).t().b();
        kkt kktVar = this.a;
        if (kktVar.c.getVisibility() != 8) {
            jcr jcrVar = this.b;
            kktVar.v = true;
            jfh jfhVar = jcrVar.k;
            if (true != (jfhVar instanceof AndroidComposeView)) {
                jfhVar = null;
            }
            if (jfhVar != null) {
                kkt kktVar2 = this.c;
                Canvas canvasA = iid.a(ijbVarB);
                ((AndroidComposeView) jfhVar).F();
                kktVar2.draw(canvasA);
            }
            kktVar.v = false;
        }
        return fctx.a;
    }
}
