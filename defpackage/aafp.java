package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafp {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;

    public aafp(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            arrayList.add(new fcti(((bxuv) obj).a, Integer.valueOf(i)));
            i = i2;
        }
        this.c = fcwa.k(arrayList);
        List list2 = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list2, 10)), 16));
        for (Object obj2 : list2) {
            linkedHashMap.put(((bxuv) obj2).a, obj2);
        }
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aafp)) {
            return false;
        }
        aafp aafpVar = (aafp) obj;
        return fdbq.f(this.a, aafpVar.a) && fdbq.f(this.b, aafpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MessageSearchResults(searchQuery=" + this.a + ", hits=" + this.b + ")";
    }
}
