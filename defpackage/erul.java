package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erul extends ervt {
    public final int a;
    private final int b;
    private final int c;
    private final String d;
    private final byte[] e;

    public erul(ersp erspVar) throws GeneralSecurityException {
        String str;
        this.e = erspVar.b.d();
        if (erspVar.a.a.equals(ersw.a)) {
            str = "HmacSha1";
        } else if (erspVar.a.a.equals(ersw.b)) {
            str = "HmacSha256";
        } else {
            if (!erspVar.a.a.equals(ersw.c)) {
                throw new GeneralSecurityException("Unknown HKDF algorithm ".concat(String.valueOf(String.valueOf(erspVar.a.a))));
            }
            str = "HmacSha512";
        }
        this.d = str;
        this.a = erspVar.a.c();
        int iB = erspVar.a.b();
        this.b = iB;
        this.c = iB - 16;
    }

    public static Cipher i() {
        return (Cipher) ervg.a.a("AES/GCM/NoPadding");
    }

    public static GCMParameterSpec j(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        erwj.c(byteBufferAllocate, j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, byteBufferAllocate.array());
    }

    @Override // defpackage.ervt
    public final int c() {
        return e();
    }

    @Override // defpackage.ervt
    public final int d() {
        return this.b;
    }

    @Override // defpackage.ervt
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.ervt
    public final int f() {
        return this.c;
    }

    @Override // defpackage.ervt
    public final /* synthetic */ erwf g() {
        return new eruj(this);
    }

    @Override // defpackage.ervt
    public final /* synthetic */ erwg h(byte[] bArr) {
        return new eruk(this, bArr);
    }

    public final SecretKeySpec k(byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(ervr.b(this.d, this.e, bArr, bArr2, this.a), "AES");
    }
}
