package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvf implements jvl {
    public final juo a;
    public final List b;
    public final List d;
    public final fctc c = fctd.b(3, new fdae() { // from class: jvd
        @Override // defpackage.fdae
        public final Object invoke() {
            Object obj;
            List list = this.a.d;
            if (list.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = list.get(0);
                float fB = ((jvk) obj2).a.b();
                int iE = fcva.e(list);
                if (iE > 0) {
                    int i = 1;
                    while (true) {
                        Object obj3 = list.get(i);
                        float fB2 = ((jvk) obj3).a.b();
                        int iCompare = Float.compare(fB, fB2);
                        if (iCompare < 0) {
                            fB = fB2;
                        }
                        if (iCompare < 0) {
                            obj2 = obj3;
                        }
                        if (i == iE) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            jvk jvkVar = (jvk) obj;
            return Float.valueOf(jvkVar != null ? jvkVar.a.b() : 0.0f);
        }
    });
    private final fctc e = fctd.b(3, new fdae() { // from class: jve
        @Override // defpackage.fdae
        public final Object invoke() {
            Object obj;
            List list = this.a.d;
            if (list.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = list.get(0);
                float fA = ((jvk) obj2).a.a();
                int iE = fcva.e(list);
                if (iE > 0) {
                    int i = 1;
                    while (true) {
                        Object obj3 = list.get(i);
                        float fA2 = ((jvk) obj3).a.a();
                        int iCompare = Float.compare(fA, fA2);
                        if (iCompare < 0) {
                            fA = fA2;
                        }
                        if (iCompare < 0) {
                            obj2 = obj3;
                        }
                        if (i == iE) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            jvk jvkVar = (jvk) obj;
            return Float.valueOf(jvkVar != null ? jvkVar.a.a() : 0.0f);
        }
    });

    public jvf(juo juoVar, jyq jyqVar, List list, kio kioVar, kbi kbiVar) {
        String strSubstring;
        jum jumVar;
        int i;
        int i2;
        juo juoVar2 = juoVar;
        jyq jyqVar2 = jyqVar;
        this.a = juoVar2;
        this.b = list;
        jvn jvnVar = jyqVar2.c;
        juo juoVar3 = jur.a;
        List list2 = juoVar2.d;
        List listAl = list2 != null ? fcva.al(list2, new juq()) : fcvo.a;
        ArrayList arrayList = new ArrayList();
        fcuq fcuqVar = new fcuq();
        int size = listAl.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            jum jumVar2 = (jum) listAl.get(i4);
            jum jumVarA = jum.a(jumVar2, jvnVar.a((jvn) jumVar2.a), 0, 14);
            while (true) {
                i2 = jumVarA.b;
                if (i3 >= i2 || fcuqVar.isEmpty()) {
                    break;
                }
                jum jumVar3 = (jum) fcuqVar.e();
                int i5 = jumVarA.b;
                int i6 = jumVar3.c;
                if (i5 < i6) {
                    arrayList.add(new jum(jumVar3.a, i3, i5));
                    i3 = jumVarA.b;
                } else {
                    arrayList.add(new jum(jumVar3.a, i3, i6));
                    i3 = jumVar3.c;
                    while (!fcuqVar.isEmpty() && i3 == ((jum) fcuqVar.e()).c) {
                        fcuqVar.removeLast();
                    }
                }
            }
            if (i3 < i2) {
                arrayList.add(new jum(jvnVar, i3, i2));
                i3 = jumVarA.b;
            }
            jum jumVar4 = (jum) fcuqVar.f();
            if (jumVar4 != null) {
                int i7 = jumVar4.b;
                if (i7 == jumVarA.b && jumVar4.c == jumVarA.c) {
                    fcuqVar.removeLast();
                    fcuqVar.add(new jum(((jvn) jumVar4.a).a((jvn) jumVarA.a), jumVarA.b, jumVarA.c));
                } else {
                    int i8 = jumVar4.c;
                    if (i7 == i8) {
                        arrayList.add(new jum(jumVar4.a, i7, i8));
                        fcuqVar.removeLast();
                        fcuqVar.add(new jum(jumVarA.a, jumVarA.b, jumVarA.c));
                    } else {
                        if (i8 < jumVarA.c) {
                            throw new IllegalArgumentException();
                        }
                        fcuqVar.add(new jum(((jvn) jumVar4.a).a((jvn) jumVarA.a), jumVarA.b, jumVarA.c));
                    }
                }
            } else {
                fcuqVar.add(new jum(jumVarA.a, jumVarA.b, jumVarA.c));
            }
        }
        while (i3 <= juoVar2.b.length() && !fcuqVar.isEmpty()) {
            jum jumVar5 = (jum) fcuqVar.e();
            arrayList.add(new jum(jumVar5.a, i3, jumVar5.c));
            i3 = jumVar5.c;
            while (!fcuqVar.isEmpty() && i3 == ((jum) fcuqVar.e()).c) {
                fcuqVar.removeLast();
            }
        }
        if (i3 < juoVar2.b.length()) {
            arrayList.add(new jum(jvnVar, i3, juoVar2.b.length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new jum(jvnVar, 0, 0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            jum jumVar6 = (jum) arrayList.get(i9);
            int i10 = jumVar6.b;
            int i11 = jumVar6.c;
            if (i10 != i11) {
                strSubstring = juoVar2.b.substring(i10, i11);
                strSubstring.getClass();
            } else {
                strSubstring = "";
            }
            List listA = jur.a(juoVar2, i10, i11, new fdap() { // from class: jup
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    juo juoVar4 = jur.a;
                    return Boolean.valueOf(!(((jui) obj) instanceof jvn));
                }
            });
            juo juoVar4 = new juo(strSubstring, listA == null ? fcvo.a : listA);
            jvn jvnVar2 = (jvn) jumVar6.a;
            if (khm.b(jvnVar2.b, Integer.MIN_VALUE)) {
                jumVar = jumVar6;
                jvnVar2 = new jvn(jvnVar2.a, jvnVar.b, jvnVar2.c, jvnVar2.d, jvnVar2.e, jvnVar2.f, jvnVar2.g, jvnVar2.h, jvnVar2.i);
            } else {
                jumVar = jumVar6;
            }
            String str = juoVar4.b;
            jyq jyqVar3 = new jyq(jyqVar2.b, jyqVar2.c.a(jvnVar2));
            List list3 = juoVar4.a;
            List list4 = list3 == null ? fcvo.a : list3;
            List list5 = this.b;
            int i12 = jumVar.b;
            int i13 = jumVar.c;
            ArrayList arrayList3 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i14 = 0;
            while (i14 < size3) {
                int i15 = i14;
                jum jumVar7 = (jum) list5.get(i14);
                jvn jvnVar3 = jvnVar;
                int i16 = jumVar7.b;
                ArrayList arrayList4 = arrayList;
                int i17 = jumVar7.c;
                if (jur.b(i12, i13, i16, i17)) {
                    if (i12 > i16 || i17 > i13) {
                        kfq.b("placeholder can not overlap with paragraph.");
                    }
                    i = size2;
                    arrayList3.add(new jum(jumVar7.a, jumVar7.b - i12, jumVar7.c - i12));
                } else {
                    i = size2;
                }
                i14 = i15 + 1;
                jvnVar = jvnVar3;
                arrayList = arrayList4;
                size2 = i;
            }
            arrayList2.add(new jvk(new kfz(str, jyqVar3, list4, arrayList3, kbiVar, kioVar), jumVar.b, jumVar.c));
            i9++;
            juoVar2 = juoVar;
            jyqVar2 = jyqVar;
            jvnVar = jvnVar;
        }
        this.d = arrayList2;
    }

    @Override // defpackage.jvl
    public final float a() {
        return ((Number) this.e.a()).floatValue();
    }

    @Override // defpackage.jvl
    public final float b() {
        throw null;
    }

    @Override // defpackage.jvl
    public final boolean c() {
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((jvk) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
