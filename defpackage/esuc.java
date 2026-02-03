package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esuc extends fbru {
    final /* synthetic */ esud a;
    private volatile boolean b;

    public esuc(esud esudVar) {
        this.a = esudVar;
    }

    @Override // defpackage.fbru
    public final String a() {
        return "";
    }

    @Override // defpackage.fbru
    public final void b() {
        this.b = true;
    }

    @Override // defpackage.fbru
    public final void c(fbrq fbrqVar) {
        if (this.b) {
            fbrqVar.b(Status.l.withDescription("Resolver is shutdown"));
            return;
        }
        fbsj fbsjVar = (fbsj) this.a.a.get();
        fbrr fbrrVar = new fbrr();
        fbrrVar.b(new fbte(null, ekgb.r(new fbop((SocketAddress) fbsjVar.a().get(0)))));
        fbrqVar.c(fbrrVar.a());
    }
}
