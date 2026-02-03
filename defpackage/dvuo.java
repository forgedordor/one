package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvuo {
    public static ejwi a(HashMap map) {
        dwqe dwqeVarF = dwqf.f();
        try {
            dwqeVarF.d((byte[]) map.get("ICON"));
            dwqeVarF.f(((Integer) map.get("ICON_WIDTH")).intValue());
            dwqeVarF.c(((Integer) map.get("ICON_HEIGHT")).intValue());
            dwqeVarF.e((String) map.get("TALK_BACK_DESCRIPTION"));
            if (map.containsKey("ICON_COLOR")) {
                dwqeVarF.b(((Integer) map.get("ICON_COLOR")).intValue());
            }
            return ejwi.j(dwqeVarF.a());
        } catch (NullPointerException e) {
            dvhv.d("LitIconConv", "failed to convert Map to LighterIcon", e);
            return ejud.a;
        }
    }

    public static HashMap b(dwqf dwqfVar) {
        HashMap map = new HashMap();
        map.put("ICON", dwqfVar.e());
        map.put("ICON_WIDTH", Integer.valueOf(dwqfVar.b()));
        map.put("ICON_HEIGHT", Integer.valueOf(dwqfVar.a()));
        map.put("TALK_BACK_DESCRIPTION", dwqfVar.d());
        if (dwqfVar.c().g()) {
            map.put("ICON_COLOR", dwqfVar.c().c());
        }
        return map;
    }
}
