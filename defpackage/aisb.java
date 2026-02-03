package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aisb extends fcyz implements fdat {
    int a;
    final /* synthetic */ aisc b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisb(aisc aiscVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiscVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarA = this.b.b.a(new IllegalArgumentException("BugleComposeRow2 ComposeNavigationEvent duration exceeded INT_MAX: " + this.c));
            this.a = 1;
            if (fdxs.c(eijuVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aisb(this.b, this.c, fcxyVar);
    }
}
