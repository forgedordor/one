package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssc {
    private static final ejvf a = ejvf.m(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff");
    private static final ejvf b = new ejva(new ejvd(new ejvd(new ejuu(0, 31), new ejuv(127)), ejvf.m(" @,:<>")));
    private boolean c;
    private String d;
    private String e;

    private cssc(String str) {
        int iLastIndexOf;
        int iIndexOf;
        boolean z = false;
        this.c = false;
        this.d = null;
        this.e = null;
        if (str != null && (iLastIndexOf = str.lastIndexOf(64)) > 0 && iLastIndexOf != str.length() - 1) {
            this.d = str.substring(0, iLastIndexOf);
            String strSubstring = str.substring(iLastIndexOf + 1);
            this.e = strSubstring;
            String str2 = this.d;
            if (str2 != null && strSubstring != null && str2.length() != 0 && strSubstring.length() != 0) {
                ejvf ejvfVar = a;
                if (ejvfVar.d(strSubstring) < 0 && this.e.length() >= 4 && (iIndexOf = this.e.indexOf(46)) != -1 && !this.e.contains("..") && this.e.charAt(0) != '.') {
                    int iIndexOf2 = this.e.indexOf(46, iIndexOf + 1);
                    if (this.e.charAt(r5.length() - 1) != '.' || iIndexOf2 != -1) {
                        ejvf ejvfVar2 = b;
                        if (ejvfVar2.i(this.e)) {
                            ejvf ejvfVar3 = ejuq.a;
                            if (ejvfVar3.i(this.e)) {
                                if (this.d.startsWith("\"")) {
                                    int length = this.d.length() - 1;
                                    if (length > 0 && this.d.endsWith("\"")) {
                                        int i = 1;
                                        while (i < length) {
                                            char cCharAt = this.d.charAt(i);
                                            if (cCharAt == '\"' || cCharAt == 127 || ((cCharAt < ' ' && !ejvfVar.c(cCharAt)) || cCharAt >= 128 || (cCharAt == '\\' && (i = i + 1) >= length))) {
                                                break;
                                            } else {
                                                i++;
                                            }
                                        }
                                        z = true;
                                    }
                                } else if (ejvfVar.d(this.d) < 0 && !this.d.contains("..") && ejvfVar2.i(this.d) && ejvfVar3.i(this.d)) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.c = z;
    }

    public static boolean a(String str) {
        return new cssc(str).c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cssc) {
            return toString().equals(((cssc) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.d + "@" + this.e;
    }
}
