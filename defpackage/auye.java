package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auye extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdvc b;
    final /* synthetic */ fduf c;
    final /* synthetic */ fdap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auye(fdvc fdvcVar, fduf fdufVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdvcVar;
        this.c = fdufVar;
        this.d = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auye) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdvc fdvcVar = this.b;
            auyd auydVar = new auyd(this.c, this.d);
            this.a = 1;
            if (fdvcVar.a(auydVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auye(this.b, this.c, this.d, fcxyVar);
    }
}
