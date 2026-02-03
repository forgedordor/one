package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avak extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdau b;
    final /* synthetic */ fdpm c;
    final /* synthetic */ fdce d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avak(fdau fdauVar, fdpm fdpmVar, fdce fdceVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdauVar;
        this.c = fdpmVar;
        this.d = fdceVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdau fdauVar = this.b;
            fdpm fdpmVar = this.c;
            this.a = 1;
            if (fdauVar.a(fdpmVar, null, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.d.a = true;
        return true;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new avak(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
