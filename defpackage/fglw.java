package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglw {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final Set e;
    public final List f;
    public final int g;
    public final fgls h;

    public fglw(fglu fgluVar) {
        List list = fgluVar.a;
        Set set = fgluVar.g;
        Set set2 = fgin.a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((fgmj) fgin.b.get((Class) it.next()));
        }
        this.a = arrayList;
        this.h = (fgls) Objects.requireNonNullElseGet(null, new Supplier() { // from class: fglt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new Object() { // from class: fgls
                };
            }
        });
        this.f = fgluVar.e;
        List list2 = fgluVar.b;
        this.b = list2;
        List list3 = fgluVar.c;
        this.c = list3;
        List list4 = fgluVar.d;
        this.d = list4;
        Set set3 = fgluVar.f;
        this.e = set3;
        this.g = 1;
        new fgje(new fgiw(list2, list3, list4, set3, new fgii()));
    }
}
