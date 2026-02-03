package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xin extends fcyz implements fdat {
    final /* synthetic */ xir a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xin(fcxy fcxyVar, xir xirVar, Uri uri) {
        super(2, fcxyVar);
        this.a = xirVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xin) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        xir xirVar = this.a;
        return Boolean.valueOf(xirVar.d.g(xirVar.c, this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xin xinVar = new xin(fcxyVar, this.a, this.b);
        xinVar.c = obj;
        return xinVar;
    }
}
