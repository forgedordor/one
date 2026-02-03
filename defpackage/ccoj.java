package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccoj {
    public static final String a(byte[] bArr) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return fcur.U(bArrCopyOf, new fdap() { // from class: ccoi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
                str.getClass();
                return str;
            }
        });
    }
}
