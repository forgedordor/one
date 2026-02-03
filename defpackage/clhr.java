package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhr {
    public static final clmw a(String str) throws clhs {
        try {
            byte[] bArrDecode = Base64.decode(str, 3);
            bArrDecode.getClass();
            try {
                clmw clmwVar = (clmw) evsn.parseFrom(clmw.a, bArrDecode, evrr.a());
                clmwVar.getClass();
                return clmwVar;
            } catch (evtj e) {
                throw new clhs("Malformed raw proto", e);
            }
        } catch (IllegalArgumentException e2) {
            throw new clhs("Not a Base64 encoded string", e2);
        }
    }
}
