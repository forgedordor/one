package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffhl implements Iterable<ffhp> {
    private final List<ffhp> a = new LinkedList();
    private final Map<String, List<ffhp>> b = new HashMap();

    public int a(String str) {
        if (str == null) {
            return 0;
        }
        List<ffhp> listRemove = this.b.remove(str.toLowerCase(Locale.US));
        if (listRemove == null || listRemove.isEmpty()) {
            return 0;
        }
        this.a.removeAll(listRemove);
        return listRemove.size();
    }

    public List<ffhp> b() {
        return new ArrayList(this.a);
    }

    public List<ffhp> c(String str) {
        if (str == null) {
            return null;
        }
        List<ffhp> list = this.b.get(str.toLowerCase(Locale.US));
        return (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : new ArrayList(list);
    }

    public ffhp d(String str) {
        if (str == null) {
            return null;
        }
        List<ffhp> list = this.b.get(str.toLowerCase(Locale.US));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void e(ffhp ffhpVar) {
        if (ffhpVar == null) {
            return;
        }
        String lowerCase = ffhpVar.b().toLowerCase(Locale.US);
        List<ffhp> linkedList = this.b.get(lowerCase);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.b.put(lowerCase, linkedList);
        }
        linkedList.add(ffhpVar);
        this.a.add(ffhpVar);
    }

    public void f(ffhp ffhpVar) {
        if (ffhpVar == null) {
            return;
        }
        List<ffhp> list = this.b.get(ffhpVar.b().toLowerCase(Locale.US));
        if (list == null || list.isEmpty()) {
            e(ffhpVar);
            return;
        }
        list.clear();
        list.add(ffhpVar);
        Iterator<ffhp> it = this.a.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            if (it.next().b().equalsIgnoreCase(ffhpVar.b())) {
                it.remove();
                if (i2 == -1) {
                    i2 = i;
                }
            }
            i++;
        }
        this.a.add(i2, ffhpVar);
    }

    @Override // java.lang.Iterable
    public Iterator<ffhp> iterator() {
        return DesugarCollections.unmodifiableList(this.a).iterator();
    }

    public String toString() {
        return this.a.toString();
    }
}
