package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdim {
    public static final Object a(fcyh fcyhVar, fdat fdatVar) {
        fdkw fdkwVarA;
        fcyh fcyhVarB;
        long jM;
        Thread threadCurrentThread = Thread.currentThread();
        fcya fcyaVar = (fcya) fcyhVar.get(fcya.k);
        if (fcyaVar == null) {
            ThreadLocal threadLocal = fdmw.a;
            fdkwVarA = fdmw.a();
            fcyhVarB = fdjn.b(fdlj.a, fcyhVar.plus(fdkwVarA));
        } else {
            if (fcyaVar instanceof fdkw) {
            }
            ThreadLocal threadLocal2 = fdmw.a;
            fdkwVarA = (fdkw) fdmw.a.get();
            fcyhVarB = fdjn.b(fdlj.a, fcyhVar);
        }
        fdij fdijVar = new fdij(fcyhVarB, threadCurrentThread, fdkwVarA);
        fdjz.a.a(fdatVar, fdijVar, fdijVar);
        fdkw fdkwVar = fdijVar.b;
        if (fdkwVar != null) {
            fdkwVar.p(false);
        }
        while (true) {
            if (fdkwVar != null) {
                try {
                    jM = fdkwVar.m();
                } catch (Throwable th) {
                    fdkw fdkwVar2 = fdijVar.b;
                    if (fdkwVar2 != null) {
                        fdkwVar2.n(false);
                    }
                    throw th;
                }
            } else {
                jM = Long.MAX_VALUE;
            }
            if (fdijVar.y()) {
                break;
            }
            LockSupport.parkNanos(fdijVar, jM);
            if (Thread.interrupted()) {
                fdijVar.O(new InterruptedException());
            }
        }
        fdkw fdkwVar3 = fdijVar.b;
        if (fdkwVar3 != null) {
            fdkwVar3.n(false);
        }
        Object objB = fdmf.b(fdijVar.E());
        fdjg fdjgVar = objB instanceof fdjg ? (fdjg) objB : null;
        if (fdjgVar == null) {
            return objB;
        }
        throw fdjgVar.b;
    }
}
