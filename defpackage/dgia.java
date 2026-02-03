package defpackage;

import android.os.Build;
import android.os.ParcelUuid;
import android.telephony.SubscriptionInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgia implements dghj {
    public static final ekrg a = ekrg.c("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl");
    public final cmlm b;
    public final fcsu c;
    public final fcyh d;
    public final ReentrantReadWriteLock e;
    public final AtomicBoolean f;
    public final List g;
    private final fdjx h;

    public dgia(cmlm cmlmVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcyh fcyhVar) {
        cmlmVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.b = cmlmVar;
        this.c = fcsuVar2;
        this.h = fdjxVar;
        this.d = fcyhVar;
        this.e = new ReentrantReadWriteLock();
        this.f = new AtomicBoolean(false);
        this.g = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object r(defpackage.dgia r4, defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.dght
            if (r0 == 0) goto L13
            r0 = r5
            dght r0 = (defpackage.dght) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dght r0 = new dght
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dgia r4 = r0.d
            defpackage.fctl.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r4.s(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.Set r4 = r4.m()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgia.r(dgia, fcxy):java.lang.Object");
    }

    public static final String w(dgha dghaVar) {
        String strC = dhiz.SIM_ID.c(dggo.a(dghaVar.a).a);
        dggk dggkVar = dghaVar.b;
        return "{\n      ProvisioningId: " + strC + ",\n      Phone Number: " + dhiz.PHONE_NUMBER.c(dggkVar != null ? dggkVar.a : null) + ",\n      SubscriptionId: " + dghaVar.c + "\n    }";
    }

    private final dgha x(final dggk dggkVar) {
        return y(new fdap() { // from class: dghp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dgha dghaVar = (dgha) obj;
                dghaVar.getClass();
                return Boolean.valueOf(fdbq.f(dghaVar.b, dggkVar));
            }
        });
    }

    private final dgha y(fdap fdapVar) {
        Object next;
        Iterator it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) fdapVar.invoke(next)).booleanValue()) {
                break;
            }
        }
        return (dgha) next;
    }

    private final dgha z(final int i) {
        return y(new fdap() { // from class: dghk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dgha dghaVar = (dgha) obj;
                dghaVar.getClass();
                return Boolean.valueOf(dggr.b(dghaVar.c, i));
            }
        });
    }

    @Override // defpackage.dghj
    public final /* synthetic */ dggk a(dggn dggnVar) {
        dggnVar.getClass();
        return (dggk) fdct.b(f(dggnVar));
    }

    @Override // defpackage.dghj
    public final /* synthetic */ dggk b(int i) {
        return (dggk) fdct.b(g(i));
    }

    @Override // defpackage.dghj
    public final /* synthetic */ dggn c(dggk dggkVar) {
        return (dggn) fdct.b(h(dggkVar));
    }

    @Override // defpackage.dghj
    public final /* synthetic */ dggr d(dggn dggnVar) {
        dggnVar.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getSubscriptionIdForRcsProvisioningIdOptional", 209, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getSubscriptionIdForRcsProvisioningIdOptional: accessing uninitialized provisioning identities.");
            }
            dgha dghaVarP = p(dggnVar);
            dggr dggrVar = dghaVarP != null ? new dggr(dghaVarP.c) : null;
            if (dggrVar == null) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "BugleRcs");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                ekrdVar2.Z(eksk.FULL);
                ((ekrd) ekrdVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findSubscriptionIdByProvisioningId-QfiLYjE", 224, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription id found for RCS provisioning id.");
                u();
            }
            Optional optionalOfNullable = Optional.ofNullable(dggrVar);
            lock.unlock();
            return (dggr) fdct.b(optionalOfNullable);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.dghj
    public final eiju e(dggk dggkVar) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new dghw(this, dggkVar, null));
    }

    @Override // defpackage.dghj
    public final Optional f(dggn dggnVar) {
        dggnVar.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForRcsProvisioningIdOptional", 123, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getPhoneNumberForRcsProvisioningIdOptional: accessing uninitialized provisioning identities.");
            }
            dgha dghaVarP = p(dggnVar);
            dggk dggkVar = dghaVarP != null ? dghaVarP.b : null;
            if (dggkVar == null) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleRcs");
                ekrd ekrdVar2 = (ekrd) ekrwVarH;
                ekrdVar2.Z(eksk.FULL);
                ((ekrd) ekrdVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForRcsProvisioningIdOptional", 132, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No phone number found for a given provisioning id.");
            }
            return Optional.ofNullable(dggkVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.dghj
    public final Optional g(final int i) {
        dggk dggkVar;
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdOptional", 256, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getPhoneNumberForSubscriptionIdOptional: accessing uninitialized provisioning identities.");
            }
            dgha dghaVarZ = z(i);
            if (dghaVarZ != null) {
                dggkVar = dghaVarZ.b;
            } else {
                ekrg ekrgVar = a;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "BugleRcs");
                ((ekrd) ekrwVarH.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdInternal-0jkzt_0", 284, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("phone number null, checking subscription exists in same subscription group.");
                dgha dghaVarY = y(new fdap() { // from class: dghl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) throws dhkf {
                        dgha dghaVar = (dgha) obj;
                        dghaVar.getClass();
                        boolean z = false;
                        if (Build.VERSION.SDK_INT >= 29) {
                            dgia dgiaVar = this.a;
                            int i2 = i;
                            int i3 = dghaVar.c;
                            cmlm cmlmVar = dgiaVar.b;
                            crny crnyVar = cmlmVar.b;
                            String strO = crnyVar.h(i3).o();
                            if (strO != null || (strO = crnyVar.h(i2).o()) != null) {
                                try {
                                    List listE = dhks.b(cmlmVar.a).e(ParcelUuid.fromString(strO));
                                    listE.getClass();
                                    ArrayList arrayList = new ArrayList(fcva.p(listE, 10));
                                    Iterator it = listE.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(((SubscriptionInfo) it.next()).getSubscriptionId()));
                                    }
                                    if (arrayList.contains(Integer.valueOf(i3))) {
                                        if (arrayList.contains(Integer.valueOf(i2))) {
                                            z = true;
                                        }
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                });
                if (dghaVarY != null) {
                    dggkVar = dghaVarY.b;
                } else {
                    ekrw ekrwVarJ2 = ekrgVar.j();
                    ekrwVarJ2.X(ekrzVar, "BugleRcs");
                    ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                    ekrdVar2.Z(eksk.FULL);
                    ekrdVar2.X(cqnc.w, Integer.valueOf(i));
                    ((ekrd) ekrdVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getPhoneNumberForSubscriptionIdInternal-0jkzt_0", 297, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No RCS phone number found for subscription id.");
                    u();
                    dggkVar = null;
                }
            }
            return Optional.ofNullable(dggkVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.dghj
    public final Optional h(dggk dggkVar) {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getRcsProvisioningIdForPhoneNumberOptional", 161, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getRcsProvisioningIdForPhoneNumberOptional: accessing uninitialized provisioning identities.");
            }
            dgha dghaVarX = x(dggkVar);
            dggn dggnVar = dghaVarX != null ? dghaVarX.a : null;
            if (dggnVar == null) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "BugleRcs");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                ekrdVar2.Z(eksk.FULL);
                ekrdVar2.X(cqnc.I, dggkVar.a);
                ((ekrd) ekrdVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findProvisioningIdByPhoneNumber", 177, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No RCS provisioning id found for given phone number.");
                u();
            }
            return Optional.ofNullable(dggnVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.dghj
    public final Optional i(dggk dggkVar) {
        dggkVar.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getSubscriptionIdForPhoneNumberOptional", 324, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getSubscriptionIdForPhoneNumberOptional: accessing uninitialized provisioning identities.");
            }
            dgha dghaVarX = x(dggkVar);
            dggr dggrVar = dghaVarX != null ? new dggr(dghaVarX.c) : null;
            if (dggrVar == null) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "BugleRcs");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                ekrdVar2.Z(eksk.FULL);
                ekrdVar2.X(cqnc.I, dggkVar.a);
                ((ekrd) ekrdVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "findSubscriptionIdByPhoneNumber-QfiLYjE", 340, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription id found for MSISDN.");
                u();
            }
            return Optional.ofNullable(dggrVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.dghj
    public final Object j(fcxy fcxyVar) {
        return r(this, fcxyVar);
    }

    @Override // defpackage.dghj
    public final Object k(dggn dggnVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new dghu(null, this, dggnVar), fcxyVar);
    }

    @Override // defpackage.dghj
    public final Object l(dggk dggkVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new dghx(null, this, dggkVar), fcxyVar);
    }

    @Override // defpackage.dghj
    public final Set m() {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailablePhoneNumbersSync", 361, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailablePhoneNumbers: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dggk dggkVar = ((dgha) it.next()).b;
                if (dggkVar != null) {
                    arrayList.add(dggkVar);
                }
            }
            Set setAv = fcva.av(arrayList);
            if (setAv.isEmpty()) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleRcs");
                ekrd ekrdVar2 = (ekrd) ekrwVarH;
                ekrdVar2.Z(eksk.FULL);
                ((ekrd) ekrdVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailablePhoneNumbersSync", 365, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No phone numbers available.");
            }
            return setAv;
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.dghj
    public final Set n() {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableSubscriptionIdsSync", 406, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailableSubscriptionIds: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new dggr(((dgha) it.next()).c));
            }
            Set setAv = fcva.av(arrayList);
            if (setAv.isEmpty()) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleRcs");
                ekrd ekrdVar2 = (ekrd) ekrwVarH;
                ekrdVar2.Z(eksk.FULL);
                ((ekrd) ekrdVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableSubscriptionIdsSync", 410, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No subscription ids.");
            }
            return setAv;
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.dghj
    public final boolean o() {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            return this.g.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    public final dgha p(final dggn dggnVar) {
        return y(new fdap() { // from class: dgho
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dgha dghaVar = (dgha) obj;
                dghaVar.getClass();
                return Boolean.valueOf(fdbq.f(dghaVar.a, dggnVar));
            }
        });
    }

    public final Optional q(int i) {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "logIfMapNotInitialized", 516, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("Accessing uninitialized provisioning identities.");
            }
            dgha dghaVarZ = z(i);
            if (dghaVarZ == null) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "BugleRcs");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                ekrdVar2.Z(eksk.FULL);
                ((ekrd) ekrdVar2.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getRcsProvisioningIdForSubscriptionIdOptional", 94, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("No rcs provisioning id found for a given sub id.");
            }
            return Optional.ofNullable(dghaVarZ != null ? dghaVarZ.a : null);
        } finally {
            lock.unlock();
        }
    }

    public final Object s(fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new dghy(null, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final Set t() {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (!this.f.get()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ekrdVar.V(1, TimeUnit.MINUTES);
                ((ekrd) ekrdVar.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "getAvailableProvisioningIdsSync", 386, "RcsProvisioningIdentityMappingAccessorImpl.kt")).q("getAvailableProvisioningIds: accessing uninitialized provisioning identities.");
            }
            List list = this.g;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((dgha) it.next()).a);
            }
            return fcva.av(arrayList);
        } finally {
            lock.unlock();
        }
    }

    public final void u() {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleRcs");
            ((ekrd) ekrwVarE.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "logDebugIdentityMappingInfos", 471, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Identity mapping for debugging: %s", fcva.aF(this.g, "\n", null, null, new fdap() { // from class: dghs
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    dgha dghaVar = (dgha) obj;
                    dghaVar.getClass();
                    return dgia.w(dghaVar);
                }
            }, 30));
        } finally {
            lock.unlock();
        }
    }

    public final void v(final dggn dggnVar, dggk dggkVar, int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            dgha dghaVar = new dgha(dggnVar, dggkVar, i);
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleRcs");
            ((ekrd) ekrwVarE.h("com/google/android/ims/provisioning/api/identitymapping/RcsProvisioningIdentityMappingAccessorImpl", "putIdentifierMappingValues", 425, "RcsProvisioningIdentityMappingAccessorImpl.kt")).t("Adding identity mapping {%s}", w(dghaVar));
            List list = this.g;
            final fdap fdapVar = new fdap() { // from class: dghm
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    dgha dghaVar2 = (dgha) obj;
                    dghaVar2.getClass();
                    return Boolean.valueOf(fdbq.f(dghaVar2.a, dggnVar));
                }
            };
            Collection.EL.removeIf(list, new Predicate() { // from class: dghn
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
                    return ((Boolean) fdapVar.invoke(obj)).booleanValue();
                }
            });
            list.add(dghaVar);
            u();
            this.f.set(true);
        } finally {
            while (i2 < readHoldCount) {
                lock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}
