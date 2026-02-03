package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctde extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctdg b;
    final /* synthetic */ Instant c;
    final /* synthetic */ ekhx d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctde(fcxy fcxyVar, ctdg ctdgVar, Instant instant, ekhx ekhxVar) {
        super(2, fcxyVar);
        this.b = ctdgVar;
        this.c = instant;
        this.d = ekhxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctde) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        ctdf ctdfVar = new ctdf(this.c, this.d);
        this.a = 1;
        Object objD = ctdgVar.a.d(ctdfVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctde ctdeVar = new ctde(fcxyVar, this.b, this.c, this.d);
        ctdeVar.e = obj;
        return ctdeVar;
    }
}
