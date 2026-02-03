package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dqta {
    protected final dqtd a;
    public final dqyj b;

    protected dqta(dqtd dqtdVar, dqyj dqyjVar) {
        this.b = dqyjVar;
        this.a = dqtdVar;
    }

    public final int b() {
        ArrayList arrayList = new ArrayList();
        dqtd dqtdVar = this.a;
        dqor dqorVar = (dqor) dqtdVar;
        String str = dqorVar.a;
        dqsy dqsyVarE = dqru.e(dqorVar.d);
        dqur dqurVarA = dqua.a();
        dqyj dqyjVar = this.b;
        dqtz dqtzVarA = dqurVarA.a(dqsyVarE, str, dqyjVar);
        int iX = dqsyVarE.X(str, dqyjVar.b(dqxp.b(), arrayList), (String[]) arrayList.toArray(new String[0]), dqtdVar);
        dqtzVarA.a(iX > 0);
        return iX;
    }
}
