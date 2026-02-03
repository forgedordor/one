package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ailh {
    private final fcsu a;
    private volatile String b;
    private final Object c = new Object();

    public ailh(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        synchronized (this.c) {
            if (this.b != null) {
                return this.b;
            }
            fcsu fcsuVar = this.a;
            String strF = ((crqv) fcsuVar.b()).f("usage_stats_hash_salt", "");
            if (TextUtils.isEmpty(strF)) {
                this.b = UUID.randomUUID().toString();
                ((crqv) fcsuVar.b()).l("usage_stats_hash_salt", this.b);
            } else {
                this.b = strF;
            }
            return this.b;
        }
    }
}
