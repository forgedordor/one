package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dngo extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdci b;
    final /* synthetic */ fdap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dngo(fdci fdciVar, fdap fdapVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdciVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            obj = this.b.a;
            if (obj == null) {
                fdap fdapVar = this.c;
                this.a = 1;
                obj = fdapVar.invoke(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                this.b.a = obj;
            }
        } else {
            this.b.a = obj;
        }
        return obj;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dngo(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
