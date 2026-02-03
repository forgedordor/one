package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carm extends fcyz implements fdat {
    final /* synthetic */ carq a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public carm(fcxy fcxyVar, carq carqVar, String str) {
        super(2, fcxyVar);
        this.a = carqVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((carm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        carq carqVar = this.a;
        return cqbz.c(carqVar.c, carqVar.d, "restore_timing_stats", this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        carm carmVar = new carm(fcxyVar, this.a, this.b);
        carmVar.c = obj;
        return carmVar;
    }
}
