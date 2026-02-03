package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drcp {
    public static final ekrg a = ekrg.c("com/google/android/libraries/geller/gellersync/GellerSyncClient");
    public final ejwi b;
    public final Geller c;
    public final ejvr d;
    public final Set e;
    public final ejvr f;
    public final ExecutorService g;
    public final ExecutorService h;
    public final ExecutorService i;
    public final evrj j;
    public final Boolean k;
    public final drbc l;
    public final Map m;
    public final ejxm n;
    public final ejwi o;
    public int p = 0;
    public String q;
    public String r;
    public String s;
    private final String t;

    public drcp(ejwi ejwiVar, Geller geller, String str, ejvr ejvrVar, Set set, ejvr ejvrVar2, evrj evrjVar, Boolean bool, drbc drbcVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, ejya ejyaVar) {
        this.b = ejwiVar;
        this.c = geller;
        this.t = str;
        this.d = ejvrVar;
        this.e = set;
        this.f = ejvrVar2;
        this.j = evrjVar;
        this.k = bool;
        this.l = drbcVar;
        this.g = executorService;
        this.h = executorService2;
        this.i = executorService3;
        this.m = map;
        this.n = new ejxm(ejyaVar);
        this.o = ejwi.j(new drab(new drac(), executorService));
    }

    public static final ekgp d(Iterable iterable, Exception exc, String str) {
        ekgi ekgiVar = new ekgi();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ewut ewutVar = (ewut) it.next();
            draf drafVar = new draf();
            drafVar.g(new drcq(str, exc));
            ekgiVar.i(ewutVar, drafVar.a());
            ewutVar.name();
        }
        return ekgiVar.c();
    }

    public final ListenableFuture a(Set set, final dqzt dqztVar, int i, final ewvn ewvnVar) {
        ListenableFuture listenableFutureF;
        if (i == 2) {
            listenableFutureF = eork.i(ekon.a);
        } else {
            int i2 = ekgb.d;
            ekfw ekfwVar = new ekfw();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                final ewut ewutVar = (ewut) it.next();
                eooy eooyVar = new eooy() { // from class: drbg
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ejwi ejwiVar = this.a.b;
                        if (!ejwiVar.g()) {
                            return eork.i(true);
                        }
                        ewut ewutVar2 = ewutVar;
                        dqzt dqztVar2 = dqztVar;
                        return dqztVar2.b(ewutVar2);
                    }
                };
                ExecutorService executorService = this.g;
                ekfwVar.h(eooq.f(eika.i(eooyVar, executorService), eiid.a(new ejvr() { // from class: drbh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        ewut ewutVar2 = ewutVar;
                        if (zBooleanValue) {
                            return ewutVar2;
                        }
                        ((ekrd) ((ekrd) drcp.a.j()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "filterUploadEnabled", 1131, "GellerSyncClient.java")).t("Upload permissions denied for Corpus %s", ewutVar2.name());
                        return null;
                    }
                }), executorService));
            }
            listenableFutureF = eooq.f(eork.o(ekfwVar.g()), eiid.a(new ejvr() { // from class: drbi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekhv ekhvVar = new ekhv();
                    for (ewut ewutVar2 : (List) obj) {
                        if (ewutVar2 != null) {
                            ekhvVar.c(ewutVar2);
                        }
                    }
                    return ekhvVar.g();
                }
            }), this.g);
        }
        eoqt eoqtVarT = eoqt.t(listenableFutureF);
        eooz eoozVarD = eiid.d(new eooz() { // from class: drce
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                drcp drcpVar = this.a;
                final Geller geller = drcpVar.c;
                final ekhx ekhxVar = (ekhx) obj;
                final String strB = drds.b(drcpVar.b);
                final ewbp ewbpVar = ewbp.CREATE_REQUEST;
                exca excaVar = exca.a;
                final boolean z = geller.e.i;
                Iterator<E> it2 = ekhxVar.iterator();
                while (it2.hasNext()) {
                    geller.g((ewut) it2.next(), excaVar);
                }
                return eika.i(new eooy() { // from class: dree
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ekhx ekhxVar2 = ekhxVar;
                        String[] strArr = new String[ekhxVar2.size()];
                        ekqg ekqgVarListIterator = ekhxVar2.listIterator();
                        int i3 = 0;
                        while (ekqgVarListIterator.hasNext()) {
                            strArr[i3] = ((ewut) ekqgVarListIterator.next()).name();
                            i3++;
                        }
                        boolean z2 = z;
                        ewbp ewbpVar2 = ewbpVar;
                        String str = strB;
                        Geller geller2 = geller;
                        ewbo ewboVar = (ewbo) drep.a(geller2.nativeReadSnapshot(geller2.a(), geller2.c.a(str), strArr, ewbpVar2.c, z2), ewbo.a);
                        ekqg ekqgVarListIterator2 = ekhxVar2.listIterator();
                        while (ekqgVarListIterator2.hasNext()) {
                            ewut ewutVar2 = (ewut) ekqgVarListIterator2.next();
                            geller2.f(ewutVar2);
                            ewutVar2.name();
                        }
                        return eork.i(ewboVar);
                    }
                }, geller.b);
            }
        });
        ExecutorService executorService2 = this.g;
        return eooq.f(eooq.g(eooq.g(eoqtVarT, eoozVarD, executorService2), eiid.d(new eooz() { // from class: drcf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ewbo ewboVar = (ewbo) obj;
                ArrayList arrayList = new ArrayList(ewboVar.b.size());
                for (evzk evzkVar : ewboVar.b) {
                    final ewut ewutVarB = ewut.b(evzkVar.d);
                    if (ewutVarB == null) {
                        ewutVarB = ewut.UNKNOWN;
                    }
                    final ArrayList arrayList2 = new ArrayList((evzkVar.b == 2 ? (evzm) evzkVar.c : evzm.a).b);
                    final evtg evtgVar = (evzkVar.b == 2 ? (evzm) evzkVar.c : evzm.a).c;
                    if (ewutVarB.name().startsWith("ENCRYPTED_")) {
                        drcp drcpVar = this.a;
                        drab drabVar = (drab) ((ejwt) drcpVar.o).a;
                        arrayList.add(eooq.f(eooq.f(drabVar.c.a(drds.b(drcpVar.b)), eiid.a(new ejvr() { // from class: draa
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                dqzw dqzwVar = (dqzw) ((ejwi) obj2).f();
                                if (dqzwVar == null) {
                                    ((ekrd) ((ekrd) drab.a.i()).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 62, "EncryptionUtil.java")).q("Failed to fetch encryption key to encrypt Elements.");
                                    int i3 = ekgb.d;
                                    return ekoe.a;
                                }
                                List<ewuw> list = arrayList2;
                                ArrayList arrayList3 = new ArrayList(list.size());
                                for (ewuw ewuwVar : list) {
                                    if ((ewuwVar.b & 8) != 0) {
                                        ewux ewuxVar = (ewux) ewuy.a.createBuilder();
                                        try {
                                            evqe evqeVar = ewuwVar.e;
                                            if (evqeVar == null) {
                                                evqeVar = evqe.a;
                                            }
                                            evqs evqsVarX = evqs.x(new erum(dqzwVar.a()).b(evqeVar.toByteArray(), drab.b));
                                            ewuxVar.copyOnWrite();
                                            ewuy ewuyVar = (ewuy) ewuxVar.instance;
                                            ewuyVar.b |= 1;
                                            ewuyVar.c = evqsVarX;
                                            ewuxVar.copyOnWrite();
                                            ewuy ewuyVar2 = (ewuy) ewuxVar.instance;
                                            ewuyVar2.b |= 2;
                                            ewuyVar2.d = -1;
                                            ewuv ewuvVar = (ewuv) ewuwVar.toBuilder();
                                            evqd evqdVar = (evqd) evqe.a.createBuilder();
                                            evqdVar.copyOnWrite();
                                            ((evqe) evqdVar.instance).b = "type.googleapis.com/geller.oneplatform.GellerE2eeElement";
                                            evqs byteString = ((ewuy) ewuxVar.build()).toByteString();
                                            evqdVar.copyOnWrite();
                                            ((evqe) evqdVar.instance).c = byteString;
                                            ewuvVar.copyOnWrite();
                                            ewuw ewuwVar2 = (ewuw) ewuvVar.instance;
                                            evqe evqeVar2 = (evqe) evqdVar.build();
                                            evqeVar2.getClass();
                                            ewuwVar2.e = evqeVar2;
                                            ewuwVar2.b |= 8;
                                            arrayList3.add((ewuw) ewuvVar.build());
                                        } catch (Exception e) {
                                            ((ekrd) ((ekrd) ((ekrd) drab.a.i()).g(e)).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 'U', "EncryptionUtil.java")).q("Unexpected error when trying to encrypt element.");
                                        }
                                    } else {
                                        ((ekrd) ((ekrd) drab.a.i()).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 68, "EncryptionUtil.java")).q("Element to encrypt is missing data field.");
                                    }
                                }
                                return ekgb.n(arrayList3);
                            }
                        }), drabVar.d), eiid.a(new ejvr() { // from class: drch
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ekgb ekgbVarN = ekgb.n(evtgVar);
                                return new drae(ewutVarB, (ekgb) obj2, ekgbVarN);
                            }
                        }), drcpVar.g));
                    } else {
                        arrayList.add(eork.i(new drae(ewutVarB, ekgb.n(arrayList2), ekgb.n(evtgVar))));
                    }
                }
                return eork.e(arrayList);
            }
        }), executorService2), eiid.a(new ejvr() { // from class: drcg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejwi ejwiVarJ;
                ekgi ekgiVar = new ekgi();
                Iterator it2 = ((List) obj).iterator();
                long serializedSize = 0;
                while (it2.hasNext()) {
                    ewvn ewvnVar2 = ewvnVar;
                    drai draiVar = (drai) it2.next();
                    ewut ewutVarC = draiVar.c();
                    ekgb<ewuw> ekgbVarB = draiVar.b();
                    final ekgb<ewuw> ekgbVarA = draiVar.a();
                    ekrg ekrgVar = drcp.a;
                    Iterator it3 = it2;
                    long j = serializedSize;
                    ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1034, "GellerSyncClient.java")).I("There are %d elements to be updated on the server for corpus %s and with the reason %s.", Integer.valueOf(ekgbVarB.size()), new dziu(ewutVarC).a, new dziu(ewvnVar2).a);
                    ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1040, "GellerSyncClient.java")).t("Elements to update: %s", ekjz.g(ekgbVarB, new drbd()));
                    ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1044, "GellerSyncClient.java")).I("There are %d elements to delete from the server for corpus %s and with the reason %s.", Integer.valueOf(ekgbVarA.size()), new dziu(ewutVarC).a, new dziu(ewvnVar2).a);
                    ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1050, "GellerSyncClient.java")).t("Elements to delete: %s", new ekri() { // from class: drbo
                        @Override // defpackage.ekri
                        public final Object a() {
                            return ekjz.g(ekgbVarA, new drbd());
                        }
                    });
                    if (ekgbVarA.isEmpty() && ekgbVarB.isEmpty()) {
                        ejwiVarJ = ejud.a;
                    } else {
                        ewul ewulVar = (ewul) ewum.a.createBuilder();
                        long serializedSize2 = j;
                        for (ewuw ewuwVar : ekgbVarA) {
                            long j2 = serializedSize2;
                            if (j2 + ewuwVar.getSerializedSize() <= 3670016.0d) {
                                ewulVar.copyOnWrite();
                                ewum ewumVar = (ewum) ewulVar.instance;
                                ewuwVar.getClass();
                                evtg evtgVar = ewumVar.g;
                                if (!evtgVar.c()) {
                                    ewumVar.g = evsn.mutableCopy(evtgVar);
                                }
                                ewumVar.g.add(ewuwVar);
                                serializedSize2 = j2 + ewuwVar.getSerializedSize();
                            } else {
                                ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPaginatedPartForUpload", 1085, "GellerSyncClient.java")).t("Unable to fit deleted element into current page for corpus %s", ewutVarC.name());
                                serializedSize2 = j2;
                            }
                        }
                        for (ewuw ewuwVar2 : ekgbVarB) {
                            long j3 = serializedSize2;
                            if (j3 + ewuwVar2.getSerializedSize() <= 3670016.0d) {
                                ewulVar.copyOnWrite();
                                ewum ewumVar2 = (ewum) ewulVar.instance;
                                ewuwVar2.getClass();
                                evtg evtgVar2 = ewumVar2.f;
                                if (!evtgVar2.c()) {
                                    ewumVar2.f = evsn.mutableCopy(evtgVar2);
                                }
                                ewumVar2.f.add(ewuwVar2);
                                serializedSize2 = j3 + ewuwVar2.getSerializedSize();
                            } else {
                                ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPaginatedPartForUpload", 1094, "GellerSyncClient.java")).t("Unable to fit element into current page for corpus %s", ewutVarC.name());
                                serializedSize2 = j3;
                            }
                        }
                        ewulVar.copyOnWrite();
                        ewum ewumVar3 = (ewum) ewulVar.instance;
                        ewumVar3.c = ewutVarC.dC;
                        ewumVar3.b |= 1;
                        ejwiVarJ = ejwi.j((ewum) ewulVar.build());
                    }
                    if (ejwiVarJ.g()) {
                        ekgiVar.i(ewutVarC, ejwiVarJ.c());
                        serializedSize = j + ((evsn) ejwiVarJ.c()).getSerializedSize();
                    } else {
                        serializedSize = j;
                    }
                    it2 = it3;
                }
                return ekgiVar.c();
            }
        }), executorService2);
    }

    public final ListenableFuture b(final drbb drbbVar, final dqzt dqztVar, final int i, final ewun ewunVar, final Map map, final Map map2, final Map map3) {
        ListenableFuture listenableFutureA;
        this.p++;
        ejxm ejxmVar = this.n;
        ejxmVar.e();
        ejxmVar.f();
        if (ewunVar.c.size() == 0) {
            ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncClient", "batchSync", 772, "GellerSyncClient.java")).q("Created batch sync request with no parts, returning immediately.");
            listenableFutureA = eork.i(ewur.a);
        } else {
            String str = this.q;
            ekrg ekrgVar = drbb.a;
            ((ekrd) ((ekrd) ekrgVar.d()).h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "batchSync", 42, "GellerOnePlatformClient.java")).q("Sending geller batch sync request");
            ((ekrd) ((ekrd) ekrgVar.g()).h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "batchSync", 43, "GellerOnePlatformClient.java")).t("Request details: %s", ewunVar);
            ewva ewvaVar = (ewva) ((ewva) ewva.h(new ewuz(), drbbVar.b)).k(evwy.b(drbbVar.c), TimeUnit.MILLISECONDS);
            drbbVar.d.booleanValue();
            ewva ewvaVar2 = (ewva) ewvaVar.j("gzip");
            if (str != null) {
                ewvaVar2 = (ewva) ewvaVar2.i(new fbtx(ejbe.d(new ejas(str, null))));
            }
            fbrk fbrkVarA = ewvb.a;
            if (fbrkVarA == null) {
                synchronized (ewvb.class) {
                    fbrkVarA = ewvb.a;
                    if (fbrkVarA == null) {
                        fbrh fbrhVarA = fbrk.a();
                        fbrhVarA.c = fbrj.UNARY;
                        fbrhVarA.d = fbrk.c("geller.oneplatform.GellerService", "BatchSync");
                        fbrhVarA.b();
                        ewun ewunVar2 = ewun.a;
                        evrr evrrVar = fcrj.a;
                        fbrhVarA.a = new fcrh(ewunVar2);
                        fbrhVarA.b = new fcrh(ewur.a);
                        fbrkVarA = fbrhVarA.a();
                        ewvb.a = fbrkVarA;
                    }
                }
            }
            listenableFutureA = fcrw.a(ewvaVar2.a.a(fbrkVarA, ewvaVar2.b), ewunVar);
        }
        return eiju.g(listenableFutureA).i(eiid.d(new eooz() { // from class: drca
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Map map4;
                final drcp drcpVar;
                int i2;
                Object obj2;
                Iterator it;
                final ewur ewurVar = (ewur) obj;
                Iterator<E> it2 = ewurVar.b.iterator();
                while (true) {
                    map4 = map3;
                    drcpVar = this.a;
                    i2 = 2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    ewuq ewuqVar = (ewuq) it2.next();
                    ewut ewutVarB = ewut.b(ewuqVar.d);
                    if (ewutVarB == null) {
                        ewutVarB = ewut.UNKNOWN;
                    }
                    if (drds.c(drds.b(drcpVar.b), ewutVarB, drcpVar.c)) {
                        map4.put(ewutVarB, ewuqVar.b == 2 ? (ewvt) ewuqVar.c : ewvt.a);
                    }
                }
                ArrayList arrayList = new ArrayList(ewurVar.b.size());
                Iterator it3 = ewurVar.b.iterator();
                while (it3.hasNext()) {
                    final ewuq ewuqVar2 = (ewuq) it3.next();
                    ewut ewutVarB2 = ewut.b(ewuqVar2.d);
                    if (ewutVarB2 == null) {
                        ewutVarB2 = ewut.UNKNOWN;
                    }
                    if (ewutVarB2.name().startsWith("ENCRYPTED_")) {
                        int i3 = ewuqVar2.b;
                        if (i3 == 1) {
                            arrayList.add(eork.i(ewuqVar2));
                        } else {
                            final ewvt ewvtVar = i3 == i2 ? (ewvt) ewuqVar2.c : ewvt.a;
                            ejwi ejwiVar = drcpVar.o;
                            ejwi ejwiVar2 = drcpVar.b;
                            evtg evtgVar = ewvtVar.e;
                            String strB = drds.b(ejwiVar2);
                            ArrayList arrayList2 = new ArrayList(evtgVar.size());
                            Iterator<E> it4 = evtgVar.iterator();
                            while (true) {
                                obj2 = ((ejwt) ejwiVar).a;
                                if (!it4.hasNext()) {
                                    break;
                                }
                                final ewuw ewuwVar = (ewuw) it4.next();
                                evqe evqeVar = ewuwVar.e;
                                if (evqeVar == null) {
                                    evqeVar = evqe.a;
                                }
                                if (evqeVar.b.equals("type.googleapis.com/geller.oneplatform.GellerE2eeElement")) {
                                    it = it3;
                                    try {
                                        evqe evqeVar2 = ewuwVar.e;
                                        if (evqeVar2 == null) {
                                            evqeVar2 = evqe.a;
                                        }
                                        final ewuy ewuyVar = (ewuy) evsn.parseFrom(ewuy.a, evqeVar2.c, evrr.a());
                                        dqzx dqzxVar = ((drab) obj2).c;
                                        int i4 = ewuyVar.d;
                                        arrayList2.add(eooq.f(((drac) dqzxVar).a(strB), eiid.a(new ejvr() { // from class: dqzy
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj3) {
                                                ewuy ewuyVar2 = ewuyVar;
                                                ewuw ewuwVar2 = ewuwVar;
                                                try {
                                                    dqzw dqzwVar = (dqzw) ((ejwi) obj3).f();
                                                    if (dqzwVar == null) {
                                                        ((ekrd) ((ekrd) drab.a.i()).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", 127, "EncryptionUtil.java")).q("Failed to find matching encryption key to decrypt Element.");
                                                        return ejud.a;
                                                    }
                                                    evqe evqeVar3 = (evqe) evsn.parseFrom(evqe.a, new erum(dqzwVar.a()).a(ewuyVar2.c.I(), drab.b), evrr.a());
                                                    ewuv ewuvVar = (ewuv) ewuwVar2.toBuilder();
                                                    ewuvVar.copyOnWrite();
                                                    ewuw ewuwVar3 = (ewuw) ewuvVar.instance;
                                                    evqeVar3.getClass();
                                                    ewuwVar3.e = evqeVar3;
                                                    ewuwVar3.b |= 8;
                                                    return ejwi.j((ewuw) ewuvVar.build());
                                                } catch (Exception e) {
                                                    ((ekrd) ((ekrd) ((ekrd) drab.a.i()).g(e)).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 139, "EncryptionUtil.java")).q("Unexpected error when trying to decrypt encrypted element.");
                                                    return ejud.a;
                                                }
                                            }
                                        }), ((drab) obj2).d));
                                    } catch (Exception e) {
                                        ((ekrd) ((ekrd) ((ekrd) drab.a.i()).g(e)).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 146, "EncryptionUtil.java")).q("Unexpected error when trying to parse encrypted element, skipping element.");
                                    }
                                } else {
                                    it = it3;
                                    ((ekrd) ((ekrd) drab.a.i()).h("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", 110, "EncryptionUtil.java")).q("Trying to decrypt Element with unexpected data type url, skipping element.");
                                }
                                it3 = it;
                            }
                            arrayList.add(eooq.f(eooq.f(eork.e(arrayList2), eiid.a(new ejvr() { // from class: dqzz
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    List<ejwi> list = (List) obj3;
                                    ArrayList arrayList3 = new ArrayList(list.size());
                                    for (ejwi ejwiVar3 : list) {
                                        if (ejwiVar3.g()) {
                                            arrayList3.add((ewuw) ejwiVar3.c());
                                        }
                                    }
                                    return ekgb.n(arrayList3);
                                }
                            }), ((drab) obj2).d), eiid.a(new ejvr() { // from class: drco
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    ekgb ekgbVar = (ekgb) obj3;
                                    ewup ewupVar = (ewup) ewuqVar2.toBuilder();
                                    ewvs ewvsVar = (ewvs) ewvtVar.toBuilder();
                                    ewvsVar.copyOnWrite();
                                    ((ewvt) ewvsVar.instance).e = ewvt.emptyProtobufList();
                                    ewvsVar.copyOnWrite();
                                    ewvt ewvtVar2 = (ewvt) ewvsVar.instance;
                                    evtg evtgVar2 = ewvtVar2.e;
                                    if (!evtgVar2.c()) {
                                        ewvtVar2.e = evsn.mutableCopy(evtgVar2);
                                    }
                                    evpz.addAll(ekgbVar, ewvtVar2.e);
                                    ewvt ewvtVar3 = (ewvt) ewvsVar.build();
                                    ewupVar.copyOnWrite();
                                    ewuq ewuqVar3 = (ewuq) ewupVar.instance;
                                    ewvtVar3.getClass();
                                    ewuqVar3.c = ewvtVar3;
                                    ewuqVar3.b = 2;
                                    return (ewuq) ewupVar.build();
                                }
                            }), drcpVar.g));
                            it3 = it3;
                            i2 = 2;
                        }
                    } else {
                        arrayList.add(eork.i(ewuqVar2));
                    }
                }
                final Map map5 = map2;
                final Map map6 = map;
                final int i5 = i;
                final dqzt dqztVar2 = dqztVar;
                final drbb drbbVar2 = drbbVar;
                final ewun ewunVar3 = ewunVar;
                ListenableFuture listenableFutureE = eork.e(arrayList);
                ejvr ejvrVarA = eiid.a(new ejvr() { // from class: drbe
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj3) {
                        List list = (List) obj3;
                        ewuo ewuoVar = (ewuo) ewur.a.createBuilder();
                        ewuoVar.copyOnWrite();
                        ewur ewurVar2 = (ewur) ewuoVar.instance;
                        evtg evtgVar2 = ewurVar2.b;
                        if (!evtgVar2.c()) {
                            ewurVar2.b = evsn.mutableCopy(evtgVar2);
                        }
                        evpz.addAll(list, ewurVar2.b);
                        return (ewur) ewuoVar.build();
                    }
                });
                ExecutorService executorService = drcpVar.g;
                return eooq.g(eoqt.t(eooh.f(eooq.g(eoqt.t(eooq.f(listenableFutureE, ejvrVarA, executorService)), eiid.d(new eooz() { // from class: drbw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj3) {
                        drcp drcpVar2 = drcpVar;
                        final drba drbaVar = new drba(drds.b(drcpVar2.b), drcpVar2.c, new drad(ewunVar3, (ewur) obj3), drcpVar2.i, drcpVar2.g);
                        final HashMap map7 = new HashMap();
                        ewur ewurVar2 = ((drad) drbaVar.c).b;
                        for (ewuq ewuqVar3 : ewurVar2.b) {
                            ewut ewutVarB3 = ewut.b(ewuqVar3.d);
                            if (ewutVarB3 == null) {
                                ewutVarB3 = ewut.UNKNOWN;
                            }
                            ewvv ewvvVar = ewuqVar3.e;
                            if (ewvvVar == null) {
                                ewvvVar = ewvv.a;
                            }
                            if ((ewvvVar.b & 1) != 0) {
                                if (ewvvVar.c) {
                                    map7.put(ewutVarB3, Status.b);
                                } else {
                                    ((ekrd) ((ekrd) drba.a.j()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "processResult", 105, "GellerBatchSyncResultWriter.java")).t("Upload failed for corpus:%s", ewutVarB3.name());
                                    drbaVar.a(ewutVarB3).g(new drcq("Failed to upload data"));
                                    map7.put(ewutVarB3, ewuqVar3.b == 1 ? Status.fromCodeValue(((exmy) ewuqVar3.c).b) : Status.d);
                                    ewutVarB3.name();
                                }
                            }
                            if (ewuqVar3.b == 1) {
                                ((ekrd) ((ekrd) drba.a.j()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "processResult", 116, "GellerBatchSyncResultWriter.java")).I("There was an error when syncing corpus: %s. Error message: %s. Error code: %d.", ewutVarB3.name(), (ewuqVar3.b == 1 ? (exmy) ewuqVar3.c : exmy.a).c, Integer.valueOf((ewuqVar3.b == 1 ? (exmy) ewuqVar3.c : exmy.a).b));
                                drdl drdlVarA = drbaVar.a(ewutVarB3);
                                int i6 = ewuqVar3.b;
                                drdlVarA.g(new drcq((i6 == 1 ? (exmy) ewuqVar3.c : exmy.a).c, new StatusException(Status.fromCodeValue((i6 == 1 ? (exmy) ewuqVar3.c : exmy.a).b))));
                                map7.put(ewutVarB3, Status.fromCodeValue((ewuqVar3.b == 1 ? (exmy) ewuqVar3.c : exmy.a).b));
                                ewutVarB3.name();
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        final HashSet hashSet = new HashSet();
                        for (final ewuq ewuqVar4 : ewurVar2.b) {
                            final ewut ewutVarB4 = ewut.b(ewuqVar4.d);
                            if (ewutVarB4 == null) {
                                ewutVarB4 = ewut.UNKNOWN;
                            }
                            arrayList3.add(eika.i(new eooy() { // from class: drat
                                @Override // defpackage.eooy
                                public final ListenableFuture a() {
                                    ListenableFuture listenableFutureF;
                                    final drba drbaVar2 = drbaVar;
                                    final ewut ewutVar = ewutVarB4;
                                    Geller geller = drbaVar2.e;
                                    String str2 = drbaVar2.f;
                                    if (drds.c(str2, ewutVar, geller)) {
                                        return eorv.a;
                                    }
                                    ((ekrd) ((ekrd) drba.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "maybeWipeoutBeforeCommit", 230, "GellerBatchSyncResultWriter.java")).t("Checking corpus for wipeout: %s", ewutVar);
                                    if (drba.b.contains(ewutVar)) {
                                        int i7 = ekgb.d;
                                        listenableFutureF = eooq.f(eoqt.t(geller.c(str2, ewutVar, ekoe.a)), eiid.a(new ejvr() { // from class: drao
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj4) {
                                                ((ekrd) ((ekrd) drba.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "maybeWipeoutBeforeCommit", 239, "GellerBatchSyncResultWriter.java")).t("Cleared data for corpus %s", ewutVar);
                                                return null;
                                            }
                                        }), drbaVar2.g);
                                    } else {
                                        listenableFutureF = eorv.a;
                                    }
                                    final Set set = hashSet;
                                    final ewuq ewuqVar5 = ewuqVar4;
                                    eiju eijuVarG = eiju.g(listenableFutureF);
                                    eooz eoozVar = new eooz() { // from class: drak
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            ewuq ewuqVar6 = ewuqVar5;
                                            final ewvt ewvtVar2 = ewuqVar6.b == 2 ? (ewvt) ewuqVar6.c : ewvt.a;
                                            ejya ejyaVar = ejsz.a;
                                            final ejxm ejxmVarC = ejxm.c(ejyaVar);
                                            final ejxm ejxmVar2 = new ejxm(ejyaVar);
                                            ewut ewutVarB5 = ewut.b(ewvtVar2.c);
                                            if (ewutVarB5 == null) {
                                                ewutVarB5 = ewut.UNKNOWN;
                                            }
                                            final ewut ewutVar2 = ewutVarB5;
                                            drba drbaVar3 = drbaVar2;
                                            final ewut ewutVar3 = ewutVar;
                                            final Geller geller2 = drbaVar3.e;
                                            geller2.f(ewutVar2);
                                            ejwl.m(true, "update() not allowed if Geller is read-only");
                                            final String str3 = drbaVar3.f;
                                            return eiju.g(eika.h(new Callable() { // from class: drei
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    Geller geller3 = geller2;
                                                    ejxm ejxmVar3 = ejxmVar2;
                                                    String str4 = str3;
                                                    ewvt ewvtVar3 = ewvtVar2;
                                                    ewut ewutVar4 = ewutVar2;
                                                    ejxm ejxmVar4 = ejxmVarC;
                                                    try {
                                                        ejxmVar3.f();
                                                        return ekhx.p(geller3.nativeUpdate(geller3.a(), geller3.c.a(str4), ewvtVar3.toByteArray()));
                                                    } finally {
                                                        geller3.f(ewutVar4);
                                                        ejxmVar3.a(TimeUnit.MILLISECONDS);
                                                        geller3.f(ewutVar4);
                                                        ejxmVar4.a(TimeUnit.MILLISECONDS);
                                                    }
                                                }
                                            }, geller2.b)).h(new ejvr() { // from class: draq
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj5) {
                                                    ekhx ekhxVar = (ekhx) obj5;
                                                    ((ekrd) ((ekrd) drba.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "commitDownloadedElements", 311, "GellerBatchSyncResultWriter.java")).D("Successfully wrote elements: %s for corpus %s to geller database.", ekhxVar, ewutVar3.name());
                                                    return ekhxVar;
                                                }
                                            }, drbaVar3.h);
                                        }
                                    };
                                    ExecutorService executorService2 = drbaVar2.h;
                                    return eijuVarG.i(eoozVar, executorService2).i(new eooz() { // from class: drar
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            drba drbaVar3 = drbaVar2;
                                            ewut ewutVar2 = ewutVar;
                                            drbaVar3.a(ewutVar2).e((Set) obj4);
                                            set.add(ewutVar2);
                                            return eorv.a;
                                        }
                                    }, executorService2).f(Exception.class, new eooz() { // from class: dras
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            Exception exc = (Exception) obj4;
                                            drba drbaVar3 = drbaVar2;
                                            ewut ewutVar2 = ewutVar;
                                            drbaVar3.a(ewutVar2).g(new drcq("Failed to commit downloads to the database: ".concat(String.valueOf(exc.getMessage())), exc));
                                            ewutVar2.name();
                                            return eorv.a;
                                        }
                                    }, executorService2);
                                }
                            }, drbaVar.g));
                        }
                        eorg eorgVarA = eork.a(arrayList3);
                        Callable callableL = eiid.l(new Callable() { // from class: drau
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ((ekrd) ((ekrd) drba.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "writeDownloadedElementsToDatabase", 210, "GellerBatchSyncResultWriter.java")).q("Finished committing downloads to the database.");
                                HashMap map8 = new HashMap();
                                ewur ewurVar3 = ((drad) drbaVar.c).b;
                                for (ewuq ewuqVar5 : ewurVar3.b) {
                                    if (ewuqVar5.b == 2) {
                                        ewut ewutVarB5 = ewut.b(ewuqVar5.d);
                                        if (ewutVarB5 == null) {
                                            ewutVarB5 = ewut.UNKNOWN;
                                        }
                                        map8.put(ewutVarB5, ((ewvt) ewuqVar5.c).e);
                                    }
                                }
                                HashMap map9 = new HashMap();
                                for (ewuq ewuqVar6 : ewurVar3.b) {
                                    if (ewuqVar6.b == 2) {
                                        ewut ewutVarB6 = ewut.b(ewuqVar6.d);
                                        if (ewutVarB6 == null) {
                                            ewutVarB6 = ewut.UNKNOWN;
                                        }
                                        map9.put(ewutVarB6, ((ewvt) ewuqVar6.c).f);
                                    }
                                }
                                return null;
                            }
                        });
                        ExecutorService executorService2 = drbaVar.h;
                        return eooq.f(eooq.g(eoqt.t(eorgVarA.a(callableL, executorService2)), eiid.d(new eooz() { // from class: drax
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj4) {
                                Map map8 = map7;
                                if (map8.isEmpty()) {
                                    return eorv.a;
                                }
                                final drba drbaVar2 = drbaVar;
                                ArrayList arrayList4 = new ArrayList();
                                for (final ewum ewumVar : ((drad) drbaVar2.c).a.c) {
                                    final ewut ewutVarB5 = ewut.b(ewumVar.c);
                                    if (ewutVarB5 == null) {
                                        ewutVarB5 = ewut.UNKNOWN;
                                    }
                                    if (map8.containsKey(ewutVarB5) && ((Status) map8.get(ewutVarB5)).f()) {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (final ewuw ewuwVar2 : ewumVar.g) {
                                            Geller geller = drbaVar2.e;
                                            if (geller.e.c) {
                                                String str2 = ewuwVar2.d;
                                                ewci ewciVar = ewuwVar2.c;
                                                if (ewciVar == null) {
                                                    ewciVar = ewci.a;
                                                }
                                                arrayList5.add(eork.i(drdx.c(str2, ewciVar.c)));
                                            } else {
                                                String str3 = drbaVar2.f;
                                                ewut ewutVarB6 = ewut.b(ewumVar.c);
                                                if (ewutVarB6 == null) {
                                                    ewutVarB6 = ewut.UNKNOWN;
                                                }
                                                String str4 = ewuwVar2.d;
                                                ewci ewciVar2 = ewuwVar2.c;
                                                if (ewciVar2 == null) {
                                                    ewciVar2 = ewci.a;
                                                }
                                                arrayList5.add(eooq.f(geller.c(str3, ewutVarB6, ekgb.r(drdx.c(str4, ewciVar2.c))), eiid.a(new ejvr() { // from class: drav
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj5) {
                                                        ekrd ekrdVar = (ekrd) ((ekrd) drba.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "commitUploadedDeletions", 356, "GellerBatchSyncResultWriter.java");
                                                        ewuw ewuwVar3 = ewuwVar2;
                                                        String str5 = ewuwVar3.d;
                                                        ewci ewciVar3 = ewuwVar3.c;
                                                        if (ewciVar3 == null) {
                                                            ewciVar3 = ewci.a;
                                                        }
                                                        ewum ewumVar2 = ewumVar;
                                                        Long lValueOf = Long.valueOf(ewciVar3.c);
                                                        ewut ewutVarB7 = ewut.b(ewumVar2.c);
                                                        if (ewutVarB7 == null) {
                                                            ewutVarB7 = ewut.UNKNOWN;
                                                        }
                                                        ekrdVar.J("Removed element with key %s and timestamp %d for corpus %s for account %s.", str5, lValueOf, ewutVarB7.name(), drbaVar2.f);
                                                        String str6 = ewuwVar3.d;
                                                        ewci ewciVar4 = ewuwVar3.c;
                                                        if (ewciVar4 == null) {
                                                            ewciVar4 = ewci.a;
                                                        }
                                                        return drdx.c(str6, ewciVar4.c);
                                                    }
                                                }), drbaVar2.g));
                                            }
                                        }
                                        eoqt eoqtVarT = eoqt.t(eork.o(arrayList5));
                                        ejvr ejvrVarA2 = eiid.a(new ejvr() { // from class: draw
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj5) {
                                                ArrayList arrayList6 = new ArrayList();
                                                for (drdx drdxVar : (List) obj5) {
                                                    if (drdxVar != null) {
                                                        arrayList6.add(drdxVar);
                                                    }
                                                }
                                                ewut ewutVar = ewutVarB5;
                                                drba drbaVar3 = drbaVar2;
                                                drbaVar3.e.b(drbaVar3.f, ewutVar, drba.b(3, arrayList6));
                                                return null;
                                            }
                                        });
                                        ExecutorService executorService3 = drbaVar2.g;
                                        ListenableFuture listenableFutureF = eooq.f(eoqt.t(eooq.f(eoqtVarT, ejvrVarA2, executorService3)), eiid.a(new ejvr() { // from class: draz
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj5) {
                                                ArrayList arrayList6 = new ArrayList();
                                                ArrayList arrayList7 = new ArrayList();
                                                ewum ewumVar2 = ewumVar;
                                                for (ewuw ewuwVar3 : ewumVar2.f) {
                                                    String str5 = ewuwVar3.d;
                                                    ewci ewciVar3 = ewuwVar3.c;
                                                    if (ewciVar3 == null) {
                                                        ewciVar3 = ewci.a;
                                                    }
                                                    arrayList6.add(drdx.c(str5, ewciVar3.c));
                                                    arrayList7.add(ewuwVar3.d);
                                                }
                                                ewut ewutVar = ewutVarB5;
                                                drba drbaVar3 = drbaVar2;
                                                ewbc ewbcVarB = drba.b(1, arrayList6);
                                                Geller geller2 = drbaVar3.e;
                                                String str6 = drbaVar3.f;
                                                long jB = geller2.b(str6, ewutVar, ewbcVarB);
                                                ekrd ekrdVar = (ekrd) ((ekrd) drba.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "commitUploadedElements", 332, "GellerBatchSyncResultWriter.java");
                                                Long lValueOf = Long.valueOf(jB);
                                                ewut ewutVarB7 = ewut.b(ewumVar2.c);
                                                if (ewutVarB7 == null) {
                                                    ewutVarB7 = ewut.UNKNOWN;
                                                }
                                                ekrdVar.I("Marked %d elements as successfully uploaded for corpus %s for account %s", lValueOf, ewutVarB7.name(), str6);
                                                return arrayList7;
                                            }
                                        }), executorService3);
                                        ejvr ejvrVarA3 = eiid.a(new ejvr() { // from class: dral
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj5) {
                                                drbaVar2.a(ewutVarB5).f((List) obj5);
                                                return true;
                                            }
                                        });
                                        ExecutorService executorService4 = drbaVar2.h;
                                        arrayList4.add(eooh.f(eooq.f(listenableFutureF, ejvrVarA3, executorService4), Exception.class, eiid.a(new ejvr() { // from class: dram
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj5) {
                                                Exception exc = (Exception) obj5;
                                                drba drbaVar3 = drbaVar2;
                                                ewut ewutVar = ewutVarB5;
                                                drbaVar3.a(ewutVar).g(new drcq("Failed to commit uploads to the database: ".concat(String.valueOf(exc.getMessage())), exc));
                                                ewutVar.name();
                                                return false;
                                            }
                                        }), executorService4));
                                    }
                                }
                                return eork.a(arrayList4).a(eiid.l(new Callable() { // from class: dran
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ((ekrd) ((ekrd) drba.a.e()).h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "updateDatabaseForUploadedElements", 300, "GellerBatchSyncResultWriter.java")).q("Finished committing uploads to the database.");
                                        return null;
                                    }
                                }), drbaVar2.h);
                            }
                        }), executorService2), new ejvr() { // from class: dray
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj4) {
                                HashMap map8 = new HashMap();
                                for (Map.Entry entry : drbaVar.d.entrySet()) {
                                    map8.put((ewut) entry.getKey(), ((drdl) entry.getValue()).a());
                                }
                                return map8;
                            }
                        }, executorService2);
                    }
                }), executorService), Exception.class, eiid.a(new ejvr() { // from class: drbx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj3) {
                        Exception exc = (Exception) obj3;
                        int i6 = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        Iterator<E> it5 = ewunVar3.c.iterator();
                        while (it5.hasNext()) {
                            ewut ewutVarB3 = ewut.b(((ewum) it5.next()).c);
                            if (ewutVarB3 == null) {
                                ewutVarB3 = ewut.UNKNOWN;
                            }
                            ekfwVar.h(ewutVarB3);
                        }
                        return drcp.d(ekfwVar.g(), exc, "Failed to decrypt the elements of the corpora requiring e2ee: ".concat(String.valueOf(exc.getMessage())));
                    }
                }), executorService)), eiid.d(new eooz() { // from class: drby
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj3) {
                        final int i6;
                        final Map map7 = (Map) obj3;
                        final drcp drcpVar2 = drcpVar;
                        drcpVar2.n.a(TimeUnit.MILLISECONDS);
                        final TreeSet treeSet = new TreeSet();
                        final HashMap map8 = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        final ewur ewurVar2 = ewurVar;
                        Iterator<E> it5 = ewurVar2.b.iterator();
                        while (true) {
                            i6 = i5;
                            if (!it5.hasNext()) {
                                break;
                            }
                            ewuq ewuqVar3 = (ewuq) it5.next();
                            ewut ewutVarB3 = ewut.b(ewuqVar3.d);
                            if (ewutVarB3 == null) {
                                ewutVarB3 = ewut.UNKNOWN;
                            }
                            if (map7.containsKey(ewutVarB3) && ((drdm) map7.get(ewutVarB3)).b().isEmpty()) {
                                treeSet.add(ewutVarB3);
                                if (((ewuqVar3.b == 2 ? (ewvt) ewuqVar3.c : ewvt.a).b & 32) != 0) {
                                    arrayList3.add((ewuqVar3.b == 2 ? (ewvt) ewuqVar3.c : ewvt.a).g);
                                }
                                if (!(ewuqVar3.b == 2 ? (ewvt) ewuqVar3.c : ewvt.a).d.isEmpty() && i6 != 3) {
                                    ewul ewulVar = (ewul) ewum.a.createBuilder();
                                    ewulVar.copyOnWrite();
                                    ewum ewumVar = (ewum) ewulVar.instance;
                                    ewumVar.c = ewutVarB3.dC;
                                    ewumVar.b |= 1;
                                    String str2 = (ewuqVar3.b == 2 ? (ewvt) ewuqVar3.c : ewvt.a).d;
                                    ewulVar.copyOnWrite();
                                    ewum ewumVar2 = (ewum) ewulVar.instance;
                                    str2.getClass();
                                    ewumVar2.b |= 4;
                                    ewumVar2.e = str2;
                                    map8.put(ewutVarB3, (ewum) ewulVar.build());
                                }
                            }
                        }
                        final ewun ewunVar4 = ewunVar3;
                        ewvl ewvlVar = ewunVar4.e;
                        if (ewvlVar == null) {
                            ewvlVar = ewvl.a;
                        }
                        final ewvk ewvkVar = (ewvk) ewvlVar.toBuilder();
                        evsl evslVar = ewvx.b;
                        ewvkVar.d(evslVar);
                        ewvw ewvwVar = (ewvw) ewvx.a.createBuilder();
                        ewvwVar.copyOnWrite();
                        ewvx ewvxVar = (ewvx) ewvwVar.instance;
                        evtg evtgVar2 = ewvxVar.c;
                        if (!evtgVar2.c()) {
                            ewvxVar.c = evsn.mutableCopy(evtgVar2);
                        }
                        evpz.addAll(arrayList3, ewvxVar.c);
                        ewvkVar.e(evslVar, (ewvx) ewvwVar.build());
                        ewvn ewvnVarB = ewvn.b(((ewvl) ewvkVar.instance).c);
                        if (ewvnVarB == null) {
                            ewvnVarB = ewvn.UNKNOWN_REQUEST_REASON;
                        }
                        final Map map9 = map4;
                        final Map map10 = map5;
                        final Map map11 = map6;
                        final dqzt dqztVar3 = dqztVar2;
                        final drbb drbbVar3 = drbbVar2;
                        eoqt eoqtVarT = eoqt.t(eooq.f(eoqt.t(drcpVar2.a(treeSet, dqztVar3, i6, ewvnVarB)), eiid.a(new ejvr() { // from class: drbp
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj4) {
                                ekgp ekgpVar = (ekgp) obj4;
                                ewvl ewvlVar2 = (ewvl) ewvkVar.build();
                                drcp drcpVar3 = drcpVar2;
                                int i7 = i6;
                                return drcpVar3.c(treeSet, ewvlVar2, i7, map8, ekgpVar, ejwi.j(ewunVar4), ejwi.j(map7));
                            }
                        }), drcpVar2.h));
                        eooz eoozVarD = eiid.d(new eooz() { // from class: drcl
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj4) {
                                Map map12;
                                Map map13;
                                drcp drcpVar3;
                                ewun ewunVar5 = (ewun) obj4;
                                Iterator<E> it6 = ewurVar2.b.iterator();
                                while (true) {
                                    map12 = map10;
                                    map13 = map11;
                                    drcpVar3 = drcpVar2;
                                    if (!it6.hasNext()) {
                                        break;
                                    }
                                    ewuq ewuqVar4 = (ewuq) it6.next();
                                    Map map14 = drcpVar3.m;
                                    ewut ewutVarB4 = ewut.b(ewuqVar4.d);
                                    if (ewutVarB4 == null) {
                                        ewutVarB4 = ewut.UNKNOWN;
                                    }
                                    if (map14.containsKey(ewutVarB4)) {
                                        ewut ewutVarB5 = ewut.b(ewuqVar4.d);
                                        if (ewutVarB5 == null) {
                                            ewutVarB5 = ewut.UNKNOWN;
                                        }
                                        if (ewuqVar4.b == 1) {
                                            map13.remove(ewutVarB5);
                                        } else {
                                            List arrayList4 = map13.containsKey(ewutVarB5) ? (List) map13.get(ewutVarB5) : new ArrayList();
                                            arrayList4.addAll((ewuqVar4.b == 2 ? (ewvt) ewuqVar4.c : ewvt.a).e);
                                            map13.put(ewutVarB5, arrayList4);
                                            List arrayList5 = map12.containsKey(ewutVarB5) ? (List) map12.get(ewutVarB5) : new ArrayList();
                                            arrayList5.addAll((ewuqVar4.b == 2 ? (ewvt) ewuqVar4.c : ewvt.a).f);
                                            map12.put(ewutVarB5, arrayList5);
                                        }
                                    }
                                }
                                final Map map15 = map7;
                                if (ewunVar5.c.size() == 0) {
                                    return eork.i(map15);
                                }
                                Map map16 = map9;
                                return eooq.f(drcpVar3.b(drbbVar3, dqztVar3, i6, ewunVar5, map13, map12, map16), eiid.a(new ejvr() { // from class: drci
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj5) {
                                        Map map17 = (Map) obj5;
                                        HashMap map18 = new HashMap();
                                        Map map19 = map15;
                                        for (ewut ewutVar : map19.keySet()) {
                                            map18.put(ewutVar, map17.containsKey(ewutVar) ? ((drdm) map19.get(ewutVar)).f((drdm) map17.get(ewutVar)) : (drdm) map19.get(ewutVar));
                                        }
                                        return map18;
                                    }
                                }), drcpVar3.h);
                            }
                        });
                        ExecutorService executorService2 = drcpVar2.g;
                        return eooh.f(eooq.g(eoqtVarT, eoozVarD, executorService2), Exception.class, eiid.a(new ejvr() { // from class: drcm
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj4) {
                                Exception exc = (Exception) obj4;
                                TreeSet treeSet2 = new TreeSet();
                                Iterator<E> it6 = ewurVar2.b.iterator();
                                while (it6.hasNext()) {
                                    ewut ewutVarB4 = ewut.b(((ewuq) it6.next()).d);
                                    if (ewutVarB4 == null) {
                                        ewutVarB4 = ewut.UNKNOWN;
                                    }
                                    Map map12 = map7;
                                    if (map12.containsKey(ewutVarB4) && ((drdm) map12.get(ewutVarB4)).b().isEmpty()) {
                                        treeSet2.add(ewutVarB4);
                                    }
                                }
                                return drcp.d(treeSet2, exc, "Failed to construct follow up BatchSyncRequests: ".concat(String.valueOf(exc.getMessage())));
                            }
                        }), executorService2);
                    }
                }), drcpVar.h);
            }
        }), this.h).e(Exception.class, new ejvr() { // from class: drcb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Iterator<E> it = ewunVar.c.iterator();
                while (it.hasNext()) {
                    ewut ewutVarB = ewut.b(((ewum) it.next()).c);
                    if (ewutVarB == null) {
                        ewutVarB = ewut.UNKNOWN;
                    }
                    ekfwVar.h(ewutVarB);
                }
                return drcp.d(ekfwVar.g(), exc, "Geller batch sync rpc call failed: ".concat(String.valueOf(exc.getMessage())));
            }
        }, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02da  */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ewun c(java.util.Set r31, defpackage.ewvl r32, int r33, java.util.Map r34, java.util.Map r35, defpackage.ejwi r36, defpackage.ejwi r37) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drcp.c(java.util.Set, ewvl, int, java.util.Map, java.util.Map, ejwi, ejwi):ewun");
    }
}
