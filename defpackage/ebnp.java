package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnp extends ebmd implements Cloneable {
    protected String a;
    protected String b;

    public ebnp() {
    }

    @Override // defpackage.ebmd
    public final String c() {
        String str = this.b;
        if (str == null) {
            return this.a;
        }
        return this.a + "@" + str;
    }

    @Override // defpackage.ebmd
    public final Object clone() {
        ebnp ebnpVar = new ebnp();
        ebnpVar.a = this.a;
        ebnpVar.b = this.b;
        return ebnpVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                ebnp ebnpVar = (ebnp) obj;
                if (this.a.compareTo(ebnpVar.a) != 0) {
                    return false;
                }
                String str2 = this.b;
                if (str2 == null && ebnpVar.b == null) {
                    return true;
                }
                if (str2 != null && (str = ebnpVar.b) != null) {
                    return str2.equalsIgnoreCase(str);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return 22227650;
    }

    public ebnp(String str) {
        int iIndexOf = str.indexOf(64);
        if (iIndexOf == -1) {
            this.a = str;
            this.b = null;
            return;
        }
        this.a = str.substring(0, iIndexOf);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        this.b = strSubstring;
        if (this.a == null || strSubstring == null) {
            throw new IllegalArgumentException("CallIdHeader  must be token@token or token");
        }
    }
}
