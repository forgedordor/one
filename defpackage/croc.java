package defpackage;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class croc extends crny {
    public static final ekrg i = ekrg.c("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtilsPostLMR1");
    public static final dfny j = dfnv.b("cache_default_sms_subscription_id");
    public List k;
    public final SubscriptionManager l;
    private final SparseArray m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private ejxr q;

    public croc(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        super(context, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar5);
        this.m = new SparseArray();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        this.l = subscriptionManager == null ? SubscriptionManager.from(context) : subscriptionManager;
        this.n = fcsuVar4;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.q = ((Boolean) j.a()).booleanValue() ? ejxx.b(new crnz(), Duration.ofSeconds(dfog.a())) : null;
    }

    @Override // defpackage.crny
    public final int a() {
        List<SubscriptionInfo> activeSubscriptionInfoList = this.l.getActiveSubscriptionInfoList();
        int i2 = 0;
        if (activeSubscriptionInfoList != null) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                int subscriptionId = it.next().getSubscriptionId();
                crof crofVarH = h(subscriptionId);
                if (crofVarH.e() == 5 && crofVarH.z() && this.m.get(subscriptionId) == null) {
                    i2++;
                }
            }
        }
        return i2 + this.m.size();
    }

    @Override // defpackage.crny
    public final int b() {
        return Math.max(SubscriptionManager.getDefaultDataSubscriptionId(), -1);
    }

    @Override // defpackage.crny
    public final int c() {
        int defaultSmsSubscriptionId;
        if (!((Boolean) j.a()).booleanValue() || this.q == null) {
            defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
        } else {
            synchronized (this) {
                defaultSmsSubscriptionId = ((Integer) this.q.get()).intValue();
            }
        }
        return Math.max(defaultSmsSubscriptionId, -1);
    }

    @Override // defpackage.crny
    public final int d() {
        return Math.max(SubscriptionManager.getDefaultVoiceSubscriptionId(), -1);
    }

    @Override // defpackage.crny
    public final int e() {
        return this.l.getActiveSubscriptionInfoCountMax();
    }

    @Override // defpackage.crny
    public final int f() {
        return Math.max(SubscriptionManager.getDefaultSubscriptionId(), -1);
    }

    @Override // defpackage.crny
    public final crof h(int i2) {
        crof crofVar = (crof) this.m.get(i2);
        if (crofVar != null) {
            return crofVar;
        }
        if (((Boolean) dfog.o().a.ak.a()).booleanValue()) {
            ejwl.d(i2 >= -1, "SubscriptionMetadataUtils get: invalid subId = %s", i2);
        }
        if (i2 == -1) {
            i2 = ((crnw) this.d.b()).b() ? c() : SmsManager.getDefaultSmsSubscriptionId();
        }
        if (i2 < -1) {
            i2 = -1;
        }
        this.b.lock();
        try {
            SparseArray sparseArray = this.c;
            crof crofVarA = (crof) sparseArray.get(i2);
            if (crofVarA == null) {
                crofVarA = ((crog) this.f.b()).a((crmu) this.h.b(), i2);
                sparseArray.put(i2, crofVarA);
            }
            int iA = crofVarA.a();
            if (i2 < 0 && iA != -1) {
                ekrw ekrwVarJ = crny.a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.V(10, TimeUnit.SECONDS);
                ekrdVar.Z(eksk.SMALL);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "get", 185, "SubscriptionMetadataUtils.java")).u("Bugle: SubscriptionMetadataUtils get: unexpected subId = %d, replacing with %d", -1, iA);
            }
            return crofVarA;
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.crny
    public final Optional l(final awxn awxnVar) {
        final awyv awyvVarA = ((awyu) this.p.b()).a(awxnVar);
        return awyvVarA.d().or(new Supplier() { // from class: croa
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = croc.i;
                Optional optionalFindAny = Collection.EL.stream(awyvVarA.a()).findAny();
                ekrw ekrwVarH = croc.i.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(cqnc.z, awxnVar.b());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtilsPostLMR1", "get", 270, "SubscriptionMetadataUtilsPostLMR1.java")).t("MyIdentity fallback from active subId to any subId: %s", optionalFindAny);
                return optionalFindAny;
            }
        }).map(new Function() { // from class: crob
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.h(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crny
    public final List m() {
        List<SubscriptionInfo> activeSubscriptionInfoList = this.l.getActiveSubscriptionInfoList();
        ArrayList arrayList = new ArrayList();
        if (activeSubscriptionInfoList != null) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                int subscriptionId = it.next().getSubscriptionId();
                if (this.m.get(subscriptionId) == null) {
                    crof crofVarH = h(subscriptionId);
                    if (crofVarH.e() == 5 && crofVarH.z()) {
                        arrayList.add(crofVarH);
                    }
                }
            }
        }
        SparseArray sparseArray = this.m;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0) {
                return arrayList;
            }
            arrayList.add((crof) sparseArray.valueAt(size));
        }
    }

    @Override // defpackage.crny
    public final void n() {
        if (((Boolean) j.a()).booleanValue()) {
            synchronized (this) {
                this.q = ejxx.b(new crnz(), Duration.ofSeconds(dfog.a()));
            }
        }
    }

    @Override // defpackage.crny
    public final boolean q() {
        return c() != -1;
    }

    @Override // defpackage.crny
    public final boolean r() {
        ejxr ejxrVar = this.e;
        if (((TelephonyManager) ejxrVar.get()).getSimState(0) == 1 || ((TelephonyManager) ejxrVar.get()).getSimState(0) == 0) {
            return (((TelephonyManager) ejxrVar.get()).getSimState(1) == 1 || ((TelephonyManager) ejxrVar.get()).getSimState(1) == 0) ? false : true;
        }
        return true;
    }

    @Override // defpackage.crny
    public final boolean s(awxn awxnVar) {
        return ((awyu) this.p.b()).a(awxnVar).a().contains(Integer.valueOf(c()));
    }

    @Override // defpackage.crny
    public final void t(int i2, String str, int i3, String str2, String str3, alqm alqmVar, int i4, Optional optional) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        optional.isPresent();
        crmx crmxVar = (crmx) this.g.b();
        crnc crncVar = (crnc) alqmVar.f().orElse(null);
        crncVar.getClass();
        String strZ = crmxVar.z(crncVar);
        crnf crnfVar = (crnf) this.n.b();
        crmo crmoVar = new crmo();
        crmoVar.b();
        crmoVar.h(0);
        crmoVar.e = "SUB DISPLAY NAME";
        crmoVar.f = "SUB PREFERRED NAME";
        crmoVar.g = "SUB CARRIER NAME";
        crmoVar.h = "SUB SIM CARRIER NAME";
        crmoVar.p = (short) (crmoVar.p | 8);
        crmoVar.a();
        crmoVar.i = "2025550185";
        crmoVar.f();
        crmoVar.p = (short) (crmoVar.p | 64);
        crmoVar.c(0);
        crmoVar.d(0);
        crmoVar.p = (short) (crmoVar.p | 1536);
        crmoVar.n = "1234567890000000";
        crmoVar.e("US");
        crmoVar.g("US");
        crmoVar.o = 5;
        short s = crmoVar.p;
        crmoVar.a = i2;
        crmoVar.p = (short) (s | 2049);
        crmoVar.b();
        crmoVar.c = str;
        crmoVar.h(i3);
        crmoVar.e = str2;
        crmoVar.g = str3;
        crmoVar.a();
        crmoVar.i = alqmVar.o();
        crmoVar.f();
        crmoVar.c(214);
        crmoVar.d(i4);
        crmoVar.g(strZ);
        crmoVar.e(strZ);
        short s2 = crmoVar.p;
        if ((s2 & 4) == 0) {
            throw new IllegalStateException("Property \"simSlotIndex\" has not been set");
        }
        if (crmoVar.d >= 0 && crmoVar.c == null) {
            if ((s2 & 1) == 0) {
                throw new IllegalStateException("Property \"subId\" has not been set");
            }
            crmoVar.c = "DEFAULT_ICC_ID_" + crmoVar.a;
        }
        if (crmoVar.p == 4095 && (str4 = crmoVar.e) != null && (str5 = crmoVar.f) != null && (str6 = crmoVar.g) != null && (str7 = crmoVar.h) != null && (str8 = crmoVar.i) != null && (str9 = crmoVar.l) != null && (str10 = crmoVar.m) != null && (str11 = crmoVar.n) != null) {
            cron cronVar = new cron(crnfVar, this, new crmp(crmoVar.a, crmoVar.b, crmoVar.c, crmoVar.d, str4, str5, str6, str7, str8, crmoVar.j, crmoVar.k, str9, str10, str11, crmoVar.o), (alfq) this.o.b());
            this.m.put(cronVar.a(), cronVar);
            List list = this.k;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((SubscriptionManager.OnSubscriptionsChangedListener) it.next()).onSubscriptionsChanged();
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((crmoVar.p & 1) == 0) {
            sb.append(" subId");
        }
        if ((crmoVar.p & 2) == 0) {
            sb.append(" isAvailable");
        }
        if ((crmoVar.p & 4) == 0) {
            sb.append(" simSlotIndex");
        }
        if (crmoVar.e == null) {
            sb.append(" displayName");
        }
        if (crmoVar.f == null) {
            sb.append(" preferredName");
        }
        if (crmoVar.g == null) {
            sb.append(" carrierName");
        }
        if (crmoVar.h == null) {
            sb.append(" simCarrierName");
        }
        if ((crmoVar.p & 8) == 0) {
            sb.append(" simCarrierId");
        }
        if ((crmoVar.p & 16) == 0) {
            sb.append(" iconTint");
        }
        if (crmoVar.i == null) {
            sb.append(" phoneNumber");
        }
        if ((crmoVar.p & 32) == 0) {
            sb.append(" roaming");
        }
        if ((crmoVar.p & 64) == 0) {
            sb.append(" mobileData");
        }
        if ((crmoVar.p & 128) == 0) {
            sb.append(" mcc");
        }
        if ((crmoVar.p & 256) == 0) {
            sb.append(" mnc");
        }
        if ((crmoVar.p & 512) == 0) {
            sb.append(" networkMcc");
        }
        if ((crmoVar.p & 1024) == 0) {
            sb.append(" networkMnc");
        }
        if (crmoVar.l == null) {
            sb.append(" simCountryIso");
        }
        if (crmoVar.m == null) {
            sb.append(" networkCountryIso");
        }
        if (crmoVar.n == null) {
            sb.append(" subscriptionId");
        }
        if ((crmoVar.p & 2048) == 0) {
            sb.append(" simState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
