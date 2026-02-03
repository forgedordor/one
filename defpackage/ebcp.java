package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.android.vcard.VCardBuilder;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebcp {
    public static final dfny a = dfod.a(184631359);
    private static int d = 1;
    public byte[] c;
    private final SortedMap e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final SortedMap b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final SortedMap f = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final Map g = new HashMap();

    public ebcp(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            str = str + "; charset=" + str2;
        }
        k(ffho.a, str);
    }

    public static ebcp b(byte[] bArr) throws NumberFormatException, IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        final ebcp ebcpVar = new ebcp("unknown", "");
        ebct.a(byteArrayInputStream, new Consumer() { // from class: ebcs
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Pair pair = (Pair) obj;
                boolean zEquals = "NS".equals(pair.first);
                ebcp ebcpVar2 = this.a;
                if (!zEquals) {
                    ebcpVar2.m((String) pair.first, (String) pair.second);
                    return;
                }
                String str = (String) pair.second;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String[] strArrSplit = str.split(" ");
                int length = strArrSplit.length;
                if (length == 1) {
                    dhja.c("Setting default name space binding to: %s", str);
                    ebcpVar2.o("", str);
                } else {
                    if (length != 2) {
                        dhja.q("Ignoring invalid name space binding: %s", str);
                        return;
                    }
                    String str2 = strArrSplit[0];
                    String str3 = strArrSplit[1];
                    if (str3.length() < 3) {
                        dhja.q("Ignoring invalid name space binding: %s", str);
                    } else {
                        ebcpVar2.o(str2, str3.substring(1, str3.length() - 1));
                    }
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ebct.a(byteArrayInputStream, new Consumer() { // from class: ebcr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Pair pair = (Pair) obj;
                this.a.k((String) pair.first, (String) pair.second);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String strD = ebcpVar.d("Content-Length");
        int i = 0;
        if (TextUtils.isEmpty(strD) || !TextUtils.isDigitsOnly(strD)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            byte[] bArr2 = new byte[1024];
            for (int i2 = byteArrayInputStream.read(bArr2); i2 >= 0; i2 = byteArrayInputStream.read(bArr2)) {
                byteArrayOutputStream.write(bArr2, 0, i2);
            }
            ebcpVar.j(byteArrayOutputStream.toByteArray());
            return ebcpVar;
        }
        int i3 = Integer.parseInt(strD);
        byte[] bArr3 = new byte[i3];
        do {
            int i4 = byteArrayInputStream.read(bArr3, i, i3 - i);
            if (i4 < 0) {
                throw new dhii(a.e(i3, "Stream closed before receiving ", " bytes!"));
            }
            i += i4;
        } while (i < i3);
        ebcpVar.j(bArr3);
        return ebcpVar;
    }

    private static void u(Writer writer, String str, String str2) throws IOException {
        writer.write(str);
        if (TextUtils.isEmpty(str) || !str.contains(";lang")) {
            writer.write(":");
        }
        writer.write(" ");
        writer.write(str2);
        writer.write(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final long a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strT = t();
        return strT != null ? dhie.c(strT).a : jCurrentTimeMillis;
    }

    public final eyga c() {
        eyfy eyfyVar = (eyfy) eyga.a.createBuilder();
        for (Map.Entry entry : this.g.entrySet()) {
            String str = (String) entry.getKey();
            if (!ejuf.e(str, "urn:ietf:params:imdn") && (((Boolean) a.a()).booleanValue() || !ejuf.e(str, "http://id.messages.google.com"))) {
                String strValueOf = String.valueOf((String) entry.getValue());
                eygc eygcVar = (eygc) eyge.a.createBuilder();
                for (Map.Entry entry2 : this.b.entrySet()) {
                    String strConcat = strValueOf.concat(".");
                    String str2 = (String) entry2.getKey();
                    if (str2.startsWith(strConcat)) {
                        eygcVar.b(str2.substring(strConcat.length()), (String) entry2.getValue());
                    }
                }
                if (DesugarCollections.unmodifiableMap(((eyge) eygcVar.instance).b).size() > 0) {
                    eyfyVar.a((String) entry.getKey(), (eyge) eygcVar.build());
                }
            }
        }
        return (eyga) eyfyVar.build();
    }

    public final String d(String str) {
        return (String) this.f.get(str);
    }

    public final String e() {
        String strD = d(ffho.a);
        if (Objects.isNull(strD) || TextUtils.isEmpty(strD)) {
            return null;
        }
        int iIndexOf = strD.indexOf(";");
        return iIndexOf != -1 ? strD.substring(0, iIndexOf).trim() : strD;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebcp)) {
            return false;
        }
        ebcp ebcpVar = (ebcp) obj;
        byte[] bArr = this.c;
        if (bArr != null || ebcpVar.c == null) {
            return (bArr == null || ebcpVar.c != null) && Arrays.equals(bArr, ebcpVar.c) && this.g.equals(ebcpVar.g) && this.f.equals(ebcpVar.f) && this.b.equals(ebcpVar.b) && this.e.equals(ebcpVar.e);
        }
        return false;
    }

    public final String f() {
        return (String) this.b.get("From");
    }

    public final String g(String str, String str2) {
        String str3 = (String) this.g.get(str);
        return (Objects.isNull(str3) || "".equals(str3)) ? (String) this.b.get(str2) : (String) this.b.get(a.q(str2, str3, "."));
    }

    public final String h() {
        if (!"multipart/mixed".equals(e())) {
            return null;
        }
        String strD = d(ffho.a);
        if (Objects.isNull(strD)) {
            return null;
        }
        return dfpy.a(strD);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.g, this.f, this.b, this.e});
    }

    public final String i() {
        return (String) this.b.get("To");
    }

    public final void j(byte[] bArr) {
        this.c = bArr;
        this.f.put("Content-Length", Integer.toString(bArr.length));
    }

    public final void k(String str, String str2) {
        this.f.put(str, str2);
    }

    public final void l(String str) {
        this.b.put("From", ebcq.a(str).toString());
    }

    public final void m(String str, String str2) {
        this.b.put(str, str2);
    }

    public final void n(String str, String str2, String str3) {
        String str4 = (String) this.g.get(str);
        if (Objects.isNull(str4) || "".equals(str4)) {
            int i = d;
            d = i + 1;
            str4 = "n" + i;
            o(str4, str);
        }
    }

    public final void o(String str, String str2) {
        this.g.put(str2, str);
    }

    public final void p(String str) {
        this.b.put("To", ebcq.a(str).toString());
    }

    public final void q(OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "utf-8");
        SortedMap sortedMap = this.e;
        if (!sortedMap.isEmpty()) {
            for (Map.Entry entry : sortedMap.entrySet()) {
                u(outputStreamWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            String str = (String) entry2.getKey();
            u(outputStreamWriter, "NS", ((String) entry2.getValue()) + " <" + str + ">");
        }
        for (Map.Entry entry3 : this.b.entrySet()) {
            u(outputStreamWriter, (String) entry3.getKey(), (String) entry3.getValue());
        }
        outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        for (Map.Entry entry4 : this.f.entrySet()) {
            u(outputStreamWriter, (String) entry4.getKey(), (String) entry4.getValue());
        }
        outputStreamWriter.write(VCardBuilder.VCARD_END_OF_LINE);
        outputStreamWriter.flush();
        outputStream.write(this.c);
    }

    public final boolean r() {
        String strE = e();
        if (Objects.isNull(strE)) {
            return false;
        }
        return dhim.e(strE, "multipart/mixed");
    }

    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            q(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public final String t() {
        return (String) this.b.get("DateTime");
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            q(byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
