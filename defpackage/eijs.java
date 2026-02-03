package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijs {
    public final eopy a;

    public eijs(eopy eopyVar) {
        this.a = eopyVar;
    }

    public static eijq a(eijs... eijsVarArr) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (eijs eijsVar : eijsVarArr) {
            ekfwVar.h(eijsVar.a);
        }
        ekgb ekgbVarG = ekfwVar.g();
        eorz eorzVar = eopy.a;
        return new eijq(new eops(ekgbVarG));
    }

    public static eijs c(ListenableFuture listenableFuture) {
        return new eijs(new eopy(listenableFuture));
    }

    public static eijs d(eopn eopnVar, Executor executor) {
        return new eijs(eopy.c(eiid.f(eopnVar), executor));
    }

    public static eijs e(final eopk eopkVar, Executor executor) {
        long j = eiid.a;
        final eifn eifnVarE = eidc.e();
        return new eijs(eopy.d(new eopk() { // from class: eihm
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                long j2 = eiid.a;
                eoptVar.getClass();
                eifn eifnVarH = eidc.h(eidc.b(), eifnVarE);
                try {
                    return eopkVar.a(eoptVar);
                } finally {
                }
            }
        }, executor));
    }

    public final eijs b(Class cls, eopo eopoVar, Executor executor) {
        return new eijs(this.a.a(cls, eiid.g(eopoVar), executor));
    }

    public final eijs f(eopo eopoVar, Executor executor) {
        return new eijs(this.a.e(eiid.g(eopoVar), executor));
    }

    public final eijs g(eopl eoplVar, Executor executor) {
        return new eijs(this.a.f(eiid.e(eoplVar), executor));
    }

    public final eiju h() {
        return eiju.g(this.a.g());
    }

    public final String toString() {
        return "PropagatedClosingFuture[" + this.a.toString() + "]";
    }
}
