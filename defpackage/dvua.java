package defpackage;

import com.android.vcard.VCardConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvua {
    public static ejwi a(HashMap map) {
        try {
            dwjk dwjkVarF = dwjr.f();
            c(dwjkVarF, map);
            dwjj dwjjVarA = dwjj.a(((Integer) map.get("ACTION_TYPE")).intValue());
            switch (dwjjVarA.ordinal()) {
                case 1:
                    ejwi ejwiVarA = dvhx.a(dvhy.b(map.get("ACTION_PAYLOAD")), new ejvr() { // from class: dvtu
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            HashMap map2 = (HashMap) obj;
                            try {
                                dwmj dwmjVar = new dwmj();
                                dwmjVar.c((String) map2.get("TEXT"));
                                dwmjVar.b((String) map2.get("MESSAGE_CALLBACK_PAYLOAD"));
                                return ejwi.j(dwmjVar.a());
                            } catch (IllegalStateException | NullPointerException e) {
                                dvhv.d("ActionConv", "failed to convert Map to ReplyActionPayload", e);
                                return ejud.a;
                            }
                        }
                    });
                    if (ejwiVarA.g()) {
                        dwjkVarF.m((dwjq) ejwiVarA.c());
                        break;
                    }
                    break;
                case 2:
                    ejwi ejwiVarA2 = dvhx.a(dvhy.b(map.get("ACTION_PAYLOAD")), new ejvr() { // from class: dvtu
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            HashMap map2 = (HashMap) obj;
                            try {
                                dwmj dwmjVar = new dwmj();
                                dwmjVar.c((String) map2.get("TEXT"));
                                dwmjVar.b((String) map2.get("MESSAGE_CALLBACK_PAYLOAD"));
                                return ejwi.j(dwmjVar.a());
                            } catch (IllegalStateException | NullPointerException e) {
                                dvhv.d("ActionConv", "failed to convert Map to ReplyActionPayload", e);
                                return ejud.a;
                            }
                        }
                    });
                    if (ejwiVarA2.g()) {
                        dwjkVarF.l((dwjq) ejwiVarA2.c());
                        break;
                    }
                    break;
                case 3:
                    dwjkVarF.e((String) map.get("ACTION_PAYLOAD"));
                    break;
                case 4:
                    dwjkVarF.q((String) map.get("ACTION_PAYLOAD"));
                    break;
                case 5:
                    ejwi ejwiVarA3 = dvhx.a(dvhy.b(map.get("ACTION_PAYLOAD")), new dvtt());
                    if (!ejwiVarA3.g()) {
                        return ejud.a;
                    }
                    dwmh dwmhVar = new dwmh();
                    dwmhVar.b((dwqs) ejwiVarA3.c());
                    dwjkVarF.r(dwmhVar.a());
                    break;
                case 6:
                    dwjkVarF.t();
                    break;
                case 7:
                    dwjkVarF.d((String) map.get("ACTION_PAYLOAD"));
                    break;
                case 8:
                    dwjkVarF.n((String) map.get("ACTION_PAYLOAD"));
                    break;
                case 9:
                    ejwi ejwiVarA4 = dvhx.a(dvhy.b(map.get("ACTION_PAYLOAD")), new ejvr() { // from class: dvtv
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            HashMap map2 = (HashMap) obj;
                            dwmh dwmhVar2 = new dwmh();
                            if (map2.containsKey("REACTION_OVERLAY_HEADER")) {
                                ejwi ejwiVarA5 = dvhx.a(dvhy.b(map2.get("REACTION_OVERLAY_HEADER")), new dvtt());
                                if (!ejwiVarA5.g()) {
                                    return ejud.a;
                                }
                                dwmhVar2.b((dwqs) ejwiVarA5.c());
                            }
                            if (map2.containsKey("STACKED_REACTION_WEB_VIEW")) {
                                ejwi ejwiVarB = dvhy.b(map2.get("STACKED_REACTION_WEB_VIEW"));
                                if (ejwiVarB.g()) {
                                    ejwi ejwiVarA6 = dvhx.a(dvhy.b(((HashMap) ejwiVarB.c()).get("WEB_VIEW_HEADER")), new dvtt());
                                    if (!ejwiVarA6.g()) {
                                        return ejud.a;
                                    }
                                    dwnf dwnfVar = new dwnf();
                                    dwnfVar.b((String) ((HashMap) ejwiVarB.c()).get(VCardConstants.PROPERTY_URL));
                                    dwnfVar.a = (dwqs) ejwiVarA6.c();
                                    dwmhVar2.c(dwnfVar.a());
                                }
                            }
                            return ejwi.j(dwmhVar2.a());
                        }
                    });
                    if (!ejwiVarA4.g()) {
                        return ejud.a;
                    }
                    dwjkVarF.r((dwjo) ejwiVarA4.c());
                    break;
                case 10:
                    ejwi ejwiVarA5 = dvhx.a(dvhy.b(map.get("ACTION_PAYLOAD")), new ejvr() { // from class: dvtw
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            HashMap map2 = (HashMap) obj;
                            if (!map2.containsKey(VCardConstants.PROPERTY_URL) || !map2.containsKey("REPLACEMENTS")) {
                                dvhv.c("ActionConv", "failed to convert Map to UrlAction, missing necessary property key.");
                                return ejud.a;
                            }
                            dwoo dwooVar = new dwoo();
                            dwooVar.c((String) map2.get(VCardConstants.PROPERTY_URL));
                            ArrayList arrayList = (ArrayList) map2.get("REPLACEMENTS");
                            ekgb ekgbVarB = dvib.b(arrayList, new ejvr() { // from class: dvtz
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    HashMap map3 = (HashMap) obj2;
                                    if (!map3.containsKey("SUBSTITUTE") || !map3.containsKey("PATTERN")) {
                                        dvhv.c("ActionConv", "failed to convert Map to UrlAction missing necessary properity key.");
                                        return ejud.a;
                                    }
                                    dwoq dwoqVar = new dwoq();
                                    dwoqVar.c(((Integer) map3.get("SUBSTITUTE")).intValue());
                                    dwoqVar.b((String) map3.get("PATTERN"));
                                    return ejwi.j(dwoqVar.a());
                                }
                            });
                            if (((ekoe) ekgbVarB).c != arrayList.size()) {
                                dvhv.c("ActionConv", "failed to convert Map to UrlAction missing some replacement");
                                return ejud.a;
                            }
                            dwooVar.b(ekgbVarB);
                            return ejwi.j(dwooVar.a());
                        }
                    });
                    if (!ejwiVarA5.g()) {
                        dvhv.c("ActionConv", "Fail to convert map to url action");
                        return ejud.a;
                    }
                    dwjkVarF.p((dwsk) ejwiVarA5.c());
                    break;
                case 11:
                    ejwi ejwiVarA6 = dvhx.a(dvhy.b(map.get("ACTION_PAYLOAD")), new ejvr() { // from class: dvtx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            HashMap map2 = (HashMap) obj;
                            dwqb dwqbVarC = dwqc.c();
                            try {
                                ArrayList arrayList = (ArrayList) map2.get("DECORATION_IDS_TO_REMOVE");
                                ArrayList arrayList2 = (ArrayList) map2.get("DECORATION_IDS_TO_ADD");
                                if (arrayList == null && arrayList2 == null) {
                                    dvhv.c("ActionConv", "Decoration action missing list of ids to add or remove.");
                                    return ejud.a;
                                }
                                dwqbVarC.b(ekgb.n(arrayList2));
                                dwqbVarC.c(ekgb.n(arrayList));
                                return ejwi.j(dwqbVarC.a());
                            } catch (NullPointerException unused) {
                                dvhv.c("ActionConv", "Failed to build Decoration action.");
                                return ejud.a;
                            }
                        }
                    });
                    if (!ejwiVarA6.g()) {
                        dvhv.c("ActionConv", "Failed to convert map to decoration transition action.");
                        break;
                    } else {
                        dwjkVarF.f((dwqc) ejwiVarA6.c());
                        break;
                    }
                default:
                    dvhv.c("ActionConv", a.E(dwjjVarA, "encountered unknown action type: "));
                    return ejud.a;
            }
            if (map.containsKey("EVENT_CALLBACK_FAILURE_ACTION_TYPE") && dwjj.a(((Integer) map.get("EVENT_CALLBACK_FAILURE_ACTION_TYPE")).intValue()).ordinal() == 8) {
                dwjkVarF.i((String) map.get("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD"));
            }
            return ejwi.j(dwjkVarF.a());
        } catch (IllegalStateException | NullPointerException e) {
            dvhv.d("ActionConv", "failed to convert Map to Action", e);
            return ejud.a;
        }
    }

    public static HashMap b(dwjr dwjrVar) {
        HashMap map = new HashMap();
        g(dwjrVar, map);
        switch (dwjrVar.d().ordinal()) {
            case 1:
                map.put("ACTION_PAYLOAD", e(dwjrVar.b().d()));
                break;
            case 2:
                map.put("ACTION_PAYLOAD", e(dwjrVar.b().c()));
                break;
            case 3:
                map.put("ACTION_PAYLOAD", dwjrVar.b().i());
                break;
            case 4:
                map.put("ACTION_PAYLOAD", dwjrVar.b().k());
                break;
            case 5:
                map.put("ACTION_TYPE", Integer.valueOf(dwjj.COMPOSED_OVERLAY_ACTION.m));
                dwmh dwmhVar = new dwmh();
                dwmhVar.b(dwjrVar.b().f());
                map.put("ACTION_PAYLOAD", f(dwmhVar.a()));
                break;
            case 7:
                map.put("ACTION_PAYLOAD", dwjrVar.b().h());
                break;
            case 8:
                map.put("ACTION_PAYLOAD", dwjrVar.b().j());
                break;
            case 9:
                map.put("ACTION_PAYLOAD", f(dwjrVar.b().b()));
                break;
            case 10:
                dwsk dwskVarG = dwjrVar.b().g();
                HashMap map2 = new HashMap();
                map2.put(VCardConstants.PROPERTY_URL, dwskVarG.b());
                map2.put("REPLACEMENTS", dvib.d(dwskVarG.a(), new ejvr() { // from class: dvts
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        dwsj dwsjVar = (dwsj) obj;
                        HashMap map3 = new HashMap();
                        map3.put("PATTERN", dwsjVar.b());
                        map3.put("SUBSTITUTE", Integer.valueOf(dwsjVar.a()));
                        return map3;
                    }
                }));
                map.put("ACTION_PAYLOAD", map2);
                break;
            case 11:
                dwqc dwqcVarE = dwjrVar.b().e();
                ArrayList arrayList = new ArrayList(dwqcVarE.a());
                ArrayList arrayList2 = new ArrayList(dwqcVarE.b());
                HashMap map3 = new HashMap();
                map3.put("DECORATION_IDS_TO_ADD", arrayList);
                map3.put("DECORATION_IDS_TO_REMOVE", arrayList2);
                map.put("ACTION_PAYLOAD", map3);
                break;
        }
        if (dwjrVar.e().ordinal() != 8) {
            return map;
        }
        map.put("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD", dwjrVar.c().j());
        return map;
    }

    public static void c(dwjk dwjkVar, HashMap map) {
        if (!map.containsKey("ACTION_TRIGGERED_LOG_ID")) {
            dvhv.c("ActionConv", "Missing action triggered log id setting it to 0");
            dwjkVar.c(0L);
        }
        dwjkVar.c(((Long) map.get("ACTION_TRIGGERED_LOG_ID")).longValue());
        if (map.containsKey("EVENT_CALLBACK_PAYLOAD")) {
            dwjkVar.j((String) map.get("EVENT_CALLBACK_PAYLOAD"));
        }
        if (map.containsKey("TRACE_ID")) {
            dwjkVar.o((String) map.get("TRACE_ID"));
        }
        if (map.containsKey("MESSAGE_ID")) {
            dwjkVar.k((String) map.get("MESSAGE_ID"));
        }
        if (map.containsKey("EVENT_CALLBACK_DESTINATION")) {
            ejwi ejwiVarA = dvhx.a(dvhy.b(map.get("EVENT_CALLBACK_DESTINATION")), new ejvr() { // from class: dvty
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ejwi ejwiVarJ;
                    ejwi ejwiVarJ2;
                    HashMap map2 = (HashMap) obj;
                    try {
                        int iB = dwjm.b(((Integer) map2.get("EVENT_CALLBACK_DESTINATION_TYPE")).intValue()) - 1;
                        try {
                            if (iB == 1) {
                                HashMap map3 = (HashMap) map2.get("EVENT_CALLBACK_DESTINATION");
                                try {
                                    dwip dwipVar = new dwip();
                                    dwipVar.c((String) map3.get("ID"));
                                    dwipVar.d((String) map3.get("TACHYON_APP_NAME"));
                                    dwipVar.e(dwpj.a(((Integer) map3.get(VCardConstants.PARAM_TYPE)).intValue()));
                                    dwipVar.b((String) map3.get("HANDLER_ID"));
                                    ejwiVarJ = ejwi.j(dwipVar.a());
                                } catch (Exception unused) {
                                    dvhv.c("ContactIdConverters", "failed to convert HashMap to ContactId");
                                    ejwiVarJ = ejud.a;
                                }
                                if (ejwiVarJ.g()) {
                                    return ejwi.j(new dwkh((dwpk) ejwiVarJ.c()));
                                }
                            } else {
                                if (iB != 2) {
                                    dvhv.c("EventCallDestConvter", "encountered unknown EventCallbackDestinationType");
                                    return ejud.a;
                                }
                                HashMap map4 = (HashMap) map2.get("EVENT_CALLBACK_DESTINATION");
                                try {
                                    dwit dwitVar = new dwit();
                                    dwitVar.c((String) map4.get("ID"));
                                    dwitVar.b((String) map4.get("APP_NAME"));
                                    ejwiVarJ2 = ejwi.j(dwitVar.a());
                                } catch (ClassCastException unused2) {
                                    dvhv.c("GroupIdConverters", "failed to convert HashMap to GroupId");
                                    ejwiVarJ2 = ejud.a;
                                }
                                if (ejwiVarJ2.g()) {
                                    return ejwi.j(new dwki((dwpr) ejwiVarJ2.c()));
                                }
                            }
                            return ejud.a;
                        } catch (IllegalStateException | NullPointerException e) {
                            dvhv.d("EventCallDestConvter", "failed to convert Map to EventCallbackDestination", e);
                            return ejud.a;
                        }
                    } catch (ClassCastException unused3) {
                        return ejud.a;
                    }
                }
            });
            if (ejwiVarA.g()) {
                dwjkVar.g((dwjl) ejwiVarA.c());
            }
        }
    }

    private static HashMap d(dwqs dwqsVar) {
        HashMap map = new HashMap();
        if (dwqsVar.c().g()) {
            if (!((dwjr) dwqsVar.c().c()).d().equals(dwjj.NO_OP_ACTION)) {
                dvhv.c("ActionConv", " Dismiss action can only be NoOp. Fail to convert overlay header to map.");
                return map;
            }
            HashMap map2 = new HashMap();
            g((dwjr) dwqsVar.c().c(), map2);
            map.put("dismiss_action", map2);
        }
        map.put("time_to_live_sec", Integer.valueOf(dwqsVar.b()));
        map.put("OVERLAY_STYLE", Integer.valueOf(dwqsVar.a()));
        if (dwqsVar.d().g()) {
            map.put("display_icon", dwqsVar.d().c());
        }
        if (dwqsVar.e().g()) {
            map.put("display_text", dwqsVar.e().c());
        }
        if (dwqsVar.g().g()) {
            map.put("overlay_lighter_icon", dvuo.b((dwqf) dwqsVar.g().c()));
        }
        if (dwqsVar.f().g()) {
            map.put("overlay_expire_time", dwqsVar.f().c());
        }
        map.put("hide_dismiss_button", Boolean.valueOf(dwqsVar.i()));
        map.put("hide_snippet_in_conversation_list", Boolean.valueOf(dwqsVar.j()));
        map.put("dismissible_by_tapping_outside", Boolean.valueOf(dwqsVar.h()));
        return map;
    }

    private static HashMap e(dwjq dwjqVar) {
        HashMap map = new HashMap();
        map.put("TEXT", dwjqVar.d());
        map.put("MESSAGE_CALLBACK_PAYLOAD", dwjqVar.c());
        return map;
    }

    private static Map f(dwjo dwjoVar) {
        HashMap map = new HashMap();
        if (dwjoVar.a().g()) {
            map.put("REACTION_OVERLAY_HEADER", d((dwqs) dwjoVar.a().c()));
        }
        if (dwjoVar.b().g()) {
            HashMap map2 = new HashMap();
            map2.put(VCardConstants.PROPERTY_URL, ((dwqa) dwjoVar.b().c()).b());
            map2.put("WEB_VIEW_HEADER", d(((dwqa) dwjoVar.b().c()).a()));
            map.put("STACKED_REACTION_WEB_VIEW", map2);
        }
        return map;
    }

    private static void g(dwjr dwjrVar, HashMap map) {
        map.put("ACTION_TYPE", Integer.valueOf(dwjrVar.d().m));
        map.put("EVENT_CALLBACK_FAILURE_ACTION_TYPE", Integer.valueOf(dwjrVar.e().m));
        map.put("ACTION_TRIGGERED_LOG_ID", Long.valueOf(dwjrVar.a()));
        if (dwjrVar.h().g()) {
            map.put("EVENT_CALLBACK_PAYLOAD", dwjrVar.h().c());
        }
        if (dwjrVar.g().g()) {
            Object objC = dwjrVar.g().c();
            HashMap map2 = new HashMap();
            dwjl dwjlVar = (dwjl) objC;
            int iC = dwjlVar.c() - 1;
            if (iC == 1) {
                map2.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(dwjlVar.c() - 1));
                dwpk dwpkVarA = dwjlVar.a();
                HashMap map3 = new HashMap();
                dwiq dwiqVar = (dwiq) dwpkVarA;
                map3.put("ID", dwiqVar.a);
                map3.put("TACHYON_APP_NAME", dwiqVar.b);
                map3.put(VCardConstants.PARAM_TYPE, Integer.valueOf(dwiqVar.c.f));
                ejwi ejwiVar = dwiqVar.d;
                if (ejwiVar.g()) {
                    map3.put("HANDLER_ID", ejwiVar.c());
                }
                map2.put("EVENT_CALLBACK_DESTINATION", map3);
            } else if (iC == 2) {
                map2.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(dwjlVar.c() - 1));
                dwpr dwprVarB = dwjlVar.b();
                HashMap map4 = new HashMap();
                dwiu dwiuVar = (dwiu) dwprVarB;
                map4.put("ID", dwiuVar.a);
                map4.put("APP_NAME", dwiuVar.b);
                map2.put("EVENT_CALLBACK_DESTINATION", map4);
            }
            map.put("EVENT_CALLBACK_DESTINATION", map2);
        }
        if (dwjrVar.l().g()) {
            map.put("TRACE_ID", dwjrVar.l().c());
        }
        if (dwjrVar.j().g()) {
            map.put("MESSAGE_ID", dwjrVar.j().c());
        }
    }
}
