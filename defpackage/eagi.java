package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagi {
    private final eagl a = new eagl();

    public final boolean a(CharSequence charSequence, eagf eagfVar) {
        String str = eagfVar.a;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = this.a.a(str).matcher(charSequence);
        return matcher.lookingAt() && matcher.matches();
    }
}
