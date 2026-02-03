package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnf extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnf(fdap fdapVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdapVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdap fdapVar = this.b;
        this.a = 1;
        Object objC = hos.c(fdapVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new jnf(this.b, (fcxy) obj).b(fctx.a);
    }
}
