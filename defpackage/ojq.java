package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojq implements Comparable {
    public String a;
    public String b;

    public ojq(String str) {
        List listAm;
        str.getClass();
        List listG = new fdgl("/").g(str);
        if (listG.isEmpty()) {
            listAm = fcvo.a;
        } else {
            ListIterator listIterator = listG.listIterator(listG.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listAm = fcva.am(listG, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listAm = fcvo.a;
        }
        this.a = (String) listAm.get(0);
        this.b = (String) listAm.get(1);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ojq ojqVar) {
        ojqVar.getClass();
        int i = true != fdbq.f(this.a, ojqVar.a) ? 0 : 2;
        return fdbq.f(this.b, ojqVar.b) ? i + 1 : i;
    }
}
