package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwu extends ebzt {
    final /* synthetic */ ehww a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehwu(ehww ehwwVar) {
        super("forceSync");
        this.a = ehwwVar;
    }

    @Override // defpackage.ebzu
    public final String c(Context context, String[] strArr) {
        String strV;
        eieu eieuVarK = eiiy.k("forceSync");
        try {
            ehww ehwwVar = this.a;
            final ehym ehymVar = (ehym) ehwwVar.a.b();
            final Set setKeySet = ehwwVar.a(strArr).keySet();
            ((ekrd) ((ekrd) ehym.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "forceSync", 931, "SyncManagerImpl.java")).q("forceSync(). Running all Synclets, but not rescheduling once finished.");
            final HashMap map = new HashMap();
            ListenableFuture listenableFutureK = eika.k(ehymVar.h, new eooz() { // from class: ehyj
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Map map2;
                    Collection collection = setKeySet;
                    ehym ehymVar2 = ehymVar;
                    synchronized (ehymVar2.i) {
                        Iterator it = collection.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            map2 = map;
                            if (zHasNext) {
                                ehyr ehyrVar = (ehyr) it.next();
                                Map map3 = ehymVar2.k;
                                if (!map3.containsKey(ehyrVar)) {
                                    SettableFuture settableFutureCreate = SettableFuture.create();
                                    map3.put(ehyrVar, settableFutureCreate);
                                    map2.put(ehyrVar, settableFutureCreate);
                                }
                            }
                        }
                    }
                    return ehymVar2.i(map2);
                }
            }, ehymVar.c);
            eieuVarK.b(listenableFutureK);
            try {
                Set set = (Set) ((eooi) listenableFutureK).q();
                csq csqVar = new csq();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String strB = ((ehyr) it.next()).b.b();
                    if (csqVar.containsKey(strB)) {
                        csqVar.put(strB, Integer.valueOf(((Integer) csqVar.get(strB)).intValue() + 1));
                    } else {
                        csqVar.put(strB, 1);
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : csqVar.entrySet()) {
                    sb.append("Synclet ");
                    sb.append((String) entry.getKey());
                    sb.append(" finished for ");
                    sb.append(entry.getValue());
                    sb.append(" account(s).\n");
                }
                strV = sb.toString();
            } catch (InterruptedException e) {
                e = e;
                strV = a.v(ejxy.a(e), "Error running sync: ");
                eieuVarK.close();
                return strV;
            } catch (ExecutionException e2) {
                e = e2;
                strV = a.v(ejxy.a(e), "Error running sync: ");
                eieuVarK.close();
                return strV;
            }
            eieuVarK.close();
            return strV;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ebzt, defpackage.ebzu
    public final String[] d(Context context, String[] strArr) {
        return this.a.b(strArr);
    }
}
