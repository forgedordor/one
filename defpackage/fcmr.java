package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcmr {
    private static final Logger a = Logger.getLogger(fcmr.class.getName());
    private static final byte[] b = "-bin".getBytes(StandardCharsets.US_ASCII);

    private fcmr() {
    }

    public static byte[][] a(fbrg fbrgVar) {
        int length;
        int i;
        Charset charset = fbpp.a;
        byte[][] bArrM = fbrgVar.m();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArrM.length;
            if (i2 >= length) {
                break;
            }
            byte[] bArr = bArrM[i2];
            byte[] bArr2 = bArrM[i2 + 1];
            if (c(bArr, b)) {
                i = i3 + 2;
                bArrM[i3] = bArr;
                bArrM[i3 + 1] = fbpp.b.j(bArr2).getBytes(StandardCharsets.US_ASCII);
            } else {
                for (byte b2 : bArr2) {
                    if (b2 < 32 || b2 > 126) {
                        a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + new String(bArr, StandardCharsets.US_ASCII) + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
                        break;
                    }
                }
                i = i3 + 2;
                bArrM[i3] = bArr;
                bArrM[i3 + 1] = bArr2;
            }
            i3 = i;
            i2 += 2;
        }
        return i3 == length ? bArrM : (byte[][]) Arrays.copyOfRange(bArrM, 0, i3);
    }

    public static byte[][] b(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            byte[] bArr4 = b;
            if (c(bArr2, bArr4)) {
                for (byte b2 : bArr3) {
                    if (b2 == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr5 = bArr[i];
                            byte[] bArr6 = bArr[i + 1];
                            if (c(bArr5, bArr4)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i4 <= length) {
                                        if (i4 == length || bArr6[i4] == 44) {
                                            byte[] bArrK = eldz.e.k(new String(bArr6, i5, i4 - i5, StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(bArrK);
                                            i5 = i4 + 1;
                                        }
                                        i4++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = eldz.e.k(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
