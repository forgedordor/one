package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcep implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ fcfd b;

    public fcep(fcfd fcfdVar, List list) {
        this.a = list;
        this.b = fcfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fchm fchmVar;
        fcfd fcfdVar = this.b;
        fcex fcexVar = fcfdVar.h;
        SocketAddress socketAddressB = fcexVar.b();
        List list = this.a;
        fcexVar.a = list;
        fcexVar.c();
        fcfdVar.i = list;
        fbnv fbnvVar = fcfdVar.r.a;
        fbnv fbnvVar2 = fbnv.READY;
        if (fbnvVar == fbnvVar2 || fcfdVar.r.a == fbnv.CONNECTING) {
            int i = 0;
            while (true) {
                if (i < fcexVar.a.size()) {
                    int iIndexOf = ((fbop) fcexVar.a.get(i)).b.indexOf(socketAddressB);
                    if (iIndexOf != -1) {
                        fcexVar.b = i;
                        fcexVar.c = iIndexOf;
                        break;
                    }
                    i++;
                } else if (fcfdVar.r.a == fbnvVar2) {
                    fchmVar = fcfdVar.q;
                    fcfdVar.q = null;
                    fcexVar.c();
                    fcfdVar.b(fbnv.IDLE);
                } else {
                    fcfdVar.p.n(Status.p.withDescription("InternalSubchannel closed pending transport due to address change"));
                    fcfdVar.p = null;
                    fcexVar.c();
                    fcfdVar.h();
                }
            }
            fchmVar = null;
        } else {
            fchmVar = null;
        }
        if (fchmVar != null) {
            if (fcfdVar.l != null) {
                fcfdVar.m.n(Status.p.withDescription("InternalSubchannel closed transport early due to address change"));
                fcfdVar.l.a();
                fcfdVar.l = null;
            }
            fcfdVar.m = fchmVar;
            fcfdVar.l = fcfdVar.g.a(new fceo(this), 5L, TimeUnit.SECONDS, fcfdVar.b);
        }
    }
}
