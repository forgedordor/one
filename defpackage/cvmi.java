package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvmi implements Runnable {
    final /* synthetic */ cvmj a;

    public cvmi(cvmj cvmjVar) {
        this.a = cvmjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((eigp) this.a.O.b()).c("ComposeMessageViewPeer stoppedTypingTimeoutTask", "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate$3", "run", 2411).close();
    }
}
