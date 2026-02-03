package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlso extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlsp b;
    final /* synthetic */ WebView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlso(dlsp dlspVar, WebView webView, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlspVar;
        this.c = webView;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlso) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dlsp dlspVar = this.b;
            dlsn dlsnVar = new dlsn(this.c);
            this.a = 1;
            if (fdum.g((fdum) dlspVar.a, dlsnVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlso(this.b, this.c, fcxyVar);
    }
}
