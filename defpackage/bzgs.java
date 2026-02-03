package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzgs extends fcyz implements fdat {
    final /* synthetic */ bzgt a;
    final /* synthetic */ String b;
    final /* synthetic */ fdae c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzgs(fcxy fcxyVar, bzgt bzgtVar, String str, fdae fdaeVar) {
        super(2, fcxyVar);
        this.a = bzgtVar;
        this.b = str;
        this.c = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzgs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final fdae fdaeVar = this.c;
        return this.a.a.c(this.b, new ejxr() { // from class: bzgv
            @Override // defpackage.ejxr
            public final /* synthetic */ Object get() {
                return fdaeVar.invoke();
            }
        });
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzgs bzgsVar = new bzgs(fcxyVar, this.a, this.b, this.c);
        bzgsVar.d = obj;
        return bzgsVar;
    }
}
