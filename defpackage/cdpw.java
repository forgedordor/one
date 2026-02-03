package defpackage;

import android.content.Intent;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpw {
    public static final cqce a = cqce.g("Lighter", "LighterUtils");

    public static eymb a(Intent intent) {
        String stringExtra = intent.getStringExtra("args");
        if (stringExtra == null) {
            return null;
        }
        try {
            return (eymb) evsn.parseFrom(eymb.a, Base64.decode(stringExtra, 10), evrr.a());
        } catch (evtj e) {
            a.s("InvalidProtocolBufferException in getChatIntentApiArgs.", e);
            return null;
        }
    }
}
