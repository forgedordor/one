package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rje implements riy {
    private final File b;
    private rcc d;
    private final rjc c = new rjc();
    private final rjp a = new rjp();

    @Deprecated
    public rje(File file) {
        this.b = file;
    }

    private final synchronized rcc d() {
        if (this.d == null) {
            File file = this.b;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    rcc.g(file2, file3, false);
                }
            }
            rcc rccVar = new rcc(file);
            if (rccVar.b.exists()) {
                try {
                    rccVar.e();
                    rcc.d(rccVar.c);
                    Iterator it = rccVar.g.values().iterator();
                    while (it.hasNext()) {
                        rca rcaVar = (rca) it.next();
                        if (rcaVar.f == null) {
                            for (int i = 0; i < rccVar.d; i = 1) {
                                rccVar.e += rcaVar.b[0];
                            }
                        } else {
                            rcaVar.f = null;
                            for (int i2 = 0; i2 < rccVar.d; i2 = 1) {
                                rcc.d(rcaVar.c());
                                rcc.d(rcaVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    rccVar.c();
                }
                this.d = rccVar;
            } else {
                file.mkdirs();
                rccVar = new rcc(file);
                rccVar.f();
                this.d = rccVar;
            }
        }
        return this.d;
    }

    private final synchronized void e() {
        this.d = null;
    }

    @Override // defpackage.riy
    public final File a(res resVar) {
        String strA = this.a.a(resVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strA + " for for Key: " + String.valueOf(resVar));
        }
        try {
            rcb rcbVarA = d().a(strA);
            if (rcbVarA != null) {
                return rcbVarA.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.riy
    public final synchronized void b() {
        try {
            try {
                d().c();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
        } finally {
            e();
        }
    }

    @Override // defpackage.riy
    public final void c(res resVar, rgl rglVar) {
        rja rjaVar;
        File fileD;
        rja rjaVar2;
        rjc rjcVar = this.c;
        String strA = this.a.a(resVar);
        synchronized (rjcVar) {
            rjaVar = (rja) rjcVar.a.get(strA);
            if (rjaVar == null) {
                Queue queue = rjcVar.b.a;
                synchronized (queue) {
                    rjaVar2 = (rja) queue.poll();
                }
                rjaVar = rjaVar2 == null ? new rja() : rjaVar2;
                rjcVar.a.put(strA, rjaVar);
            }
            rjaVar.b++;
        }
        rjaVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strA + " for for Key: " + String.valueOf(resVar));
            }
            try {
                rcc rccVarD = d();
                if (rccVarD.a(strA) == null) {
                    rbz rbzVarJ = rccVarD.j(strA);
                    if (rbzVarJ == null) {
                        throw new IllegalStateException(a.v(strA, "Had two simultaneous puts for: "));
                    }
                    try {
                        rcc rccVar = rbzVarJ.d;
                        synchronized (rccVar) {
                            rca rcaVar = rbzVarJ.a;
                            if (rcaVar.f != rbzVarJ) {
                                throw new IllegalStateException();
                            }
                            if (!rcaVar.e) {
                                rbzVarJ.b[0] = true;
                            }
                            fileD = rcaVar.d();
                            rccVar.a.mkdirs();
                        }
                        if (rglVar.a.a(rglVar.b, fileD, rglVar.c)) {
                            rccVar.b(rbzVarJ, true);
                            rbzVarJ.c = true;
                        }
                    } finally {
                        rbzVarJ.b();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.c.a(strA);
        }
    }
}
