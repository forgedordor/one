package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qde implements qdd {
    private final Map a = new LinkedHashMap();

    @Override // defpackage.qdd
    public final qda a(qiw qiwVar) {
        return (qda) this.a.remove(qiwVar);
    }

    @Override // defpackage.qdd
    public final qda b(qiw qiwVar) {
        Map map = this.a;
        Object qdaVar = map.get(qiwVar);
        if (qdaVar == null) {
            qdaVar = new qda(qiwVar);
            map.put(qiwVar, qdaVar);
        }
        return (qda) qdaVar;
    }

    @Override // defpackage.qdd
    public final /* synthetic */ qda c(qjn qjnVar) {
        return qdb.a(this, qjnVar);
    }

    @Override // defpackage.qdd
    public final List d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.a;
        for (Map.Entry entry : map.entrySet()) {
            if (fdbq.f(((qiw) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            map.remove((qiw) it.next());
        }
        return fcva.ao(linkedHashMap.values());
    }

    @Override // defpackage.qdd
    public final boolean e(qiw qiwVar) {
        return this.a.containsKey(qiwVar);
    }
}
