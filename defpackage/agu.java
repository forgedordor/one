package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agu extends ajn {
    public final int a;
    public final List b;
    final Bundle c;
    public final List d;
    public final int e;
    final Bundle f;
    final Bundle g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    private final List n;

    public agu(int i, List list, List list2, Bundle bundle, List list3, int i2, Bundle bundle2, Bundle bundle3, List list4, List list5, List list6, List list7, List list8) {
        this.a = i;
        lcg.i(list);
        this.b = DesugarCollections.unmodifiableList(list);
        lcg.i(list2);
        this.n = DesugarCollections.unmodifiableList(list2);
        lcg.i(bundle);
        this.c = bundle;
        lcg.i(list3);
        this.d = DesugarCollections.unmodifiableList(list3);
        this.e = i2;
        lcg.i(bundle2);
        this.f = bundle2;
        lcg.i(bundle3);
        this.g = bundle3;
        this.h = "";
        this.i = DesugarCollections.unmodifiableList(list4);
        if (list5 != null) {
            this.j = DesugarCollections.unmodifiableList(list5);
        } else {
            this.j = Collections.EMPTY_LIST;
        }
        if (list6 != null) {
            this.k = DesugarCollections.unmodifiableList(list6);
        } else {
            this.k = Collections.EMPTY_LIST;
        }
        this.l = list7 != null ? DesugarCollections.unmodifiableList(list7) : Collections.EMPTY_LIST;
        this.m = list8 != null ? DesugarCollections.unmodifiableList(list8) : Collections.EMPTY_LIST;
    }

    public final List a() {
        List list = this.n;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map b() {
        Bundle bundle = this.c;
        Set<String> setKeySet = bundle.keySet();
        csq csqVar = new csq(setKeySet.size());
        for (String str : setKeySet) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            lcg.i(stringArrayList);
            csqVar.put(str, stringArrayList);
        }
        return csqVar;
    }

    public final Map c() {
        Bundle bundle = this.f;
        Set<String> setKeySet = bundle.keySet();
        csq csqVar = new csq(setKeySet.size());
        for (String str : setKeySet) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            stringArrayList.getClass();
            csqVar.put(str, stringArrayList);
        }
        return csqVar;
    }

    public final Map d() {
        Bundle bundle = this.g;
        Set<String> setKeySet = bundle.keySet();
        csq csqVar = new csq(setKeySet.size());
        for (String str : setKeySet) {
            Bundle bundle2 = bundle.getBundle(str);
            if (bundle2 != null) {
                Set<String> setKeySet2 = bundle2.keySet();
                csq csqVar2 = new csq(setKeySet2.size());
                for (String str2 : setKeySet2) {
                    csqVar2.put(str2, Double.valueOf(bundle2.getDouble(str2)));
                }
                csqVar.put(str, csqVar2);
            }
        }
        return csqVar;
    }

    public final boolean e() {
        return this.i.contains("LIST_FILTER_HAS_PROPERTY_FUNCTION");
    }

    public final boolean f() {
        return this.i.contains("LIST_FILTER_QUERY_LANGUAGE");
    }

    public final boolean g() {
        return this.i.contains("NUMERIC_SEARCH");
    }

    public final boolean h() {
        return this.i.contains("VERBATIM_SEARCH");
    }
}
