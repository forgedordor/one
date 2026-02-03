package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eghe implements eooz {
    public final /* synthetic */ eghl a;

    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        ArrayList arrayList = new ArrayList();
        ekqg ekqgVarListIterator = ((ekgp) obj).entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            final eghl eghlVar = this.a;
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            final egdc egdcVar = new egdc((efwo) entry.getKey(), ((egdb) eghl.a((eghw) entry.getValue())).a);
            Set set = (Set) eghlVar.e.b();
            final ArrayList arrayList2 = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(((egbw) it.next()).l(egdcVar));
                } catch (Exception e) {
                    arrayList2.add(eork.h(e));
                }
            }
            arrayList.add(eork.a(arrayList2).b(eiid.c(new eooy() { // from class: egha
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    Set set2 = (Set) eghlVar.f.b();
                    ArrayList arrayList3 = new ArrayList(set2.size());
                    Iterator it2 = set2.iterator();
                    egbv egbvVar = egdcVar;
                    while (it2.hasNext()) {
                        try {
                            arrayList3.add(((egbu) it2.next()).b(egbvVar));
                        } catch (Exception e2) {
                            arrayList3.add(eork.h(e2));
                        }
                    }
                    List list = arrayList2;
                    list.addAll(arrayList3);
                    return eork.c(list).a(new eopa(null), eoqg.a);
                }
            }), eghlVar.b));
        }
        return eork.c(arrayList).a(new eopa(null), eoqg.a);
    }
}
