package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxq extends fcyz implements fdat {
    int a;
    final /* synthetic */ awxu b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awxq(awxu awxuVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awxuVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awxq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awxu awxuVar = this.b;
        int i2 = this.c;
        this.a = 1;
        Object objB = awxuVar.a.b(i2, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awxq(this.b, this.c, fcxyVar);
    }
}
