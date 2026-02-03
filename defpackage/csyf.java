package defpackage;

import android.content.Context;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csyf {
    private static final cqce a = cqce.g("Bugle", "VideoCalling");
    private final Context b;
    private final fcsu c;

    public csyf(Context context, fcsu fcsuVar) {
        this.b = context;
        this.c = fcsuVar;
    }

    final PhoneAccount a() {
        Context context = this.b;
        TelecomManager telecomManager = (TelecomManager) context.getSystemService(TelecomManager.class);
        if (telecomManager != null && ((crma) this.c.b()).k()) {
            if (craf.e && kxj.c(context, "android.permission.READ_PHONE_NUMBERS") != 0) {
                a.r("getDefaultPhoneAccount returned null due to the API being 31+ and lacking the READ_PHONE_NUMBERS permission.");
                return null;
            }
            PhoneAccountHandle defaultOutgoingPhoneAccount = telecomManager.getDefaultOutgoingPhoneAccount("tel");
            if (defaultOutgoingPhoneAccount != null) {
                return telecomManager.getPhoneAccount(defaultOutgoingPhoneAccount);
            }
        }
        return null;
    }
}
