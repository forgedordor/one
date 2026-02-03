package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckco extends fcyz implements fdat {
    final /* synthetic */ ckcp a;
    final /* synthetic */ ckcw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckco(fcxy fcxyVar, ckcp ckcpVar, ckcw ckcwVar) {
        super(2, fcxyVar);
        this.a = ckcpVar;
        this.b = ckcwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckco) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        enfz enfzVar = (enfz) enga.a.createBuilder();
        enfzVar.getClass();
        ckcw ckcwVar = this.b;
        enug.c(ckcwVar.b != null, enfzVar);
        enug.b(evxd.a(ckcwVar.c), enfzVar);
        engb engbVar = (engb) engc.a.createBuilder();
        engbVar.getClass();
        enuh.b(ckcwVar.d != null, engbVar);
        enug.d(enuh.a(engbVar), enfzVar);
        aiqx.b(this.a.b, ckcwVar.a, 4, null, null, null, null, null, enug.a(enfzVar), 124);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckco ckcoVar = new ckco(fcxyVar, this.a, this.b);
        ckcoVar.c = obj;
        return ckcoVar;
    }
}
