package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eldf extends elci {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public eldf(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void n() {
        ejwl.m(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.elci
    public final void a(byte b) {
        n();
        this.a.update(b);
    }

    @Override // defpackage.elci
    public final void b(ByteBuffer byteBuffer) {
        n();
        this.a.update(byteBuffer);
    }

    @Override // defpackage.elci
    protected final void e(byte[] bArr, int i) {
        n();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.elcv
    public final elct r() {
        n();
        this.c = true;
        int i = this.b;
        MessageDigest messageDigest = this.a;
        if (i == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = elct.b;
            return new elcq(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = elct.b;
        return new elcq(bArrCopyOf);
    }
}
