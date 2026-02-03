package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgjs extends dgjx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Optional h;

    public dgjs(String str, String str2, String str3, String str4, String str5, String str6, String str7, Optional optional) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = optional;
    }

    @Override // defpackage.dgjx
    public final Optional a() {
        return this.h;
    }

    @Override // defpackage.dgjx
    public final String b() {
        return this.e;
    }

    @Override // defpackage.dgjx
    public final String c() {
        return this.d;
    }

    @Override // defpackage.dgjx
    public final String d() {
        return this.g;
    }

    @Override // defpackage.dgjx
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgjx) {
            dgjx dgjxVar = (dgjx) obj;
            if (this.a.equals(dgjxVar.e()) && this.b.equals(dgjxVar.f()) && this.c.equals(dgjxVar.g()) && this.d.equals(dgjxVar.c()) && this.e.equals(dgjxVar.b()) && this.f.equals(dgjxVar.h()) && this.g.equals(dgjxVar.d()) && this.h.equals(dgjxVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dgjx
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dgjx
    public final String g() {
        return this.c;
    }

    @Override // defpackage.dgjx
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "DroidGuardContentBinding{imsi=" + this.a + ", msisdn=" + this.b + ", msisdnToken=" + this.c + ", gmsCoreIidToken=" + this.d + ", cookie=" + this.e + ", salt=" + this.f + ", imei=" + this.g + ", provisioningSessionId=" + String.valueOf(this.h) + "}";
    }
}
