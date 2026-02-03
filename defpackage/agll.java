package defpackage;

import j$.time.MonthDay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agll extends fcyz implements fdat {
    final /* synthetic */ MonthDay a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agll(fcxy fcxyVar, MonthDay monthDay) {
        super(2, fcxyVar);
        this.a = monthDay;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agll) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bngu bnguVarA = bngz.a();
        bnguVarA.A("getBirthdaysByDateQuery");
        bnguVarA.c(new agln(this.a));
        return bnguVarA.b();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agll agllVar = new agll(fcxyVar, this.a);
        agllVar.b = obj;
        return agllVar;
    }
}
