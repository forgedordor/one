package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmb {
    private final fcsu a;

    public czmb(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final czma a(Context context) {
        return new czma(new Intent(context, (Class<?>) this.a.b()));
    }
}
