package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sms extends smn {
    public final Context a;
    public final ExecutorService b;
    public final Executor c;
    public final boolean d;
    public final Duration e;
    public final ScheduledExecutorService f;
    public final boolean g;

    public sms(Context context, ExecutorService executorService, Executor executor, boolean z, Duration duration, ScheduledExecutorService scheduledExecutorService, boolean z2) {
        this.a = context;
        this.b = executorService;
        this.c = executor;
        this.d = z;
        this.e = duration;
        this.f = scheduledExecutorService;
        this.g = z2;
    }

    @Override // defpackage.smn
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.smn
    public final Duration b() {
        return this.e;
    }

    @Override // defpackage.smn
    public final Executor c() {
        return this.c;
    }

    @Override // defpackage.smn
    public final ExecutorService d() {
        return this.b;
    }

    @Override // defpackage.smn
    public final ScheduledExecutorService e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smn) {
            smn smnVar = (smn) obj;
            if (this.a.equals(smnVar.a()) && this.b.equals(smnVar.d()) && this.c.equals(smnVar.c()) && this.d == smnVar.g() && this.e.equals(smnVar.b()) && this.f.equals(smnVar.e()) && this.g == smnVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.smn
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.smn
    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        ScheduledExecutorService scheduledExecutorService = this.f;
        Duration duration = this.e;
        Executor executor = this.c;
        ExecutorService executorService = this.b;
        return "AiCoreClientOptions{context=" + this.a.toString() + ", workerExecutor=" + executorService.toString() + ", callbackExecutor=" + executor.toString() + ", bindImportantEnabled=" + this.d + ", autoUnbindTimeoutMs=" + duration.toString() + ", autoUnbindScheduledExecutor=" + scheduledExecutorService.toString() + ", autoDownloadEnabled=" + this.g + "}";
    }
}
