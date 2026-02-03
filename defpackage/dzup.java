package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzup {
    public final dzuo a;
    private long b = 1;

    public dzup(dzuo dzuoVar) {
        this.a = dzuoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(dzuo dzuoVar, long j, ArrayList arrayList) {
        List list;
        if (dzuoVar.f == null) {
            list = dzuoVar.f == null ? Collections.EMPTY_LIST : dzuoVar.f;
        } else {
            list = dzuoVar.f;
            dzuoVar.f = null;
        }
        if (dzuoVar.c() && list.isEmpty()) {
            return;
        }
        fefp fefpVar = (fefp) fefr.a.createBuilder();
        int i = dzuoVar.g;
        String str = dzuoVar.b;
        fefpVar.copyOnWrite();
        fefr fefrVar = (fefr) fefpVar.instance;
        str.getClass();
        fefrVar.b |= 1;
        fefrVar.c = str;
        long j2 = dzuoVar.c;
        fefpVar.copyOnWrite();
        fefr fefrVar2 = (fefr) fefpVar.instance;
        fefrVar2.b |= 512;
        fefrVar2.h = j2;
        long jA = dzuoVar.a();
        fefpVar.copyOnWrite();
        fefr fefrVar3 = (fefr) fefpVar.instance;
        fefrVar3.b |= 1024;
        fefrVar3.i = jA;
        long j3 = dzuoVar.e;
        fefpVar.copyOnWrite();
        fefr fefrVar4 = (fefr) fefpVar.instance;
        fefrVar4.b |= 4096;
        fefrVar4.j = j3;
        long j4 = this.b;
        this.b = 1 + j4;
        fefpVar.copyOnWrite();
        fefr fefrVar5 = (fefr) fefpVar.instance;
        fefrVar5.b |= 8;
        fefrVar5.f = j4;
        fefpVar.copyOnWrite();
        fefr fefrVar6 = (fefr) fefpVar.instance;
        fefrVar6.b |= 16;
        fefrVar6.g = j;
        int i2 = dzuoVar.h - 1;
        if (i2 == 1) {
            fefpVar.copyOnWrite();
            fefr fefrVar7 = (fefr) fefpVar.instance;
            fefrVar7.k = 1;
            fefrVar7.b |= 8192;
        } else if (i2 != 3) {
            fefpVar.copyOnWrite();
            fefr fefrVar8 = (fefr) fefpVar.instance;
            fefrVar8.k = 0;
            fefrVar8.b |= 8192;
        } else {
            fefpVar.copyOnWrite();
            fefr fefrVar9 = (fefr) fefpVar.instance;
            fefrVar9.k = 4;
            fefrVar9.b |= 8192;
        }
        if (dzuoVar.c()) {
            long j5 = ((dzuo) list.get(list.size() - 1)).d - j2;
            fefpVar.copyOnWrite();
            fefr fefrVar10 = (fefr) fefpVar.instance;
            fefrVar10.b |= 1024;
            fefrVar10.i = j5;
        }
        arrayList.add((fefr) fefpVar.build());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((dzuo) it.next(), ((fefr) fefpVar.instance).f, arrayList);
        }
    }
}
