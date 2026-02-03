package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bajg {
    public final Integer a;
    public final String b;
    public final String c;

    public bajg(Integer num, String str, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }

    public bajg(Bundle bundle) {
        if (bundle == null) {
            this.c = null;
            this.b = null;
            this.a = null;
        } else {
            this.c = bundle.getString("other_participant_msisdn");
            this.b = bundle.getString("conversation_name");
            Object obj = bundle.get("theme_color");
            this.a = obj instanceof Integer ? (Integer) obj : null;
        }
    }
}
