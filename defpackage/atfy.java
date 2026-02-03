package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atfy extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ atgg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atfy(atgg atggVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = atggVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        atfy atfyVar = new atfy(this.c, (fcxy) obj3);
        atfyVar.d = (atgj) obj;
        atfyVar.b = (cayy) obj2;
        return atfyVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [cayy, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.d;
        ?? r1 = this.b;
        atgg atggVar = this.c;
        obj2.getClass();
        this.d = null;
        this.a = 1;
        Object objD = atggVar.d((atgj) obj2, r1, this);
        return objD == fcylVar ? fcylVar : objD;
    }
}
