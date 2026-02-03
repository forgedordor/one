package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crlh extends fcyz implements fdat {
    int a;
    final /* synthetic */ crlj b;
    final /* synthetic */ fdap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crlh(crlj crljVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crljVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crlh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        crlj crljVar = this.b;
        fdap fdapVar = this.c;
        this.a = 1;
        if (crljVar.f(fdapVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crlh(this.b, this.c, fcxyVar);
    }
}
