package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzly {
    private final ejxm c;
    private volatile Process d;
    public volatile boolean b = false;
    public final ejvr a = new ejvr() { // from class: dzlx
        @Override // defpackage.ejvr
        public final Object apply(Object obj) {
            try {
                return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
            } catch (IOException unused) {
                this.a.b = true;
                return null;
            }
        }
    };

    public dzly(ejya ejyaVar) {
        this.c = new ejxm(ejyaVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.d != null) {
            try {
                if (this.d.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            ejxm ejxmVar = this.c;
            if (!ejxmVar.a || ejxmVar.a(TimeUnit.MILLISECONDS) >= 60000) {
                ejxmVar.e();
                ejxmVar.f();
                this.d = (Process) this.a.apply(str);
            }
        }
    }
}
