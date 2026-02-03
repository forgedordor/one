package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwlz implements bvuq {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "EncryptedMessageDeletionHandlerImpl");
    public final fcsu b;
    public final fdjx c;
    private final fcsu d;

    public bwlz(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.d = fcsuVar2;
        this.c = fdjxVar;
    }

    public final List a(brdp brdpVar) {
        ekgb<MessageCoreData> ekgbVarK = ((baxe) this.d.b()).K(brdpVar);
        ekgbVarK.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarK, 10));
        for (MessageCoreData messageCoreData : ekgbVarK) {
            bwmb bwmbVar = (bwmb) bwmc.a.createBuilder();
            bwmbVar.getClass();
            Object objOrElse = messageCoreData.ag().orElse(null);
            objOrElse.getClass();
            bwmbVar.copyOnWrite();
            bwmc bwmcVar = (bwmc) bwmbVar.instance;
            bwmcVar.c = (aubq) objOrElse;
            bwmcVar.b |= 1;
            String strF = messageCoreData.F().f();
            bwmbVar.copyOnWrite();
            bwmc bwmcVar2 = (bwmc) bwmbVar.instance;
            bwmcVar2.b |= 2;
            bwmcVar2.d = strF;
            evsn evsnVarBuild = bwmbVar.build();
            evsnVarBuild.getClass();
            arrayList.add((bwmc) evsnVarBuild);
        }
        return fcva.ao(arrayList);
    }
}
