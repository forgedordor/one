package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awio extends fcyz implements fdat {
    int a;
    final /* synthetic */ awiz b;
    final /* synthetic */ aubq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awio(awiz awizVar, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awizVar;
        this.c = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awio) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awiz awizVar = this.b;
        aubq aubqVar = this.c;
        this.a = 1;
        Object objC = awizVar.c(aubqVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awio(this.b, this.c, fcxyVar);
    }
}
