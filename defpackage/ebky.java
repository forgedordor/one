package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebky {
    public final String a;
    public int b;
    public String f;
    public final String g;
    public final String h;
    public ArrayList j;
    public ebqr p;
    public ebqs q;
    public ebqo[] r;
    public ebqo[] s;
    public ebqo[] t;
    public String u;
    public String v;
    public ebnq c = null;
    public final String d = ebmh.a();
    public String e = null;
    public ebqr i = null;
    public boolean k = true;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public String w = null;
    public boolean x = false;

    public ebky(String str, int i, String str2, String str3, String str4, ArrayList arrayList) {
        this.b = 1;
        this.a = str;
        this.b = i;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.j = arrayList;
    }

    public final void a() {
        this.b++;
    }

    public final synchronized void b() {
        this.n = true;
    }

    public final synchronized void c() {
        this.m = true;
    }

    public final synchronized void d() {
        this.o = true;
    }

    public final void e(String str) {
        if (str.startsWith("<")) {
            str = str.substring(1);
        }
        if (str.endsWith(">")) {
            str = str.substring(0, str.length() - 1);
        }
        this.u = str;
    }

    public final synchronized void f() {
        this.l = true;
    }

    public final ebqo g() {
        ebqo[] ebqoVarArr = this.s;
        if (ebqoVarArr != null) {
            for (int i = 0; i < ebqoVarArr.length; i++) {
                if ("application/sdp".equals(ebqoVarArr[i].b)) {
                    return ebqoVarArr[i];
                }
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SipDialogPath{callId='");
        sb.append(this.a);
        sb.append("', target='");
        dhiz dhizVar = dhiz.URI;
        sb.append(dhizVar.c(this.f));
        sb.append("', localParty='");
        sb.append(dhizVar.c(this.g));
        sb.append("', remoteParty='");
        sb.append(dhizVar.c(this.h));
        sb.append("'}");
        return sb.toString();
    }
}
