package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfyg implements eora {
    final /* synthetic */ cfeg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cfyh c;

    public cfyg(cfyh cfyhVar, cfeg cfegVar, boolean z) {
        this.a = cfegVar;
        this.b = z;
        this.c = cfyhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iValue = Status.b.getCode().value();
        ains ainsVar = this.c.g;
        ainsVar.e("Bugle.Ditto.Response.Status", iValue);
        ainsVar.c("Bugle.Ditto.RetryExecutor.Rpc.Success.Count");
        cfeg cfegVar = this.a;
        epby epbyVarB = epby.b(cfegVar.m().d);
        if (epbyVarB == null) {
            epbyVarB = epby.UNRECOGNIZED;
        }
        if (epbyVarB != epby.GET_UPDATES) {
            bvio bvioVar = (bvio) cfegVar.a.b();
            eoxg eoxgVar = cfegVar.h;
            bvioVar.n(eoxgVar.b, cfegVar.b.c, eoxgVar.g, cfegVar.c);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        int iValue = Status.c(th).getCode().value();
        final cfyh cfyhVar = this.c;
        ains ainsVar = cfyhVar.g;
        ainsVar.e("Bugle.Ditto.Response.Status", iValue);
        final cfeg cfegVar = this.a;
        cfegVar.h(th);
        if (this.b) {
            if (!cems.c(Status.c(th).getCode())) {
                this.c.g.c("Bugle.Ditto.RetryExecutor.Rpc.Failure.Without.Retry.Count");
                return;
            }
            ainsVar.c("Bugle.Ditto.RetryExecutor.Rpc.Retry.Count");
            cfyv cfyvVarM = cfegVar.m();
            caxr caxrVar = new caxr();
            epby epbyVarB = epby.b(cfyvVarM.d);
            if (epbyVarB == null) {
                epbyVarB = epby.UNRECOGNIZED;
            }
            if (epbyVarB != epby.GET_UPDATES) {
                cfyh.a.m("Ditto response RPC failed, scheduling retry...");
                ((cfyr) cfyhVar.d.b()).a(cfyvVarM, caxrVar.a());
                fcsu fcsuVar = cfyhVar.l;
                ceku cekuVar = ((cdio) fcsuVar.b()).a() ? (ceku) cfyhVar.i.b() : cfyhVar.j;
                final String strP = ((cdio) fcsuVar.b()).a() ? cfegVar.p() : "Bugle";
                cekuVar.w().i(new eooz() { // from class: cfyd
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ezns eznsVar = (ezns) obj;
                        eznsVar.getClass();
                        cfyh cfyhVar2 = cfyhVar;
                        ezpo ezpoVarA = cfyhVar2.h.a(strP);
                        evqs evqsVar = eznsVar.b;
                        ezpoVarA.copyOnWrite();
                        ezpp ezppVar = (ezpp) ezpoVarA.instance;
                        ezpp ezppVar2 = ezpp.a;
                        evqsVar.getClass();
                        ezppVar.f = evqsVar;
                        ezpp ezppVar3 = (ezpp) ezpoVarA.build();
                        final cfeg cfegVar2 = cfegVar;
                        cepf cepfVarA = ((cdio) cfegVar2.g.b()).a() ? cfyhVar2.c.a() : cfyhVar2.k;
                        ezhn ezhnVar = (ezhn) ezho.a.createBuilder();
                        ezpg ezpgVar = (ezpg) ezph.a.createBuilder();
                        String str = cfegVar2.e;
                        ezpgVar.copyOnWrite();
                        ezph ezphVar = (ezph) ezpgVar.instance;
                        str.getClass();
                        ezphVar.c = str;
                        ezol ezolVar = cfegVar2.f;
                        ezpgVar.copyOnWrite();
                        ezph ezphVar2 = (ezph) ezpgVar.instance;
                        ezolVar.getClass();
                        ezphVar2.d = ezolVar;
                        ezphVar2.b |= 1;
                        ezhnVar.a((ezph) ezpgVar.build());
                        ezhnVar.copyOnWrite();
                        ezho ezhoVar = (ezho) ezhnVar.instance;
                        ezppVar3.getClass();
                        ezhoVar.c = ezppVar3;
                        ezhoVar.b |= 1;
                        return cepfVarA.a((ezho) ezhnVar.build()).h(new ejvr() { // from class: cfee
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cqca.j("BugleNetwork", "Acked message, messageId=%s", cfegVar2.e);
                                return null;
                            }
                        }, eoqg.a);
                    }
                }, cfyhVar.b);
                return;
            }
            try {
                eoze eozeVar = (eoze) evsn.parseFrom(eoze.a, cfyvVarM.f, evrr.a());
                int i = eozeVar.b;
                int iA = eozd.a(i);
                if (iA == 0) {
                    throw null;
                }
                int i2 = iA - 1;
                if (i2 == 2) {
                    ezol ezolVar = cfyvVarM.c;
                    if (ezolVar == null) {
                        ezolVar = ezol.a;
                    }
                    caxrVar.a = ezolVar.c;
                    cfyh.a.m("Ditto Conversation Update RPC failed, scheduling retry...");
                    ((cazj) ((cfxl) cfyhVar.f.b()).a.b()).g(cbcu.g("ditto_conversation_retry_handler", cfyvVarM, caxrVar.a()));
                    return;
                }
                if (i2 == 3) {
                    ezol ezolVar2 = cfyvVarM.c;
                    if (ezolVar2 == null) {
                        ezolVar2 = ezol.a;
                    }
                    caxrVar.a = ezolVar2.c;
                    cfyh.a.m("Ditto Message Update RPC failed, scheduling retry...");
                    ((cazj) ((cfxz) cfyhVar.e.b()).a.b()).g(cbcu.g("ditto_message_retry_handler", cfyvVarM, caxrVar.a()));
                    return;
                }
                if (i2 == 5) {
                    ezol ezolVar3 = cfyvVarM.c;
                    if (ezolVar3 == null) {
                        ezolVar3 = ezol.a;
                    }
                    caxrVar.b = "settings_update_".concat(String.valueOf(ezolVar3.c));
                    cfyh.a.m("Ditto Settings Update RPC failed, scheduling retry...");
                } else if (i2 == 6) {
                    epfy epfyVarB = epfy.b((i == 6 ? (epga) eozeVar.c : epga.a).b);
                    if (epfyVarB == null) {
                        epfyVarB = epfy.UNRECOGNIZED;
                    }
                    switch (epfyVarB.ordinal()) {
                        case 1:
                        case 2:
                        case 3:
                            ezol ezolVar4 = cfyvVarM.c;
                            if (ezolVar4 == null) {
                                ezolVar4 = ezol.a;
                            }
                            caxrVar.b = "browser_inactive_".concat(String.valueOf(ezolVar4.c));
                            break;
                        case 5:
                        case 6:
                            ezol ezolVar5 = cfyvVarM.c;
                            if (ezolVar5 == null) {
                                ezolVar5 = ezol.a;
                            }
                            caxrVar.b = "connectivity_update_".concat(String.valueOf(ezolVar5.c));
                            break;
                        case 7:
                        case 8:
                            ezol ezolVar6 = cfyvVarM.c;
                            if (ezolVar6 == null) {
                                ezolVar6 = ezol.a;
                            }
                            caxrVar.b = "battery_update_".concat(String.valueOf(ezolVar6.c));
                            break;
                    }
                    cfyh.a.m("Ditto User Alert RPC failed, scheduling retry...");
                } else if (i2 == 8) {
                    return;
                } else {
                    cfyh.a.m("Ditto GetUpdates RPC failed, scheduling retry...");
                }
                ((cfyr) cfyhVar.d.b()).a(cfyvVarM, caxrVar.a());
            } catch (evtj e) {
                cfyh.a.o("Failed to parse GetUpdatesResponse while scheduling retry.", e);
            }
        }
    }
}
