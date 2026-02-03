package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqti {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/intent/IntentExtractor");
    public static final cqce b = cqce.g("Bugle", "IntentExtractor");
    private static final cczi f = cdag.j(cdag.b, "launch_conversation_recipient_string_max_length", 100);
    public final Context c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu g;

    public cqti(fcsu fcsuVar, Context context, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.g = fcsuVar;
        this.c = context;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    public static Optional a(Intent intent) {
        if (intent == null) {
            return Optional.empty();
        }
        String stringExtra = intent.getStringExtra("sms_body");
        Uri data = intent.getData();
        if (TextUtils.isEmpty(stringExtra) && data != null) {
            stringExtra = data.isHierarchical() ? data.getQueryParameter("body") : Uri.parse(data.toString().replaceFirst(":", "://")).getQueryParameter("body");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        }
        return TextUtils.isEmpty(stringExtra) ? Optional.empty() : Optional.ofNullable(stringExtra);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional b(android.content.Intent r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L7
            j$.util.Optional r7 = j$.util.Optional.empty()
            return r7
        L7:
            android.net.Uri r0 = r7.getData()
            ekrg r1 = defpackage.cqmz.a
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L13
        L11:
            r0 = r2
            goto L53
        L13:
            java.util.Set r3 = defpackage.cqmz.b
            java.lang.String r4 = r0.getScheme()
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L20
            goto L11
        L20:
            r3 = 63
            ejxk r3 = defpackage.ejxk.b(r3)
            java.lang.String r0 = r0.getSchemeSpecificPart()
            java.util.List r0 = r3.i(r0)
            java.lang.Object r3 = r0.get(r1)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L3b
            goto L11
        L3b:
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.cssr.b(r0)
            r3 = 59
            r4 = 44
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r3 = ","
            java.lang.String[] r0 = r0.split(r3)
        L53:
            if (r0 != 0) goto L78
            java.lang.String r3 = "address"
            java.lang.String r3 = r7.getStringExtra(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "[,;]"
            if (r4 != 0) goto L68
            java.lang.String[] r0 = r3.split(r5)
            goto L78
        L68:
            java.lang.String r3 = "android.intent.extra.EMAIL"
            java.lang.String r7 = r7.getStringExtra(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L78
            java.lang.String[] r0 = r7.split(r5)
        L78:
            if (r0 != 0) goto L7b
            goto Lbb
        L7b:
            int r7 = defpackage.ekgb.d
            ekfw r7 = new ekfw
            r7.<init>()
        L82:
            int r3 = r0.length
            if (r1 >= r3) goto L9f
            r3 = r0[r1]
            int r4 = r3.length()
            cczi r5 = defpackage.cqti.f
            java.lang.Object r5 = r5.e()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r4 >= r5) goto L9c
            r7.h(r3)
        L9c:
            int r1 = r1 + 1
            goto L82
        L9f:
            ekgb r7 = r7.g()
            r0 = r7
            ekoe r0 = (defpackage.ekoe) r0
            int r0 = r0.c
            if (r0 != 0) goto Lab
            goto Lbb
        Lab:
            j$.util.stream.Stream r7 = j$.util.Collection.EL.stream(r7)
            cqth r0 = new cqth
            r0.<init>()
            java.lang.Object[] r7 = r7.toArray(r0)
            r2 = r7
            java.lang.String[] r2 = (java.lang.String[]) r2
        Lbb:
            if (r2 == 0) goto Ld3
            int r7 = r2.length
        Lbe:
            int r7 = r7 + (-1)
            if (r7 < 0) goto Ld3
            fcsu r0 = r6.g
            java.lang.Object r0 = r0.b()
            cmvy r0 = (defpackage.cmvy) r0
            r1 = r2[r7]
            java.lang.String r0 = r0.e(r1)
            r2[r7] = r0
            goto Lbe
        Ld3:
            j$.util.Optional r7 = j$.util.Optional.ofNullable(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqti.b(android.content.Intent):j$.util.Optional");
    }

    public final OptionalInt c(Intent intent) {
        if (intent == null) {
            return OptionalInt.empty();
        }
        int intExtra = intent.getIntExtra("android.telephony.extra.SUBSCRIPTION_INDEX", -1);
        if (intExtra != -1) {
            return OptionalInt.of(intExtra);
        }
        int intExtra2 = intent.getIntExtra("subscription", -1);
        return intExtra2 != -1 ? OptionalInt.of(intExtra2) : OptionalInt.empty();
    }
}
