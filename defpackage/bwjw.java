package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Iterator$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwjw {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "RemoteDeviceLoader");
    public final eosc b;
    public final cogw c;
    public final fcsu d;
    public final fcsu e;
    public final celq f;
    public final ains g;
    public final eygg h;
    public final aqvc i;
    private final dqsn j;
    private final fcsu k;
    private final fcsu l;

    public bwjw(cogw cogwVar, dqsn dqsnVar, fcsu fcsuVar, eosc eoscVar, fcsu fcsuVar2, fcsu fcsuVar3, celq celqVar, ains ainsVar, eygg eyggVar, fcsu fcsuVar4, aqvc aqvcVar) {
        this.j = dqsnVar;
        this.k = fcsuVar;
        this.b = eoscVar;
        this.c = cogwVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = celqVar;
        this.g = ainsVar;
        this.h = eyggVar;
        this.l = fcsuVar4;
        this.i = aqvcVar;
    }

    public final eiju a(aubq aubqVar, Collection collection, elyd elydVar) {
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: bwju
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aubq) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return b(aubqVar, collection, (ekgb) map.collect(ekcv.a), elydVar);
    }

    public final eiju b(aubq aubqVar, Iterable iterable, final Iterable iterable2, final elyd elydVar) {
        Iterable iterableG;
        eiju eijuVarE;
        aubqVar.getClass();
        ecem.b();
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Start to get Registration ID from Tachyon");
        cqbdVarA.A("normalizedDestination", cqcv.b(TextUtils.join(", ", iterable2)));
        cqbdVarA.r();
        final Instant instantF = this.c.f();
        eieu eieuVarK = eiiy.k("RemoteDeviceLoader#downloadRegistrationIdsFromTachyon");
        try {
            ahnh ahnhVar = ((ahle) this.k.b()).a.a.a;
            bwsb bwsbVar = new bwsb(aubqVar, eyie.a(ahnhVar.EG), ahnhVar.EH, (fdjx) ahnhVar.oQ.b());
            if (iterable != null) {
                int i = ekgb.d;
                final ekfw ekfwVar = new ekfw();
                Iterator$EL.forEachRemaining(iterable.iterator(), new Consumer() { // from class: bwjt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ekfwVar.h(((aubq) obj).d);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                iterableG = ekfwVar.g();
            } else {
                iterableG = iterable2;
            }
            iterableG.getClass();
            aubq aubqVar2 = bwsbVar.a;
            String str = aubqVar2.d;
            if (str == null || fdgn.H(str)) {
                eijuVarE = eijx.e(new bwry(2, "", ekoj.a, 0));
                eijuVarE.getClass();
            } else {
                ahlf ahlfVar = (ahlf) bwsbVar.b.b();
                String str2 = aubqVar2.d;
                str2.getClass();
                List listAb = fcva.ab(iterableG);
                ahnh ahnhVar2 = ahlfVar.a.a.a;
                eyik eyikVar = ahnhVar2.pT;
                eijuVarE = auvw.c(bwsbVar.c, fcyi.a, fdjz.a, new bwsa(bwsbVar, new cffs(eyikVar, str2, listAb), null));
            }
            ejvr ejvrVar = new ejvr() { // from class: bwjn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    bwsc bwscVar = (bwsc) obj;
                    int iD = bwscVar.d();
                    bwjw bwjwVar = this.a;
                    elyd elydVar2 = elydVar;
                    char c = 2;
                    if (iD == 2) {
                        ((bwey) bwjwVar.e.b()).b(elydVar2, -2, null);
                        return new qam();
                    }
                    if (bwscVar.d() == 3) {
                        ((bwey) bwjwVar.e.b()).b(elydVar2, bwscVar.a(), bwscVar.c());
                        return new qam();
                    }
                    Iterable<String> iterable3 = iterable2;
                    ekgp ekgpVarB = bwscVar.b();
                    String strC = bwscVar.c();
                    for (final String str3 : iterable3) {
                        int i2 = ekgb.d;
                        final ekgb<ezpn> ekgbVar = (ekgb) ekgpVarB.getOrDefault(str3, ekoe.a);
                        elyb elybVar = (elyb) elyg.a.createBuilder();
                        elybVar.copyOnWrite();
                        elyg elygVar = (elyg) elybVar.instance;
                        elygVar.c = elydVar2.m;
                        boolean z = true;
                        elygVar.b |= 1;
                        elybVar.copyOnWrite();
                        elyg elygVar2 = (elyg) elybVar.instance;
                        elygVar2.b |= 8;
                        elygVar2.h = strC;
                        for (ezpn ezpnVar : ekgbVar) {
                            elye elyeVar = (elye) elyf.a.createBuilder();
                            char c2 = c;
                            String strD = ezpnVar.c.D(StandardCharsets.US_ASCII);
                            elyeVar.copyOnWrite();
                            elyf elyfVar = (elyf) elyeVar.instance;
                            elyfVar.b |= 1;
                            elyfVar.c = strD;
                            boolean z2 = ezpnVar.d.size() > 0 && ezpnVar.d.contains(Integer.valueOf(cefn.ETOUFFEE.h));
                            elyeVar.copyOnWrite();
                            elyf elyfVar2 = (elyf) elyeVar.instance;
                            elyfVar2.b |= 2;
                            elyfVar2.d = z2;
                            elyf elyfVar3 = (elyf) elyeVar.build();
                            elybVar.copyOnWrite();
                            elyg elygVar3 = (elyg) elybVar.instance;
                            elyfVar3.getClass();
                            evtg evtgVar = elygVar3.e;
                            if (!evtgVar.c()) {
                                elygVar3.e = evsn.mutableCopy(evtgVar);
                            }
                            elygVar3.e.add(elyfVar3);
                            c = c2;
                        }
                        char c3 = c;
                        final celq celqVar = bwjwVar.f;
                        final ekgb<bkvw> ekgbVarC = celqVar.c(str3);
                        for (bkvw bkvwVar : ekgbVarC) {
                            elye elyeVar2 = (elye) elyf.a.createBuilder();
                            boolean zJ = bkvwVar.j();
                            elyeVar2.copyOnWrite();
                            boolean z3 = z;
                            elyf elyfVar4 = (elyf) elyeVar2.instance;
                            String str4 = strC;
                            elyfVar4.b |= 2;
                            elyfVar4.d = zJ;
                            String strI = bkvwVar.i();
                            if (strI != null) {
                                elyeVar2.copyOnWrite();
                                elyf elyfVar5 = (elyf) elyeVar2.instance;
                                elyfVar5.b |= 1;
                                elyfVar5.c = strI;
                            }
                            elyf elyfVar6 = (elyf) elyeVar2.build();
                            elybVar.copyOnWrite();
                            elyg elygVar4 = (elyg) elybVar.instance;
                            elyfVar6.getClass();
                            evtg evtgVar2 = elygVar4.d;
                            if (!evtgVar2.c()) {
                                elygVar4.d = evsn.mutableCopy(evtgVar2);
                            }
                            elygVar4.d.add(elyfVar6);
                            z = z3;
                            strC = str4;
                        }
                        String str5 = strC;
                        boolean z4 = z;
                        final Instant instant = instantF;
                        final boolean z5 = elydVar2 == elyd.RECEIVED_PLAINTEXT_DELIVERY_RECEIPT ? z4 : false;
                        boolean zBooleanValue = ((Boolean) celqVar.b.c("RemoteInstanceDatabaseOperations#saveToRemoteInstances", new ejxr() { // from class: celp
                            /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
                            @Override // defpackage.ejxr
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object get() {
                                /*
                                    Method dump skipped, instructions count: 574
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.celp.get():java.lang.Object");
                            }
                        })).booleanValue();
                        aill aillVar = (aill) bwjwVar.d.b();
                        ellg ellgVar = (ellg) ellh.a.createBuilder();
                        ellf ellfVar = ellf.BUGLE_E2EE_LOOKUP_REGISTERED;
                        ellgVar.copyOnWrite();
                        ellh ellhVar = (ellh) ellgVar.instance;
                        ellhVar.j = ellfVar.f11do;
                        ellhVar.b |= 1;
                        elybVar.copyOnWrite();
                        elyg elygVar5 = (elyg) elybVar.instance;
                        elygVar5.b |= 2;
                        elygVar5.f = !zBooleanValue;
                        ellgVar.copyOnWrite();
                        ellh ellhVar2 = (ellh) ellgVar.instance;
                        elyg elygVar6 = (elyg) elybVar.build();
                        elygVar6.getClass();
                        ellhVar2.T = elygVar6;
                        ellhVar2.c |= 1048576;
                        aillVar.j(ellgVar);
                        c = c3;
                        strC = str5;
                    }
                    return new qao();
                }
            };
            eosc eoscVar = this.b;
            eiju eijuVarF = eijuVarE.h(ejvrVar, eoscVar).f(Throwable.class, new eooz() { // from class: bwjo
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    bwjw.a.s("Caught Throwable, failed to retrieve registration Ids from tachyon", (Throwable) obj);
                    ((bwey) this.a.e.b()).b(elydVar, -1, null);
                    return eijx.e(new qam());
                }
            }, eoscVar);
            eieuVarK.b(eijuVarF);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekot c(ekgb ekgbVar, boolean z) {
        ecem.b();
        ekfw ekfwVar = new ekfw();
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            String strI = ((alqm) ekgbVar.get(i)).i(((apzn) this.l.b()).a());
            if (!TextUtils.isEmpty(strI)) {
                ekfwVar.h(strI);
            }
        }
        ekgb ekgbVarG = ekfwVar.g();
        if (ekgbVarG.isEmpty()) {
            this.g.e("Bugle.Rcs.PhoneNumber.Invalid.Counts", 3);
        }
        ekgb ekgbVarB = this.f.b(ekgbVarG);
        ekhy ekhyVar = new ekhy();
        int size2 = ekgbVarB.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bkvw bkvwVar = (bkvw) ekgbVarB.get(i2);
            if (bkvwVar.j() && (!z || bkvwVar.k())) {
                String strI2 = bkvwVar.i();
                if (!TextUtils.isEmpty(strI2)) {
                    ekhyVar.b(bkvwVar.g(), strI2);
                }
            }
        }
        ekib ekibVarA = ekhyVar.a();
        boolean zIsEmpty = ekgbVarB.isEmpty();
        boolean zA = ekibVarA.A();
        if (zIsEmpty) {
            this.g.e("Bugle.Etouffee.RemoteDevice.Status", bwbz.a(1));
            return ekibVarA;
        }
        if (zA) {
            this.g.e("Bugle.Etouffee.RemoteDevice.Status", bwbz.a(2));
        }
        return ekibVarA;
    }

    public final void d(final aubq aubqVar, final String str, final String str2, final evqs evqsVar, final Instant instant) {
        a.p("Replacing existing encryptable registration ID");
        this.j.d("RemoteDeviceLoader#setEncryptableRegistrationId", new Runnable() { // from class: bwjv
            @Override // java.lang.Runnable
            public final void run() {
                aubq aubqVar2 = aubqVar;
                String str3 = aubqVar2 != null ? aubqVar2.d : str;
                String str4 = str2;
                evqs evqsVar2 = evqsVar;
                Instant instant2 = instant;
                bwjw bwjwVar = this.a;
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                String[] strArr = btnj.a;
                btmm btmmVar = new btmm();
                btmmVar.d(str3);
                cogw cogwVar = bwjwVar.c;
                btmmVar.c(cogwVar.f());
                btmmVar.b(instant2);
                btmmVar.a().n();
                String[] strArr2 = btmf.a;
                btmc btmcVar = new btmc();
                btmcVar.ap("setEncryptableRegistrationId");
                btmcVar.a.put("identity_key", evqsVar2.I());
                btmcVar.f(cogwVar.f());
                btmcVar.c(instant2);
                btme btmeVar = new btme();
                btmeVar.b(str4);
                if (btmcVar.aj(new btmd(btmeVar), "remote_registrations_table-buildAndUpdateForTachyonRegistrationId")) {
                    bwjw.a.p("Updated an entry for the remote registration.");
                } else {
                    bwjw.a.p("Inserted an entry for the remote registration.");
                    celq celqVar = bwjwVar.f;
                    barz barzVar = new barz();
                    barzVar.b(cefn.ETOUFFEE);
                    celqVar.e(str3, str4, barzVar.a(), Optional.of(evqsVar2), null, instant2);
                }
                if (bwjwVar.i.a()) {
                    Iterator it = ((Set) bwjwVar.h.b()).iterator();
                    while (it.hasNext()) {
                        ((celr) it.next()).a(ekgb.r(evqsVar2), str3);
                    }
                }
            }
        });
    }
}
