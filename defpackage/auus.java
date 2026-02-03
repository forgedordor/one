package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auus {
    /* JADX WARN: Multi-variable type inference failed */
    public static final fctx a(fdlr fdlrVar, fdjc fdjcVar, final eopw eopwVar) throws Throwable {
        Object objA;
        fdlrVar.hK(new fdap() { // from class: auuo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                eopwVar.b();
                return fctx.a;
            }
        });
        try {
            objA = eopwVar.a();
        } catch (CancellationException e) {
            fdjcVar.a(e);
        } catch (ExecutionException e2) {
            e = e2;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            fdjcVar.a(e);
        }
        if (objA == null) {
            throw new IllegalArgumentException("Null value is not supported");
        }
        ((fdme) fdjcVar).R(objA);
        return fctx.a;
    }

    public static final fdkf b(eopy eopyVar, fdjx fdjxVar) {
        fdjxVar.getClass();
        final eijs eijsVar = new eijs(eopyVar);
        final fdlr fdlrVarC = fdlw.c(fdjxVar.hE());
        final fdjd fdjdVar = new fdjd();
        fdlrVarC.hK(new fdap() { // from class: auup
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                eijsVar.a.n();
                fdjdVar.t(null);
                return fctx.a;
            }
        });
        final fdap fdapVar = new fdap() { // from class: auuq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return auus.a(fdlrVarC, fdjdVar, (eopw) obj);
            }
        };
        final eopx eopxVar = new eopx() { // from class: auur
            @Override // defpackage.eopx
            public final void a(eopw eopwVar) {
                fdapVar.invoke(eopwVar);
            }
        };
        eopy eopyVar2 = eijsVar.a;
        eoqg eoqgVar = eoqg.a;
        long j = eiid.a;
        final eifn eifnVarE = eidc.e();
        eopyVar2.m(new eopx() { // from class: eihj
            @Override // defpackage.eopx
            public final void a(eopw eopwVar) {
                long j2 = eiid.a;
                eifn eifnVarH = eidc.h(eidc.b(), eifnVarE);
                try {
                    eopxVar.a(eopwVar);
                } finally {
                }
            }
        }, eoqgVar);
        return fdjdVar;
    }
}
