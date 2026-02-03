package defpackage;

import android.os.Bundle;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsod extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsof b;
    final /* synthetic */ Bundle c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsod(dsof dsofVar, Bundle bundle, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsofVar;
        this.c = bundle;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsod) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String string;
        String str;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fctl.b(obj);
            return obj;
        }
        fctl.b(obj);
        eksp ekspVar = dsof.a;
        ekspVar.o().q("Executing GnpInAppSyncJob");
        dsof dsofVar = this.b;
        if (!((Boolean) dsofVar.c.b()).booleanValue()) {
            ekspVar.o().q("GnpInAppSyncJob will not run as GrowthKit is disabled");
            return new dxfx(fctx.a);
        }
        try {
            dedi.a(dsofVar.b);
            string = this.c.getString("GNP_ACCOUNT_TO_SYNC");
        } catch (dcen e) {
            dsof dsofVar2 = this.b;
            this.a = 2;
            Object objI = dsofVar2.i(e, this);
            if (objI != fcylVar) {
                return objI;
            }
        } catch (dceo e2) {
            dsof dsofVar3 = this.b;
            this.a = 1;
            Object objI2 = dsofVar3.i(e2, this);
            if (objI2 != fcylVar) {
                return objI2;
            }
        }
        if (string == null) {
            return new dxfp(new IllegalStateException("GNP_ACCOUNT_TO_SYNC is missing or null"), 4);
        }
        dxww dxwwVar = (dxww) evsn.parseFrom(dxww.a, Base64.decode(string, 10));
        dxwwVar.getClass();
        dxvi dxviVarA = dxwx.a(dxwwVar);
        if (dxviVarA instanceof dxvp) {
            str = ((dxvp) dxviVarA).a;
        } else {
            if (!(dxviVarA instanceof dxwh)) {
                return new dxfp(new IllegalStateException("Only Gaia and Zwieback accounts are supported for in-app sync"), 16);
            }
            str = null;
        }
        dsof.a.o().q("GnpInAppSyncJob triggering an account sync");
        dsof dsofVar4 = this.b;
        evje evjeVar = evje.GROWTHKIT_SYNC_INSTRUCTION;
        this.a = 3;
        dsoa dsoaVar = (dsoa) dsofVar4.d;
        Object objA = fdin.a(dsoaVar.k, new dsnu(evjeVar, dsoaVar, str, null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsod(this.b, this.c, fcxyVar);
    }
}
