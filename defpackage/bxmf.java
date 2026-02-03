package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmf implements cdbr {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler");
    private final chwq b;

    public bxmf(chwq chwqVar) {
        this.b = chwqVar;
    }

    private static ewfq d(esju esjuVar) {
        Map mapC = esjuVar.c();
        if (mapC == null) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "getRcsSelfServiceMessage", 77, "RcsTicklesHandler.java")).q("Empty RCS FCM Tickle received");
            return null;
        }
        String str = (String) mapC.get("message");
        if (TextUtils.isEmpty(str)) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "getRcsSelfServiceMessage", 83, "RcsTicklesHandler.java")).q("Self-service message is missing in RCS FCM Tickle");
            return null;
        }
        try {
            try {
                ewfn ewfnVar = (ewfn) ((ewfq) evsn.parseFrom(ewfq.a, Base64.decode(str, 0))).toBuilder();
                ewfnVar.copyOnWrite();
                ((ewfq) ewfnVar.instance).d = true;
                boolean z = esjuVar.b() == 1;
                ewfnVar.copyOnWrite();
                ((ewfq) ewfnVar.instance).e = z;
                boolean z2 = esjuVar.b() != esjuVar.a();
                ewfnVar.copyOnWrite();
                ((ewfq) ewfnVar.instance).f = z2;
                return (ewfq) ewfnVar.build();
            } catch (evtj e) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "getRcsSelfServiceMessage", 'd', "RcsTicklesHandler.java")).q("Could not parse Self-service message");
                return null;
            }
        } catch (IllegalArgumentException unused) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "getRcsSelfServiceMessage", 92, "RcsTicklesHandler.java")).q("Could not decode the message from RCS FCM Tickle");
            return null;
        }
    }

    @Override // defpackage.cdbr
    public final int a(esju esjuVar) {
        ewfq ewfqVarD = d(esjuVar);
        if (ewfqVarD == null) {
            return 0;
        }
        ewfp ewfpVarB = ewfp.b(ewfqVarD.b);
        if (ewfpVarB == null) {
            ewfpVarB = ewfp.UNRECOGNIZED;
        }
        return ewfpVarB.a();
    }

    @Override // defpackage.cdbr
    public final void b(esju esjuVar) {
        ewfq ewfqVarD = d(esjuVar);
        if (ewfqVarD == null) {
            return;
        }
        String str = (String) esjuVar.c().get("tickle");
        if (!TextUtils.isEmpty(str)) {
            ewfn ewfnVar = (ewfn) ewfqVarD.toBuilder();
            ewfnVar.copyOnWrite();
            ewfq ewfqVar = (ewfq) ewfnVar.instance;
            str.getClass();
            ewfqVar.c = str;
            ewfqVarD = (ewfq) ewfnVar.build();
        }
        String str2 = ewfqVarD.e ? "HIGH" : ewfqVarD.f ? "DOWNGRADED" : "LOW";
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRcs");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "logSelfServiceMessage", 68, "RcsTicklesHandler.java");
        ewfp ewfpVarB = ewfp.b(ewfqVarD.b);
        if (ewfpVarB == null) {
            ewfpVarB = ewfp.UNRECOGNIZED;
        }
        ekrdVar.I("Received %s priority FCM Tickle: %s, id: %s", str2, ewfpVarB, ewfqVarD.c);
        this.b.u(ewfqVarD);
    }

    @Override // defpackage.cdbr
    public final void c() {
    }
}
