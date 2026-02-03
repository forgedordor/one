package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rag {
    long a;
    final String b;
    final String c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List h;

    public rag(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    static rag a(rah rahVar) throws IOException {
        if (rai.e(rahVar) != 538247942) {
            throw new IOException();
        }
        String strH = rai.h(rahVar);
        String strH2 = rai.h(rahVar);
        long jF = rai.f(rahVar);
        long jF2 = rai.f(rahVar);
        long jF3 = rai.f(rahVar);
        long jF4 = rai.f(rahVar);
        int iE = rai.e(rahVar);
        if (iE < 0) {
            throw new IOException(a.g(iE, "readHeaderList size="));
        }
        List arrayList = iE == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iE; i++) {
            arrayList.add(new qzh(rai.h(rahVar).intern(), rai.h(rahVar).intern()));
        }
        return new rag(strH, strH2, jF, jF2, jF3, jF4, arrayList);
    }
}
