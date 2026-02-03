package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaml extends eamt {
    public eaml(eaux eauxVar, String str, eaww eawwVar) {
        super(eauxVar, null, str, eawwVar);
    }

    @Override // defpackage.eamt
    protected final String d() {
        return "photo";
    }

    @Override // defpackage.eamt
    public final Map e() {
        eaux eauxVar = (eaux) this.a;
        easz easzVarB = eauxVar.b();
        HashMap map = new HashMap();
        f(map, "maxheight", eauxVar.c());
        f(map, "maxwidth", eauxVar.d());
        map.put("photoreference", easzVarB.f());
        return map;
    }
}
