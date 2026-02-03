package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgf implements dwgk {
    private final dwje a;
    private final eypt b;
    private final eyvi c;
    private final List d;

    /* JADX WARN: Multi-variable type inference failed */
    public dwgf(dwje dwjeVar, dwpk dwpkVar, dwsm dwsmVar, List list) {
        this.a = dwjeVar;
        this.b = dweg.b(dwpkVar);
        eyvh eyvhVar = (eyvh) eyvi.a.createBuilder();
        dwot dwotVar = (dwot) dwsmVar;
        if (dwotVar.a.g()) {
            boolean zBooleanValue = ((Boolean) dwotVar.a.c()).booleanValue();
            eyvhVar.copyOnWrite();
            ((eyvi) eyvhVar.instance).b = zBooleanValue;
        }
        if (dwotVar.b.g()) {
            int i = true != ((Boolean) dwotVar.b.c()).booleanValue() ? 4 : 3;
            eyvhVar.copyOnWrite();
            ((eyvi) eyvhVar.instance).c = i - 2;
        }
        this.c = (eyvi) eyvhVar.build();
        this.d = new ArrayList();
        ekqh it = ((ekgb) list).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            this.d.add(iIntValue == 1 ? eyrm.READ_RECEIPT_OPT_IN : iIntValue == 2 ? eyrm.REVIEW_PRIVATE_REPLY_OPT_IN : eyrm.UNKNOWN);
        }
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        eyvq eyvqVar = (eyvq) eyvr.a.createBuilder();
        eyvqVar.copyOnWrite();
        eyvr eyvrVar = (eyvr) eyvqVar.instance;
        ezppVar.getClass();
        eyvrVar.c = ezppVar;
        eyvrVar.b |= 1;
        eyvqVar.copyOnWrite();
        eyvr eyvrVar2 = (eyvr) eyvqVar.instance;
        eypt eyptVar = this.b;
        eyptVar.getClass();
        eyvrVar2.d = eyptVar;
        eyvrVar2.b |= 2;
        eyvqVar.copyOnWrite();
        eyvr eyvrVar3 = (eyvr) eyvqVar.instance;
        eyvi eyviVar = this.c;
        eyviVar.getClass();
        eyvrVar3.e = eyviVar;
        eyvrVar3.b |= 4;
        eyvqVar.copyOnWrite();
        eyvr eyvrVar4 = (eyvr) eyvqVar.instance;
        evsx evsxVar = eyvrVar4.f;
        if (!evsxVar.c()) {
            eyvrVar4.f = evsn.mutableCopy(evsxVar);
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            eyvrVar4.f.h(((eyrm) it.next()).a());
        }
        return eork.i((eyvr) eyvqVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final eyvr eyvrVar = (eyvr) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwge
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                eyvk eyvkVar = (eyvk) obj2;
                fbnd fbndVar = eyvkVar.a;
                fbrk fbrkVarA = eyvl.b;
                if (fbrkVarA == null) {
                    synchronized (eyvl.class) {
                        fbrkVarA = eyvl.b;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.LighterUserPropertiesService", "SetUserProperties");
                            fbrhVarA.b();
                            eyvr eyvrVar2 = eyvr.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eyvrVar2);
                            fbrhVarA.b = new fcrh(eyvt.a);
                            fbrkVarA = fbrhVarA.a();
                            eyvl.b = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, eyvkVar.b), eyvrVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        eyvi eyviVar = ((eyvt) obj).b;
        if (eyviVar == null) {
            eyviVar = eyvi.a;
        }
        return new dvqn(dweh.a(eyviVar));
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(48);
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
        dwhpVarR.j(48);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
