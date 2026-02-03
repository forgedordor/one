package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdi {
    public static boolean a(mdk mdkVar) {
        if (mdkVar.b == -1 || mdkVar.c == -1) {
            return false;
        }
        int i = mdkVar.d;
        return i == 2 || i == 4;
    }

    public static void b(ByteBuffer byteBuffer, mdk mdkVar, ByteBuffer byteBuffer2, mdk mdkVar2, mdp mdpVar, int i, boolean z) {
        int i2 = mdkVar.d;
        int i3 = mdkVar2.d;
        int i4 = mdpVar.a;
        float[] fArr = new float[i4];
        int i5 = mdpVar.b;
        float[] fArr2 = new float[i5];
        for (int i6 = 0; i6 < i; i6++) {
            boolean z2 = i3 == 2;
            if (z) {
                int iPosition = byteBuffer2.position();
                for (int i7 = 0; i7 < i5; i7++) {
                    fArr2[i7] = c(byteBuffer2, z2, z2);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i8 = 0; i8 < i4; i8++) {
                fArr[i8] = c(byteBuffer, i2 == 2, z2);
            }
            for (int i9 = 0; i9 < i5; i9++) {
                for (int i10 = 0; i10 < i4; i10++) {
                    fArr2[i9] = fArr2[i9] + (fArr[i10] * mdpVar.a(i10, i9));
                }
                if (z2) {
                    byteBuffer2.putShort((short) mgb.a(fArr2[i9], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(mgb.a(fArr2[i9], -1.0f, 1.0f));
                }
                fArr2[i9] = 0.0f;
            }
        }
    }

    private static float c(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            return mgb.a(f * (f >= 0.0f ? 32767 : 32768), -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        return s / (s >= 0 ? 32767 : 32768);
    }
}
