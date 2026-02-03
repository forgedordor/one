package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyp extends fcyz implements fdat {
    int a;
    final /* synthetic */ faj b;
    final /* synthetic */ hsf c;
    final /* synthetic */ key d;
    final /* synthetic */ fmx e;
    final /* synthetic */ kdy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyp(faj fajVar, hsf hsfVar, key keyVar, fmx fmxVar, kdy kdyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fajVar;
        this.c = hsfVar;
        this.d = keyVar;
        this.e = fmxVar;
        this.f = kdyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eyp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                final hsf hsfVar = this.c;
                fdpl fdplVarA = hsb.a(new fdae() { // from class: eyn
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Boolean.valueOf(ezh.g(hsfVar));
                    }
                });
                eyo eyoVar = new eyo(this.b, this.d, this.e, this.f);
                this.a = 1;
                if (fdplVarA.a(eyoVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            ezh.d(this.b);
            return fctx.a;
        } catch (Throwable th) {
            ezh.d(this.b);
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eyp(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
