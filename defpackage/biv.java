package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biv {
    public final int a;
    public final long b;
    public final Throwable c;

    public biv(long j, Throwable th) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (th instanceof bjg) {
            this.a = 2;
            this.c = th;
            return;
        }
        if (!(th instanceof bbq)) {
            this.a = 0;
            this.c = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.c = th;
        if (th instanceof azj) {
            this.a = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.a = 1;
        } else {
            this.a = 0;
        }
    }
}
