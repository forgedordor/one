package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hos {
    public static final hoq a(fcyh fcyhVar) {
        hoq hoqVar = (hoq) fcyhVar.get(hoq.e);
        if (hoqVar != null) {
            return hoqVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(fdap fdapVar, fcxy fcxyVar) {
        return a(fcxyVar.u()).a(new hor(fdapVar), fcxyVar);
    }

    public static final Object c(fdap fdapVar, fcxy fcxyVar) {
        return a(fcxyVar.u()).a(fdapVar, fcxyVar);
    }
}
