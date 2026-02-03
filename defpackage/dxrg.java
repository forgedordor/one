package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxrg extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxrh b;
    final /* synthetic */ dxvi c;
    final /* synthetic */ String d;
    final /* synthetic */ evgj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxrg(dxrh dxrhVar, dxvi dxviVar, String str, evgj evgjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxrhVar;
        this.c = dxviVar;
        this.d = str;
        this.e = evgjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxrg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxrh dxrhVar = this.b;
            dxvi dxviVar = this.c;
            String str = this.d;
            evgj evgjVar = this.e;
            URL urlK = dxrhVar.k("/v1/updateandfetchthreads");
            evgm evgmVar = evgm.a;
            evgmVar.getClass();
            this.a = 1;
            obj = dxrhVar.i(dxviVar, str, urlK, evgjVar, evgmVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return (dxft) obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxrg(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
