package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smr extends smk {
    public Context a;
    public ExecutorService b;
    public Executor c;
    public boolean d;
    public Duration e;
    public ScheduledExecutorService f;
    public boolean g;
    public byte h;

    @Override // defpackage.smk
    public final void a() {
        this.d = true;
        this.h = (byte) (1 | this.h);
    }

    @Override // defpackage.smk
    public final void b(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Null callbackExecutor");
        }
        this.c = executor;
    }
}
