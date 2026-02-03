package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adq {
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    private final Map a = new LinkedHashMap();
    public final List d = new ArrayList();
    public final transient Map e = new LinkedHashMap();
    public final Map f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    private final void g(String str) {
        if (((Integer) this.c.get(str)) == null) {
            Iterator itA = fdey.d(new fdae() { // from class: adl
                @Override // defpackage.fdae
                public final Object invoke() {
                    return Integer.valueOf(fddf.a.c(2147418112) + 65536);
                }
            }).a();
            while (itA.hasNext()) {
                Number number = (Number) itA.next();
                if (!this.b.containsKey(Integer.valueOf(number.intValue()))) {
                    d(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public abstract void a(int i, adx adxVar, Object obj, kun kunVar);

    public final adj b(String str, adx adxVar, adi adiVar) {
        str.getClass();
        adxVar.getClass();
        g(str);
        this.e.put(str, new adm(adiVar, adxVar));
        Map map = this.f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            adiVar.a(obj);
        }
        Bundle bundle = this.g;
        adh adhVar = (adh) ih.a(bundle, str, adh.class);
        if (adhVar != null) {
            bundle.remove(str);
            adiVar.a(adxVar.b(adhVar.a, adhVar.b));
        }
        return new adp(this, str, adxVar);
    }

    public final adj c(final String str, lvj lvjVar, final adx adxVar, final adi adiVar) {
        adxVar.getClass();
        adiVar.getClass();
        lvc lvcVarP = lvjVar.P();
        if (lvcVarP.a().a(lvb.d)) {
            throw new IllegalStateException("LifecycleOwner " + lvjVar + " is attempting to register while current state is " + lvcVarP.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        g(str);
        Map map = this.a;
        adn adnVar = (adn) map.get(str);
        if (adnVar == null) {
            adnVar = new adn(lvcVarP);
        }
        lvh lvhVar = new lvh() { // from class: adk
            @Override // defpackage.lvh
            public final void gL(lvj lvjVar2, lva lvaVar) {
                adq adqVar = this.a;
                String str2 = str;
                if (lva.ON_START != lvaVar) {
                    if (lva.ON_STOP == lvaVar) {
                        adqVar.e.remove(str2);
                        return;
                    } else {
                        if (lva.ON_DESTROY == lvaVar) {
                            adqVar.e(str2);
                            return;
                        }
                        return;
                    }
                }
                adx adxVar2 = adxVar;
                adi adiVar2 = adiVar;
                adqVar.e.put(str2, new adm(adiVar2, adxVar2));
                Map map2 = adqVar.f;
                if (map2.containsKey(str2)) {
                    Object obj = map2.get(str2);
                    map2.remove(str2);
                    adiVar2.a(obj);
                }
                Bundle bundle = adqVar.g;
                adh adhVar = (adh) ih.a(bundle, str2, adh.class);
                if (adhVar != null) {
                    bundle.remove(str2);
                    adiVar2.a(adxVar2.b(adhVar.a, adhVar.b));
                }
            }
        };
        adnVar.a.c(lvhVar);
        adnVar.b.add(lvhVar);
        map.put(str, adnVar);
        return new ado(this, str, adxVar);
    }

    public final void d(int i, String str) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.c.put(str, numValueOf);
    }

    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.c.remove(str)) != null) {
            this.b.remove(num);
        }
        this.e.remove(str);
        Map map = this.f;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((adh) ih.a(bundle, str, adh.class)));
            bundle.remove(str);
        }
        Map map2 = this.a;
        adn adnVar = (adn) map2.get(str);
        if (adnVar != null) {
            List list = adnVar.b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                adnVar.a.d((lvh) it.next());
            }
            list.clear();
            map2.remove(str);
        }
    }

    public final boolean f(int i, int i2, Intent intent) {
        String str = (String) this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        adm admVar = (adm) this.e.get(str);
        if ((admVar != null ? admVar.a : null) != null) {
            List list = this.d;
            if (list.contains(str)) {
                admVar.a.a(admVar.b.b(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new adh(i2, intent));
        return true;
    }
}
