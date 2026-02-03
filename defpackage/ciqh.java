package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciqh extends fcyz implements fdat {
    final /* synthetic */ ciqt a;
    final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciqh(ciqt ciqtVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ciqtVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciqh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekhx ekhxVarF = this.a.i.ai(this.b).f();
        ekhxVarF.getClass();
        return fcva.ao(ekhxVarF);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciqh(this.a, this.b, fcxyVar);
    }
}
