package defpackage;

import android.util.CloseGuard;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnr implements bns {
    private final CloseGuard a = new CloseGuard();

    @Override // defpackage.bns
    public final void a() {
        this.a.close();
    }

    @Override // defpackage.bns
    public final void b(String str) {
        this.a.open(str);
    }

    @Override // defpackage.bns
    public final void c() {
        this.a.warnIfOpen();
    }
}
