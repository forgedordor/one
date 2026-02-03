package defpackage;

import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarz {
    private final Set a;

    public aarz(String str) {
        ejwl.b(!str.isEmpty(), "separators must not be empty");
        this.a = new HashSet();
        for (char c : str.toCharArray()) {
            this.a.add(Character.valueOf(c));
        }
    }

    private final Optional b(String str, int i) {
        while (i < str.length() && this.a.contains(Character.valueOf(str.charAt(i)))) {
            i++;
        }
        if (i >= str.length()) {
            return Optional.empty();
        }
        int i2 = i;
        while (i2 < str.length() && !this.a.contains(Character.valueOf(str.charAt(i2)))) {
            i2++;
        }
        return Optional.of(new aasa(str, i, i2));
    }

    public final ekgb a(String str) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (str.isEmpty()) {
            return ekfwVar.g();
        }
        Optional optionalB = b(str, 0);
        while (optionalB.isPresent()) {
            ekfwVar.h(optionalB.get());
            optionalB = b(str, ((aasa) optionalB.get()).a + 1);
        }
        return ekfwVar.g();
    }
}
