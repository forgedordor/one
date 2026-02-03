package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctdc extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctdg b;
    final /* synthetic */ Instant c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctdc(fcxy fcxyVar, ctdg ctdgVar, Instant instant) {
        super(2, fcxyVar);
        this.b = ctdgVar;
        this.c = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctdc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ctdg ctdgVar = this.b;
        ctdd ctddVar = new ctdd(this.c);
        this.a = 1;
        Object objD = ctdgVar.a.d(ctddVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctdc ctdcVar = new ctdc(fcxyVar, this.b, this.c);
        ctdcVar.d = obj;
        return ctdcVar;
    }
}
