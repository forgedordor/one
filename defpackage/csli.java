package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csli implements cscu, csde {
    public static final cczv a;
    public static final cczi b;
    public static final cczi c;
    public static final ejxr d;
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection");
    public final fcsu e;
    public final fcsu f;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcyh k;

    static {
        dzzf dzzfVar = cdag.b;
        ewtl ewtlVar = (ewtl) ewtm.a.createBuilder();
        ewtlVar.a(30);
        ewtlVar.a(30);
        ewtlVar.a(30);
        a = cdag.t(dzzfVar, "safe_url_recheck_delay_array_seconds", ewtlVar.build(), new dzze() { // from class: csky
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewtm) evsn.parseFrom(ewtm.a, bArr);
            }
        });
        b = cdag.m(cdag.b, "enable_safe_url_on_click_prevent_redundant_check", true);
        c = cdag.m(cdag.b, "enable_safe_url_reclassify_after_verdict", false);
        d = cdag.v("safe_url_optimize_reclassification");
    }

    public csli(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcyhVar.getClass();
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = fcyhVar;
    }

    @Override // defpackage.cscu
    public final csdl a() {
        return csdl.g;
    }

    @Override // defpackage.cscu
    public final eieu b() {
        return eiiy.a("SafeUrlSpamProtection.classify");
    }

    @Override // defpackage.cscu
    public final eieu c() {
        return eiiy.a("SafeUrlSpamProtection.reclassify");
    }

    @Override // defpackage.cscu
    public final Object d(csch cschVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.k), new cslb(null, this, cschVar), fcxyVar);
    }

    @Override // defpackage.cscu
    public final Object e(csch cschVar, int i, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.k), new csle(null, this, cschVar, i), fcxyVar);
    }

    @Override // defpackage.cscu
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.csde
    public final eieu g() {
        return eiiy.a("SafeUrlSpamProtection.classifyOnClickTrace");
    }

    @Override // defpackage.csde
    public final Object h(csch cschVar, String str, fcxy fcxyVar) {
        if (str.length() > 0) {
            return fdin.a(eicg.a(this.k), new cslc(null, this, cschVar, str), fcxyVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.csch r8, java.util.List r9, defpackage.fcxy r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csli.i(csch, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.csch r15, java.util.List r16, defpackage.eoeo r17, java.lang.Integer r18, defpackage.fcxy r19) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csli.j(csch, java.util.List, eoeo, java.lang.Integer, fcxy):java.lang.Object");
    }

    public final boolean k() {
        if (((afhk) this.j.b()).c()) {
            return true;
        }
        ekrw ekrwVarE = g.e();
        ekrwVarE.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "allowedToCheckUrls", 291, "SafeUrlSpamProtection.kt")).q("Link preview disabled, skipping URL check");
        return false;
    }

    public final Object l(csch cschVar) {
        if (k()) {
            String str = cschVar.l;
            if (str != null && str.length() != 0) {
                List listB = cdsc.b(str);
                if (listB != null && !listB.isEmpty()) {
                    return listB;
                }
                ekrw ekrwVarE = g.e();
                ekrwVarE.X(eksq.a, "BugleSpam");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "getUrlsFromMessage", 307, "SafeUrlSpamProtection.kt")).q("No urls found, skipping bad urls check.");
                return null;
            }
            ekrw ekrwVarE2 = g.e();
            ekrwVarE2.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "getUrlsFromMessage", 301, "SafeUrlSpamProtection.kt")).q("No text in the message, skipping URL check.");
        }
        return null;
    }
}
