package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cams b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public camh(fcxy fcxyVar, cams camsVar) {
        super(2, fcxyVar);
        this.b = camsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((camh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [cmfo, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarK = this.b.c.k();
            this.a = 1;
            obj = fdxs.c(eijuVarK, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final String str = ((aumq) obj).j;
        str.getClass();
        cams camsVar = this.b;
        ecem.b();
        final AtomicReference atomicReference = new AtomicReference("");
        camsVar.c.e.get().m(new ejvr() { // from class: aumv
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj2).toBuilder();
                String str2 = ((aumq) builder.instance).O;
                atomicReference.set(str2);
                String str3 = str;
                if (!Objects.equals(str2, str3)) {
                    builder.copyOnWrite();
                    aumq aumqVar = (aumq) builder.instance;
                    aumqVar.c |= 512;
                    aumqVar.O = str3;
                }
                return builder.build();
            }
        });
        if (!fdbq.f(str, (String) atomicReference.get())) {
            return null;
        }
        cams.b.k().t("Duplicate session id=%s detected, silently aborting.", str);
        emcw emcwVar = (emcw) emcx.a.createBuilder();
        emec emecVar = emec.RESTORE;
        emcwVar.copyOnWrite();
        emcx emcxVar = (emcx) emcwVar.instance;
        emcxVar.c = emecVar.s;
        emcxVar.b |= 1;
        emcwVar.copyOnWrite();
        emcx emcxVar2 = (emcx) emcwVar.instance;
        emcxVar2.d = 3;
        emcxVar2.b |= 2;
        emcn emcnVar = emcn.STARTED_SIMULTANEOUS_RESTORES;
        emcwVar.copyOnWrite();
        emcx emcxVar3 = (emcx) emcwVar.instance;
        emcxVar3.e = emcnVar.bs;
        emcxVar3.b |= 4;
        aukz aukzVar = camsVar.e;
        emcwVar.a(aukzVar.b());
        aukzVar.m((emcx) emcwVar.build());
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        camh camhVar = new camh(fcxyVar, this.b);
        camhVar.c = obj;
        return camhVar;
    }
}
