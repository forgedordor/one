package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsfr implements dsff {
    public static final eksp a = eksp.c("GnpSdk");
    public final eygg b;
    public final String c;
    private final dsfb d;
    private final diep e;
    private final eoqr f = new eoqr();

    public dsfr(dsgo dsgoVar, diep diepVar, eygg eyggVar, String str) {
        this.d = dsgoVar;
        this.e = diepVar;
        this.b = eyggVar;
        this.c = str;
    }

    @Override // defpackage.dsff
    public final ListenableFuture a(etkl etklVar) {
        dsbl dsblVar = (dsbl) dsbm.a.createBuilder();
        dsblVar.copyOnWrite();
        dsbm dsbmVar = (dsbm) dsblVar.instance;
        etklVar.getClass();
        dsbmVar.c = etklVar;
        dsbmVar.b = 1;
        final dsbm dsbmVar2 = (dsbm) dsblVar.build();
        diep diepVar = this.e;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final dsey dseyVar = new dsey(dsbmVar2, diepVar.f().toEpochMilli());
        final dsfb dsfbVar = this.d;
        return this.f.b(eiid.c(new eooy() { // from class: dsfq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dsbm dsbmVar3 = dsbmVar2;
                if (dsbmVar3.b == 1) {
                    ((eksl) dsfr.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 141, "PromotionsManagerImpl.java")).I("Processing CC event. Code [%d] Source [%d] Package [%s].", Integer.valueOf((dsbmVar3.b == 1 ? (etkl) dsbmVar3.c : etkl.a).d), Integer.valueOf((dsbmVar3.b == 1 ? (etkl) dsbmVar3.c : etkl.a).c), (dsbmVar3.b == 1 ? (etkl) dsbmVar3.c : etkl.a).e);
                }
                if (dsbmVar3.b == 2) {
                    eksp ekspVar = dsfr.a;
                    if (ekspVar.o().Q()) {
                        dsbq dsbqVar = dsbmVar3.b == 2 ? (dsbq) dsbmVar3.c : dsbq.a;
                        eksl ekslVar = (eksl) ekspVar.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 153, "PromotionsManagerImpl.java");
                        int size = dsbqVar.c.size();
                        etor etorVarB = etor.b(dsbqVar.b);
                        if (etorVarB == null) {
                            etorVarB = etor.UNKNOWN;
                        }
                        ekslVar.w("Processing VE event. Nodes [%d], Action [%s].", size, etorVarB.name());
                        int i = 0;
                        while (i < dsbqVar.c.size()) {
                            int i2 = i + 1;
                            ((eksl) ekspVar.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 160, "PromotionsManagerImpl.java")).w("  Node[%d]: [%s]", i2, TextUtils.join(",", ((dsbp) dsbqVar.c.get(i)).b));
                            i = i2;
                        }
                    }
                }
                dsfb dsfbVar2 = dsfbVar;
                final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                final dsgo dsgoVar = (dsgo) dsfbVar2;
                ListenableFuture listenableFutureC = ((dski) dsgoVar.d.a(null)).c();
                ejvr ejvrVarA = eiid.a(new ejvr() { // from class: dsfu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Map map = (Map) obj;
                        eksp ekspVar2 = dsgo.a;
                        if (map == null) {
                            return new ArrayList();
                        }
                        ArrayList arrayList = new ArrayList(map.values());
                        Collections.sort(arrayList, new Comparator() { // from class: dsgi
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                eksp ekspVar3 = dsgo.a;
                                return ((ethk) obj2).g - ((ethk) obj3).g;
                            }
                        });
                        return arrayList;
                    }
                });
                eoqg eoqgVar = eoqg.a;
                final ListenableFuture listenableFutureF = eooq.f(listenableFutureC, ejvrVarA, eoqgVar);
                final HashSet hashSet = new HashSet();
                Iterator it = dsgoVar.o.a().iterator();
                while (it.hasNext()) {
                    hashSet.add(((dski) dsgoVar.j.a((String) it.next())).c());
                }
                hashSet.add(((dski) dsgoVar.j.a(null)).c());
                final ListenableFuture listenableFutureA = eork.c(hashSet).a(eiid.l(new Callable() { // from class: dsgl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar2 = dsgo.a;
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            if (!((Map) ((ListenableFuture) it2.next()).get()).isEmpty()) {
                                return true;
                            }
                        }
                        return false;
                    }
                }), eoqgVar);
                final ListenableFuture listenableFutureC2 = ((dski) dsgoVar.k.a(null)).c();
                final ListenableFuture listenableFutureF2 = TextUtils.isEmpty(null) ? eooq.f(((dxva) dsgoVar.z.b()).a(), new ejvr() { // from class: dsfy
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        String str = ((PseudonymousIdToken) obj).a;
                        eksp ekspVar2 = dsgo.a;
                        return ejwi.i(str);
                    }
                }, eoqgVar) : eork.i(ejud.a);
                final long j = jElapsedRealtime;
                final dsfa dsfaVar = dseyVar;
                final dsfr dsfrVar = this.a;
                return eooh.f(eooq.f(eoqt.t(eooq.g(eooq.g(eoqt.t(eooq.g(eork.d(listenableFutureF, listenableFutureA, listenableFutureC2, listenableFutureF2).a(eiid.l(new Callable() { // from class: dsfz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        List list;
                        String str;
                        dxhe dxheVar;
                        Iterator it2;
                        int i3;
                        boolean z;
                        dsfz dsfzVar = this;
                        boolean zBooleanValue = ((Boolean) eork.q(listenableFutureA)).booleanValue();
                        List list2 = (List) eork.q(listenableFutureF);
                        Map map = (Map) eork.q(listenableFutureC2);
                        String str2 = (String) ((ejwi) eork.q(listenableFutureF2)).f();
                        String strP = null;
                        ((eksl) dsgo.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "filterPromotionsBasedOnTriggeringAndExpiration", 269, "TriggeringEventProcessor.java")).w("Checking triggering conditions for [%d] promotions for account [%s].", list2.size(), null);
                        final dsgo dsgoVar2 = dsgoVar;
                        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(str2)) {
                            list = list2;
                            str = null;
                        } else {
                            dxvi dxviVarA = dxvj.a(null);
                            dxrm dxrmVar = dsgoVar2.C.e() ? (dxrm) dsgoVar2.B.b() : (dxrm) dsgoVar2.A.b();
                            try {
                                list = list2;
                                str = null;
                                dxheVar = (dxhe) ((dxft) fdxs.b(dxrmVar.b, fcyi.a, fdjz.a, new dxrl(dxrmVar, dxviVarA, null)).get()).d();
                            } catch (InterruptedException | ExecutionException e) {
                                list = list2;
                                str = null;
                                ((eksl) ((eksl) ((eksl) dsgo.a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "filterPromotionsBasedOnTriggeringAndExpiration", (char) 292, "TriggeringEventProcessor.java")).q("Failed to fetch GnpAccount in the TriggeringEventProcessor, not setting rtid");
                                dxheVar = null;
                            }
                            strP = dxheVar != null ? dxheVar.p() : str;
                        }
                        ArrayList arrayList = new ArrayList();
                        String str3 = (str2 == null || str2.length() == 0) ? "SIGNED_IN" : "SIGNED_OUT";
                        Iterator it3 = list.iterator();
                        int i4 = 0;
                        while (it3.hasNext()) {
                            ethk ethkVar = (ethk) it3.next();
                            etht ethtVar = ethkVar.c;
                            if (ethtVar == null) {
                                ethtVar = etht.a;
                            }
                            dsfa dsfaVar2 = dsfaVar;
                            String strValueOf = String.valueOf(ethtVar.b);
                            dsbh dsbhVarG = dsbi.g();
                            String str4 = str3;
                            dsbb dsbbVar = (dsbb) dsbhVarG;
                            dsbbVar.a = str;
                            dsbhVarG.c(ethkVar);
                            dsey dseyVar2 = (dsey) dsfaVar2;
                            Map map2 = map;
                            dsbhVarG.d(dseyVar2.b);
                            dsbbVar.b = (evhv) map2.get(dskj.a(ethkVar));
                            dsbbVar.c = strP;
                            dsbi dsbiVarA = dsbhVarG.a();
                            eygg eyggVar = dsgoVar2.t;
                            dxtx dxtxVar = (dxtx) eyggVar.b();
                            String str5 = dsgoVar2.u;
                            ((ecoe) dxtxVar.m.get()).a(str5, str4);
                            Set set = dsgoVar2.p;
                            etnj etnjVar = ethkVar.f;
                            if (etnjVar == null) {
                                etnjVar = etnj.a;
                            }
                            etni etniVarB = etni.b(etnjVar.e);
                            if (etniVarB == null) {
                                etniVarB = etni.UITYPE_NONE;
                            }
                            if (set.contains(etniVarB)) {
                                ((ecoe) ((dxtx) eyggVar.b()).n.get()).a(str5);
                                int i5 = 0;
                                while (true) {
                                    etop etopVar = ethkVar.e;
                                    if (etopVar == null) {
                                        etopVar = etop.a;
                                    }
                                    if (i5 >= etopVar.c.size()) {
                                        it2 = it3;
                                        i3 = -1;
                                        break;
                                    }
                                    ejuh ejuhVar = new ejuh(dsgoVar2.m);
                                    etop etopVar2 = ethkVar.e;
                                    if (etopVar2 == null) {
                                        etopVar2 = etop.a;
                                    }
                                    etoo etooVar = (etoo) etopVar2.c.get(i5);
                                    etht ethtVar2 = ethkVar.c;
                                    if (ethtVar2 == null) {
                                        ethtVar2 = etht.a;
                                    }
                                    int i6 = i5;
                                    it2 = it3;
                                    if (ejuhVar.b(etooVar, new dsdy(ethtVar2, dseyVar2.a))) {
                                        i3 = i6;
                                        break;
                                    }
                                    i5 = i6 + 1;
                                    it3 = it2;
                                }
                                if (i3 >= 0) {
                                    ((ecoe) ((dxtx) eyggVar.b()).o.get()).a(str5);
                                    dsed dsedVar = dsgoVar2.l;
                                    etop etopVar3 = ethkVar.e;
                                    if (etopVar3 == null) {
                                        etopVar3 = etop.a;
                                    }
                                    etom etomVar = etopVar3.d;
                                    if (etomVar == null) {
                                        etomVar = etom.a;
                                    }
                                    etht ethtVar3 = ethkVar.c;
                                    if (ethtVar3 == null) {
                                        ethtVar3 = etht.a;
                                    }
                                    if (dsedVar.b(etomVar, new dsdx(ethtVar3, dsbiVarA, zBooleanValue))) {
                                        ((ecoe) ((dxtx) eyggVar.b()).k.get()).a(str5);
                                        eygg eyggVar2 = dsgoVar2.s;
                                        ((dsah) eyggVar2.b()).l(dsbiVarA, i3);
                                        if (dsgoVar2.a(ethkVar)) {
                                            i4++;
                                            dsbr dsbrVar = dsgoVar2.w;
                                            evvp evvpVar = ethkVar.i;
                                            if (evvpVar == null) {
                                                evvpVar = evvp.a;
                                            }
                                            dsbrVar.c(dsbiVarA, "Promotion was expired on %s.", evxc.h(evvpVar));
                                            ((dsah) eyggVar2.b()).d(dsbiVarA);
                                            ((ecoe) ((dxtx) eyggVar.b()).i.get()).a(str5, str4);
                                            evvp evvpVar2 = ethkVar.i;
                                            if (evvpVar2 == null) {
                                                evvpVar2 = evvp.a;
                                            }
                                            z = zBooleanValue;
                                            ((ecog) ((dxtx) eyggVar.b()).j.get()).b((int) Duration.between(evwz.d(evvpVar2), dsgoVar2.c.f()).toSeconds(), str5, str4);
                                        } else {
                                            z = zBooleanValue;
                                            arrayList.add(dsbiVarA);
                                        }
                                    } else {
                                        dsgoVar2.w.c(dsbiVarA, "Failed Triggering Conditions.", new Object[0]);
                                        z = zBooleanValue;
                                    }
                                } else {
                                    z = zBooleanValue;
                                }
                            } else {
                                dsbr dsbrVar2 = dsgoVar2.w;
                                etnj etnjVar2 = ethkVar.f;
                                if (etnjVar2 == null) {
                                    etnjVar2 = etnj.a;
                                }
                                etni etniVarB2 = etni.b(etnjVar2.e);
                                if (etniVarB2 == null) {
                                    etniVarB2 = etni.UITYPE_NONE;
                                }
                                dsbrVar2.b(dsbiVarA, "Promotion [%s] has an unsupported UI type [%s]", strValueOf, etniVarB2.name());
                                z = zBooleanValue;
                                it2 = it3;
                            }
                            dsfzVar = this;
                            zBooleanValue = z;
                            str3 = str4;
                            map = map2;
                            it3 = it2;
                            str = null;
                        }
                        if (i4 > 0) {
                            ((eksl) dsgo.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "filterPromotionsBasedOnTriggeringAndExpiration", 387, "TriggeringEventProcessor.java")).w("Found %d expired promotion for account %s, dropping them from the DB.", i4, null);
                            ((dski) dsgoVar2.d.a(null)).b((ekgp) Collection.EL.stream(list).filter(Predicate$CC.not(new Predicate() { // from class: dsgg
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo538negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    return dsgoVar2.a((ethk) obj);
                                }
                            })).collect(ekcv.a(new Function() { // from class: dsgh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return dskj.a((ethk) obj);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, Function$CC.identity())));
                        }
                        return arrayList;
                    }
                }), eoqgVar), eiid.d(new eooz() { // from class: dsgc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        int i3;
                        dsgn dsgnVarA;
                        int i4;
                        ListenableFuture listenableFutureG;
                        ListenableFuture listenableFutureI;
                        final List list = (List) obj;
                        if (list.isEmpty()) {
                            int i5 = ekgb.d;
                            return eork.i(ekoe.a);
                        }
                        final dsgo dsgoVar2 = dsgoVar;
                        dsfj dsfjVar = new dsfj();
                        int i6 = 3;
                        if (list == null) {
                            dsgnVarA = dsfjVar.a();
                            i3 = 3;
                        } else {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                etks etksVar = ((dsbi) it2.next()).c().d;
                                if (etksVar == null) {
                                    etksVar = etks.a;
                                }
                                Iterator<E> it3 = etksVar.b.iterator();
                                while (it3.hasNext()) {
                                    for (etkr etkrVar : ((etko) it3.next()).b) {
                                        int i7 = etkrVar.c;
                                        int iA = etkq.a(i7);
                                        if (iA == 0) {
                                            throw null;
                                        }
                                        int i8 = iA - 1;
                                        if (i8 == 0) {
                                            for (etkv etkvVar : (i7 == 2 ? (etlc) etkrVar.d : etlc.a).c) {
                                                int i9 = etkvVar.b;
                                                int iA2 = etku.a(i9);
                                                int i10 = iA2 - 1;
                                                if (iA2 == 0) {
                                                    throw null;
                                                }
                                                if (i10 == 0) {
                                                    i4 = i6;
                                                    etkl etklVar2 = i9 == 1 ? (etkl) etkvVar.c : etkl.a;
                                                    if (dsfjVar.a == null) {
                                                        dsfjVar.a = new ekhv();
                                                    }
                                                    dsfjVar.a.c(etklVar2);
                                                } else if (i10 != 1) {
                                                    i4 = i6;
                                                    ((eksl) dsgo.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "getTargetingData", 811, "TriggeringEventProcessor.java")).q("Received an unknown targeting term, ignoring.");
                                                } else {
                                                    i4 = i6;
                                                    etot etotVar = i9 == 2 ? (etot) etkvVar.c : etot.a;
                                                    if (dsfjVar.b == null) {
                                                        dsfjVar.b = new ekhv();
                                                    }
                                                    dsfjVar.b.c(etotVar);
                                                }
                                                i6 = i4;
                                            }
                                        } else if (i8 == 1) {
                                            String str = (i7 == i6 ? (etkj) etkrVar.d : etkj.a).e;
                                            if (dsfjVar.c == null) {
                                                dsfjVar.c = new ekhv();
                                            }
                                            dsfjVar.c.c(str);
                                        } else if (i8 == i6) {
                                            etgd etgdVarB = etgd.b((i7 == 5 ? (etkd) etkrVar.d : etkd.a).c);
                                            if (etgdVarB == null) {
                                                etgdVarB = etgd.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
                                            }
                                            etgd etgdVar = etgd.ANDROID_POST_NOTIFICATIONS;
                                            if (etgdVarB != etgdVar || (dxuh.e(dsgoVar2.b) && etgdVarB == etgdVar)) {
                                                String strA = dsbf.a(etgdVarB);
                                                if (!dsfjVar.b().g().contains(strA)) {
                                                    dsfjVar.b().c(strA);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i3 = i6;
                            dsgnVarA = dsfjVar.a();
                        }
                        dsfk dsfkVar = (dsfk) dsgnVarA;
                        ekhx ekhxVar = dsfkVar.a;
                        ListenableFuture listenableFutureI2 = ekhxVar.isEmpty() ? eork.i(ekoj.a) : ((dskf) dsgoVar2.e.b()).f(ekhxVar);
                        ekhx ekhxVar2 = dsfkVar.b;
                        ListenableFuture listenableFutureI3 = ekhxVar2.isEmpty() ? eork.i(ekoj.a) : ((dskm) dsgoVar2.f.b()).e(ekhxVar2);
                        ekhx ekhxVar3 = dsfkVar.c;
                        if (ekhxVar3.isEmpty()) {
                            listenableFutureG = eork.i(ekoj.a);
                        } else {
                            final dsfi dsfiVar = (dsfi) dsgoVar2.r.b();
                            ListenableFuture listenableFutureI4 = eork.i(ekhxVar3);
                            dxgk dxgkVar = dsfiVar.d;
                            listenableFutureG = eooq.g(listenableFutureI4, eiid.d(new eooz() { // from class: dsfg
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    ArrayList arrayList = new ArrayList();
                                    dsfi dsfiVar2 = dsfiVar;
                                    dssw dsswVar = (dssw) dsfiVar2.b.b();
                                    ekqg ekqgVarListIterator = ((ekhx) obj2).listIterator();
                                    while (ekqgVarListIterator.hasNext()) {
                                        String str2 = (String) ekqgVarListIterator.next();
                                        dsso dssoVar = (dsso) dsfiVar2.a.get(str2);
                                        if (dssoVar != null) {
                                            arrayList.add(eiid.d(dssoVar).a(null));
                                        } else if (dsswVar != null) {
                                            arrayList.add(dsswVar.c(str2));
                                        }
                                    }
                                    return arrayList.isEmpty() ? eork.i(ekoj.a) : eooq.f(eork.e(arrayList), new ejvr() { // from class: dsfh
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            ekgi ekgiVar = new ekgi();
                                            for (dssq dssqVar : (List) obj3) {
                                                dsss dsssVar = dssqVar.b;
                                                if (dsssVar.b() != 3) {
                                                    ekgiVar.i(dssqVar.a, dsssVar);
                                                }
                                            }
                                            return ekgiVar.c();
                                        }
                                    }, dsfiVar2.c);
                                }
                            }), dsfiVar.c);
                        }
                        if (dsfkVar.d.isEmpty()) {
                            listenableFutureI = eork.i(ekoj.a);
                        } else {
                            ListenableFuture listenableFutureA2 = ((dsmu) ((ejwt) dsgoVar2.g).a).a.a();
                            final fdap fdapVar = new fdap() { // from class: dsms
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj2) {
                                    return DesugarCollections.unmodifiableMap(((dsmp) obj2).b);
                                }
                            };
                            listenableFutureI = eooq.f(listenableFutureA2, new ejvr() { // from class: dsmt
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return fdapVar.invoke(obj2);
                                }
                            }, eoqg.a);
                        }
                        ListenableFuture[] listenableFutureArr = new ListenableFuture[4];
                        listenableFutureArr[0] = listenableFutureI2;
                        listenableFutureArr[1] = listenableFutureI3;
                        listenableFutureArr[2] = listenableFutureG;
                        listenableFutureArr[i3] = listenableFutureI;
                        final ListenableFuture listenableFuture = listenableFutureI2;
                        final ListenableFuture listenableFuture2 = listenableFutureI3;
                        final ListenableFuture listenableFuture3 = listenableFutureI;
                        final ListenableFuture listenableFuture4 = listenableFutureG;
                        return eork.d(listenableFutureArr).a(eiid.l(new Callable() { // from class: dsft
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                dsft dsftVar = this;
                                Map map = (Map) listenableFuture.get();
                                Map map2 = (Map) listenableFuture2.get();
                                ekgp ekgpVar = (ekgp) listenableFuture4.get();
                                Map map3 = (Map) listenableFuture3.get();
                                eksl ekslVar2 = (eksl) dsgo.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "filterPromotionsBasedOnTargeting", 474, "TriggeringEventProcessor.java");
                                List<dsbi> list2 = list;
                                ekslVar2.w("Checking targeting for [%d] triggered promotions for account [%s].", list2.size(), null);
                                ArrayList arrayList = new ArrayList();
                                for (dsbi dsbiVar : list2) {
                                    dsgo dsgoVar3 = dsgoVar2;
                                    ethk ethkVarC = dsbiVar.c();
                                    dseu dseuVar = (dseu) dsgoVar3.n.b();
                                    etks etksVar2 = ethkVarC.d;
                                    if (etksVar2 == null) {
                                        etksVar2 = etks.a;
                                    }
                                    etht ethtVar = ethkVarC.c;
                                    if (ethtVar == null) {
                                        ethtVar = etht.a;
                                    }
                                    if (dseuVar.b(etksVar2, new dsdw(ethtVar, dsbiVar, ekgp.j(map), ekgp.j(map2), ekgp.j(ekgpVar), ekgp.j(map3)))) {
                                        ((ecoe) ((dxtx) dsgoVar3.t.b()).l.get()).a(dsgoVar3.u);
                                        arrayList.add(dsbiVar);
                                    } else {
                                        dsgoVar3.w.c(dsbiVar, "Failed Targeting.", new Object[0]);
                                    }
                                    dsftVar = this;
                                }
                                return arrayList;
                            }
                        }), eoqg.a);
                    }
                }), eoqgVar)), eiid.d(new eooz() { // from class: dsga
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        List list = (List) obj;
                        if (list == null || list.isEmpty()) {
                            return eork.i(ejud.a);
                        }
                        drzp drzpVar = (drzp) dsgoVar.h.b();
                        return fdxs.b(drzpVar.b, fcyi.a, fdjz.a, new drzo(drzpVar, list, null));
                    }
                }), eoqgVar), eiid.d(new eooz() { // from class: dsfx
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r17v1 */
                    /* JADX WARN: Type inference failed for: r17v3 */
                    /* JADX WARN: Type inference failed for: r17v4 */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ?? r17;
                        final ListenableFuture listenableFutureA2;
                        List arrayList;
                        ejwi ejwiVar = (ejwi) obj;
                        boolean z = false;
                        if (!ejwiVar.g()) {
                            return eork.i(false);
                        }
                        final dsbi dsbiVar = (dsbi) ejwiVar.c();
                        final ethk ethkVarC = dsbiVar.c();
                        ethd ethdVar = (ethd) ethg.a.createBuilder();
                        etht ethtVar = ethkVarC.c;
                        if (ethtVar == null) {
                            ethtVar = etht.a;
                        }
                        ethdVar.copyOnWrite();
                        ethg ethgVar = (ethg) ethdVar.instance;
                        ethtVar.getClass();
                        ethgVar.c = ethtVar;
                        ethgVar.b |= 1;
                        etnj etnjVar = ethkVarC.f;
                        if (etnjVar == null) {
                            etnjVar = etnj.a;
                        }
                        etjv etjvVar = etnjVar.f ? etjv.CONTROL_NOT_SEEN : dsez.a;
                        dsfa dsfaVar2 = dsfaVar;
                        final dsgo dsgoVar2 = dsgoVar;
                        ethdVar.copyOnWrite();
                        ((ethg) ethdVar.instance).d = etjvVar.a();
                        evvo evvoVar = (evvo) evvp.a.createBuilder();
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(((dsey) dsfaVar2).b);
                        evvoVar.copyOnWrite();
                        ((evvp) evvoVar.instance).b = seconds;
                        ethdVar.copyOnWrite();
                        ethg ethgVar2 = (ethg) ethdVar.instance;
                        evvp evvpVar = (evvp) evvoVar.build();
                        evvpVar.getClass();
                        ethgVar2.e = evvpVar;
                        ethgVar2.b |= 2;
                        final ethg ethgVar3 = (ethg) ethdVar.build();
                        ListenableFuture listenableFutureD = ((dski) dsgoVar2.j.a(null)).d(dskj.a(ethkVarC), ethgVar3);
                        etnj etnjVar2 = ethkVarC.f;
                        if (etnjVar2 == null) {
                            etnjVar2 = etnj.a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = etnjVar2.c;
                        int iA = etne.a(i3);
                        if (iA == 0) {
                            throw null;
                        }
                        if (iA - 1 != 0) {
                            listenableFutureA2 = eork.i(ekoj.a);
                            r17 = 0;
                        } else {
                            arrayList2.addAll((i3 == 2 ? (etly) etnjVar2.d : etly.a).h);
                            final HashMap mapH = ekmi.h(arrayList2.size());
                            int size2 = arrayList2.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                etlk etlkVar = (etlk) arrayList2.get(i4);
                                boolean z2 = z;
                                mapH.put(etlkVar, ((dsoq) dsgoVar2.v.b()).e(etlkVar.c == 8 ? (etjz) etlkVar.d : etjz.a, etlkVar));
                                i4++;
                                z = z2;
                            }
                            r17 = z;
                            listenableFutureA2 = eork.c(mapH.values()).a(eiid.l(new Callable() { // from class: dsfv
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    eksp ekspVar2 = dsgo.a;
                                    Map map = mapH;
                                    HashMap mapH2 = ekmi.h(map.size());
                                    for (Map.Entry entry : map.entrySet()) {
                                        try {
                                            Intent intent = (Intent) ((ListenableFuture) entry.getValue()).get();
                                            if (intent != null) {
                                                etli etliVarB = etli.b(((etlk) entry.getKey()).e);
                                                if (etliVarB == null) {
                                                    etliVarB = etli.ACTION_UNKNOWN;
                                                }
                                                mapH2.put(etliVarB, intent);
                                            }
                                        } catch (InterruptedException | ExecutionException e) {
                                            eksl ekslVar2 = (eksl) ((eksl) ((eksl) dsgo.a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "getActionIntentMapFuture", 657, "TriggeringEventProcessor.java");
                                            etli etliVarB2 = etli.b(((etlk) entry.getKey()).e);
                                            if (etliVarB2 == null) {
                                                etliVarB2 = etli.ACTION_UNKNOWN;
                                            }
                                            ekslVar2.D("Failed to add intent for action of type [%s] and text [%s]", etliVarB2.name(), ((etlk) entry.getKey()).f);
                                        }
                                    }
                                    return mapH2;
                                }
                            }), eoqg.a);
                        }
                        Map map = dsgoVar2.x;
                        etnj etnjVar3 = ethkVarC.f;
                        if (etnjVar3 == null) {
                            etnjVar3 = etnj.a;
                        }
                        etni etniVarB = etni.b(etnjVar3.e);
                        if (etniVarB == null) {
                            etniVarB = etni.UITYPE_NONE;
                        }
                        fcsu fcsuVar = (fcsu) map.get(etniVarB);
                        if (fcsuVar != null) {
                            dsqa dsqaVar = (dsqa) fcsuVar.b();
                            etnj etnjVar4 = ethkVarC.f;
                            if (etnjVar4 == null) {
                                etnjVar4 = etnj.a;
                            }
                            arrayList = dsqaVar.b(etnjVar4.c == 2 ? (etly) etnjVar4.d : etly.a);
                            dsqa dsqaVar2 = (dsqa) fcsuVar.b();
                            etnj etnjVar5 = ethkVarC.f;
                            if (etnjVar5 == null) {
                                etnjVar5 = etnj.a;
                            }
                            etly etlyVar = (etnjVar5.c == 6 ? (etna) etnjVar5.d : etna.a).d;
                            if (etlyVar == null) {
                                etlyVar = etly.a;
                            }
                            arrayList.addAll(dsqaVar2.b(etlyVar));
                        } else {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(listenableFutureA2);
                        arrayList.add(listenableFutureD);
                        eorg eorgVarC = eork.c(arrayList);
                        Callable callableL = eiid.l(new Callable() { // from class: dsgj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                eksp ekspVar2 = dsgo.a;
                                dsbb dsbbVar = new dsbb();
                                dsbi dsbiVar2 = dsbiVar;
                                dsbbVar.b(dsbiVar2.b());
                                dsbbVar.a = dsbiVar2.e();
                                dsbbVar.c(dsbiVar2.c());
                                dsbbVar.d(dsbiVar2.a());
                                dsbbVar.b = dsbiVar2.d();
                                dsbbVar.c = dsbiVar2.f();
                                dsbbVar.b((Map) listenableFutureA2.get());
                                return dsbbVar.a();
                            }
                        });
                        eoqg eoqgVar2 = eoqg.a;
                        final ListenableFuture listenableFutureG = eooq.g(eorgVarC.a(callableL, eoqgVar2), eiid.d(new eooz() { // from class: dsgk
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                dsbi dsbiVar2 = (dsbi) obj2;
                                dsfe dsfeVar = (dsfe) dsgoVar2.y.b();
                                dsbiVar2.getClass();
                                return fdxs.b(dsfeVar.b, fcyi.a, fdjz.a, new dsfd(dsfeVar, dsbiVar2, null));
                            }
                        }), eoqgVar2);
                        ListenableFuture listenableFutureG2 = eooq.g(listenableFutureG, eiid.d(new eooz() { // from class: dsfw
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                if (((Boolean) obj2).booleanValue()) {
                                    return eorv.a;
                                }
                                return eooq.f(((dski) dsgoVar2.j.a(null)).e(dskj.a(ethkVarC)), new ejvr() { // from class: dsgd
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        eksp ekspVar2 = dsgo.a;
                                        return null;
                                    }
                                }, eoqg.a);
                            }
                        }), eoqgVar2);
                        ListenableFuture listenableFutureG3 = eooq.g(listenableFutureG, eiid.d(new eooz() { // from class: dsgb
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                if (!((Boolean) obj2).booleanValue()) {
                                    return eork.i(null);
                                }
                                ethk ethkVar = ethkVarC;
                                drzs drzsVar = (drzs) dsgoVar2.i.b();
                                ethr ethrVar = ethkVar.j;
                                if (ethrVar == null) {
                                    ethrVar = ethr.a;
                                }
                                return drzsVar.a(ethgVar3, ethrVar);
                            }
                        }), eoqgVar2);
                        ListenableFuture listenableFutureG4 = eooq.g(listenableFutureG, eiid.d(new eooz() { // from class: dsge
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return ((Boolean) obj2).booleanValue() ? ((dsnc) dsgoVar2.q.b()).a(evje.GROWTHKIT_SYNC_AFTER_PROMO_SHOWN) : eork.i(null);
                            }
                        }), eoqgVar2);
                        ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                        listenableFutureArr[r17] = listenableFutureG2;
                        listenableFutureArr[1] = listenableFutureG3;
                        listenableFutureArr[2] = listenableFutureG4;
                        return eork.b(listenableFutureArr).a(eiid.l(new Callable() { // from class: dsgf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return (Boolean) ((eooi) listenableFutureG).q();
                            }
                        }), eoqgVar2);
                    }
                }), eoqgVar)), eiid.a(new ejvr() { // from class: dsfo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        ((eksl) dsfr.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "instrumentProcessResult", 102, "PromotionsManagerImpl.java")).t("Promo shown: %s\n====", bool);
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        long j2 = jElapsedRealtime2;
                        dsfr dsfrVar2 = dsfrVar;
                        eygg eyggVar = dsfrVar2.b;
                        dxtx dxtxVar = (dxtx) eyggVar.b();
                        bool.booleanValue();
                        ecog ecogVar = (ecog) dxtxVar.s.get();
                        String str = dsfrVar2.c;
                        ecogVar.b(jElapsedRealtime3 - j2, str, true, true, bool);
                        dxtx dxtxVar2 = (dxtx) eyggVar.b();
                        bool.booleanValue();
                        ((ecog) dxtxVar2.t.get()).b(j2 - j, str, true, true, bool);
                        return bool;
                    }
                }), eoqgVar), Throwable.class, eiid.a(new ejvr() { // from class: dsfp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((eksl) ((eksl) ((eksl) dsfr.a.j()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "instrumentProcessResult", 131, "PromotionsManagerImpl.java")).q("Failed to process event");
                        return false;
                    }
                }), eoqgVar);
            }
        }), eoqg.a);
    }
}
