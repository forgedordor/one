package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dbyl;
import defpackage.dzfq;
import defpackage.dzwk;
import defpackage.dzwl;
import defpackage.dzwt;
import defpackage.dzwv;
import defpackage.dzxl;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.ejxx;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.eoih;
import defpackage.eoii;
import defpackage.eoij;
import defpackage.eoik;
import defpackage.eoil;
import defpackage.eoim;
import defpackage.eoin;
import defpackage.eooq;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eorv;
import defpackage.evpz;
import defpackage.evsl;
import defpackage.evsn;
import defpackage.evta;
import defpackage.evtg;
import defpackage.fecp;
import defpackage.fecs;
import defpackage.fect;
import defpackage.fecu;
import defpackage.feew;
import defpackage.feez;
import defpackage.fefa;
import defpackage.fefb;
import defpackage.fefj;
import defpackage.fefk;
import defpackage.fefm;
import defpackage.fefo;
import defpackage.fefp;
import defpackage.fefr;
import defpackage.feho;
import defpackage.fehu;
import defpackage.feij;
import defpackage.feik;
import defpackage.feil;
import defpackage.feim;
import defpackage.feiw;
import defpackage.feix;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ClearcutMetricSnapshotTransmitter implements dzwl {
    public static final ejxr a = ejxx.a(new ejxr() { // from class: dzwz
        @Override // defpackage.ejxr
        public final Object get() {
            return new fehg();
        }
    });
    public volatile dbyl b;
    public volatile dbyl c;
    private volatile dzwt d;
    private volatile dzxl e;
    private final ejxr f = ejxx.a(new ejxr() { // from class: dzwy
        @Override // defpackage.ejxr
        public final Object get() {
            ejxr ejxrVar = ClearcutMetricSnapshotTransmitter.a;
            return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : Build.VERSION.SDK_INT < 29 ? ActivityManager.isRunningInTestHarness() : ActivityManager.isRunningInUserTestHarness());
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzwl
    public final ListenableFuture a(final Context context, dzwk dzwkVar) {
        boolean z;
        evsl evslVarCheckIsLite = evsn.checkIsLite(dzwv.b);
        dzwkVar.d(evslVarCheckIsLite);
        ejwl.b(dzwkVar.r.o(evslVarCheckIsLite.d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new dzxl();
                }
            }
        }
        feix feixVar = dzwkVar.c;
        if (feixVar == null) {
            feixVar = feix.a;
        }
        feiw feiwVar = (feiw) feixVar.toBuilder();
        dzxl.b(dzxl.a, feiwVar);
        fecu fecuVar = ((feix) feiwVar.instance).k;
        if (fecuVar == null) {
            fecuVar = fecu.a;
        }
        if ((fecuVar.b & 1) != 0) {
            fecu fecuVar2 = ((feix) feiwVar.instance).k;
            if (fecuVar2 == null) {
                fecuVar2 = fecu.a;
            }
            fecs fecsVar = fecuVar2.c;
            if (fecsVar == null) {
                fecsVar = fecs.a;
            }
            fecp fecpVar = (fecp) fecsVar.toBuilder();
            dzxl.b(dzxl.b, fecpVar);
            fecu fecuVar3 = ((feix) feiwVar.instance).k;
            if (fecuVar3 == null) {
                fecuVar3 = fecu.a;
            }
            fect fectVar = (fect) fecuVar3.toBuilder();
            fectVar.copyOnWrite();
            fecu fecuVar4 = (fecu) fectVar.instance;
            fecs fecsVar2 = (fecs) fecpVar.build();
            fecsVar2.getClass();
            fecuVar4.c = fecsVar2;
            fecuVar4.b |= 1;
            feiwVar.copyOnWrite();
            feix feixVar2 = (feix) feiwVar.instance;
            fecu fecuVar5 = (fecu) fectVar.build();
            fecuVar5.getClass();
            feixVar2.k = fecuVar5;
            feixVar2.b |= 256;
        }
        fehu fehuVar = ((feix) feiwVar.instance).i;
        if (fehuVar == null) {
            fehuVar = fehu.a;
        }
        if ((fehuVar.b & 256) != 0) {
            fehu fehuVar2 = ((feix) feiwVar.instance).i;
            if (fehuVar2 == null) {
                fehuVar2 = fehu.a;
            }
            eoin eoinVar = fehuVar2.i;
            if (eoinVar == null) {
                eoinVar = eoin.a;
            }
            eoii eoiiVar = (eoii) eoinVar.toBuilder();
            eoih eoihVar = ((eoin) eoiiVar.instance).e;
            if (eoihVar == null) {
                eoihVar = eoih.a;
            }
            eoih eoihVarC = dzxl.c(eoihVar);
            eoiiVar.copyOnWrite();
            eoin eoinVar2 = (eoin) eoiiVar.instance;
            eoihVarC.getClass();
            eoinVar2.e = eoihVarC;
            eoinVar2.b |= 1;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(eoinVar2.f);
            eoiiVar.copyOnWrite();
            ((eoin) eoiiVar.instance).f = eoin.emptyProtobufList();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                eoih eoihVarC2 = dzxl.c((eoih) it.next());
                eoiiVar.copyOnWrite();
                eoin eoinVar3 = (eoin) eoiiVar.instance;
                eoihVarC2.getClass();
                eoinVar3.a();
                eoinVar3.f.add(eoihVarC2);
            }
            eoin eoinVar4 = (eoin) eoiiVar.instance;
            evtg<eoim> evtgVar = (eoinVar4.c == 4 ? (eoik) eoinVar4.d : eoik.a).b;
            eoij eoijVar = (eoij) eoik.a.createBuilder();
            for (eoim eoimVar : evtgVar) {
                eoih eoihVar2 = eoimVar.c;
                if (eoihVar2 == null) {
                    eoihVar2 = eoih.a;
                }
                if ((eoihVar2.b & 2) != 0) {
                    eoil eoilVar = (eoil) eoimVar.toBuilder();
                    eoih eoihVarC3 = dzxl.c(eoihVar2);
                    eoilVar.copyOnWrite();
                    eoim eoimVar2 = (eoim) eoilVar.instance;
                    eoihVarC3.getClass();
                    eoimVar2.c = eoihVarC3;
                    eoimVar2.b |= 1;
                    eoimVar = (eoim) eoilVar.build();
                }
                eoijVar.copyOnWrite();
                eoik eoikVar = (eoik) eoijVar.instance;
                eoimVar.getClass();
                eoikVar.a();
                eoikVar.b.add(eoimVar);
            }
            eoik eoikVar2 = (eoik) eoijVar.build();
            eoiiVar.copyOnWrite();
            eoin eoinVar5 = (eoin) eoiiVar.instance;
            eoikVar2.getClass();
            eoinVar5.d = eoikVar2;
            eoinVar5.c = 4;
            fehu fehuVar3 = ((feix) feiwVar.instance).i;
            if (fehuVar3 == null) {
                fehuVar3 = fehu.a;
            }
            feho fehoVar = (feho) fehuVar3.toBuilder();
            eoin eoinVar6 = (eoin) eoiiVar.build();
            fehoVar.copyOnWrite();
            fehu fehuVar4 = (fehu) fehoVar.instance;
            eoinVar6.getClass();
            fehuVar4.i = eoinVar6;
            fehuVar4.b |= 256;
            fehu fehuVar5 = (fehu) fehoVar.build();
            feiwVar.copyOnWrite();
            feix feixVar3 = (feix) feiwVar.instance;
            fehuVar5.getClass();
            feixVar3.i = fehuVar5;
            feixVar3.b |= 64;
        }
        feim feimVar = ((feix) feiwVar.instance).j;
        if (feimVar == null) {
            feimVar = feim.a;
        }
        if (feimVar.k.size() != 0) {
            feim feimVar2 = ((feix) feiwVar.instance).j;
            if (feimVar2 == null) {
                feimVar2 = feim.a;
            }
            feij feijVar = (feij) feimVar2.toBuilder();
            for (int i = 0; i < ((feim) feijVar.instance).k.size(); i++) {
                feik feikVar = (feik) ((feil) ((feim) feijVar.instance).k.get(i)).toBuilder();
                if (!((feil) feikVar.instance).c.isEmpty()) {
                    feikVar.copyOnWrite();
                    ((feil) feikVar.instance).d = feil.emptyLongList();
                    List listA = dzxl.a(((feil) feikVar.instance).c);
                    feikVar.copyOnWrite();
                    feil feilVar = (feil) feikVar.instance;
                    evta evtaVar = feilVar.d;
                    if (!evtaVar.c()) {
                        feilVar.d = evsn.mutableCopy(evtaVar);
                    }
                    evpz.addAll(listA, feilVar.d);
                }
                feikVar.copyOnWrite();
                feil feilVar2 = (feil) feikVar.instance;
                feilVar2.b &= -2;
                feilVar2.c = feil.a.c;
                feijVar.copyOnWrite();
                feim feimVar3 = (feim) feijVar.instance;
                feil feilVar3 = (feil) feikVar.build();
                feilVar3.getClass();
                evtg evtgVar2 = feimVar3.k;
                if (!evtgVar2.c()) {
                    feimVar3.k = evsn.mutableCopy(evtgVar2);
                }
                feimVar3.k.set(i, feilVar3);
            }
            feiwVar.copyOnWrite();
            feix feixVar4 = (feix) feiwVar.instance;
            feim feimVar4 = (feim) feijVar.build();
            feimVar4.getClass();
            feixVar4.j = feimVar4;
            feixVar4.b |= 128;
        }
        fefb fefbVar = ((feix) feiwVar.instance).h;
        if (fefbVar == null) {
            fefbVar = fefb.a;
        }
        if (fefbVar.b.size() != 0) {
            fefb fefbVar2 = ((feix) feiwVar.instance).h;
            if (fefbVar2 == null) {
                fefbVar2 = fefb.a;
            }
            fefa fefaVar = (fefa) fefbVar2.toBuilder();
            for (int i2 = 0; i2 < ((fefb) fefaVar.instance).b.size(); i2++) {
                feew feewVar = (feew) ((feez) ((fefb) fefaVar.instance).b.get(i2)).toBuilder();
                if (!((feez) feewVar.instance).u.isEmpty()) {
                    feewVar.copyOnWrite();
                    ((feez) feewVar.instance).v = feez.emptyLongList();
                    List listA2 = dzxl.a(((feez) feewVar.instance).u);
                    feewVar.copyOnWrite();
                    feez feezVar = (feez) feewVar.instance;
                    evta evtaVar2 = feezVar.v;
                    if (!evtaVar2.c()) {
                        feezVar.v = evsn.mutableCopy(evtaVar2);
                    }
                    evpz.addAll(listA2, feezVar.v);
                }
                feewVar.copyOnWrite();
                feez feezVar2 = (feez) feewVar.instance;
                feezVar2.b &= -524289;
                feezVar2.u = feez.a.u;
                fefaVar.copyOnWrite();
                fefb fefbVar3 = (fefb) fefaVar.instance;
                feez feezVar3 = (feez) feewVar.build();
                feezVar3.getClass();
                fefbVar3.a();
                fefbVar3.b.set(i2, feezVar3);
            }
            for (int i3 = 0; i3 < ((fefb) fefaVar.instance).c.size(); i3++) {
                fefj fefjVar = (fefj) ((fefk) ((fefb) fefaVar.instance).c.get(i3)).toBuilder();
                if (!((fefk) fefjVar.instance).c.isEmpty()) {
                    fefjVar.copyOnWrite();
                    ((fefk) fefjVar.instance).d = fefk.emptyLongList();
                    List listA3 = dzxl.a(((fefk) fefjVar.instance).c);
                    fefjVar.copyOnWrite();
                    fefk fefkVar = (fefk) fefjVar.instance;
                    evta evtaVar3 = fefkVar.d;
                    if (!evtaVar3.c()) {
                        fefkVar.d = evsn.mutableCopy(evtaVar3);
                    }
                    evpz.addAll(listA3, fefkVar.d);
                }
                fefjVar.copyOnWrite();
                fefk fefkVar2 = (fefk) fefjVar.instance;
                fefkVar2.b &= -2;
                fefkVar2.c = fefk.a.c;
                fefaVar.copyOnWrite();
                fefb fefbVar4 = (fefb) fefaVar.instance;
                fefk fefkVar3 = (fefk) fefjVar.build();
                fefkVar3.getClass();
                evtg evtgVar3 = fefbVar4.c;
                if (!evtgVar3.c()) {
                    fefbVar4.c = evsn.mutableCopy(evtgVar3);
                }
                fefbVar4.c.set(i3, fefkVar3);
            }
            feiwVar.copyOnWrite();
            feix feixVar5 = (feix) feiwVar.instance;
            fefb fefbVar5 = (fefb) fefaVar.build();
            fefbVar5.getClass();
            feixVar5.h = fefbVar5;
            feixVar5.b |= 32;
        }
        fefo fefoVar = ((feix) feiwVar.instance).m;
        if (fefoVar == null) {
            fefoVar = fefo.a;
        }
        if (fefoVar.e.size() != 0) {
            fefo fefoVar2 = ((feix) feiwVar.instance).m;
            if (fefoVar2 == null) {
                fefoVar2 = fefo.a;
            }
            fefm fefmVar = (fefm) fefoVar2.toBuilder();
            for (int i4 = 0; i4 < ((fefo) fefmVar.instance).e.size(); i4++) {
                fefp fefpVar = (fefp) ((fefr) ((fefo) fefmVar.instance).e.get(i4)).toBuilder();
                dzxl.b(dzxl.c, fefpVar);
                fefmVar.copyOnWrite();
                fefo fefoVar3 = (fefo) fefmVar.instance;
                fefr fefrVar = (fefr) fefpVar.build();
                fefrVar.getClass();
                fefoVar3.a();
                fefoVar3.e.set(i4, fefrVar);
            }
            feiwVar.copyOnWrite();
            feix feixVar6 = (feix) feiwVar.instance;
            fefo fefoVar4 = (fefo) fefmVar.build();
            fefoVar4.getClass();
            feixVar6.m = fefoVar4;
            feixVar6.b |= 2048;
        }
        final feix feixVar7 = (feix) feiwVar.build();
        ekrg ekrgVar = dzfq.a;
        if (((ekrd) ekrgVar.g()).Q()) {
            int i5 = feixVar7.b;
            String str = (16777216 & i5) == 0 ? null : "primes stats";
            int i6 = i5 & 32;
            int i7 = i5 & 16;
            int i8 = i5 & 8;
            int i9 = i5 & 256;
            int i10 = i5 & 64;
            int i11 = i5 & 1024;
            z = true;
            int i12 = i5 & 128;
            int i13 = i5 & 2048;
            if (i6 != 0) {
                str = "network metric";
            }
            if (i7 != 0) {
                str = "timer metric";
            }
            if (i8 != 0) {
                str = "memory metric";
            }
            if (i9 != 0) {
                str = "battery metric";
            }
            if (i10 != 0) {
                str = "crash metric";
            }
            if (i11 != 0) {
                str = "jank metric";
            }
            if (i12 != 0) {
                str = "package metric";
            }
            if (i13 != 0) {
                str = "trace";
            }
            ekrd ekrdVar = (ekrd) ((ekrd) ekrgVar.g()).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "logSystemHealthMetric", 219, "ClearcutMetricSnapshotTransmitter.java");
            if (str == null) {
                str = "unknown";
            }
            ekrdVar.D("Sending Primes %s: %s", str, feixVar7);
        } else {
            z = true;
        }
        if (((Boolean) this.f.get()).booleanValue()) {
            return eorv.a;
        }
        evsl evslVarCheckIsLite2 = evsn.checkIsLite(dzwv.b);
        dzwkVar.d(evslVarCheckIsLite2);
        Object objL = dzwkVar.r.l(evslVarCheckIsLite2.d);
        final dzwv dzwvVar = (dzwv) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL));
        if (((ekrd) ekrgVar.g()).Q()) {
            ((ekrd) ((ekrd) ekrgVar.g()).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "transmit", 119, "ClearcutMetricSnapshotTransmitter.java")).t("%s", Base64.encodeToString(feixVar7.toByteArray(), 2));
        }
        boolean z2 = dzwvVar.i;
        boolean z3 = (feixVar7.b & 64) != 0 ? z : false;
        dzwt dzwtVar = this.d;
        if (dzwtVar == null) {
            synchronized (this) {
                dzwtVar = this.d;
                if (dzwtVar == null) {
                    dzwtVar = new dzwt();
                    this.d = dzwtVar;
                }
            }
        }
        return eooq.g(dzwtVar.a(context, z2, !z3), new eooz() { // from class: dzxa
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dbyl dbylVar;
                if (!((Boolean) obj).booleanValue()) {
                    return eorv.a;
                }
                dzwv dzwvVar2 = dzwvVar;
                Context context2 = context;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = this.a;
                String str2 = dzwvVar2.d;
                if (dzwvVar2.e) {
                    dbylVar = clearcutMetricSnapshotTransmitter.c;
                    if (dbylVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            dbylVar = clearcutMetricSnapshotTransmitter.c;
                            if (dbylVar == null) {
                                dbyl dbylVarL = dbyl.l(context2, str2);
                                clearcutMetricSnapshotTransmitter.c = dbylVarL;
                                dbylVar = dbylVarL;
                            }
                        }
                    }
                } else {
                    dbylVar = clearcutMetricSnapshotTransmitter.b;
                    if (dbylVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            dbylVar = clearcutMetricSnapshotTransmitter.b;
                            if (dbylVar == null) {
                                List list = dbyl.m;
                                dbyl dbylVarC = new dbyi(context2, str2).c();
                                clearcutMetricSnapshotTransmitter.b = dbylVarC;
                                dbylVar = dbylVarC;
                            }
                        }
                    }
                }
                dbyk dbykVarJ = dbylVar.j(feixVar7);
                if (fbij.a.get().a(context2)) {
                    dbykVarJ.p = dqnz.b(context2, (dqnj) ClearcutMetricSnapshotTransmitter.a.get());
                }
                if (!dzwvVar2.e) {
                    String str3 = dzwvVar2.f;
                    if (!ejwk.c(str3)) {
                        if (dbykVarJ.a.e()) {
                            throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                        }
                        eyeh eyehVar = dbykVarJ.b;
                        eyehVar.copyOnWrite();
                        eyei eyeiVar = (eyei) eyehVar.instance;
                        eyei eyeiVar2 = eyei.a;
                        str3.getClass();
                        eyeiVar.b |= 16777216;
                        eyeiVar.j = str3;
                    }
                    Iterator<E> it2 = dzwvVar2.j.iterator();
                    while (it2.hasNext()) {
                        dbykVarJ.g((String) it2.next());
                    }
                    if ((dzwvVar2.c & 8) != 0) {
                        dbykVarJ.h(dzwvVar2.g);
                    }
                    evsx evsxVar = dzwvVar2.h;
                    if (!evsxVar.isEmpty()) {
                        dbykVarJ.i(eonc.j(evsxVar));
                    }
                }
                return drgi.a(dbykVarJ.c());
            }
        }, eoqg.a);
    }
}
