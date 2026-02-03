package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffv implements cfrj {
    public final long a;
    private final crqv b;
    private final ezol c;
    private String d = "";
    private long e = 0;

    public cffv(cema cemaVar, crqv crqvVar, ezol ezolVar) {
        long jLongValue;
        this.b = crqvVar;
        this.c = ezolVar;
        synchronized (cemaVar.e) {
            jLongValue = ((Long) Map.EL.getOrDefault(cemaVar.f, ezolVar, -1L)).longValue();
        }
        this.a = jLongValue;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.e;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return cfrh.d;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        ezmc ezmcVar = (ezmc) ezmd.a.createBuilder();
        ezmcVar.copyOnWrite();
        ezmd ezmdVar = (ezmd) ezmcVar.instance;
        ezmdVar.c = this.c;
        ezmdVar.b |= 1;
        ezmcVar.copyOnWrite();
        ((ezmd) ezmcVar.instance).d = this.a;
        ezmd ezmdVar2 = (ezmd) ezmcVar.build();
        ezly ezlyVar = (ezly) ezlz.a.createBuilder();
        ezlyVar.copyOnWrite();
        ezlz ezlzVar = (ezlz) ezlyVar.instance;
        ezmdVar2.getClass();
        evtg evtgVar = ezlzVar.d;
        if (!evtgVar.c()) {
            ezlzVar.d = evsn.mutableCopy(evtgVar);
        }
        ezlzVar.d.add(ezmdVar2);
        ezlyVar.copyOnWrite();
        ezlz ezlzVar2 = (ezlz) ezlyVar.instance;
        ezppVar.getClass();
        ezlzVar2.c = ezppVar;
        ezlzVar2.b |= 1;
        ezlz ezlzVar3 = (ezlz) ezlyVar.build();
        this.d = ezppVar.c;
        return eork.i(ezlzVar3);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        cqca.l("BugleNetwork", "revoking messages by sender");
        return cezvVar.a().d((ezlz) evuhVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezmb ezmbVar = (ezmb) evuhVar;
        if (ezmbVar != null) {
            ezpr ezprVar = ezmbVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        ListenableFuture listenableFutureI = eork.i(ezmbVar);
        eork.r(listenableFutureI, new cqob(new Consumer() { // from class: cfft
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqca.l("BugleNetwork", "successfully revoked messages by sender.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cffu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqca.l("BugleNetwork", "failed to revoke messages by sender.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoqg.a);
        return listenableFutureI;
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "RevokeMessagesRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.d;
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
        this.b.k("ditto_messages_need_revoke_timestamp", this.a);
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
