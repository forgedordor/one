package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byed {
    private final fcsu c;
    private final fcsu d;
    private final aqhc e;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/tombstones/status/TombstoneStatusChecker");
    public static final ekhx a = ekhx.v(Integer.valueOf(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED), 229, 204, 221, 231, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), 225, 226, 218, 220, 230, 243, 244, 245);

    public byed(fcsu fcsuVar, fcsu fcsuVar2, aqhc aqhcVar) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = aqhcVar;
    }

    public static String a(Context context) {
        return context.getResources().getString(R.string.this_chat_is_no_longer_encrypted_v2);
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.this_chat_is_encrypted_v2);
    }

    public static boolean d(int i) {
        return i == 117 || i == 23;
    }

    public static boolean e(int i) {
        return i == 209 || i == 208;
    }

    public static boolean f(int i) {
        return i == 211 || i == 217 || i == 239 || i == 249 || i == 248 || i == 247 || i == 246 || i == 250 || i == 240 || i == 245;
    }

    public static boolean g(int i) {
        return i >= 200 && i <= 270;
    }

    private static boolean h(List list, fcsu fcsuVar) {
        return ((Boolean) ((cczi) crbf.aE.get()).e()).booleanValue() && ((Optional) ((eyig) fcsuVar).a).isPresent() && list.size() == 1 && ((bajs) list.get(0)).c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.util.List r19, int r20, boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, android.content.Context r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byed.c(java.util.List, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context):java.lang.String");
    }
}
