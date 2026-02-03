package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejqj extends ejqm {
    private static HashMap a;
    private static HashSet b;

    public ejqj() {
        a = new HashMap();
        b = new HashSet();
        c("를", "을");
        c("로", "으로");
        c("와", "과");
        c("랑", "이랑");
        c("와의", "과의");
        c("라고", "이라고");
        c("라는", "이라는");
        c("고", "");
        c("가", "이");
        c("는", "은");
    }

    private static final void c(String str, String str2) {
        if (a.get(str) == null && !str.isEmpty()) {
            a.put(str, str2);
        }
        if (a.get(str2) == null && !str2.isEmpty()) {
            a.put(str2, str);
        }
        b.add(str);
    }

    @Override // defpackage.ejqm
    public final ejql a(CharSequence charSequence, CharSequence charSequence2) {
        char cCharAt;
        if (charSequence.length() == 0) {
            return null;
        }
        ejql ejqlVar = new ejql();
        CharSequence charSequenceSubSequence = charSequence2.subSequence(0, Math.min(charSequence2.length(), 2));
        CharSequence charSequence3 = (CharSequence) a.get(charSequenceSubSequence);
        if (charSequence3 == null && charSequenceSubSequence.length() == 2) {
            charSequenceSubSequence = charSequence2.subSequence(0, 1);
            charSequence3 = (CharSequence) a.get(charSequenceSubSequence);
        }
        if (charSequence3 == null || (cCharAt = charSequence.charAt(charSequence.length() - 1)) < 44032 || cCharAt > 55203) {
            return null;
        }
        boolean z = (cCharAt + 21504) % 28 == 0;
        boolean zContains = b.contains(charSequenceSubSequence);
        if (z ^ zContains) {
            ejqlVar.e = charSequence3.toString();
            ejqlVar.d = charSequence3.length();
        } else {
            ejqlVar.e = charSequenceSubSequence.toString();
            ejqlVar.d = charSequenceSubSequence.length();
        }
        ejqlVar.c = charSequence.length() - 1;
        int length = charSequenceSubSequence.length() + charSequence3.length();
        int i = length + 2;
        if (charSequence2.length() >= i && charSequence2.charAt(ejqlVar.e.length()) == '(' && charSequence2.charAt(length + 1) == ')') {
            ejqlVar.d = i;
        }
        if (z == zContains && ejqlVar.d == charSequenceSubSequence.length()) {
            return null;
        }
        return ejqlVar;
    }
}
