package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.util.Base64;
import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvuk {
    public static ContentValues a(dwpf dwpfVar) {
        byte[] bArrI;
        ejwi ejwiVarJ;
        ContentValues contentValues = new ContentValues();
        dwmw dwmwVar = (dwmw) dwpfVar;
        dwpk dwpkVar = dwmwVar.a;
        contentValues.put("lighter_id_type", Integer.valueOf(dwpkVar.b().f));
        contentValues.put("lighter_id_id", dwpkVar.d());
        contentValues.put("lighter_id_normalized_id", dwpkVar.b() == dwpj.EMAIL ? dvhq.a(dwpkVar.d()) : dwpkVar.d());
        contentValues.put("lighter_handler_id", (String) dwpkVar.c().f());
        contentValues.put("lighter_id_app_name", dwpkVar.e());
        HashMap map = new HashMap();
        map.put("expiration_time_ms", Long.valueOf(dwmwVar.g));
        map.put("image_stale", Boolean.valueOf(dwmwVar.f));
        map.put("server_timestamp_us", Long.valueOf(dwmwVar.l));
        ejwi ejwiVar = dwmwVar.b;
        if (ejwiVar.g()) {
            map.put("name", ejwiVar.c());
        }
        ejwi ejwiVar2 = dwmwVar.d;
        if (ejwiVar2.g()) {
            map.put("image_url", ejwiVar2.c());
        }
        ejwi ejwiVar3 = dwmwVar.e;
        if (ejwiVar3.g()) {
            map.put("image", dvhy.j((Bitmap) ejwiVar3.c()));
        }
        ekgb ekgbVar = dwmwVar.h;
        if (!ekgbVar.isEmpty()) {
            map.put("menu_items", dvib.d(ekgbVar, new ejvr() { // from class: dvuj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dwqh dwqhVar = (dwqh) obj;
                    HashMap map2 = new HashMap();
                    map2.put("MENU_NAME", dwqhVar.c());
                    map2.put("ACTION", dvua.b(dwqhVar.a()));
                    if (dwqhVar.b().g()) {
                        map2.put("ICON", Base64.encodeToString((byte[]) dwqhVar.b().c(), 2));
                    }
                    return map2;
                }
            }));
        }
        ejwi ejwiVar4 = dwmwVar.j;
        if (ejwiVar4.g()) {
            Object objC = ejwiVar4.c();
            HashMap map2 = new HashMap();
            map2.put(VCardConstants.PARAM_TYPE, 1);
            map2.put("CONTENT", dvvp.d(((dwsc) objC).a()));
            try {
                ejwiVarJ = ejwi.j(dvhy.i(map2));
            } catch (IOException e) {
                dvhv.d("SerRichTextModel", "Failed to serialize contact properties.", e);
                ejwiVarJ = ejud.a;
            }
            if (ejwiVarJ.g()) {
                map.put("custom_view_content_type", 1);
                map.put("custom_view_content", ejwiVarJ.c());
            }
        }
        ekgb ekgbVar2 = dwmwVar.i;
        if (!ekgbVar2.isEmpty()) {
            map.put("toolbar_buttons", dvib.d(ekgbVar2, new ejvr() { // from class: dvuj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dwqh dwqhVar = (dwqh) obj;
                    HashMap map22 = new HashMap();
                    map22.put("MENU_NAME", dwqhVar.c());
                    map22.put("ACTION", dvua.b(dwqhVar.a()));
                    if (dwqhVar.b().g()) {
                        map22.put("ICON", Base64.encodeToString((byte[]) dwqhVar.b().c(), 2));
                    }
                    return map22;
                }
            }));
        }
        ejwi ejwiVar5 = dwmwVar.k;
        if (ejwiVar5.g()) {
            Object objC2 = ejwiVar5.c();
            HashMap map3 = new HashMap();
            dwqj dwqjVar = (dwqj) objC2;
            map3.put("BADGE", Integer.valueOf(dwqjVar.a()));
            map3.put("PROFILE_LABEL_STYLE", Integer.valueOf(dwqjVar.b()));
            map.put("ui_configurations", map3);
        }
        try {
            bArrI = dvhy.i(map);
        } catch (IOException e2) {
            dvhv.d("ContactCursors", "Failed to serialize contact properties.", e2);
            bArrI = new byte[0];
        }
        contentValues.put("contact_properties", bArrI);
        return contentValues;
    }

    public static dwpk b(int i, Cursor cursor) {
        dwip dwipVar = new dwip();
        dwipVar.c(cursor.getString(dvwl.a(3) + i));
        dwipVar.d(cursor.getString(dvwl.a(5) + i));
        dwipVar.e(dwpj.a(cursor.getInt(dvwl.a(2) + i)));
        String string = cursor.getString(i + dvwl.a(4));
        if (string != null) {
            dwipVar.b(string);
        }
        return dwipVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Type inference failed for: r5v26, types: [dwpy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ejwi c(android.database.Cursor r9) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvuk.c(android.database.Cursor):ejwi");
    }

    private static ekfw d(HashMap map, String str) {
        ArrayList arrayList;
        ejwi ejwiVarJ;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (map.containsKey(str)) {
            try {
                arrayList = (ArrayList) map.get(str);
            } catch (ClassCastException e) {
                dvhv.d("ContactCursors", "Failed to deserialize ".concat(str), e);
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Map map2 = (Map) arrayList.get(i2);
                if (map2.containsKey("ACTION") && map2.containsKey("MENU_NAME")) {
                    dwnl dwnlVar = new dwnl();
                    dwnlVar.c((String) map2.get("MENU_NAME"));
                    ejwi ejwiVarA = dvhx.a(dvhy.b(map2.get("ACTION")), new ejvr() { // from class: dvup
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return dvua.a((HashMap) obj);
                        }
                    });
                    if (ejwiVarA.g()) {
                        dwnlVar.a = (dwjr) ejwiVarA.c();
                        if (map2.containsKey("ICON")) {
                            dwnlVar.b(Base64.decode((String) map2.get("ICON"), 2));
                        }
                        ejwiVarJ = ejwi.j(dwnlVar.a());
                    } else {
                        dvhv.c("MenuItemConv", "Parse Action failed.");
                        ejwiVarJ = ejud.a;
                    }
                } else {
                    dvhv.c("MenuItemConv", "Missing necessary properties.");
                    ejwiVarJ = ejud.a;
                }
                if (ejwiVarJ.g()) {
                    ekfwVar.h(ejwiVarJ.c());
                }
            }
        }
        return ekfwVar;
    }
}
