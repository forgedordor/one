package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfxk extends cayl {
    public static final cqce a = cqce.g("BugleJobs", "DittoConversationRetryHandler");
    public final eygg b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final fcsu f;
    public final fcsu g;
    public final cfeh h;
    private final fcsu i;
    private final eygg j;
    private final fcsu k;
    private final eygg l;
    private final cexq m;
    private final eosc n;

    public cfxk(cfeh cfehVar, eygg eyggVar, fcsu fcsuVar, eygg eyggVar2, fcsu fcsuVar2, fcsu fcsuVar3, eygg eyggVar3, cexq cexqVar, fcsu fcsuVar4, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.h = cfehVar;
        this.b = eyggVar;
        this.i = fcsuVar;
        this.j = eyggVar2;
        this.k = fcsuVar2;
        this.c = fcsuVar3;
        this.l = eyggVar3;
        this.m = cexqVar;
        this.d = fcsuVar4;
        this.e = eoscVar;
        this.n = eoscVar2;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.c(5);
        caxzVarL.f(pza.a);
        caxzVarL.g(TimeUnit.SECONDS.toMillis(((Integer) bvfd.f.e()).intValue()));
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DittoConversationRetryHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cfyv.a.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cayl
    public final eiju j(final cayy cayyVar, final ekgb ekgbVar) {
        eiju eijuVarI;
        ekgb ekgbVar2 = ((caxm) cayyVar.a()).d;
        int size = ekgbVar2.size();
        for (int i = 0; i < size; i++) {
            if (((Integer) ekgbVar2.get(i)).intValue() == 0) {
                ((ains) this.d.b()).c("Bugle.Ditto.ConversationRetryHandler.Execution.Count");
            }
        }
        if (((bvit) this.j.b()).p()) {
            final ezol ezolVar = ((cfyv) ekgbVar.get(0)).c;
            if (ezolVar == null) {
                ezolVar = ezol.a;
            }
            if (!((bvkr) this.l.b()).v(ezolVar)) {
                a.m("Skipping retry because desktop is not active.");
                eijuVarI = eijx.e(cbcw.k());
            } else if (((Optional) this.i.b()).isEmpty()) {
                a.r("DittoForegroundService is not supported on this device.");
                eijuVarI = eijx.d(new UnsupportedOperationException("DittoForegroundService is not supported on this device."));
            } else {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                final eowt eowtVar = (eowt) eowu.a.createBuilder();
                int i2 = ((ekoe) ekgbVar).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    try {
                        eoze eozeVar = (eoze) evsn.parseFrom(eoze.a, ((cfyv) ekgbVar.get(i3)).f, evrr.a());
                        int i4 = eozeVar.b;
                        if (eozd.a(i4) == 3) {
                            Iterator<E> it = (i4 == 2 ? (eowu) eozeVar.c : eowu.a).b.iterator();
                            while (it.hasNext()) {
                                ConversationIdType conversationIdTypeB = barn.b(((eowm) it.next()).c);
                                if (hashSet.add(conversationIdTypeB)) {
                                    final bajf bajfVarA = ((axgh) this.k.b()).a(conversationIdTypeB);
                                    if (bajfVarA == null) {
                                        eowtVar.b(((cehg) this.c.b()).l(conversationIdTypeB));
                                    } else {
                                        arrayList.add(this.m.b(bajfVarA.J()).i(new eooz() { // from class: cfxh
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj) {
                                                return ((cehg) this.a.c.b()).f(bajfVarA, (ekgb) obj);
                                            }
                                        }, this.e));
                                    }
                                }
                            }
                        }
                    } catch (evtj e) {
                        a.o("Failed to parse GetUpdatesResponse while retrying conversation update.", e);
                    }
                }
                eiju eijuVarA = eijx.a(arrayList);
                ejvr ejvrVar = new ejvr() { // from class: cfxf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        final eowt eowtVar2 = eowtVar;
                        eowtVar2.getClass();
                        Iterable$EL.forEach((List) obj, new Consumer() { // from class: cfxj
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                eowtVar2.b((eowm) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return (eowu) eowtVar2.build();
                    }
                };
                eosc eoscVar = this.e;
                eijuVarI = eijuVarA.h(ejvrVar, eoscVar).i(new eooz() { // from class: cfxg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eowu eowuVar = (eowu) obj;
                        return ((Boolean) ((cczi) bvfd.o.get()).e()).booleanValue() ? ((cezf) this.a.f.b()).a(eowuVar) : eijx.e(eowuVar);
                    }
                }, eoscVar).i(new eooz() { // from class: cfxi
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        cfeg cfegVarA;
                        eowu eowuVar = (eowu) obj;
                        if (eowuVar.b.size() == 0) {
                            return eijx.e(cbcw.i());
                        }
                        final ezol ezolVar2 = ezolVar;
                        ekgb ekgbVar3 = ekgbVar;
                        cfxk cfxkVar = this.a;
                        final String str = ((cfyv) ekgbVar3.get(0)).e;
                        String str2 = ((cfyv) ekgbVar3.get(0)).o;
                        if (((cdio) cfxkVar.g.b()).a()) {
                            cfef cfefVarB = cfxkVar.h.b((cfyv) ekgbVar3.get(0), epby.GET_UPDATES);
                            cfefVarB.c = str;
                            eozc eozcVar = (eozc) eoze.a.createBuilder();
                            eozcVar.copyOnWrite();
                            eoze eozeVar2 = (eoze) eozcVar.instance;
                            eowuVar.getClass();
                            eozeVar2.c = eowuVar;
                            eozeVar2.b = 2;
                            cfefVarB.b(eozcVar.build());
                            ezjh ezjhVarB = ezjh.b(((cfyv) ekgbVar3.get(0)).g);
                            if (ezjhVarB == null) {
                                ezjhVarB = ezjh.UNRECOGNIZED;
                            }
                            cfefVarB.i = ezjhVarB;
                            cfefVarB.d = str2;
                            cfegVarA = cfefVarB.a();
                        } else {
                            cfef cfefVarC = cfxkVar.h.c(ezolVar2, Optional.empty(), epby.GET_UPDATES);
                            cfefVarC.c = str;
                            eozc eozcVar2 = (eozc) eoze.a.createBuilder();
                            eozcVar2.copyOnWrite();
                            eoze eozeVar3 = (eoze) eozcVar2.instance;
                            eowuVar.getClass();
                            eozeVar3.c = eowuVar;
                            eozeVar3.b = 2;
                            cfefVarC.b(eozcVar2.build());
                            ezjh ezjhVarB2 = ezjh.b(((cfyv) ekgbVar3.get(0)).g);
                            if (ezjhVarB2 == null) {
                                ezjhVarB2 = ezjh.UNRECOGNIZED;
                            }
                            cfefVarC.i = ezjhVarB2;
                            cfefVarC.d = str2;
                            cfegVarA = cfefVarC.a();
                        }
                        eiju eijuVarB = ((cfya) cfxkVar.b.b()).b(cfegVarA);
                        cfegVarA.q(eijuVarB);
                        ejvr ejvrVar2 = new ejvr() { // from class: cfxb
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cqbd cqbdVarA = cfxk.a.a();
                                cqbdVarA.I("Ditto Conversation Update RPC retry succeeded");
                                cqbdVarA.A("desktopId", ezolVar2);
                                cqbdVarA.A("requestId", str);
                                cqbdVarA.r();
                                return cbcw.i();
                            }
                        };
                        eosc eoscVar2 = cfxkVar.e;
                        return eijuVarB.h(ejvrVar2, eoscVar2).e(fbtf.class, new ejvr() { // from class: cfxc
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                fbtf fbtfVar = (fbtf) obj2;
                                boolean zD = cems.d(fbtfVar);
                                ezol ezolVar3 = ezolVar2;
                                String str3 = str;
                                if (zD) {
                                    cqbd cqbdVarE = cfxk.a.e();
                                    cqbdVarE.I("Ditto Conversation Update RPC retry failed with retryable gRPC error");
                                    cqbdVarE.A("status", Status.c(fbtfVar));
                                    cqbdVarE.A("desktopId", ezolVar3);
                                    cqbdVarE.A("requestId", str3);
                                    cqbdVarE.r();
                                    return cbcw.m();
                                }
                                cqbd cqbdVarE2 = cfxk.a.e();
                                cqbdVarE2.I("Ditto Conversation Update RPC retry failed with non-retryable gRPC error");
                                cqbdVarE2.A("status", Status.c(fbtfVar));
                                cqbdVarE2.A("desktopId", ezolVar3);
                                cqbdVarE2.A("requestId", str3);
                                cqbdVarE2.r();
                                return cbcw.k();
                            }
                        }, eoscVar2);
                    }
                }, this.n);
            }
        } else {
            a.m("Skipping retry because not registered.");
            eijuVarI = eijx.e(cbcw.k());
        }
        ejvr ejvrVar2 = new ejvr() { // from class: cfxd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                boolean zEquals = cbcwVar.equals(cbcw.i());
                cfxk cfxkVar = this.a;
                cayy cayyVar2 = cayyVar;
                int i5 = 0;
                if (zEquals) {
                    ekgb ekgbVar3 = ((caxm) cayyVar2.a()).d;
                    int size2 = ekgbVar3.size();
                    while (i5 < size2) {
                        ((ains) cfxkVar.d.b()).e("Bugle.Ditto.ConversationRetryHandler.Success.Count", ((Integer) ekgbVar3.get(i5)).intValue());
                        i5++;
                    }
                } else {
                    if (cbcwVar.equals(cbcw.k())) {
                        cfxkVar.k(cayyVar2);
                        return cbcwVar;
                    }
                    if (cbcwVar.equals(cbcw.m())) {
                        while (i5 < ((ekoe) ekgbVar).c) {
                            if (!cayyVar2.d(i5)) {
                                cfxkVar.l(5);
                            }
                            i5++;
                        }
                    }
                }
                return cbcwVar;
            }
        };
        eosc eoscVar2 = this.e;
        return eijuVarI.h(ejvrVar2, eoscVar2).f(Exception.class, new eooz() { // from class: cfxe
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                this.a.k(cayyVar);
                return eijx.d((Exception) obj);
            }
        }, eoscVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(cayy cayyVar) {
        ekgb ekgbVar = ((caxm) cayyVar.a()).d;
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            l(((Integer) ekgbVar.get(i)).intValue());
        }
    }

    public final void l(int i) {
        ((ains) this.d.b()).e("Bugle.Ditto.ConversationRetryHandler.Failure.Count", i);
    }
}
