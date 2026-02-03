package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbu {
    private static final CoroutineExceptionHandler c = new kbt(CoroutineExceptionHandler.c);
    public final kbb a;
    public fdjx b;

    public kbu() {
        this(null, 3);
    }

    public /* synthetic */ kbu(kbb kbbVar, int i) {
        kbbVar = (i & 1) != 0 ? new kbb() : kbbVar;
        fcyi fcyiVar = fcyi.a;
        this.a = kbbVar;
        fcyh fcyhVarPlus = c.plus(kgh.a).plus(fcyiVar);
        fcyiVar.get(fdlr.c);
        this.b = fdjy.b(fcyhVarPlus.plus(new fdmt(null)));
    }
}
