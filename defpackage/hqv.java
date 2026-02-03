package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqv extends fcxs implements CoroutineExceptionHandler {
    final /* synthetic */ ibk a;
    final /* synthetic */ hqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqv(fdjr fdjrVar, ibk ibkVar, hqw hqwVar) {
        super(fdjrVar);
        this.a = ibkVar;
        this.b = hqwVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(fcyh fcyhVar, Throwable th) throws Throwable {
        ibk ibkVar = this.a;
        hqw hqwVar = this.b;
        ibkVar.b(th, hqwVar);
        fcyh fcyhVar2 = hqwVar.c;
        fdjr fdjrVar = CoroutineExceptionHandler.c;
        fcyhVar2.get(fdjrVar);
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) hqwVar.b.get(fdjrVar);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(fcyhVar, th);
    }
}
