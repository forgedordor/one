package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckcn implements cjzq {
    private ckbz a = ckbz.TOGGLE_STATE_UNSPECIFIED;
    private final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();

    public ckcn() {
        new LinkedHashMap();
    }

    @Override // defpackage.cjzq
    public final ckbz a() {
        return this.a;
    }

    @Override // defpackage.cjzq
    public final ckcc b(dggn dggnVar) {
        return (ckcc) Map.EL.getOrDefault(this.b, dggnVar, ckcc.PER_SIM_TOGGLE_STATE_UNSPECIFIED);
    }

    @Override // defpackage.cjzq
    public final cquc c(cqtk cqtkVar) {
        return cquc.d;
    }

    @Override // defpackage.cjzq
    public final ehaw d(lvc lvcVar) {
        lvcVar.getClass();
        return new ckcm();
    }

    @Override // defpackage.cjzq
    public final eiju e(dggn dggnVar) {
        java.util.Map map = this.c;
        map.put(dggnVar, Integer.valueOf(((Number) Map.EL.getOrDefault(map, dggnVar, 0)).intValue() + 1));
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cjzq
    public final eiju f(dggn dggnVar, ckcc ckccVar) {
        ckccVar.getClass();
        m(dggnVar, ckccVar);
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cjzq
    public final eiju g(ckbz ckbzVar) {
        ckbzVar.getClass();
        n(ckbzVar);
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cjzq
    public final eiju h(ckbz ckbzVar) {
        ckbzVar.getClass();
        n(ckbzVar);
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cjzq
    public final Object i(fcxy fcxyVar) {
        return this.a;
    }

    @Override // defpackage.cjzq
    public final Object j(fcxy fcxyVar) {
        return new ckcl(ckbz.TOGGLE_STATE_UNSPECIFIED, fcvo.a);
    }

    @Override // defpackage.cjzq
    public final void k() {
        Collection collectionValues = this.b.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((ckcc) it.next()) == ckcc.PER_SIM_TOGGLE_STATE_ENABLED) {
                    return;
                }
            }
        }
        this.a = ckbz.TOGGLE_STATE_AUTOMATICALLY_DISABLED;
    }

    @Override // defpackage.cjzq
    public final void m(dggn dggnVar, ckcc ckccVar) {
        ckccVar.getClass();
        this.b.put(dggnVar, ckccVar);
    }

    @Override // defpackage.cjzq
    public final void n(ckbz ckbzVar) {
        ckbzVar.getClass();
        this.a = ckbzVar;
    }

    @Override // defpackage.cjzq
    public final boolean o() {
        return this.a.equals(ckbz.TOGGLE_STATE_ENABLED);
    }

    @Override // defpackage.cjzq
    public final void l() {
    }
}
