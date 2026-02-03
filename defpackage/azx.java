package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azx {
    final List a;
    final List b;
    final List c;
    public long d;

    public azx(azy azyVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.c = arrayList3;
        this.d = 5000L;
        arrayList.addAll(azyVar.a);
        arrayList2.addAll(azyVar.b);
        arrayList3.addAll(azyVar.c);
        this.d = azyVar.d;
    }

    public final void a(bbx bbxVar, int i) {
        lcg.b(true, "Point cannot be null.");
        lcg.b(true, a.g(i, "Invalid metering mode "));
        if ((i & 1) != 0) {
            this.a.add(bbxVar);
        }
        if ((i & 2) != 0) {
            this.b.add(bbxVar);
        }
    }

    public final void b(int i) {
        if ((i & 1) != 0) {
            this.a.clear();
        }
        if ((i & 2) != 0) {
            this.b.clear();
        }
        if ((i & 4) != 0) {
            this.c.clear();
        }
    }

    public azx(bbx bbxVar) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = 5000L;
        a(bbxVar, 1);
    }
}
