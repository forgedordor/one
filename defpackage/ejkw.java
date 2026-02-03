package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkw {
    public static int a(List list, Set set) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!set.contains(b((ezgi) it.next()))) {
                i++;
            }
        }
        return i;
    }

    public static ezan b(ezgi ezgiVar) {
        int i = ezgiVar.c;
        return i != 7 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 9 ? i != 20 ? i != 2 ? i != 11 ? i != 12 ? i != 13 ? i != 14 ? i != 15 ? i != 16 ? i != 17 ? i != 18 ? i != 19 ? i != 21 ? i != 22 ? i != 23 ? i != 24 ? i != 25 ? i != 26 ? i != 27 ? i != 28 ? i != 29 ? i != 30 ? i != 31 ? i == 32 ? ezan.RECORD_VOICE_MESSAGE : ezan.UNKNOWN_SUGGESTION_TYPE : ezan.OPEN_MAGIC_COMPOSE : ezan.CATEGORY_BERT : ezan.CREATE_PHOTOMOJI : ezan.SELFIE_GIF : ezan.SCREEN_EFFECTS : ezan.STARRING : ezan.SAVE_BIRTHDAY : ezan.EXPIRATION_SENTINEL : ezan.NUDGE : ezan.BUSINESS_MESSAGE : ezan.WEB : ezan.CALENDAR : ezan.COPY_OTP : ezan.RECENT_IMAGE : ezan.SENSITIVE_IMAGE : ezan.SCRIPTED_REPLY : ezan.DUO_CALL : ezan.EMOTION : ezan.REMINDER : ezan.CONTEXT : ezan.FULL_MESSAGE : ezan.SILENT : ezan.SPAM : ezan.CONTACT : ezan.GIF : ezan.PAYMENT : ezan.LOCATION : ezan.ASSISTANT_QUERY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(ezdx ezdxVar, String str) {
        if (ezdxVar.b.size() != 0) {
            return str.equals(((ezdv) ezdxVar.b.get(ezdxVar.b.size() + (-1))).d) ? 4 : 3;
        }
        return 3;
    }
}
