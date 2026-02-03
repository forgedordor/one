package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmug {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/sms/config/HiddenContacts");
    public final List a;

    private cmug(List list) {
        cqaz.k(!list.isEmpty());
        this.a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cmug b(final int r27, java.lang.String r28, final defpackage.crny r29) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmug.b(int, java.lang.String, crny):cmug");
    }

    public final cmue a(alqm alqmVar) throws NumberFormatException {
        cczv cczvVar = alvx.a;
        if (alqmVar.x(((Boolean) new alvj().get()).booleanValue())) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 198, "HiddenContacts.java")).q("HiddenContacts: invalid input number (empty)");
            return null;
        }
        String strP = alqmVar.p(((Boolean) new alvj().get()).booleanValue());
        if (strP == null) {
            return null;
        }
        int length = strP.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int iDigit = Character.digit(strP.charAt(i), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            ekrw ekrwVarJ2 = b.j();
            ekrwVarJ2.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 210, "HiddenContacts.java")).t("HiddenContacts: invalid input number: %s", strP);
            return null;
        }
        try {
            long j = Long.parseLong(string);
            loop1: for (cmue cmueVar : this.a) {
                Optional optional = cmueVar.b;
                if (!optional.isEmpty()) {
                    Iterator it = cmueVar.c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            cmuf cmufVar = (cmuf) it.next();
                            if (j >= cmufVar.a && j <= cmufVar.b) {
                                break loop1;
                            }
                        } else if (alqmVar.equals(optional.get())) {
                        }
                    }
                    return cmueVar;
                }
            }
            return null;
        } catch (NumberFormatException unused) {
            ekrw ekrwVarJ3 = b.j();
            ekrwVarJ3.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/sms/config/HiddenContacts", "find", 217, "HiddenContacts.java")).t("HiddenContacts: invalid input number: %s", strP);
            return null;
        }
    }
}
