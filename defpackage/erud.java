package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erud extends ervt {
    public final int a;
    public final int b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;
    private final byte[] g;

    public erud(ersi ersiVar) throws GeneralSecurityException {
        if (!eqza.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        this.g = ersiVar.b.d();
        ersn ersnVar = ersiVar.a.a;
        ersn ersnVar2 = ersn.a;
        String str = "HmacSha512";
        this.f = ersnVar.equals(ersnVar2) ? "HmacSha1" : ersiVar.a.a.equals(ersn.b) ? "HmacSha256" : ersiVar.a.a.equals(ersn.c) ? "HmacSha512" : "";
        this.a = ersiVar.a.c();
        if (ersiVar.a.b.equals(ersnVar2)) {
            str = "HmacSha1";
        } else if (ersiVar.a.b.equals(ersn.b)) {
            str = "HmacSha256";
        } else if (!ersiVar.a.b.equals(ersn.c)) {
            str = "";
        }
        this.c = str;
        int iD = ersiVar.a.d();
        this.b = iD;
        int iB = ersiVar.a.b();
        this.d = iB;
        this.e = iB - iD;
    }

    public static Cipher i() {
        return (Cipher) ervg.a.a("AES/CTR/NoPadding");
    }

    public static final byte[] n(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        erwj.c(byteBufferAllocate, j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }

    @Override // defpackage.ervt
    public final int c() {
        return e();
    }

    @Override // defpackage.ervt
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ervt
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.ervt
    public final int f() {
        return this.e;
    }

    @Override // defpackage.ervt
    public final /* synthetic */ erwf g() {
        return new erub(this);
    }

    @Override // defpackage.ervt
    public final /* synthetic */ erwg h(byte[] bArr) {
        return new eruc(this, bArr);
    }

    public final Mac j() {
        return (Mac) ervg.b.a(this.c);
    }

    public final SecretKeySpec k(byte[] bArr) {
        return new SecretKeySpec(bArr, this.a, 32, this.c);
    }

    public final SecretKeySpec l(byte[] bArr) {
        return new SecretKeySpec(bArr, 0, this.a, "AES");
    }

    public final byte[] m(byte[] bArr, byte[] bArr2) {
        return ervr.b(this.f, this.g, bArr, bArr2, this.a + 32);
    }
}
