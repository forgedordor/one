package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicn extends fcyz implements fdat {
    int a;
    final /* synthetic */ aico b;
    final /* synthetic */ aicv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicn(aico aicoVar, aicv aicvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aicoVar;
        this.c = aicvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aicn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmfo cmfoVar = (cmfo) this.b.b.a();
        final aicv aicvVar = this.c;
        fdap fdapVar = new fdap() { // from class: aicm
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return aicvVar;
            }
        };
        this.a = 1;
        Object objD = cmfoVar.d(fdapVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aicn(this.b, this.c, fcxyVar);
    }
}
