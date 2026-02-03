package defpackage;

import com.sun.jna.Pointer;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyn implements eqai {
    final /* synthetic */ ccos a;

    public epyn(ccos ccosVar) {
        this.a = ccosVar;
    }

    @Override // defpackage.eqai
    public eqbn invoke(Pointer pointer) {
        ccos ccosVar = this.a;
        Instant instantA = ((eoth) ((arnl) ccosVar.b).a.b()).a("bugle.use_synchronous_zinnia_time_accessor") ? ccosVar.a.a() : (Instant) fdim.a(fcyi.a, new ccor(ccosVar, null));
        eqbm eqbmVar = eqbl.a;
        return eqbk.b(instantA.toEpochMilli()).b;
    }
}
