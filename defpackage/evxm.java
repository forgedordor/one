package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evxm {
    public static final evxh a(evxn evxnVar) {
        evxl evxlVar = (evxl) evxnVar;
        if ((evxlVar.b & 1) == 0) {
            return null;
        }
        evxh evxhVar = evxlVar.c;
        return evxhVar == null ? evxh.a : evxhVar;
    }

    public static final evxp b(evxn evxnVar) {
        evxl evxlVar = (evxl) evxnVar;
        if ((evxlVar.b & 2) == 0) {
            return null;
        }
        evxp evxpVar = evxlVar.d;
        return evxpVar == null ? evxp.a : evxpVar;
    }
}
