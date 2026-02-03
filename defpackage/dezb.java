package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezb {
    private final Context a;
    private LocalDate b;
    private double c;

    public dezb(Context context) {
        this.a = context;
    }

    public final double a() throws NoSuchAlgorithmException, NumberFormatException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            long jB = devd.b(this.a.getContentResolver(), "android_id", 0L);
            LocalDate localDate = Instant.ofEpochMilli(dhkl.a().longValue()).atZone(ZoneId.systemDefault()).toLocalDate();
            if (localDate.equals(this.b)) {
                return this.c;
            }
            messageDigest.update(eonh.d(jB));
            messageDigest.update(localDate.toString().getBytes());
            double dNextDouble = new Random(eonh.b(messageDigest.digest())).nextDouble() * 100.0d;
            this.b = localDate;
            this.c = dNextDouble;
            return dNextDouble;
        } catch (NoSuchAlgorithmException unused) {
            return 0.0d;
        }
    }
}
