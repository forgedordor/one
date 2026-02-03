package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eada {
    public ListenableFuture a = null;
    public final ConcurrentMap b = new ConcurrentHashMap();

    public final eadb[] a(String str) {
        AtomicReference atomicReference = (AtomicReference) this.b.get(str);
        if (atomicReference == null) {
            return null;
        }
        return (eadb[]) atomicReference.get();
    }

    public final synchronized void b(dzyn dzynVar) {
        if (this.a == null) {
            this.a = dqyw.d(dzynVar.d, new Runnable() { // from class: eacz
                @Override // java.lang.Runnable
                public final void run() {
                    eada eadaVar = this.a;
                    Iterator it = eadaVar.b.values().iterator();
                    while (it.hasNext()) {
                        eadb[] eadbVarArr = (eadb[]) ((AtomicReference) it.next()).get();
                        if (eadbVarArr != null) {
                            for (eadb eadbVar : eadbVarArr) {
                                eada eadaVar2 = eadb.a;
                                if (eadbVar.g) {
                                    eadbVar.d();
                                }
                            }
                        }
                    }
                    synchronized (eadaVar) {
                        eadaVar.a = null;
                    }
                }
            }, dzynVar.e());
        }
    }
}
