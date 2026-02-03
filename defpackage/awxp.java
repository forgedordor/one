package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxp extends fcyz implements fdat {
    int a;
    final /* synthetic */ awxu b;
    final /* synthetic */ aubq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awxp(awxu awxuVar, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awxuVar;
        this.c = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awxp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        aubq aubqVar = this.c;
        this.a = 1;
        Object objA = awxuVar.a.a(aubqVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awxp(this.b, this.c, fcxyVar);
    }
}
