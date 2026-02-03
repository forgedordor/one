package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfv implements dwgk {
    private final Context a;
    private final dwje b;
    private final dvjj c;

    public dwfv(Context context, dwje dwjeVar, dvjj dvjjVar) {
        this.a = context;
        this.b = dwjeVar;
        this.c = dvjjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        eyne eyneVar = (eyne) eynf.a.createBuilder();
        eyneVar.copyOnWrite();
        eynf eynfVar = (eynf) eyneVar.instance;
        ezppVar.getClass();
        eynfVar.c = ezppVar;
        eynfVar.b |= 1;
        evqs evqsVarD = this.b.d();
        eyneVar.copyOnWrite();
        ((eynf) eyneVar.instance).d = evqsVarD;
        List listA = this.c.a();
        eyneVar.copyOnWrite();
        eynf eynfVar2 = (eynf) eyneVar.instance;
        evsx evsxVar = eynfVar2.e;
        if (!evsxVar.c()) {
            eynfVar2.e = evsn.mutableCopy(evsxVar);
        }
        ekqh it = ((ekgb) listA).iterator();
        while (it.hasNext()) {
            eynfVar2.e.h(((Integer) it.next()).intValue());
        }
        String strA = dvhu.a(this.a);
        eyneVar.copyOnWrite();
        eynf eynfVar3 = (eynf) eyneVar.instance;
        strA.getClass();
        eynfVar3.f = strA;
        return eork.i((eynf) eyneVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final eynf eynfVar = (eynf) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                eync eyncVar = (eync) obj2;
                fbnd fbndVar = eyncVar.a;
                fbrk fbrkVarA = eynd.a;
                if (fbrkVarA == null) {
                    synchronized (eynd.class) {
                        fbrkVarA = eynd.a;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.LighterCapabilities", "RegisterCapabilities");
                            fbrhVarA.b();
                            eynf eynfVar2 = eynf.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eynfVar2);
                            fbrhVarA.b = new fcrh(eynh.a);
                            fbrkVarA = fbrhVarA.a();
                            eynd.a = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, eyncVar.b), eynfVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        return null;
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.b;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(20);
        dwhpVarR.f(i);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
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
        dwhpVarR.j(20);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
