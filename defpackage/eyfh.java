package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfh {
    public static final eyfh a = new eyfh();
    public final ReferenceQueue b = new ReferenceQueue();
    public Thread c;
    public eyff d;

    private eyfh() {
    }

    private final synchronized void c(eyff eyffVar) {
        synchronized (this.b) {
            eyff eyffVar2 = this.d;
            if (eyffVar2 == null) {
                this.d = eyffVar;
            } else {
                eyffVar.c = eyffVar2;
                eyffVar2.b = eyffVar;
                this.d = eyffVar;
            }
            if (this.c == null) {
                Logger.getLogger(eyfh.class.getName()).logp(Level.FINE, "com.sun.jna.internal.Cleaner", "add", "Starting CleanerThread");
                eyfg eyfgVar = new eyfg(this);
                this.c = eyfgVar;
                eyfgVar.start();
            }
        }
    }

    public final synchronized eyfe a(Object obj, Runnable runnable) {
        eyff eyffVar;
        eyffVar = new eyff(this, obj, this.b, runnable);
        c(eyffVar);
        return eyffVar;
    }

    public final synchronized boolean b(eyff eyffVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            z = true;
            if (eyffVar == this.d) {
                this.d = eyffVar.c;
                z2 = true;
            } else {
                z2 = false;
            }
            eyff eyffVar2 = eyffVar.b;
            if (eyffVar2 != null) {
                eyffVar2.c = eyffVar.c;
            }
            eyff eyffVar3 = eyffVar.c;
            if (eyffVar3 != null) {
                eyffVar3.b = eyffVar2;
            }
            if (eyffVar.b == null && eyffVar3 == null) {
                z = z2;
            }
            eyffVar.c = null;
            eyffVar.b = null;
        }
        return z;
    }
}
