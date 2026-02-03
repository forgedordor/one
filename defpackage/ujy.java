package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujy extends fcyz implements fdat {
    final /* synthetic */ doig a;
    final /* synthetic */ ujz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujy(fcxy fcxyVar, doig doigVar, ujz ujzVar) {
        super(2, fcxyVar);
        this.a = doigVar;
        this.b = ujzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ujy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return bxlf.d(le.d(this.a.a()), this.b.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ujy ujyVar = new ujy(fcxyVar, this.a, this.b);
        ujyVar.c = obj;
        return ujyVar;
    }
}
