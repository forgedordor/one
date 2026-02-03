package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcoc extends dcfm {
    public static final dcmc a = new dcmc("constellation", "client");
    private static final dcfd b;
    private static final dceu m;
    private static final dcfe n;

    static {
        dcfd dcfdVar = new dcfd();
        b = dcfdVar;
        dcnw dcnwVar = new dcnw();
        m = dcnwVar;
        n = new dcfe("Constellation.API", dcnwVar, dcfdVar);
    }

    public dcoc(Context context) {
        super(context, n, dcfa.q, dcfl.a);
    }

    public final defn a(VerifyPhoneNumberRequest verifyPhoneNumberRequest) {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcny(verifyPhoneNumberRequest);
        dcizVar.b = verifyPhoneNumberRequest.g == 3 ? new Feature[]{dcod.d, dcod.h} : new Feature[]{dcod.d};
        dcizVar.c = 11901;
        return j(dcizVar.a());
    }
}
