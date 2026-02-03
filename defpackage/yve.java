package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yve implements fdpl {
    final /* synthetic */ fdpl[] a;
    final /* synthetic */ auyl[] b;
    final /* synthetic */ ajlt c;
    final /* synthetic */ djtq d;
    final /* synthetic */ yvq e;
    final /* synthetic */ ytz f;

    public yve(fdpl[] fdplVarArr, auyl[] auylVarArr, ajlt ajltVar, djtq djtqVar, yvq yvqVar, ytz ytzVar) {
        this.a = fdplVarArr;
        this.b = auylVarArr;
        this.c = ajltVar;
        this.d = djtqVar;
        this.e = yvqVar;
        this.f = ytzVar;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        fdpl[] fdplVarArr = this.a;
        Object objA = fdwo.a(fdpmVar, fdplVarArr, new yvc(fdplVarArr), new yvd(null, this.b, this.c, this.d, this.e, this.f), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
