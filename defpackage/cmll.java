package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.telephony.SubscriptionInfo;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmll implements cmlb {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl");
    public final fcsu a;
    private final Context c;
    private final fdjx d;
    private final fcsu e;
    private final cmjk f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final apwv k;
    private final fcsu l;
    private final fcsu m;

    public cmll(Context context, fdjx fdjxVar, fcsu fcsuVar, cmjk cmjkVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, apwv apwvVar, fcsu fcsuVar7, fcsu fcsuVar8) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        cmjkVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        apwvVar.getClass();
        fcsuVar7.getClass();
        this.c = context;
        this.d = fdjxVar;
        this.e = fcsuVar;
        this.f = cmjkVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.a = fcsuVar5;
        this.j = fcsuVar6;
        this.k = apwvVar;
        this.l = fcsuVar7;
        this.m = fcsuVar8;
        fdvf.a(cmmi.a((cmmg) cmmh.a.createBuilder()).a());
    }

    @Override // defpackage.cmlb
    public final cmmb a() {
        return ((cmkj) this.g.b()).a();
    }

    @Override // defpackage.cmlb
    public final eiju b() {
        return auvw.b(new cmld(this), this.d);
    }

    @Override // defpackage.cmlb
    public final eiju c() {
        return auvw.b(new cmle(this), this.d);
    }

    @Override // defpackage.cmlb
    public final eiju d() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cmlg(this, null));
    }

    @Override // defpackage.cmlb
    public final eiju e(cmla cmlaVar) {
        cmlaVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new cmli(this, cmlaVar, null));
    }

    @Override // defpackage.cmlb
    public final Optional f() throws cmjj {
        Object next;
        cmme cmmeVar = (cmme) this.f.a.get();
        if (cmmeVar == null) {
            throw new cmjj();
        }
        cmmb cmmbVar = cmmeVar.d;
        if (cmmbVar == null) {
            cmmbVar = cmmb.a;
        }
        String str = cmmbVar.c;
        str.getClass();
        evtg evtgVar = cmmeVar.c;
        evtgVar.getClass();
        Iterator<E> it = evtgVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fdbq.f(((cmmh) next).c, str)) {
                break;
            }
        }
        return Optional.ofNullable(next);
    }

    @Override // defpackage.cmlb
    public final /* bridge */ /* synthetic */ Optional g(int i, boolean z) throws dhkf {
        String strO;
        Set setAv;
        dggn dggnVarA = this.f.a(i);
        if (dggnVarA != null) {
            ((ekrd) b.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 331, "SimSubscriptionInfoRetrieverImpl.kt")).D("Found provisioning id for sub id in simStateCache. subId %s: provisioning id: %s", new dggr(i), dhiz.SIM_ID.c(dggo.a(dggnVarA).a));
            return Optional.ofNullable(dggnVarA);
        }
        cmlm cmlmVar = (cmlm) this.h.b();
        if (Build.VERSION.SDK_INT >= 29 && (strO = cmlmVar.b.h(i).o()) != null) {
            try {
                List opportunisticSubscriptions = dhks.b(cmlmVar.a).a.getOpportunisticSubscriptions();
                opportunisticSubscriptions.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : opportunisticSubscriptions) {
                    ParcelUuid groupUuid = ((SubscriptionInfo) obj).getGroupUuid();
                    if (fdbq.f(groupUuid != null ? groupUuid.toString() : null, strO)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new dggr(((SubscriptionInfo) it.next()).getSubscriptionId()));
                }
                setAv = fcva.av(arrayList2);
            } catch (SecurityException e) {
                throw new dhkf("READ_PHONE_STATE permission is missing.", e);
            }
        } else {
            setAv = fcvq.a;
        }
        Iterator it2 = setAv.iterator();
        while (it2.hasNext()) {
            dggn dggnVarA2 = this.f.a(((dggr) it2.next()).a);
            if (dggnVarA2 != null) {
                ((ekrd) b.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 346, "SimSubscriptionInfoRetrieverImpl.kt")).D("Found provisioning id for sub id in opportunisticSubs. subId %s: provisioning id: %s", new dggr(i), dhiz.SIM_ID.c(dggo.a(dggnVarA2).a));
                return Optional.of(dggnVarA2);
            }
        }
        ekrg ekrgVar = b;
        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 354, "SimSubscriptionInfoRetrieverImpl.kt")).t("No match for subId %s", new dggr(i));
        if (z) {
            ((ekrd) ekrgVar.j().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 358, "SimSubscriptionInfoRetrieverImpl.kt")).t("No SimSubscriptionInfo found in cache for subId %s. Looking up cached availability based on the ICCID from SubscriptionMetadataUtils.", new dggr(i));
            String strW = ((crny) this.e.b()).h(i).w();
            if (strW != null && strW.length() != 0) {
                return Optional.of(new dggp(strW));
            }
            ((ekrd) ekrgVar.j().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getCachedRcsProvisioningIdForSubscriptionId-bYZ02fE", 367, "SimSubscriptionInfoRetrieverImpl.kt")).t("ICCID empty for subId %s", new dggr(i));
        }
        return Optional.empty();
    }

    @Override // defpackage.cmlb
    public final Optional h(cmla cmlaVar) {
        cmlaVar.getClass();
        Optional optionalOfNullable = Optional.ofNullable(((cmkj) this.g.b()).b(cmlaVar));
        if (cmlaVar == cmla.a) {
        }
        return optionalOfNullable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    @Override // defpackage.cmlb
    public final /* bridge */ /* synthetic */ Optional i(int i) {
        cmmh next;
        cmmh cmmhVarD = ((cmkj) this.g.b()).d(i);
        if (cmmhVarD != null) {
            ((ekrd) b.e().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getSimSubscriptionInfoInternalSync-0jkzt_0", 197, "SimSubscriptionInfoRetrieverImpl.kt")).t("Found simSubscriptionInfo for subId: %s", new dggr(i));
        } else {
            ekrg ekrgVar = b;
            ((ekrd) ekrgVar.e().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getSimSubscriptionInfoInternalSync-0jkzt_0", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "SimSubscriptionInfoRetrieverImpl.kt")).t("No simSubscriptionInfo found for subId: %s. Checking if subId is in a subscription group with an another subscription.", new dggr(i));
            Iterator it = q().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                }
                next = it.next();
                if (r(i, ((cmmh) next).d)) {
                    break;
                }
            }
            cmmh cmmhVar = next;
            if (cmmhVar == null) {
                ((ekrd) ekrgVar.e().h("com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl", "getSimSubscriptionInfoInternalSync-0jkzt_0", 213, "SimSubscriptionInfoRetrieverImpl.kt")).t("Subscription is not in a group with another subscription: %s. Returning null.", new dggr(i));
            }
            cmmhVarD = cmmhVar;
        }
        return Optional.ofNullable(cmmhVarD);
    }

    @Override // defpackage.cmlb
    public final Optional j(dggn dggnVar) {
        dggnVar.getClass();
        return Optional.ofNullable(((cmkj) this.g.b()).c(dggnVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:24:0x0074). Please report as a decompilation issue!!! */
    @Override // defpackage.cmlb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cmlf
            if (r0 == 0) goto L13
            r0 = r7
            cmlf r0 = (defpackage.cmlf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            cmlf r0 = new cmlf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r7)
            goto L74
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            defpackage.fctl.b(r7)
            goto L47
        L3c:
            defpackage.fctl.b(r7)
            r0.f = r4
            java.util.Set r7 = r6.o()
            if (r7 == r1) goto L9b
        L47:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.fcva.p(r7, r4)
            r2.<init>(r4)
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
        L59:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L7b
            java.lang.Object r7 = r4.next()
            dggn r7 = (defpackage.dggn) r7
            r0.a = r2
            r0.b = r4
            r0.c = r2
            r0.f = r3
            java.lang.Object r7 = r6.w(r7)
            if (r7 == r1) goto L9b
            r5 = r2
        L74:
            cmmh r7 = (defpackage.cmmh) r7
            r2.add(r7)
            r2 = r5
            goto L59
        L7b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r2.iterator()
        L84:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r0.next()
            cmmh r1 = (defpackage.cmmh) r1
            if (r1 == 0) goto L84
            r7.add(r1)
            goto L84
        L96:
            java.util.Set r7 = defpackage.fcva.av(r7)
            return r7
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmll.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cmlb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.cmla r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cmlh
            if (r0 == 0) goto L13
            r0 = r6
            cmlh r0 = (defpackage.cmlh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmlh r0 = new cmlh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cmla r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.g
            java.lang.Object r6 = r6.b()
            cmkj r6 = (defpackage.cmkj) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.h(r5)
            if (r6 == r1) goto L55
        L46:
            cmmh r6 = (defpackage.cmmh) r6
            cmla r0 = defpackage.cmla.a
            if (r5 != r0) goto L54
            fcsu r5 = r4.j
            java.lang.Object r5 = r5.b()
            apwx r5 = (defpackage.apwx) r5
        L54:
            return r6
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmll.l(cmla, fcxy):java.lang.Object");
    }

    @Override // defpackage.cmlb
    public final Object m(int i, fcxy fcxyVar) {
        return y(i, fcxyVar);
    }

    @Override // defpackage.cmlb
    public final Set n() {
        Set setE = ((cmkj) this.g.b()).e();
        ArrayList arrayList = new ArrayList(fcva.p(setE, 10));
        Iterator it = setE.iterator();
        while (it.hasNext()) {
            String str = ((cmmh) it.next()).c;
            str.getClass();
            arrayList.add(new dggp(str));
        }
        return fcva.av(arrayList);
    }

    @Override // defpackage.cmlb
    public final Set o() {
        if (this.k.a()) {
            return n();
        }
        cmmh cmmhVarB = ((cmkj) this.g.b()).b(cmla.a);
        if (cmmhVarB == null) {
            return fcvq.a;
        }
        String str = cmmhVarB.c;
        str.getClass();
        return fcwm.b(new dggp(str));
    }

    @Override // defpackage.cmlb
    public final Set p() {
        Set setO = o();
        ArrayList arrayList = new ArrayList();
        Iterator it = setO.iterator();
        while (it.hasNext()) {
            cmmh cmmhVar = (cmmh) fdct.b(j((dggn) it.next()));
            if (cmmhVar != null) {
                arrayList.add(cmmhVar);
            }
        }
        return fcva.av(arrayList);
    }

    @Override // defpackage.cmlb
    public final Set q() {
        return ((cmkj) this.g.b()).e();
    }

    @Override // defpackage.cmlb
    public final /* bridge */ /* synthetic */ boolean s(int i) {
        if (!((crma) this.m.b()).j()) {
            return false;
        }
        boolean z = dhks.b(this.c).a(i) != null;
        if (!((dfme) this.l.b()).a()) {
            return z;
        }
        ensi ensiVar = (ensi) ensj.a.createBuilder();
        ensiVar.getClass();
        ensiVar.copyOnWrite();
        ensj ensjVar = (ensj) ensiVar.instance;
        ensjVar.b = 1 | ensjVar.b;
        ensjVar.c = i;
        ensiVar.copyOnWrite();
        ensj ensjVar2 = (ensj) ensiVar.instance;
        ensjVar2.b |= 2;
        ensjVar2.d = z;
        boolean zF = ((dhet) this.i.b()).f();
        ensiVar.copyOnWrite();
        ensj ensjVar3 = (ensj) ensiVar.instance;
        ensjVar3.b |= 8;
        ensjVar3.f = zF;
        ensiVar.copyOnWrite();
        ensj ensjVar4 = (ensj) ensiVar.instance;
        ensjVar4.e = 2;
        ensjVar4.b |= 4;
        evsn evsnVarBuild = ensiVar.build();
        evsnVarBuild.getClass();
        auvw.k(this.d, null, null, new cmlk(this, (ensj) evsnVarBuild, null), 3);
        return z;
    }

    @Override // defpackage.cmlb
    public final Object t() {
        return o();
    }

    @Override // defpackage.cmlb
    public final Object u() {
        return ((cmkj) this.g.b()).g();
    }

    @Override // defpackage.cmlb
    public final Object v(dggn dggnVar) {
        return ((cmkj) this.g.b()).i(dggo.a(dggnVar).a);
    }

    @Override // defpackage.cmlb
    public final Object w(dggn dggnVar) {
        return ((cmkj) this.g.b()).k(dggnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cmlc
            if (r0 == 0) goto L13
            r0 = r5
            cmlc r0 = (defpackage.cmlc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmlc r0 = new cmlc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.g
            java.lang.Object r5 = r5.b()
            cmkj r5 = (defpackage.cmkj) r5
            r0.c = r3
            java.lang.Object r5 = r5.g()
            if (r5 == r1) goto L72
        L42:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r5.next()
            cmmh r1 = (defpackage.cmmh) r1
            dggp r2 = new dggp
            java.lang.String r1 = r1.c
            r1.getClass()
            r2.<init>(r1)
            r0.add(r2)
            goto L53
        L6d:
            java.util.Set r5 = defpackage.fcva.av(r0)
            return r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmll.x(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r10 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(int r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cmlj
            if (r0 == 0) goto L13
            r0 = r10
            cmlj r0 = (defpackage.cmlj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cmlj r0 = new cmlj
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            java.lang.String r5 = "getSimSubscriptionInfoInternal-bYZ02fE"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/simstatetracker/SimSubscriptionInfoRetrieverImpl"
            java.lang.String r7 = "SimSubscriptionInfoRetrieverImpl.kt"
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r9 = r0.a
            defpackage.fctl.b(r10)
            goto L94
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            int r9 = r0.a
            defpackage.fctl.b(r10)
            goto L55
        L40:
            defpackage.fctl.b(r10)
            fcsu r10 = r8.g
            java.lang.Object r10 = r10.b()
            cmkj r10 = (defpackage.cmkj) r10
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = r10.l(r9)
            if (r10 == r1) goto Lce
        L55:
            cmmh r10 = (defpackage.cmmh) r10
            if (r10 == 0) goto L72
            ekrg r0 = defpackage.cmll.b
            ekrw r0 = r0.e()
            r1 = 169(0xa9, float:2.37E-43)
            ekrw r0 = r0.h(r6, r5, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            dggr r1 = new dggr
            r1.<init>(r9)
            java.lang.String r9 = "Found simSubscriptionInfo for subId: %s"
            r0.t(r9, r1)
            return r10
        L72:
            ekrg r10 = defpackage.cmll.b
            ekrw r10 = r10.e()
            r2 = 174(0xae, float:2.44E-43)
            ekrw r10 = r10.h(r6, r5, r2, r7)
            ekrd r10 = (defpackage.ekrd) r10
            dggr r2 = new dggr
            r2.<init>(r9)
            java.lang.String r4 = "No simSubscriptionInfo found for subId: %s. Checking if subId is in a subscription group with an another subscription."
            r10.t(r4, r2)
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = r8.u()
            if (r10 == r1) goto Lce
        L94:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L9a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r10.next()
            r1 = r0
            cmmh r1 = (defpackage.cmmh) r1
            int r1 = r1.d
            boolean r1 = r8.r(r9, r1)
            if (r1 == 0) goto L9a
            goto Lb1
        Lb0:
            r0 = 0
        Lb1:
            cmmh r0 = (defpackage.cmmh) r0
            if (r0 != 0) goto Lcd
            ekrg r10 = defpackage.cmll.b
            ekrw r10 = r10.e()
            r1 = 183(0xb7, float:2.56E-43)
            ekrw r10 = r10.h(r6, r5, r1, r7)
            ekrd r10 = (defpackage.ekrd) r10
            dggr r1 = new dggr
            r1.<init>(r9)
            java.lang.String r9 = "Subscription is not in a group with another subscription: %s. Returning null."
            r10.t(r9, r1)
        Lcd:
            return r0
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmll.y(int, fcxy):java.lang.Object");
    }

    @Override // defpackage.cmlb
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final boolean r(int i, int i2) throws dhkf {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        fcsu fcsuVar = this.e;
        String strO = ((crny) fcsuVar.b()).h(i).o();
        if ((strO == null && (strO = ((crny) fcsuVar.b()).h(i2).o()) == null) || strO.length() == 0) {
            return false;
        }
        List listE = dhks.b(this.c).e(ParcelUuid.fromString(strO));
        listE.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SubscriptionInfo) it.next()).getSubscriptionId()));
        }
        return arrayList.contains(Integer.valueOf(i)) && arrayList.contains(Integer.valueOf(i2));
    }
}
