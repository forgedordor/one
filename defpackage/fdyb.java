package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyb {
    public static final void a(fcyh fcyhVar, Throwable th) {
        Iterator it = fdya.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(fcyhVar, th);
            } catch (fdyg unused) {
                return;
            } catch (Throwable th2) {
                fdya.a(fdjs.a(th, th2));
            }
        }
        try {
            fcsw.a(th, new fdyd(fcyhVar));
        } catch (Throwable unused2) {
        }
        fdya.a(th);
    }
}
