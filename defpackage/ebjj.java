package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebjj {
    public static final dhip a = new dhip("MsrpMessage");
    public evqs b;
    public final ebco c;
    public final List d;
    public long e;
    public long f;
    public ebit g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public ebis l;
    public boolean m;
    public ebjn n;
    public String o;
    public int p;
    public long q;
    public int r;
    public int s;

    public ebjj() {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.d = new ArrayList();
        this.e = 0L;
        this.k = false;
        this.m = false;
        this.n = null;
        this.r = 2;
        this.s = 1;
        this.l = new ebis();
        this.g = new ebit();
        this.c = new ebcj(evqsVar, 0);
    }

    private static void h(String str) {
        if (!"yes".equals(str) && !"no".equals(str)) {
            throw new IllegalArgumentException("Undefined report required value: ".concat(str));
        }
    }

    public final String a() {
        return this.g.a("From-Path");
    }

    public final String b() {
        return this.g.a("Message-ID");
    }

    final String c() {
        return (String) ekis.j(this.d);
    }

    public final String d() {
        return this.g.a("To-Path");
    }

    public final void e(String str) {
        h(str);
        this.j = str;
    }

    public final void f(String str) {
        this.g.b("Message-ID", str);
    }

    public final void g() {
        h("no");
        this.i = "no";
    }

    public final String toString() {
        String string;
        dbhd dbhdVar = dfbu.g;
        boolean zBooleanValue = ((Boolean) dbhdVar.a()).booleanValue();
        String strB = b();
        String str = this.h;
        long j = this.e;
        String strD = zBooleanValue ? d() : "(redacted)";
        String strA = zBooleanValue ? a() : "(redacted)";
        boolean z = this.k;
        boolean z2 = this.m;
        String str2 = this.i;
        String str3 = this.j;
        if (((Boolean) dbhdVar.a()).booleanValue() || (string = this.o) == null) {
            string = this.c.toString();
            dhja.p(a, "Message content is not displayed as the inputStream can only be read once.", new Object[0]);
        }
        return "Message ID: " + strB + "\r\nContent array type: " + str + "\r\nContent array length: " + j + "\r\nTo: " + strD + "\r\nFrom: " + strA + "\r\nSilent: " + z + "\r\nCanceled: " + z2 + "\r\nSuccess report required: " + str2 + "\r\nFailure report required: " + str3 + "\r\nContent array value: \r\n" + string;
    }

    public ebjj(ebco ebcoVar, String str) {
        this.b = evqs.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.k = false;
        this.m = false;
        this.n = null;
        this.r = 2;
        this.s = 1;
        this.c = ebcoVar;
        this.h = str;
        this.e = ebcoVar.l();
        this.g = new ebit();
    }

    public ebjj(Map map) {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.d = new ArrayList();
        this.e = 0L;
        this.k = false;
        this.m = false;
        this.n = null;
        this.r = 2;
        this.l = new ebis();
        this.s = 2;
        this.g = new ebit();
        String str = (String) map.get("Message-ID");
        if (str != null) {
            this.g.b("Message-ID", str);
        }
        String str2 = (String) map.get("From-Path");
        if (str2 != null) {
            this.g.b("From-Path", str2);
        }
        String str3 = (String) map.get("To-Path");
        if (str3 != null) {
            this.g.b("To-Path", str3);
        }
        this.i = (String) map.get("Success-Report");
        this.j = (String) map.get("Failure-Report");
        this.h = (String) map.get(ffho.a);
        String str4 = (String) map.get("Byte-Range");
        if (str4 != null) {
            List listI = ejxk.b('/').i(str4);
            if (((String) listI.get(1)).equals("*")) {
                this.e = Long.MIN_VALUE;
            } else {
                this.e = Long.parseLong((String) listI.get(1));
            }
        }
        this.c = new ebcj(evqsVar, 0);
    }

    public ebjj(byte[] bArr) {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.d = new ArrayList();
        this.e = 0L;
        this.k = false;
        this.m = false;
        this.n = null;
        this.r = 2;
        this.s = 1;
        this.b = evqs.x(bArr);
        this.c = new ebcj(evqsVar, 0);
        this.h = "message/cpim";
        this.e = bArr.length;
        this.g = new ebit();
    }
}
