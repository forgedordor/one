package com.google.knowledge.hobbes.chat.tflite.reranker;

import defpackage.a;
import defpackage.ejkx;
import defpackage.ekgb;
import defpackage.ekqh;
import defpackage.euod;
import defpackage.euof;
import defpackage.euoh;
import defpackage.euoi;
import defpackage.euoj;
import defpackage.euok;
import defpackage.euol;
import defpackage.euom;
import defpackage.euoy;
import defpackage.ezal;
import defpackage.ezan;
import defpackage.ezgg;
import defpackage.ezgi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TfLiteReranker implements euof {
    long a;
    private final int b;

    public TfLiteReranker(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static native long createFromUri(String str);

    private static String e(euoi euoiVar) {
        return ejkx.a(euoiVar.a);
    }

    private native void internalClose(long j);

    private native Map<String, List<Float>> runGraph(long j, List<List<Float>> list, List<List<Integer>> list2, List<List<Integer>> list3, List<List<String>> list4, List<Integer> list5, List<String> list6, List<Integer> list7, List<Integer> list8);

    @Override // defpackage.euof
    public final synchronized euom a(euoj euojVar, boolean z, int i, float f, int i2) {
        List list = euojVar.a;
        if (list.isEmpty()) {
            return new euom(new ArrayList());
        }
        List listC = c(euojVar);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            arrayList.add(new euol((euoi) list.get(i4), ((Float) listC.get(i4)).floatValue()));
        }
        if (z) {
            Collections.sort(arrayList, new euoy());
        }
        euom euomVar = new euom(arrayList);
        int i5 = i - 1;
        if (i5 == 0) {
            return euomVar;
        }
        if (i5 == 1) {
            if ((z ? ((euol) arrayList.get(0)).b : ((Float) Collections.max(listC)).floatValue()) <= f) {
                arrayList = new ArrayList();
            }
            return new euom(arrayList);
        }
        if (i5 == 2) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i3 < size) {
                euol euolVar = (euol) arrayList.get(i3);
                if (euolVar.b > f) {
                    arrayList2.add(euolVar);
                }
                i3++;
            }
            return new euom(arrayList2);
        }
        if (i2 == 0 || i2 > this.b) {
            throw new IllegalArgumentException("targetImpressionSize is " + i2 + " but should be at least 1 and at most " + this.b);
        }
        ArrayList arrayList3 = new ArrayList();
        while (i3 < i2) {
            arrayList3.add(((euol) arrayList.get(i3)).a);
            i3++;
        }
        euoh euohVar = new euoh(arrayList3);
        float fB = b(new euoj(euohVar, euojVar.c));
        euok euokVar = new euok(euohVar, fB);
        ArrayList arrayList4 = new ArrayList();
        if (fB > f) {
            arrayList4.add(euokVar);
        }
        return new euom(arrayList, arrayList4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized float b(euoj euojVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        List list = euojVar.b;
        if (list.size() != 1) {
            throw new IllegalArgumentException("rerankerInput.impressions has size" + list.size() + " but should contain 1 impression.");
        }
        int i2 = 0;
        List<euoi> list2 = ((euoh) list.get(0)).a;
        int size = list2.size();
        int i3 = this.b;
        if (size > i3 || size == 0) {
            throw new IllegalArgumentException(a.s(i3, size, "Candidate impression had ", " suggestions, but the minimum is 1 and the maximum is "));
        }
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList3 = new ArrayList();
        arrayList4 = new ArrayList();
        arrayList5 = new ArrayList();
        arrayList5.add(Integer.valueOf(size));
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        for (euoi euoiVar : list2) {
            int i4 = i2;
            ezgi ezgiVar = euoiVar.a;
            List list3 = list2;
            ezgg ezggVar = ezgiVar.e;
            if (ezggVar == null) {
                ezggVar = ezgg.b;
            }
            arrayList9.add(Float.valueOf(ezggVar.f));
            ezgg ezggVar2 = ezgiVar.e;
            if (ezggVar2 == null) {
                ezggVar2 = ezgg.b;
            }
            ezan ezanVarB = ezan.b(ezggVar2.l);
            if (ezanVarB == null) {
                ezanVarB = ezan.UNRECOGNIZED;
            }
            arrayList10.add(Integer.valueOf(ezanVarB.a()));
            ezgg ezggVar3 = ezgiVar.e;
            if (ezggVar3 == null) {
                ezggVar3 = ezgg.b;
            }
            ezal ezalVarB = ezal.b(ezggVar3.g);
            if (ezalVarB == null) {
                ezalVarB = ezal.UNRECOGNIZED;
            }
            arrayList11.add(Integer.valueOf(ezalVarB.a()));
            arrayList12.add(e(euoiVar));
            i2 = i4;
            list2 = list3;
        }
        i = i2;
        int size2 = list2.size();
        for (int i5 = i; i5 < i3 - size2; i5++) {
            arrayList9.add(Float.valueOf(0.0f));
            Integer numValueOf = Integer.valueOf(i);
            arrayList10.add(numValueOf);
            arrayList11.add(numValueOf);
            arrayList12.add("");
        }
        arrayList.add(arrayList9);
        arrayList2.add(arrayList10);
        arrayList3.add(arrayList11);
        arrayList4.add(arrayList12);
        arrayList6 = new ArrayList();
        arrayList7 = new ArrayList();
        arrayList8 = new ArrayList();
        ekqh it = ((ekgb) euojVar.c).iterator();
        while (it.hasNext()) {
            euod euodVar = (euod) it.next();
            arrayList6.add(euodVar.a);
            arrayList7.add(Integer.valueOf(euodVar.b));
            arrayList8.add(Integer.valueOf((int) euodVar.c));
        }
        return runGraph(this.a, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8).get("output_probabilities").get(i).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized List c(euoj euojVar) throws Throwable {
        Throwable th;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (euoi euoiVar : euojVar.a) {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ezgi ezgiVar = euoiVar.a;
                        ezgg ezggVar = ezgiVar.e;
                        if (ezggVar == null) {
                            ezggVar = ezgg.b;
                        }
                        arrayList6.add(Float.valueOf(ezggVar.f));
                        ezgg ezggVar2 = ezgiVar.e;
                        if (ezggVar2 == null) {
                            ezggVar2 = ezgg.b;
                        }
                        ezan ezanVarB = ezan.b(ezggVar2.l);
                        if (ezanVarB == null) {
                            ezanVarB = ezan.UNRECOGNIZED;
                        }
                        arrayList7.add(Integer.valueOf(ezanVarB.a()));
                        ezgg ezggVar3 = ezgiVar.e;
                        if (ezggVar3 == null) {
                            ezggVar3 = ezgg.b;
                        }
                        ezal ezalVarB = ezal.b(ezggVar3.g);
                        if (ezalVarB == null) {
                            ezalVarB = ezal.UNRECOGNIZED;
                        }
                        arrayList8.add(Integer.valueOf(ezalVarB.a()));
                        arrayList9.add(e(euoiVar));
                        for (int i = 0; i < this.b - 1; i++) {
                            arrayList6.add(Float.valueOf(0.0f));
                            arrayList7.add(0);
                            arrayList8.add(0);
                            arrayList9.add("");
                        }
                        arrayList.add(arrayList6);
                        arrayList2.add(arrayList7);
                        arrayList3.add(arrayList8);
                        arrayList4.add(arrayList9);
                        arrayList5.add(1);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ekqh it = ((ekgb) euojVar.c).iterator();
                while (it.hasNext()) {
                    euod euodVar = (euod) it.next();
                    arrayList10.add(euodVar.a);
                    arrayList11.add(Integer.valueOf(euodVar.b));
                    arrayList12.add(Integer.valueOf((int) euodVar.c));
                }
                return runGraph(this.a, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList10, arrayList11, arrayList12).get("output_probabilities");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    final synchronized void d() {
        internalClose(this.a);
        this.a = 0L;
    }

    protected final void finalize() {
        d();
    }
}
