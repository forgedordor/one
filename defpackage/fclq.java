package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclq extends fcbf {
    final /* synthetic */ fbnz a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ fbrg c;
    final /* synthetic */ fcma d;
    final /* synthetic */ fcll e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fclq(fbnz fbnzVar, SettableFuture settableFuture, fbrg fbrgVar, fcma fcmaVar, fcll fcllVar) {
        super(fbnzVar);
        this.a = fbnzVar;
        this.b = settableFuture;
        this.c = fbrgVar;
        this.d = fcmaVar;
        this.e = fcllVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        int i = fcsr.a;
        fcmb fcmbVar = fclv.c;
        SettableFuture settableFuture = this.b;
        if (settableFuture.isCancelled()) {
            return;
        }
        try {
            fclt fcltVar = (fclt) eork.q(settableFuture);
            fbrg fbrgVar = this.c;
            fbsn fbsnVar = fcltVar.b;
            fclf fclfVar = fcltVar.a;
            this.e.g(new fcle(fclfVar, fbsnVar.a(fclfVar, fbrgVar), fclfVar.b));
            this.a.d(new fclp(this.d), eoqg.a);
        } finally {
        }
    }
}
