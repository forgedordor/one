package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyw extends dexs {
    public deyw(dfxx dfxxVar, dhes dhesVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emko.CARRIER_SERVICES_EVENT_SOURCE_RCS, eoscVar, dexwVar);
    }

    public final void d(Context context, ewdr ewdrVar) {
        emkm emkmVarK = K(context);
        if (emkmVarK == null) {
            dhja.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        emkmVarK.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarK.instance;
        emkr emkrVar2 = emkr.a;
        ewdrVar.getClass();
        emkrVar.f = ewdrVar;
        emkrVar.e = 33;
        M(context, (emkr) emkmVarK.build(), ewqu.IMS_SERVICE_SESSION_EVENT);
    }

    public final void e(Context context, eweb ewebVar) {
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        ewebVar.getClass();
        ewseVar.d = ewebVar;
        ewseVar.c = 11;
        i(context, ewsdVar, ewqu.INCOMING_RPC_EVENT);
    }

    public final void f(Context context, ewev ewevVar) {
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        ewevVar.getClass();
        ewseVar.d = ewevVar;
        ewseVar.c = 10;
        i(context, ewsdVar, ewqu.MSRP_EVENT);
    }

    public final void g(Context context, ewfq ewfqVar, ewfu ewfuVar) {
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        ewfqVar.getClass();
        ewseVar.e = ewfqVar;
        ewseVar.b |= 4;
        if (ewfuVar != null) {
            ewsdVar.copyOnWrite();
            ewse ewseVar2 = (ewse) ewsdVar.instance;
            ewseVar2.d = ewfuVar;
            ewseVar2.c = 6;
        }
        i(context, ewsdVar, ewqu.SELF_SERVICE_MESSAGE_EVENT);
    }

    public final void h(Context context, ewih ewihVar) {
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        ewihVar.getClass();
        ewseVar.d = ewihVar;
        ewseVar.c = 13;
        i(context, ewsdVar, ewqu.SINGLE_REGISTRATION_API_CALL_EVENT);
    }

    public final void i(Context context, ewsd ewsdVar, ewqu ewquVar) {
        emkm emkmVarK = K(context);
        if (emkmVarK == null) {
            dhja.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        emkmVarK.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarK.instance;
        ewse ewseVar = (ewse) ewsdVar.build();
        emkr emkrVar2 = emkr.a;
        ewseVar.getClass();
        emkrVar.f = ewseVar;
        emkrVar.e = 18;
        M(context, (emkr) emkmVarK.build(), ewquVar);
    }
}
