package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dvtt implements ejvr {
    @Override // defpackage.ejvr
    public final Object apply(Object obj) {
        HashMap map = (HashMap) obj;
        try {
            dwqr dwqrVarK = dwqs.k();
            dwqrVarK.k(((Integer) map.get("time_to_live_sec")).intValue());
            dwqrVarK.j(((Integer) map.get("OVERLAY_STYLE")).intValue());
            if (map.containsKey("dismiss_action")) {
                ejwi ejwiVarB = dvhy.b(map.get("dismiss_action"));
                dwjr dwjrVarA = null;
                if (ejwiVarB.g()) {
                    Object objC = ejwiVarB.c();
                    if (dwjj.a(((Integer) ((HashMap) objC).get("ACTION_TYPE")).intValue()).equals(dwjj.NO_OP_ACTION)) {
                        dwjk dwjkVarF = dwjr.f();
                        dvua.c(dwjkVarF, (HashMap) objC);
                        dwjkVarF.t();
                        dwjrVarA = dwjkVarF.a();
                    } else {
                        dvhv.c("ActionConv", "failed to convert Map to OverlayAction overlay action can only contain no op action");
                    }
                } else {
                    dvhv.c("ActionConv", "failed to deserialize Map");
                }
                if (dwjrVarA == null) {
                    return ejud.a;
                }
                dwqrVarK.b(dwjrVarA);
            }
            if (map.containsKey("display_icon")) {
                dwqrVarK.d((evqs) map.get("display_icon"));
            }
            if (map.containsKey("display_text")) {
                dwqrVarK.e((String) map.get("display_text"));
            }
            if (map.containsKey("overlay_expire_time")) {
                dwqrVarK.f(((Integer) map.get("overlay_expire_time")).intValue());
            }
            if (map.containsKey("overlay_lighter_icon")) {
                ejwi ejwiVarA = dvuo.a((HashMap) map.get("overlay_lighter_icon"));
                if (!ejwiVarA.g()) {
                    return ejud.a;
                }
                dwqrVarK.i((dwqf) ejwiVarA.c());
            }
            if (map.containsKey("hide_snippet_in_conversation_list")) {
                dwqrVarK.h(((Boolean) map.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            if (map.containsKey("hide_dismiss_button")) {
                dwqrVarK.g(((Boolean) map.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            if (map.containsKey("dismissible_by_tapping_outside")) {
                dwqrVarK.c(((Boolean) map.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            return ejwi.j(dwqrVarK.a());
        } catch (IllegalStateException | NullPointerException e) {
            dvhv.d("ActionConv", "failed to convert Map to OverlayAction", e);
            return ejud.a;
        }
    }
}
