package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avag extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdpm c;
    final /* synthetic */ fdce d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avag(fdat fdatVar, fdpm fdpmVar, fdce fdceVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdatVar;
        this.c = fdpmVar;
        this.d = fdceVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdat fdatVar = this.b;
            fdpm fdpmVar = this.c;
            this.a = 1;
            if (fdatVar.a(fdpmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.d.a = true;
        return true;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new avag(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
