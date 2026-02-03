package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chsl {
    private final fcsu a;

    public chsl(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public static final void b(brvp brvpVar, String str, String str2) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            brvpVar.G(chpq.PROFILE_UNSPECIFIED_SOURCE);
            brvpVar.u(null);
            brvpVar.t(null);
        } else {
            brvpVar.G(chpq.PROFILE_CONTACT_SOURCE);
            brvpVar.u(str);
            brvpVar.t(str2);
        }
    }

    public final void a(brvp brvpVar, String str) {
        if (str == null || str.length() == 0) {
            brvpVar.n(null);
        } else {
            brvpVar.n(Uri.parse(str));
        }
        chpq chpqVar = brvpVar.Q;
        chpq chpqVar2 = chpq.PROFILE_PEOPLE_SHARING_SOURCE;
        if (chpqVar == chpqVar2) {
            return;
        }
        if (chpqVar == chpqVar2) {
        }
        if (str == null || str.length() == 0) {
            brvpVar.K(chpq.PROFILE_UNSPECIFIED_SOURCE);
            brvpVar.N(null);
        } else {
            brvpVar.K(chpq.PROFILE_CONTACT_SOURCE);
            brvpVar.N(Uri.parse(str));
        }
    }
}
