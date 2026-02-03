package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctrw extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ctsy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctrw(ctsy ctsyVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = ctsyVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctrw ctrwVar = new ctrw(this.d, (fcxy) obj3);
        ctrwVar.b = (cudx) obj;
        ctrwVar.c = (ekgb) obj2;
        return ctrwVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        ?? r1 = this.c;
        ctsy ctsyVar = this.d;
        r1.getClass();
        this.b = null;
        this.a = 1;
        Object objK = ctsyVar.k((cudx) obj2, r1, this);
        return objK == fcylVar ? fcylVar : objK;
    }
}
