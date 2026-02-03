package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eilp {
    public static void a(ea eaVar, Intent intent) {
        Intent intent2 = new Intent(intent);
        eihr eihrVarT = eiid.t(intent2);
        try {
            eaVar.aD(intent2);
            eihrVarT.close();
        } catch (Throwable th) {
            try {
                eihrVarT.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
