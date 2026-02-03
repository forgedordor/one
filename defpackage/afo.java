package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afo extends ajn {
    public final String a;
    final List b;
    public final String c;
    private final List d;

    public afo(String str, List list, List list2) {
        this.a = str;
        lcg.i(list);
        this.b = list;
        this.d = list2;
        this.c = "";
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.d);
    }

    public final List b() {
        afl afnVar;
        List list = this.b;
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ajy ajyVar = (ajy) list.get(i);
            lcg.i(ajyVar);
            switch (ajyVar.b) {
                case 1:
                    afnVar = new afn(ajyVar);
                    break;
                case 2:
                    afnVar = new afk(ajyVar);
                    break;
                case 3:
                    afnVar = new afh(ajyVar);
                    break;
                case 4:
                    afnVar = new afa(ajyVar);
                    break;
                case 5:
                    afnVar = new afd(ajyVar);
                    break;
                case 6:
                    afnVar = new aff(ajyVar);
                    break;
                default:
                    afnVar = new afi(ajyVar);
                    break;
            }
            arrayList.add(afnVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afo)) {
            return false;
        }
        afo afoVar = (afo) obj;
        if (this.a.equals(afoVar.a) && this.c.equals(afoVar.c) && a().equals(afoVar.a())) {
            return b().equals(afoVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, b(), a(), this.c);
    }

    public final String toString() {
        akf akfVar = new akf();
        akfVar.a("{\n");
        akfVar.d();
        akfVar.a("schemaType: \"");
        akfVar.a(this.a);
        akfVar.a("\",\n");
        akfVar.a("description: \"");
        akfVar.a(this.c);
        akfVar.a("\",\n");
        akfVar.a("properties: [\n");
        int i = 0;
        afl[] aflVarArr = (afl[]) b().toArray(new afl[0]);
        Arrays.sort(aflVarArr, new Comparator() { // from class: aex
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((afl) obj).g().compareTo(((afl) obj2).g());
            }
        });
        while (true) {
            int length = aflVarArr.length;
            if (i >= length) {
                akfVar.a("\n");
                akfVar.a("]\n");
                akfVar.c();
                akfVar.a("}");
                return akfVar.toString();
            }
            afl aflVar = aflVarArr[i];
            akfVar.d();
            aflVar.h(akfVar);
            if (i != length - 1) {
                akfVar.a(",\n");
            }
            akfVar.c();
            i++;
        }
    }
}
