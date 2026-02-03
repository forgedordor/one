package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfx {
    public static final ecfx a = new ecfx(null);
    private final List b;

    static {
        new ecfv(null, null);
    }

    public ecfx(List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public static final String a(String str) {
        try {
            return URLEncoder.encode(str, ecgk.a.displayName());
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ecfv b(Uri uri) {
        ecfx ecfxVar;
        ecft ecftVar;
        String str;
        String[] strArr;
        int i;
        int i2;
        char c;
        ArrayList arrayList;
        boolean z;
        ecft ecftVar2;
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment)) {
            ecfxVar = a;
        } else {
            ArrayList<ecfs> arrayList2 = new ArrayList();
            String[] strArrSplit = encodedFragment.split("&");
            int length = strArrSplit.length;
            int i3 = 0;
            int i4 = 0;
            while (i4 < length) {
                char c2 = 2;
                String[] strArrSplit2 = strArrSplit[i4].split("=", 2);
                ArrayList arrayList3 = new ArrayList();
                String str2 = strArrSplit2[i3];
                boolean z2 = !TextUtils.isEmpty(str2);
                Object[] objArr = new Object[1];
                objArr[i3] = encodedFragment;
                ecgq.a(z2, "malformed key: %s", objArr);
                boolean z3 = (strArrSplit2.length != 2 || TextUtils.isEmpty(strArrSplit2[1])) ? i3 : 1;
                Object[] objArr2 = new Object[1];
                objArr2[i3] = encodedFragment;
                ecgq.a(z3, "missing param value: %s", objArr2);
                String[] strArrSplit3 = strArrSplit2[1].split("\\+");
                int i5 = i3;
                while (i5 < strArrSplit3.length) {
                    String strSubstring = strArrSplit3[i5];
                    if (strSubstring.isEmpty()) {
                        str = encodedFragment;
                        strArr = strArrSplit;
                        i = length;
                        i2 = i3;
                        c = c2;
                    } else {
                        int iIndexOf = strSubstring.indexOf("(");
                        if (iIndexOf != -1) {
                            String strSubstring2 = strSubstring.substring(iIndexOf);
                            int i6 = i3;
                            if (strSubstring2.charAt(i3) == '(' && strSubstring2.charAt(strSubstring2.length() - 1) == ')') {
                                str = encodedFragment;
                                z = 1;
                            } else {
                                str = encodedFragment;
                                z = i6;
                            }
                            Object[] objArr3 = new Object[1];
                            objArr3[i6] = str;
                            ecgq.a(z, "malformed fragment subparams: %s", objArr3);
                            String strSubstring3 = strSubstring2.substring(1, strSubstring2.length() - 1);
                            arrayList = new ArrayList();
                            String[] strArrSplit4 = strSubstring3.split(",");
                            int i7 = i6;
                            while (i7 < strArrSplit4.length) {
                                String str3 = strSubstring3;
                                String[] strArrSplit5 = strArrSplit4[i7].split("=", 2);
                                String str4 = strArrSplit5[i6];
                                String[] strArr2 = strArrSplit;
                                boolean z4 = !TextUtils.isEmpty(str4);
                                int i8 = length;
                                Object[] objArr4 = new Object[1];
                                objArr4[i6] = str3;
                                ecgq.a(z4, "missing fragment subparam key: %s", objArr4);
                                if (strArrSplit5.length != 2 || TextUtils.isEmpty(strArrSplit5[1])) {
                                    arrayList.add(new ecfw(c(str4), null));
                                } else {
                                    arrayList.add(new ecfw(c(str4), c(strArrSplit5[1])));
                                }
                                i7++;
                                strSubstring3 = str3;
                                length = i8;
                                strArrSplit = strArr2;
                            }
                            strArr = strArrSplit;
                            i = length;
                            i2 = i6;
                            c = 2;
                            strSubstring = strSubstring.substring(i2, iIndexOf);
                        } else {
                            str = encodedFragment;
                            strArr = strArrSplit;
                            i = length;
                            i2 = i3;
                            c = 2;
                            boolean z5 = !strSubstring.contains(")");
                            Object[] objArr5 = new Object[1];
                            objArr5[i2] = str;
                            ecgq.a(z5, "malformed fragment subparams: %s", objArr5);
                            arrayList = null;
                        }
                        arrayList3.add(new ecfu(c(strSubstring), arrayList));
                    }
                    i5++;
                    i3 = i2;
                    c2 = c;
                    encodedFragment = str;
                    length = i;
                    strArrSplit = strArr;
                }
                arrayList2.add(new ecfs(c(str2), arrayList3));
                i4++;
                encodedFragment = encodedFragment;
                strArrSplit = strArrSplit;
            }
            int i9 = i3;
            ArrayList<ecfs> arrayList4 = new ArrayList();
            for (ecfs ecfsVar : arrayList2) {
                int i10 = i9;
                while (true) {
                    if (i10 >= arrayList4.size()) {
                        arrayList4.add(ecfsVar);
                        break;
                    }
                    if (((ecfs) arrayList4.get(i10)).a.equals(ecfsVar.a)) {
                        arrayList4.set(i10, ecfsVar);
                        break;
                    }
                    i10++;
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (ecfs ecfsVar2 : arrayList4) {
                List<ecfu> list = ecfsVar2.b;
                if (list.isEmpty()) {
                    ecftVar = null;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    for (ecfu ecfuVar : list) {
                        arrayList6.add(new ecfv(ecfuVar.a, ecfuVar.b));
                    }
                    ecftVar = new ecft(ecfsVar2.a, arrayList6);
                }
                if (ecftVar != null) {
                    arrayList5.add(ecftVar);
                }
            }
            ecfxVar = new ecfx(arrayList5);
        }
        Iterator it = ecfxVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                ecftVar2 = null;
                break;
            }
            ecft ecftVar3 = (ecft) it.next();
            if (ecftVar3.a.equals("transform")) {
                ecftVar2 = ecftVar3;
                break;
            }
        }
        if (ecftVar2 == null) {
            return null;
        }
        for (ecfv ecfvVar : ecftVar2.b) {
            if (ecfvVar.a.equals("encrypt")) {
                return ecfvVar;
            }
        }
        return null;
    }

    private static final String c(String str) {
        try {
            return URLDecoder.decode(str, ecgk.a.displayName());
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException();
        }
    }

    public final String toString() {
        return TextUtils.join("&", this.b);
    }
}
