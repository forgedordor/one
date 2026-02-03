package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqa {
    private final cogw g;
    private final cmqj h;
    private final fcsu i;
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage");
    private static final cmpz e = new cmpz(1, 109);
    private static final Pattern f = Pattern.compile("([1-9]+\\d*)(w|m|y)");
    public static final long a = TimeUnit.DAYS.toMillis(7);
    public static final long b = TimeUnit.DAYS.toMillis(30);
    public static final long c = TimeUnit.DAYS.toMillis(365);

    public cmqa(cogw cogwVar, cmqj cmqjVar, fcsu fcsuVar) {
        this.g = cogwVar;
        this.h = cmqjVar;
        this.i = fcsuVar;
    }

    public final cmpz a() {
        Matcher matcher = f.matcher("1m");
        try {
            if (matcher.matches()) {
                return new cmpz(Integer.parseInt(matcher.group(1)), matcher.group(2).charAt(0));
            }
        } catch (NumberFormatException unused) {
        }
        ekrw ekrwVarI = d.i();
        ekrwVarI.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage", "parseMessageRetainingDuration", 88, "SmsReleaseStorage.java")).t("SmsAutoDelete: invalid duration %s", "1m");
        return e;
    }

    public final String b(Context context, cmpz cmpzVar) {
        Resources resources = context.getResources();
        int i = cmpzVar.b;
        if (i == 109) {
            int i2 = cmpzVar.a;
            return resources.getQuantityString(R.plurals.month_count, i2, Integer.valueOf(i2));
        }
        if (i == 119) {
            int i3 = cmpzVar.a;
            return resources.getQuantityString(R.plurals.week_count, i3, Integer.valueOf(i3));
        }
        if (i != 121) {
            throw new IllegalArgumentException(a.g(i, "SmsAutoDelete: invalid duration unit "));
        }
        int i4 = cmpzVar.a;
        return resources.getQuantityString(R.plurals.year_count, i4, Integer.valueOf(i4));
    }

    public final void c(int i, long j) {
        if (i == 0) {
            ekrw ekrwVarE = d.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage", "deleteMessages", 139, "SmsReleaseStorage.java")).q("SmsStorageStatusManager: delete media messages");
            this.h.ad();
            return;
        }
        long epochMilli = this.g.f().toEpochMilli() - j;
        ekrw ekrwVarE2 = d.e();
        ekrwVarE2.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage", "deleteMessages", 149, "SmsReleaseStorage.java")).q("SmsStorageStatusManager:delete old messages");
        if (this.h.b(epochMilli) > 0) {
            ((cmqf) this.i.b()).l(enqq.SMS_RELEASE_STORAGE);
        }
    }
}
