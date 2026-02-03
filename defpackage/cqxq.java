package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqxq extends fcyz implements fdat {
    final /* synthetic */ cqxw a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqxq(fcxy fcxyVar, cqxw cqxwVar, Uri uri) {
        super(2, fcxyVar);
        this.a = cqxwVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqxq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.b(this.b, new cqxs());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cqxq cqxqVar = new cqxq(fcxyVar, this.a, this.b);
        cqxqVar.c = obj;
        return cqxqVar;
    }
}
