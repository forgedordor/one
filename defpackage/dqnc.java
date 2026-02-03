package defpackage;

import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnc implements dqnb {
    private final Map b = new ConcurrentHashMap();
    private final dqmu c;
    private final AtomicInteger d;
    private final AtomicInteger e;
    private volatile dqmr f;

    public dqnc(dqmu dqmuVar) {
        new ConcurrentHashMap();
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.c = dqmuVar;
        this.f = dqmr.d;
    }

    @Override // defpackage.dqnb
    public final dqmz a() {
        Map map = this.b;
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add((dqmt) entry.getValue());
            arrayList2.add(Integer.valueOf(((dqmt) entry.getValue()).a()));
        }
        List listB = dqmq.b(arrayList2);
        HashMap mapH = ekmi.h(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            mapH.put(Long.valueOf(((dqmt) arrayList.get(i)).b()), (dqmr) listB.get(i));
        }
        dqmn dqmnVar = (dqmn) this.f;
        if (dqmnVar.a != 0 || dqmnVar.b != 0 || dqmnVar.c != 0) {
            mapH.put(0L, this.f);
        }
        return new dqmz(((dqmp) this.c).a, mapH, this.d.get(), this.e.get());
    }

    @Override // defpackage.dqnb
    public final void b() {
        this.e.getAndIncrement();
    }

    @Override // defpackage.dqnb
    public final void c() {
        this.d.getAndIncrement();
    }

    @Override // defpackage.dqnb
    public final void d(long j) {
        dqmt dqmtVar = (dqmt) this.b.remove(Long.valueOf(j));
        if (dqmtVar != null) {
            int iA = dqmtVar.a();
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                dqmr dqmrVarA = dqmq.a(new File(String.format(Locale.US, "/proc/self/task/%d/schedstat", Integer.valueOf(iA))));
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (dqmrVarA != dqmr.d) {
                    dqmn dqmnVar = (dqmn) this.f;
                    dqmn dqmnVar2 = (dqmn) dqmrVarA;
                    this.f = new dqmn(dqmnVar.a + dqmnVar2.a, dqmnVar.b + dqmnVar2.b, dqmnVar.c + dqmnVar2.c);
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
    }

    @Override // defpackage.dqnb
    public final void e(long j) {
        Map map = this.b;
        Long lValueOf = Long.valueOf(j);
        if (map.containsKey(lValueOf)) {
            return;
        }
        map.put(lValueOf, new dqmo(Process.myTid(), j, Thread.currentThread().getName(), ((dqmp) this.c).a));
    }
}
