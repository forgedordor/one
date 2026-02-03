package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqxt extends fcyz implements fdat {
    final /* synthetic */ cqxw a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqxt(fcxy fcxyVar, cqxw cqxwVar, Uri uri) {
        super(2, fcxyVar);
        this.a = cqxwVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqxt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.b(this.b, new cqxu());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cqxt cqxtVar = new cqxt(fcxyVar, this.a, this.b);
        cqxtVar.c = obj;
        return cqxtVar;
    }
}
