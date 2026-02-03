package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akfe {
    public final cqtq a;
    private final Context b;

    public akfe(Context context, cqtp cqtpVar) {
        context.getClass();
        cqtpVar.getClass();
        this.b = context;
        this.a = cqtpVar.a(new akfd());
    }

    public final boolean a() {
        return kxj.c(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }
}
