package androidx.work;

import defpackage.pzn;
import defpackage.pzs;
import defpackage.qac;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends qac {
    @Override // defpackage.qac
    public final pzs a(List list) {
        pzn pznVar = new pzn();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((pzs) it.next()).e());
        }
        pznVar.c(linkedHashMap);
        return pznVar.a();
    }
}
