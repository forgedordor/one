package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvz implements dxvv {
    private final ekmj a;
    private final Map b = null;

    public dxvz(ekmj ekmjVar) {
        this.a = ekmjVar;
    }

    @Override // defpackage.dxvv
    public final /* synthetic */ Map a() {
        return dxvu.a(this);
    }

    @Override // defpackage.dxvv
    public final void b(ekgi ekgiVar) {
        ekmj ekmjVar = this.a;
        if (ekmjVar.A()) {
            return;
        }
        for (Object obj : ekmjVar.x()) {
            obj.getClass();
            String str = (String) obj;
            ekgiVar.i(new dxvp(str), new dxvg(fcva.av(((ekbx) ekmjVar).c(str))));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxvz)) {
            return false;
        }
        dxvz dxvzVar = (dxvz) obj;
        if (!fdbq.f(this.a, dxvzVar.a)) {
            return false;
        }
        Map map = dxvzVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "GnpSignedInRegistrationData(gaiaAccounts=" + this.a + ", delegatedGaiaAccounts=null)";
    }
}
