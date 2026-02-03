package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atft extends fcyz implements fdat {
    final /* synthetic */ atfx a;
    final /* synthetic */ athh b;
    final /* synthetic */ atha c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atft(fcxy fcxyVar, atfx atfxVar, athh athhVar, atha athaVar) {
        super(2, fcxyVar);
        this.a = atfxVar;
        this.b = athhVar;
        this.c = athaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atft) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        atjp atjpVar = this.c.e;
        this.a.j.a(this.b, new Long(atjpVar.c), atjpVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atft atftVar = new atft(fcxyVar, this.a, this.b, this.c);
        atftVar.d = obj;
        return atftVar;
    }
}
