package defpackage;

import com.google.android.setupcompat.ISetupCompatService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efry {
    final ISetupCompatService a;
    final int b;

    public efry(int i) {
        this(i, null);
    }

    public efry(int i, ISetupCompatService iSetupCompatService) {
        this.b = i;
        this.a = iSetupCompatService;
        if (i == 4) {
            efrt.c(iSetupCompatService, "CompatService cannot be null when state is connected");
        }
    }
}
