package defpackage;

import com.android.vcard.VCardBuilder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebpc {
    protected static final String b = StandardCharsets.UTF_8.name();
    public eboa e;
    public ebos f;
    public ebnn g;
    protected ebno h;
    public ebnu i;
    public ebnq j;
    public byte[] k;
    public final int l;
    public final long c = System.currentTimeMillis();
    public final List d = new ArrayList();
    private final Map a = new HashMap();

    public ebpc(int i) {
        this.l = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(defpackage.ebob r4, boolean r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebpc.w(ebob, boolean, boolean):void");
    }

    private final void x(StringBuffer stringBuffer) {
        List<ebob> list = this.d;
        synchronized (list) {
            for (ebob ebobVar : list) {
                if (!(ebobVar instanceof ebnu)) {
                    stringBuffer.append(ebobVar.c());
                }
            }
        }
    }

    public String a() {
        StringBuffer stringBuffer = new StringBuffer();
        l(stringBuffer);
        return stringBuffer.toString();
    }

    public byte[] b() {
        StringBuffer stringBuffer = new StringBuffer();
        x(stringBuffer);
        byte[] bArr = this.k;
        if (bArr == null) {
            stringBuffer.append("Content-Length: 0\r\n");
            stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
            return stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
        }
        stringBuffer.append("Content-Length: ");
        int length = bArr.length;
        stringBuffer.append(length);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        byte[] bytes = stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
        if (bytes == null) {
            return null;
        }
        int length2 = bytes.length;
        byte[] bArr2 = new byte[length2 + length];
        System.arraycopy(bytes, 0, bArr2, 0, length2);
        System.arraycopy(bArr, 0, bArr2, length2, length);
        return bArr2;
    }

    public final ebns c() {
        return (ebns) e("Contact");
    }

    public final ebob d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null");
        }
        ebob ebobVar = (ebob) this.a.get(str.toLowerCase(Locale.US));
        return ebobVar instanceof eboc ? ((eboc) ebobVar).f() : ebobVar;
    }

    public final eboc e(String str) {
        ebob ebobVar = (ebob) this.a.get(str.toLowerCase(Locale.US));
        return ebobVar instanceof eboc ? (eboc) ebobVar : ebobVar instanceof ebov ? new ebow((ebov) ebobVar) : ebobVar instanceof ebnr ? new ebns((ebnr) ebobVar) : ebobVar == null ? str.equals("Contact") ? new ebns() : str.equals("Via") ? new ebow() : new eboc(str) : new eboc(ebobVar);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebpc)) {
            return false;
        }
        ebpc ebpcVar = (ebpc) obj;
        if (this.l != ebpcVar.l) {
            return false;
        }
        List list = ebpcVar.d;
        List list2 = this.d;
        if (list.size() != list2.size()) {
            return false;
        }
        if ((this.k == null && ebpcVar.k != null) || !list.equals(list2)) {
            return false;
        }
        byte[] bArr = this.k;
        return bArr == null || Arrays.equals(bArr, ebpcVar.k);
    }

    public final ebov f() {
        ebow ebowVarG = g();
        if (ebowVarG == null) {
            return null;
        }
        return (ebov) ebowVarG.f();
    }

    public final ebow g() {
        return (ebow) e("Via");
    }

    public final String h() {
        ebno ebnoVar = this.h;
        if (ebnoVar == null) {
            return null;
        }
        return ebnoVar.a();
    }

    public int hashCode() {
        int iHashCode = ((this.l - 1) * 37) + this.d.hashCode();
        byte[] bArr = this.k;
        if (bArr != null) {
            for (byte b2 : bArr) {
                iHashCode = (iHashCode * 37) + b2;
            }
        }
        return iHashCode;
    }

    public String i() {
        ebnn ebnnVar = this.g;
        if (ebnnVar == null) {
            return null;
        }
        return ebnnVar.e();
    }

    public final List j(String str) {
        ebob ebobVar = (ebob) this.a.get(str.toLowerCase(Locale.US));
        if (ebobVar == null) {
            return new ArrayList();
        }
        if (ebobVar instanceof eboc) {
            return ((eboc) ebobVar).a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ebobVar);
        return arrayList;
    }

    public final void k(ebob ebobVar) {
        if (ebobVar instanceof ebov) {
            w(ebobVar, false, true);
        } else {
            w(ebobVar, false, false);
        }
    }

    public final void l(StringBuffer stringBuffer) {
        String strI;
        x(stringBuffer);
        ebnu ebnuVar = this.i;
        if (ebnuVar != null) {
            stringBuffer.append(ebnuVar.c());
            stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        if (this.k != null) {
            try {
                ebnv ebnvVar = (ebnv) this.a.get(ffho.a.toLowerCase(Locale.US));
                String str = b;
                if (ebnvVar != null && (strI = ebnvVar.i("charset")) != null) {
                    str = strI;
                }
                stringBuffer.append(new String(this.k, str));
            } catch (Exception e) {
                dhja.q("Error trying to encode message content: %s", e.getMessage());
            }
        }
    }

    public final void m(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null");
        }
        Map map = this.a;
        ebob ebobVar = (ebob) map.get(str.toLowerCase(Locale.US));
        if (ebobVar == null) {
            return;
        }
        map.remove(str.toLowerCase(Locale.US));
        if (ebobVar instanceof eboa) {
            this.e = null;
        } else if (ebobVar instanceof ebos) {
            this.f = null;
        } else if (ebobVar instanceof ebnn) {
            this.g = null;
        } else if (ebobVar instanceof ebno) {
            this.h = null;
        } else if (ebobVar instanceof ebnu) {
            this.i = null;
        } else if (ebobVar instanceof ebnq) {
            this.j = null;
        }
        List list = this.d;
        Iterator it = list.iterator();
        int i = -1;
        while (it.hasNext()) {
            i++;
            if (((ebob) it.next()).c.equalsIgnoreCase(str)) {
                break;
            }
        }
        if (i == -1 || i >= list.size()) {
            return;
        }
        list.remove(i);
    }

    public final void n(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Content must not be null");
        }
        ebnu ebnuVar = this.i;
        if (ebnuVar != null) {
            ebnuVar.b(bArr.length);
        }
        this.k = bArr;
    }

    public final void o(byte[] bArr, ebob ebobVar) {
        if (bArr == null) {
            throw new IllegalArgumentException("Content must not be null");
        }
        p(ebobVar);
        this.k = bArr;
        ebnu ebnuVar = this.i;
        if (ebnuVar != null) {
            ebnuVar.b(bArr.length);
        }
    }

    public final void p(ebob ebobVar) {
        if (ebobVar == null) {
            throw new IllegalArgumentException("Header must not be null!");
        }
        if ((ebobVar instanceof eboc) && ((eboc) ebobVar).i()) {
            return;
        }
        m(ebobVar.c);
        w(ebobVar, true, false);
    }

    public final boolean q(String str) {
        return this.a.containsKey(str.toLowerCase(Locale.US));
    }

    public final boolean r() {
        int i = this.l;
        return i == 3 || i == 4;
    }

    public final boolean s() {
        return this.l == 1;
    }

    public final boolean t() {
        return this.l == 2;
    }

    public final String u(int i) {
        String strI = i();
        if (strI == null) {
            return null;
        }
        return v(strI, i);
    }

    public final String v(String str, int i) {
        ebno ebnoVar;
        ebnn ebnnVar = this.g;
        if (ebnnVar == null || (ebnoVar = this.h) == null) {
            return null;
        }
        String strA = ebnoVar.a();
        int iB = ebnnVar.b();
        return (i != 1 ? "OUTGOING" : "INCOMING") + "_" + strA + "_" + str + "_" + iB;
    }
}
