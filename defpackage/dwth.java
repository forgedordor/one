package defpackage;

import com.android.vcard.VCardConstants;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwth {
    static ejwi a(HashMap map) {
        dwwi dwwiVarG;
        int iOrdinal;
        ejwi ejwiVarJ;
        ejwi ejwiVarJ2;
        ejwi ejwiVarJ3;
        ejwi ejwiVarJ4;
        try {
            dwwiVarG = dwwm.g();
            dwwiVarG.e(((Integer) map.get("PADDING_START")).intValue());
            dwwiVarG.f(((Integer) map.get("PADDING_TOP")).intValue());
            dwwiVarG.d(((Integer) map.get("PADDING_END")).intValue());
            dwwiVarG.c(((Integer) map.get("PADDING_BOTTOM")).intValue());
            if (map.containsKey("USE_INCOMING_OUTGOING_COLORS")) {
                dwwiVarG.g(((Boolean) map.get("USE_INCOMING_OUTGOING_COLORS")).booleanValue());
            }
            iOrdinal = ((dwwl) map.get(VCardConstants.PARAM_TYPE)).ordinal();
        } catch (Exception e) {
            dvhv.d("UiElementConverters", "failed to convert HashMap to UiElement", e);
            return ejud.a;
        }
        if (iOrdinal == 0) {
            dwwiVarG.n((dwsa) dvvp.c((HashMap) map.get("RICH_TEXT")).c());
            return ejwi.j(dwwiVarG.a());
        }
        if (iOrdinal == 8) {
            if (!fbfm.n()) {
                dvhv.c("UiElementConverters", "Cannot convert HashMap to UiElement; Please enable direct-download flag.");
                return ejud.a;
            }
            ejwi ejwiVarH = dwvr.h(new JSONObject((String) map.get("MEDIA_ELEMENT")));
            if (ejwiVarH.g()) {
                dwwiVarG.l((dwvr) ejwiVarH.c());
                return ejwi.j(dwwiVarG.a());
            }
            dvhv.c("UiElementConverters", "failed to convert HashMap to UiElement");
            return ejud.a;
        }
        if (iOrdinal == 2) {
            HashMap map2 = (HashMap) map.get("STATUS_BADGE");
            try {
                dwva dwvaVar = new dwva();
                dwvaVar.c((String) map2.get("TEXT"));
                dwvaVar.b(((Integer) map2.get("BACKGROUND_COLOR")).intValue());
                dwvaVar.d(((Integer) map2.get("TEXT_COLOR")).intValue());
                ejwiVarJ = ejwi.j(dwvaVar.a());
            } catch (Exception e2) {
                dvhv.d("StatusBadgeConverters", "failed to convert HashMap to StatusBadge", e2);
                ejwiVarJ = ejud.a;
            }
            dwwiVarG.o((dwwd) ejwiVarJ.c());
            return ejwi.j(dwwiVarG.a());
        }
        if (iOrdinal == 3) {
            HashMap map3 = (HashMap) map.get("RICH_CARD_BUTTONS");
            try {
                String str = dwri.d;
                dwnz dwnzVar = new dwnz();
                if (((Integer) map3.get("ORIENTATION")).intValue() == 2) {
                    dwnzVar.c(map3.containsKey("HORIZONTAL_ALIGNMENT") ? ((Integer) map3.get("HORIZONTAL_ALIGNMENT")).intValue() : 0);
                }
                dwnzVar.b(dvib.b((ArrayList) map3.get("BUTTONS"), new ejvr() { // from class: dvvd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return dvve.a((HashMap) obj);
                    }
                }));
                dwnzVar.d(((Integer) map3.get("ORIENTATION")).intValue());
                ejwiVarJ2 = ejwi.j(dwnzVar.a());
            } catch (IllegalStateException | NullPointerException e3) {
                dvhv.d("RCButtonsConverters", "failed to convert Map to RichCardButtons", e3);
                ejwiVarJ2 = ejud.a;
            }
            dwwiVarG.m((dwri) ejwiVarJ2.c());
            return ejwi.j(dwwiVarG.a());
        }
        if (iOrdinal == 4) {
            HashMap map4 = (HashMap) map.get("HORIZONTAL_LINE");
            try {
                dwuq dwuqVar = new dwuq();
                dwuqVar.b(((Integer) map4.get("LINE_COLOR")).intValue());
                dwuqVar.c(((Float) map4.get("LINE_WIDTH")).floatValue());
                ejwiVarJ3 = ejwi.j(dwuqVar.a());
            } catch (Exception e4) {
                dvhv.d("HrzntlLineConverters", "failed to convert HashMap to HorizontalLine", e4);
                ejwiVarJ3 = ejud.a;
            }
            dwwiVarG.j((dwvn) ejwiVarJ3.c());
            return ejwi.j(dwwiVarG.a());
        }
        if (iOrdinal == 5) {
            HashMap map5 = (HashMap) map.get("HORIZONTAL_LAYOUT_BUTTONS");
            try {
                dwum dwumVar = new dwum();
                dwumVar.b(dvib.b((ArrayList) map5.get("VERTICAL_LAYOUT_BUTTON"), new ejvr() { // from class: dwta
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        HashMap map6 = (HashMap) obj;
                        try {
                            dwuo dwuoVar = new dwuo();
                            ejwi ejwiVarA = dvuo.a((HashMap) map6.get("VERTICAL_LAYOUT_BUTTON_LIGHTER_ICON"));
                            ejwi ejwiVarA2 = dvhx.a(dvhy.b(map6.get("ACTION")), new ejvr() { // from class: dwsy
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return dvua.a((HashMap) obj2);
                                }
                            });
                            dwjk dwjkVarF = dwjr.f();
                            dwjkVarF.t();
                            dwuoVar.b = (dwjr) ejwiVarA2.e(dwjkVarF.a());
                            dwuoVar.b((String) map6.get("DISPLAY_TEXT"));
                            dwuoVar.c((byte[]) map6.get("ICON"));
                            dwuoVar.a = (dwqf) (ejwiVarA.g() ? ejwiVarA.c() : dwqf.g());
                            return ejwi.j(dwuoVar.a());
                        } catch (IllegalStateException | NullPointerException e5) {
                            dvhv.d("HrzntlytBtnConverter", "failed to convert Map to VerticalLayoutButton", e5);
                            return ejud.a;
                        }
                    }
                }));
                ejwiVarJ4 = ejwi.j(dwumVar.a());
            } catch (IllegalStateException | NullPointerException e5) {
                dvhv.d("HrzntlytBtnConverter", "failed to convert Map to RichCardButtons", e5);
                ejwiVarJ4 = ejud.a;
            }
            dwwiVarG.i((dwvl) ejwiVarJ4.c());
            return ejwi.j(dwwiVarG.a());
        }
        if (iOrdinal != 6) {
            dvhv.c("UiElementConverters", "Unsupported UiElement type: " + String.valueOf(map.get(VCardConstants.PARAM_TYPE)));
            return ejud.a;
        }
        ejwi ejwiVarH2 = dwvp.h(new JSONObject((String) map.get("IMAGE_ELEMENT")));
        if (ejwiVarH2.g()) {
            dwwiVarG.k((dwvp) ejwiVarH2.c());
            return ejwi.j(dwwiVarG.a());
        }
        dvhv.c("UiElementConverters", "failed to convert HashMap to UiElement");
        return ejud.a;
        dvhv.d("UiElementConverters", "failed to convert HashMap to UiElement", e);
        return ejud.a;
    }

    static HashMap b(dwwm dwwmVar) throws JSONException {
        HashMap map = new HashMap();
        map.put("PADDING_START", Integer.valueOf(dwwmVar.c()));
        map.put("PADDING_TOP", Integer.valueOf(dwwmVar.d()));
        map.put("PADDING_END", Integer.valueOf(dwwmVar.b()));
        map.put("PADDING_BOTTOM", Integer.valueOf(dwwmVar.a()));
        map.put("USE_INCOMING_OUTGOING_COLORS", Boolean.valueOf(dwwmVar.f()));
        map.put(VCardConstants.PARAM_TYPE, dwwmVar.h());
        int iOrdinal = dwwmVar.h().ordinal();
        if (iOrdinal == 0) {
            map.put("RICH_TEXT", dvvp.d(dwwmVar.e().g()));
            return map;
        }
        if (iOrdinal == 8) {
            if (!fbfm.n()) {
                dvhv.c("UiElementConverters", "Cannot convert media element to HashMap, please enable direct-download flag.");
                return map;
            }
            ejwi ejwiVarI = dwwmVar.e().e().i();
            if (!ejwiVarI.g()) {
                throw new IllegalArgumentException("Unable to convert media element to HashMap.");
            }
            map.put("MEDIA_ELEMENT", ((JSONObject) ejwiVarI.c()).toString());
            return map;
        }
        if (iOrdinal == 2) {
            dwwd dwwdVarH = dwwmVar.e().h();
            HashMap map2 = new HashMap();
            dwvb dwvbVar = (dwvb) dwwdVarH;
            map2.put("TEXT", dwvbVar.a);
            map2.put("BACKGROUND_COLOR", Integer.valueOf(dwvbVar.b));
            map2.put("TEXT_COLOR", Integer.valueOf(dwvbVar.c));
            map.put("STATUS_BADGE", map2);
            return map;
        }
        if (iOrdinal == 3) {
            dwri dwriVarF = dwwmVar.e().f();
            HashMap map3 = new HashMap();
            dwoa dwoaVar = (dwoa) dwriVarF;
            int i = dwoaVar.b;
            map3.put("ORIENTATION", Integer.valueOf(i));
            map3.put("BUTTONS", dvib.d(dwoaVar.a, new ejvr() { // from class: dvva
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return dvve.b((dwrh) obj);
                }
            }));
            if (i == 2) {
                ejwi ejwiVar = dwoaVar.c;
                map3.put("HORIZONTAL_ALIGNMENT", Integer.valueOf(ejwiVar.g() ? ((Integer) ejwiVar.c()).intValue() : 0));
            }
            map.put("RICH_CARD_BUTTONS", map3);
            return map;
        }
        if (iOrdinal == 4) {
            dwvn dwvnVarC = dwwmVar.e().c();
            HashMap map4 = new HashMap();
            dwur dwurVar = (dwur) dwvnVarC;
            map4.put("LINE_COLOR", Integer.valueOf(dwurVar.a));
            map4.put("LINE_WIDTH", Float.valueOf(dwurVar.b));
            map.put("HORIZONTAL_LINE", map4);
            return map;
        }
        if (iOrdinal == 5) {
            dwvl dwvlVarB = dwwmVar.e().b();
            HashMap map5 = new HashMap();
            map5.put("VERTICAL_LAYOUT_BUTTON", dvib.d(((dwun) dwvlVarB).a, new ejvr() { // from class: dwsz
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dwvk dwvkVar = (dwvk) obj;
                    HashMap map6 = new HashMap();
                    map6.put("DISPLAY_TEXT", dwvkVar.c());
                    map6.put("ICON", dwvkVar.d());
                    map6.put("VERTICAL_LAYOUT_BUTTON_LIGHTER_ICON", dvuo.b(dwvkVar.b()));
                    map6.put("ACTION", dvua.b(dwvkVar.a()));
                    return map6;
                }
            }));
            map.put("HORIZONTAL_LAYOUT_BUTTONS", map5);
            return map;
        }
        if (iOrdinal != 6) {
            throw new IllegalArgumentException("Unsupported UiElement type: " + dwwmVar.h().j);
        }
        ejwi ejwiVarI2 = dwwmVar.e().d().i();
        if (!ejwiVarI2.g()) {
            throw new IllegalArgumentException("Unable to convert image element to JSON.");
        }
        map.put("IMAGE_ELEMENT", ((JSONObject) ejwiVarI2.c()).toString());
        return map;
    }
}
