package defpackage;

import android.content.Context;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dblg extends dcfm {
    private static final dcfd a;
    private static final dceu b;
    private static final dcfe m;

    static {
        dcfd dcfdVar = new dcfd();
        a = dcfdVar;
        dbla dblaVar = new dbla();
        b = dblaVar;
        m = new dcfe("Asterism.API", dblaVar, dcfdVar);
    }

    public dblg(Context context) {
        super(context, m, dcfa.q, dcfl.a);
    }

    public final defn a(SetAsterismConsentRequest setAsterismConsentRequest) {
        dciz dcizVar = new dciz();
        dcizVar.a = new dble(setAsterismConsentRequest);
        dcizVar.b = new Feature[]{dcod.a};
        dcizVar.c = 11302;
        return j(dcizVar.a());
    }
}
