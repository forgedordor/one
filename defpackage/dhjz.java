package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhjz {
    private final crmx a;

    public dhjz(crmx crmxVar) {
        this.a = crmxVar;
    }

    public final String a(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(str.indexOf(34, 1) + 2);
        }
        if (str.startsWith("<")) {
            str = str.substring(1, str.length() - 1);
        }
        if (str.startsWith("sip:") || str.startsWith("tel:")) {
            str = str.substring(4);
        } else if (str.startsWith("sips:")) {
            str = str.substring(5);
        }
        int iIndexOf = str.indexOf(64);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return (!dhjv.w(str) || dfog.w()) ? str : this.a.x(str);
    }
}
