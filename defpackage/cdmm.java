package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmm {
    public static final Uri a(alqm alqmVar) {
        alqmVar.getClass();
        Uri uriBuild = new Uri.Builder().scheme((alqmVar.t() || alqmVar.A()) ? "mailto" : "sms").opaquePart(eotp.a("bugle.use_normalized_destination_in_trusted_contacts", "bugle") ? alqmVar.l() : alqmVar.o()).build();
        uriBuild.getClass();
        return uriBuild;
    }

    public static final String b(alqm alqmVar) {
        alqmVar.getClass();
        String strL = alqmVar.l();
        return strL == null ? "" : strL;
    }

    public static final Map c(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((Uri) entry.getKey()).getSchemeSpecificPart(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final boolean d(akbk akbkVar) {
        return akbkVar == akbk.a || akbkVar == akbk.d;
    }
}
