package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqi {
    private final fcsu a;

    public cnqi(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final String a() {
        String string = ((Bundle) this.a.b()).getString("messages_archival");
        if (string == null || string.length() == 0) {
            return null;
        }
        return string;
    }

    public final boolean b() {
        return a() != null;
    }
}
