package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eakh implements eavo {
    public final eaje a;
    public final eajb b;
    public final eant c;
    public final diep d;
    private final eaix e;
    private final eall f;
    private final eanu g;

    public eakh(eanu eanuVar, eaje eajeVar, eaix eaixVar, eajb eajbVar, eant eantVar, diep diepVar, eall eallVar, final dtbq dtbqVar) {
        this.g = eanuVar;
        this.a = eajeVar;
        this.e = eaixVar;
        this.b = eajbVar;
        this.c = eantVar;
        this.d = diepVar;
        this.f = eallVar;
        ListenableFuture listenableFutureA = dtbqVar.c.a();
        final fdap fdapVar = new fdap() { // from class: dtbn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                ewwo ewwoVar = (ewwo) ewwo.h(new ewwn(), dtbqVar.a);
                ewwk ewwkVar = ewwk.a;
                ewwj ewwjVar = (ewwj) ewwkVar.createBuilder();
                ewwjVar.copyOnWrite();
                ewwk ewwkVar2 = (ewwk) ewwjVar.instance;
                ewwkVar2.b |= 1;
                ewwkVar2.c = str;
                ewwk ewwkVar3 = (ewwk) ewwjVar.build();
                fbnd fbndVar = ewwoVar.a;
                fbrk fbrkVar = ewwp.a;
                if (fbrkVar == null) {
                    synchronized (ewwp.class) {
                        fbrkVar = ewwp.a;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.maps.mapsmobilesdks.v1.MapsMobileSDKsService", "GetSession");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(ewwkVar);
                            fbrhVarA.b = new fcrh(ewwm.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            ewwp.a = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, ewwoVar.b), ewwkVar3);
            }
        };
        eooz eoozVar = new eooz() { // from class: dtbo
            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return fdapVar.invoke(obj);
            }
        };
        eosc eoscVar = dtbqVar.b;
        eork.r(eooq.g(listenableFutureA, eoozVar, eoscVar), new dtbp(dtbqVar), eoscVar);
    }

    public static void l(dzfh dzfhVar) {
        dzfh.a(dzfhVar, new dzfh("Duration"));
        dzfh.a(dzfhVar, new dzfh("Battery"));
    }

    @Override // defpackage.eavo
    public final defn a(eaux eauxVar) {
        return d(eauxVar, 1);
    }

    @Override // defpackage.eavo
    public final defn b(eava eavaVar) {
        return e(eavaVar, 1);
    }

    @Override // defpackage.eavo
    public final defn c(eavr eavrVar) {
        return f(eavrVar, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[Catch: Error | RuntimeException -> 0x00f7, Error -> 0x00f9, TryCatch #2 {Error | RuntimeException -> 0x00f7, blocks: (B:2:0x0000, B:5:0x0017, B:24:0x00e4, B:9:0x002e, B:11:0x0034, B:13:0x0050, B:15:0x0056, B:16:0x006f, B:18:0x00a3, B:20:0x00ae, B:22:0x00c1, B:23:0x00c9, B:19:0x00a9), top: B:31:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[Catch: Error | RuntimeException -> 0x00f7, Error -> 0x00f9, TryCatch #2 {Error | RuntimeException -> 0x00f7, blocks: (B:2:0x0000, B:5:0x0017, B:24:0x00e4, B:9:0x002e, B:11:0x0034, B:13:0x0050, B:15:0x0056, B:16:0x006f, B:18:0x00a3, B:20:0x00ae, B:22:0x00c1, B:23:0x00c9, B:19:0x00a9), top: B:31:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[Catch: Error | RuntimeException -> 0x00f7, Error -> 0x00f9, TryCatch #2 {Error | RuntimeException -> 0x00f7, blocks: (B:2:0x0000, B:5:0x0017, B:24:0x00e4, B:9:0x002e, B:11:0x0034, B:13:0x0050, B:15:0x0056, B:16:0x006f, B:18:0x00a3, B:20:0x00ae, B:22:0x00c1, B:23:0x00c9, B:19:0x00a9), top: B:31:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1 A[Catch: Error | RuntimeException -> 0x00f7, Error -> 0x00f9, TryCatch #2 {Error | RuntimeException -> 0x00f7, blocks: (B:2:0x0000, B:5:0x0017, B:24:0x00e4, B:9:0x002e, B:11:0x0034, B:13:0x0050, B:15:0x0056, B:16:0x006f, B:18:0x00a3, B:20:0x00ae, B:22:0x00c1, B:23:0x00c9, B:19:0x00a9), top: B:31:0x0000 }] */
    @Override // defpackage.eavo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.defn d(defpackage.eaux r13, final int r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eakh.d(eaux, int):defn");
    }

    @Override // defpackage.eavo
    public final defn e(final eava eavaVar, final int i) {
        try {
            new dzub();
            return (!this.g.a || i == 2) ? this.a.a(eavaVar, i).b(new deeq() { // from class: eakc
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    this.a.c.c(eavaVar, 2, i);
                    eakh.l(new dzfh("FetchPlace"));
                    return (eavb) defnVar.i();
                }
            }).d(new eajy()) : this.f.b(eavaVar, i).b(new deeq() { // from class: eakb
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    this.a.c.c(eavaVar, 3, i);
                    eakh.l(new dzfh("GetPlace"));
                    return (eavb) defnVar.i();
                }
            }).d(new eajy());
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    @Override // defpackage.eavo
    public final defn f(final eavr eavrVar, int i) {
        final int i2;
        defn defnVarD;
        try {
            new dzub();
            final eall eallVar = this.f;
            List list = ((eaup) eavrVar).b;
            if (list.isEmpty()) {
                defnVarD = degc.b(new dcff(new Status(9012, "Place fields must not be empty.")));
            } else {
                if (!((eaup) eavrVar).d.isEmpty()) {
                    final long jA = eallVar.b.a();
                    final String strB = eako.b(ealt.a(list), new ArrayList());
                    final ListenableFuture listenableFutureA = eallVar.a();
                    final ListenableFuture listenableFutureG = eooq.g(listenableFutureA, new eooz() { // from class: eakx
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) throws PackageManager.NameNotFoundException {
                            eall eallVar2 = eallVar;
                            euub euubVarC = eallVar2.c(strB, (eaiu) obj);
                            Locale localeB = eallVar2.e.b();
                            euuv euuvVar = euuv.a;
                            euuu euuuVar = (euuu) euuvVar.createBuilder();
                            euuuVar.copyOnWrite();
                            ((euuv) euuuVar.instance).e = false;
                            ArrayList arrayList = new ArrayList();
                            eaup eaupVar = (eaup) eavrVar;
                            Iterator it = eaupVar.c.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Integer) it.next()).intValue();
                                if (iIntValue == 0) {
                                    arrayList.add(euud.PRICE_LEVEL_FREE);
                                } else if (iIntValue == 1) {
                                    arrayList.add(euud.PRICE_LEVEL_INEXPENSIVE);
                                } else if (iIntValue == 2) {
                                    arrayList.add(euud.PRICE_LEVEL_MODERATE);
                                } else if (iIntValue == 3) {
                                    arrayList.add(euud.PRICE_LEVEL_EXPENSIVE);
                                } else if (iIntValue == 4) {
                                    arrayList.add(euud.PRICE_LEVEL_VERY_EXPENSIVE);
                                }
                            }
                            euuuVar.copyOnWrite();
                            euuv euuvVar2 = (euuv) euuuVar.instance;
                            evsx evsxVar = euuvVar2.f;
                            if (!evsxVar.c()) {
                                euuvVar2.f = evsn.mutableCopy(evsxVar);
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                euuvVar2.f.h(((euud) it2.next()).a());
                            }
                            euuuVar.copyOnWrite();
                            ((euuv) euuuVar.instance).d = 0;
                            euuuVar.copyOnWrite();
                            ((euuv) euuuVar.instance).g = false;
                            String str = eaupVar.d;
                            euuuVar.copyOnWrite();
                            ((euuv) euuuVar.instance).b = str;
                            String languageTag = localeB.toLanguageTag();
                            euuuVar.copyOnWrite();
                            euuv euuvVar3 = (euuv) euuuVar.instance;
                            languageTag.getClass();
                            euuvVar3.c = languageTag;
                            euuv euuvVar4 = (euuv) euuuVar.build();
                            fbnd fbndVar = euubVarC.a;
                            fbrk fbrkVar = euuc.b;
                            if (fbrkVar == null) {
                                synchronized (euuc.class) {
                                    fbrkVar = euuc.b;
                                    if (fbrkVar == null) {
                                        fbrh fbrhVarA = fbrk.a();
                                        fbrhVarA.c = fbrj.UNARY;
                                        fbrhVarA.d = fbrk.c("google.maps.places.v1.Places", "SearchText");
                                        fbrhVarA.b();
                                        evrr evrrVar = fcrj.a;
                                        fbrhVarA.a = new fcrh(euuvVar);
                                        fbrhVarA.b = new fcrh(euux.a);
                                        fbrk fbrkVarA = fbrhVarA.a();
                                        euuc.b = fbrkVarA;
                                        fbrkVar = fbrkVarA;
                                    }
                                }
                            }
                            return fcrw.a(fbndVar.a(fbrkVar, euubVarC.b), euuvVar4);
                        }
                    }, eoqg.a);
                    deem deemVar = ((eaup) eavrVar).a;
                    if (deemVar != null) {
                        deemVar.a(new defk() { // from class: eaky
                            @Override // defpackage.defk
                            public final void a() {
                                listenableFutureG.cancel(true);
                            }
                        });
                    }
                    i2 = i;
                    defnVarD = drgf.a(listenableFutureG).f(new defm() { // from class: eakz
                        @Override // defpackage.defm
                        public final defn a(Object obj) {
                            euux euuxVar = (euux) obj;
                            defr defrVar = new defr();
                            evtg evtgVar = euuxVar.b;
                            evtg evtgVar2 = euuxVar.c;
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<E> it = evtgVar.iterator();
                            while (it.hasNext()) {
                                eall eallVar2 = eallVar;
                                arrayList.add(eallVar2.d.a((eutz) it.next()));
                            }
                            Iterator<E> it2 = evtgVar2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(eamc.a((euul) it2.next()));
                            }
                            eauq eauqVar = new eauq();
                            eauqVar.a(arrayList);
                            eauqVar.b = null;
                            List list2 = eauqVar.a;
                            if (list2 == null) {
                                throw new IllegalStateException("Property \"places\" has not been set");
                            }
                            eauqVar.a(ekgb.n(list2));
                            List list3 = eauqVar.b;
                            if (list3 != null) {
                                eauqVar.b = ekgb.n(list3);
                            }
                            List list4 = eauqVar.a;
                            if (list4 == null) {
                                throw new IllegalStateException("Missing required properties: places");
                            }
                            defrVar.b(new eaur(list4, eauqVar.b));
                            return defrVar.a;
                        }
                    }).d(new deeq() { // from class: eala
                        @Override // defpackage.deeq
                        public final Object a(defn defnVar) {
                            if (((defv) defnVar).d) {
                                return defnVar;
                            }
                            ListenableFuture listenableFuture = listenableFutureA;
                            eall eallVar2 = eallVar;
                            long jA2 = eallVar2.b.a();
                            eaiu eaiuVar = (eaiu) ((eorv) listenableFuture).b;
                            int size = defnVar.m() ? ((eavt) defnVar.i()).a().size() : 0;
                            eant eantVar = eallVar2.a;
                            int i3 = i2;
                            long j = jA;
                            eohu eohuVar = (eohu) eohv.a.createBuilder();
                            eohuVar.copyOnWrite();
                            eohv eohvVar = (eohv) eohuVar.instance;
                            eohvVar.b |= 1;
                            eohvVar.c = 0;
                            eohuVar.copyOnWrite();
                            eohv eohvVar2 = (eohv) eohuVar.instance;
                            eohvVar2.b |= 2;
                            eohvVar2.d = size;
                            eohuVar.copyOnWrite();
                            eohv eohvVar3 = (eohv) eohuVar.instance;
                            eohvVar3.b |= 4;
                            eohvVar3.e = 0;
                            eohv eohvVar4 = (eohv) eohuVar.build();
                            eogf eogfVar = (eogf) eogi.a.createBuilder();
                            eogfVar.copyOnWrite();
                            eogi eogiVar = (eogi) eogfVar.instance;
                            eogiVar.c = 9;
                            eogiVar.b |= 1;
                            eogfVar.copyOnWrite();
                            eogi eogiVar2 = (eogi) eogfVar.instance;
                            eohvVar4.getClass();
                            eogiVar2.h = eohvVar4;
                            eogiVar2.b |= 4096;
                            int iF = eajc.f(defnVar);
                            eogfVar.copyOnWrite();
                            eogi eogiVar3 = (eogi) eogfVar.instance;
                            eogiVar3.d = iF - 1;
                            eogiVar3.b |= 2;
                            eogfVar.copyOnWrite();
                            eogi eogiVar4 = (eogi) eogfVar.instance;
                            eogiVar4.b |= 4;
                            eogiVar4.e = (int) (jA2 - j);
                            ((eajc) eantVar).e((eogi) eogfVar.build(), 3, i3, eaiuVar);
                            return defnVar;
                        }
                    });
                    return defnVarD.b(new deeq() { // from class: eajs
                        @Override // defpackage.deeq
                        public final Object a(defn defnVar) {
                            eohm eohmVar = (eohm) eoho.a.createBuilder();
                            eohmVar.copyOnWrite();
                            eoho eohoVar = (eoho) eohmVar.instance;
                            eohoVar.b |= 4;
                            eohoVar.d = false;
                            eohh eohhVar = (eohh) eohi.a.createBuilder();
                            eaup eaupVar = (eaup) eavrVar;
                            eohhVar.a(ealt.a(eaupVar.b));
                            eohi eohiVar = (eohi) eohhVar.build();
                            eohmVar.copyOnWrite();
                            eoho eohoVar2 = (eoho) eohmVar.instance;
                            eohiVar.getClass();
                            eohoVar2.g = eohiVar;
                            eohoVar2.b |= 64;
                            eohmVar.copyOnWrite();
                            eoho eohoVar3 = (eoho) eohmVar.instance;
                            eohoVar3.c = 0;
                            eohoVar3.b |= 1;
                            eohmVar.copyOnWrite();
                            eoho eohoVar4 = (eoho) eohmVar.instance;
                            eohoVar4.b |= 32;
                            eohoVar4.f = false;
                            eohmVar.copyOnWrite();
                            eoho eohoVar5 = (eoho) eohmVar.instance;
                            eohoVar5.b |= 512;
                            eohoVar5.h = false;
                            ArrayList arrayList = new ArrayList();
                            for (Integer num : eaupVar.c) {
                                if (num != null) {
                                    arrayList.add(num);
                                }
                            }
                            eohmVar.copyOnWrite();
                            eoho eohoVar6 = (eoho) eohmVar.instance;
                            evsx evsxVar = eohoVar6.e;
                            if (!evsxVar.c()) {
                                eohoVar6.e = evsn.mutableCopy(evsxVar);
                            }
                            eakh eakhVar = this.a;
                            int i3 = i2;
                            evpz.addAll(arrayList, eohoVar6.e);
                            eajc eajcVar = (eajc) eakhVar.c;
                            eohj eohjVarA = eajcVar.a();
                            eohjVarA.copyOnWrite();
                            eohl eohlVar = (eohl) eohjVarA.instance;
                            eohl eohlVar2 = eohl.a;
                            eohlVar.c = 1;
                            eohlVar.b |= 1;
                            eoho eohoVar7 = (eoho) eohmVar.build();
                            eohjVarA.copyOnWrite();
                            eohl eohlVar3 = (eohl) eohjVarA.instance;
                            eohoVar7.getClass();
                            eohlVar3.h = eohoVar7;
                            eohlVar3.b |= 524288;
                            eohl eohlVar4 = (eohl) eohjVarA.build();
                            eogr eogrVarA = eawv.a(eajcVar.b, 3, i3);
                            eogrVarA.copyOnWrite();
                            eogw eogwVar = (eogw) eogrVarA.instance;
                            eogw eogwVar2 = eogw.a;
                            eogwVar.d = 1;
                            eogwVar.b |= 2;
                            eogrVarA.copyOnWrite();
                            eogw eogwVar3 = (eogw) eogrVarA.instance;
                            eohlVar4.getClass();
                            eogwVar3.f = eohlVar4;
                            eogwVar3.b |= 64;
                            String strA = eajcVar.c.a();
                            eogrVarA.copyOnWrite();
                            eogw eogwVar4 = (eogw) eogrVarA.instance;
                            strA.getClass();
                            eogwVar4.b |= 1073741824;
                            eogwVar4.m = strA;
                            eajcVar.a.a(eogrVarA);
                            eakh.l(new dzfh("SearchByText"));
                            return (eavt) defnVar.i();
                        }
                    }).d(new eajy());
                }
                defnVarD = degc.b(new dcff(new Status(9012, "Text query must not be an empty string.")));
            }
            i2 = i;
            return defnVarD.b(new deeq() { // from class: eajs
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    eohm eohmVar = (eohm) eoho.a.createBuilder();
                    eohmVar.copyOnWrite();
                    eoho eohoVar = (eoho) eohmVar.instance;
                    eohoVar.b |= 4;
                    eohoVar.d = false;
                    eohh eohhVar = (eohh) eohi.a.createBuilder();
                    eaup eaupVar = (eaup) eavrVar;
                    eohhVar.a(ealt.a(eaupVar.b));
                    eohi eohiVar = (eohi) eohhVar.build();
                    eohmVar.copyOnWrite();
                    eoho eohoVar2 = (eoho) eohmVar.instance;
                    eohiVar.getClass();
                    eohoVar2.g = eohiVar;
                    eohoVar2.b |= 64;
                    eohmVar.copyOnWrite();
                    eoho eohoVar3 = (eoho) eohmVar.instance;
                    eohoVar3.c = 0;
                    eohoVar3.b |= 1;
                    eohmVar.copyOnWrite();
                    eoho eohoVar4 = (eoho) eohmVar.instance;
                    eohoVar4.b |= 32;
                    eohoVar4.f = false;
                    eohmVar.copyOnWrite();
                    eoho eohoVar5 = (eoho) eohmVar.instance;
                    eohoVar5.b |= 512;
                    eohoVar5.h = false;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : eaupVar.c) {
                        if (num != null) {
                            arrayList.add(num);
                        }
                    }
                    eohmVar.copyOnWrite();
                    eoho eohoVar6 = (eoho) eohmVar.instance;
                    evsx evsxVar = eohoVar6.e;
                    if (!evsxVar.c()) {
                        eohoVar6.e = evsn.mutableCopy(evsxVar);
                    }
                    eakh eakhVar = this.a;
                    int i3 = i2;
                    evpz.addAll(arrayList, eohoVar6.e);
                    eajc eajcVar = (eajc) eakhVar.c;
                    eohj eohjVarA = eajcVar.a();
                    eohjVarA.copyOnWrite();
                    eohl eohlVar = (eohl) eohjVarA.instance;
                    eohl eohlVar2 = eohl.a;
                    eohlVar.c = 1;
                    eohlVar.b |= 1;
                    eoho eohoVar7 = (eoho) eohmVar.build();
                    eohjVarA.copyOnWrite();
                    eohl eohlVar3 = (eohl) eohjVarA.instance;
                    eohoVar7.getClass();
                    eohlVar3.h = eohoVar7;
                    eohlVar3.b |= 524288;
                    eohl eohlVar4 = (eohl) eohjVarA.build();
                    eogr eogrVarA = eawv.a(eajcVar.b, 3, i3);
                    eogrVarA.copyOnWrite();
                    eogw eogwVar = (eogw) eogrVarA.instance;
                    eogw eogwVar2 = eogw.a;
                    eogwVar.d = 1;
                    eogwVar.b |= 2;
                    eogrVarA.copyOnWrite();
                    eogw eogwVar3 = (eogw) eogrVarA.instance;
                    eohlVar4.getClass();
                    eogwVar3.f = eohlVar4;
                    eogwVar3.b |= 64;
                    String strA = eajcVar.c.a();
                    eogrVarA.copyOnWrite();
                    eogw eogwVar4 = (eogw) eogrVarA.instance;
                    strA.getClass();
                    eogwVar4.b |= 1073741824;
                    eogwVar4.m = strA;
                    eajcVar.a.a(eogrVarA);
                    eakh.l(new dzfh("SearchByText"));
                    return (eavt) defnVar.i();
                }
            }).d(new eajy());
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    @Override // defpackage.eavo
    public final defn g(final eavd eavdVar) {
        try {
            new dzub();
            final eall eallVar = this.f;
            final long jA = eallVar.b.a();
            final ListenableFuture listenableFutureA = eallVar.a();
            final ListenableFuture listenableFutureG = eooq.g(listenableFutureA, new eooz() { // from class: ealb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) throws PackageManager.NameNotFoundException {
                    euub euubVarC = eallVar.c("", (eaiu) obj);
                    eusr eusrVar = eusr.a;
                    eusq eusqVar = (eusq) eusrVar.createBuilder();
                    eaud eaudVar = (eaud) eavdVar;
                    String strE = eaudVar.c.e();
                    strE.getClass();
                    eusqVar.copyOnWrite();
                    ((eusr) eusqVar.instance).b = strE.concat("/media");
                    Integer num = eaudVar.b;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        eusqVar.copyOnWrite();
                        ((eusr) eusqVar.instance).d = iIntValue;
                    }
                    Integer num2 = eaudVar.a;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        eusqVar.copyOnWrite();
                        ((eusr) eusqVar.instance).c = iIntValue2;
                    }
                    eusqVar.copyOnWrite();
                    ((eusr) eusqVar.instance).e = true;
                    eusr eusrVar2 = (eusr) eusqVar.build();
                    fbnd fbndVar = euubVarC.a;
                    fbrk fbrkVar = euuc.c;
                    if (fbrkVar == null) {
                        synchronized (euuc.class) {
                            fbrkVar = euuc.c;
                            if (fbrkVar == null) {
                                fbrh fbrhVarA = fbrk.a();
                                fbrhVarA.c = fbrj.UNARY;
                                fbrhVarA.d = fbrk.c("google.maps.places.v1.Places", "GetPhotoMedia");
                                fbrhVarA.b();
                                evrr evrrVar = fcrj.a;
                                fbrhVarA.a = new fcrh(eusrVar);
                                fbrhVarA.b = new fcrh(eusz.a);
                                fbrk fbrkVarA = fbrhVarA.a();
                                euuc.c = fbrkVarA;
                                fbrkVar = fbrkVarA;
                            }
                        }
                    }
                    return fcrw.a(fbndVar.a(fbrkVar, euubVarC.b), eusrVar2);
                }
            }, eoqg.a);
            deem deemVar = ((eaud) eavdVar).d;
            if (deemVar != null) {
                deemVar.a(new defk() { // from class: ealc
                    @Override // defpackage.defk
                    public final void a() {
                        listenableFutureG.cancel(true);
                    }
                });
            }
            return drgf.a(listenableFutureG).f(new defm() { // from class: eald
                @Override // defpackage.defm
                public final defn a(Object obj) {
                    defr defrVar = new defr();
                    defrVar.b(new eaue(Uri.parse(((eusz) obj).b)));
                    return defrVar.a;
                }
            }).d(new deeq() { // from class: eale
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    if (!((defv) defnVar).d) {
                        ListenableFuture listenableFuture = listenableFutureA;
                        long j = jA;
                        eall eallVar2 = eallVar;
                        long jA2 = eallVar2.b.a();
                        eaiu eaiuVar = (eaiu) ((eorv) listenableFuture).b;
                        eogf eogfVar = (eogf) eogi.a.createBuilder();
                        eogfVar.copyOnWrite();
                        eogi eogiVar = (eogi) eogfVar.instance;
                        eogiVar.c = 14;
                        eogiVar.b |= 1;
                        int iF = eajc.f(defnVar);
                        eogfVar.copyOnWrite();
                        eogi eogiVar2 = (eogi) eogfVar.instance;
                        eogiVar2.d = iF - 1;
                        eogiVar2.b |= 2;
                        eogfVar.copyOnWrite();
                        eogi eogiVar3 = (eogi) eogfVar.instance;
                        eogiVar3.b |= 4;
                        eogiVar3.e = (int) (jA2 - j);
                        ((eajc) eallVar2.a).e((eogi) eogfVar.build(), 3, 3, eaiuVar);
                    }
                    return defnVar;
                }
            }).b(new deeq() { // from class: eaka
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    eohe eoheVar = (eohe) eohg.a.createBuilder();
                    eoheVar.copyOnWrite();
                    eohg eohgVar = (eohg) eoheVar.instance;
                    eohgVar.c = 1;
                    eohgVar.b = 1 | eohgVar.b;
                    eohg eohgVar2 = (eohg) eoheVar.build();
                    eajc eajcVar = (eajc) this.a.c;
                    eogr eogrVarA = eawv.a(eajcVar.b, 3, 3);
                    eogrVarA.copyOnWrite();
                    eogw eogwVar = (eogw) eogrVarA.instance;
                    eogw eogwVar2 = eogw.a;
                    eogwVar.d = 5;
                    eogwVar.b |= 2;
                    eogrVarA.copyOnWrite();
                    eogw eogwVar3 = (eogw) eogrVarA.instance;
                    eohgVar2.getClass();
                    eogwVar3.g = eohgVar2;
                    eogwVar3.b |= 512;
                    String strA = eajcVar.c.a();
                    eogrVarA.copyOnWrite();
                    eogw eogwVar4 = (eogw) eogrVarA.instance;
                    strA.getClass();
                    eogwVar4.b |= 1073741824;
                    eogwVar4.m = strA;
                    eajcVar.a.a(eogrVarA);
                    eakh.l(new dzfh("GetPhotoMedia"));
                    return (eave) defnVar.i();
                }
            }).d(new eajy());
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    @Override // defpackage.eavo
    public final defn h(final eavg eavgVar) {
        try {
            new dzub();
            if (this.g.a) {
                return degc.b(new dcff(new Status(9012, "Query must not be null."))).b(new deeq() { // from class: eajw
                    @Override // defpackage.deeq
                    public final Object a(defn defnVar) {
                        this.a.c.g(eavgVar, 3);
                        eakh.l(new dzfh("FindAutocompletePredictionsOnePlatform"));
                        return (eavh) defnVar.i();
                    }
                }).d(new eajy());
            }
            int i = ekgb.d;
            return degc.c(new eauh(ekgb.n(ekoe.a))).b(new deeq() { // from class: eajx
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    this.a.c.g(eavgVar, 2);
                    eakh.l(new dzfh("FindAutocompletePredictions"));
                    return (eavh) defnVar.i();
                }
            }).d(new eajy());
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    @Override // defpackage.eavo
    public final defn i(eavj eavjVar) {
        return j(eavjVar);
    }

    public final defn j(final eavj eavjVar) {
        try {
            final long jA = this.d.a();
            new dzub();
            eaix eaixVar = this.e;
            deem deemVar = ((eauj) eavjVar).b;
            ddnh ddnhVar = new ddnh();
            long j = eaix.a;
            ddnhVar.b(j);
            if (kxj.c(eaixVar.d, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                ddnhVar.c(100);
            } else {
                ddnhVar.c(102);
            }
            final eanl eanlVar = eaixVar.c;
            defn defnVarA = eaixVar.b.a(ddnhVar.a(), deemVar);
            final defr defrVar = deemVar == null ? new defr() : new defr(deemVar);
            Map map = eanlVar.a;
            if (!map.containsKey(defrVar)) {
                HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
                handlerThread.start();
                map.put(defrVar, handlerThread);
                new Handler(handlerThread.getLooper()).postDelayed(new Runnable() { // from class: eani
                    public final /* synthetic */ String b = "Location timeout.";

                    @Override // java.lang.Runnable
                    public final void run() {
                        defrVar.c(new dcff(new Status(15, this.b)));
                    }
                }, j);
            }
            defnVarA.d(new deeq() { // from class: eanj
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    defr defrVar2 = defrVar;
                    Exception excH = defnVar.h();
                    if (defnVar.m()) {
                        defrVar2.b(defnVar.i());
                    } else if (!((defv) defnVar).d && excH != null) {
                        defrVar2.a(excH);
                    }
                    return defrVar2.a;
                }
            });
            defv defvVar = defrVar.a;
            defvVar.s(new defb() { // from class: eank
                @Override // defpackage.defb
                public final void a(defn defnVar) {
                    HandlerThread handlerThread2 = (HandlerThread) eanlVar.a.remove(defrVar);
                    if (handlerThread2 == null) {
                        return;
                    }
                    handlerThread2.quit();
                }
            });
            return defvVar.d(new eaiw()).f(new defm() { // from class: eaju
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
                @Override // defpackage.defm
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final defpackage.defn a(java.lang.Object r18) {
                    /*
                        Method dump skipped, instructions count: 277
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.eaju.a(java.lang.Object):defn");
                }
            }).b(new deeq() { // from class: eajv
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    eakh eakhVar = this.a;
                    long jA2 = eakhVar.d.a();
                    int i = true == defnVar.m() ? 2 : 1;
                    eohb eohbVar = (eohb) eohd.a.createBuilder();
                    eohh eohhVar = (eohh) eohi.a.createBuilder();
                    eohhVar.a(eanh.b(((eauj) eavjVar).a));
                    eohi eohiVar = (eohi) eohhVar.build();
                    eohbVar.copyOnWrite();
                    eohd eohdVar = (eohd) eohbVar.instance;
                    eohiVar.getClass();
                    eohdVar.e = eohiVar;
                    eohdVar.b |= 8;
                    long j2 = jA2 - jA;
                    eohbVar.copyOnWrite();
                    eohd eohdVar2 = (eohd) eohbVar.instance;
                    eohdVar2.b |= 4;
                    eohdVar2.d = (int) j2;
                    eohbVar.copyOnWrite();
                    eohd eohdVar3 = (eohd) eohbVar.instance;
                    eohdVar3.c = i - 1;
                    eohdVar3.b |= 2;
                    eohd eohdVar4 = (eohd) eohbVar.build();
                    eajc eajcVar = (eajc) eakhVar.c;
                    eogr eogrVarA = eawv.a(eajcVar.b, 2, 3);
                    eogrVarA.copyOnWrite();
                    eogw eogwVar = (eogw) eogrVarA.instance;
                    eogw eogwVar2 = eogw.a;
                    eogwVar.d = 6;
                    eogwVar.b = 2 | eogwVar.b;
                    eogrVarA.copyOnWrite();
                    eogw eogwVar3 = (eogw) eogrVarA.instance;
                    eohdVar4.getClass();
                    eogwVar3.h = eohdVar4;
                    eogwVar3.b |= 1024;
                    String strA = eajcVar.c.a();
                    eogrVarA.copyOnWrite();
                    eogw eogwVar4 = (eogw) eogrVarA.instance;
                    strA.getClass();
                    eogwVar4.b |= 1073741824;
                    eogwVar4.m = strA;
                    eajcVar.a.a(eogrVarA);
                    eakh.l(new dzfh("FindCurrentPlace"));
                    return (eavk) defnVar.i();
                }
            }).d(new eajy());
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    @Override // defpackage.eavo
    public final defn k(eavm eavmVar) {
        List arrayList;
        try {
            final eatj eatjVar = ((eaum) eavmVar).a;
            String strAe = ((eaum) eavmVar).b;
            final long j = ((eaum) eavmVar).c;
            final defr defrVar = new defr();
            if (eatjVar == null) {
                int i = easr.a;
                arrayList = Arrays.asList(eatg.BUSINESS_STATUS, eatg.CURRENT_OPENING_HOURS, eatg.OPENING_HOURS, eatg.UTC_OFFSET);
            } else {
                int i2 = easr.a;
                arrayList = new ArrayList();
                eate eateVarM = eatjVar.M();
                if (eateVarM == null || eateVarM == eate.OPERATIONAL) {
                    if (eateVarM == null) {
                        arrayList.add(eatg.BUSINESS_STATUS);
                    }
                    if (eatjVar.j() == null) {
                        arrayList.add(eatg.CURRENT_OPENING_HOURS);
                    }
                    if (eatjVar.k() == null) {
                        arrayList.add(eatg.OPENING_HOURS);
                    }
                    if (eatjVar.U() == null) {
                        arrayList.add(eatg.UTC_OFFSET);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                eatjVar.getClass();
                defrVar.b(new eaun(easr.b(eatjVar, j)));
                return defrVar.a;
            }
            if (eatjVar != null) {
                strAe = eatjVar.ae();
            }
            strAe.getClass();
            eauz eauzVarF = eava.f(strAe, arrayList);
            ((eatz) eauzVarF).b = ((eaum) eavmVar).d;
            final eava eavaVarC = eauzVarF.c();
            new dzub();
            return this.g.a ? this.f.b(eavaVarC, 3).b(new deeq() { // from class: eake
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    this.a.c.h(eavaVarC, 3);
                    eakh.l(new dzfh("IsOpenGetPlace"));
                    return (eavb) defnVar.i();
                }
            }).f(new defm() { // from class: eakf
                @Override // defpackage.defm
                public final defn a(Object obj) {
                    eaoy eaoyVar = (eaoy) ((eavb) obj).a();
                    eate eateVarM2 = eaoyVar.g;
                    easp easpVarJ = eaoyVar.i;
                    easp easpVarK = eaoyVar.y;
                    Integer numU = eaoyVar.aa;
                    eatj eatjVar2 = eatjVar;
                    if (eatjVar2 != null) {
                        if (numU == null) {
                            numU = eatjVar2.U();
                        }
                        if (eateVarM2 == null) {
                            eateVarM2 = eatjVar2.M();
                        }
                        if (easpVarJ == null) {
                            easpVarJ = eatjVar2.j();
                        }
                        if (easpVarK == null) {
                            easpVarK = eatjVar2.k();
                        }
                    }
                    defr defrVar2 = defrVar;
                    long j2 = j;
                    eatc eatcVarAx = eatj.ax();
                    eaox eaoxVar = (eaox) eatcVarAx;
                    eaoxVar.g = eateVarM2;
                    eaoxVar.h = easpVarJ;
                    eaoxVar.v = easpVarK;
                    eaoxVar.O = numU;
                    defrVar2.b(new eaun(easr.b(eatcVarAx.G(), j2)));
                    return defrVar2.a;
                }
            }).d(new eajy()) : this.a.a(eavaVarC, 3).b(new deeq() { // from class: eakg
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    this.a.c.h(eavaVarC, 2);
                    eakh.l(new dzfh("IsOpenFetchPlace"));
                    return (eavb) defnVar.i();
                }
            }).f(new defm() { // from class: eajt
                @Override // defpackage.defm
                public final defn a(Object obj) {
                    eaoy eaoyVar = (eaoy) ((eavb) obj).a();
                    eate eateVarM2 = eaoyVar.g;
                    easp easpVarJ = eaoyVar.i;
                    easp easpVarK = eaoyVar.y;
                    Integer numU = eaoyVar.aa;
                    eatj eatjVar2 = eatjVar;
                    if (eatjVar2 != null) {
                        if (numU == null) {
                            numU = eatjVar2.U();
                        }
                        if (eateVarM2 == null) {
                            eateVarM2 = eatjVar2.M();
                        }
                        if (easpVarJ == null) {
                            easpVarJ = eatjVar2.j();
                        }
                        if (easpVarK == null) {
                            easpVarK = eatjVar2.k();
                        }
                    }
                    defr defrVar2 = defrVar;
                    long j2 = j;
                    eatc eatcVarAx = eatj.ax();
                    eaox eaoxVar = (eaox) eatcVarAx;
                    eaoxVar.g = eateVarM2;
                    eaoxVar.h = easpVarJ;
                    eaoxVar.v = easpVarK;
                    eaoxVar.O = numU;
                    defrVar2.b(new eaun(easr.b(eatcVarAx.G(), j2)));
                    return defrVar2.a;
                }
            }).d(new eajy());
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    @Override // defpackage.eavo
    public final defn m(final eavv eavvVar) {
        defn defnVarD;
        try {
            new dzub();
            final eall eallVar = this.f;
            List list = ((eaut) eavvVar).f;
            if (list.isEmpty()) {
                defnVarD = degc.b(new dcff(new Status(9012, "Place fields must not be empty.")));
            } else {
                final long jA = eallVar.b.a();
                final String strB = eako.b(ealt.a(list), new ArrayList());
                final ListenableFuture listenableFutureA = eallVar.a();
                final ListenableFuture listenableFutureG = eooq.g(listenableFutureA, new eooz() { // from class: ealj
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) throws PackageManager.NameNotFoundException {
                        eall eallVar2 = eallVar;
                        euub euubVarC = eallVar2.c(strB, (eaiu) obj);
                        Locale localeB = eallVar2.e.b();
                        euur euurVar = euur.a;
                        euum euumVar = (euum) euurVar.createBuilder();
                        String languageTag = localeB.toLanguageTag();
                        euumVar.copyOnWrite();
                        euur euurVar2 = (euur) euumVar.instance;
                        languageTag.getClass();
                        euurVar2.c = languageTag;
                        eaut eautVar = (eaut) eavvVar;
                        List list2 = eautVar.a;
                        if (list2 != null) {
                            euumVar.copyOnWrite();
                            euur euurVar3 = (euur) euumVar.instance;
                            evtg evtgVar = euurVar3.d;
                            if (!evtgVar.c()) {
                                euurVar3.d = evsn.mutableCopy(evtgVar);
                            }
                            evpz.addAll(list2, euurVar3.d);
                        }
                        List list3 = eautVar.b;
                        if (list3 != null) {
                            euumVar.copyOnWrite();
                            euur euurVar4 = (euur) euumVar.instance;
                            evtg evtgVar2 = euurVar4.e;
                            if (!evtgVar2.c()) {
                                euurVar4.e = evsn.mutableCopy(evtgVar2);
                            }
                            evpz.addAll(list3, euurVar4.e);
                        }
                        List list4 = eautVar.c;
                        if (list4 != null) {
                            euumVar.copyOnWrite();
                            euur euurVar5 = (euur) euumVar.instance;
                            evtg evtgVar3 = euurVar5.f;
                            if (!evtgVar3.c()) {
                                euurVar5.f = evsn.mutableCopy(evtgVar3);
                            }
                            evpz.addAll(list4, euurVar5.f);
                        }
                        List list5 = eautVar.d;
                        if (list5 != null) {
                            euumVar.copyOnWrite();
                            euur euurVar6 = (euur) euumVar.instance;
                            evtg evtgVar4 = euurVar6.g;
                            if (!evtgVar4.c()) {
                                euurVar6.g = evsn.mutableCopy(evtgVar4);
                            }
                            evpz.addAll(list5, euurVar6.g);
                        }
                        eamf eamfVar = eallVar2.c;
                        euup euupVar = (euup) euuq.a.createBuilder();
                        eakk eakkVar = eamfVar.a;
                        earv earvVar = (earv) eautVar.e;
                        LatLng latLngB = earvVar.b();
                        euse euseVar = (euse) eusf.a.createBuilder();
                        eybf eybfVar = (eybf) eybg.a.createBuilder();
                        double d = latLngB.a;
                        eybfVar.copyOnWrite();
                        ((eybg) eybfVar.instance).b = d;
                        double d2 = latLngB.b;
                        eybfVar.copyOnWrite();
                        ((eybg) eybfVar.instance).c = d2;
                        euseVar.copyOnWrite();
                        eusf eusfVar = (eusf) euseVar.instance;
                        eybg eybgVar = (eybg) eybfVar.build();
                        eybgVar.getClass();
                        eusfVar.c = eybgVar;
                        eusfVar.b |= 1;
                        double dA = earvVar.a();
                        euseVar.copyOnWrite();
                        ((eusf) euseVar.instance).d = dA;
                        eusf eusfVar2 = (eusf) euseVar.build();
                        euupVar.copyOnWrite();
                        euuq euuqVar = (euuq) euupVar.instance;
                        eusfVar2.getClass();
                        euuqVar.c = eusfVar2;
                        euuqVar.b = 2;
                        euuq euuqVar2 = (euuq) euupVar.build();
                        euumVar.copyOnWrite();
                        euur euurVar7 = (euur) euumVar.instance;
                        euuqVar2.getClass();
                        euurVar7.h = euuqVar2;
                        euurVar7.b |= 1;
                        euumVar.copyOnWrite();
                        ((euur) euumVar.instance).i = 0;
                        euur euurVar8 = (euur) euumVar.build();
                        fbnd fbndVar = euubVarC.a;
                        fbrk fbrkVar = euuc.a;
                        if (fbrkVar == null) {
                            synchronized (euuc.class) {
                                fbrkVar = euuc.a;
                                if (fbrkVar == null) {
                                    fbrh fbrhVarA = fbrk.a();
                                    fbrhVarA.c = fbrj.UNARY;
                                    fbrhVarA.d = fbrk.c("google.maps.places.v1.Places", "SearchNearby");
                                    fbrhVarA.b();
                                    evrr evrrVar = fcrj.a;
                                    fbrhVarA.a = new fcrh(euurVar);
                                    fbrhVarA.b = new fcrh(euut.a);
                                    fbrk fbrkVarA = fbrhVarA.a();
                                    euuc.a = fbrkVarA;
                                    fbrkVar = fbrkVarA;
                                }
                            }
                        }
                        return fcrw.a(fbndVar.a(fbrkVar, euubVarC.b), euurVar8);
                    }
                }, eoqg.a);
                deem deemVar = ((eaut) eavvVar).g;
                if (deemVar != null) {
                    deemVar.a(new defk() { // from class: ealk
                        @Override // defpackage.defk
                        public final void a() {
                            listenableFutureG.cancel(true);
                        }
                    });
                }
                defnVarD = drgf.a(listenableFutureG).f(new defm() { // from class: eakv
                    @Override // defpackage.defm
                    public final defn a(Object obj) {
                        euut euutVar = (euut) obj;
                        defr defrVar = new defr();
                        evtg evtgVar = euutVar.b;
                        evtg evtgVar2 = euutVar.c;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<E> it = evtgVar.iterator();
                        while (it.hasNext()) {
                            eall eallVar2 = eallVar;
                            arrayList.add(eallVar2.d.a((eutz) it.next()));
                        }
                        Iterator<E> it2 = evtgVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(eamc.a((euul) it2.next()));
                        }
                        eauu eauuVar = new eauu();
                        eauuVar.a(arrayList);
                        eauuVar.b = null;
                        List list2 = eauuVar.a;
                        if (list2 == null) {
                            throw new IllegalStateException("Property \"places\" has not been set");
                        }
                        eauuVar.a(ekgb.n(list2));
                        List list3 = eauuVar.b;
                        if (list3 != null) {
                            eauuVar.b = ekgb.n(list3);
                        }
                        List list4 = eauuVar.a;
                        if (list4 == null) {
                            throw new IllegalStateException("Missing required properties: places");
                        }
                        defrVar.b(new eauv(list4, eauuVar.b));
                        return defrVar.a;
                    }
                }).d(new deeq() { // from class: eakw
                    @Override // defpackage.deeq
                    public final Object a(defn defnVar) {
                        if (((defv) defnVar).d) {
                            return defnVar;
                        }
                        ListenableFuture listenableFuture = listenableFutureA;
                        eall eallVar2 = eallVar;
                        long jA2 = eallVar2.b.a();
                        eaiu eaiuVar = (eaiu) ((eorv) listenableFuture).b;
                        int size = defnVar.m() ? ((eavx) defnVar.i()).a().size() : 0;
                        eant eantVar = eallVar2.a;
                        long j = jA;
                        eohu eohuVar = (eohu) eohv.a.createBuilder();
                        eohuVar.copyOnWrite();
                        eohv eohvVar = (eohv) eohuVar.instance;
                        eohvVar.b |= 1;
                        eohvVar.c = 0;
                        eohuVar.copyOnWrite();
                        eohv eohvVar2 = (eohv) eohuVar.instance;
                        eohvVar2.b |= 2;
                        eohvVar2.d = size;
                        eohuVar.copyOnWrite();
                        eohv eohvVar3 = (eohv) eohuVar.instance;
                        eohvVar3.b |= 4;
                        eohvVar3.e = 0;
                        eohv eohvVar4 = (eohv) eohuVar.build();
                        eogf eogfVar = (eogf) eogi.a.createBuilder();
                        eogfVar.copyOnWrite();
                        eogi eogiVar = (eogi) eogfVar.instance;
                        eogiVar.c = 9;
                        eogiVar.b |= 1;
                        eogfVar.copyOnWrite();
                        eogi eogiVar2 = (eogi) eogfVar.instance;
                        eohvVar4.getClass();
                        eogiVar2.h = eohvVar4;
                        eogiVar2.b |= 4096;
                        int iF = eajc.f(defnVar);
                        eogfVar.copyOnWrite();
                        eogi eogiVar3 = (eogi) eogfVar.instance;
                        eogiVar3.d = iF - 1;
                        eogiVar3.b |= 2;
                        eogfVar.copyOnWrite();
                        eogi eogiVar4 = (eogi) eogfVar.instance;
                        eogiVar4.b |= 4;
                        eogiVar4.e = (int) (jA2 - j);
                        ((eajc) eantVar).e((eogi) eogfVar.build(), 3, 3, eaiuVar);
                        return defnVar;
                    }
                });
            }
            return defnVarD.b(new deeq() { // from class: eajz
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    eohp eohpVar = (eohp) eohr.a.createBuilder();
                    eohh eohhVar = (eohh) eohi.a.createBuilder();
                    eaut eautVar = (eaut) eavvVar;
                    eohhVar.a(ealt.a(eautVar.f));
                    eohi eohiVar = (eohi) eohhVar.build();
                    eohpVar.copyOnWrite();
                    eohr eohrVar = (eohr) eohpVar.instance;
                    eohiVar.getClass();
                    eohrVar.h = eohiVar;
                    eohrVar.b |= 4;
                    eohpVar.copyOnWrite();
                    eohr eohrVar2 = (eohr) eohpVar.instance;
                    eohrVar2.c = 0;
                    eohrVar2.b |= 1;
                    eohpVar.copyOnWrite();
                    eohr eohrVar3 = (eohr) eohpVar.instance;
                    eohrVar3.b |= 16;
                    eohrVar3.i = false;
                    List list2 = eautVar.a;
                    if (list2 != null) {
                        eohpVar.copyOnWrite();
                        eohr eohrVar4 = (eohr) eohpVar.instance;
                        evtg evtgVar = eohrVar4.d;
                        if (!evtgVar.c()) {
                            eohrVar4.d = evsn.mutableCopy(evtgVar);
                        }
                        evpz.addAll(list2, eohrVar4.d);
                    }
                    List list3 = eautVar.b;
                    if (list3 != null) {
                        eohpVar.copyOnWrite();
                        eohr eohrVar5 = (eohr) eohpVar.instance;
                        evtg evtgVar2 = eohrVar5.e;
                        if (!evtgVar2.c()) {
                            eohrVar5.e = evsn.mutableCopy(evtgVar2);
                        }
                        evpz.addAll(list3, eohrVar5.e);
                    }
                    List list4 = eautVar.c;
                    if (list4 != null) {
                        eohpVar.copyOnWrite();
                        eohr eohrVar6 = (eohr) eohpVar.instance;
                        evtg evtgVar3 = eohrVar6.f;
                        if (!evtgVar3.c()) {
                            eohrVar6.f = evsn.mutableCopy(evtgVar3);
                        }
                        evpz.addAll(list4, eohrVar6.f);
                    }
                    List list5 = eautVar.d;
                    if (list5 != null) {
                        eohpVar.copyOnWrite();
                        eohr eohrVar7 = (eohr) eohpVar.instance;
                        evtg evtgVar4 = eohrVar7.g;
                        if (!evtgVar4.c()) {
                            eohrVar7.g = evsn.mutableCopy(evtgVar4);
                        }
                        evpz.addAll(list5, eohrVar7.g);
                    }
                    eajc eajcVar = (eajc) this.a.c;
                    eohj eohjVarA = eajcVar.a();
                    eohjVarA.copyOnWrite();
                    eohl eohlVar = (eohl) eohjVarA.instance;
                    eohl eohlVar2 = eohl.a;
                    eohlVar.c = 1;
                    eohlVar.b |= 1;
                    eohr eohrVar8 = (eohr) eohpVar.build();
                    eohjVarA.copyOnWrite();
                    eohl eohlVar3 = (eohl) eohjVarA.instance;
                    eohrVar8.getClass();
                    eohlVar3.i = eohrVar8;
                    eohlVar3.b |= 1048576;
                    eohl eohlVar4 = (eohl) eohjVarA.build();
                    eogr eogrVarA = eawv.a(eajcVar.b, 3, 3);
                    eogrVarA.copyOnWrite();
                    eogw eogwVar = (eogw) eogrVarA.instance;
                    eogw eogwVar2 = eogw.a;
                    eogwVar.d = 1;
                    eogwVar.b |= 2;
                    eogrVarA.copyOnWrite();
                    eogw eogwVar3 = (eogw) eogrVarA.instance;
                    eohlVar4.getClass();
                    eogwVar3.f = eohlVar4;
                    eogwVar3.b |= 64;
                    String strA = eajcVar.c.a();
                    eogrVarA.copyOnWrite();
                    eogw eogwVar4 = (eogw) eogrVarA.instance;
                    strA.getClass();
                    eogwVar4.b |= 1073741824;
                    eogwVar4.m = strA;
                    eajcVar.a.a(eogrVarA);
                    eakh.l(new dzfh("SearchNearby"));
                    return (eavx) defnVar.i();
                }
            }).d(new eajy());
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }
}
