package defpackage;

import android.os.Bundle;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrg extends dcrj {
    public Duration a;
    public Duration b;
    public boolean c;
    public Bundle d;
    public byte e;

    @Override // defpackage.dcrj
    public final void a(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null initTimeout");
        }
        this.a = duration;
    }

    @Override // defpackage.dcrj
    public final void b(boolean z) {
        this.c = z;
        this.e = (byte) 1;
    }

    @Override // defpackage.dcrj
    public final void c(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null snapshotTimeout");
        }
        this.b = duration;
    }
}
