package com.google.android.libraries.geller.portable;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.drdx;
import defpackage.drej;
import defpackage.drek;
import defpackage.drel;
import defpackage.dreo;
import defpackage.drep;
import defpackage.drev;
import defpackage.eiid;
import defpackage.eiju;
import defpackage.eika;
import defpackage.ejsz;
import defpackage.ejud;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.ejwl;
import defpackage.ejxm;
import defpackage.ejya;
import defpackage.ekgb;
import defpackage.ekgi;
import defpackage.ekgp;
import defpackage.ekhx;
import defpackage.ekqh;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.eooz;
import defpackage.eork;
import defpackage.eoss;
import defpackage.evpc;
import defpackage.evsn;
import defpackage.evsz;
import defpackage.evta;
import defpackage.evtg;
import defpackage.evzn;
import defpackage.evzo;
import defpackage.evzx;
import defpackage.evzy;
import defpackage.evzz;
import defpackage.ewae;
import defpackage.ewaf;
import defpackage.ewag;
import defpackage.ewah;
import defpackage.ewai;
import defpackage.ewaj;
import defpackage.ewak;
import defpackage.ewap;
import defpackage.eway;
import defpackage.ewbc;
import defpackage.ewbk;
import defpackage.ewbm;
import defpackage.ewut;
import defpackage.ewuu;
import defpackage.exbw;
import defpackage.exca;
import defpackage.exci;
import defpackage.excw;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Geller {
    public static final ekrg a = ekrg.c("com/google/android/libraries/geller/portable/Geller");
    public final Executor b;
    public final drel c;
    public final GellerStorageOperationsCallback d;
    public final eway e;
    private final Executor f;
    private final Executor g;
    private volatile long h;
    private final Map i;
    private final GellerLoggingCallback j;
    private final ekgp k;

    public Geller(drek drekVar) {
        this.c = new GellerDatabaseManagerImpl(drekVar.a, drekVar.m, drekVar.f, drekVar.i, drekVar.j, drekVar.k, drekVar.l);
        this.i = drekVar.g.c();
        GellerLoggingCallback gellerLoggingCallback = drekVar.h;
        this.j = gellerLoggingCallback;
        this.f = drekVar.b;
        this.g = drekVar.c;
        this.b = new eoss(drekVar.d);
        dreo dreoVar = new dreo(this, drekVar.d);
        this.d = dreoVar;
        this.h = nativeCreate(dreoVar, new GellerStorageChangeListenerHandler(ekhx.o(drekVar.e)), gellerLoggingCallback, drekVar.m.toByteArray());
        this.e = drekVar.m;
        Map map = drekVar.j;
        Map map2 = drekVar.l;
        ekgi ekgiVar = new ekgi();
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Map) entry.getValue()).values().iterator().hasNext()) {
                    ekgiVar.i((ewut) entry.getKey(), ((drev) ((Map) entry.getValue()).values().iterator().next()).c());
                }
            }
        }
        if (!map2.isEmpty()) {
            for (Map.Entry entry2 : map2.entrySet()) {
                ekgiVar.i((ewut) entry2.getKey(), ((drev) entry2.getValue()).c());
            }
        }
        this.k = ekgiVar.c();
    }

    private native long nativeCreate(GellerStorageOperationsCallback gellerStorageOperationsCallback, GellerStorageChangeListenerHandler gellerStorageChangeListenerHandler, GellerLoggingCallback gellerLoggingCallback, byte[] bArr);

    public final long a() {
        long j = this.h;
        if (this.e.l && j == 0) {
            throw new IllegalStateException("Native Geller read after free");
        }
        return j;
    }

    public final long b(String str, ewut ewutVar, ewbc ewbcVar) {
        GellerDatabase gellerDatabaseB = this.c.b(str);
        if (gellerDatabaseB != null) {
            return gellerDatabaseB.a(ewutVar.name(), ewbcVar);
        }
        ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/geller/portable/Geller", "markSyncStatus", 1375, "Geller.java")).t("The GellerDatabase is null, skipping marking status for corpus %s", ewutVar.name());
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture c(final String str, final ewut ewutVar, List list) {
        evzo evzoVar;
        ewai ewaiVar;
        evzx evzxVar = (evzx) ewae.a.createBuilder();
        if (list.isEmpty()) {
            evzxVar.copyOnWrite();
            ewae.a((ewae) evzxVar.instance);
        } else {
            evzy evzyVar = (evzy) evzz.a.createBuilder();
            ekqh it = ((ekgb) list).iterator();
            while (it.hasNext()) {
                drdx drdxVar = (drdx) it.next();
                evzn evznVar = (evzn) evzo.a.createBuilder();
                String strB = drdxVar.b();
                evznVar.copyOnWrite();
                evzo evzoVar2 = (evzo) evznVar.instance;
                evzoVar2.b |= 2;
                evzoVar2.d = strB;
                if (drdxVar.a().g()) {
                    long jLongValue = ((Long) drdxVar.a().c()).longValue();
                    evznVar.copyOnWrite();
                    evzo evzoVar3 = (evzo) evznVar.instance;
                    evzoVar3.b |= 1;
                    evzoVar3.c = jLongValue;
                    evzoVar = (evzo) evznVar.build();
                } else {
                    evzoVar = (evzo) evznVar.build();
                }
                evzyVar.copyOnWrite();
                evzz evzzVar = (evzz) evzyVar.instance;
                evzoVar.getClass();
                evtg evtgVar = evzzVar.b;
                if (!evtgVar.c()) {
                    evzzVar.b = evsn.mutableCopy(evtgVar);
                }
                evzzVar.b.add(evzoVar);
            }
            evzxVar.copyOnWrite();
            ewae ewaeVar = (ewae) evzxVar.instance;
            evzz evzzVar2 = (evzz) evzyVar.build();
            evzzVar2.getClass();
            ewaeVar.d = evzzVar2;
            ewaeVar.c = 1;
        }
        final ewae ewaeVar2 = (ewae) evzxVar.build();
        ejwl.m(true, "delete() not allowed if Geller is read-only");
        ejwl.m(true, "delete() not allowed if a blocking executor is not specified");
        ejya ejyaVar = ejsz.a;
        ejxm.c(ejyaVar);
        final ejxm ejxmVar = new ejxm(ejyaVar);
        Callable callable = new Callable() { // from class: dref
            @Override // java.util.concurrent.Callable
            public final Object call() throws GellerException {
                Geller geller = this.a;
                drel drelVar = geller.c;
                String str2 = str;
                if (drelVar.b(str2) == null) {
                    throw new GellerException("Geller instance is null.");
                }
                ewae ewaeVar3 = ewaeVar2;
                ewut ewutVar2 = ewutVar;
                ejxm ejxmVar2 = ejxmVar;
                ejxmVar2.f();
                long jNativeDelete = geller.nativeDelete(geller.a(), drelVar.a(str2), ewutVar2.name(), ewaeVar3.toByteArray());
                ejxmVar2.g();
                return Long.valueOf(jNativeDelete);
            }
        };
        Executor executor = this.b;
        eiju eijuVarH = eiju.g(eika.h(callable, executor)).f(GellerException.class, new eooz() { // from class: dreg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eork.h((GellerException) obj);
            }
        }, executor).h(new ejvr() { // from class: dreh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (Long) obj;
            }
        }, executor);
        if (!this.e.c) {
            ewag ewagVar = (ewag) ewaj.a.createBuilder();
            ewagVar.copyOnWrite();
            ewaj ewajVar = (ewaj) ewagVar.instance;
            ewajVar.c = ewutVar.dC;
            ewajVar.b |= 1;
            ekqh it2 = ((ekgb) list).iterator();
            while (it2.hasNext()) {
                drdx drdxVar2 = (drdx) it2.next();
                ewah ewahVar = (ewah) ewai.a.createBuilder();
                String strB2 = drdxVar2.b();
                ewahVar.copyOnWrite();
                ewai ewaiVar2 = (ewai) ewahVar.instance;
                ewaiVar2.b |= 2;
                ewaiVar2.d = strB2;
                if (drdxVar2.a().g()) {
                    long jLongValue2 = ((Long) drdxVar2.a().c()).longValue();
                    ewahVar.copyOnWrite();
                    ewai ewaiVar3 = (ewai) ewahVar.instance;
                    ewaiVar3.b |= 1;
                    ewaiVar3.c = jLongValue2;
                    ewaiVar = (ewai) ewahVar.build();
                } else {
                    ewaiVar = (ewai) ewahVar.build();
                }
                ewagVar.copyOnWrite();
                ewaj ewajVar2 = (ewaj) ewagVar.instance;
                ewaiVar.getClass();
                evtg evtgVar2 = ewajVar2.d;
                if (!evtgVar2.c()) {
                    ewajVar2.d = evsn.mutableCopy(evtgVar2);
                }
                ewajVar2.d.add(ewaiVar);
            }
            ewaf ewafVar = (ewaf) ewak.a.createBuilder();
            ewafVar.copyOnWrite();
            ewak ewakVar = (ewak) ewafVar.instance;
            ewaj ewajVar3 = (ewaj) ewagVar.build();
            ewajVar3.getClass();
            evtg evtgVar3 = ewakVar.b;
            if (!evtgVar3.c()) {
                ewakVar.b = evsn.mutableCopy(evtgVar3);
            }
            ewakVar.b.add(ewajVar3);
            eork.r(eijuVarH, eiid.h(new drej(this, str, (ewak) ewafVar.build())), this.g);
        }
        return eijuVarH;
    }

    public final ListenableFuture d(final String str, final ewut ewutVar, final ewbk ewbkVar, final excw excwVar, final exca excaVar) {
        final ejxm ejxmVarC = ejxm.c(ejsz.a);
        ekgp ekgpVar = this.k;
        ejwi ejwiVarJ = ekgpVar.containsKey(ewutVar) ? ejwi.j((ewuu) ekgpVar.get(ewutVar)) : ejud.a;
        boolean z = false;
        if (ejwiVarJ.g()) {
            if (((ewuu) ejwiVarJ.c()).equals(ewuu.CUSTOM_STORAGE_TYPE_PROTODATASTORE)) {
                z = true;
            }
        }
        Boolean.valueOf(z).getClass();
        ListenableFuture listenableFutureH = z ? eika.h(new Callable() { // from class: dreb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.e(str, ewutVar, ewbkVar, excwVar, excaVar);
            }
        }, this.b) : eika.h(new Callable() { // from class: drec
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.e(str, ewutVar, ewbkVar, excwVar, excaVar);
            }
        }, this.g);
        exbw exbwVar = excaVar.c;
        if (exbwVar == null) {
            exbwVar = exbw.a;
        }
        if (!exbwVar.f) {
            ewap ewapVar = this.e.f;
            if (ewapVar == null) {
                ewapVar = ewap.d;
            }
            if (new evsz(ewapVar.g, ewap.c).contains(ewutVar) || new evsz(ewapVar.f, ewap.b).contains(ewutVar) || new evsz(ewapVar.e, ewap.a).contains(ewutVar)) {
                listenableFutureH = eiju.g(listenableFutureH).i(new eooz() { // from class: dred
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ((ekrd) ((ekrd) Geller.a.j()).h("com/google/android/libraries/geller/portable/Geller", "maybeApplyDmaFiltering", 2013, "Geller.java")).t("Policy evaluator absent when evaluating %s", ewutVar.name());
                        return eork.i((ewbm) obj);
                    }
                }, this.f);
            }
        }
        eiju eijuVarG = eiju.g(listenableFutureH);
        eooz eoozVar = new eooz() { // from class: drdz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                this.a.f(ewutVar);
                ejxmVarC.a(TimeUnit.MILLISECONDS);
                return eork.h((GellerException) obj);
            }
        };
        Executor executor = this.g;
        return eijuVarG.f(GellerException.class, eoozVar, executor).h(new ejvr() { // from class: drea
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ewbm ewbmVar = (ewbm) obj;
                this.a.f(ewutVar);
                ejxmVarC.a(TimeUnit.MILLISECONDS);
                return ewbmVar;
            }
        }, executor);
    }

    public final ewbm e(String str, ewut ewutVar, ewbk ewbkVar, excw excwVar, exca excaVar) throws GellerException {
        GellerException gellerException;
        ejxm ejxmVarC = ejxm.c(ejsz.a);
        g(ewutVar, excaVar);
        ewbm ewbmVar = ewbm.a;
        try {
            try {
                byte[] bArrNativeReadElements = nativeReadElements(a(), this.c.a(str), ewutVar.name(), ewbkVar.toByteArray(), excwVar.toByteArray());
                int length = bArrNativeReadElements.length;
                if (length > 5000000) {
                    try {
                        throw new GellerException(String.format("Result of read exceeded maximum read result size.  The size of the result was: %s, and the maximum size is: %s.", Integer.valueOf(length), 5000000L));
                    } catch (GellerException e) {
                        e = e;
                        gellerException = e;
                        ((ekrd) ((ekrd) ((ekrd) a.i()).g(gellerException)).h("com/google/android/libraries/geller/portable/Geller", "readElementInternal", (char) 2127, "Geller.java")).q("Geller read failed.");
                        f(ewutVar);
                        ewbmVar.getSerializedSize();
                        ejxmVarC.a(TimeUnit.MILLISECONDS);
                        return ewbmVar;
                    }
                }
                ewbm ewbmVar2 = (ewbm) drep.a(bArrNativeReadElements, ewbmVar);
                try {
                    f(ewutVar);
                    ewbmVar2.getSerializedSize();
                    ejxmVarC.a(TimeUnit.MILLISECONDS);
                    return ewbmVar2;
                } catch (GellerException e2) {
                    gellerException = e2;
                    ewbmVar = ewbmVar2;
                    ((ekrd) ((ekrd) ((ekrd) a.i()).g(gellerException)).h("com/google/android/libraries/geller/portable/Geller", "readElementInternal", (char) 2127, "Geller.java")).q("Geller read failed.");
                    f(ewutVar);
                    ewbmVar.getSerializedSize();
                    ejxmVarC.a(TimeUnit.MILLISECONDS);
                    return ewbmVar;
                }
            } catch (GellerException e3) {
                e = e3;
            }
        } catch (GellerException e4) {
            e = e4;
        }
    }

    public final void f(ewut ewutVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ewut ewutVar, exca excaVar) {
        exbw exbwVar = excaVar.c;
        if (exbwVar == null) {
            exbwVar = exbw.a;
        }
        if (exbwVar.c != 1) {
            exbw exbwVar2 = excaVar.c;
            if (exbwVar2 == null) {
                exbwVar2 = exbw.a;
            }
            if (exbwVar2.c != 2) {
                f(ewutVar);
                return;
            }
            f(ewutVar);
            exbw exbwVar3 = excaVar.c;
            if (exbwVar3 == null) {
                exbwVar3 = exbw.a;
            }
            if (exbwVar3.e == null) {
                evpc evpcVar = evpc.a;
                return;
            }
            return;
        }
        exbw exbwVar4 = excaVar.c;
        if (exbwVar4 == null) {
            exbwVar4 = exbw.a;
        }
        evta evtaVar = (exbwVar4.c == 1 ? (exci) exbwVar4.d : exci.a).b;
        if (evtaVar.size() > 1) {
            Iterator<E> it = evtaVar.iterator();
            while (it.hasNext()) {
                ((Long) it.next()).longValue();
                f(ewutVar);
            }
            return;
        }
        if (evtaVar.size() != 1) {
            f(ewutVar);
        } else {
            f(ewutVar);
            ((Long) evtaVar.get(0)).intValue();
        }
    }

    public native long nativeDelete(long j, long j2, String str, byte[] bArr);

    public native void nativePropagateDeletion(long j, long j2, byte[] bArr);

    public native byte[] nativeReadElements(long j, long j2, String str, byte[] bArr, byte[] bArr2);

    public native String[] nativeReadMetadata(long j, long j2, String str, String str2);

    public native byte[] nativeReadMetadataForAllCorpora(long j, long j2, String str);

    public native byte[] nativeReadSnapshot(long j, long j2, String[] strArr, int i, boolean z);

    public native String[] nativeUpdate(long j, long j2, byte[] bArr);

    public native boolean nativeUpdateMetadata(long j, long j2, byte[] bArr, boolean z);
}
