package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febo {
    public static final Object a(defn defnVar, fcxy fcxyVar) {
        return b(defnVar, null, fcxyVar);
    }

    public static final Object b(defn defnVar, deep deepVar, fcxy fcxyVar) throws Exception {
        if (defnVar.l()) {
            Exception excH = defnVar.h();
            if (excH != null) {
                throw excH;
            }
            if (((defv) defnVar).d) {
                throw new CancellationException(a.h(defnVar, "Task ", " was cancelled normally."));
            }
            return defnVar.i();
        }
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        defnVar.o(febj.a, new febm(fdiuVar));
        if (deepVar != null) {
            fdiuVar.d(new febn(deepVar));
        }
        Object objM = fdiuVar.m();
        if (objM == fcyl.a) {
            fcxyVar.getClass();
        }
        return objM;
    }
}
