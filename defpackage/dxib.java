package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxib extends dxid {
    public final String a;
    public final int b;
    private final String c;
    private final Integer d;
    private final String e;
    private final byte[] f;
    private final String g;
    private final int h;
    private final int i;

    public dxib(String str, int i, int i2, int i3, Integer num, String str2, byte[] bArr, String str3, String str4) {
        this.c = str;
        this.b = i;
        this.h = i2;
        this.i = i3;
        this.d = num;
        this.e = str2;
        this.f = bArr;
        this.g = str3;
        this.a = str4;
    }

    @Override // defpackage.dxid
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.dxid
    protected final String b() {
        return this.g;
    }

    @Override // defpackage.dxid
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dxid
    public final String d() {
        return this.a;
    }

    @Override // defpackage.dxid
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxid) {
            dxid dxidVar = (dxid) obj;
            String str4 = this.c;
            if (str4 != null ? str4.equals(dxidVar.e()) : dxidVar.e() == null) {
                if (this.b == dxidVar.g() && this.h == dxidVar.i() && this.i == dxidVar.h() && ((num = this.d) != null ? num.equals(dxidVar.a()) : dxidVar.a() == null) && ((str = this.e) != null ? str.equals(dxidVar.c()) : dxidVar.c() == null)) {
                    if (Arrays.equals(this.f, dxidVar instanceof dxib ? ((dxib) dxidVar).f : dxidVar.f()) && ((str2 = this.g) != null ? str2.equals(dxidVar.b()) : dxidVar.b() == null) && ((str3 = this.a) != null ? str3.equals(dxidVar.d()) : dxidVar.d() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dxid
    public final byte[] f() {
        return this.f;
    }

    @Override // defpackage.dxid
    public final int g() {
        return this.b;
    }

    @Override // defpackage.dxid
    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.b;
        int i2 = this.h;
        int i3 = this.i;
        Integer num = this.d;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int i4 = ((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3;
        String str2 = this.e;
        int iHashCode3 = ((((((i4 * 1000003) ^ iHashCode2) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ Arrays.hashCode(this.f)) * 1000003;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.a;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // defpackage.dxid
    public final int i() {
        return this.h;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "SEND_ERROR" : "SEND_EVENT" : "DELETED" : "MESSAGE" : "MESSAGE_TYPE_UNSPECIFIED";
        String str2 = this.c;
        int i2 = this.h;
        int i3 = this.i;
        Integer num = this.d;
        String str3 = this.e;
        byte[] bArr = this.f;
        String str4 = this.g;
        String str5 = this.a;
        return "FcmMessage{messageId=" + str2 + ", messageType=" + str + ", priorityOriginal=" + dxic.a(i2) + ", priorityDelivered=" + dxic.a(i3) + ", ttl=" + num + ", chimePayload=" + str3 + ", rawData=" + Arrays.toString(bArr) + ", chimeMessageIndicator=" + str4 + ", keyInvalidation=" + str5 + "}";
    }
}
