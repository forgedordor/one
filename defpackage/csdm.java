package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdm {
    public static final csdn a(int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = csdl.m;
        ArrayList<csdl> arrayList = new ArrayList();
        fcue fcueVar = new fcue((fcuh) list);
        while (fcueVar.hasNext()) {
            Object next = fcueVar.next();
            if (((csdl) next) != csdl.a) {
                arrayList.add(next);
            }
        }
        for (csdl csdlVar : arrayList) {
            if ((csdlVar.n & i) != 0) {
                linkedHashSet.add(csdlVar);
            }
        }
        return new csdn(linkedHashSet);
    }
}
