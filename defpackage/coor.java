package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coor {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/transfer/downloads/analytics/FileDownloadEventLogger");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public coor(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.b = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.c = fcsuVar5;
        this.d = fcsuVar6;
        this.h = fcsuVar7;
    }

    public static String a(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public final void b(MessageCoreData messageCoreData, String str) {
        ejwl.b(messageCoreData.cY(), "Message logged is not rcs file transfer.");
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        messagePartCoreDataH.getClass();
        ((ains) this.f.b()).e(str, elgz.a(cqmf.a(messagePartCoreDataH.p())));
    }

    public final ellg c(ajlt ajltVar, int i, Consumer consumer) {
        ejwl.b(ajltVar.a().equals(ajls.b), "Logging file download events supported only for RCS messages.");
        Long lQ = ajltVar.q();
        elof elofVar = (elof) elpg.b.createBuilder();
        long jA = ((aika) this.e.b()).a(ajltVar.f());
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= 1073741824;
        elpgVar.G = jA;
        long jLongValue = lQ != null ? lQ.longValue() : 0L;
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 128;
        elpgVar2.o = jLongValue;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.h = 3;
        elpgVar3.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.i = i - 1;
        elpgVar4.c |= 2;
        enyw enywVarA = ((asrf) this.g.b()).a();
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.Y = enywVarA.h;
        elpgVar5.d |= 2097152;
        int i2 = true == ajltVar.w() ? 2 : 3;
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elpgVar6.Q = i2 - 1;
        elpgVar6.d |= 16384;
        consumer.z(elofVar);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elpg elpgVar7 = (elpg) elofVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpgVar7.getClass();
        ellhVar2.l = elpgVar7;
        ellhVar2.b |= 4;
        return ellgVar;
    }

    public final ellg d(MessageCoreData messageCoreData, int i, Consumer consumer) {
        int iD = ajhe.d(messageCoreData.d());
        ejwl.b(iD == 4, "Logging file download events supported only for RCS messages.");
        elof elofVar = (elof) elpg.b.createBuilder();
        long jB = ((aika) this.e.b()).b(messageCoreData.A());
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= 1073741824;
        elpgVar.G = jB;
        long jT = messageCoreData.t();
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 128;
        elpgVar2.o = jT;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.h = iD - 1;
        elpgVar3.c |= 1;
        String strF = messageCoreData.F().f();
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.c |= Integer.MIN_VALUE;
        elpgVar4.H = strF;
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.i = i - 1;
        elpgVar5.c |= 2;
        enyw enywVarA = ((asrf) this.g.b()).a();
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elpgVar6.Y = enywVarA.h;
        elpgVar6.d |= 2097152;
        int i2 = true != messageCoreData.cB() ? 3 : 2;
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        elpgVar7.Q = i2 - 1;
        elpgVar7.d |= 16384;
        List<MessagePartCoreData> listM = messageCoreData.M();
        elpk elpkVar = (elpk) elpl.a.createBuilder();
        for (MessagePartCoreData messagePartCoreData : listM) {
            String strR = messagePartCoreData.R();
            elhd elhdVar = (elhd) elhe.a.createBuilder();
            elha elhaVarK = messagePartCoreData.K();
            elhdVar.copyOnWrite();
            elhe elheVar = (elhe) elhdVar.instance;
            elheVar.d = elhaVarK.a();
            elheVar.b |= 4;
            elhdVar.copyOnWrite();
            elhe.a((elhe) elhdVar.instance);
            int iA = cqmf.a(messagePartCoreData.p());
            elhdVar.copyOnWrite();
            elhe elheVar2 = (elhe) elhdVar.instance;
            elheVar2.f = elgz.a(iA);
            elheVar2.b |= 16;
            if (strR == null) {
                elhc elhcVar = elhc.UNKNOWN_BUGLE_CONTENT_TYPE;
                elhdVar.copyOnWrite();
                elhe elheVar3 = (elhe) elhdVar.instance;
                elheVar3.c = elhcVar.a();
                elheVar3.b |= 1;
            } else {
                elhc elhcVarA = cqmg.a(strR);
                elhdVar.copyOnWrite();
                elhe elheVar4 = (elhe) elhdVar.instance;
                elheVar4.c = elhcVarA.a();
                elheVar4.b |= 1;
                if (((aqzu) this.h.b()).a() && elhcVarA == elhc.UNKNOWN_BUGLE_CONTENT_TYPE) {
                    elhdVar.copyOnWrite();
                    elhe elheVar5 = (elhe) elhdVar.instance;
                    elheVar5.b |= 64;
                    elheVar5.h = strR;
                }
            }
            elpkVar.a(elhdVar);
        }
        elpl elplVar = (elpl) elpkVar.build();
        elofVar.copyOnWrite();
        elpg elpgVar8 = (elpg) elofVar.instance;
        elplVar.getClass();
        elpgVar8.k = elplVar;
        elpgVar8.c |= 8;
        consumer.z(elofVar);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elpg elpgVar9 = (elpg) elofVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpgVar9.getClass();
        ellhVar2.l = elpgVar9;
        ellhVar2.b |= 4;
        return ellgVar;
    }

    public final void e(MessageCoreData messageCoreData, int i, String str) {
        ((ains) this.f.b()).c("Bugle.DataModel.Action.Download.Start.Count.Rcs");
        int iA = emwp.a(((Long) this.c.b()).intValue());
        emwq emwqVar = (emwq) emws.a.createBuilder();
        emwqVar.copyOnWrite();
        emws emwsVar = (emws) emwqVar.instance;
        emwsVar.c = i - 1;
        emwsVar.b |= 1;
        if (iA == 0) {
            iA = 1;
        }
        emwqVar.copyOnWrite();
        emws emwsVar2 = (emws) emwqVar.instance;
        emwsVar2.e = iA - 1;
        emwsVar2.b |= 4;
        String strA = a(str);
        emwqVar.copyOnWrite();
        emws emwsVar3 = (emws) emwqVar.instance;
        strA.getClass();
        emwsVar3.b |= 2;
        emwsVar3.d = strA;
        final emws emwsVar4 = (emws) emwqVar.build();
        f(messageCoreData, 15, new Consumer() { // from class: cooj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                elof elofVar = (elof) obj;
                elofVar.copyOnWrite();
                elpg elpgVar = (elpg) elofVar.instance;
                evsy evsyVar = elpg.a;
                emws emwsVar5 = emwsVar4;
                emwsVar5.getClass();
                elpgVar.aq = emwsVar5;
                elpgVar.e |= 256;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void f(MessageCoreData messageCoreData, int i, Consumer consumer) {
        ((aimb) this.b.b()).a().j(d(messageCoreData, i, consumer), aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }
}
