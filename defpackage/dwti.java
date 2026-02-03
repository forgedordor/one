package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwti implements dwdy {
    private final Context a;

    public dwti(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwdy
    public final dwqo a(dwje dwjeVar, eysq eysqVar) throws JSONException, dwdx {
        dwvx dwtvVar;
        byte[] bArrI;
        ejwi ejwiVarJ;
        ejwi ejwiVarJ2;
        String str = eysqVar.i;
        eyrc eyrcVarB = eyrc.b(eysqVar.n);
        if (eyrcVarB == null) {
            eyrcVarB = eyrc.UNRECOGNIZED;
        }
        if (!eyrcVarB.equals(eyrc.RICH_CARD) || eysqVar.e != 107) {
            dvhv.c("RichCardMsgConv", "Attempted to convert non-rich card LighterMessage");
            return dwlc.b(evqs.b);
        }
        Context context = this.a;
        dwns dwnsVar = new dwns();
        eytq eytqVar = (eytq) eysqVar.f;
        dvyx dvyxVarA = dvyx.a(context);
        int i = dwtp.b;
        int i2 = eytqVar.d;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = i3 - 2;
        if (i4 == 1) {
            dwvz dwvzVarA = dwtp.a(dwjeVar, context, eytqVar.b == 101 ? (eyty) eytqVar.c : eyty.a, str, dvyxVarA);
            int i5 = dwvx.a;
            dwtvVar = new dwtv(dwvzVarA);
        } else if (i4 == 2) {
            eyuc eyucVar = eytqVar.b == 102 ? (eyuc) eytqVar.c : eyuc.a;
            String str2 = dwwb.c;
            dwuy dwuyVar = new dwuy();
            dwuyVar.b(eyucVar.b);
            eyty eytyVar = eyucVar.c;
            if (eytyVar == null) {
                eytyVar = eyty.a;
            }
            dwuyVar.a = dwtp.a(dwjeVar, context, eytyVar, str, dvyxVarA);
            dwwb dwwbVarA = dwuyVar.a();
            int i6 = dwvx.a;
            dwtvVar = new dwtw(dwwbVarA);
        } else {
            if (i4 != 3) {
                throw new dwdx("Got unknown rich card type: " + i2, 221);
            }
            eytg eytgVar = eytqVar.b == 103 ? (eytg) eytqVar.c : eytg.a;
            ekfw ekfwVar = new ekfw();
            Iterator<E> it = eytgVar.d.iterator();
            while (it.hasNext()) {
                ekfwVar.h(dwtp.a(dwjeVar, context, (eyty) it.next(), str, dvyxVarA));
            }
            String str3 = dwvh.d;
            dwuk dwukVar = new dwuk();
            dwukVar.d(eytgVar.b);
            dwukVar.b(eytgVar.c);
            dwukVar.c(ekfwVar.g());
            dwvh dwvhVarA = dwukVar.a();
            int i7 = dwvx.a;
            dwtvVar = new dwtu(dwvhVarA);
        }
        try {
            final HashMap map = new HashMap();
            map.put(VCardConstants.PARAM_TYPE, Integer.valueOf(dwtvVar.b().d));
            int iOrdinal = dwtvVar.b().ordinal();
            if (iOrdinal == 0) {
                dwvz dwvzVarC = dwtvVar.c();
                HashMap map2 = new HashMap();
                map2.put("COMPONENTS", dvib.d(((dwux) dwvzVarC).a, new ejvr() { // from class: dwte
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        dwwh dwwhVar = (dwwh) obj;
                        HashMap map3 = new HashMap();
                        map3.put(VCardConstants.PARAM_TYPE, dwwhVar.a());
                        int iOrdinal2 = dwwhVar.a().ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                return map3;
                            }
                            map3.put("UI_ELEMENT", dwth.b(dwwhVar.c()));
                            return map3;
                        }
                        dwwg dwwgVarB = dwwhVar.b();
                        HashMap map4 = new HashMap();
                        map4.put("ELEMENTS", dvib.d(((dwvd) dwwgVarB).a, new ejvr() { // from class: dwtf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return dwth.b((dwwm) obj2);
                            }
                        }));
                        map3.put("STACK_COMPONENT", map4);
                        return map3;
                    }
                }));
                ejwi ejwiVar = ((dwux) dwvzVarC).b;
                if (ejwiVar.g()) {
                    map2.put("PREFERRED_MAX_WIDTH", ejwiVar.c());
                }
                map.put("STACK_CARD", map2);
            } else if (iOrdinal == 1) {
                dwwb dwwbVarD = dwtvVar.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("JSON_SOURCE", ((dwuz) dwwbVarD).a);
                    ejwi ejwiVarD = ((dwuz) dwwbVarD).b.d();
                    if (ejwiVarD.g()) {
                        jSONObject.put("STACK_CARD", ejwiVarD.c());
                        ejwiVarJ = ejwi.j(jSONObject);
                    } else {
                        dvhv.c(dwwb.c, "Failed to convert StandaloneCard to JSONObject.");
                        ejwiVarJ = ejud.a;
                    }
                } catch (JSONException e) {
                    dvhv.d(dwwb.c, "Failed to convert StandaloneCard to JSONObject.", e);
                    ejwiVarJ = ejud.a;
                }
                dvhx.b(ejwiVarJ, new lbz() { // from class: dwtc
                    @Override // defpackage.lbz
                    public final void accept(Object obj) {
                        map.put("STANDALONE_CARD", ((JSONObject) obj).toString());
                    }
                });
            } else if (iOrdinal == 2) {
                dwvh dwvhVarA2 = dwtvVar.a();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("CARD_WIDTH", ((dwul) dwvhVarA2).a);
                    jSONObject2.put("JSON_SOURCE", ((dwul) dwvhVarA2).b);
                    JSONArray jSONArray = new JSONArray();
                    ekqh it2 = ((dwul) dwvhVarA2).c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            jSONObject2.put("CARDS", jSONArray);
                            ejwiVarJ2 = ejwi.j(jSONObject2);
                            break;
                        }
                        ejwi ejwiVarD2 = ((dwvz) it2.next()).d();
                        if (!ejwiVarD2.g()) {
                            dvhv.c(dwvh.d, "Failed to convert CardCarousel to JSONObject.");
                            ejwiVarJ2 = ejud.a;
                            break;
                        }
                        jSONArray.put(ejwiVarD2.c());
                    }
                } catch (JSONException e2) {
                    dvhv.d(dwvh.d, "Failed to convert CardCarousel to JSONObject.", e2);
                    ejwiVarJ2 = ejud.a;
                }
                dvhx.b(ejwiVarJ2, new lbz() { // from class: dwtd
                    @Override // defpackage.lbz
                    public final void accept(Object obj) {
                        map.put("CARD_CAROUSEL", ((JSONObject) obj).toString());
                    }
                });
            }
            bArrI = dvhy.i(map);
        } catch (IOException | IllegalArgumentException e3) {
            dvhv.d("RichCardUtils", "Failed to serialize Rich Card", e3);
            bArrI = new byte[0];
        }
        dwnsVar.b(bArrI);
        dwnsVar.a = "rich_card";
        return new dwkx(dwnsVar.a());
    }

    @Override // defpackage.dwdy
    public final eyso b(dwqw dwqwVar) throws JSONException {
        ejwi ejwiVarJ;
        ejwi ejwiVarJ2;
        ejwi ejwiVarJ3;
        ejwi ejwiVarJ4;
        if (dwqwVar.h().a() == 3 && ((dwnt) dwqwVar.h().b()).a.equals("rich_card")) {
            HashMap mapG = dvhy.g(((dwnt) dwqwVar.h().b()).b);
            try {
                final int iIntValue = dwvw.STACK_CARD.d;
                if (mapG.containsKey(VCardConstants.PARAM_TYPE)) {
                    iIntValue = ((Integer) mapG.get(VCardConstants.PARAM_TYPE)).intValue();
                }
                dwvw dwvwVar = (dwvw) ekeh.e(dwvw.values()).a(new ejwm() { // from class: dwvv
                    @Override // defpackage.ejwm
                    public final boolean a(Object obj) {
                        return ((dwvw) obj).d == iIntValue;
                    }
                }).f();
                if (dwvwVar == null) {
                    throw new InvalidParameterException("Invalid CardType.");
                }
                int iOrdinal = dwvwVar.ordinal();
                if (iOrdinal == 0) {
                    ejwi ejwiVarB = dvhy.b(mapG.get("STACK_CARD"));
                    if (ejwiVarB.g()) {
                        Object objC = ejwiVarB.c();
                        try {
                            int i = dwvz.c;
                            dwuw dwuwVar = new dwuw();
                            dwuwVar.b(dvib.c((ArrayList) ((HashMap) objC).get("COMPONENTS"), new ejvr() { // from class: dwtb
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ejwi ejwiVarJ5;
                                    ejwi ejwiVarJ6;
                                    HashMap map = (HashMap) obj;
                                    try {
                                        int iOrdinal2 = ((dwwe) map.get(VCardConstants.PARAM_TYPE)).ordinal();
                                        if (iOrdinal2 == 0) {
                                            HashMap map2 = (HashMap) map.get("STACK_COMPONENT");
                                            try {
                                                dwvc dwvcVar = new dwvc();
                                                dwvcVar.b(dvib.b((ArrayList) map2.get("ELEMENTS"), new ejvr() { // from class: dwtg
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj2) {
                                                        return dwth.a((HashMap) obj2);
                                                    }
                                                }));
                                                ejwiVarJ6 = ejwi.j(dwvcVar.a());
                                            } catch (Exception e) {
                                                dvhv.d("UiComponentConverters", "failed to convert HashMap to StackComponent", e);
                                                ejwiVarJ6 = ejud.a;
                                            }
                                            ejwiVarJ5 = ejwi.j(new dwty((dwwg) ejwiVarJ6.c()));
                                        } else {
                                            if (iOrdinal2 != 1) {
                                                throw new RuntimeException(null, null);
                                            }
                                            ejwiVarJ5 = ejwi.j(new dwtz((dwwm) dwth.a((HashMap) map.get("UI_ELEMENT")).c()));
                                        }
                                    } catch (Exception e2) {
                                        dvhv.d("UiComponentConverters", "failed to convert HashMap to UiComponent", e2);
                                        ejwiVarJ5 = ejud.a;
                                    }
                                    return ejwiVarJ5.c();
                                }
                            }));
                            if (((HashMap) objC).containsKey("PREFERRED_MAX_WIDTH")) {
                                dwuwVar.c(((Integer) ((HashMap) objC).get("PREFERRED_MAX_WIDTH")).intValue());
                            }
                            ejwiVarJ2 = ejwi.j(dwuwVar.a());
                        } catch (Exception e) {
                            dvhv.d("RichCardConverters", "failed to convert HashMap to StackCard", e);
                            ejwiVarJ2 = ejud.a;
                        }
                        Object objC2 = ejwiVarJ2.c();
                        int i2 = dwvx.a;
                        ejwiVarJ = ejwi.j(new dwtv((dwvz) objC2));
                    } else {
                        dvhv.c("RichCardConverters", "failed to convert HashMap to RichCard");
                        dvhv.c("RichCardConverters", a.J(dwvwVar, "failed to convert HashMap to RichCard, unsupported type: "));
                        ejwiVarJ = ejud.a;
                    }
                } else if (iOrdinal == 1) {
                    String str = (String) mapG.get("STANDALONE_CARD");
                    String str2 = dwwb.c;
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        dwuy dwuyVar = new dwuy();
                        dwuyVar.b(jSONObject.getString("JSON_SOURCE"));
                        ejwi ejwiVarC = dwvz.c(jSONObject.getJSONObject("STACK_CARD"));
                        if (ejwiVarC.g()) {
                            dwuyVar.a = (dwvz) ejwiVarC.c();
                            ejwiVarJ3 = ejwi.j(dwuyVar.a());
                        } else {
                            dvhv.c(dwwb.c, "Failed to convert JSONObject to StandaloneCard.");
                            ejwiVarJ3 = ejud.a;
                        }
                    } catch (JSONException e2) {
                        dvhv.d(dwwb.c, "Failed to convert JSONObject to StandaloneCard.", e2);
                        ejwiVarJ3 = ejud.a;
                    }
                    if (ejwiVarJ3.g()) {
                        Object objC3 = ejwiVarJ3.c();
                        int i3 = dwvx.a;
                        ejwiVarJ = ejwi.j(new dwtw((dwwb) objC3));
                    } else {
                        dvhv.c("RichCardConverters", "failed to convert HashMap to RichCard");
                        dvhv.c("RichCardConverters", a.J(dwvwVar, "failed to convert HashMap to RichCard, unsupported type: "));
                        ejwiVarJ = ejud.a;
                    }
                } else if (iOrdinal != 2) {
                    dvhv.c("RichCardConverters", a.J(dwvwVar, "failed to convert HashMap to RichCard, unsupported type: "));
                    ejwiVarJ = ejud.a;
                } else {
                    String str3 = (String) mapG.get("CARD_CAROUSEL");
                    String str4 = dwvh.d;
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        dwuk dwukVar = new dwuk();
                        dwukVar.b(jSONObject2.getInt("CARD_WIDTH"));
                        dwukVar.d(jSONObject2.getString("JSON_SOURCE"));
                        int i4 = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        JSONArray jSONArray = jSONObject2.getJSONArray("CARDS");
                        int i5 = 0;
                        while (true) {
                            if (i5 >= jSONArray.length()) {
                                dwukVar.c(ekfwVar.g());
                                ejwiVarJ4 = ejwi.j(dwukVar.a());
                                break;
                            }
                            ejwi ejwiVarC2 = dwvz.c(jSONArray.getJSONObject(i5));
                            if (!ejwiVarC2.g()) {
                                dvhv.c(dwvh.d, "Failed to convert JSONObject to CardCarousel.");
                                ejwiVarJ4 = ejud.a;
                                break;
                            }
                            ekfwVar.h(ejwiVarC2.c());
                            i5++;
                        }
                    } catch (JSONException e3) {
                        dvhv.d(dwvh.d, "Failed to convert JSONObject to CardCarousel.", e3);
                        ejwiVarJ4 = ejud.a;
                    }
                    if (ejwiVarJ4.g()) {
                        Object objC4 = ejwiVarJ4.c();
                        int i6 = dwvx.a;
                        ejwiVarJ = ejwi.j(new dwtu((dwvh) objC4));
                    } else {
                        dvhv.c("RichCardConverters", "failed to convert HashMap to RichCard");
                        dvhv.c("RichCardConverters", a.J(dwvwVar, "failed to convert HashMap to RichCard, unsupported type: "));
                        ejwiVarJ = ejud.a;
                    }
                }
            } catch (Exception e4) {
                dvhv.d("RichCardConverters", "failed to convert HashMap to RichCard", e4);
                ejwiVarJ = ejud.a;
            }
        } else {
            ejwiVarJ = ejud.a;
        }
        if (!ejwiVarJ.g()) {
            dvhv.c("RichCardMsgConv", "Attempted to convert non-rich_card message");
            eyso eysoVar = (eyso) eysq.a.createBuilder();
            eyrc eyrcVar = eyrc.UNKNOWN;
            eysoVar.copyOnWrite();
            ((eysq) eysoVar.instance).n = eyrcVar.a();
            return eysoVar;
        }
        Object objC5 = ejwiVarJ.c();
        eyso eysoVar2 = (eyso) eysq.a.createBuilder();
        try {
            eyrc eyrcVar2 = eyrc.RICH_CARD;
            eysoVar2.copyOnWrite();
            ((eysq) eysoVar2.instance).n = eyrcVar2.a();
            int i7 = dwtp.b;
        } catch (Exception unused) {
            dvhv.c("RichCardMsgConv", "Failed to convert rich card model.");
            eyrc eyrcVar3 = eyrc.UNKNOWN;
            eysoVar2.copyOnWrite();
            ((eysq) eysoVar2.instance).n = eyrcVar3.a();
        }
        if (((dwvx) objC5).b().ordinal() != 0) {
            throw new IllegalArgumentException("Got unknown rich card model type");
        }
        eytp eytpVar = (eytp) eytq.a.createBuilder();
        dwvz dwvzVarC = ((dwvx) objC5).c();
        eytx eytxVar = (eytx) eyty.a.createBuilder();
        ekgb ekgbVarC = dvib.c(((dwux) dwvzVarC).a, new ejvr() { // from class: dwtk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dwwh dwwhVar = (dwwh) obj;
                int i8 = dwtp.b;
                int iOrdinal2 = dwwhVar.a().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        throw new RuntimeException(null, null);
                    }
                    eyuf eyufVar = (eyuf) eyug.a.createBuilder();
                    eyufVar.copyOnWrite();
                    ((eyug) eyufVar.instance).d = eyri.a(4);
                    eyui eyuiVarC = dwtp.c(dwwhVar.c());
                    eyufVar.copyOnWrite();
                    eyug eyugVar = (eyug) eyufVar.instance;
                    eyuiVarC.getClass();
                    eyugVar.c = eyuiVarC;
                    eyugVar.b = 102;
                    return (eyug) eyufVar.build();
                }
                eyuf eyufVar2 = (eyuf) eyug.a.createBuilder();
                eyufVar2.copyOnWrite();
                ((eyug) eyufVar2.instance).d = eyri.a(3);
                dwwg dwwgVarB = dwwhVar.b();
                eytz eytzVar = (eytz) eyua.a.createBuilder();
                ekgb ekgbVarC2 = dvib.c(((dwvd) dwwgVarB).a, new ejvr() { // from class: dwtn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return dwtp.c((dwwm) obj2);
                    }
                });
                eytzVar.copyOnWrite();
                eyua eyuaVar = (eyua) eytzVar.instance;
                evtg evtgVar = eyuaVar.b;
                if (!evtgVar.c()) {
                    eyuaVar.b = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(ekgbVarC2, eyuaVar.b);
                eyua eyuaVar2 = (eyua) eytzVar.build();
                eyufVar2.copyOnWrite();
                eyug eyugVar2 = (eyug) eyufVar2.instance;
                eyuaVar2.getClass();
                eyugVar2.c = eyuaVar2;
                eyugVar2.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                return (eyug) eyufVar2.build();
            }
        });
        eytxVar.copyOnWrite();
        eyty eytyVar = (eyty) eytxVar.instance;
        evtg evtgVar = eytyVar.b;
        if (!evtgVar.c()) {
            eytyVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(ekgbVarC, eytyVar.b);
        ejwi ejwiVar = ((dwux) dwvzVarC).b;
        if (ejwiVar.g()) {
            int iIntValue2 = ((Integer) ejwiVar.c()).intValue();
            eytxVar.copyOnWrite();
            ((eyty) eytxVar.instance).c = iIntValue2;
        }
        eyty eytyVar2 = (eyty) eytxVar.build();
        eytpVar.copyOnWrite();
        eytq eytqVar = (eytq) eytpVar.instance;
        eytyVar2.getClass();
        eytqVar.c = eytyVar2;
        eytqVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        eytpVar.copyOnWrite();
        ((eytq) eytpVar.instance).d = 1;
        eytq eytqVar2 = (eytq) eytpVar.build();
        eysoVar2.copyOnWrite();
        eysq eysqVar = (eysq) eysoVar2.instance;
        eytqVar2.getClass();
        eysqVar.f = eytqVar2;
        eysqVar.e = 107;
        return eysoVar2;
    }
}
