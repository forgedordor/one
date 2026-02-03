package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfrw implements cfrl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl");
    public final cepf b;
    public final cedp c;
    public final Map d;
    public final ains e;
    public final cub f;
    public final eosc g;
    public final cenj h;
    public final cogw i;
    private final Map j;
    private final fcsu k;
    private final fdjx l;

    public cfrw(Map map, Map map2, cenj cenjVar, eosd eosdVar, fdjx fdjxVar, cogw cogwVar, ains ainsVar, fcsu fcsuVar, cepf cepfVar, cedp cedpVar) {
        new AtomicReference();
        this.f = new cub(100);
        this.b = cepfVar;
        this.c = cedpVar;
        this.d = map;
        this.j = map2;
        this.h = cenjVar;
        this.g = eosdVar;
        this.l = fdjxVar;
        this.i = cogwVar;
        this.e = ainsVar;
        this.k = fcsuVar;
        for (ezji ezjiVar : map.keySet()) {
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "<init>", 116, "InboxMessageDispatcherImpl.java")).r("InboxMessageDispatcherImpl: Registered InboxMessageHandler type: %d", ezjiVar.a());
        }
    }

    @Override // defpackage.cfrl
    public final eiju a(final ezjj ezjjVar) {
        fdkf fdkfVarA;
        eieu eieuVarK = eiiy.k("InboxMessageDispatcherImpl::handleInboxMessage");
        try {
            awhc awhcVar = (awhc) this.k.b();
            Map map = this.j;
            ezji ezjiVarB = ezji.b(ezjjVar.d);
            if (ezjiVarB == null) {
                ezjiVarB = ezji.UNRECOGNIZED;
            }
            String strA = ((awgo) Map.EL.getOrDefault(map, ezjiVarB, new awgo() { // from class: cfrm
                @Override // defpackage.awgo
                public final String a(Object obj) {
                    return "default key for parallel execution";
                }
            })).a(ezjjVar);
            fdjx fdjxVar = this.l;
            awhb awhbVar = new awhb(new eooy() { // from class: cfrn
                /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
                @Override // defpackage.eooy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 425
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cfrn.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, null);
            if (fdbq.f(strA, "default key for parallel execution")) {
                fcyi fcyiVar = fcyi.a;
                fdkfVarA = fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new awha(awhbVar, null));
            } else {
                ConcurrentHashMap concurrentHashMap = awhcVar.a;
                final fdap fdapVar = new fdap() { // from class: awgy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((String) obj).getClass();
                        return new eizx();
                    }
                };
                eizx eizxVar = (eizx) ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, strA, new Function() { // from class: awgz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                eizxVar.getClass();
                fdkfVarA = ejaa.a(fdjxVar, eizxVar, awhbVar);
            }
            eiju eijuVarI = auvw.a(fdkfVarA).i(new eooz() { // from class: cfro
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ezjj ezjjVar2 = ezjjVar;
                    Boolean bool = (Boolean) obj;
                    String str = ezjjVar2.c;
                    ekrw ekrwVarH = cfrw.a.h();
                    ekrwVarH.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "handleInboxMessageWithinSpan", 156, "InboxMessageDispatcherImpl.java")).D("InboxMessageDispatcherImpl: Handled message messageId: %s shouldAck: %s", str, bool);
                    if (!bool.booleanValue()) {
                        return eijx.e(null);
                    }
                    ezol ezolVar = ezjjVar2.i;
                    if (ezolVar == null) {
                        ezolVar = ezol.a;
                    }
                    ezjh ezjhVarB = ezjh.b(ezjjVar2.k);
                    if (ezjhVarB == null) {
                        ezjhVarB = ezjh.UNRECOGNIZED;
                    }
                    return this.a.c(str, ezolVar, ezjhVarB);
                }
            }, this.g);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cfrl
    public final boolean b(ekfn ekfnVar) {
        LinkedHashMap linkedHashMap;
        cub cubVar = this.f;
        synchronized (cubVar) {
            synchronized (cubVar.b) {
                cwg cwgVar = cubVar.a;
                linkedHashMap = new LinkedHashMap(cwgVar.c().size());
                for (Map.Entry entry : cwgVar.c()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap.keySet().containsAll(ekfnVar);
    }

    public final eiju c(final String str, final ezol ezolVar, final ezjh ezjhVar) {
        return this.c.l().i(new eooz() { // from class: cfrp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezns eznsVar = (ezns) obj;
                if (ezjh.EPHEMERAL.equals(ezjhVar)) {
                    return eijx.e(null);
                }
                ezol ezolVar2 = ezolVar;
                final String str2 = str;
                cfrw cfrwVar = this.a;
                ezpg ezpgVar = (ezpg) ezph.a.createBuilder();
                ezpgVar.copyOnWrite();
                ezph ezphVar = (ezph) ezpgVar.instance;
                str2.getClass();
                ezphVar.c = str2;
                ezpgVar.copyOnWrite();
                ezph ezphVar2 = (ezph) ezpgVar.instance;
                ezolVar2.getClass();
                ezphVar2.d = ezolVar2;
                ezphVar2.b |= 1;
                ezph ezphVar3 = (ezph) ezpgVar.build();
                ekrw ekrwVarG = cfrw.a.g();
                ekrwVarG.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequest", 315, "InboxMessageDispatcherImpl.java")).t("InboxMessageDispatcherImpl: acking message messageId: %s", str2);
                String strK = cfrwVar.c.k();
                ezhn ezhnVar = (ezhn) ezho.a.createBuilder();
                ezhnVar.a(ezphVar3);
                ezpo ezpoVarA = cfrwVar.h.a(strK);
                evqs evqsVar = eznsVar.b;
                ezpoVarA.copyOnWrite();
                ezpp ezppVar = (ezpp) ezpoVarA.instance;
                ezpp ezppVar2 = ezpp.a;
                evqsVar.getClass();
                ezppVar.f = evqsVar;
                ezhnVar.copyOnWrite();
                ezho ezhoVar = (ezho) ezhnVar.instance;
                ezpp ezppVar3 = (ezpp) ezpoVarA.build();
                ezppVar3.getClass();
                ezhoVar.c = ezppVar3;
                ezhoVar.b |= 1;
                return cfrwVar.b.a((ezho) ezhnVar.build()).h(new ejvr() { // from class: cfrv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrw ekrwVarH = cfrw.a.h();
                        ekrwVarH.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequest", 328, "InboxMessageDispatcherImpl.java")).t("InboxMessageDispatcherImpl: Acked message messageId: %s", str2);
                        return null;
                    }
                }, eoqg.a);
            }
        }, this.g).e(Throwable.class, new ejvr() { // from class: cfru
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarJ = cfrw.a.j();
                ekrwVarJ.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequestCatchingThrowable", 285, "InboxMessageDispatcherImpl.java")).D("InboxMessageDispatcherImpl: Failed to ack message messageId: %s messageClass: %s", str, ezjhVar);
                return null;
            }
        }, eoqg.a);
    }
}
