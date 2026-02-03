package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cays extends fcyz implements fdat {
    int a;
    final /* synthetic */ cayt b;
    final /* synthetic */ evuh c;
    final /* synthetic */ cayy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cays(cayt caytVar, evuh evuhVar, cayy cayyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = caytVar;
        this.c = evuhVar;
        this.d = cayyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cays) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cayt caytVar = this.b;
        evuh evuhVar = this.c;
        cayy cayyVar = this.d;
        this.a = 1;
        Object objA = caytVar.b.a(evuhVar, cayyVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cays(this.b, this.c, this.d, fcxyVar);
    }
}
