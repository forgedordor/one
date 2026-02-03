package defpackage;

import com.google.communication.synapse.security.scytale.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwmf extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwmd b;
    final /* synthetic */ bwmg c;
    final /* synthetic */ Scope d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwmf(bwmd bwmdVar, bwmg bwmgVar, Scope scope, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bwmdVar;
        this.c = bwmgVar;
        this.d = scope;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwmf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.e;
            evtg<bwmc> evtgVar = this.b.b;
            evtgVar.getClass();
            bwmg bwmgVar = this.c;
            Scope scope = this.d;
            ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
            for (bwmc bwmcVar : evtgVar) {
                fcyi fcyiVar = fcyi.a;
                arrayList.add(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new bwme(null, bwmcVar, bwmgVar, scope)));
            }
            this.a = 1;
            if (fdii.a(arrayList, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwmf bwmfVar = new bwmf(this.b, this.c, this.d, fcxyVar);
        bwmfVar.e = obj;
        return bwmfVar;
    }
}
