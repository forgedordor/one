package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebjg extends Thread {
    final /* synthetic */ ebix a;
    final /* synthetic */ ebji b;

    public ebjg(ebji ebjiVar, ebix ebixVar) {
        this.a = ebixVar;
        this.b = ebjiVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.a.b();
        } catch (Exception e) {
            dhja.j(e, this.b.f, "Can't create the MSRP server session", new Object[0]);
        }
    }
}
