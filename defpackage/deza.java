package defpackage;

import android.content.Context;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deza extends dexs {
    public static final dfny b = dfnv.b("enable_xsl_rcs_messaging_send_message");
    private final Context c;

    public deza(Context context, dfxx dfxxVar, dhes dhesVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emko.CARRIER_SERVICES_EVENT_SOURCE_RCS, eoscVar, dexwVar);
        this.c = context;
    }

    public final void d(fhaz fhazVar, String str) {
        f(fhazVar, str, 8);
    }

    public final void e(fhaz fhazVar, String str) {
        f(fhazVar, str, 7);
    }

    public final void f(fhaz fhazVar, String str, int i) {
        febx febxVar = (febx) fecc.a.createBuilder();
        febv febvVar = (febv) febw.a.createBuilder();
        febvVar.a(str);
        febxVar.copyOnWrite();
        fecc feccVar = (fecc) febxVar.instance;
        febw febwVar = (febw) febvVar.build();
        febwVar.getClass();
        feccVar.d = febwVar;
        feccVar.b |= 2;
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).f = fhba.a(24);
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).e = fecb.a(i);
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).g = feca.a(21);
        evvp evvpVarC = evxc.c(dhkl.a().longValue());
        febxVar.copyOnWrite();
        fecc feccVar2 = (fecc) febxVar.instance;
        evvpVarC.getClass();
        feccVar2.h = evvpVarC;
        feccVar2.b |= 4;
        fhaz fhazVar2 = fhaz.a;
        if (!fhazVar.equals(fhazVar2)) {
            febxVar.copyOnWrite();
            fecc feccVar3 = (fecc) febxVar.instance;
            fhazVar.getClass();
            feccVar3.c = fhazVar;
            feccVar3.b |= 1;
        }
        fecc feccVar4 = (fecc) febxVar.build();
        Context context = this.c;
        emkm emkmVarK = K(context);
        if (emkmVarK == null) {
            dhja.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        if ((feccVar4.b & 1) != 0) {
            fhaz fhazVar3 = feccVar4.c;
            if (fhazVar3 != null) {
                fhazVar2 = fhazVar3;
            }
            double dDoubleValue = dfog.p().doubleValue();
            if (dDoubleValue < 1.0d && (dDoubleValue <= 0.0d || fhazVar2 == null || Math.abs(UUID.fromString(fhazVar2.b).hashCode()) > ((int) (dDoubleValue * 2.147483647E9d)))) {
                return;
            }
        }
        emkmVarK.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarK.instance;
        emkr emkrVar2 = emkr.a;
        feccVar4.getClass();
        emkrVar.f = feccVar4;
        emkrVar.e = 39;
        M(context, (emkr) emkmVarK.build(), ewqu.XSL_REQUEST_EVENT);
    }
}
