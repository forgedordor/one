package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfe extends fcyz implements fdat {
    final /* synthetic */ brdp a;
    final /* synthetic */ Instant b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfe(fcxy fcxyVar, brdp brdpVar, Instant instant) {
        super(2, fcxyVar);
        this.a = brdpVar;
        this.b = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tfe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brna brnaVarA = brnk.a();
        brnaVarA.A("+birthdaySuggestions");
        brnaVarA.d(new tfg(this.a, this.b));
        return brnaVarA.b().z();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tfe tfeVar = new tfe(fcxyVar, this.a, this.b);
        tfeVar.c = obj;
        return tfeVar;
    }
}
