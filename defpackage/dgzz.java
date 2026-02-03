package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgzz extends TimerTask {
    public final dgzn a;
    final /* synthetic */ dhaa b;
    private final String c;

    public dgzz(dhaa dhaaVar, dgzn dgznVar, String str) {
        this.b = dhaaVar;
        this.a = dgznVar;
        this.c = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        String str = this.c;
        dhja.c("Timer has expired: %s is now considered idle", str);
        dhab dhabVar = this.b.b;
        dhabVar.getClass();
        dgzn dgznVar = this.a;
        dhabVar.a(dgznVar, str, false);
        dhaa.a.remove(dhaa.c(dgznVar, str));
    }
}
