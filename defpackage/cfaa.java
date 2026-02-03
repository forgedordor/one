package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfaa implements cfrj {
    private static final long a = TimeUnit.MINUTES.toMicros(5);
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/handler/CmsInboxSendRpcHandler");
    private final Optional c;
    private final epmp d;
    private final ezol e;
    private final evqs f;
    private long h;
    private String g = "";
    private final cfrd i = new cfrd("CMS");

    public cfaa(Optional optional, epmp epmpVar, ezol ezolVar, evqs evqsVar) {
        this.c = optional;
        this.d = epmpVar;
        this.e = ezolVar;
        this.f = evqsVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.h;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.i;
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture c(ezpp ezppVar) {
        ezppVar.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        String str = ezppVar.c;
        str.getClass();
        this.g = str;
        ezpo ezpoVar = (ezpo) ezpp.a.createBuilder(ezppVar);
        ezpoVar.copyOnWrite();
        ((ezpp) ezpoVar.instance).e = this.i.a;
        evsn evsnVarBuild = ezpoVar.build();
        evsnVarBuild.getClass();
        ezjk ezjkVar = (ezjk) ezjl.a.createBuilder();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar = (ezjl) ezjkVar.instance;
        ezjlVar.f = (ezpp) evsnVarBuild;
        ezjlVar.b |= 4;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar2 = (ezjl) ezjkVar.instance;
        ezjlVar2.c = this.e;
        ezjlVar2.b |= 1;
        long j = a;
        ezjkVar.copyOnWrite();
        ((ezjl) ezjkVar.instance).g = j;
        ezjg ezjgVar = (ezjg) ezjj.a.createBuilder();
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).c = string;
        ezjh ezjhVar = ezjh.STATUS;
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).k = ezjhVar.a();
        ezji ezjiVar = ezji.CMS_RPC_MESSAGE;
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).d = ezjiVar.a();
        evqs byteString = this.d.toByteString();
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).e = byteString;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar3 = (ezjl) ezjkVar.instance;
        ezjj ezjjVar = (ezjj) ezjgVar.build();
        ezjjVar.getClass();
        ezjlVar3.e = ezjjVar;
        ezjlVar3.b |= 2;
        ezjkVar.a(this.f);
        eiju eijuVarE = eijx.e(ezjkVar.build());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezjl ezjlVar = (ezjl) evuhVar;
        cezvVar.getClass();
        ezjlVar.getClass();
        ezpp ezppVar = ezjlVar.f;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        String str = ezppVar.c;
        str.getClass();
        this.g = str;
        Optional optional = this.c;
        if (!optional.isPresent()) {
            throw new IllegalArgumentException("cmsGaiaMessagingGrpcProxy is not present");
        }
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleAlphaverse");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/CmsInboxSendRpcHandler", "executeRpc", 78, "CmsInboxSendRpcHandler.kt")).q("Getting messaging grpc for cms");
        eiju eijuVarE = ((cepf) optional.get()).e(ezjlVar);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        ezjn ezjnVar = (ezjn) evuhVar;
        ezjnVar.getClass();
        ezpr ezprVar = ezjnVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.h = ezprVar.b;
        eiju eijuVarE = eijx.e(ezjnVar);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "CmsInboxSendRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.g;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
