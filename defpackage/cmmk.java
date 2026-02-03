package defpackage;

import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmk implements cmlb {
    private final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();
    private final Map d = new LinkedHashMap();

    public cmmk() {
        fdvf.a(cmmi.a((cmmg) cmmh.a.createBuilder()).a());
    }

    private final dggn y(cmla cmlaVar) {
        return (dggn) Map.EL.getOrDefault(this.b, cmlaVar, new dggp(""));
    }

    @Override // defpackage.cmlb
    public final cmmb a() {
        cmma cmmaVar = (cmma) cmmb.a.createBuilder();
        cmmaVar.getClass();
        cmmc.b(dggo.a(y(cmla.a)).a, cmmaVar);
        cmmc.e(dggo.a(y(cmla.b)).a, cmmaVar);
        cmmc.c(dggo.a(y(cmla.c)).a, cmmaVar);
        return cmmc.a(cmmaVar);
    }

    @Override // defpackage.cmlb
    public final eiju b() {
        eiju eijuVarE = eijx.e(n());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cmlb
    public final eiju c() {
        eiju eijuVarE = eijx.e(o());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cmlb
    public final eiju d() {
        eiju eijuVarE = eijx.e(p());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cmlb
    public final eiju e(cmla cmlaVar) {
        cmlaVar.getClass();
        eiju eijuVarE = eijx.e(h(cmlaVar));
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cmlb
    public final Optional f() {
        return h(cmla.a);
    }

    @Override // defpackage.cmlb
    public final /* bridge */ /* synthetic */ Optional g(int i, boolean z) {
        dggn dggnVar = (dggn) this.d.get(new dggr(i));
        if (dggnVar != null) {
            return Optional.of(dggnVar);
        }
        Optional optionalI = i(i);
        if (optionalI.isEmpty()) {
            return Optional.empty();
        }
        String str = ((cmmh) optionalI.get()).c;
        str.getClass();
        return Optional.of(new dggp(str));
    }

    @Override // defpackage.cmlb
    public final Optional h(cmla cmlaVar) {
        cmlaVar.getClass();
        dggn dggnVar = (dggn) this.b.get(cmlaVar);
        return Optional.ofNullable(dggnVar != null ? (cmmh) this.a.get(dggnVar) : null);
    }

    @Override // defpackage.cmlb
    public final Optional j(dggn dggnVar) {
        dggnVar.getClass();
        return Optional.ofNullable(this.a.get(dggnVar));
    }

    @Override // defpackage.cmlb
    public final Object k(fcxy fcxyVar) {
        return fcva.av(this.a.values());
    }

    @Override // defpackage.cmlb
    public final Object l(cmla cmlaVar, fcxy fcxyVar) {
        return h(cmlaVar).orElse(null);
    }

    @Override // defpackage.cmlb
    public final Object m(int i, fcxy fcxyVar) {
        return i(i).orElse(null);
    }

    @Override // defpackage.cmlb
    public final Set n() {
        return fcva.av(this.a.keySet());
    }

    @Override // defpackage.cmlb
    public final Set o() {
        return fcva.av(this.a.keySet());
    }

    @Override // defpackage.cmlb
    public final Set p() {
        return fcva.av(this.a.values());
    }

    @Override // defpackage.cmlb
    public final Set q() {
        return fcva.av(this.a.values());
    }

    @Override // defpackage.cmlb
    public final /* bridge */ /* synthetic */ boolean r(int i, int i2) {
        java.util.Map map = this.c;
        Integer num = (Integer) map.get(Integer.valueOf(i));
        if (num != null && num.intValue() == i2) {
            return true;
        }
        Integer num2 = (Integer) map.get(Integer.valueOf(i2));
        return num2 != null && num2.intValue() == i;
    }

    @Override // defpackage.cmlb
    public final /* bridge */ /* synthetic */ boolean s(int i) {
        Set setAv = fcva.av(this.a.values());
        ArrayList arrayList = new ArrayList(fcva.p(setAv, 10));
        Iterator it = setAv.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((cmmh) it.next()).d));
        }
        return arrayList.contains(Integer.valueOf(i));
    }

    @Override // defpackage.cmlb
    public final Object t() {
        return o();
    }

    @Override // defpackage.cmlb
    public final Object u() {
        return fcva.av(this.a.values());
    }

    @Override // defpackage.cmlb
    public final Object v(dggn dggnVar) {
        dggnVar.getClass();
        cmmh cmmhVar = (cmmh) this.a.get(dggnVar);
        return Optional.ofNullable(cmmhVar != null ? cmmhVar.p : null).orElse(null);
    }

    @Override // defpackage.cmlb
    public final Object w(dggn dggnVar) {
        return this.a.get(dggnVar);
    }

    @Override // defpackage.cmlb
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final Optional i(int i) {
        Object next;
        Iterator it = fcva.av(this.a.values()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((cmmh) next).d == i) {
                break;
            }
        }
        return Optional.ofNullable(next);
    }
}
