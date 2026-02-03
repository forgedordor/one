package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awni extends fcyz implements fdat {
    int a;
    final /* synthetic */ awnj b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awni(awnj awnjVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awnjVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awni) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awnj awnjVar = this.b;
        String str = this.c;
        this.a = 1;
        Object objM = awnjVar.a.m(str, this);
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awni(this.b, this.c, fcxyVar);
    }
}
