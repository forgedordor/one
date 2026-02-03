package kotlinx.coroutines;

import defpackage.fcyf;
import defpackage.fcyh;
import defpackage.fdjr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface CoroutineExceptionHandler extends fcyf {
    public static final fdjr c = fdjr.a;

    void handleException(fcyh fcyhVar, Throwable th);
}
