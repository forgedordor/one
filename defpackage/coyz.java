package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coyz {
    public final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final eosc d;

    public coyz(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar) {
        this.a = fcsuVar3;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = eoscVar;
    }

    public static final void e(elof elofVar, Optional optional) {
        elpl elplVar = ((elpg) elofVar.instance).k;
        if (elplVar == null) {
            elplVar = elpl.a;
        }
        elpk elpkVar = (elpk) elplVar.toBuilder();
        if (((elpl) elpkVar.instance).b.size() > 0 && optional.isPresent() && ((cous) optional.get()).g().isPresent()) {
            elhd elhdVar = (elhd) elpkVar.b().toBuilder();
            int iA = cqmf.a(((cous) optional.get()).g().getAsLong());
            elhdVar.copyOnWrite();
            elhe elheVar = (elhe) elhdVar.instance;
            elheVar.f = elgz.a(iA);
            elheVar.b |= 16;
            elpkVar.c(elhdVar);
        }
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpl elplVar2 = (elpl) elpkVar.build();
        elplVar2.getClass();
        elpgVar.k = elplVar2;
        elpgVar.c |= 8;
    }

    private final void f(MessageCoreData messageCoreData, int i, Consumer consumer) {
        elof elofVar = (elof) elpg.b.createBuilder();
        long jB = ((aika) this.b.b()).b(messageCoreData.A());
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= 1073741824;
        elpgVar.G = jB;
        long jT = messageCoreData.t();
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 128;
        elpgVar2.o = jT;
        int iD = ajhe.d(messageCoreData.d());
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.h = iD - 1;
        elpgVar3.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.i = i - 1;
        elpgVar4.c |= 2;
        int i2 = true != messageCoreData.cB() ? 3 : 2;
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.Q = i2 - 1;
        elpgVar5.d |= 16384;
        String strF = messageCoreData.F().f();
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elpgVar6.c |= Integer.MIN_VALUE;
        elpgVar6.H = strF;
        elrr elrrVar = (elrr) elrs.a.createBuilder();
        int iF = messageCoreData.f();
        elrrVar.copyOnWrite();
        elrs elrsVar = (elrs) elrrVar.instance;
        elrsVar.b |= 1;
        elrsVar.c = iF;
        elrs elrsVar2 = (elrs) elrrVar.build();
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        elrsVar2.getClass();
        elpgVar7.g = elrsVar2;
        elpgVar7.f = 60;
        List<MessagePartCoreData> listM = messageCoreData.M();
        elpk elpkVar = (elpk) elpl.a.createBuilder();
        for (MessagePartCoreData messagePartCoreData : listM) {
            String strR = messagePartCoreData.R();
            elhc elhcVarA = strR != null ? cqmg.a(strR) : elhc.UNKNOWN_BUGLE_CONTENT_TYPE;
            elhd elhdVar = (elhd) elhe.a.createBuilder();
            elhdVar.copyOnWrite();
            elhe elheVar = (elhe) elhdVar.instance;
            elheVar.c = elhcVarA.a();
            elheVar.b |= 1;
            elha elhaVarK = messagePartCoreData.K();
            elhdVar.copyOnWrite();
            elhe elheVar2 = (elhe) elhdVar.instance;
            elheVar2.d = elhaVarK.a();
            elheVar2.b |= 4;
            elhdVar.copyOnWrite();
            elhe.a((elhe) elhdVar.instance);
            long jL = messagePartCoreData.l() > 0 ? messagePartCoreData.l() : messagePartCoreData.p();
            elhdVar.copyOnWrite();
            elhe elheVar3 = (elhe) elhdVar.instance;
            elheVar3.f = elgz.a(cqmf.a(jL));
            elheVar3.b |= 16;
            elpkVar.a(elhdVar);
        }
        elpl elplVar = (elpl) elpkVar.build();
        elofVar.copyOnWrite();
        elpg elpgVar8 = (elpg) elofVar.instance;
        elplVar.getClass();
        elpgVar8.k = elplVar;
        elpgVar8.c |= 8;
        if (messageCoreData.cX()) {
            enyw enywVarA = ((asrf) this.c.b()).a();
            elofVar.copyOnWrite();
            elpg elpgVar9 = (elpg) elofVar.instance;
            elpgVar9.Y = enywVarA.h;
            elpgVar9.d |= 2097152;
        }
        consumer.z(elofVar);
        final ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elpg elpgVar10 = (elpg) elofVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpgVar10.getClass();
        ellhVar2.l = elpgVar10;
        ellhVar2.b |= 4;
        auvh.f(eijx.f(new Runnable() { // from class: coyx
            @Override // java.lang.Runnable
            public final void run() {
                ((aimb) this.a.a.b()).a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            }
        }, this.d), "Failed to log upload event.");
    }

    public final void a(MessageCoreData messageCoreData, final emwy emwyVar, final Optional optional) {
        f(messageCoreData, 21, new Consumer() { // from class: coyu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                elof elofVar = (elof) obj;
                elofVar.copyOnWrite();
                elpg elpgVar = (elpg) elofVar.instance;
                evsy evsyVar = elpg.a;
                emwy emwyVar2 = emwyVar;
                emwyVar2.getClass();
                elpgVar.ak = emwyVar2;
                elpgVar.e |= 4;
                coyz.e(elofVar, optional);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b(MessageCoreData messageCoreData, final emwy emwyVar, final emws emwsVar, final Optional optional) {
        f(messageCoreData, 21, new Consumer() { // from class: coyw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                elof elofVar = (elof) obj;
                elofVar.copyOnWrite();
                elpg elpgVar = (elpg) elofVar.instance;
                evsy evsyVar = elpg.a;
                emwy emwyVar2 = emwyVar;
                emwyVar2.getClass();
                elpgVar.ak = emwyVar2;
                elpgVar.e |= 4;
                elofVar.copyOnWrite();
                elpg elpgVar2 = (elpg) elofVar.instance;
                emws emwsVar2 = emwsVar;
                emwsVar2.getClass();
                elpgVar2.aq = emwsVar2;
                elpgVar2.e |= 256;
                coyz.e(elofVar, optional);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(MessageCoreData messageCoreData) {
        f(messageCoreData, 19, new Consumer() { // from class: coyv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d(MessageCoreData messageCoreData, final Optional optional, final aucj aucjVar) {
        f(messageCoreData, 20, new Consumer() { // from class: coyy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final elof elofVar = (elof) obj;
                elofVar.getClass();
                optional.ifPresent(new Consumer() { // from class: coyt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        elof elofVar2 = elofVar;
                        emwy emwyVar = (emwy) obj2;
                        elofVar2.copyOnWrite();
                        elpg elpgVar = (elpg) elofVar2.instance;
                        evsy evsyVar = elpg.a;
                        emwyVar.getClass();
                        elpgVar.av = emwyVar;
                        elpgVar.e |= 8192;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                elpl elplVar = ((elpg) elofVar.instance).k;
                if (elplVar == null) {
                    elplVar = elpl.a;
                }
                elpk elpkVar = (elpk) elplVar.toBuilder();
                if (((elpl) elpkVar.instance).b.size() > 0) {
                    aucj aucjVar2 = aucjVar;
                    elhd elhdVar = (elhd) elpkVar.b().toBuilder();
                    long j = aucjVar2.d;
                    elhdVar.copyOnWrite();
                    elhe elheVar = (elhe) elhdVar.instance;
                    elheVar.f = elgz.a(cqmf.a(j));
                    elheVar.b |= 16;
                    elpkVar.c(elhdVar);
                }
                elofVar.copyOnWrite();
                elpg elpgVar = (elpg) elofVar.instance;
                elpl elplVar2 = (elpl) elpkVar.build();
                elplVar2.getClass();
                elpgVar.k = elplVar2;
                elpgVar.c |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
