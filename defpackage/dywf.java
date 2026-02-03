package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dywf extends dywe {
    private final dywh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dywf(Context context, ScheduledExecutorService scheduledExecutorService) {
        super(context, scheduledExecutorService);
        context.getClass();
        scheduledExecutorService.getClass();
        this.b = new dywh(scheduledExecutorService);
    }

    @Override // defpackage.dyws
    public final void a(Runnable runnable) {
        this.b.a(runnable);
    }
}
