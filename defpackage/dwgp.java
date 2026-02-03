package defpackage;

import com.android.vcard.VCardConstants;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgp {
    public static ejwi a(dwqw dwqwVar) {
        if (!c(dwqwVar)) {
            return ejud.a;
        }
        HashMap mapG = dvhy.g(((dwnt) dwqwVar.h().b()).b);
        int i = dwhf.i;
        dwhc dwhcVar = new dwhc();
        dwhcVar.h((String) mapG.get("MESSAGE_TEXT"));
        dwhcVar.i((String) mapG.get(VCardConstants.PROPERTY_TITLE));
        dwhcVar.c((String) mapG.get("DESCRIPTION"));
        dwhcVar.g((String) mapG.get("IMAGE_URL"));
        dwhcVar.d((String) mapG.get("DOMAIN"));
        dwhcVar.b((String) mapG.get("CANONICAL_URL"));
        if (mapG.containsKey("IMAGE")) {
            dwhcVar.f(dvhy.a((byte[]) mapG.get("IMAGE")));
        }
        if (mapG.containsKey("EXPIRATION_TIME_MS")) {
            dwhcVar.e(((Long) mapG.get("EXPIRATION_TIME_MS")).longValue());
        }
        return ejwi.j(dwhcVar.a());
    }

    public static String b(dwqw dwqwVar) {
        return dwqwVar.h().a() == 2 ? dwqwVar.h().d() : c(dwqwVar) ? ((dwhd) a(dwqwVar).c()).a : "";
    }

    public static boolean c(dwqw dwqwVar) {
        return dwqwVar.h().a() == 3 && ((dwnt) dwqwVar.h().b()).a.equals("link_preview");
    }
}
