package defpackage;

import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dgyx {
    public dgyw a;
    public String b;
    public String c;
    public String d;
    public String e;
    public byte[] f;
    public ebco g;
    public String h;
    public eyga i;
    public long j;
    public String k;
    public int l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final int t;

    public dgyx(dgyw dgywVar) {
        this(dgywVar, 1);
    }

    public final String a() {
        byte[] bArr = this.f;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public final String b() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        String str2 = this.h;
        String str3 = this.k;
        ebco ebcoVar = this.g;
        return "Type: " + str2 + "\r\nRCS message ID: " + str3 + "\r\nContent length: " + (ebcoVar == null ? "0" : Long.valueOf(ebcoVar.l())).toString();
    }

    public final String c() {
        return toString() + ": '" + dhiz.MESSAGE_CONTENT.c(a()) + "'";
    }

    public final void d(String str, byte[] bArr) {
        this.f = bArr;
        e(str);
    }

    public final void e(String str) {
        this.h = str;
        if (str != null) {
            ejuf.c(str).startsWith("message/cpim");
        }
        this.a = dgyw.a(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dgyx)) {
            return false;
        }
        dgyx dgyxVar = (dgyx) obj;
        if (this.j == dgyxVar.j && this.a == dgyxVar.a && Objects.equals(null, null) && Objects.equals(this.h, dgyxVar.h) && Objects.equals(this.b, dgyxVar.b) && Objects.equals(this.e, dgyxVar.e) && Objects.equals(this.c, dgyxVar.c) && Arrays.equals(this.f, dgyxVar.f) && this.t == dgyxVar.t) {
            return Objects.equals(this.g, dgyxVar.g);
        }
        return false;
    }

    public final void f(String str, ebco ebcoVar) {
        this.g = ebcoVar;
        e(str);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.h, this.b, this.e, this.c, this.f, Integer.valueOf(this.t)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        dhiz dhizVar = dhiz.USER_ID;
        String strC = dhizVar.c(this.b);
        String str = this.e;
        String strC2 = dhizVar.c(this.c);
        String str2 = this.k;
        String str3 = this.h;
        ebco ebcoVar = this.g;
        Object objValueOf = ebcoVar == null ? "0" : Long.valueOf(ebcoVar.l());
        int i = this.t;
        return "{ type: " + strValueOf + ", messaging method: " + dgzw.a(i) + ", receiver: " + strC + ", remote instance: " + str + ", sender: " + strC2 + ", id: " + str2 + ", contentType: " + str3 + ", length: " + objValueOf.toString() + " }";
    }

    public dgyx(dgyw dgywVar, int i) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        if (i == 2) {
            ejwl.b(dgywVar.equals(dgyw.CPIM_MESSAGE), "SLM allows only CPIM");
        }
        this.a = dgywVar;
        this.t = i;
    }

    public dgyx(String str, ebcp ebcpVar) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        this.b = str;
        this.f = ebcpVar.s();
        this.h = "message/cpim";
        ebcpVar.e();
        this.a = dgyw.a("message/cpim");
        this.t = 1;
    }

    public dgyx(String str, byte[] bArr, String str2) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        this.b = str;
        this.f = bArr;
        this.h = str2;
        this.a = dgyw.a(str2);
        this.t = 1;
    }
}
