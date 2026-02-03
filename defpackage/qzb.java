package defpackage;

import android.os.Process;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzb extends Thread {
    private static final boolean b = raa.b;
    public final BlockingQueue a;
    private final BlockingQueue c;
    private final qyz d;
    private volatile boolean e = false;
    private final rab f;
    private final qzg g;

    public qzb(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, qyz qyzVar, qzg qzgVar) {
        this.c = blockingQueue;
        this.a = blockingQueue2;
        this.d = qyzVar;
        this.g = qzgVar;
        this.f = new rab(this, blockingQueue2, qzgVar);
    }

    private void b() {
        List arrayList;
        List list;
        qzo qzoVar = (qzo) this.c.take();
        qzoVar.d("cache-queue-take");
        qzoVar.m();
        try {
            if (qzoVar.j()) {
                qzoVar.g("cache-discard-canceled");
            } else {
                qyz qyzVar = this.d;
                String str = qzoVar.b;
                qyy qyyVarA = qyzVar.a(str);
                if (qyyVarA == null) {
                    qzoVar.d("cache-miss");
                    if (!this.f.b(qzoVar)) {
                        this.a.put(qzoVar);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (qyyVarA.a(jCurrentTimeMillis)) {
                        qzoVar.d("cache-hit-expired");
                        qzoVar.j = qyyVarA;
                        if (!this.f.b(qzoVar)) {
                            this.a.put(qzoVar);
                        }
                    } else {
                        qzoVar.d("cache-hit");
                        byte[] bArr = qyyVarA.a;
                        Map map = qyyVarA.g;
                        if (map == null) {
                            list = null;
                        } else {
                            if (map.isEmpty()) {
                                arrayList = Collections.EMPTY_LIST;
                            } else {
                                arrayList = new ArrayList(map.size());
                                for (Map.Entry entry : map.entrySet()) {
                                    arrayList.add(new qzh((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                            list = arrayList;
                        }
                        qzu qzuVarB = qzoVar.b(new qzk(BasePaymentResult.ERROR_REQUEST_FAILED, bArr, map, list, false));
                        qzoVar.d("cache-hit-parsed");
                        if (!qzuVarB.a()) {
                            qzoVar.d("cache-parsing-failed");
                            qyzVar.d(str);
                            qzoVar.j = null;
                            if (!this.f.b(qzoVar)) {
                                this.a.put(qzoVar);
                            }
                        } else if (qyyVarA.f < jCurrentTimeMillis) {
                            qzoVar.d("cache-hit-refresh-needed");
                            qzoVar.j = qyyVarA;
                            qzuVarB.d = true;
                            if (this.f.b(qzoVar)) {
                                this.g.b(qzoVar, qzuVarB);
                            } else {
                                this.g.c(qzoVar, qzuVarB, new qza(this, qzoVar));
                            }
                        } else {
                            this.g.b(qzoVar, qzuVarB);
                        }
                    }
                }
            }
        } finally {
            qzoVar.m();
        }
    }

    public final void a() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (b) {
            raa.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.b();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                raa.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
