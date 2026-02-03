package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkd extends ebkh {
    public final int a;
    public ebko b;
    public ebka c;
    public ebjz d;
    public final List e = new ArrayList();
    private final ebkc f;
    private final int g;
    private final String h;
    private final int i;
    private final String j;

    public ebkd(ebkc ebkcVar, int i, int i2, String str, String str2) throws NumberFormatException {
        if (ebkcVar == null) {
            throw new IllegalArgumentException("MediaType must not be null");
        }
        this.f = ebkcVar;
        this.a = i;
        this.g = i2;
        this.h = str;
        this.j = str2;
        int i3 = -1;
        if (!Objects.isNull(str2) && !TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2)) {
            i3 = Integer.parseInt(str2);
        }
        this.i = i3;
    }

    public static ebkd c(String str) {
        ebkc ebkcVar;
        int iA;
        String strC = ebkk.c(str, "m=");
        int iIndexOf = strC.indexOf(32);
        String strSubstring = strC.substring(0, iIndexOf);
        ebkc ebkcVar2 = ebkc.AUDIO;
        if (TextUtils.isEmpty(strSubstring)) {
            ebkcVar = null;
        } else {
            for (ebkc ebkcVar3 : ebkc.values()) {
                if (ebkcVar3.f.equals(strSubstring)) {
                    ebkcVar = ebkcVar3;
                    break;
                }
            }
            ebkcVar = null;
        }
        if (ebkcVar == null) {
            throw new ebki("Unknown media type: ".concat(String.valueOf(strSubstring)));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = strC.indexOf(32, i);
        String strSubstring2 = strC.substring(i, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(47);
        if (iIndexOf3 > 0) {
            String strSubstring3 = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf3);
            iA = ebkk.a(strSubstring3);
        } else {
            iA = 1;
        }
        int i2 = iIndexOf2 + 1;
        int iA2 = ebkk.a(strSubstring2);
        int iIndexOf4 = strC.indexOf(32, i2);
        return new ebkd(ebkcVar, iA2, iA, strC.substring(i2, iIndexOf4), strC.substring(iIndexOf4 + 1));
    }

    public static String d(String str) throws Exception {
        try {
            int iIndexOf = str.indexOf("://") + 3;
            return str.substring(iIndexOf, str.indexOf(":", iIndexOf));
        } catch (StringIndexOutOfBoundsException e) {
            throw new Exception("MSRP Path is not a valid MSRP URI", e);
        }
    }

    public final ebkb a(String str) {
        for (ebkb ebkbVar : this.e) {
            if (ebkbVar.a.equals(str)) {
                return ebkbVar;
            }
        }
        return null;
    }

    @Override // defpackage.ebkh
    public final void b(StringBuilder sb) {
        sb.append("m=");
        sb.append(this.f.f);
        sb.append(" ");
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.h);
        sb.append(" ");
        sb.append(this.j);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        ebko ebkoVar = this.b;
        if (ebkoVar != null) {
            ebkoVar.b(sb);
        }
        ebka ebkaVar = this.c;
        if (ebkaVar != null) {
            ebkaVar.b(sb);
        }
        ebjz ebjzVar = this.d;
        if (ebjzVar != null) {
            ebjzVar.b(sb);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ebkb) it.next()).b(sb);
        }
    }

    public final void e(ebkb ebkbVar) {
        this.e.add(ebkbVar);
    }

    public final boolean equals(Object obj) {
        if (Objects.isNull(obj) || !(obj instanceof ebkd)) {
            return false;
        }
        ebkd ebkdVar = (ebkd) obj;
        if (this.f != ebkdVar.f || this.i != ebkdVar.i || this.a != ebkdVar.a || this.g != ebkdVar.g || !TextUtils.equals(this.j, ebkdVar.j) || !TextUtils.equals(this.h, ebkdVar.h)) {
            return false;
        }
        List list = this.e;
        List list2 = ebkdVar.e;
        if (list.size() != list2.size()) {
            return false;
        }
        ebjz ebjzVar = this.d;
        if (ebjzVar == null && ebkdVar.d != null) {
            return false;
        }
        if (ebjzVar != null && !ebjzVar.equals(ebkdVar.d)) {
            return false;
        }
        ebka ebkaVar = this.c;
        if (ebkaVar == null && ebkdVar.c != null) {
            return false;
        }
        if (ebkaVar != null && !ebkaVar.equals(ebkdVar.c)) {
            return false;
        }
        ebko ebkoVar = this.b;
        if (ebkoVar != null || ebkdVar.b == null) {
            return (ebkoVar == null || ebkoVar.equals(ebkdVar.b)) && list.equals(list2);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.i * 37) + this.a) * 37) + this.g) * 37) + this.e.hashCode();
        String str = this.j;
        if (!TextUtils.isEmpty(str)) {
            iHashCode = (iHashCode * 37) + str.hashCode();
        }
        String str2 = this.h;
        if (!TextUtils.isEmpty(str2)) {
            iHashCode = (iHashCode * 37) + str2.hashCode();
        }
        int iHashCode2 = (iHashCode * 37) + this.f.hashCode();
        ebjz ebjzVar = this.d;
        if (ebjzVar != null) {
            iHashCode2 = (iHashCode2 * 37) + ebjzVar.hashCode();
        }
        ebka ebkaVar = this.c;
        if (ebkaVar != null) {
            iHashCode2 = (iHashCode2 * 37) + ebkaVar.hashCode();
        }
        ebko ebkoVar = this.b;
        return ebkoVar != null ? (iHashCode2 * 37) + ebkoVar.hashCode() : iHashCode2;
    }
}
