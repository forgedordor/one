package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppz extends pqc {
    public ppz() {
        super("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    }

    @Override // defpackage.pqc
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
