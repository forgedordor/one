package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awiy extends fcyz implements fdat {
    final /* synthetic */ awja a;
    final /* synthetic */ String b;
    final /* synthetic */ awiz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awiy(fcxy fcxyVar, awja awjaVar, String str, awiz awizVar) {
        super(2, fcxyVar);
        this.a = awjaVar;
        this.b = str;
        this.c = awizVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awiy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        awja awjaVar = this.a;
        if (awjaVar == awja.b) {
            String str = this.b;
            cqce cqceVar = cmvy.a;
            if (!alwh.i(str)) {
                throw new IllegalArgumentException("BOT address is not an email address.");
            }
        }
        if (awjaVar != awja.a || ((crmx) this.c.d.b()).I(this.b)) {
            return fctx.a;
        }
        throw new IllegalArgumentException("Phone address is not normalized");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awiy awiyVar = new awiy(fcxyVar, this.a, this.b, this.c);
        awiyVar.d = obj;
        return awiyVar;
    }
}
