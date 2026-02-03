package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfje implements cfmz {
    private final alrj a;
    private final cisv b;
    private final eosc c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public cfje(alrj alrjVar, cisv cisvVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = alrjVar;
        this.b = cisvVar;
        this.c = eoscVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        alqm alqmVarN;
        Optional optionalEmpty;
        eovj eovjVar = (eovj) evuhVar;
        if ((eovjVar.b & 1) != 0) {
            alrj alrjVar = this.a;
            eowf eowfVar = eovjVar.e;
            if (eowfVar == null) {
                eowfVar = eowf.a;
            }
            alqmVarN = alrjVar.n(eowfVar.c);
        } else {
            alqmVarN = eovjVar.d.size() > 0 ? this.a.n(((eowf) eovjVar.d.get(0)).c) : null;
        }
        if (alqmVarN == null) {
            eovl eovlVar = (eovl) eovm.a.createBuilder();
            eovlVar.copyOnWrite();
            ((eovm) eovlVar.instance).b = eovk.a(4);
            return eijx.e((eovm) eovlVar.build());
        }
        auib auibVarB = ((ardw) this.g.b()).a() ? ((cifw) this.f.b()).b() : auib.a;
        cist cistVar = (cist) cisu.a.createBuilder();
        String str = eovjVar.c;
        cistVar.copyOnWrite();
        cisu cisuVar = (cisu) cistVar.instance;
        str.getClass();
        cisuVar.c = str;
        alwl alwlVarC = alre.c(alqmVarN);
        cistVar.copyOnWrite();
        cisu cisuVar2 = (cisu) cistVar.instance;
        alwlVarC.getClass();
        cisuVar2.a();
        cisuVar2.d.add(alwlVarC);
        cistVar.copyOnWrite();
        cisu cisuVar3 = (cisu) cistVar.instance;
        auibVarB.getClass();
        cisuVar3.f = auibVarB;
        cisuVar3.b |= 2;
        Optional.empty();
        cqle cqleVar = (cqle) this.e.b();
        epes epesVar = eovjVar.f;
        if (epesVar == null) {
            epesVar = epes.a;
        }
        Optional optionalA = cqleVar.a(epesVar);
        if (optionalA.isPresent()) {
            try {
                optionalEmpty = Optional.of(((chtk) this.d.b()).b(((Integer) optionalA.get()).intValue()));
            } catch (chsq unused) {
                optionalEmpty = Optional.empty();
            }
            if (optionalEmpty.isEmpty()) {
                if (((ardw) this.g.b()).a()) {
                    ((cifw) this.f.b()).n(auibVarB, 20);
                }
                eovl eovlVar2 = (eovl) eovm.a.createBuilder();
                eovlVar2.copyOnWrite();
                ((eovm) eovlVar2.instance).b = eovk.a(4);
                return eijx.e((eovm) eovlVar2.build());
            }
            Object obj = optionalEmpty.get();
            cistVar.copyOnWrite();
            cisu cisuVar4 = (cisu) cistVar.instance;
            cisuVar4.e = (aubq) obj;
            cisuVar4.b |= 1;
        }
        eiju eijuVarB = ((cazj) this.b.a.b()).b(cbcu.f("add_members_to_rcs_conversation", (cisu) cistVar.build()));
        eooz eoozVar = new eooz() { // from class: cfjc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((cazi) obj2).a();
            }
        };
        eosc eoscVar = this.c;
        return eijuVarB.i(eoozVar, eoscVar).h(new ejvr() { // from class: cfjd
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                eovl eovlVar3 = (eovl) eovm.a.createBuilder();
                int i = true != ((cbcw) obj2).e() ? 4 : 3;
                eovlVar3.copyOnWrite();
                ((eovm) eovlVar3.instance).b = eovk.a(i);
                return (eovm) eovlVar3.build();
            }
        }, eoscVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        return (eovj) evsn.parseFrom(eovj.a, evqsVar, evrr.a());
    }
}
