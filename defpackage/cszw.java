package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszw {
    public static final eksp a = eksp.c("BugleWearable");
    public final fcsu b;
    public final cszx c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final aqmq g;
    private final baeb h;
    private final ctac i;
    private final fcsu j;
    private final fcsu k;

    public cszw(baeb baebVar, fcsu fcsuVar, cszx cszxVar, ctac ctacVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, aqmq aqmqVar) {
        this.h = baebVar;
        this.b = fcsuVar;
        this.c = cszxVar;
        this.i = ctacVar;
        this.d = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = aqmqVar;
    }

    public final cszt a(baea baeaVar, List list, Context context) {
        String strB;
        eieu eieuVarK = eiiy.k("WearableConversationBuilder#getMessageDataFromConversationMessageData");
        try {
            String strG = baeaVar.G(context);
            if (strG == null) {
                strG = baeaVar.u;
            }
            cszs cszsVar = (cszs) cszt.a.createBuilder();
            String strB2 = baeaVar.r().b();
            cszsVar.copyOnWrite();
            cszt csztVar = (cszt) cszsVar.instance;
            strB2.getClass();
            csztVar.c = strB2;
            String strA = baeaVar.q().a();
            cszsVar.copyOnWrite();
            cszt csztVar2 = (cszt) cszsVar.instance;
            strA.getClass();
            csztVar2.d = strA;
            boolean zAr = baeaVar.ar();
            cszsVar.copyOnWrite();
            ((cszt) cszsVar.instance).g = zAr;
            evvp evvpVarC = evxc.c(baeaVar.h());
            cszsVar.copyOnWrite();
            cszt csztVar3 = (cszt) cszsVar.instance;
            evvpVarC.getClass();
            csztVar3.m = evvpVarC;
            csztVar3.b |= 2;
            int iE = baeaVar.e();
            cszsVar.copyOnWrite();
            ((cszt) cszsVar.instance).h = iE;
            int iB = baeaVar.b();
            cszsVar.copyOnWrite();
            ((cszt) cszsVar.instance).i = iB;
            int iD = baeaVar.d();
            cszsVar.copyOnWrite();
            ((cszt) cszsVar.instance).j = iD;
            String strB3 = ejwk.b(baeaVar.E());
            cszsVar.copyOnWrite();
            ((cszt) cszsVar.instance).k = strB3;
            int iC = baeaVar.c();
            cszsVar.copyOnWrite();
            ((cszt) cszsVar.instance).o = iC;
            String strB4 = ejwk.b(strG);
            cszsVar.copyOnWrite();
            ((cszt) cszsVar.instance).e = strB4;
            String strB5 = ejwk.b(baeaVar.w());
            cszsVar.copyOnWrite();
            ((cszt) cszsVar.instance).f = strB5;
            ctae ctaeVar = (ctae) ctaf.a.createBuilder();
            if (baeaVar.Z()) {
                ParticipantColor participantColor = baeaVar.k;
                bajn bajnVar = (bajn) bajo.a.createBuilder();
                int i = participantColor.a;
                bajnVar.copyOnWrite();
                ((bajo) bajnVar.instance).c = i;
                int i2 = participantColor.b;
                bajnVar.copyOnWrite();
                bajo bajoVar = (bajo) bajnVar.instance;
                bajoVar.b |= 1;
                bajoVar.d = i2;
                int i3 = participantColor.c;
                bajnVar.copyOnWrite();
                ((bajo) bajnVar.instance).e = i3;
                bajo bajoVar2 = (bajo) bajnVar.build();
                ctaeVar.copyOnWrite();
                ctaf ctafVar = (ctaf) ctaeVar.instance;
                bajoVar2.getClass();
                ctafVar.e = bajoVar2;
                ctafVar.b |= 2;
                cczv cczvVar = alvx.a;
                if (((Boolean) new aluk().get()).booleanValue()) {
                    strB = baeaVar.o().l();
                    strB.getClass();
                } else {
                    strB = ejwk.b(baeaVar.D());
                }
                ctaeVar.copyOnWrite();
                ((ctaf) ctaeVar.instance).c = strB;
                String strB6 = ejwk.b(baeaVar.A(true));
                ctaeVar.copyOnWrite();
                ((ctaf) ctaeVar.instance).f = strB6;
                String strB7 = ejwk.b(baeaVar.C());
                ctaeVar.copyOnWrite();
                ctaf ctafVar2 = (ctaf) ctaeVar.instance;
                ctafVar2.b |= 1;
                ctafVar2.d = strB7;
            } else {
                ctaeVar.copyOnWrite();
                ((ctaf) ctaeVar.instance).c = "profile";
            }
            ctaf ctafVar3 = (ctaf) ctaeVar.build();
            cszsVar.copyOnWrite();
            cszt csztVar4 = (cszt) cszsVar.instance;
            ctafVar3.getClass();
            csztVar4.l = ctafVar3;
            csztVar4.b |= 1;
            ArrayList arrayList = new ArrayList();
            for (MessagePartCoreData messagePartCoreData : baeaVar.J()) {
                if (list != null && messagePartCoreData.t() != null && (messagePartCoreData.bj() || messagePartCoreData.aY())) {
                    list.add(messagePartCoreData);
                }
                Uri uriT = messagePartCoreData.t();
                ctaa ctaaVar = (ctaa) ctab.a.createBuilder();
                String strW = messagePartCoreData.W();
                ctaaVar.copyOnWrite();
                ctab ctabVar = (ctab) ctaaVar.instance;
                strW.getClass();
                ctabVar.c = strW;
                String strB8 = ejwk.b(messagePartCoreData.R());
                ctaaVar.copyOnWrite();
                ((ctab) ctaaVar.instance).d = strB8;
                String string = uriT == null ? "" : uriT.toString();
                ctaaVar.copyOnWrite();
                ctab ctabVar2 = (ctab) ctaaVar.instance;
                string.getClass();
                ctabVar2.e = string;
                int iC2 = messagePartCoreData.c();
                ctaaVar.copyOnWrite();
                ((ctab) ctaaVar.instance).g = iC2;
                int iB2 = messagePartCoreData.b();
                ctaaVar.copyOnWrite();
                ((ctab) ctaaVar.instance).f = iB2;
                evrj evrjVarD = evwy.d(messagePartCoreData.k());
                ctaaVar.copyOnWrite();
                ctab ctabVar3 = (ctab) ctaaVar.instance;
                evrjVarD.getClass();
                ctabVar3.h = evrjVarD;
                ctabVar3.b |= 1;
                arrayList.add((ctab) ctaaVar.build());
            }
            cszsVar.copyOnWrite();
            cszt csztVar5 = (cszt) cszsVar.instance;
            evtg evtgVar = csztVar5.n;
            if (!evtgVar.c()) {
                csztVar5.n = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(arrayList, csztVar5.n);
            cklv cklvVar = baeaVar.r;
            if (cklvVar != null) {
                cszsVar.copyOnWrite();
                cszt csztVar6 = (cszt) cszsVar.instance;
                csztVar6.p = cklvVar;
                csztVar6.b |= 4;
            }
            cszt csztVar7 = (cszt) cszsVar.build();
            eieuVarK.close();
            return csztVar7;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b(cszv cszvVar, cszv cszvVar2, List list, int i, Context context) {
        String strD;
        List<baea> listD = this.g.a() ? d(cszvVar.a(), i) : c(cszvVar.a(), i);
        ArrayList arrayList = new ArrayList();
        for (baea baeaVar : listD) {
            ((bahv) this.i.a.b()).getClass();
            cszz cszzVar = new cszz();
            MessageIdType messageIdTypeR = baeaVar.r();
            denz denzVar = cszzVar.a;
            denzVar.n("4", messageIdTypeR.b());
            if (baeaVar.T()) {
                String strG = baeaVar.G(context);
                if (strG != null) {
                    cszzVar.c(strG);
                }
            } else {
                String str = baeaVar.u;
                if (str != null) {
                    cszzVar.c(str);
                }
            }
            denzVar.n("44", baeaVar.w());
            denzVar.h("45", baeaVar.ar());
            denzVar.m("17", baeaVar.h());
            denzVar.m("16", baeaVar.i());
            denzVar.l("11", baeaVar.e());
            denzVar.l("36", baeaVar.b());
            denzVar.n("15", baeaVar.C());
            denzVar.n("14", baeaVar.A(true));
            denzVar.l("33", baeaVar.c());
            if (baeaVar.Z()) {
                ParticipantColor participantColor = baeaVar.k;
                denzVar.n("25", participantColor.a + ":" + participantColor.b + ":" + participantColor.c);
                cczv cczvVar = alvx.a;
                if (((Boolean) new aluk().get()).booleanValue()) {
                    strD = baeaVar.o().l();
                    strD.getClass();
                } else {
                    strD = baeaVar.D();
                }
                cszzVar.a(strD);
            } else {
                cszzVar.a("profile");
            }
            denzVar.l("37", baeaVar.d());
            denzVar.n("38", baeaVar.E());
            List<MessagePartCoreData> listJ = baeaVar.J();
            if (!listJ.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(listJ.size());
                for (MessagePartCoreData messagePartCoreData : listJ) {
                    denz denzVar2 = new denz();
                    denzVar2.n("4", messagePartCoreData.W());
                    Uri uriT = messagePartCoreData.t();
                    if (uriT != null) {
                        denzVar2.n("30", uriT.toString());
                    }
                    String strR = messagePartCoreData.R();
                    if (strR != null) {
                        denzVar2.n("26", strR);
                    }
                    denzVar2.l("28", messagePartCoreData.b());
                    denzVar2.l("29", messagePartCoreData.c());
                    denzVar2.m("42", messagePartCoreData.k());
                    arrayList2.add(denzVar2);
                }
                denzVar.k("27", arrayList2);
            }
            if (list != null) {
                for (MessagePartCoreData messagePartCoreData2 : baeaVar.J()) {
                    if (messagePartCoreData2.bj() || messagePartCoreData2.aY()) {
                        if (cszvVar2 != null) {
                            Asset assetB = cszvVar2.a.b("27".concat(String.valueOf(messagePartCoreData2.W())));
                            if (assetB != null) {
                                cszvVar.c(messagePartCoreData2.W(), assetB);
                            }
                        }
                        if (messagePartCoreData2.t() != null) {
                            list.add(messagePartCoreData2);
                        }
                    }
                }
            }
            cklv cklvVar = baeaVar.r;
            if (cklvVar == null) {
                denzVar.a.remove("40");
            } else {
                denzVar.j("40", cklvVar.toByteArray());
            }
            arrayList.add(denzVar);
        }
        return arrayList;
    }

    public final List c(ConversationIdType conversationIdType, int i) {
        eieu eieuVarK = eiiy.k("WearableConversationBuilder#getMessageInfos");
        try {
            bgvb bgvbVar = (bgvb) ((bael) this.j.b()).e(conversationIdType, 21, i).b().p();
            try {
                ArrayList arrayList = new ArrayList();
                while (bgvbVar.moveToNext()) {
                    arrayList.add(this.h.e(bgvbVar));
                }
                bgvbVar.close();
                eieuVarK.close();
                return arrayList;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List d(ConversationIdType conversationIdType, int i) {
        eieu eieuVarK = eiiy.k("WearableConversationBuilder#getMessageInfosOptimized");
        try {
            bfrj bfrjVar = (bfrj) ((baes) this.k.b()).d(conversationIdType, 21, i).b().p();
            try {
                ArrayList arrayList = new ArrayList();
                while (bfrjVar.moveToNext()) {
                    arrayList.add(this.h.c(bfrjVar));
                }
                bfrjVar.close();
                eieuVarK.close();
                return arrayList;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
