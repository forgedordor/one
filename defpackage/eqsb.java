package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsb {
    public static eqso a(eqsa eqsaVar) throws IOException {
        try {
            InputStream inputStream = eqsaVar.a;
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            erml ermlVar = (erml) evsn.parseFrom(erml.a, inputStream, evrr.a);
            eqsaVar.a.close();
            return eqso.d(ermlVar);
        } catch (Throwable th) {
            eqsaVar.a.close();
            throw th;
        }
    }
}
