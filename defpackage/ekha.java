package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekha {
    Map a;

    public ekfm e(int i) {
        return ekgb.d(i);
    }

    public final ekhe f() {
        Map map = this.a;
        if (map == null) {
            return ekdy.a;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return ekdy.a;
        }
        ekgi ekgiVar = new ekgi(setEntrySet.size());
        int i = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            ekgb ekgbVarG = ((ekfw) entry.getValue()).g();
            ekgiVar.i(key, ekgbVarG);
            i += ((ekoe) ekgbVarG).c;
        }
        return new ekgd(ekgiVar.c(), i);
    }

    final Map g() {
        Map map = this.a;
        if (map != null) {
            return map;
        }
        ekdi ekdiVar = new ekdi();
        this.a = ekdiVar;
        return ekdiVar;
    }

    public final void h(Map.Entry entry) {
        l(entry.getKey(), entry.getValue());
    }

    public final void i(ekmj ekmjVar) {
        for (Map.Entry entry : ekmjVar.w().entrySet()) {
            j(entry.getKey(), (Iterable) entry.getValue());
        }
    }

    public final void j(Object obj, Iterable iterable) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(ekis.n(iterable)));
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            ekfm ekfmVarE = (ekfm) g().get(obj);
            if (ekfmVarE == null) {
                ekfmVarE = e(k(iterable));
                g().put(obj, ekfmVarE);
            }
            while (it.hasNext()) {
                Object next = it.next();
                ekcw.a(obj, next);
                ekfmVarE.c(next);
            }
        }
    }

    public int k(Iterable iterable) {
        if (iterable instanceof Collection) {
            return Math.max(4, ((Collection) iterable).size());
        }
        return 4;
    }

    public final void l(Object obj, Object obj2) {
        ekcw.a(obj, obj2);
        ekfm ekfmVarE = (ekfm) g().get(obj);
        if (ekfmVarE == null) {
            ekfmVarE = e(4);
            g().put(obj, ekfmVarE);
        }
        ekfmVarE.c(obj2);
    }
}
