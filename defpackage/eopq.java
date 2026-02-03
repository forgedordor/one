package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eopq implements eooy {
    final /* synthetic */ eopr a;
    final /* synthetic */ eops b;

    public eopq(eops eopsVar, eopr eoprVar) {
        this.a = eoprVar;
        this.b = eopsVar;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        eops eopsVar = this.b;
        eopu eopuVar = new eopu(eopsVar.b);
        eopuVar.b = true;
        eopm eopmVar = new eopm();
        eopr eoprVar = this.a;
        eopm eopmVar2 = eopsVar.a;
        try {
            eopt eoptVar = eopmVar.a;
            eifn eifnVar = ((eihh) eoprVar).a;
            long j = eiid.a;
            eoptVar.getClass();
            eifi eifiVarB = eidc.b();
            eifn eifnVarH = eidc.h(eifiVarB, eifnVar);
            eopr eoprVar2 = ((eihh) eoprVar).b;
            try {
                eopy eopyVarA = ((eijo) eoprVar2).a.a(new eijr(eopuVar));
                eidc.h(eifiVarB, eifnVarH);
                eopyVarA.i(eopmVar2);
                return eopyVarA.c;
            } finally {
            }
        } finally {
            eopmVar2.b(eopmVar, eoqg.a);
            eopuVar.b = false;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
