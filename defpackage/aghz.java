package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghz {
    public final ains a;

    public aghz(ains ainsVar) {
        ainsVar.getClass();
        this.a = ainsVar;
    }

    public final void a(int i) {
        this.a.e("Bugle.Notification.Mute.LeaveGroupAction.Count", i);
    }

    public final void b(int i) {
        this.a.e("Bugle.Notification.Mute.Cancel.Count", i);
    }

    public final void c(int i) {
        this.a.e("Bugle.Notification.Mute.Open.Count", i);
    }

    public final void d(int i) {
        this.a.e("Bugle.Notification.Mute.Unmute.Count", i);
    }

    public final void e(int i, boolean z) {
        ains ainsVar = this.a;
        ainsVar.e("Bugle.Notification.Mute.Duration.Count", i);
        if (z) {
            ainsVar.c("Bugle.Notification.Mute.Exception.Count");
        }
    }
}
