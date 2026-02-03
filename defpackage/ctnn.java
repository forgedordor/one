package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnn {
    public final fdvc a;
    private final fdjx b;

    /* JADX WARN: Type inference failed for: r5v19, types: [ctnw, java.lang.Object] */
    public ctnn(fdjx fdjxVar, ajoy ajoyVar, ctrc ctrcVar, cton ctonVar, Optional optional, cudy cudyVar, fcsu fcsuVar, ctpr ctprVar) {
        fdjxVar.getClass();
        ajoyVar.getClass();
        ctrcVar.getClass();
        ctonVar.getClass();
        cudyVar.getClass();
        fcsuVar.getClass();
        ctprVar.getClass();
        this.b = fdjxVar;
        fdpl[] fdplVarArr = new fdpl[7];
        fdplVarArr[0] = new fdui(new ctng(ajoyVar, null));
        fdplVarArr[1] = new ctnm(ctrcVar.a());
        fdplVarArr[2] = ctonVar.a();
        optional.isPresent();
        fdplVarArr[3] = ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() ? optional.get().a() : fdvf.a(null);
        fdplVarArr[4] = ((cual) fcsuVar.b()).a();
        fdplVarArr[5] = cudyVar.a();
        fdplVarArr[6] = ctprVar.a();
        ctnj ctnjVar = new ctnj(fdplVarArr, this);
        fdus fdusVarA = fdur.a(0L, 3);
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        this.a = fdtg.b(ctnjVar, fdjxVar, fdusVarA, new ctno(ekgbVar));
    }
}
