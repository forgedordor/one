package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpy {
    static {
        Logger.getLogger(fcpy.class.getName());
    }

    private fcpy() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fcqr fcqrVar = (fcqr) it.next();
            bArr[i] = fcqrVar.f.k();
            bArr[i + 1] = fcqrVar.g.k();
            i += 2;
        }
        return fcmr.b(bArr);
    }
}
