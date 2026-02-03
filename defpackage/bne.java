package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bne {
    public final Map a = new LinkedHashMap();
    private final String b;

    public bne(String str) {
        this.b = str;
    }

    private final bnd k(String str, bml bmlVar, bni bniVar, bms bmsVar, List list) {
        Map map = this.a;
        bnd bndVar = (bnd) map.get(str);
        if (bndVar != null) {
            return bndVar;
        }
        bnd bndVar2 = new bnd(bmlVar, bniVar, bmsVar, list);
        map.put(str, bndVar2);
        return bndVar2;
    }

    public final bmk a() {
        bmk bmkVar = new bmk();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            bnd bndVar = (bnd) entry.getValue();
            if (bndVar.f && bndVar.e) {
                String str = (String) entry.getKey();
                bmkVar.b(bndVar.a);
                arrayList.add(str);
            }
        }
        bbs.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.b);
        return bmkVar;
    }

    public final bmk b() {
        bmk bmkVar = new bmk();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            bnd bndVar = (bnd) entry.getValue();
            if (bndVar.e) {
                bmkVar.b(bndVar.a);
                arrayList.add((String) entry.getKey());
            }
        }
        bbs.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.b);
        return bmkVar;
    }

    public final Collection c() {
        return DesugarCollections.unmodifiableCollection(e(new bnc() { // from class: bna
            @Override // defpackage.bnc
            public final boolean a(bnd bndVar) {
                return bndVar.e;
            }
        }));
    }

    public final Collection d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (((bnd) entry.getValue()).e) {
                arrayList.add(((bnd) entry.getValue()).b);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    public final Collection e(bnc bncVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (bncVar.a((bnd) entry.getValue())) {
                arrayList.add(((bnd) entry.getValue()).a);
            }
        }
        return arrayList;
    }

    public final void f(String str, bml bmlVar, bni bniVar, bms bmsVar, List list) {
        k(str, bmlVar, bniVar, bmsVar, list).f = true;
    }

    public final void g(String str, bml bmlVar, bni bniVar, bms bmsVar, List list) {
        k(str, bmlVar, bniVar, bmsVar, list).e = true;
        i(str, bmlVar, bniVar, bmsVar, list);
    }

    public final void h(String str) {
        Map map = this.a;
        if (map.containsKey(str)) {
            bnd bndVar = (bnd) map.get(str);
            bndVar.f = false;
            if (bndVar.e) {
                return;
            }
            map.remove(str);
        }
    }

    public final void i(String str, bml bmlVar, bni bniVar, bms bmsVar, List list) {
        Map map = this.a;
        if (map.containsKey(str)) {
            bnd bndVar = new bnd(bmlVar, bniVar, bmsVar, list);
            bnd bndVar2 = (bnd) map.get(str);
            bndVar.e = bndVar2.e;
            bndVar.f = bndVar2.f;
            map.put(str, bndVar);
        }
    }

    public final boolean j(String str) {
        Map map = this.a;
        if (map.containsKey(str)) {
            return ((bnd) map.get(str)).e;
        }
        return false;
    }
}
