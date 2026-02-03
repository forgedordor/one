package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdx {
    public fexj a;
    private final fhdq b;
    private feyq c;
    private final List d;
    private final List e;

    public fhdx() {
        fhdq fhdqVar = fhdq.a;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = fhdqVar;
    }

    public final fhdy a() {
        if (this.c == null) {
            throw new IllegalStateException("Base URL required.");
        }
        fexj feyyVar = this.a;
        if (feyyVar == null) {
            feyyVar = new feyy(new feyx());
        }
        fhdq fhdqVar = this.b;
        List list = this.e;
        Executor executorA = fhdqVar.a();
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(Arrays.asList(fhbt.a, new fhcb(executorA)));
        List list2 = this.d;
        ArrayList arrayList2 = new ArrayList(list2.size() + 2);
        arrayList2.add(new fhbj());
        arrayList2.addAll(list2);
        arrayList2.addAll(Collections.singletonList(fhcv.a));
        return new fhdy(feyyVar, this.c, DesugarCollections.unmodifiableList(arrayList2), DesugarCollections.unmodifiableList(arrayList));
    }

    public final void b(fhbl fhblVar) {
        this.e.add(fhblVar);
    }

    public final void c(fhbu fhbuVar) {
        this.d.add(fhbuVar);
    }

    public final void d(String str) {
        char[] cArr = feyq.a;
        feyq feyqVarB = feyp.b(str);
        if (!"".equals(feyqVarB.e.get(r0.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: ".concat(feyqVarB.g));
        }
        this.c = feyqVarB;
    }
}
