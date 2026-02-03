package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgd implements dwgk {
    private final Context a;
    private final dwje b;
    private final dwqw c;
    private final eypt d;
    private final Map e;

    public dwgd(Context context, dwje dwjeVar, dwqw dwqwVar, eypt eyptVar, Map map) {
        this.a = context;
        this.b = dwjeVar;
        this.c = dwqwVar;
        this.d = eyptVar;
        this.e = map;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        ewwc ewwcVar = (ewwc) ewwd.a.createBuilder();
        ewwcVar.copyOnWrite();
        ewwd ewwdVar = (ewwd) ewwcVar.instance;
        eypt eyptVar = this.d;
        eyptVar.getClass();
        ewwdVar.d = eyptVar;
        ewwdVar.b |= 2;
        ewwcVar.copyOnWrite();
        ewwd ewwdVar2 = (ewwd) ewwcVar.instance;
        ezppVar.getClass();
        ewwdVar2.c = ezppVar;
        ewwdVar2.b |= 1;
        int i = dwei.a;
        eysq eysqVar = eysq.a;
        eyso eysoVarB = (eyso) eysqVar.createBuilder();
        dwqw dwqwVar = this.c;
        char c = 65535;
        int iA = dwqwVar.h().a() - 1;
        if (iA == 1) {
            eyrc eyrcVar = eyrc.TEXT;
            eysoVarB.copyOnWrite();
            ((eysq) eysoVarB.instance).n = eyrcVar.a();
            eytb eytbVar = (eytb) eytc.a.createBuilder();
            String strD = dwqwVar.h().d();
            eytbVar.copyOnWrite();
            ((eytc) eytbVar.instance).b = strD;
            eysoVarB.copyOnWrite();
            eysq eysqVar2 = (eysq) eysoVarB.instance;
            eytc eytcVar = (eytc) eytbVar.build();
            eytcVar.getClass();
            eysqVar2.f = eytcVar;
            eysqVar2.e = 102;
        } else if (iA == 2) {
            Map map = this.e;
            if (map.containsKey(((dwnt) dwqwVar.h().b()).a)) {
                String str = ((dwnt) dwqwVar.h().b()).a;
                int iHashCode = str.hashCode();
                if (iHashCode != -989034367) {
                    if (iHashCode == -843123565 && str.equals("rich_card")) {
                        c = 1;
                    }
                } else if (str.equals("photos")) {
                    c = 0;
                }
                if (c == 0) {
                    eysoVarB = ((dwdz) map.get(((dwnt) dwqwVar.h().b()).a)).a().b(dwqwVar);
                } else if (c != 1) {
                    eysoVarB = (eyso) eysqVar.createBuilder();
                    eyrc eyrcVar2 = eyrc.UNKNOWN;
                    eysoVarB.copyOnWrite();
                    ((eysq) eysoVarB.instance).n = eyrcVar2.a();
                } else {
                    eysoVarB = ((dwdz) map.get(((dwnt) dwqwVar.h().b()).a)).a().b(dwqwVar);
                    eyrc eyrcVar3 = eyrc.RICH_CARD;
                    eysoVarB.copyOnWrite();
                    ((eysq) eysoVarB.instance).n = eyrcVar3.a();
                }
            } else {
                eysoVarB = (eyso) eysqVar.createBuilder();
                eyrc eyrcVar4 = eyrc.UNKNOWN;
                eysoVarB.copyOnWrite();
                ((eysq) eysoVarB.instance).n = eyrcVar4.a();
            }
        } else if (iA != 3) {
            eyrc eyrcVar5 = eyrc.UNKNOWN;
            eysoVarB.copyOnWrite();
            ((eysq) eysoVarB.instance).n = eyrcVar5.a();
        } else {
            eyrc eyrcVar6 = eyrc.RICH_TEXT;
            eysoVarB.copyOnWrite();
            ((eysq) eysoVarB.instance).n = eyrcVar6.a();
            eyuw eyuwVarB = dwey.b(dwqwVar.h().c());
            eysoVarB.copyOnWrite();
            eysq eysqVar3 = (eysq) eysoVarB.instance;
            eyuwVarB.getClass();
            eysqVar3.f = eyuwVarB;
            eysqVar3.e = 106;
        }
        int iA2 = dwqwVar.a();
        eysoVarB.copyOnWrite();
        ((eysq) eysoVarB.instance).s = iA2;
        String strR = dwqwVar.r();
        eysoVarB.copyOnWrite();
        ((eysq) eysoVarB.instance).i = strR;
        eypt eyptVarB = dweg.b(dwqwVar.e());
        eysoVarB.copyOnWrite();
        eysq eysqVar4 = (eysq) eysoVarB.instance;
        eyptVarB.getClass();
        eysqVar4.k = eyptVarB;
        eysqVar4.b |= 1;
        eyph eyphVarB = dwee.b(dwqwVar.f());
        eysoVarB.copyOnWrite();
        eysq eysqVar5 = (eysq) eysoVarB.instance;
        eyphVarB.getClass();
        eysqVar5.l = eyphVarB;
        eysqVar5.b |= 2;
        if (dwqwVar.k().g()) {
            Object objC = dwqwVar.k().c();
            eysoVarB.copyOnWrite();
            ((eysq) eysoVarB.instance).m = (String) objC;
        }
        if (dwqwVar.m().g()) {
            Object objC2 = dwqwVar.m().c();
            eysoVarB.copyOnWrite();
            ((eysq) eysoVarB.instance).p = (String) objC2;
        }
        if (!dwqwVar.o().isEmpty()) {
            ekqg ekqgVarListIterator = dwqwVar.o().keySet().listIterator();
            while (ekqgVarListIterator.hasNext()) {
                String str2 = (String) ekqgVarListIterator.next();
                try {
                    evqe evqeVar = (evqe) evsn.parseFrom(evqe.a, (evqs) dwqwVar.o().get(str2), evrr.a());
                    str2.getClass();
                    evqeVar.getClass();
                    eysoVarB.copyOnWrite();
                    eysq eysqVar6 = (eysq) eysoVarB.instance;
                    evub evubVar = eysqVar6.o;
                    if (!evubVar.b) {
                        eysqVar6.o = evubVar.a();
                    }
                    eysqVar6.o.put(str2, evqeVar);
                } catch (evtj e) {
                    dvhv.d("MsgProtoConverter", "Error parsing metadata map", e);
                }
            }
        }
        dwqwVar.l();
        evqs evqsVarQ = dwqwVar.q();
        eysoVarB.copyOnWrite();
        ((eysq) eysoVarB.instance).v = evqsVarQ;
        eysq eysqVar7 = (eysq) eysoVarB.build();
        ewwcVar.copyOnWrite();
        ewwd ewwdVar3 = (ewwd) ewwcVar.instance;
        eysqVar7.getClass();
        ewwdVar3.e = eysqVar7;
        ewwdVar3.b |= 4;
        eyqm eyqmVar = (eyqm) eyqn.a.createBuilder();
        String strA = dvhu.a(this.a);
        eyqmVar.copyOnWrite();
        eyqn eyqnVar = (eyqn) eyqmVar.instance;
        strA.getClass();
        eyqnVar.b = strA;
        eyqn eyqnVar2 = (eyqn) eyqmVar.build();
        ewwcVar.copyOnWrite();
        ewwd ewwdVar4 = (ewwd) ewwcVar.instance;
        eyqnVar2.getClass();
        ewwdVar4.f = eyqnVar2;
        ewwdVar4.b |= 8;
        return eork.i((ewwd) ewwcVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ewwd ewwdVar = (ewwd) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwgc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((eyro) obj2).b(ewwdVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* synthetic */ Object c(Object obj) {
        return new dvqm(ejwi.j(Long.valueOf(((ewwf) obj).b)));
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.b;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwqw dwqwVar = this.c;
        dwhpVarR.p(dwqwVar.r());
        dwhpVarR.d(dwqwVar.f());
        dwhpVarR.j(12);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR.f(i);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.b;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwqw dwqwVar = this.c;
        dwhpVarR.p(dwqwVar.r());
        dwhpVarR.d(dwqwVar.f());
        dwhpVarR.j(12);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
