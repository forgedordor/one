package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecxd implements ecxa {
    private final ecxa a;

    public ecxd(ecxa ecxaVar) {
        this.a = ecxaVar;
    }

    public static final int b(String str) {
        return str == null ? ecxc.a[0] : ecxc.a[Math.abs(str.hashCode()) % 21];
    }

    public final CharSequence a(dyvj dyvjVar) {
        String str;
        if (dyvjVar != null) {
            int i = 0;
            while (true) {
                String[] strArr = dyvjVar.a;
                if (i >= strArr.length) {
                    break;
                }
                String string = strArr[i];
                if (string == null || string.isEmpty() || string.equals(".")) {
                    string = null;
                } else if (string.length() > 2) {
                    ecxi ecxiVar = ((ecxb) this.a).a;
                    ejwl.l(ecxiVar.e);
                    ecxh ecxhVar = (ecxh) ecxiVar.d.get();
                    if (ecxhVar == null) {
                        str = null;
                    } else {
                        int length = string.length();
                        str = null;
                        for (int i2 = 0; i2 < length && ecxhVar != null; i2++) {
                            ecxg ecxgVar = (ecxg) ecxhVar.get(Character.valueOf(string.charAt(i2)));
                            if (ecxgVar == null) {
                                break;
                            }
                            String str2 = ecxgVar.b;
                            if (str2 != null) {
                                str = str2;
                            }
                            ecxhVar = ecxgVar.a;
                        }
                    }
                    string = str == null ? new StringBuilder().appendCodePoint(string.codePointAt(0)).toString() : str;
                }
                if (string != null) {
                    return string;
                }
                i++;
            }
        }
        return null;
    }
}
