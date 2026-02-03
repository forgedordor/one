package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atdm {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final String b;
    public int c;

    public atdm(String str) {
        this.b = str;
    }

    public final String a() {
        String str;
        int i = this.c;
        while (true) {
            str = this.b;
            if (i >= str.length() || !Character.isLetterOrDigit(str.charAt(i))) {
                break;
            }
            i++;
        }
        String strSubstring = str.substring(this.c, i);
        this.c = i;
        return strSubstring;
    }

    public final String b() throws atdh {
        String str = this.b;
        if (str.charAt(this.c) != '\"') {
            return a();
        }
        int i = this.c + 1;
        this.c = i;
        int iIndexOf = str.indexOf(34, i);
        c(iIndexOf != -1);
        String strSubstring = str.substring(this.c, iIndexOf);
        this.c = iIndexOf + 1;
        return strSubstring;
    }

    public final void c(boolean z) throws atdh {
        if (!z) {
            throw new atdh(String.format("Parsing error at position: %d in '%s'", Integer.valueOf(this.c), this.b));
        }
    }

    public final void d() {
        while (!e() && Character.isWhitespace(this.b.charAt(this.c))) {
            this.c++;
        }
    }

    public final boolean e() {
        return this.c == this.b.length();
    }
}
