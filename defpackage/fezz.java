package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezz implements Runnable {
    final /* synthetic */ ffaa a;

    public fezz(ffaa ffaaVar) {
        this.a = ffaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fezu fezuVar;
        long jNanoTime;
        long j;
        boolean z;
        while (true) {
            ffaa ffaaVar = this.a;
            synchronized (ffaaVar) {
                byte[] bArr = fezr.a;
                while (true) {
                    List list = ffaaVar.f;
                    if (list.isEmpty()) {
                        break;
                    }
                    long jNanoTime2 = System.nanoTime();
                    Iterator it = list.iterator();
                    long jMin = Long.MAX_VALUE;
                    fezu fezuVar2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            j = jNanoTime2;
                            z = false;
                            break;
                        }
                        fezu fezuVar3 = (fezu) ((fezx) it.next()).e.get(0);
                        j = jNanoTime2;
                        long jMax = Math.max(0L, fezuVar3.c - j);
                        if (jMax > 0) {
                            jMin = Math.min(jMax, jMin);
                        } else {
                            if (fezuVar2 != null) {
                                z = true;
                                break;
                            }
                            fezuVar2 = fezuVar3;
                        }
                        jNanoTime2 = j;
                    }
                    if (fezuVar2 != null) {
                        fezuVar2.c = -1L;
                        fezx fezxVar = fezuVar2.b;
                        fezxVar.getClass();
                        fezxVar.e.remove(fezuVar2);
                        List list2 = ffaaVar.f;
                        list2.remove(fezxVar);
                        fezxVar.d = fezuVar2;
                        ffaaVar.e.add(fezxVar);
                        if (z || (!ffaaVar.c && !list2.isEmpty())) {
                            ffaaVar.h.a(ffaaVar.g);
                        }
                        fezuVar = fezuVar2;
                    } else if (!ffaaVar.c) {
                        ffaaVar.c = true;
                        ffaaVar.d = j + jMin;
                        try {
                            try {
                                long j2 = jMin / 1000000;
                                if (j2 > 0 || jMin > 0) {
                                    Long.signum(j2);
                                    ffaaVar.wait(j2, (int) (jMin - (1000000 * j2)));
                                }
                            } catch (InterruptedException unused) {
                                List list3 = ffaaVar.e;
                                int size = list3.size();
                                while (true) {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    } else {
                                        ((fezx) list3.get(size)).c();
                                    }
                                }
                                List list4 = ffaaVar.f;
                                int size2 = list4.size();
                                while (true) {
                                    size2--;
                                    if (size2 < 0) {
                                        break;
                                    }
                                    fezx fezxVar2 = (fezx) list4.get(size2);
                                    fezxVar2.c();
                                    if (fezxVar2.e.isEmpty()) {
                                        list4.remove(size2);
                                    }
                                }
                                ffaaVar.c = false;
                            }
                        } finally {
                        }
                    } else if (jMin < ffaaVar.d - j) {
                        ffaaVar.notify();
                    }
                }
                fezuVar = null;
            }
            if (fezuVar == null) {
                return;
            }
            fezx fezxVar3 = fezuVar.b;
            fezxVar3.getClass();
            ffaa ffaaVar2 = this.a;
            boolean zIsLoggable = ffaa.b.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                fezv.b(fezuVar, fezxVar3, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                threadCurrentThread.setName(fezuVar.a);
                try {
                    long jA = fezuVar.a();
                    synchronized (ffaaVar2) {
                        ffaaVar2.b(fezuVar, jA);
                    }
                    threadCurrentThread.setName(name);
                    if (zIsLoggable) {
                        fezv.b(fezuVar, fezxVar3, "finished run in ".concat(fezv.a(System.nanoTime() - jNanoTime)));
                    }
                } catch (Throwable th) {
                    synchronized (ffaaVar2) {
                        ffaaVar2.b(fezuVar, -1L);
                        threadCurrentThread.setName(name);
                        throw th;
                    }
                }
            } finally {
            }
        }
    }
}
