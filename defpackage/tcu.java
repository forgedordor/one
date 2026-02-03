package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcu implements fdpl {
    final /* synthetic */ fdpl[] a;
    final /* synthetic */ tcx b;

    public tcu(fdpl[] fdplVarArr, tcx tcxVar) {
        this.a = fdplVarArr;
        this.b = tcxVar;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        fdpl[] fdplVarArr = this.a;
        Object objA = fdwo.a(fdpmVar, fdplVarArr, new tcs(fdplVarArr), new tct(null, this.b), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
