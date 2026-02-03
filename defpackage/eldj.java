package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldj extends elco {
    private long a = 0;
    private long b = 0;
    private int c = 0;

    private static long o(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long p(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long q(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.elco
    protected final elct b() {
        long j = this.a;
        long j2 = this.c;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.b;
        long j5 = j3 + j4;
        this.a = j5;
        long j6 = j4 + j5;
        this.b = j6;
        long jO = o(j5);
        this.a = jO;
        long jO2 = o(j6);
        long j7 = jO + jO2;
        this.a = j7;
        this.b = jO2 + j7;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array();
        int i = elct.b;
        return new elcq(bArrArray);
    }

    @Override // defpackage.elco
    protected final void e(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jP = p(j) ^ this.a;
        this.a = jP;
        long jRotateLeft = Long.rotateLeft(jP, 27);
        long j3 = this.b;
        this.a = ((jRotateLeft + j3) * 5) + 1390208809;
        long jQ = q(j2) ^ j3;
        this.b = jQ;
        this.b = ((Long.rotateLeft(jQ, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.elco
    protected final void n(ByteBuffer byteBuffer) {
        long jA;
        long jA2;
        long jA3;
        long jA4;
        long jA5;
        long jA6;
        long jA7;
        this.c += byteBuffer.remaining();
        long jA8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                jA = 0;
                jA7 = jA ^ eldi.a(byteBuffer.get(0));
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 2:
                jA2 = 0;
                jA = jA2 ^ (eldi.a(byteBuffer.get(1)) << 8);
                jA7 = jA ^ eldi.a(byteBuffer.get(0));
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 3:
                jA3 = 0;
                jA2 = jA3 ^ (eldi.a(byteBuffer.get(2)) << 16);
                jA = jA2 ^ (eldi.a(byteBuffer.get(1)) << 8);
                jA7 = jA ^ eldi.a(byteBuffer.get(0));
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 4:
                jA4 = 0;
                jA3 = jA4 ^ (eldi.a(byteBuffer.get(3)) << 24);
                jA2 = jA3 ^ (eldi.a(byteBuffer.get(2)) << 16);
                jA = jA2 ^ (eldi.a(byteBuffer.get(1)) << 8);
                jA7 = jA ^ eldi.a(byteBuffer.get(0));
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 5:
                jA5 = 0;
                jA4 = jA5 ^ (eldi.a(byteBuffer.get(4)) << 32);
                jA3 = jA4 ^ (eldi.a(byteBuffer.get(3)) << 24);
                jA2 = jA3 ^ (eldi.a(byteBuffer.get(2)) << 16);
                jA = jA2 ^ (eldi.a(byteBuffer.get(1)) << 8);
                jA7 = jA ^ eldi.a(byteBuffer.get(0));
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 6:
                jA6 = 0;
                jA5 = (eldi.a(byteBuffer.get(5)) << 40) ^ jA6;
                jA4 = jA5 ^ (eldi.a(byteBuffer.get(4)) << 32);
                jA3 = jA4 ^ (eldi.a(byteBuffer.get(3)) << 24);
                jA2 = jA3 ^ (eldi.a(byteBuffer.get(2)) << 16);
                jA = jA2 ^ (eldi.a(byteBuffer.get(1)) << 8);
                jA7 = jA ^ eldi.a(byteBuffer.get(0));
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 7:
                jA6 = eldi.a(byteBuffer.get(6)) << 48;
                jA5 = (eldi.a(byteBuffer.get(5)) << 40) ^ jA6;
                jA4 = jA5 ^ (eldi.a(byteBuffer.get(4)) << 32);
                jA3 = jA4 ^ (eldi.a(byteBuffer.get(3)) << 24);
                jA2 = jA3 ^ (eldi.a(byteBuffer.get(2)) << 16);
                jA = jA2 ^ (eldi.a(byteBuffer.get(1)) << 8);
                jA7 = jA ^ eldi.a(byteBuffer.get(0));
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 8:
                jA7 = byteBuffer.getLong();
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 9:
                jA8 ^= eldi.a(byteBuffer.get(8));
                jA7 = byteBuffer.getLong();
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 10:
                jA8 ^= eldi.a(byteBuffer.get(9)) << 8;
                jA8 ^= eldi.a(byteBuffer.get(8));
                jA7 = byteBuffer.getLong();
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 11:
                jA8 ^= eldi.a(byteBuffer.get(10)) << 16;
                jA8 ^= eldi.a(byteBuffer.get(9)) << 8;
                jA8 ^= eldi.a(byteBuffer.get(8));
                jA7 = byteBuffer.getLong();
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 12:
                jA8 ^= eldi.a(byteBuffer.get(11)) << 24;
                jA8 ^= eldi.a(byteBuffer.get(10)) << 16;
                jA8 ^= eldi.a(byteBuffer.get(9)) << 8;
                jA8 ^= eldi.a(byteBuffer.get(8));
                jA7 = byteBuffer.getLong();
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 13:
                jA8 ^= eldi.a(byteBuffer.get(12)) << 32;
                jA8 ^= eldi.a(byteBuffer.get(11)) << 24;
                jA8 ^= eldi.a(byteBuffer.get(10)) << 16;
                jA8 ^= eldi.a(byteBuffer.get(9)) << 8;
                jA8 ^= eldi.a(byteBuffer.get(8));
                jA7 = byteBuffer.getLong();
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 14:
                jA8 ^= eldi.a(byteBuffer.get(13)) << 40;
                jA8 ^= eldi.a(byteBuffer.get(12)) << 32;
                jA8 ^= eldi.a(byteBuffer.get(11)) << 24;
                jA8 ^= eldi.a(byteBuffer.get(10)) << 16;
                jA8 ^= eldi.a(byteBuffer.get(9)) << 8;
                jA8 ^= eldi.a(byteBuffer.get(8));
                jA7 = byteBuffer.getLong();
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            case 15:
                jA8 = eldi.a(byteBuffer.get(14)) << 48;
                jA8 ^= eldi.a(byteBuffer.get(13)) << 40;
                jA8 ^= eldi.a(byteBuffer.get(12)) << 32;
                jA8 ^= eldi.a(byteBuffer.get(11)) << 24;
                jA8 ^= eldi.a(byteBuffer.get(10)) << 16;
                jA8 ^= eldi.a(byteBuffer.get(9)) << 8;
                jA8 ^= eldi.a(byteBuffer.get(8));
                jA7 = byteBuffer.getLong();
                this.a = p(jA7) ^ this.a;
                this.b ^= q(jA8);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
