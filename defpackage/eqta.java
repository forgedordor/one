package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqta {
    public static eqst a(byte[] bArr) throws GeneralSecurityException {
        try {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            ermh ermhVar = (ermh) evsn.parseFrom(ermh.a, bArr, evrr.a);
            erfb erfbVar = erfb.a;
            erfw erfwVarA = erfw.a(ermhVar);
            return !((erge) erfbVar.b.get()).d.containsKey(new ergc(erfwVarA.getClass(), erfwVarA.a)) ? new ereo(erfwVarA) : erfbVar.b(erfwVarA);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] b(eqst eqstVar) {
        return eqstVar instanceof ereo ? ((ereo) eqstVar).a.b.toByteArray() : ((erfw) erfb.a.d(eqstVar, erfw.class)).b.toByteArray();
    }
}
