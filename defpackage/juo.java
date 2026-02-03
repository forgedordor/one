package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juo implements CharSequence {
    public final List a;
    public final String b;
    public final List c;
    public final List d;

    public juo(String str, List list) {
        this(true == list.isEmpty() ? null : list, str);
    }

    public final int a() {
        return this.b.length();
    }

    public final juo b(fdap fdapVar) {
        jul julVar = new jul(this);
        List list = julVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, juj.a((jum) fdapVar.invoke(((juk) list.get(i)).a(Integer.MIN_VALUE))));
        }
        return julVar.b();
    }

    public final juo c(juo juoVar) {
        jul julVar = new jul(this);
        julVar.e(juoVar);
        return julVar.b();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final juo subSequence(int i, int i2) {
        if (i > i2) {
            kfq.b("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        String strSubstring = this.b.substring(i, i2);
        strSubstring.getClass();
        List list = this.a;
        juo juoVar = jur.a;
        if (i > i2) {
            kfq.b("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                jum jumVar = (jum) list.get(i3);
                int i4 = jumVar.b;
                int i5 = jumVar.c;
                if (jur.b(i, i2, i4, i5)) {
                    arrayList2.add(new jum(jumVar.a, Math.max(i, i4) - i, Math.min(i2, i5) - i, jumVar.d));
                }
            }
            if (true != arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new juo(arrayList, strSubstring);
    }

    public final List e() {
        List list = this.c;
        return list == null ? fcvo.a : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juo)) {
            return false;
        }
        juo juoVar = (juo) obj;
        return fdbq.f(this.b, juoVar.b) && fdbq.f(this.a, juoVar.a);
    }

    public final List f(String str, int i, int i2) {
        List list = this.a;
        if (list == null) {
            return fcvo.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            jum jumVar = (jum) list.get(i3);
            Object obj = jumVar.a;
            if (obj instanceof jya) {
                String str2 = jumVar.d;
                if (fdbq.f(str, str2)) {
                    int i4 = jumVar.b;
                    int i5 = jumVar.c;
                    if (jur.b(i, i2, i4, i5)) {
                        obj.getClass();
                        arrayList.add(new jum(((jya) obj).a, i4, i5, str2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List g(int i) {
        List list = this.a;
        if (list == null) {
            return fcvo.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            jum jumVar = (jum) obj;
            if ((jumVar.a instanceof juy) && jur.b(0, i, jumVar.b, jumVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public /* synthetic */ juo(String str) {
        this(str, fcvo.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ juo(String str, List list, int i) {
        list = (i & 2) != 0 ? fcvo.a : list;
        juo juoVar = jur.a;
        this(true == list.isEmpty() ? null : list, str);
    }

    public juo(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                jum jumVar = (jum) list.get(i);
                Object obj = jumVar.a;
                if (obj instanceof jxx) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    jumVar.getClass();
                    arrayList.add(jumVar);
                } else if (obj instanceof jvn) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    jumVar.getClass();
                    arrayList2.add(jumVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listAl = arrayList2 != null ? fcva.al(arrayList2, new jun()) : null;
        if (listAl == null || listAl.isEmpty()) {
            return;
        }
        cug cugVarB = cti.b(((jum) fcva.N(listAl)).c);
        int size2 = listAl.size();
        for (int i2 = 1; i2 < size2; i2++) {
            jum jumVar2 = (jum) listAl.get(i2);
            while (true) {
                if (cugVarB.b == 0) {
                    break;
                }
                int iB = cugVarB.b();
                if (jumVar2.b >= iB) {
                    cugVarB.c(cugVarB.b - 1);
                } else if (jumVar2.c > iB) {
                    kfq.b("Paragraph overlap not allowed, end " + jumVar2.c + " should be less than or equal to " + iB);
                }
            }
            cugVarB.f(jumVar2.c);
        }
    }
}
