package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfn implements dwgk {
    private final dwje a;
    private final int b;
    private final String c;
    private final Context d;
    private final Map e;
    private final dwhr f;

    public dwfn(dwje dwjeVar, int i, String str, Context context, Map map, dwhr dwhrVar) {
        this.a = dwjeVar;
        this.b = i;
        this.c = str;
        this.d = context;
        this.e = map;
        this.f = dwhrVar;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        eyok eyokVar = (eyok) eyol.a.createBuilder();
        eyokVar.copyOnWrite();
        eyol eyolVar = (eyol) eyokVar.instance;
        ezppVar.getClass();
        eyolVar.c = ezppVar;
        eyolVar.b |= 1;
        eyokVar.copyOnWrite();
        ((eyol) eyokVar.instance).d = 0L;
        eyokVar.copyOnWrite();
        ((eyol) eyokVar.instance).e = 0L;
        eyokVar.copyOnWrite();
        ((eyol) eyokVar.instance).f = this.b;
        eyokVar.copyOnWrite();
        ((eyol) eyokVar.instance).h = true;
        eyokVar.copyOnWrite();
        ((eyol) eyokVar.instance).g = this.c;
        return eork.i((eyol) eyokVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final eyol eyolVar = (eyol) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                eyoe eyoeVar = (eyoe) obj2;
                fbnd fbndVar = eyoeVar.a;
                fbrk fbrkVarA = eyof.a;
                if (fbrkVarA == null) {
                    synchronized (eyof.class) {
                        fbrkVarA = eyof.a;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "ListConversations");
                            fbrhVarA.b();
                            eyol eyolVar2 = eyol.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eyolVar2);
                            fbrhVarA.b = new fcrh(eyon.a);
                            fbrkVarA = fbrhVarA.a();
                            eyof.a = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, eyoeVar.b), eyolVar);
            }
        }, eoqg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    @Override // defpackage.dwgk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object c(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwfn.c(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(24);
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
        dwhpVarR.j(24);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
