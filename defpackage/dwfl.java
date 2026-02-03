package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfl implements dwgk {
    private final dwje a;
    private final eypt b;

    public dwfl(dwje dwjeVar, dwpk dwpkVar) {
        this.a = dwjeVar;
        this.b = dweg.b(dwpkVar);
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        eyvm eyvmVar = (eyvm) eyvn.a.createBuilder();
        eyvmVar.copyOnWrite();
        eyvn eyvnVar = (eyvn) eyvmVar.instance;
        ezppVar.getClass();
        eyvnVar.c = ezppVar;
        eyvnVar.b |= 1;
        eyvmVar.copyOnWrite();
        eyvn eyvnVar2 = (eyvn) eyvmVar.instance;
        eypt eyptVar = this.b;
        eyptVar.getClass();
        eyvnVar2.d = eyptVar;
        eyvnVar2.b |= 2;
        return eork.i((eyvn) eyvmVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final eyvn eyvnVar = (eyvn) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                eyvk eyvkVar = (eyvk) obj2;
                fbnd fbndVar = eyvkVar.a;
                fbrk fbrkVarA = eyvl.a;
                if (fbrkVarA == null) {
                    synchronized (eyvl.class) {
                        fbrkVarA = eyvl.a;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.LighterUserPropertiesService", "GetUserProperties");
                            fbrhVarA.b();
                            eyvn eyvnVar2 = eyvn.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eyvnVar2);
                            fbrhVarA.b = new fcrh(eyvp.a);
                            fbrkVarA = fbrhVarA.a();
                            eyvl.a = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, eyvkVar.b), eyvnVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        eyvi eyviVar = ((eyvp) obj).b;
        if (eyviVar == null) {
            eyviVar = eyvi.a;
        }
        return new dvqd(dweh.a(eyviVar));
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(47);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR.f(i);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(47);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
