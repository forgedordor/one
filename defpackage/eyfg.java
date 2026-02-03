package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyfg extends Thread {
    final /* synthetic */ eyfh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyfg(eyfh eyfhVar) {
        super("JNA Cleaner");
        this.a = eyfhVar;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, IllegalArgumentException {
        while (true) {
            try {
                eyfh eyfhVar = this.a;
                ReferenceQueue referenceQueue = eyfhVar.b;
                Reference referenceRemove = referenceQueue.remove(30000L);
                if (referenceRemove instanceof eyff) {
                    ((eyff) referenceRemove).a();
                } else if (referenceRemove == null) {
                    synchronized (referenceQueue) {
                        Logger logger = Logger.getLogger(eyfh.class.getName());
                        if (eyfhVar.d == null) {
                            eyfhVar.c = null;
                            logger.logp(Level.FINE, "com.sun.jna.internal.Cleaner$CleanerThread", "run", "Shutting down CleanerThread");
                            return;
                        } else if (logger.isLoggable(Level.FINER)) {
                            StringBuilder sb = new StringBuilder();
                            for (eyff eyffVar = eyfhVar.d; eyffVar != null; eyffVar = eyffVar.c) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(eyffVar.a.toString());
                            }
                            logger.logp(Level.FINER, "com.sun.jna.internal.Cleaner$CleanerThread", "run", "Registered Cleaners: {0}", sb.toString());
                        }
                    }
                } else {
                    continue;
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e) {
                Logger.getLogger(eyfh.class.getName()).logp(Level.SEVERE, "com.sun.jna.internal.Cleaner$CleanerThread", "run", (String) null, (Throwable) e);
            }
        }
    }
}
