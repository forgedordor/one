package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwoo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public cwoo(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar3.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    public final Optional a(Intent intent) {
        intent.getClass();
        Uri data = intent.getData();
        if (data == null) {
            return Optional.empty();
        }
        String queryParameter = cwon.a(data).getQueryParameter("service_id");
        if (queryParameter != null) {
            return Optional.of(queryParameter);
        }
        Optional optionalB = ((cqti) this.b.b()).b(intent);
        if (optionalB.isEmpty() || ((Object[]) optionalB.get()).length != 1) {
            return Optional.empty();
        }
        String str = ((String[]) optionalB.get())[0];
        cqce cqceVar = cmvy.a;
        return alwh.i(str) ? Optional.of(((String[]) optionalB.get())[0]) : Optional.empty();
    }

    public final Optional b(Intent intent) {
        intent.getClass();
        Optional optionalA = a(intent);
        if (optionalA.isPresent()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 56, "RbmIdExtractor.kt")).t("Not a short code: bot id present: %s", optionalA.get());
            return Optional.empty();
        }
        Uri data = intent.getData();
        if (data == null) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 61, "RbmIdExtractor.kt")).q("Not a short code: no uri");
            return Optional.empty();
        }
        String scheme = cwon.a(data).getScheme();
        if (scheme == null) {
            scheme = "";
        }
        if (!scheme.equals("sms") && !scheme.equals("smsto")) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 66, "RbmIdExtractor.kt")).t("Not a short code: not SMS scheme: %s", cqcv.b(data.toString()));
            return Optional.empty();
        }
        if (intent.getBooleanExtra("rbm_sms_short_code_fallback", false)) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 71, "RbmIdExtractor.kt")).t("RBM already attempted: fallback to SMS: %s", cqcv.b(data.toString()));
            return Optional.empty();
        }
        Optional optionalB = ((cqti) this.b.b()).b(intent);
        if (optionalB.isEmpty()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 76, "RbmIdExtractor.kt")).q("Not a short code: no recipients");
            return Optional.empty();
        }
        if (!((arvn) this.c.b()).a()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 80, "RbmIdExtractor.kt")).t("Short code disabled: %s", cqcv.b(data.toString()));
            return Optional.empty();
        }
        String str = ((String[]) optionalB.get())[0];
        try {
            int i = Integer.parseInt(str);
            if (str.length() <= ((Number) this.d.b()).longValue() && i > 0) {
                return Optional.of(str);
            }
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 87, "RbmIdExtractor.kt")).t("Too long for short code: %s", cqcv.b(str));
            return Optional.empty();
        } catch (NumberFormatException unused) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 92, "RbmIdExtractor.kt")).t("Not a short code: %s", cqcv.b(str));
            return Optional.empty();
        }
    }
}
