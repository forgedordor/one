package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsyx implements dsui {
    public final dsyb a;
    public final dsuq b;
    private final dszp c;

    public dsyx(dsyb dsybVar, dsuq dsuqVar, dszp dszpVar) {
        this.a = dsybVar;
        this.b = dsuqVar;
        this.c = dszpVar;
    }

    @Override // defpackage.dsui
    public final ListenableFuture a(final dsuk dsukVar) {
        String strG;
        ejwi ejwiVarJ;
        final dsxz dsxzVar = (dsxz) dsukVar.a;
        dsvq dsvqVarA = dsxv.a(dsxzVar);
        evsl evslVar = dsza.a;
        evsl evslVarCheckIsLite = evsn.checkIsLite(evslVar);
        dsvqVarA.d(evslVarCheckIsLite);
        if (dsvqVarA.r.o(evslVarCheckIsLite.d)) {
            dsvq dsvqVarA2 = dsxv.a(dsxzVar);
            evsl evslVarCheckIsLite2 = evsn.checkIsLite(evslVar);
            dsvqVarA2.d(evslVarCheckIsLite2);
            Object objL = dsvqVarA2.r.l(evslVarCheckIsLite2.d);
            strG = ((dsyz) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL))).b;
        } else {
            strG = this.a.g(dsxzVar);
        }
        if (strG.isEmpty()) {
            return eork.i(null);
        }
        dsyb dsybVar = this.a;
        final dbyw dbywVar = (dbyw) dsybVar.c(dsxzVar).f();
        ListenableFuture listenableFuture = dsukVar.b;
        final ListenableFuture listenableFutureD = dsybVar.d(dsxzVar, listenableFuture);
        final ListenableFuture listenableFutureH = dsybVar.h();
        final ListenableFuture listenableFutureE = dsybVar.e(dsxzVar, listenableFuture);
        dszp dszpVar = this.c;
        final dsvj dsvjVar = dsxzVar.c.a;
        final ListenableFuture listenableFutureI = eork.i(null);
        final ArrayList arrayList = new ArrayList();
        dszpVar.a.a(dsvjVar, dsvjVar.d, null, arrayList);
        final ArrayList arrayList2 = new ArrayList();
        dszpVar.b.a(dsvjVar, dsvjVar.d, null, arrayList2);
        eorg eorgVarC = eork.c(ekeh.b(arrayList, arrayList2));
        Callable callable = new Callable() { // from class: dszo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                emkx emkxVar = (emkx) emky.a.createBuilder();
                emkxVar.copyOnWrite();
                emky emkyVar = (emky) emkxVar.instance;
                dsxz dsxzVar2 = dsxzVar;
                eohz eohzVar = dsxzVar2.a;
                eohzVar.getClass();
                emkyVar.c = eohzVar;
                emkyVar.b |= 1;
                if (!dsxzVar2.e) {
                    eohz eohzVarA = dsyr.a(dsxzVar2, true);
                    ejwl.m(eohzVarA != null, "No Parent Event");
                    emkxVar.copyOnWrite();
                    emky emkyVar2 = (emky) emkxVar.instance;
                    eohzVarA.getClass();
                    emkyVar2.e = eohzVarA;
                    emkyVar2.b |= 2;
                }
                dsvq dsvqVarA3 = dsxv.a(dsxzVar2);
                evsl evslVarCheckIsLite3 = evsn.checkIsLite(dszw.a);
                dsvqVarA3.d(evslVarCheckIsLite3);
                if (dsvqVarA3.r.o(evslVarCheckIsLite3.d)) {
                    emkz emkzVar = (emkz) emla.a.createBuilder();
                    eohx eohxVar = dsvqVarA3.d;
                    if (eohxVar == null) {
                        eohxVar = eohx.a;
                    }
                    eohz eohzVar2 = eohxVar.e;
                    if (eohzVar2 == null) {
                        eohzVar2 = eohz.a;
                    }
                    emkzVar.copyOnWrite();
                    emla emlaVar = (emla) emkzVar.instance;
                    eohzVar2.getClass();
                    emlaVar.c = eohzVar2;
                    emlaVar.b |= 1;
                    emkxVar.copyOnWrite();
                    emky emkyVar3 = (emky) emkxVar.instance;
                    emla emlaVar2 = (emla) emkzVar.build();
                    emlaVar2.getClass();
                    emkyVar3.h = emlaVar2;
                    emkyVar3.b |= 128;
                }
                eohx eohxVar2 = dsxv.b(dsxzVar2).d;
                if (eohxVar2 == null) {
                    eohxVar2 = eohx.a;
                }
                dsvj dsvjVar2 = dsvjVar;
                emmu emmuVar = (emmu) emmv.a.createBuilder();
                emmuVar.copyOnWrite();
                emmv emmvVar = (emmv) emmuVar.instance;
                eohxVar2.getClass();
                emmvVar.c = eohxVar2;
                emmvVar.b |= 1;
                int iA = eolh.a(dsvjVar2.c);
                if (iA == 0) {
                    iA = 1;
                }
                emmuVar.copyOnWrite();
                emmv emmvVar2 = (emmv) emmuVar.instance;
                emmvVar2.b |= 16;
                emmvVar2.e = iA - 1;
                int iA2 = eolh.a(dsvjVar2.c);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                emmuVar.copyOnWrite();
                emmv emmvVar3 = (emmv) emmuVar.instance;
                emmvVar3.b |= 16;
                emmvVar3.e = iA2 - 1;
                Iterator<E> it = dsvjVar2.d.iterator();
                while (it.hasNext()) {
                    switch (((Integer) it.next()).intValue()) {
                        case 100000001:
                            evsl evslVarCheckIsLite4 = evsn.checkIsLite(dsxq.b);
                            dsvjVar2.d(evslVarCheckIsLite4);
                            Object objL2 = dsvjVar2.r.l(evslVarCheckIsLite4.d);
                            int iA3 = eolf.a(((dsxs) (objL2 == null ? evslVarCheckIsLite4.b : evslVarCheckIsLite4.c(objL2))).c);
                            if (iA3 == 0) {
                                iA3 = 1;
                            }
                            emmuVar.copyOnWrite();
                            emmv emmvVar4 = (emmv) emmuVar.instance;
                            emmvVar4.b |= 32;
                            emmvVar4.f = iA3 - 1;
                            break;
                        case 100000002:
                            evsl evslVarCheckIsLite5 = evsn.checkIsLite(dsxq.c);
                            dsvjVar2.d(evslVarCheckIsLite5);
                            Object objL3 = dsvjVar2.r.l(evslVarCheckIsLite5.d);
                            int iA4 = eolc.a(((eold) (objL3 == null ? evslVarCheckIsLite5.b : evslVarCheckIsLite5.c(objL3))).b);
                            if (iA4 == 0) {
                                iA4 = 1;
                            }
                            emmuVar.copyOnWrite();
                            emmv emmvVar5 = (emmv) emmuVar.instance;
                            emmvVar5.b |= 64;
                            emmvVar5.g = iA4 - 1;
                            break;
                        case 100000003:
                            evsl evslVarCheckIsLite6 = evsn.checkIsLite(dszs.b);
                            dsvjVar2.d(evslVarCheckIsLite6);
                            Object objL4 = dsvjVar2.r.l(evslVarCheckIsLite6.d);
                            int i = ((dsyv) (objL4 == null ? evslVarCheckIsLite6.b : evslVarCheckIsLite6.c(objL4))).b;
                            emmuVar.copyOnWrite();
                            emmv emmvVar6 = (emmv) emmuVar.instance;
                            emmvVar6.b |= 128;
                            emmvVar6.h = i;
                            break;
                    }
                }
                emkv emkvVar = (emkv) emkw.a.createBuilder();
                long j = dsxzVar2.d;
                if (j != -1) {
                    evsl evslVar2 = emli.b;
                    emle emleVar = (emle) emlf.a.createBuilder();
                    emlg emlgVar = (emlg) emlh.a.createBuilder();
                    emlgVar.copyOnWrite();
                    emlh emlhVar = (emlh) emlgVar.instance;
                    emlhVar.b |= 1;
                    emlhVar.c = j;
                    emlh emlhVar2 = (emlh) emlgVar.build();
                    emleVar.copyOnWrite();
                    emlf emlfVar = (emlf) emleVar.instance;
                    emlhVar2.getClass();
                    emlfVar.c = emlhVar2;
                    emlfVar.b = 1 | emlfVar.b;
                    emkvVar.e(evslVar2, (emlf) emleVar.build());
                }
                List list = arrayList;
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((dsyg) eork.q((ListenableFuture) it2.next())).a(emkvVar);
                    }
                }
                List list2 = arrayList2;
                emmuVar.copyOnWrite();
                emmv emmvVar7 = (emmv) emmuVar.instance;
                emkw emkwVar = (emkw) emkvVar.build();
                emkwVar.getClass();
                emmvVar7.j = emkwVar;
                emmvVar7.b |= 16384;
                if (!list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((dsyg) eork.q((ListenableFuture) it3.next())).a(emmuVar);
                    }
                }
                emmw[] emmwVarArr = (emmw[]) eork.q(listenableFutureI);
                if (emmwVarArr != null) {
                    for (emmw emmwVar : emmwVarArr) {
                        emmuVar.copyOnWrite();
                        emmv emmvVar8 = (emmv) emmuVar.instance;
                        emmz emmzVar = (emmz) emmwVar.build();
                        emmzVar.getClass();
                        evtg evtgVar = emmvVar8.i;
                        if (!evtgVar.c()) {
                            emmvVar8.i = evsn.mutableCopy(evtgVar);
                        }
                        emmvVar8.i.add(emmzVar);
                    }
                }
                emmv emmvVar9 = (emmv) emmuVar.build();
                emkxVar.copyOnWrite();
                emky emkyVar4 = (emky) emkxVar.instance;
                emmvVar9.getClass();
                emkyVar4.f = emmvVar9;
                emkyVar4.b |= 16;
                return (emky) emkxVar.build();
            }
        };
        eoqg eoqgVar = eoqg.a;
        final ListenableFuture listenableFutureA = eorgVarC.a(callable, eoqgVar);
        dsvq dsvqVarB = dsxzVar.e ? dsxv.b(dsxzVar) : dsxv.a(dsxzVar);
        evsl evslVar2 = dsyn.a;
        evsl evslVarCheckIsLite3 = evsn.checkIsLite(evslVar2);
        dsvqVarB.d(evslVarCheckIsLite3);
        if (dsvqVarB.r.o(evslVarCheckIsLite3.d)) {
            evsl evslVarCheckIsLite4 = evsn.checkIsLite(evslVar2);
            dsvqVarB.d(evslVarCheckIsLite4);
            Object objL2 = dsvqVarB.r.l(evslVarCheckIsLite4.d);
            ejwiVarJ = ejwi.j(Integer.valueOf(((dsym) (objL2 == null ? evslVarCheckIsLite4.b : evslVarCheckIsLite4.c(objL2))).b));
        } else {
            dsybVar.a(dsxzVar);
            ejwiVarJ = ejud.a;
        }
        final ejwi ejwiVar = ejwiVarJ;
        final String str = strG;
        return eork.d(listenableFutureD, listenableFutureA, listenableFutureH, listenableFutureE).b(eiid.c(new eooy() { // from class: dsyw
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dsuo dsuoVarL = dsup.l();
                dsuoVarL.b(str);
                dsum dsumVar = (dsum) dsuoVarL;
                dsumVar.e = dbywVar;
                dsuoVarL.c((evuh) eork.q(listenableFutureD));
                dsumVar.a = (emky) eork.q(listenableFutureA);
                dsumVar.b = (Integer) ejwiVar.f();
                dsumVar.c = (int[]) eork.q(listenableFutureH);
                dsyx dsyxVar = this.a;
                dsyb dsybVar2 = dsyxVar.a;
                dsxz dsxzVar2 = dsxzVar;
                dsuoVarL.d(dsybVar2.f(dsxzVar2));
                dsybVar2.b(dsxzVar2);
                int[] iArr = (int[]) eork.q(listenableFutureE);
                dsvq dsvqVarB2 = dsxv.b(dsxzVar2);
                evsl evslVar3 = dtax.a;
                evsl evslVarCheckIsLite5 = evsn.checkIsLite(evslVar3);
                dsvqVarB2.d(evslVarCheckIsLite5);
                if (dsvqVarB2.r.o(evslVarCheckIsLite5.d) || iArr != null) {
                    dsvq dsvqVarB3 = dsxv.b(dsxzVar2);
                    evsl evslVarCheckIsLite6 = evsn.checkIsLite(evslVar3);
                    dsvqVarB3.d(evslVarCheckIsLite6);
                    Object objL3 = dsvqVarB3.r.l(evslVarCheckIsLite6.d);
                    HashSet hashSet = new HashSet(((dtaw) (objL3 == null ? evslVarCheckIsLite6.b : evslVarCheckIsLite6.c(objL3))).b);
                    if (iArr != null) {
                        hashSet.addAll(eonc.h(iArr));
                    }
                    dsumVar.d = eonc.j(hashSet);
                }
                return dsyxVar.b.a(dsuoVarL.e(), dsukVar.b);
            }
        }), eoqgVar);
    }

    @Override // defpackage.dsui
    public final Set b() {
        return new ekph(dsxz.class);
    }
}
