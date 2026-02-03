package defpackage;

import com.android.vcard.VCardConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvuu {
    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(1:(1:5)(2:6|7))(1:8)|9|(2:11|(2:13|(18:(1:(1:(1:18)(4:19|(1:21)|22|(1:24)(1:25)))(1:26))(1:27)|36|(4:38|(2:41|39)|121|42)|43|(1:45)|46|(1:48)|49|119|50|58|117|59|(2:62|60)|122|63|71|(5:73|(1:(3:(1:(1:79))(19:80|(1:82)|83|(1:85)|86|(1:88)|89|(1:91)|92|(1:94)(1:95)|96|(1:98)(1:99)|100|(1:102)|103|(1:105)|106|(1:108)|109)|113|114)(1:110))(1:111)|112|113|114)(2:115|116))(3:28|(1:30)(1:31)|32))(1:33))(1:34)|35|36|(0)|43|(0)|46|(0)|49|119|50|58|117|59|(1:60)|122|63|71|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bc, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bd, code lost:
    
        defpackage.dvhv.g("MessageCursors", "Failed to deserialize active decoration ids.", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0205, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020a, code lost:
    
        defpackage.dvhv.g("MessageCursors", "Failed to deserialize possible decorations.", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ed A[Catch: IOException | ClassCastException | ClassNotFoundException -> 0x0205, ClassNotFoundException -> 0x0207, IOException -> 0x0209, LOOP:1: B:60:0x01e7->B:62:0x01ed, LOOP_END, TryCatch #5 {IOException | ClassCastException | ClassNotFoundException -> 0x0205, blocks: (B:59:0x01ca, B:60:0x01e7, B:62:0x01ed, B:63:0x01fb), top: B:117:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dwqw a(defpackage.dwpx r12, android.database.Cursor r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvuu.a(dwpx, android.database.Cursor):dwqw");
    }

    public static HashMap b(dwqw dwqwVar) {
        byte[] bArrI;
        HashMap map = new HashMap();
        map.put("content_type", eonc.i(dwqwVar.h().a() - 1));
        int iA = dwqwVar.h().a() - 1;
        if (iA == 0) {
            map.put("message_content", dwqwVar.h().e().I());
        } else if (iA == 1) {
            map.put("message_content", dvhz.b(dwqwVar.h().d()));
        } else if (iA == 2) {
            map.put("message_content", ((dwnt) dwqwVar.h().b()).b);
            map.put("custom_message_content_type", dvhz.b(((dwnt) dwqwVar.h().b()).a));
        } else if (iA == 3) {
            map.put("message_content", dvhy.i(dvvp.d(dwqwVar.h().c())));
        }
        if (!dwqwVar.o().isEmpty()) {
            HashMap map2 = new HashMap(dwqwVar.o());
            try {
                HashMap map3 = new HashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    map3.put((String) entry.getKey(), ((evqs) entry.getValue()).I());
                }
                bArrI = dvhy.i(map3);
            } catch (IOException e) {
                dvhv.d("MessageCursors", "Failed to serialize message metadata.", e);
                bArrI = new byte[0];
            }
            map.put("metadata", bArrI);
        }
        ejwi ejwiVarK = dwqwVar.k();
        if (ejwiVarK.g()) {
            map.put("fallback", dvhz.b((String) ejwiVarK.c()));
        }
        ejwi ejwiVarM = dwqwVar.m();
        if (ejwiVarM.g()) {
            map.put("snippet", dvhz.b((String) ejwiVarM.c()));
        }
        dwqt dwqtVarJ = dwqwVar.j();
        if (dwqtVarJ.a().ordinal() == 2) {
            dwqs dwqsVarB = dwqtVarJ.b();
            HashMap map4 = new HashMap();
            dwnv dwnvVar = (dwnv) dwqsVarB;
            map4.put("time_to_live_sec", Integer.valueOf(dwnvVar.e));
            map4.put("OVERLAY_STYLE", Integer.valueOf(dwnvVar.j));
            ejwi ejwiVar = dwnvVar.a;
            if (ejwiVar.g()) {
                map4.put("dismiss_action", dvua.b((dwjr) ejwiVar.c()));
            }
            ejwi ejwiVar2 = dwnvVar.b;
            if (ejwiVar2.g()) {
                map4.put("display_icon", ((evqs) ejwiVar2.c()).I());
            }
            ejwi ejwiVar3 = dwnvVar.d;
            if (ejwiVar3.g()) {
                map4.put("display_text", ejwiVar3.c());
            }
            ejwi ejwiVar4 = dwnvVar.c;
            if (ejwiVar4.g()) {
                map4.put("overlay_lighter_icon", dvhy.i(dvuo.b((dwqf) ejwiVar4.c())));
            }
            ejwi ejwiVar5 = dwnvVar.i;
            if (ejwiVar5.g()) {
                map4.put("overlay_expire_time", eonc.i(((Integer) ejwiVar5.c()).intValue()));
            }
            map4.put("hide_snippet_in_conversation_list", Boolean.valueOf(dwnvVar.f));
            map4.put("hide_dismiss_button", Boolean.valueOf(dwnvVar.g));
            map4.put("dismissible_by_tapping_outside", Boolean.valueOf(dwnvVar.h));
            map.put("overlay_header", dvhy.i(map4));
        }
        map.put("intended_rendering_type", eonc.i(dwqwVar.c()));
        map.put("ACTIVE_DECORATION_IDS", dvhy.i(new ArrayList(dwqwVar.n())));
        map.put("POSSIBLE_DECORATIONS", dvhy.i(dvib.d(dwqwVar.p().values(), new ejvr() { // from class: dvus
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dwrb dwrbVar = (dwrb) obj;
                HashMap map5 = new HashMap();
                map5.put("DECORATION_ID", dwrbVar.c());
                map5.put("RENDER_CRITERIA", Integer.valueOf(dwrbVar.b().c));
                dwqy dwqyVarA = dwrbVar.a();
                HashMap map6 = new HashMap();
                map6.put(VCardConstants.PARAM_TYPE, 0);
                dwqx dwqxVar = dwqx.a;
                if (dwqxVar.equals(dwqxVar)) {
                    dwox dwoxVar = ((dwku) dwqyVarA).a;
                    HashMap map7 = new HashMap();
                    dwmq dwmqVar = (dwmq) dwoxVar;
                    map7.put("PROMPT_TEXT", dvvp.d(dwmqVar.a));
                    map7.put("BUTTONS", dvib.d(dwmqVar.b, new ejvr() { // from class: dvuv
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return dvve.b((dwrh) obj2);
                        }
                    }));
                    map6.put("DECORATION_CONTENT", map7);
                }
                map5.put("CONTENT", map6);
                return map5;
            }
        })));
        return map;
    }

    public static HashMap c(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    HashMap map = (HashMap) objectInputStream.readObject();
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return map;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | ClassNotFoundException e) {
            dvhv.d("MessageCursors", "Error loading message profile.", e);
            return new HashMap();
        }
    }
}
