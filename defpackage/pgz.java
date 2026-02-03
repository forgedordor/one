package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgz implements AutoCloseable {
    public final pjo a;

    public pgz(pjo pjoVar) {
        this.a = pjoVar;
    }

    public final phi a(String str) {
        String string = fdgn.x(str).toString();
        int length = string.length();
        pjo pjoVar = this.a;
        if (length >= 3) {
            String strSubstring = string.substring(0, 3);
            strSubstring.getClass();
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                return new phg(pjoVar, str);
            }
        }
        return new phh(pjoVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
