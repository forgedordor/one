package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugw extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ dqwl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugw(fdat fdatVar, dqwl dqwlVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdatVar;
        this.c = dqwlVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdat fdatVar = this.b;
        dqwl dqwlVar = this.c;
        this.a = 1;
        Object objA = fdatVar.a(dqwlVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ugw(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
