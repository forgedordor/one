package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfr implements Runnable {
    private final qfu a;
    private final Intent b;
    private final int c;

    public qfr(qfu qfuVar, Intent intent, int i) {
        this.a = qfuVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c);
    }
}
