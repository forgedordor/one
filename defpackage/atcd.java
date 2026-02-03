package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atcd {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final eosc b;
    public final String c;
    public final atdd d;
    public final atcb e;
    public final atcb f;
    public final atcb g;
    public final atcb h;
    public atcb i;
    public final atdz j;
    public final atea k;

    public atcd(eosc eoscVar, String str, atdz atdzVar, atdd atddVar, atea ateaVar) {
        atcc atccVar = new atcc();
        this.e = atccVar;
        this.f = new atca(this);
        this.g = new atbx(this);
        this.h = new atbw(this);
        this.b = eoscVar;
        this.c = str;
        this.j = atdzVar;
        this.d = atddVar;
        this.i = atccVar;
        this.k = ateaVar;
    }

    public final synchronized void a(atcb atcbVar, atbv atbvVar) {
        if (this.i == this.h) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(coie.a, this.c);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", "transition", 88, "InProgressFileTransfer.java")).q("InProgressFileTransfer already finished.");
            return;
        }
        eksl ekslVar2 = (eksl) a.h();
        ekslVar2.X(coie.a, this.c);
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", "transition", 94, "InProgressFileTransfer.java")).D("Transitioning from %s to %s.", this.i.a(), atcbVar.a());
        this.i.c();
        this.i = atcbVar;
        atcbVar.b(atbvVar);
    }
}
