package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebci {
    public static void a(Map map) {
        for (Map.Entry entry : ((ekgp) map).entrySet()) {
            eieu eieuVarK = eiiy.k((String) entry.getKey());
            try {
                ((ebcg) ((fcsu) entry.getValue()).b()).a();
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
