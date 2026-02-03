package defpackage;

import android.util.SparseIntArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsyq implements dsui {
    public final dsyb a;
    public final dsuq b;
    private final dszn c;

    public dsyq(dsyb dsybVar, dsuq dsuqVar, dszn dsznVar) {
        this.a = dsybVar;
        this.b = dsuqVar;
        this.c = dsznVar;
    }

    @Override // defpackage.dsui
    public final ListenableFuture a(final dsuk dsukVar) {
        String strG;
        ejwi ejwiVarJ;
        ListenableFuture listenableFutureB;
        eieu eieuVarK = eiiy.k("GIL:NVLGraftHandler");
        try {
            final dsxy dsxyVar = (dsxy) dsukVar.a;
            dsvq dsvqVarA = dsxv.a(dsxyVar);
            evsl evslVar = dsza.a;
            evsl evslVarCheckIsLite = evsn.checkIsLite(evslVar);
            dsvqVarA.d(evslVarCheckIsLite);
            if (dsvqVarA.r.o(evslVarCheckIsLite.d)) {
                dsvq dsvqVarA2 = dsxv.a(dsxyVar);
                evsl evslVarCheckIsLite2 = evsn.checkIsLite(evslVar);
                dsvqVarA2.d(evslVarCheckIsLite2);
                Object objL = dsvqVarA2.r.l(evslVarCheckIsLite2.d);
                strG = ((dsyz) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL))).b;
            } else {
                strG = this.a.g(dsxyVar);
            }
            String str = strG;
            if (str.isEmpty()) {
                listenableFutureB = eork.i(null);
            } else {
                dsyb dsybVar = this.a;
                dbyw dbywVar = (dbyw) dsybVar.c(dsxyVar).f();
                HashSet hashSet = new HashSet();
                List<dsvq> list = dsxyVar.c;
                for (dsvq dsvqVar : list) {
                    evsl evslVar2 = dtax.a;
                    evsl evslVarCheckIsLite3 = evsn.checkIsLite(evslVar2);
                    dsvqVar.d(evslVarCheckIsLite3);
                    if (dsvqVar.r.o(evslVarCheckIsLite3.d)) {
                        evsl evslVarCheckIsLite4 = evsn.checkIsLite(evslVar2);
                        dsvqVar.d(evslVarCheckIsLite4);
                        Object objL2 = dsvqVar.r.l(evslVarCheckIsLite4.d);
                        hashSet.addAll(((dtaw) (objL2 == null ? evslVarCheckIsLite4.b : evslVarCheckIsLite4.c(objL2))).b);
                    }
                }
                ListenableFuture listenableFuture = dsukVar.b;
                final ListenableFuture listenableFutureD = dsybVar.d(dsxyVar, listenableFuture);
                final ListenableFuture listenableFutureH = dsybVar.h();
                final ListenableFuture listenableFutureE = dsybVar.e(dsxyVar, listenableFuture);
                dsvq dsvqVarA3 = dsxv.a(dsxyVar);
                evsl evslVar3 = dsyn.a;
                evsl evslVarCheckIsLite5 = evsn.checkIsLite(evslVar3);
                dsvqVarA3.d(evslVarCheckIsLite5);
                if (dsvqVarA3.r.o(evslVarCheckIsLite5.d)) {
                    dsvq dsvqVarA4 = dsxv.a(dsxyVar);
                    evsl evslVarCheckIsLite6 = evsn.checkIsLite(evslVar3);
                    dsvqVarA4.d(evslVarCheckIsLite6);
                    Object objL3 = dsvqVarA4.r.l(evslVarCheckIsLite6.d);
                    ejwiVarJ = ejwi.j(Integer.valueOf(((dsym) (objL3 == null ? evslVarCheckIsLite6.b : evslVarCheckIsLite6.c(objL3))).b));
                } else {
                    dsybVar.a(dsxyVar);
                    ejwiVarJ = ejud.a;
                }
                final ejwi ejwiVar = ejwiVarJ;
                dsyi dsyiVar = this.c.a;
                int size = list.size();
                final emmw[] emmwVarArr = new emmw[size];
                final ArrayList arrayList = new ArrayList();
                int i = size - 1;
                while (i >= 0) {
                    dsvq dsvqVar2 = (dsvq) list.get(i);
                    List list2 = list;
                    emmw emmwVar = (emmw) emmz.a.createBuilder();
                    HashSet hashSet2 = hashSet;
                    eohx eohxVar = dsvqVar2.d;
                    if (eohxVar == null) {
                        eohxVar = eohx.a;
                    }
                    int i2 = eohxVar.d;
                    emmwVar.copyOnWrite();
                    String str2 = str;
                    emmz emmzVar = (emmz) emmwVar.instance;
                    dbyw dbywVar2 = dbywVar;
                    emmzVar.b |= 1;
                    emmzVar.c = i2;
                    emmwVarArr[i] = emmwVar;
                    int i3 = dsvqVar2.e;
                    int iB = emmy.b(i3);
                    if (iB != 0 && iB != 1) {
                        int iB2 = emmy.b(i3);
                        int i4 = iB2 == 0 ? 1 : iB2;
                        emmwVar.copyOnWrite();
                        emmz emmzVar2 = (emmz) emmwVar.instance;
                        emmzVar2.i = i4 - 1;
                        emmzVar2.b |= 32;
                    }
                    if (dsvqVar2.c.size() > 0) {
                        dsyiVar.a(dsvqVar2, dsvqVar2.c, emmwVarArr[i], arrayList);
                    }
                    i--;
                    hashSet = hashSet2;
                    list = list2;
                    str = str2;
                    dbywVar = dbywVar2;
                }
                final HashSet hashSet3 = hashSet;
                final String str3 = str;
                final dbyw dbywVar3 = dbywVar;
                final ListenableFuture listenableFutureI = arrayList.isEmpty() ? eork.i(emmwVarArr) : eork.c(arrayList).a(new Callable() { // from class: dszr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((dsyg) eork.q((ListenableFuture) it.next())).a(null);
                        }
                        return emmwVarArr;
                    }
                }, eoqg.a);
                final SparseIntArray sparseIntArray = dsxyVar.d;
                eorg eorgVarD = eork.d(listenableFutureI);
                Callable callable = new Callable() { // from class: dszm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        emmw[] emmwVarArr2 = (emmw[]) eork.q(listenableFutureI);
                        int length = emmwVarArr2.length;
                        for (int i5 = 0; i5 < length; i5++) {
                            int iValueAt = sparseIntArray.valueAt(i5);
                            if (iValueAt != -1) {
                                emmw emmwVar2 = emmwVarArr2[iValueAt];
                                emmwVar2.copyOnWrite();
                                emmz emmzVar3 = (emmz) emmwVar2.instance;
                                emmz emmzVar4 = emmz.a;
                                evsx evsxVar = emmzVar3.e;
                                if (!evsxVar.c()) {
                                    emmzVar3.e = evsn.mutableCopy(evsxVar);
                                }
                                emmzVar3.e.h(i5);
                            }
                        }
                        return emmwVarArr2;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                final ListenableFuture listenableFutureA = eorgVarD.a(callable, eoqgVar);
                final ListenableFuture listenableFutureI2 = eork.i(new HashMap());
                final ListenableFuture listenableFutureA2 = eork.d(listenableFutureA, listenableFutureI2).a(new Callable() { // from class: dszl
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        emmw[] emmwVarArr2;
                        int i5;
                        int i6;
                        int i7;
                        int i8;
                        emmw[] emmwVarArr3 = (emmw[]) eork.q(listenableFutureA);
                        Map map = (Map) eork.q(listenableFutureI2);
                        emkx emkxVar = (emkx) emky.a.createBuilder();
                        dsxy dsxyVar2 = dsxyVar;
                        eohz eohzVar = dsxyVar2.a;
                        emkxVar.copyOnWrite();
                        emky emkyVar = (emky) emkxVar.instance;
                        eohzVar.getClass();
                        emkyVar.c = eohzVar;
                        boolean z = true;
                        emkyVar.b |= 1;
                        emlr emlrVar = (emlr) emls.a.createBuilder();
                        List<dsxx> list3 = dsxyVar2.b;
                        for (dsxx dsxxVar : list3) {
                            int i9 = dsxxVar.b - 1;
                            if (i9 != 0) {
                                eohz eohzVarA = dsyr.a(dsxxVar, z);
                                eohzVarA.getClass();
                                dsyo.b(eohzVarA, dsxxVar, dsxyVar2, emkxVar);
                                dsvq dsvqVarB = dsxv.b(dsxxVar);
                                emlt emltVar = (emlt) emlu.a.createBuilder();
                                eohx eohxVar2 = dsvqVarB.d;
                                if (eohxVar2 == null) {
                                    eohxVar2 = eohx.a;
                                }
                                emltVar.copyOnWrite();
                                emlu emluVar = (emlu) emltVar.instance;
                                eohxVar2.getClass();
                                emluVar.e = eohxVar2;
                                emluVar.d = 2;
                                if ((eohzVarA.b & 2) != 0) {
                                    emltVar.copyOnWrite();
                                    emlu emluVar2 = (emlu) emltVar.instance;
                                    emluVar2.c = eohzVarA;
                                    emluVar2.b = 3;
                                    i8 = 1;
                                } else {
                                    eoib eoibVar = eohzVarA.c;
                                    if (eoibVar == null) {
                                        eoibVar = eoib.a;
                                    }
                                    emltVar.copyOnWrite();
                                    emlu emluVar3 = (emlu) emltVar.instance;
                                    eoibVar.getClass();
                                    emluVar3.c = eoibVar;
                                    i8 = 1;
                                    emluVar3.b = 1;
                                }
                                emlo emloVar = (emlo) emlq.a.createBuilder();
                                int i10 = i9 != 0 ? i9 != i8 ? 3 : 2 : 4;
                                emloVar.copyOnWrite();
                                emlq emlqVar = (emlq) emloVar.instance;
                                emlqVar.d = i10 - 1;
                                emlqVar.b |= 2;
                                emlu emluVar4 = (emlu) emltVar.build();
                                emloVar.copyOnWrite();
                                emlq emlqVar2 = (emlq) emloVar.instance;
                                emluVar4.getClass();
                                emlqVar2.c = emluVar4;
                                emlqVar2.b |= 1;
                                if ((dsvqVarB.b & 4) != 0) {
                                    long j = dsvqVarB.f;
                                    emloVar.copyOnWrite();
                                    emlq emlqVar3 = (emlq) emloVar.instance;
                                    emlqVar3.b |= 16;
                                    emlqVar3.f = j;
                                }
                                dsyo.c(emloVar, (emmw[]) map.get(dsxxVar));
                                emlrVar.a((emlq) emloVar.build());
                            } else {
                                dsvq dsvqVarB2 = dsxv.b(dsxxVar);
                                if ((dsvqVarB2.b & 4) != 0) {
                                    eohx eohxVar3 = dsvqVarB2.d;
                                    if (eohxVar3 == null) {
                                        eohxVar3 = eohx.a;
                                    }
                                    emmw emmwVar2 = emmwVarArr3[eohxVar3.c];
                                    evsl evslVar4 = emli.a;
                                    emle emleVar = (emle) emlf.a.createBuilder();
                                    emlg emlgVar = (emlg) emlh.a.createBuilder();
                                    emmwVarArr2 = emmwVarArr3;
                                    long j2 = dsvqVarB2.f / 1000;
                                    emlgVar.copyOnWrite();
                                    emlh emlhVar = (emlh) emlgVar.instance;
                                    i5 = 2;
                                    i6 = 1;
                                    emlhVar.b |= 1;
                                    emlhVar.c = j2;
                                    emlh emlhVar2 = (emlh) emlgVar.build();
                                    emleVar.copyOnWrite();
                                    emlf emlfVar = (emlf) emleVar.instance;
                                    emlhVar2.getClass();
                                    emlfVar.c = emlhVar2;
                                    emlfVar.b |= 1;
                                    emmwVar2.e(evslVar4, (emlf) emleVar.build());
                                } else {
                                    emmwVarArr2 = emmwVarArr3;
                                    i5 = 2;
                                    i6 = 1;
                                }
                                eohz eohzVarA2 = dsyr.a(dsxxVar, false);
                                if (eohzVarA2 == null) {
                                    ejwl.m(list3.size() == i6, "Impressions must be in their own event.");
                                    dsvq dsvqVarA5 = dsxv.a(dsxyVar2);
                                    evsl evslVar5 = dszt.a;
                                    evsl evslVarCheckIsLite7 = evsn.checkIsLite(evslVar5);
                                    dsvqVarA5.d(evslVarCheckIsLite7);
                                    if (dsvqVarA5.r.o(evslVarCheckIsLite7.d)) {
                                        evsl evslVarCheckIsLite8 = evsn.checkIsLite(evslVar5);
                                        dsvqVarA5.d(evslVarCheckIsLite8);
                                        Object objL4 = dsvqVarA5.r.l(evslVarCheckIsLite8.d);
                                        Object objC = objL4 == null ? evslVarCheckIsLite8.b : evslVarCheckIsLite8.c(objL4);
                                        emmu emmuVar = (emmu) emmv.a.createBuilder();
                                        int i11 = ((dsyt) objC).b;
                                        emmuVar.copyOnWrite();
                                        emmv emmvVar = (emmv) emmuVar.instance;
                                        emmvVar.b |= 4;
                                        emmvVar.d = i11;
                                        emmv emmvVar2 = (emmv) emmuVar.build();
                                        emkxVar.copyOnWrite();
                                        emky emkyVar2 = (emky) emkxVar.instance;
                                        emmvVar2.getClass();
                                        emkyVar2.f = emmvVar2;
                                        emkyVar2.b |= 16;
                                    }
                                    evsl evslVar6 = dszt.b;
                                    evsl evslVarCheckIsLite9 = evsn.checkIsLite(evslVar6);
                                    dsvqVarA5.d(evslVarCheckIsLite9);
                                    if (dsvqVarA5.r.o(evslVarCheckIsLite9.d)) {
                                        evsl evslVarCheckIsLite10 = evsn.checkIsLite(evslVar6);
                                        dsvqVarA5.d(evslVarCheckIsLite10);
                                        Object objL5 = dsvqVarA5.r.l(evslVarCheckIsLite10.d);
                                        eohz eohzVar2 = (eohz) (objL5 == null ? evslVarCheckIsLite10.b : evslVarCheckIsLite10.c(objL5));
                                        emkxVar.copyOnWrite();
                                        emky emkyVar3 = (emky) emkxVar.instance;
                                        eohzVar2.getClass();
                                        emkyVar3.e = eohzVar2;
                                        emkyVar3.b |= 2;
                                    }
                                    emmwVarArr3 = emmwVarArr2;
                                    dsyo.a(dsxxVar.c(), false, emmwVarArr3, dsxyVar2, map, emkxVar, emlrVar);
                                } else {
                                    emmwVarArr3 = emmwVarArr2;
                                    eohx eohxVar4 = ((dsvq) dsxxVar.a.get(1)).d;
                                    if (eohxVar4 == null) {
                                        eohxVar4 = eohx.a;
                                    }
                                    ejwl.l((eohxVar4.b & 2048) != 0);
                                    emlo emloVar2 = (emlo) emlq.a.createBuilder();
                                    emloVar2.copyOnWrite();
                                    emlq emlqVar4 = (emlq) emloVar2.instance;
                                    emlqVar4.d = 3;
                                    emlqVar4.b |= 2;
                                    emlu emluVar5 = emlu.a;
                                    emlt emltVar2 = (emlt) emluVar5.createBuilder();
                                    emltVar2.copyOnWrite();
                                    emlu emluVar6 = (emlu) emltVar2.instance;
                                    emluVar6.c = eohzVarA2;
                                    emluVar6.b = 3;
                                    emltVar2.copyOnWrite();
                                    emlu emluVar7 = (emlu) emltVar2.instance;
                                    eohxVar4.getClass();
                                    emluVar7.e = eohxVar4;
                                    emluVar7.d = i5;
                                    emlu emluVar8 = (emlu) emltVar2.build();
                                    emloVar2.copyOnWrite();
                                    emlq emlqVar5 = (emlq) emloVar2.instance;
                                    emluVar8.getClass();
                                    emlqVar5.c = emluVar8;
                                    emlqVar5.b |= 1;
                                    dsyo.c(emloVar2, (emmw[]) map.get(dsxxVar));
                                    dsvq dsvqVarB3 = dsxv.b(dsxxVar);
                                    evsl evslVarCheckIsLite11 = evsn.checkIsLite(dszs.a);
                                    dsvqVarB3.d(evslVarCheckIsLite11);
                                    boolean zO = dsvqVarB3.r.o(evslVarCheckIsLite11.d);
                                    if (zO) {
                                        emloVar2.copyOnWrite();
                                        emlq emlqVar6 = (emlq) emloVar2.instance;
                                        emlqVar6.b |= 32;
                                        i7 = 1;
                                        emlqVar6.g = true;
                                    } else {
                                        i7 = 1;
                                    }
                                    dsyo.a(dsxxVar.c(), zO, emmwVarArr3, dsxyVar2, map, emkxVar, emlrVar);
                                    if (list3.size() == i7) {
                                        emlrVar.a((emlq) emloVar2.build());
                                    } else {
                                        emlt emltVar3 = (emlt) emluVar5.createBuilder();
                                        eohx eohxVar5 = dsxv.b(dsxxVar).d;
                                        if (eohxVar5 == null) {
                                            eohxVar5 = eohx.a;
                                        }
                                        emltVar3.copyOnWrite();
                                        emlu emluVar9 = (emlu) emltVar3.instance;
                                        eohxVar5.getClass();
                                        emluVar9.e = eohxVar5;
                                        emluVar9.d = 2;
                                        emlu emluVar10 = (emlu) emltVar3.build();
                                        emloVar2.copyOnWrite();
                                        emlq emlqVar7 = (emlq) emloVar2.instance;
                                        emluVar10.getClass();
                                        emlqVar7.e = emluVar10;
                                        emlqVar7.b |= 4;
                                        emlrVar.copyOnWrite();
                                        emls emlsVar = (emls) emlrVar.instance;
                                        emlq emlqVar8 = (emlq) emloVar2.build();
                                        emlqVar8.getClass();
                                        emlsVar.a();
                                        emlsVar.b.add(emlqVar8);
                                    }
                                    dsyo.b(eohzVarA2, dsxxVar, dsxyVar2, emkxVar);
                                }
                            }
                            z = true;
                        }
                        dsvq dsvqVarA6 = dsxv.a(dsxyVar2);
                        evsl evslVarCheckIsLite12 = evsn.checkIsLite(dszw.a);
                        dsvqVarA6.d(evslVarCheckIsLite12);
                        if (dsvqVarA6.r.o(evslVarCheckIsLite12.d)) {
                            emkz emkzVar = (emkz) emla.a.createBuilder();
                            eohx eohxVar6 = dsvqVarA6.d;
                            if (eohxVar6 == null) {
                                eohxVar6 = eohx.a;
                            }
                            eohz eohzVar3 = eohxVar6.e;
                            if (eohzVar3 == null) {
                                eohzVar3 = eohz.a;
                            }
                            emkzVar.copyOnWrite();
                            emla emlaVar = (emla) emkzVar.instance;
                            eohzVar3.getClass();
                            emlaVar.c = eohzVar3;
                            emlaVar.b |= 1;
                            emla emlaVar2 = (emla) emkzVar.build();
                            emkxVar.copyOnWrite();
                            emky emkyVar4 = (emky) emkxVar.instance;
                            emlaVar2.getClass();
                            emkyVar4.h = emlaVar2;
                            emkyVar4.b |= 128;
                        }
                        if (((emls) emlrVar.instance).b.size() > 0) {
                            emls emlsVar2 = (emls) emlrVar.build();
                            emkxVar.copyOnWrite();
                            emky emkyVar5 = (emky) emkxVar.instance;
                            emlsVar2.getClass();
                            emkyVar5.g = emlsVar2;
                            emkyVar5.b |= 64;
                        }
                        for (emmw emmwVar3 : emmwVarArr3) {
                            emkxVar.copyOnWrite();
                            emky emkyVar6 = (emky) emkxVar.instance;
                            emmz emmzVar3 = (emmz) emmwVar3.build();
                            emmzVar3.getClass();
                            evtg evtgVar = emkyVar6.d;
                            if (!evtgVar.c()) {
                                emkyVar6.d = evsn.mutableCopy(evtgVar);
                            }
                            emkyVar6.d.add(emmzVar3);
                        }
                        return (emky) emkxVar.build();
                    }
                }, eoqgVar);
                listenableFutureB = eork.d(listenableFutureD, listenableFutureH, listenableFutureE, listenableFutureA2).b(eiid.c(new eooy() { // from class: dsyp
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        int[] iArr = (int[]) eork.q(listenableFutureE);
                        Set set = hashSet3;
                        dsuk dsukVar2 = dsukVar;
                        if (iArr != null) {
                            set.addAll(eonc.h(iArr));
                        }
                        dsxy dsxyVar2 = dsxyVar;
                        ListenableFuture listenableFuture2 = listenableFutureH;
                        ejwi ejwiVar2 = ejwiVar;
                        ListenableFuture listenableFuture3 = listenableFutureA2;
                        ListenableFuture listenableFuture4 = listenableFutureD;
                        dbyw dbywVar4 = dbywVar3;
                        String str4 = str3;
                        dsyq dsyqVar = this.a;
                        dsuo dsuoVarL = dsup.l();
                        dsuoVarL.b(str4);
                        dsum dsumVar = (dsum) dsuoVarL;
                        dsumVar.e = dbywVar4;
                        dsuoVarL.c((evuh) eork.q(listenableFuture4));
                        dsumVar.a = (emky) eork.q(listenableFuture3);
                        dsumVar.b = (Integer) ejwiVar2.f();
                        dsumVar.c = (int[]) eork.q(listenableFuture2);
                        dsyb dsybVar2 = dsyqVar.a;
                        dsuoVarL.d(dsybVar2.f(dsxyVar2));
                        dsybVar2.b(dsxyVar2);
                        if (!set.isEmpty()) {
                            dsumVar.d = eonc.j(set);
                        }
                        eieu eieuVarK2 = eiiy.k("GIL:ClearcutTransmitter");
                        try {
                            ListenableFuture listenableFutureA3 = dsyqVar.b.a(dsuoVarL.e(), dsukVar2.b);
                            eieuVarK2.b(listenableFutureA3);
                            eieuVarK2.close();
                            return listenableFutureA3;
                        } catch (Throwable th) {
                            try {
                                eieuVarK2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }), eoqgVar);
                eieuVarK.b(listenableFutureB);
            }
            eieuVarK.close();
            return listenableFutureB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.dsui
    public final Set b() {
        return new ekph(dsxy.class);
    }
}
