package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duqr {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static String b(ecev ecevVar, Uri uri) throws IOException {
        String strA;
        try {
            InputStream inputStream = (InputStream) ecevVar.c(uri, new echh());
            try {
                MessageDigest messageDigestE = e();
                if (messageDigestE == null) {
                    strA = "";
                } else {
                    byte[] bArr = new byte[8192];
                    for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                        messageDigestE.update(bArr, 0, i);
                    }
                    strA = a(messageDigestE.digest());
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return strA;
            } finally {
            }
        } catch (IOException unused) {
            durt.h("%s: Failed to open file, uri = %s", "FileValidator", uri);
            return "";
        }
    }

    public static void c(ecev ecevVar, dtqs dtqsVar, Uri uri, String str) throws dtox {
        long jA;
        try {
            if (!ecevVar.h(uri)) {
                durt.i("%s: Downloaded file %s is not present at %s", "FileValidator", dutx.e(dtqsVar), uri);
                dtov dtovVarA = dtox.a();
                dtovVarA.a = dtow.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw dtovVarA.a();
            }
            int iA = dtqr.a(dtqsVar.f);
            if (iA != 0 && iA == 2) {
                return;
            }
            if (d(ecevVar, uri, str)) {
                return;
            }
            try {
                jA = ecevVar.a(uri);
            } catch (IOException unused) {
                jA = -1;
            }
            durt.i("%s: Downloaded file at uri = %s, checksum = %s, size = %s verification failed", "FileValidator", uri, str, Long.valueOf(jA));
            dtov dtovVarA2 = dtox.a();
            dtovVarA2.a = dtow.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            throw dtovVarA2.a();
        } catch (IOException e) {
            durt.k(e, "%s: Failed to validate download file %s", "FileValidator", dutx.e(dtqsVar));
            dtov dtovVarA3 = dtox.a();
            dtovVarA3.a = dtow.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            dtovVarA3.c = e;
            throw dtovVarA3.a();
        }
    }

    public static boolean d(ecev ecevVar, Uri uri, String str) {
        return b(ecevVar, uri).equals(str);
    }

    public static MessageDigest e() throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest != null) {
                return messageDigest;
            }
            return null;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
