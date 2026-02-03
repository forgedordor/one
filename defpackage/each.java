package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class each implements eacb {
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final ConcurrentMap a = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final ConcurrentMap c = new ConcurrentHashMap();
    public final ConcurrentMap d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[EDGE_INSN: B:164:0x00ad->B:33:0x00ad BREAK  A[LOOP:2: B:25:0x0089->B:165:?]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.dbzs r19, defpackage.ejxr r20, defpackage.ejvr r21) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.each.b(dbzs, ejxr, ejvr):void");
    }

    private static final void c(eaca eacaVar, Object obj, ConcurrentMap concurrentMap, boolean z) {
        Set<eaca> set = (Set) concurrentMap.putIfAbsent(obj, new ekph(eacaVar));
        if (set != null) {
            ekhv ekhvVar = new ekhv();
            if (z) {
                HashSet hashSet = new HashSet();
                for (eaca eacaVar2 : set) {
                    if (!eacaVar2.b.equals(eacaVar.b)) {
                        hashSet.add(eacaVar2);
                    }
                }
                ekhvVar.j(hashSet);
            } else {
                ekhvVar.j(set);
            }
            ekhvVar.c(eacaVar);
            concurrentMap.put(obj, ekhvVar.g());
        }
    }

    public final void a(evqs evqsVar, Set set, String str, String str2, boolean z, boolean z2) {
        if (!set.isEmpty() && !this.e.getAndSet(true)) {
            dcac.a().b(new eacg(this));
        }
        byte[] bArrI = evqsVar.I();
        byte[][] bArr = ExperimentTokens.a;
        eaca eacaVar = new eaca(new ExperimentTokens(str, bArrI, bArr, bArr, bArr, bArr, null, null, null, null), str2);
        if (z) {
            this.a.put(new ejwj(str2, str), eacaVar);
        } else {
            this.b.put(str2, eacaVar);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (z) {
                c(eacaVar, new ejwj(str3, str), this.c, z2);
            } else {
                c(eacaVar, str3, this.d, z2);
            }
        }
    }
}
