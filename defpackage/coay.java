package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coay {
    public static final Object a(cnyz cnyzVar) {
        if (cobt.e(cnyzVar)) {
            cnyn cnynVar = cnyzVar.c == 3 ? (cnyn) cnyzVar.d : cnyn.a;
            cnynVar.getClass();
            return cnynVar;
        }
        if (cobt.f(cnyzVar)) {
            cnyr cnyrVar = cnyzVar.c == 4 ? (cnyr) cnyzVar.d : cnyr.a;
            cnyrVar.getClass();
            return cnyrVar;
        }
        if (!cobt.g(cnyzVar)) {
            throw new IllegalArgumentException("Unrecognized sync type");
        }
        cnyt cnytVar = cnyzVar.c == 5 ? (cnyt) cnyzVar.d : cnyt.a;
        cnytVar.getClass();
        return cnytVar;
    }

    public static final void b(cqds cqdsVar, cobo coboVar) {
        cqdsVar.A("batchId", coboVar.c());
    }

    public static final void c(cqds cqdsVar, cnyz cnyzVar, String str) {
        evqs evqsVar = cnyzVar.e;
        evqsVar.getClass();
        cqdsVar.A(str, cobs.c(evqsVar));
    }
}
