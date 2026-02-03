package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfj implements dwgk {
    private final Context a;
    private final dwje b;
    private final eypt c;
    private final ejwi d;
    private final ejwi e;
    private final evqs f;

    public dwfj(Context context, dwje dwjeVar, dwpk dwpkVar) {
        this.a = context;
        this.b = dwjeVar;
        this.c = dweg.b(dwpkVar);
        this.d = ejwi.j(dwpkVar);
        this.e = ejud.a;
        this.f = evqs.b;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        ewvy ewvyVar = (ewvy) ewvz.a.createBuilder();
        ewvyVar.copyOnWrite();
        ewvz ewvzVar = (ewvz) ewvyVar.instance;
        ezppVar.getClass();
        ewvzVar.c = ezppVar;
        ewvzVar.b |= 1;
        ewvyVar.copyOnWrite();
        ewvz ewvzVar2 = (ewvz) ewvyVar.instance;
        eypt eyptVar = this.c;
        eyptVar.getClass();
        ewvzVar2.d = eyptVar;
        ewvzVar2.b |= 2;
        eyqm eyqmVar = (eyqm) eyqn.a.createBuilder();
        String strA = dvhu.a(this.a);
        eyqmVar.copyOnWrite();
        eyqn eyqnVar = (eyqn) eyqmVar.instance;
        strA.getClass();
        eyqnVar.b = strA;
        eyqn eyqnVar2 = (eyqn) eyqmVar.build();
        ewvyVar.copyOnWrite();
        ewvz ewvzVar3 = (ewvz) ewvyVar.instance;
        eyqnVar2.getClass();
        ewvzVar3.e = eyqnVar2;
        ewvzVar3.b |= 4;
        ewvyVar.copyOnWrite();
        ewvz ewvzVar4 = (ewvz) ewvyVar.instance;
        evqs evqsVar = this.f;
        evqsVar.getClass();
        ewvzVar4.f = evqsVar;
        return eork.i((ewvz) ewvyVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ewvz ewvzVar = (ewvz) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                eyro eyroVar = (eyro) obj2;
                fbnd fbndVar = eyroVar.a;
                fbrk fbrkVarA = eyrp.b;
                if (fbrkVarA == null) {
                    synchronized (eyrp.class) {
                        fbrkVarA = eyrp.b;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.LighterFrontend", "GetLighterProfile");
                            fbrhVarA.b();
                            ewvz ewvzVar2 = ewvz.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(ewvzVar2);
                            fbrhVarA.b = new fcrh(ewwb.a);
                            fbrkVarA = fbrhVarA.a();
                            eyrp.b = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, eyroVar.b), ewvzVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* synthetic */ Object c(Object obj) {
        ewwb ewwbVar = (ewwb) obj;
        eypy eypyVar = ewwbVar.c;
        if (eypyVar == null) {
            eypyVar = eypy.a;
        }
        eypy eypyVar2 = eypyVar;
        Context context = this.a;
        dvyx dvyxVarA = dvyx.a(context);
        ezpr ezprVar = ewwbVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        dwaz dwazVarA = dwej.a(this.b, context, eypyVar2, dvyxVarA, ezprVar.c);
        dvqb dvqbVar = new dvqb();
        dvqbVar.b = 2;
        dvqbVar.a = ejwi.j(dwazVarA);
        return dvqbVar.a();
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        ejwi ejwiVar = this.d;
        if (ejwiVar.g()) {
            dwhp dwhpVarR = dwhq.r();
            dwhpVarR.g(10003);
            dwje dwjeVar = this.b;
            dwhpVarR.n(dwjeVar.c().f());
            dwhpVarR.o(dwjeVar.d().E());
            dwhpVarR.p(uuid.toString());
            dwhpVarR.c((dwpk) ejwiVar.c());
            dwhpVarR.j(9);
            dwhpVarR.m(Integer.valueOf(status.getCode().value()));
            dwhpVarR.f(i);
            dwhpVarR.e(j);
            dvyxVar.b(dwhpVarR.a());
            return;
        }
        dwhp dwhpVarR2 = dwhq.r();
        dwhpVarR2.g(10003);
        dwje dwjeVar2 = this.b;
        dwhpVarR2.n(dwjeVar2.c().f());
        dwhpVarR2.o(dwjeVar2.d().E());
        dwhpVarR2.p(uuid.toString());
        dwhpVarR2.d((dwpx) this.e.c());
        dwhpVarR2.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR2.j(9);
        dwhpVarR2.f(i);
        dwhpVarR2.e(j);
        dvyxVar.b(dwhpVarR2.a());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dvyx dvyxVar, long j) {
        if (this.d.g()) {
            dwhp dwhpVarR = dwhq.r();
            dwhpVarR.g(10003);
            dwje dwjeVar = this.b;
            dwhpVarR.n(dwjeVar.c().f());
            dwhpVarR.o(dwjeVar.d().E());
            dwhpVarR.p(uuid.toString());
            dwhpVarR.j(9);
            dwhpVarR.f(1);
            dwhpVarR.e(j);
            dvyxVar.b(dwhpVarR.a());
            return;
        }
        dwhp dwhpVarR2 = dwhq.r();
        dwhpVarR2.g(10003);
        dwje dwjeVar2 = this.b;
        dwhpVarR2.n(dwjeVar2.c().f());
        dwhpVarR2.o(dwjeVar2.d().E());
        dwhpVarR2.p(uuid.toString());
        dwhpVarR2.d((dwpx) this.e.c());
        dwhpVarR2.j(9);
        dwhpVarR2.f(1);
        dwhpVarR2.e(j);
        dvyxVar.b(dwhpVarR2.a());
    }

    public dwfj(Context context, dwje dwjeVar, dwpx dwpxVar, evqs evqsVar) {
        eypt eyptVarB;
        this.a = context;
        this.b = dwjeVar;
        if (dwpxVar.e() == dwpu.GROUP) {
            eyps eypsVar = (eyps) eypt.a.createBuilder();
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).b = eyrf.a(6);
            String strA = dwpxVar.d().a();
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).e = strA;
            String strB = dwpxVar.d().b();
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).c = strB;
            eyptVarB = (eypt) eypsVar.build();
        } else {
            eyptVarB = dweg.b(dwpxVar.c());
        }
        this.c = eyptVarB;
        this.e = ejwi.j(dwpxVar);
        this.d = ejud.a;
        this.f = evqsVar;
    }
}
