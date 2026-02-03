package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvve {
    public static ejwi a(HashMap map) {
        try {
            final dwrg dwrgVarI = dwrh.i();
            if (map.containsKey("A11Y_TEXT")) {
                dwrgVarI.b((String) map.get("A11Y_TEXT"));
            }
            if (map.containsKey("LIGHTER_ICON")) {
                dvhx.b(dvuo.a((HashMap) map.get("LIGHTER_ICON")), new lbz() { // from class: dvvb
                    @Override // defpackage.lbz
                    public final void accept(Object obj) {
                        dwrgVarI.f((dwqf) obj);
                    }
                });
            }
            dwrgVarI.g((String) map.get("TEXT"));
            ((dwob) dwrgVarI).a = (dwjr) dvhx.a(dvhy.b(map.get("ACTION")), new ejvr() { // from class: dvvc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return dvua.a((HashMap) obj);
                }
            }).c();
            dwrgVarI.h(((Integer) map.get("TEXT_COLOR")).intValue());
            dwrgVarI.c(((Integer) map.get("BACKGROUND_COLOR")).intValue());
            dwrgVarI.d(((Integer) map.get("BORDER_COLOR")).intValue());
            dwrgVarI.e(((Boolean) map.get("ENABLED")).booleanValue());
            return ejwi.j(dwrgVarI.a());
        } catch (IllegalStateException | NullPointerException e) {
            dvhv.d("RCButtonsConverters", "failed to convert Map to RichCardButton", e);
            return ejud.a;
        }
    }

    public static HashMap b(final dwrh dwrhVar) {
        final HashMap map = new HashMap();
        map.put("TEXT", dwrhVar.g());
        dvhx.b(dwrhVar.e(), new lbz() { // from class: dvuy
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                map.put("A11Y_TEXT", dwrhVar.e().c());
            }
        });
        dvhx.b(dwrhVar.f(), new lbz() { // from class: dvuz
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                map.put("LIGHTER_ICON", dvuo.b((dwqf) obj));
            }
        });
        map.put("ACTION", dvua.b(dwrhVar.d()));
        map.put("TEXT_COLOR", Integer.valueOf(dwrhVar.c()));
        map.put("BACKGROUND_COLOR", Integer.valueOf(dwrhVar.a()));
        map.put("BORDER_COLOR", Integer.valueOf(dwrhVar.b()));
        map.put("ENABLED", Boolean.valueOf(dwrhVar.h()));
        return map;
    }
}
