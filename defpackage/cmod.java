package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmod {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/DatabaseMessages");

    public static String a(byte[] bArr, int i) {
        if (i != 0) {
            try {
                try {
                    return new String(bArr, ld.a(i));
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (UnsupportedEncodingException unused2) {
                return new String(bArr, "iso-8859-1");
            }
        }
        return new String(bArr);
    }

    public static byte[] b(String str, int i) {
        if (i == 0) {
            return str.getBytes();
        }
        try {
            return str.getBytes(ld.a(i));
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
