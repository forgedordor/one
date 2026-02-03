package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehup implements eyif {
    /* JADX WARN: Multi-variable type inference failed */
    public static ekgb a(Map map, cvw cvwVar, Object obj) {
        List arrayList;
        int i;
        int i2;
        Set setKeySet = map.keySet();
        synchronized (cvwVar) {
            arrayList = (List) cvwVar.get(setKeySet);
            if (arrayList == null) {
                arrayList = new ArrayList(setKeySet);
                Collections.shuffle(arrayList, ((ehum) obj).a);
                cvw cvwVar2 = new cvw();
                ArrayDeque arrayDeque = new ArrayDeque(arrayList);
                HashSet hashSet = new HashSet(arrayList);
                while (true) {
                    i = 0;
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    ehul ehulVar = (ehul) arrayDeque.remove();
                    ekgb ekgbVar = ehulVar.b;
                    int i3 = ((ekoe) ekgbVar).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ehul ehulVar2 = (ehul) ekgbVar.get(i4);
                        ehum.b(cvwVar2, ehulVar, ehulVar2);
                        if (hashSet.add(ehulVar2)) {
                            arrayDeque.add(ehulVar2);
                        }
                    }
                    ekgb ekgbVar2 = ehulVar.c;
                    int i5 = ((ekoe) ekgbVar2).c;
                    while (i < i5) {
                        ehul ehulVar3 = (ehul) ekgbVar2.get(i);
                        ehum.b(cvwVar2, ehulVar3, ehulVar);
                        if (hashSet.add(ehulVar3)) {
                            arrayDeque.add(ehulVar3);
                        }
                        i++;
                    }
                }
                ekhx ekhxVarO = ekhx.o(arrayList);
                try {
                    ArrayList<eonp> arrayList2 = new ArrayList(arrayList.size());
                    HashMap map2 = new HashMap(arrayList.size());
                    int i6 = 0;
                    for (Object obj2 : arrayList) {
                        eonp eonpVar = new eonp(obj2, i6);
                        arrayList2.add(eonpVar);
                        List arrayList3 = (List) map2.get(obj2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map2.put(obj2, arrayList3);
                        }
                        arrayList3.add(eonpVar);
                        i6++;
                    }
                    int size = arrayList2.size();
                    while (i < size) {
                        eonp eonpVar2 = (eonp) arrayList2.get(i);
                        Iterator<E> it = ehum.a(ekhxVarO, cvwVar2, (ehul) eonpVar2.a).iterator();
                        while (true) {
                            i2 = i + 1;
                            if (it.hasNext()) {
                                List list = (List) map2.get(it.next());
                                if (list != null) {
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        ((eonp) it2.next()).c.add(eonpVar2);
                                        eonpVar2.d++;
                                    }
                                } else {
                                    eonpVar2.d++;
                                }
                            }
                        }
                        i = i2;
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                    PriorityQueue priorityQueue = new PriorityQueue();
                    for (eonp eonpVar3 : arrayList2) {
                        if (eonpVar3.d == 0) {
                            priorityQueue.add(eonpVar3);
                        }
                    }
                    while (!priorityQueue.isEmpty()) {
                        eonp eonpVar4 = (eonp) priorityQueue.poll();
                        arrayList4.add(eonpVar4);
                        for (eonp eonpVar5 : eonpVar4.c) {
                            int i7 = eonpVar5.d - 1;
                            eonpVar5.d = i7;
                            if (i7 == 0) {
                                priorityQueue.add(eonpVar5);
                            }
                        }
                    }
                    if (arrayList4.size() != arrayList.size()) {
                        ArrayList arrayList5 = new ArrayList();
                        for (eonp eonpVar6 : arrayList2) {
                            if (eonpVar6.d > 0) {
                                arrayList5.add(eonpVar6.a);
                            }
                        }
                        throw new eono(arrayList5);
                    }
                    arrayList.clear();
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((eonp) it3.next()).a);
                    }
                    cvwVar.put(setKeySet, arrayList);
                } catch (eono e) {
                    throw new IllegalStateException("Cycle: ".concat(String.valueOf(String.valueOf(DesugarCollections.unmodifiableList(e.a)))), e);
                }
            }
        }
        int i8 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((Set) map.get((ehul) it4.next())).iterator();
            while (it5.hasNext()) {
                ekfwVar.h((esrw) ((fcsu) it5.next()).b());
            }
        }
        ekgb ekgbVarG = ekfwVar.g();
        ekgbVarG.getClass();
        return ekgbVarG;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
