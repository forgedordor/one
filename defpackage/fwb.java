package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwb {
    private static ioi a;

    public static final ioi a() {
        ioi ioiVar = a;
        if (ioiVar != null) {
            return ioiVar;
        }
        float f = 24.0f;
        iog iogVar = new iog("Filled.ArrowBack", f, f, f, f, 0L, 0, false, 96);
        List list = ipr.a;
        ikt iktVar = new ikt(ije.a);
        ArrayList arrayList = new ArrayList(32);
        ioj.i(20.0f, 11.0f, arrayList);
        ioj.e(7.83f, arrayList);
        ioj.h(5.59f, -5.59f, arrayList);
        ioj.g(12.0f, 4.0f, arrayList);
        ioj.h(-8.0f, 8.0f, arrayList);
        ioj.h(8.0f, 8.0f, arrayList);
        ioj.h(1.41f, -1.41f, arrayList);
        ioj.g(7.83f, 13.0f, arrayList);
        ioj.e(20.0f, arrayList);
        ioj.m(-2.0f, arrayList);
        ioj.b(arrayList);
        iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
        ioi ioiVarA = iogVar.a();
        a = ioiVarA;
        ioiVarA.getClass();
        return ioiVarA;
    }
}
