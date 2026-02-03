package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzh {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        Object objA;
        Object objA2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        simpleName.getClass();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objA = Class.forName("fcyt").getCanonicalName();
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        if (fctk.c(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) objA;
        try {
            objA2 = Class.forName("fdzh").getCanonicalName();
        } catch (Throwable th2) {
            objA2 = fctl.a(th2);
        }
        if (fctk.c(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) objA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable a(java.lang.Throwable r10, defpackage.fcyw r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdzh.a(java.lang.Throwable, fcyw):java.lang.Throwable");
    }

    public static final Throwable b(Throwable th) {
        Throwable thA;
        if (!fdkb.b || (thA = fdyn.a(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = thA.getStackTrace();
        int length = stackTrace.length;
        int i = length - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                if (fdbq.f(c, stackTrace[i].getClassName())) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
            i = -1;
        } else {
            i = -1;
        }
        int iE = e(stackTrace, b);
        int i3 = 0;
        int i4 = (length - i) - (iE == -1 ? 0 : length - iE);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? a : stackTrace[((i + 1) + i3) - 1];
            i3++;
        }
        thA.setStackTrace(stackTraceElementArr);
        return thA;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (fdbq.f(cause.getClass(), th.getClass())) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (d(stackTraceElement)) {
                        return cause;
                    }
                }
            }
        }
        return th;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        return fdgn.t(stackTraceElement.getClassName(), "_COROUTINE");
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (fdbq.f(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
