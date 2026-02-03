package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvo implements ecgu {
    public final dtpa a;
    public final AtomicLong b = new AtomicLong();
    final /* synthetic */ duvp c;
    private final String d;

    public duvo(duvp duvpVar, String str, dtpa dtpaVar) {
        this.c = duvpVar;
        this.d = str;
        this.a = dtpaVar;
    }

    @Override // defpackage.ecgu
    public final void a(long j) {
        AtomicLong atomicLong = this.b;
        atomicLong.getAndAdd(j);
        durt.m("%s: Received data for groupName = %s, len = %d, Counter = %d", "DownloadProgressMonitor", this.d, Long.valueOf(j), Long.valueOf(atomicLong.get()));
    }

    @Override // defpackage.ecgu
    public final void b() {
        synchronized (duvp.class) {
            duvp duvpVar = this.c;
            if (duvpVar.c.containsKey(this.d)) {
                duvpVar.a.execute(new Runnable() { // from class: duvn
                    @Override // java.lang.Runnable
                    public final void run() {
                        duvo duvoVar = this.a;
                        duvoVar.a.a(duvoVar.b.get());
                    }
                });
            }
        }
    }
}
