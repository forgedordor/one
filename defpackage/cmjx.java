package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjx implements cmjl {
    private final AtomicBoolean A;
    public final Context c;
    public final fdjx d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final cmjk h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final arum m;
    private final fdjx o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final aruo w;
    private final arun x;
    private final fcsu y;
    private final fcsu z;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl");
    private static final feav n = new feaz();
    public static final feav b = new feaz();

    public cmjx(Context context, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cmjk cmjkVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, aruo aruoVar, arun arunVar, fcsu fcsuVar16, fcsu fcsuVar17, arum arumVar, fcsu fcsuVar18) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        cmjkVar.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        fcsuVar15.getClass();
        fcsuVar16.getClass();
        fcsuVar17.getClass();
        fcsuVar18.getClass();
        this.c = context;
        this.o = fdjxVar;
        this.d = fdjxVar2;
        this.e = fcsuVar;
        this.p = fcsuVar2;
        this.q = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar7;
        this.h = cmjkVar;
        this.i = fcsuVar8;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
        this.j = fcsuVar11;
        this.t = fcsuVar12;
        this.u = fcsuVar13;
        this.k = fcsuVar14;
        this.v = fcsuVar15;
        this.w = aruoVar;
        this.x = arunVar;
        this.l = fcsuVar16;
        this.y = fcsuVar17;
        this.m = arumVar;
        this.z = fcsuVar18;
        this.A = new AtomicBoolean(true);
    }

    public static final Set j(Set set, Set set2) {
        if (fdbq.f(set, set2)) {
            return fcvq.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set2.iterator();
        int i = 0;
        while (it.hasNext()) {
            cmmh cmmhVar = (cmmh) it.next();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                cmmh cmmhVar2 = (cmmh) it2.next();
                if (fdbq.f(cmmhVar.c, cmmhVar2.c) || cmmhVar.d == cmmhVar2.d || fdbq.f(cmmhVar.f, cmmhVar2.f)) {
                    i++;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    if (!fdbq.f(cmmhVar.c, cmmhVar2.c)) {
                        linkedHashSet2.add(eoay.DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_SIM_ID);
                    }
                    if (!fdbq.f(cmmhVar.f, cmmhVar2.f)) {
                        linkedHashSet2.add(eoay.DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_IMSI);
                    }
                    if (!fdbq.f(cmmhVar.g, cmmhVar2.g)) {
                        linkedHashSet2.add(eoay.DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_PHONE_NUMBER);
                    }
                    if (!fdbq.f(cmmhVar.n, cmmhVar2.n)) {
                        linkedHashSet2.add(eoay.DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_ICCID);
                    }
                    if (!fdbq.f(cmmhVar.q, cmmhVar2.q)) {
                        linkedHashSet2.add(eoay.DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_PII_FORMATTED_PHONE_MSISDN);
                    }
                    if (cmmhVar.d != cmmhVar2.d || cmmhVar.e != cmmhVar2.e || !fdbq.f(cmmhVar.h, cmmhVar2.h) || !fdbq.f(cmmhVar.i, cmmhVar2.i) || !fdbq.f(cmmhVar.j, cmmhVar2.j) || !fdbq.f(cmmhVar.k, cmmhVar2.k) || !fdbq.f(cmmhVar.l, cmmhVar2.l) || cmmhVar.m != cmmhVar2.m || cmmhVar.o != cmmhVar2.o || !fdbq.f(cmmhVar.p, cmmhVar2.p) || !fdbq.f(cmmhVar.r, cmmhVar2.r) || !fdbq.f(cmmhVar.s, cmmhVar2.s) || !fdbq.f(cmmhVar.t, cmmhVar2.t) || !fdbq.f(cmmhVar.u, cmmhVar2.u)) {
                        linkedHashSet2.add(eoay.DIFFERENCE_TYPE_SUBSCRIPTION_MODIFIED_NON_PII_FIELDS);
                    }
                    linkedHashSet.addAll(linkedHashSet2);
                }
            }
        }
        if (i != set.size()) {
            linkedHashSet.add(eoay.DIFFERENCE_TYPE_SUBSCRIPTION_REMOVED);
        }
        if (i != set2.size()) {
            linkedHashSet.add(eoay.DIFFERENCE_TYPE_SUBSCRIPTION_ADDED);
        }
        return linkedHashSet;
    }

    private final dhkv l(int i) {
        if (!this.w.a()) {
            return dhkv.g(this.c).f(i);
        }
        dhkv dhkvVarF = dhkv.g(this.c).f(i);
        if (dhkvVarF == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSimStateTracker");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "createSafeTelephonyManager-0jkzt_0", 1135, "PhoneSimsStateUpdaterImpl.kt")).t("getSimOperator: TelephonyManager is null for subscription ID %s", new dggr(i));
        }
        return dhkvVarF;
    }

    private final String m(int i) throws dhkf {
        String strI;
        String strI2;
        if (Build.VERSION.SDK_INT >= 33) {
            if (((asce) this.z.b()).a()) {
                try {
                    String strC = dhks.b(this.c).c(i);
                    strC.getClass();
                    if (strC.length() != 0) {
                        return strC;
                    }
                } catch (dhkf unused) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleSimStateTracker");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 910, "PhoneSimsStateUpdaterImpl.kt")).q("getRawMsisdnInternal: Missing permissions for SubscriptionManager");
                } catch (IllegalStateException unused2) {
                    ekrw ekrwVarJ2 = a.j();
                    ekrwVarJ2.X(eksq.a, "BugleSimStateTracker");
                    ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 906, "PhoneSimsStateUpdaterImpl.kt")).q("getRawMsisdnInternal: Telephony process currently unavailable");
                }
            } else {
                try {
                    String strC2 = dhks.b(this.c).c(i);
                    strC2.getClass();
                    if (strC2.length() != 0) {
                        return strC2;
                    }
                } catch (IllegalStateException unused3) {
                    ekrw ekrwVarJ3 = a.j();
                    ekrwVarJ3.X(eksq.a, "BugleSimStateTracker");
                    ((ekrd) ekrwVarJ3.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 919, "PhoneSimsStateUpdaterImpl.kt")).q("getRawMsisdnInternal: Telephony process currently unavailable");
                }
            }
        }
        try {
            if (!this.w.a()) {
                dhkv dhkvVarL = l(i);
                return (dhkvVarL == null || (strI = dhkvVarL.i()) == null) ? "" : strI;
            }
            dhkv dhkvVarL2 = l(i);
            if (dhkvVarL2 == null || (strI2 = dhkvVarL2.i()) == null) {
                strI2 = "";
            }
            if (strI2.length() == 0) {
                ekrw ekrwVarJ4 = a.j();
                ekrwVarJ4.X(eksq.a, "BugleSimStateTracker");
                ((ekrd) ekrwVarJ4.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 930, "PhoneSimsStateUpdaterImpl.kt")).t("getRawMsisdnInternal: line1Number is empty for subscription ID %s", new dggr(i));
            }
            return strI2;
        } catch (dhkf unused4) {
            ekrw ekrwVarJ5 = a.j();
            ekrwVarJ5.X(eksq.a, "BugleSimStateTracker");
            ((ekrd) ekrwVarJ5.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 938, "PhoneSimsStateUpdaterImpl.kt")).q("getRawMsisdnInternal: Missing permissions for TelephonyManager");
            return "";
        }
    }

    private final void n(Set set) {
        Set set2 = (Set) this.k.b();
        if (!set2.isEmpty()) {
            auvw.k(this.d, null, null, new cmjp(set2, set, null), 3);
            return;
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleSimStateTracker");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "handleMultiSimsLoaded", 639, "PhoneSimsStateUpdaterImpl.kt")).q("No sim changed listeners registered.");
    }

    private final void o(String str) {
        if (str != null) {
            ((crqv) this.p.b()).h("is_fi_device_".concat(str), true);
        }
    }

    private final boolean p(int i, String str) {
        String strI = i(str);
        boolean z = true;
        if (strI != null && ((crqv) this.p.b()).q("is_fi_device_".concat(strI), false)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSimStateTracker");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 998, "PhoneSimsStateUpdaterImpl.kt")).q("Found isFiDevice from Fi cache");
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                dhkv dhkvVarL = l(i);
                if (dhkvVarL != null && dhkvVarL.d() == 1989) {
                    o(strI);
                    return true;
                }
            } catch (dhkf unused) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleSimStateTracker");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 1014, "PhoneSimsStateUpdaterImpl.kt")).q("isFiDevice: Missing permissions for TelephonyManager");
            }
        }
        ekrw ekrwVarH2 = a.h();
        ekrwVarH2.X(eksq.a, "BugleSimStateTracker");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 1019, "PhoneSimsStateUpdaterImpl.kt")).q("Looking up Fi through package names.");
        Object objA = dfbu.i.a();
        objA.getClass();
        String str2 = (String) objA;
        if (str2.length() == 0) {
            return false;
        }
        Iterator it = ejxk.d(",").g(str2).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String string = fdgn.x((String) it.next()).toString();
            if (string.length() != 0) {
                try {
                    if (dhkx.a(this.c).b(string, i)) {
                        break;
                    }
                } catch (dhkf unused2) {
                    ekrw ekrwVarH3 = a.h();
                    ekrwVarH3.X(eksq.a, "BugleSimStateTracker");
                    ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "hasCarrierPrivileges-0_gSl_s", 1035, "PhoneSimsStateUpdaterImpl.kt")).q("Missing permissions for SystemApiManager");
                } catch (NoSuchMethodException unused3) {
                    ekrw ekrwVarH4 = a.h();
                    ekrwVarH4.X(eksq.a, "BugleSimStateTracker");
                    ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "hasCarrierPrivileges-0_gSl_s", 1037, "PhoneSimsStateUpdaterImpl.kt")).q("Method not found in SystemApiManager");
                }
            }
        }
        if (z) {
            o(strI);
        }
        return z;
    }

    private final String q(String str) {
        if (str.length() == 0) {
            return "";
        }
        String strY = ((crmx) this.q.b()).y(str, false);
        strY.getClass();
        return strY;
    }

    private static final String r(String str, crof crofVar) {
        try {
            String strSubstring = str.substring(0, 3);
            strSubstring.getClass();
            return strSubstring;
        } catch (StringIndexOutOfBoundsException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSimStateTracker");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getMcc", 1086, "PhoneSimsStateUpdaterImpl.kt")).q("Invalid simOperator provided when setting MCC");
            return String.valueOf(crofVar.D()[0]);
        }
    }

    private static final String s(String str, crof crofVar) {
        try {
            String strSubstring = str.substring(3);
            strSubstring.getClass();
            return strSubstring;
        } catch (StringIndexOutOfBoundsException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSimStateTracker");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getMnc", 1095, "PhoneSimsStateUpdaterImpl.kt")).q("Invalid simOperator provided when setting MNC");
            return String.valueOf(crofVar.D()[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [cmjx] */
    /* JADX WARN: Type inference failed for: r12v0, types: [eoaz] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // defpackage.cmjl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.eoaz r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjx.a(eoaz, fcxy):java.lang.Object");
    }

    @Override // defpackage.cmjl
    public final fdkf b(List list, eoaz eoazVar) {
        eoazVar.getClass();
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return fdin.b(this.o, eicg.a(fcyiVar), fdjzVar, new cmjv(null, list, this, eoazVar));
    }

    @Override // defpackage.cmjl
    public final fdkf c(eoaz eoazVar) {
        eoazVar.getClass();
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return fdin.b(this.o, eicg.a(fcyiVar), fdjzVar, new cmjw(null, this, eoazVar));
    }

    public final cmmb d(cmmb cmmbVar) {
        fcsu fcsuVar = this.e;
        String strH = h(((crny) fcsuVar.b()).f());
        if (strH.length() <= 0) {
            strH = null;
        }
        if (strH == null) {
            strH = cmmbVar.c;
            strH.getClass();
        }
        String strH2 = h(((crny) fcsuVar.b()).c());
        if (strH2.length() <= 0) {
            strH2 = null;
        }
        if (strH2 == null) {
            strH2 = cmmbVar.d;
            strH2.getClass();
        }
        String strH3 = h(((crny) fcsuVar.b()).b());
        if (strH3.length() <= 0) {
            strH3 = null;
        }
        if (strH3 == null) {
            strH3 = cmmbVar.e;
            strH3.getClass();
        }
        String strH4 = h(((crny) fcsuVar.b()).f());
        String str = strH4.length() > 0 ? strH4 : null;
        if (str == null) {
            str = cmmbVar.f;
            str.getClass();
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSimStateTracker");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getDefaultSubscriptions", 848, "PhoneSimsStateUpdaterImpl.kt");
        dhiz dhizVar = dhiz.SIM_ID;
        ekrdVar.I("default call SIM: %s, default sms SIM %s. default data SIM %s.", dhizVar.c(strH), dhizVar.c(strH2), dhizVar.c(strH3));
        cmma cmmaVar = (cmma) cmmb.a.createBuilder();
        cmmaVar.getClass();
        cmmc.b(strH, cmmaVar);
        cmmc.e(strH2, cmmaVar);
        cmmc.c(strH3, cmmaVar);
        cmmc.d(str, cmmaVar);
        return cmmc.a(cmmaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.crof r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjx.e(crof, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if (r0 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:21:0x0049, B:31:0x0089, B:33:0x008d, B:35:0x00e2), top: B:49:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dggn r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjx.f(dggn, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0551, code lost:
    
        if (r0.n(r4) != r3) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0389 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:25:0x00b4, B:98:0x036c, B:99:0x0383, B:101:0x0389, B:103:0x0394, B:105:0x039a, B:106:0x039e, B:107:0x03ac, B:109:0x03b2, B:111:0x03c5, B:112:0x03c9, B:113:0x03d7, B:115:0x03dd, B:117:0x03ec, B:118:0x03f0, B:119:0x0426, B:121:0x042c, B:122:0x0451, B:124:0x046c, B:126:0x0474, B:127:0x049e, B:129:0x04a4, B:130:0x04b2, B:132:0x04bd, B:133:0x04d2, B:136:0x04fe, B:139:0x0530), top: B:208:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03b2 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:25:0x00b4, B:98:0x036c, B:99:0x0383, B:101:0x0389, B:103:0x0394, B:105:0x039a, B:106:0x039e, B:107:0x03ac, B:109:0x03b2, B:111:0x03c5, B:112:0x03c9, B:113:0x03d7, B:115:0x03dd, B:117:0x03ec, B:118:0x03f0, B:119:0x0426, B:121:0x042c, B:122:0x0451, B:124:0x046c, B:126:0x0474, B:127:0x049e, B:129:0x04a4, B:130:0x04b2, B:132:0x04bd, B:133:0x04d2, B:136:0x04fe, B:139:0x0530), top: B:208:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03dd A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:25:0x00b4, B:98:0x036c, B:99:0x0383, B:101:0x0389, B:103:0x0394, B:105:0x039a, B:106:0x039e, B:107:0x03ac, B:109:0x03b2, B:111:0x03c5, B:112:0x03c9, B:113:0x03d7, B:115:0x03dd, B:117:0x03ec, B:118:0x03f0, B:119:0x0426, B:121:0x042c, B:122:0x0451, B:124:0x046c, B:126:0x0474, B:127:0x049e, B:129:0x04a4, B:130:0x04b2, B:132:0x04bd, B:133:0x04d2, B:136:0x04fe, B:139:0x0530), top: B:208:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x042c A[Catch: all -> 0x00c1, LOOP:7: B:119:0x0426->B:121:0x042c, LOOP_END, TryCatch #0 {all -> 0x00c1, blocks: (B:25:0x00b4, B:98:0x036c, B:99:0x0383, B:101:0x0389, B:103:0x0394, B:105:0x039a, B:106:0x039e, B:107:0x03ac, B:109:0x03b2, B:111:0x03c5, B:112:0x03c9, B:113:0x03d7, B:115:0x03dd, B:117:0x03ec, B:118:0x03f0, B:119:0x0426, B:121:0x042c, B:122:0x0451, B:124:0x046c, B:126:0x0474, B:127:0x049e, B:129:0x04a4, B:130:0x04b2, B:132:0x04bd, B:133:0x04d2, B:136:0x04fe, B:139:0x0530), top: B:208:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x046c A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:25:0x00b4, B:98:0x036c, B:99:0x0383, B:101:0x0389, B:103:0x0394, B:105:0x039a, B:106:0x039e, B:107:0x03ac, B:109:0x03b2, B:111:0x03c5, B:112:0x03c9, B:113:0x03d7, B:115:0x03dd, B:117:0x03ec, B:118:0x03f0, B:119:0x0426, B:121:0x042c, B:122:0x0451, B:124:0x046c, B:126:0x0474, B:127:0x049e, B:129:0x04a4, B:130:0x04b2, B:132:0x04bd, B:133:0x04d2, B:136:0x04fe, B:139:0x0530), top: B:208:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0530 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:25:0x00b4, B:98:0x036c, B:99:0x0383, B:101:0x0389, B:103:0x0394, B:105:0x039a, B:106:0x039e, B:107:0x03ac, B:109:0x03b2, B:111:0x03c5, B:112:0x03c9, B:113:0x03d7, B:115:0x03dd, B:117:0x03ec, B:118:0x03f0, B:119:0x0426, B:121:0x042c, B:122:0x0451, B:124:0x046c, B:126:0x0474, B:127:0x049e, B:129:0x04a4, B:130:0x04b2, B:132:0x04bd, B:133:0x04d2, B:136:0x04fe, B:139:0x0530), top: B:208:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05a0 A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #1 {all -> 0x0053, blocks: (B:13:0x004a, B:145:0x0575, B:148:0x05a0, B:150:0x05d4, B:151:0x0603, B:153:0x060d, B:154:0x0633, B:157:0x063e, B:158:0x0662, B:160:0x0668, B:161:0x067f, B:200:0x077b, B:162:0x0687, B:163:0x0690, B:165:0x0696, B:166:0x06a1, B:168:0x06a7, B:172:0x06ba, B:191:0x070b, B:175:0x06bf, B:177:0x06c9, B:179:0x06d3, B:181:0x06dd, B:183:0x06e7, B:185:0x06f1, B:187:0x06fb, B:189:0x0701, B:192:0x070f, B:194:0x0715, B:195:0x072e, B:196:0x0752, B:198:0x0758, B:199:0x0771), top: B:209:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x060d A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:13:0x004a, B:145:0x0575, B:148:0x05a0, B:150:0x05d4, B:151:0x0603, B:153:0x060d, B:154:0x0633, B:157:0x063e, B:158:0x0662, B:160:0x0668, B:161:0x067f, B:200:0x077b, B:162:0x0687, B:163:0x0690, B:165:0x0696, B:166:0x06a1, B:168:0x06a7, B:172:0x06ba, B:191:0x070b, B:175:0x06bf, B:177:0x06c9, B:179:0x06d3, B:181:0x06dd, B:183:0x06e7, B:185:0x06f1, B:187:0x06fb, B:189:0x0701, B:192:0x070f, B:194:0x0715, B:195:0x072e, B:196:0x0752, B:198:0x0758, B:199:0x0771), top: B:209:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x063e A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #1 {all -> 0x0053, blocks: (B:13:0x004a, B:145:0x0575, B:148:0x05a0, B:150:0x05d4, B:151:0x0603, B:153:0x060d, B:154:0x0633, B:157:0x063e, B:158:0x0662, B:160:0x0668, B:161:0x067f, B:200:0x077b, B:162:0x0687, B:163:0x0690, B:165:0x0696, B:166:0x06a1, B:168:0x06a7, B:172:0x06ba, B:191:0x070b, B:175:0x06bf, B:177:0x06c9, B:179:0x06d3, B:181:0x06dd, B:183:0x06e7, B:185:0x06f1, B:187:0x06fb, B:189:0x0701, B:192:0x070f, B:194:0x0715, B:195:0x072e, B:196:0x0752, B:198:0x0758, B:199:0x0771), top: B:209:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0687 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:13:0x004a, B:145:0x0575, B:148:0x05a0, B:150:0x05d4, B:151:0x0603, B:153:0x060d, B:154:0x0633, B:157:0x063e, B:158:0x0662, B:160:0x0668, B:161:0x067f, B:200:0x077b, B:162:0x0687, B:163:0x0690, B:165:0x0696, B:166:0x06a1, B:168:0x06a7, B:172:0x06ba, B:191:0x070b, B:175:0x06bf, B:177:0x06c9, B:179:0x06d3, B:181:0x06dd, B:183:0x06e7, B:185:0x06f1, B:187:0x06fb, B:189:0x0701, B:192:0x070f, B:194:0x0715, B:195:0x072e, B:196:0x0752, B:198:0x0758, B:199:0x0771), top: B:209:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015c A[Catch: all -> 0x078e, TryCatch #4 {all -> 0x078e, blocks: (B:43:0x0130, B:44:0x0156, B:46:0x015c, B:67:0x01fb, B:50:0x017e, B:52:0x0186, B:56:0x01a3, B:59:0x01b1, B:61:0x01b7, B:66:0x01f7, B:62:0x01ce, B:69:0x020a, B:70:0x022d, B:72:0x0233, B:73:0x0246, B:75:0x024c, B:76:0x0258), top: B:215:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0233 A[Catch: all -> 0x078e, LOOP:11: B:70:0x022d->B:72:0x0233, LOOP_END, TryCatch #4 {all -> 0x078e, blocks: (B:43:0x0130, B:44:0x0156, B:46:0x015c, B:67:0x01fb, B:50:0x017e, B:52:0x0186, B:56:0x01a3, B:59:0x01b1, B:61:0x01b7, B:66:0x01f7, B:62:0x01ce, B:69:0x020a, B:70:0x022d, B:72:0x0233, B:73:0x0246, B:75:0x024c, B:76:0x0258), top: B:215:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024c A[Catch: all -> 0x078e, TryCatch #4 {all -> 0x078e, blocks: (B:43:0x0130, B:44:0x0156, B:46:0x015c, B:67:0x01fb, B:50:0x017e, B:52:0x0186, B:56:0x01a3, B:59:0x01b1, B:61:0x01b7, B:66:0x01f7, B:62:0x01ce, B:69:0x020a, B:70:0x022d, B:72:0x0233, B:73:0x0246, B:75:0x024c, B:76:0x0258), top: B:215:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293 A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:86:0x02b3, B:81:0x028d, B:83:0x0293, B:87:0x02bb, B:89:0x02c9, B:95:0x0349, B:90:0x02ef, B:91:0x0317, B:93:0x031d, B:94:0x0342, B:35:0x00f6, B:80:0x0276), top: B:217:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bb A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:86:0x02b3, B:81:0x028d, B:83:0x0293, B:87:0x02bb, B:89:0x02c9, B:95:0x0349, B:90:0x02ef, B:91:0x0317, B:93:0x031d, B:94:0x0342, B:35:0x00f6, B:80:0x0276), top: B:217:0x00f6 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x02b0 -> B:86:0x02b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r24, defpackage.eoaz r25, defpackage.fcxy r26) {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjx.g(java.util.List, eoaz, fcxy):java.lang.Object");
    }

    public final String h(int i) {
        String strF;
        String strN;
        String strN2;
        cmjk cmjkVar = this.h;
        dggn dggnVarA = cmjkVar.a(i);
        if (dggnVarA != null) {
            return dggo.a(dggnVarA).a;
        }
        String strW = ((crny) this.e.b()).h(i).w();
        strW.getClass();
        if (p(i, strW)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSimStateTracker");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRcsProvisioningIdForFi-bYZ02fE", 891, "PhoneSimsStateUpdaterImpl.kt")).q("Getting RcsProvisioningId for Fi subscription.");
            String strI = i(strW);
            strF = strI != null ? ((crqv) this.p.b()).f("msisdn_for_iccid_".concat(strI), null) : null;
            if (strF == null) {
                strF = q(m(i));
            }
        } else {
            strF = "";
            if (this.w.a()) {
                dhkv dhkvVarL = l(i);
                if (dhkvVarL != null && (strN2 = dhkvVarL.n()) != null) {
                    strF = strN2;
                }
                if (strF.length() == 0) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleSimStateTracker");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getSimSerialNumberFromTelephony-0jkzt_0", 1106, "PhoneSimsStateUpdaterImpl.kt")).t("getSimSerialNumberFromTelephony: SimSerialNumber is empty for subscription ID %s", new dggr(i));
                }
            } else {
                dhkv dhkvVarL2 = l(i);
                if (dhkvVarL2 != null && (strN = dhkvVarL2.n()) != null) {
                    strF = strN;
                }
            }
        }
        dggp dggpVar = new dggp(strF);
        if (dggo.a(dggpVar).a.length() != 0 && i >= 0 && dggo.a(dggpVar).a.length() != 0) {
            cmjkVar.b.set(true);
            cmjkVar.c.put(new dggr(i), dggpVar);
        }
        return strF;
    }

    public final String i(String str) {
        return ((crqv) this.p.b()).f("rcs_user_id_".concat(str), str);
    }

    public final void k(int i) {
        ((ains) ((cmlp) this.u.b()).a.b()).e("Bugle.Dsdr.PhoneSimsStateUpdater", i - 1);
    }
}
