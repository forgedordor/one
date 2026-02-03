package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbtj {
    private final fbti a;
    private final ScheduledFuture b;

    public fbtj(fbti fbtiVar, ScheduledFuture scheduledFuture) {
        this.a = fbtiVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public final void a() {
        this.a.b = true;
        this.b.cancel(false);
    }

    public final boolean b() {
        fbti fbtiVar = this.a;
        return (fbtiVar.c || fbtiVar.b) ? false : true;
    }
}
