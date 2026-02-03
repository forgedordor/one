package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awnh extends fcyz implements fdat {
    int a;
    final /* synthetic */ awnj b;
    final /* synthetic */ awmn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awnh(awnj awnjVar, awmn awmnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awnjVar;
        this.c = awmnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awnh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        awmn awmnVar = this.c;
        this.a = 1;
        Object objD = awnjVar.a.d(awmnVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awnh(this.b, this.c, fcxyVar);
    }
}
