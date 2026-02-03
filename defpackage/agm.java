package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agm {
    public List a;
    public double b;
    public List c;
    private final String d;
    private final String e;
    private afv f;
    private Bundle g;
    private List h;
    private boolean i;

    public agm(agr agrVar) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.g = new Bundle();
        this.h = new ArrayList();
        this.i = false;
        this.d = agrVar.c;
        this.e = agrVar.d;
        this.f = agrVar.a();
        this.b = agrVar.e;
        this.c = new ArrayList(agrVar.g);
        Set<String> setKeySet = agrVar.h.keySet();
        csq csqVar = new csq(setKeySet.size());
        for (String str : setKeySet) {
            ArrayList<String> stringArrayList = agrVar.h.getStringArrayList(str);
            if (stringArrayList != null) {
                csqVar.put(str, stringArrayList);
            }
        }
        f(csqVar);
        List listB = agrVar.b();
        for (int i = 0; i < listB.size(); i++) {
            d(new agn((ago) listB.get(i)).a());
        }
        List list = agrVar.f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c((agr) list.get(i2));
        }
    }

    public final agr a() {
        this.i = true;
        return new agr(this.f.a, this.a, this.d, this.e, this.b, this.h, this.c, this.g);
    }

    public final void b() {
        if (this.i) {
            this.a = new ArrayList(this.a);
            this.h = new ArrayList(this.h);
            this.c = new ArrayList(this.c);
            this.g = ake.a(this.g);
            this.i = false;
        }
    }

    public final void c(agr agrVar) {
        b();
        this.h.add(agrVar);
    }

    public final void d(ago agoVar) {
        lcg.d(agoVar.e == null, "This MatchInfo is already associated with a SearchResult and can't be reassigned");
        b();
        this.a.add(agoVar);
    }

    public final void e(afv afvVar) {
        b();
        this.f = afvVar;
    }

    public final void f(Map map) {
        lcg.i(map);
        b();
        this.g.clear();
        for (Map.Entry entry : map.entrySet()) {
            lcg.i((String) entry.getKey());
            lcg.i((List) entry.getValue());
            ArrayList<String> arrayList = new ArrayList<>(((List) entry.getValue()).size());
            for (int i = 0; i < ((List) entry.getValue()).size(); i++) {
                String str = (String) ((List) entry.getValue()).get(i);
                lcg.i(str);
                arrayList.add(str);
            }
            this.g.putStringArrayList((String) entry.getKey(), arrayList);
        }
    }

    public agm(String str, String str2) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.g = new Bundle();
        this.h = new ArrayList();
        this.i = false;
        lcg.i(str);
        this.d = str;
        lcg.i(str2);
        this.e = str2;
    }
}
