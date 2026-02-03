package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doef extends fcyz implements fdat {
    final /* synthetic */ doem a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doef(doem doemVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = doemVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doef) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        doem doemVar = this.a;
        epiv epivVar = doemVar.e;
        if (epivVar != null) {
            doemVar.q(epivVar);
        }
        ComposeView composeView = null;
        doemVar.e = null;
        ComposeView composeView2 = doemVar.d;
        if (composeView2 == null) {
            fdbq.c("contentComposeView");
        } else {
            composeView = composeView2;
        }
        composeView.a(new hxd(529805232, true, new doel(doemVar)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doef(this.a, fcxyVar);
    }
}
