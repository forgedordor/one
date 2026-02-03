package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abuz implements Consumer {
    final /* synthetic */ abvc a;
    final /* synthetic */ String b;

    public abuz(abvc abvcVar, String str) {
        this.a = abvcVar;
        this.b = str;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* synthetic */ void z(Object obj) {
        bqit bqitVar = (bqit) obj;
        ckmb ckmbVarO = bqitVar.o();
        dnwn dnwnVarA = null;
        if (ckmbVarO != null) {
            dnwn dnwnVar = ckmbVarO.b == 101 ? (dnwn) ckmbVarO.c : dnwn.a;
            if (dnwnVar != null) {
                ((eksl) abvc.a.h()).t("Found an Emotify reaction by messageId(uri = %s).", abvc.a(dnwnVar).toString());
                if (true != fdbq.f(abvc.a(dnwnVar).getAuthority(), "com.google.android.libraries.compose.core.data.content")) {
                    dnwnVar = null;
                }
                if (dnwnVar != null) {
                    String str = this.b;
                    dnwm dnwmVar = (dnwm) dnwnVar.toBuilder();
                    dnwmVar.getClass();
                    dokx dokxVar = ((dnwn) dnwmVar.instance).g;
                    if (dokxVar == null) {
                        dokxVar = dokx.a;
                    }
                    dokxVar.getClass();
                    dokd dokdVar = (dokd) dokxVar.toBuilder();
                    dokdVar.getClass();
                    dltt dlttVar = ((dokx) dokdVar.instance).f;
                    if (dlttVar == null) {
                        dlttVar = dltt.a;
                    }
                    dlttVar.getClass();
                    dltp dltpVar = (dltp) dlttVar.toBuilder();
                    dltpVar.getClass();
                    dltu.b(str, dltpVar);
                    dolb.b(dltu.a(dltpVar), dokdVar);
                    dnwo.b(dolb.a(dokdVar), dnwmVar);
                    dnwnVarA = dnwo.a(dnwmVar);
                }
            }
        }
        if (dnwnVarA == null) {
            ((eksl) abvc.a.j()).q("This reaction is not qualified to update.");
            return;
        }
        eksl ekslVar = (eksl) abvc.a.h();
        final abvc abvcVar = this.a;
        ekslVar.t("Found an Emotify reaction to update(uri = %s).", abvc.a(dnwnVarA).toString());
        ckmb ckmbVarO2 = bqitVar.o();
        if (ckmbVarO2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ckma ckmaVar = (ckma) ckmbVarO2.toBuilder();
        ckmaVar.getClass();
        ckmk.b(dnwnVarA, ckmaVar);
        final ckmb ckmbVarA = ckmk.a(ckmaVar);
        final MessageIdType messageIdTypeM = bqitVar.m();
        messageIdTypeM.getClass();
        bqkl.f(messageIdTypeM, new Consumer() { // from class: abuw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                evtg evtgVar;
                cklu ckluVar;
                bqit bqitVar2 = (bqit) obj2;
                cklv cklvVarN = bqitVar2.n();
                if (cklvVarN == null || (evtgVar = cklvVarN.b) == null) {
                    return;
                }
                int i = 0;
                for (Object obj3 : evtgVar) {
                    int i2 = i + 1;
                    if (i < 0) {
                        fcva.m();
                    }
                    ckme ckmeVar = (ckme) obj3;
                    ckmb ckmbVar = ckmeVar.c;
                    if (ckmbVar == null) {
                        ckmbVar = ckmb.a;
                    }
                    ckmbVar.getClass();
                    cklv cklvVar = null;
                    dnwn dnwnVar2 = ckmbVar.b == 101 ? (dnwn) ckmbVar.c : null;
                    if (dnwnVar2 != null) {
                        ckmb ckmbVar2 = ckmbVarA;
                        if (!fdbq.f(dnwnVar2.c, (ckmbVar2.b == 101 ? (dnwn) ckmbVar2.c : dnwn.a).c) || !fdbq.f(abvc.a(dnwnVar2).getAuthority(), "com.google.android.libraries.compose.core.data.content")) {
                            dnwnVar2 = null;
                        }
                        if (dnwnVar2 != null) {
                            ckmeVar.getClass();
                            ckmd ckmdVar = (ckmd) ckmeVar.toBuilder();
                            ckmdVar.getClass();
                            ckmf.b(ckmbVar2, ckmdVar);
                            ckme ckmeVarA = ckmf.a(ckmdVar);
                            cklv cklvVarN2 = bqitVar2.n();
                            if (cklvVarN2 != null && (ckluVar = (cklu) cklvVarN2.toBuilder()) != null) {
                                abvc abvcVar2 = abvcVar;
                                ckluVar.c(i);
                                ckluVar.copyOnWrite();
                                cklv cklvVar2 = (cklv) ckluVar.instance;
                                cklvVar2.a();
                                cklvVar2.b.add(i, ckmeVarA);
                                long epochMilli = abvcVar2.d.f().toEpochMilli();
                                ckluVar.copyOnWrite();
                                ((cklv) ckluVar.instance).c = epochMilli;
                                cklvVar = (cklv) ckluVar.build();
                            }
                            MessageIdType messageIdType = messageIdTypeM;
                            String[] strArr = bqkl.a;
                            bqki bqkiVar = new bqki();
                            bqkiVar.ap("updateReactedMessage");
                            bqkiVar.e(cklvVar);
                            bqkiVar.c(messageIdType);
                            ((eksl) abvc.a.h()).q("Uri updated.");
                        }
                    }
                    i = i2;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: abux
            @Override // java.lang.Runnable
            public final void run() {
                eksl ekslVar2 = (eksl) abvc.a.j();
                ckmb ckmbVar = ckmbVarA;
                String strB = messageIdTypeM.b();
                String str2 = (ckmbVar.b == 101 ? (dnwn) ckmbVar.c : dnwn.a).c;
                dnwn dnwnVar2 = ckmbVar.b == 101 ? (dnwn) ckmbVar.c : dnwn.a;
                dnwnVar2.getClass();
                ekslVar2.I("Couldn't find the reacted message for reaction[MessageId = %s, Emotify ID = %s, Url = %s].", strB, str2, abvc.a(dnwnVar2).toString());
            }
        });
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
