package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdjs {
    public static final Throwable a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        fcsw.a(runtimeException, th);
        return runtimeException;
    }

    public static final void b(fcyh fcyhVar, Throwable th) {
        if (th instanceof fdkl) {
            th = ((fdkl) th).a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fcyhVar.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fcyhVar, th);
            } else {
                fdyb.a(fcyhVar, th);
            }
        } catch (Throwable th2) {
            fdyb.a(fcyhVar, a(th, th2));
        }
    }
}
