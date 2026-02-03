package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfh implements dwgk {
    public final dwje a;
    private final int b;
    private final String c;

    public dwfh(dwje dwjeVar, int i, String str) {
        this.a = dwjeVar;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        eymx eymxVar = (eymx) eymy.a.createBuilder();
        eymxVar.copyOnWrite();
        eymy eymyVar = (eymy) eymxVar.instance;
        ezppVar.getClass();
        eymyVar.c = ezppVar;
        eymyVar.b |= 1;
        eymxVar.copyOnWrite();
        ((eymy) eymxVar.instance).d = this.b;
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            eymxVar.copyOnWrite();
            eymy eymyVar2 = (eymy) eymxVar.instance;
            str.getClass();
            eymyVar2.e = str;
        }
        return eork.i((eymy) eymxVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final eymy eymyVar = (eymy) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                eymv eymvVar = (eymv) obj2;
                fbnd fbndVar = eymvVar.a;
                fbrk fbrkVarA = eymw.a;
                if (fbrkVarA == null) {
                    synchronized (eymw.class) {
                        fbrkVarA = eymw.a;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.LighterBlock", "GetBlockedConversations");
                            fbrhVarA.b();
                            eymy eymyVar2 = eymy.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eymyVar2);
                            fbrhVarA.b = new fcrh(eyna.a);
                            fbrkVarA = fbrhVarA.a();
                            eymw.a = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, eymvVar.b), eymyVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        eyna eynaVar = (eyna) obj;
        dvif dvifVar = new dvif();
        dvifVar.c(eynaVar.c);
        dvifVar.b(ekgb.n(ekjz.g(eynaVar.b, new ejvr() { // from class: dwff
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return dwee.a(this.a.a, (eyph) obj2);
            }
        })));
        return dvifVar.a();
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(8);
        dwhpVarR.f(i);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
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
        dwhpVarR.j(8);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
