package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfc implements dwgk {
    private final long a;
    private final dwje b;

    public dwfc(long j, dwje dwjeVar) {
        this.a = j;
        this.b = dwjeVar;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        eyog eyogVar = (eyog) eyoh.a.createBuilder();
        eyogVar.copyOnWrite();
        eyoh eyohVar = (eyoh) eyogVar.instance;
        ezppVar.getClass();
        eyohVar.c = ezppVar;
        eyohVar.b |= 1;
        eyogVar.copyOnWrite();
        ((eyoh) eyogVar.instance).d = this.a;
        return eork.i((eyoh) eyogVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final eyoh eyohVar = (eyoh) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                eyoe eyoeVar = (eyoe) obj2;
                fbnd fbndVar = eyoeVar.a;
                fbrk fbrkVarA = eyof.b;
                if (fbrkVarA == null) {
                    synchronized (eyof.class) {
                        fbrkVarA = eyof.b;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "CheckBootstrapRequired");
                            fbrhVarA.b();
                            eyoh eyohVar2 = eyoh.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eyohVar2);
                            fbrhVarA.b = new fcrh(eyoj.a);
                            fbrkVarA = fbrhVarA.a();
                            eyof.b = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, eyoeVar.b), eyohVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        eyoj eyojVar = (eyoj) obj;
        long j = eyojVar.c;
        int i = eyojVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        if (i2 != 1) {
            return new dvqe(j, i2 - 2);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.b;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(25);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR.f(i);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.b;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(25);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
