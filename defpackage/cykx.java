package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cykx extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ cyfv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cykx(fdat fdatVar, cyfv cyfvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = cyfvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cykx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdat fdatVar = this.b;
            cyfv cyfvVar = this.c;
            this.a = 1;
            if (fdatVar.a(cyfvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cykx(this.b, this.c, fcxyVar);
    }
}
