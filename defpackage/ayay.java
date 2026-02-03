package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayay extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ fdci b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayay(fcxy fcxyVar, aybe aybeVar, fdci fdciVar) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayay) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.k.t((Uri) this.b.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayay ayayVar = new ayay(fcxyVar, this.a, this.b);
        ayayVar.c = obj;
        return ayayVar;
    }
}
