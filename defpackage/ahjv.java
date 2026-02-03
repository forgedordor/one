package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahjv implements dhoi {
    final /* synthetic */ ahkm a;

    public ahjv(ahkm ahkmVar) {
        this.a = ahkmVar;
    }

    @Override // defpackage.dhoi
    public final dhop a(dhnv dhnvVar) {
        ahkn ahknVar = this.a.a;
        ahjw ahjwVar = (ahjw) ahknVar.kW.b();
        dhwf dhwfVar = (dhwf) ahknVar.kY.b();
        Optional optionalEmpty = Optional.empty();
        dhwfVar.getClass();
        dhwt dhwtVar = new dhwt(dhwfVar, true == ((Boolean) fdct.a(optionalEmpty, false)).booleanValue() ? 2 : 1);
        dhuc dhucVarDy = ahknVar.dy();
        Context context = (Context) ahknVar.t.b();
        context.getClass();
        return new dhop(dhnvVar, ahjwVar, dhwtVar, dhucVarDy, new dhoh(fbdu.a.get().a(context)), ahknVar.gz(), (dhxa) ahknVar.kT.b());
    }
}
