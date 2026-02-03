package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfi implements vdy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/actions/blockandreportspam/BlockAndReportSpamActionPlugin");
    public final Context b;
    public final fdpl c;
    public final Set d = fcwm.b(zqx.a);
    public final tlj e;
    public final int f;
    private final fdpl g;
    private final fdpl h;

    public vfi(Context context, fdpl fdplVar, fdpl fdplVar2, tlj tljVar, int i) {
        this.b = context;
        this.g = fdplVar;
        this.h = fdplVar2;
        this.e = tljVar;
        this.f = i;
        this.c = new fdua(fdplVar2, fdplVar, new vfh(this, null));
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.c;
    }
}
