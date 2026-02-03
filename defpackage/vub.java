package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vub {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator");
    private final cqmb b;

    public vub(cqmb cqmbVar) {
        cqmbVar.getClass();
        this.b = cqmbVar;
    }

    private static final List b(int i, Integer num, boolean z) {
        fcww fcwwVar = new fcww((byte[]) null);
        emnc emncVarA = emnb.a((emoo) emop.a.createBuilder());
        emqt emqtVar = (emqt) emqu.a.createBuilder();
        emqtVar.getClass();
        eobr.b(vua.a(i), emqtVar);
        if (z) {
            eobr.c(emqtVar);
        }
        emncVarA.d(eobr.a(emqtVar));
        fcwwVar.add(emncVarA.a());
        if (num != null) {
            emop emopVarB = vtp.b(1, null);
            int iIntValue = num.intValue();
            ArrayList arrayList = new ArrayList(iIntValue);
            for (int i2 = 0; i2 < iIntValue; i2++) {
                arrayList.add(emopVarB);
            }
            fcva.y(fcwwVar, arrayList);
        }
        return fcva.a(fcwwVar);
    }

    public final List a(String str, vto vtoVar, boolean z) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Cannot get AttachmentInfo for empty text");
        }
        lcb lcbVarA = this.b.a(str);
        Object obj = lcbVarA.a;
        if (((Number) obj).intValue() < 0 && ((Number) lcbVarA.b).intValue() < 0) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator", "infoFromText", 55, "TextAttachmentInfoCreator.kt")).q("EmojiUtils returned negative pair, treating all text as not emoji");
        }
        if (((Integer) obj).intValue() <= 0) {
            obj = null;
        }
        fcti fctiVar = new fcti(obj, Integer.valueOf(str.length()));
        Integer num = (Integer) fctiVar.a;
        int iIntValue = ((Number) fctiVar.b).intValue();
        if (vtoVar == null) {
            return b(iIntValue, num, z);
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Map.Entry entry : vtoVar.a.entrySet()) {
            vtr vtrVar = (vtr) entry.getKey();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (iIntValue2 <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            i += iIntValue2;
            emop emopVarB = vtp.b(vtrVar.b, Boolean.valueOf(vtrVar.a));
            ArrayList arrayList2 = new ArrayList(iIntValue2);
            for (int i2 = 0; i2 < iIntValue2; i2++) {
                arrayList2.add(emopVarB);
            }
            fcva.y(arrayList, arrayList2);
        }
        List listAo = fcva.ao(arrayList);
        if (num != null && num.intValue() != i) {
            ekrw ekrwVarJ2 = a.j();
            ekrwVarJ2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator", "createAttachmentInfoComparingEmojiAnnotations", 103, "TextAttachmentInfoCreator.kt")).w("Manual count of emojis does not match count of EmojiAnnotations: %d, %s", num.intValue(), vtoVar);
            return b(length, num, z);
        }
        fcww fcwwVar = new fcww((byte[]) null);
        emnc emncVarA = emnb.a((emoo) emop.a.createBuilder());
        emqt emqtVar = (emqt) emqu.a.createBuilder();
        emqtVar.getClass();
        eobr.b(vua.a(length), emqtVar);
        if (z) {
            eobr.c(emqtVar);
        }
        emncVarA.d(eobr.a(emqtVar));
        fcwwVar.add(emncVarA.a());
        fcva.y(fcwwVar, listAo);
        return fcva.a(fcwwVar);
    }
}
