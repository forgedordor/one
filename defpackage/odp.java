package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class odp implements oaj {
    final /* synthetic */ odu a;
    private final oaj b;

    public odp(odu oduVar, oaj oajVar) {
        this.a = oduVar;
        this.b = oajVar;
    }

    @Override // defpackage.oaj
    public final oal a(obt obtVar, Looper looper, oak oakVar, oai oaiVar) {
        if (obtVar.b()) {
            return new odr(this.a, obtVar.e);
        }
        oaj oajVar = this.b;
        mbo mboVar = obtVar.a;
        oaz oazVar = (oaz) oajVar;
        Context context = oazVar.a;
        if (oeu.f(context, mboVar)) {
            mbl mblVar = mboVar.b;
            mee.f(mblVar);
            if (mblVar.i != -9223372036854775807L) {
                if (oazVar.f == null) {
                    oazVar.f = new odc(context, oazVar.d);
                }
                odc odcVar = (odc) oazVar.f;
                return new odd(odcVar.a, obtVar, oakVar, odcVar.b, oaiVar.b);
            }
        }
        if (oazVar.g == null) {
            oazVar.g = new ock(context, oazVar.b, oazVar.c, oazVar.e);
        }
        oaj oajVar2 = oazVar.g;
        nnn nnnVar = new nnn();
        boolean z = obtVar.d;
        ock ockVar = (ock) oajVar2;
        Context context2 = ockVar.a;
        neb nebVar = new neb(context2, nnnVar);
        nhr nhrVar = new nhr();
        nhrVar.s = true;
        nhrVar.z = false;
        return new ocn(context2, obtVar, nebVar, ockVar.b, oaiVar.a, looper, oakVar, ockVar.c, new ocj(new nhs(nhrVar)), ockVar.d);
    }
}
