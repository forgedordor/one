package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlsf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlsp b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlsf(dlsp dlspVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlspVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlsf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dlsp dlspVar = this.b;
            WebView webViewA = dlsk.a(this.c);
            if (webViewA == null) {
                return fctx.a;
            }
            this.a = 1;
            if (dlspVar.a(webViewA, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlsf(this.b, this.c, fcxyVar);
    }
}
