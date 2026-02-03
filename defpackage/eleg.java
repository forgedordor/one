package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eleg {
    public static final byte[] a(File file) {
        elee eleeVar = new elee();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            eleeVar.a(fileInputStream);
            long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
            int i = elec.a;
            ejwl.e(size >= 0, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new OutOfMemoryError(size + " bytes is too large to fit in a byte array");
            }
            int i2 = (int) size;
            byte[] bArrC = new byte[i2];
            int i3 = i2;
            while (true) {
                if (i3 > 0) {
                    int i4 = i2 - i3;
                    int i5 = fileInputStream.read(bArrC, i4, i3);
                    if (i5 == -1) {
                        bArrC = Arrays.copyOf(bArrC, i4);
                        break;
                    }
                    i3 -= i5;
                } else {
                    int i6 = fileInputStream.read();
                    if (i6 != -1) {
                        ArrayDeque arrayDeque = new ArrayDeque(22);
                        arrayDeque.add(bArrC);
                        arrayDeque.add(new byte[]{(byte) i6});
                        bArrC = elec.c(fileInputStream, arrayDeque, i2 + 1);
                    }
                }
            }
            return bArrC;
        } catch (Throwable th) {
            try {
                eleeVar.a = th;
                ejxy.d(th, IOException.class);
                ejxy.e(th);
                throw new RuntimeException(th);
            } finally {
                eleeVar.close();
            }
        }
    }
}
