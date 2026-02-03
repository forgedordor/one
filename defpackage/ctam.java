package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctam {
    public static final cczv a = cdag.h(cdag.b, "enable_wear_clearcut_rpc_logging", true);
    public static final enly b = enly.SUCCESS;
    public static final enly c = enly.GMS_ERROR;
    private final fcsu d;
    private final Optional e;

    public ctam(fcsu fcsuVar, Optional optional) {
        fcsuVar.getClass();
        this.d = fcsuVar;
        this.e = optional;
    }

    public final enly a(Throwable th) {
        return th instanceof dcff ? ctah.a(((dcff) th).a()) : th instanceof TimeoutException ? enly.TASK_TIMEOUT : enly.CLIENT_FAILURE;
    }

    public final boolean b() {
        Object objE = a.e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r8, java.lang.String r9, java.lang.String r10, j$.time.Duration r11, defpackage.enly r12) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctam.c(int, java.lang.String, java.lang.String, j$.time.Duration, enly):void");
    }
}
