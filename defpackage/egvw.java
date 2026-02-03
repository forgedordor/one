package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egvw extends fcxs implements CoroutineExceptionHandler {
    private final CoroutineExceptionHandler a;
    private final CoroutineExceptionHandler b;
    private final eygg d;

    public egvw(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineExceptionHandler coroutineExceptionHandler2, eygg eyggVar) {
        super(CoroutineExceptionHandler.c);
        this.a = coroutineExceptionHandler;
        this.b = coroutineExceptionHandler2;
        this.d = eyggVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(fcyh fcyhVar, Throwable th) {
        fcyhVar.getClass();
        th.getClass();
        if (((Boolean) this.d.b()).booleanValue()) {
            this.b.handleException(fcyhVar, th);
        } else {
            this.a.handleException(fcyhVar, th);
        }
    }
}
