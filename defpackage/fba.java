package defpackage;

import androidx.car.app.model.Alert;
import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fba {
    public static final int a(String str, int i) {
        String str2;
        int i2;
        lpz lpzVarC = c();
        Integer num = null;
        if (lpzVarC != null) {
            lcg.d(lpzVarC.i(), "Not initialized yet");
            lcg.j(str, "charSequence cannot be null");
            lqg lqgVar = lpzVarC.f.a;
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                str2 = str;
                i2 = ((lqd) lqgVar.a(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new lqd(i))).b;
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int b(String str, int i) {
        lpz lpzVarC = c();
        Integer num = null;
        if (lpzVarC != null) {
            Integer numValueOf = Integer.valueOf(lpzVarC.a(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final lpz c() {
        if (!lpz.h()) {
            return null;
        }
        lpz lpzVarC = lpz.c();
        if (lpzVarC.b() == 1) {
            return lpzVarC;
        }
        return null;
    }

    public static final int d(CharSequence charSequence, int i) {
        return Character.offsetByCodePoints(charSequence, i, -1);
    }
}
