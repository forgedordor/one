package defpackage;

import android.content.res.Resources;
import android.util.SparseIntArray;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/common/SmsErrorCodeDescription");
    private final String b;
    private final SparseIntArray c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cmtw(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmtw.<init>(java.lang.String):void");
    }

    private final void b(int i, int i2, int i3) {
        while (i2 <= i3) {
            this.c.put(i2, i);
            i2++;
        }
    }

    private final void c(int i, int... iArr) {
        for (int i2 : iArr) {
            this.c.put(i2, i);
        }
    }

    private final void d() {
        c(R.string.send_error_network_error, 331, 332);
        c(R.string.send_error_network_error_or_check_prepaid_balance, 500);
        c(R.string.send_error_contact_manufacturer, 2065);
        b(R.string.send_error_contact_manufacturer, 2160, 2175);
    }

    public final String a(int i, Resources resources) {
        SparseIntArray sparseIntArray = this.c;
        int size = sparseIntArray.size();
        int i2 = R.string.message_status_send_failed;
        if (size == 0) {
            return resources.getString(R.string.message_status_send_failed);
        }
        int i3 = sparseIntArray.get(i);
        if (i3 != 0) {
            i2 = i3;
        }
        return resources.getString(R.string.sms_error_template, resources.getString(i2), Integer.valueOf(i));
    }
}
