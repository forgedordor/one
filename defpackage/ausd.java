package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ausd extends fcyz implements fdat {
    int a;
    final /* synthetic */ ause b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ausd(ause auseVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = auseVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ausd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ause auseVar = this.b;
            boolean z = this.c;
            this.a = 1;
            if (auseVar.a(z, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ausd(this.b, this.c, fcxyVar);
    }
}
