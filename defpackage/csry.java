package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csry {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil");

    public static Boolean a(String str) {
        List listI = ejxk.b(':').i(str);
        return (((String) listI.get(0)).equals("sip") || ((String) listI.get(0)).equals("proto")) && listI.size() >= 2 && !((String) listI.get(1)).equals("sip") && !((String) listI.get(1)).equals("proto");
    }

    public static String b(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (!a(str).booleanValue()) {
            if (z) {
                ekrd ekrdVar = (ekrd) a.j();
                ekrdVar.Z(eksk.MEDIUM);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 44, "ConferenceUriFilterUtil.java")).t("Attempting to reformat invalid conferenceUri: %s", c(str));
            }
            List listI = ejxk.b(':').i(str);
            int i = 0;
            while (i < listI.size() && (((String) listI.get(i)).contains("sip") || ((String) listI.get(i)).contains("proto"))) {
                i++;
            }
            List listSubList = listI.subList(i, listI.size());
            StringBuilder sb = new StringBuilder();
            Iterator it = listSubList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ":");
                }
            }
            try {
                chxw chxwVarD = chxx.d(sb.toString(), true);
                if (chxwVarD == null) {
                    if (z) {
                        ekrd ekrdVar2 = (ekrd) a.j();
                        ekrdVar2.Z(eksk.MEDIUM);
                        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 68, "ConferenceUriFilterUtil.java")).t("Failed to format invalid RCS conferenceUri - metadata is empty: %s", c(str));
                    }
                    return null;
                }
                Object obj = ((chul) chxwVarD).c.get();
                String str2 = (((chvb) obj).c == 2 ? (chuz) ((chvb) obj).d : chuz.a).d;
                if (true == a(str2).booleanValue()) {
                    return str2;
                }
            } catch (IllegalArgumentException | NoSuchElementException e) {
                if (z) {
                    ekrd ekrdVar3 = (ekrd) a.j();
                    ekrdVar3.Z(eksk.MEDIUM);
                    ((ekrd) ((ekrd) ekrdVar3.g(e)).h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 83, "ConferenceUriFilterUtil.java")).t("Failed to format invalid RCS conferenceUri, returning original uri: %s", c(str));
                }
            }
        }
        return str;
    }

    private static esvh c(String str) {
        return str.length() > 20 ? new esvh(esvg.SERVER_KNOWN_USER_DATA, str.substring(0, 20)) : new esvh(esvg.SERVER_KNOWN_USER_DATA, str);
    }
}
