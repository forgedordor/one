package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijq {
    private final eops a;

    public eijq(eops eopsVar) {
        this.a = eopsVar;
    }

    public final eijs a(eijp eijpVar, Executor executor) {
        eijo eijoVar = new eijo(eijpVar);
        long j = eiid.a;
        eihh eihhVar = new eihh(eidc.e(), eijoVar);
        eops eopsVar = this.a;
        eopy eopyVar = new eopy(eork.c(ekeh.d(eopsVar.b).f(new ejvr() { // from class: eopp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eorz eorzVar = eopy.a;
                return ((eopy) obj).c;
            }
        }).g()).b(new eopq(eopsVar, eihhVar), executor));
        eopyVar.b.b(eopsVar.a, eoqg.a);
        return new eijs(eopyVar);
    }
}
