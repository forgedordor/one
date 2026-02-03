package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvul {
    public static ejwi a(Cursor cursor) {
        ejwi ejwiVarJ;
        Bitmap bitmapA;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            int length = dvwq.b.length;
            String[] strArr = dvwm.a;
            int i = length + 7;
            dwpn dwpnVarR = dwpo.r();
            if (dwpu.a(cursor.getInt(dvwp.a(2))) == dwpu.GROUP) {
                dwir dwirVar = new dwir();
                dwit dwitVar = new dwit();
                dwitVar.c(cursor.getString(dvwp.a(3)));
                dwitVar.b(cursor.getString(dvwp.a(4)));
                dwirVar.d(dwitVar.a());
                dwirVar.c(dvuk.b(length, cursor));
                dwpnVarR.q(dwirVar);
            } else {
                dwir dwirVar2 = new dwir();
                dwirVar2.e(dvuk.b(i, cursor));
                dwirVar2.c(dvuk.b(length, cursor));
                dwpnVarR.q(dwirVar2);
            }
            dwpnVarR.b(dvhy.h(cursor.getBlob(dvwp.a(8))));
            dwpnVarR.l(cursor.getLong(dvwp.a(9)));
            dwpnVarR.m(cursor.getLong(dvwp.a(10)));
            HashMap mapG = dvhy.g(cursor.getBlob(dvwp.a(11)));
            if (mapG.isEmpty()) {
                dvhv.c("ConversationCursors", "Failed to deserialize conversation properties: No properties.");
            } else {
                if (mapG.containsKey("expiration_time_ms")) {
                    dwpnVarR.h(((Long) mapG.get("expiration_time_ms")).longValue());
                } else {
                    dwpnVarR.h(-1L);
                }
                if (mapG.containsKey("blockable")) {
                    dwpnVarR.c(((Boolean) mapG.get("blockable")).booleanValue());
                }
                if (mapG.containsKey(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                    dwpnVarR.p((String) mapG.get(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE));
                }
                if (mapG.containsKey("image_url")) {
                    dwpnVarR.j((String) mapG.get("image_url"));
                }
                if (mapG.containsKey("image_stale")) {
                    dwpnVarR.k(((Boolean) mapG.get("image_stale")).booleanValue());
                }
                if (mapG.containsKey("image") && (bitmapA = dvhy.a((byte[]) mapG.get("image"))) != null) {
                    dwpnVarR.i(bitmapA);
                }
                if (mapG.containsKey("suggestion_list")) {
                    HashMap mapG2 = dvhy.g((byte[]) mapG.get("suggestion_list"));
                    try {
                        dwsf dwsfVarF = dwsg.f();
                        dwsfVarF.c((String) mapG2.get("ID"));
                        dwsfVarF.e(((Integer) mapG2.get("RENDER_STYLE")).intValue());
                        dwsfVarF.d((String) mapG2.get("MESSAGE_ID"));
                        dwsfVarF.b((String) mapG2.get("HINT_TEXT"));
                        ekgb ekgbVarB = dvib.b((ArrayList) mapG2.get("SUGGESTIONS"), new ejvr() { // from class: dvvt
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                HashMap map = (HashMap) obj;
                                try {
                                    final dwsd dwsdVarF = dwse.f();
                                    dwsdVarF.c(((Integer) map.get("ID")).intValue());
                                    dwsdVarF.f((String) map.get("TEXT"));
                                    dwsdVarF.e((String) map.get("SECONDARY_TEXT"));
                                    if (map.containsKey("LIGHTER_ICON")) {
                                        dvhx.b(dvuo.a((HashMap) map.get("LIGHTER_ICON")), new lbz() { // from class: dvvq
                                            @Override // defpackage.lbz
                                            public final void accept(Object obj2) {
                                                dwsdVarF.d((dwqf) obj2);
                                            }
                                        });
                                    }
                                    return dvhx.a(dvhy.b(map.get("ACTION")), new ejvr() { // from class: dvvr
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            return dvua.a((HashMap) obj2);
                                        }
                                    }).b(new ejvr() { // from class: dvvs
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            dwsd dwsdVar = dwsdVarF;
                                            dwsdVar.b((dwjr) obj2);
                                            return dwsdVar.a();
                                        }
                                    });
                                } catch (IllegalStateException | NullPointerException unused) {
                                    dvhv.c("ChipsListConverters", "failed to convert HashMap to Suggestion");
                                    return ejud.a;
                                }
                            }
                        });
                        if (ekgbVarB.isEmpty()) {
                            ejwiVarJ = ejud.a;
                        } else {
                            dwsfVarF.f(ekgbVarB);
                            ejwiVarJ = ejwi.j(dwsfVarF.a());
                        }
                    } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                        dvhv.d("ChipsListConverters", "failed to convert HashMap to SuggestionList", e);
                        ejwiVarJ = ejud.a;
                    }
                    ((dwmz) dwpnVarR).a = ejwiVarJ;
                }
                if (mapG.containsKey("capabilities")) {
                    try {
                        dwpnVarR.d(ekgb.n((ArrayList) mapG.get("capabilities")));
                    } catch (ClassCastException e2) {
                        dvhv.d("ConversationCursors", "Error deserializing Capabilities in Conversation properties", e2);
                    }
                }
                if (mapG.containsKey("properties_expiration_time_ms")) {
                    dwpnVarR.n(((Long) mapG.get("properties_expiration_time_ms")).longValue());
                } else {
                    dwpnVarR.n(-1L);
                }
                if (mapG.containsKey("server_timestamp_us")) {
                    dwpnVarR.o(((Long) mapG.get("server_timestamp_us")).longValue());
                }
                if (mapG.containsKey("conversation_context")) {
                    dwpnVarR.e(dvhy.c((String) mapG.get("conversation_context")));
                }
                if (mapG.containsKey("created_timestamp_ms")) {
                    dwpnVarR.g(((Long) mapG.get("created_timestamp_ms")).longValue());
                }
            }
            try {
                return ejwi.j(dwpnVarR.a());
            } catch (IllegalStateException unused) {
            }
        }
        return ejud.a;
    }

    public static HashMap b(byte[] bArr) throws ClassNotFoundException, IOException {
        try {
            Object object = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            return object instanceof HashMap ? (HashMap) object : new HashMap();
        } catch (IOException | ClassNotFoundException e) {
            dvhv.d("ConversationCursors", "Error reading conversation properties.", e);
            return new HashMap();
        }
    }

    public static HashMap c(dwpo dwpoVar) {
        HashMap map = new HashMap();
        f(map, dwpoVar);
        if (dwpoVar.k().g()) {
            Object objC = dwpoVar.k().c();
            HashMap map2 = new HashMap();
            dwsg dwsgVar = (dwsg) objC;
            map2.put("ID", dwsgVar.d());
            map2.put("MESSAGE_ID", dwsgVar.e());
            map2.put("RENDER_STYLE", Integer.valueOf(dwsgVar.a()));
            map2.put("SUGGESTIONS", dvib.d(dwsgVar.b(), new ejvr() { // from class: dvvu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dwse dwseVar = (dwse) obj;
                    final HashMap map3 = new HashMap();
                    map3.put("ID", Integer.valueOf(dwseVar.a()));
                    map3.put("TEXT", dwseVar.e());
                    map3.put("SECONDARY_TEXT", dwseVar.d());
                    dvhx.b(dwseVar.c(), new lbz() { // from class: dvvv
                        @Override // defpackage.lbz
                        public final void accept(Object obj2) {
                            map3.put("LIGHTER_ICON", dvuo.b((dwqf) obj2));
                        }
                    });
                    map3.put("ACTION", dvua.b(dwseVar.b()));
                    return map3;
                }
            }));
            map2.put("HINT_TEXT", dwsgVar.c());
            map.put("suggestion_list", dvhy.i(map2));
        }
        map.put("capabilities", new ArrayList(dwpoVar.m()));
        map.put("properties_expiration_time_ms", Long.valueOf(dwpoVar.e()));
        map.put("conversation_context", dvhy.e(dwpoVar.n()));
        return map;
    }

    public static byte[] d(HashMap map) {
        try {
            return dvhy.i(map);
        } catch (IOException e) {
            dvhv.d("ConversationCursors", "Failed to serialize conversation properties.", e);
            return new byte[0];
        }
    }

    public static byte[] e(dwpo dwpoVar) {
        try {
            return dvhy.i(c(dwpoVar));
        } catch (IOException e) {
            dvhv.d("ConversationCursors", "Failed to serialize conversation properties.", e);
            return new byte[0];
        }
    }

    public static void f(HashMap map, dwpo dwpoVar) {
        map.put("expiration_time_ms", Long.valueOf(dwpoVar.b()));
        map.put("blockable", Boolean.valueOf(dwpoVar.p()));
        map.put("image_stale", Boolean.valueOf(dwpoVar.q()));
        map.put("server_timestamp_us", Long.valueOf(dwpoVar.f()));
        map.put("created_timestamp_ms", Long.valueOf(dwpoVar.a()));
        if (dwpoVar.l().g()) {
            map.put(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, dwpoVar.l().c());
        }
        if (dwpoVar.j().g()) {
            map.put("image_url", dwpoVar.j().c());
        }
        if (dwpoVar.i().g()) {
            map.put("image", dvhy.j((Bitmap) dwpoVar.i().c()));
        }
    }
}
