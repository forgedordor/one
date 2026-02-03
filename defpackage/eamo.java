package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eamo extends eamt {
    public eamo(eava eavaVar, Locale locale, String str, eaww eawwVar) {
        super(eavaVar, locale, str, eawwVar);
    }

    @Override // defpackage.eamt
    protected final String d() {
        return "details/json";
    }

    @Override // defpackage.eamt
    public final Map e() {
        eava eavaVar = (eava) this.a;
        HashMap map = new HashMap();
        f(map, "placeid", eavaVar.b());
        f(map, "sessiontoken", null);
        f(map, "fields", eanh.a(eavaVar.c()));
        return map;
    }
}
