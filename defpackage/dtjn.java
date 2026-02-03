package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjn {
    public static final Comparator a = new Comparator() { // from class: dtjm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            bArr.getClass();
            bArr2.getClass();
            int length = bArr.length;
            int length2 = bArr2.length;
            if (length != length2) {
                return length - length2;
            }
            for (int i = 0; i < length; i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.dtjo a(android.content.ContentResolver r17, java.lang.String r18, java.lang.String r19, android.os.CancellationSignal r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtjn.a(android.content.ContentResolver, java.lang.String, java.lang.String, android.os.CancellationSignal):dtjo");
    }
}
