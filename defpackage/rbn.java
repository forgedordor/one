package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbn {
    public final rlu a;
    public final rss b;
    public final rsx c;
    public final rsz d;
    public final rrj e;
    public final rsv f = new rsv();
    public final rsu g = new rsu();
    public final lcd h;
    private final rfl i;
    private final rst j;

    public rbn() {
        rvp rvpVar = new rvp(new lcf(20), new rvm(), new rvn());
        this.h = rvpVar;
        this.a = new rlu(rvpVar);
        this.b = new rss();
        this.c = new rsx();
        this.d = new rsz();
        this.i = new rfl();
        this.e = new rrj();
        this.j = new rst();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.c.d(arrayList);
    }

    public final rfi a(Object obj) {
        return this.i.a(obj);
    }

    public final List b() {
        List listA = this.j.a();
        if (listA.isEmpty()) {
            throw new rbj();
        }
        return listA;
    }

    public final List c(Object obj) {
        List listB = this.a.b(obj.getClass());
        if (listB.isEmpty()) {
            throw new rbk(obj);
        }
        int size = listB.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            rlq rlqVar = (rlq) listB.get(i);
            if (rlqVar.b(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                }
                arrayList.add(rlqVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            throw new rbk(obj, listB);
        }
        return arrayList;
    }

    public final void d(Class cls, red redVar) {
        this.b.b(cls, redVar);
    }

    public final void e(Class cls, rfa rfaVar) {
        this.d.b(cls, rfaVar);
    }

    public final void f(Class cls, Class cls2, rez rezVar) {
        h("legacy_append", cls, cls2, rezVar);
    }

    public final void g(Class cls, Class cls2, rlr rlrVar) {
        this.a.c(cls, cls2, rlrVar);
    }

    public final void h(String str, Class cls, Class cls2, rez rezVar) {
        this.c.c(str, rezVar, cls, cls2);
    }

    public final void i(Class cls, Class cls2, rez rezVar) {
        this.c.e(rezVar, cls, cls2);
    }

    public final void j(Class cls, Class cls2, rlr rlrVar) {
        this.a.d(cls, cls2, rlrVar);
    }

    public final void k(ImageHeaderParser imageHeaderParser) {
        this.j.b(imageHeaderParser);
    }

    public final void l(rfh rfhVar) {
        this.i.b(rfhVar);
    }

    public final void m(Class cls, Class cls2, rrh rrhVar) {
        this.e.c(cls, cls2, rrhVar);
    }
}
