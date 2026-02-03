package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfo {
    public final egsl a;
    public final boolean b;

    public egfo() {
        this(false, 3);
    }

    public /* synthetic */ egfo(boolean z, int i) {
        egsa egsaVar = (i & 1) != 0 ? new egsa(5L, TimeUnit.MINUTES) : null;
        boolean z2 = (i & 2) == 0;
        egsaVar.getClass();
        this.a = egsaVar;
        this.b = z | (!z2);
    }
}
