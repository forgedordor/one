package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibc extends fcyz implements fdat {
    int a;
    final /* synthetic */ aibh b;
    final /* synthetic */ aiau c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibc(aibh aibhVar, aiau aiauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aibhVar;
        this.c = aiauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aibh aibhVar = this.b;
            aiau aiauVar = this.c;
            this.a = 1;
            if (aibhVar.k(aiauVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aibc(this.b, this.c, fcxyVar);
    }
}
