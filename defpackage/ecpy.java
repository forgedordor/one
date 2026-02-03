package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecpy extends ecpm {
    @Deprecated
    public static ecpy c(Context context, CronetEngine cronetEngine) {
        ecri ecriVar = new ecri(cronetEngine);
        context.getClass();
        ejwl.b(true, "SDK < 16 isn't supported");
        ecqf ecqfVar = ecqf.a;
        ecsj ecsjVar = new ecsj();
        if (ecrz.b == null) {
            synchronized (ecrz.a) {
                if (ecrz.b == null) {
                    ecrz.b = context;
                }
            }
        }
        ecrz.c = ecsjVar;
        long j = ecse.a;
        ecqm ecqmVar = new ecqm(context);
        ecqc ecqcVar = ecqc.a;
        ecqcVar.c = ecqmVar;
        ecsa.a().a = new ecqn();
        ecqcVar.d = ecriVar;
        return new ecpy();
    }
}
