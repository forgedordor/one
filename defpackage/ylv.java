package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylv implements fdpl {
    final /* synthetic */ fdpl[] a;
    final /* synthetic */ auyl[] b;
    final /* synthetic */ yko c;
    final /* synthetic */ ylw d;
    final /* synthetic */ yki e;

    public ylv(fdpl[] fdplVarArr, auyl[] auylVarArr, yko ykoVar, ylw ylwVar, yki ykiVar) {
        this.a = fdplVarArr;
        this.b = auylVarArr;
        this.c = ykoVar;
        this.d = ylwVar;
        this.e = ykiVar;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        fdpl[] fdplVarArr = this.a;
        Object objA = fdwo.a(fdpmVar, fdplVarArr, new ylt(fdplVarArr), new ylu(null, this.b, this.c, this.d, this.e), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
