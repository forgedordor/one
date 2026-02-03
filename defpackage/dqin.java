package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqin implements fdpl {
    final /* synthetic */ fdpl[] a;
    final /* synthetic */ dqir b;
    final /* synthetic */ dqgm c;
    final /* synthetic */ dqgj d;

    public dqin(fdpl[] fdplVarArr, dqir dqirVar, dqgm dqgmVar, dqgj dqgjVar) {
        this.a = fdplVarArr;
        this.b = dqirVar;
        this.c = dqgmVar;
        this.d = dqgjVar;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        fdpl[] fdplVarArr = this.a;
        Object objA = fdwo.a(fdpmVar, fdplVarArr, new dqil(fdplVarArr), new dqim(null, this.b, this.c, this.d), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
