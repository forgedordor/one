package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crmx implements cqci {
    public static final cqce a = cqce.g("Bugle", "BuglePhoneNumberUtils");
    private static final cqbr f = new cqbr(TimeUnit.SECONDS.toMillis(10));
    private static final cqbr g = new cqbr(TimeUnit.SECONDS.toMillis(10));
    private static final ejxr h = ejxx.a(new ejxr() { // from class: crms
        @Override // defpackage.ejxr
        public final Object get() {
            cqce cqceVar = crmx.a;
            return Pattern.compile("\\s");
        }
    });
    public final fcsu b;
    public final eygg c;
    public final fcsu d;
    public final fcsu e;
    private final Context j;
    private final crnf k;
    private final csq i = new csq();
    private final ejxr l = ejxx.a(new ejxr() { // from class: crmt
        @Override // defpackage.ejxr
        public final Object get() {
            cqce cqceVar = crmx.a;
            return ekhx.o(((ewto) dfog.o().a.an.a()).b);
        }
    });

    public crmx(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, crnf crnfVar, eygg eyggVar) {
        this.j = context;
        this.b = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.k = crnfVar;
        this.c = eyggVar;
        cqaz.l(context);
    }

    private final csq O(String str) {
        if (str == null) {
            str = "";
        }
        csq csqVar = this.i;
        csq csqVar2 = (csq) csqVar.get(str);
        if (csqVar2 != null) {
            return csqVar2;
        }
        csq csqVar3 = new csq();
        csqVar.put(str, csqVar3);
        return csqVar3;
    }

    private static Optional P(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str) || str.length() < 5) {
            return Optional.empty();
        }
        if (str.length() == 6) {
            return Optional.of(str);
        }
        return Optional.of(String.format(Locale.US, "%03d%03d", Integer.valueOf(Integer.parseInt(str.substring(0, 3))), Integer.valueOf(Integer.parseInt(str.substring(3)))));
    }

    public final String A() {
        return this.k.c();
    }

    public final String B(String str, ephg ephgVar) {
        cqbd cqbdVarD = a.d();
        cqbdVarD.K(f, str);
        cqbdVarD.I("format if normalized.");
        cqbdVarD.k(str);
        cqbdVarD.A("format", ephgVar);
        cqbdVarD.r();
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return ((ephj) this.c.b()).b(e(str, null), ephgVar);
        } catch (ephe unused) {
            return str;
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [alqm, java.lang.Object] */
    public final HashSet C() {
        HashSet hashSet = new HashSet();
        fcsu fcsuVar = this.e;
        Iterator it = ((crny) fcsuVar.b()).m().iterator();
        while (it.hasNext()) {
            Optional optionalI = ((crny) fcsuVar.b()).h(((crof) it.next()).a()).i(true);
            hashSet.add(optionalI.isPresent() ? ejwk.b(optionalI.get().h()) : "");
        }
        return hashSet;
    }

    public final void D(String str, String str2, crmw crmwVar) {
        synchronized (this.i) {
            O(str2).put(str, crmwVar);
        }
    }

    @Deprecated
    public final boolean E() {
        return Settings.Global.getInt(((crnp) this.d.b()).b.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    @Deprecated
    public final boolean F() {
        TelephonyManager telephonyManager = (TelephonyManager) ((crnp) this.d.b()).d.get();
        return telephonyManager != null && telephonyManager.getPhoneType() == 2;
    }

    @Deprecated
    public final boolean G() {
        return ((crnp) this.d.b()).d();
    }

    @Deprecated
    public final boolean H(String str) {
        try {
            return PhoneNumberUtils.isEmergencyNumber(str);
        } catch (Exception e) {
            a.o("isEmergencyNumber: unexpected exception", e);
            return false;
        }
    }

    public final boolean I(String str) {
        if (dhim.d(str)) {
            return false;
        }
        return str.equals(w(str, "", etdn.ZZ.eW, false));
    }

    public final boolean J(ephf ephfVar) {
        return ((ephj) this.c.b()).i(ephfVar);
    }

    @Deprecated
    public final boolean K() {
        return ((crnp) this.d.b()).f();
    }

    @Deprecated
    public final boolean L(String str) {
        try {
            return ((ephj) this.c.b()).j(e(str, ""));
        } catch (ephe unused) {
            return false;
        }
    }

    public final boolean M(String str) {
        if (dhim.d(str) || str.charAt(0) != '+') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    public final int N(ephf ephfVar) {
        return ((ephj) this.c.b()).m(ephfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.crmw a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            eygg r0 = r8.c
            java.lang.Object r0 = r0.b()
            ephj r0 = (defpackage.ephj) r0
            r1 = 0
            java.lang.String r2 = defpackage.ejwk.a(r10)     // Catch: defpackage.ephe -> L71
            ephf r2 = r8.e(r9, r2)     // Catch: defpackage.ephe -> L71
            ejxr r3 = r8.l     // Catch: defpackage.ephe -> L71
            java.lang.Object r4 = r3.get()     // Catch: defpackage.ephe -> L71
            ekhx r4 = (defpackage.ekhx) r4     // Catch: defpackage.ephe -> L71
            boolean r4 = r4.isEmpty()     // Catch: defpackage.ephe -> L71
            r5 = 1
            if (r4 != 0) goto L48
            boolean r4 = r2.e()     // Catch: defpackage.ephe -> L71
            if (r4 != 0) goto L27
            goto L48
        L27:
            crnc r4 = new crnc     // Catch: defpackage.ephe -> L71
            int r6 = r2.a()     // Catch: defpackage.ephe -> L71
            r4.<init>(r6)     // Catch: defpackage.ephe -> L71
            java.lang.String r4 = r8.z(r4)     // Catch: defpackage.ephe -> L71
            java.lang.Object r3 = r3.get()     // Catch: defpackage.ephe -> L71
            ekhx r3 = (defpackage.ekhx) r3     // Catch: defpackage.ephe -> L71
            boolean r3 = r3.contains(r4)     // Catch: defpackage.ephe -> L71
            if (r3 == 0) goto L48
            boolean r3 = r8.J(r2)     // Catch: defpackage.ephe -> L71
            if (r3 == 0) goto L48
            r3 = r5
            goto L49
        L48:
            r3 = r1
        L49:
            int r4 = r8.N(r2)     // Catch: defpackage.ephe -> L71
            if (r4 != r5) goto L51
            r4 = r5
            goto L52
        L51:
            r4 = r1
        L52:
            crmm r6 = new crmm     // Catch: defpackage.ephe -> L71
            r6.<init>()     // Catch: defpackage.ephe -> L71
            ephg r7 = defpackage.ephg.E164     // Catch: defpackage.ephe -> L71
            java.lang.String r0 = r0.b(r2, r7)     // Catch: defpackage.ephe -> L71
            r6.b(r0)     // Catch: defpackage.ephe -> L71
            if (r3 != 0) goto L66
            if (r4 == 0) goto L65
            goto L66
        L65:
            r5 = r1
        L66:
            r6.d(r5)     // Catch: defpackage.ephe -> L71
            r6.c(r4)     // Catch: defpackage.ephe -> L71
            crmw r9 = r6.a()     // Catch: defpackage.ephe -> L71
            return r9
        L71:
            r0 = move-exception
            cqce r2 = defpackage.crmx.a
            cqbd r2 = r2.a()
            java.lang.String r3 = "Not able to parse phone number"
            r2.I(r3)
            r2.k(r9)
            java.lang.String r3 = "for country"
            r2.I(r3)
            r2.I(r10)
            r2.s(r0)
            crmm r10 = new crmm
            r10.<init>()
            r10.b(r9)
            r10.d(r1)
            r10.c(r1)
            crmw r9 = r10.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crmx.a(java.lang.String, java.lang.String):crmw");
    }

    public final crmw b(String str, String str2) {
        crmw crmwVar;
        synchronized (this.i) {
            crmwVar = (crmw) O(str2).get(str);
        }
        return crmwVar;
    }

    public final crnc c(String str) {
        return new crnc(((ephj) this.c.b()).a(str));
    }

    public final ekhx d() {
        return (ekhx) Collection.EL.stream(((crny) this.e.b()).m()).map(new Function() { // from class: crmq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((crny) this.a.e.b()).h(((crof) obj).a()).i(true);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).flatMap(new Function() { // from class: crmr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) obj).stream();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
    }

    public final ephf e(String str, String str2) {
        return ((ephj) this.c.b()).n(((Pattern) h.get()).matcher(str).replaceAll(""), str2);
    }

    public final Optional f(String str) {
        try {
            return Optional.of(new crnc(e(str, "").a()));
        } catch (ephe unused) {
            return Optional.empty();
        }
    }

    public final Optional g(String str, String str2) {
        try {
            return Optional.of(new crnc(e(str, str2).a()));
        } catch (ephe unused) {
            return Optional.empty();
        }
    }

    public final Optional h() {
        TelephonyManager telephonyManager = (TelephonyManager) ((crnp) this.d.b()).d.get();
        return P(telephonyManager == null ? null : telephonyManager.getSimOperator());
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        csq csqVar = this.i;
        synchronized (csqVar) {
            csqVar.clear();
            ((ephj) this.c.b()).p();
        }
    }

    public final Optional j() {
        TelephonyManager telephonyManager = (TelephonyManager) ((crnp) this.d.b()).d.get();
        return P(telephonyManager == null ? null : telephonyManager.getNetworkOperator());
    }

    public final Optional k() {
        if (dfog.O()) {
            return Optional.ofNullable(ejwk.a(r()));
        }
        fcsu fcsuVar = this.b;
        fcsuVar.getClass();
        String strB = ((crmu) fcsuVar.b()).b();
        if (crpq.a(strB)) {
            strB = s();
        }
        return Optional.ofNullable(ejwk.a(strB));
    }

    public final String l(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return String.format(lad.a(this.j.getResources().getConfiguration()).f(0), "%03d%03d", Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(Integer.parseInt(str2)));
            } catch (NumberFormatException unused) {
            }
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("canonicalizeMccMnc: invalid mccmnc.");
        cqbdVarE.A("mcc", str);
        cqbdVarE.A("mnc", str2);
        cqbdVarE.r();
        return String.valueOf(str).concat(String.valueOf(str2));
    }

    public final String m(ephf ephfVar, ephg ephgVar) {
        return ((ephj) this.c.b()).b(ephfVar, ephgVar);
    }

    @Deprecated
    public final String n(String str) {
        return B(str, ephg.INTERNATIONAL);
    }

    final String o(String str) {
        return str.toUpperCase(lad.a(this.j.getResources().getConfiguration()).f(0));
    }

    @Deprecated
    public final String p(String str) {
        fcsu fcsuVar = this.b;
        cqaz.l(fcsuVar);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iA = ((crmu) fcsuVar.b()).a();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i < iA) {
            return str;
        }
        String strR = r();
        crnc crncVar = (dfog.O() && strR.isEmpty()) ? new crnc(0) : c(strR);
        try {
            ephf ephfVarE = e(str, strR);
            crnc crncVar2 = new crnc(ephfVarE.a());
            ephg ephgVar = (crncVar.b() || !crncVar2.equals(crncVar)) ? ephg.INTERNATIONAL : ephg.NATIONAL;
            String strB = ((ephj) this.c.b()).b(ephfVarE, ephgVar);
            cqbd cqbdVarD = a.d();
            cqbdVarD.K(g, str);
            cqbdVarD.I("format for display.");
            cqbdVarD.k(str);
            cqbdVarD.I("-->");
            cqbdVarD.k(strB);
            cqbdVarD.A("systemCountry", strR);
            cqbdVarD.A("systemCountryCode", crncVar);
            cqbdVarD.A("callCode", crncVar2);
            cqbdVarD.A("phoneNumberFormat", ephgVar);
            cqbdVarD.r();
            return strB;
        } catch (ephe e) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("formatForDisplay: invalid phone number");
            cqbdVarE.k(str);
            cqbdVarE.I("with country");
            cqbdVarE.I(strR);
            cqbdVarE.s(e);
            return str;
        }
    }

    @Deprecated
    public final String q() {
        return ((crnp) this.d.b()).a();
    }

    public final String r() {
        fcsu fcsuVar = this.b;
        cqaz.l(fcsuVar);
        String strB = ((crmu) fcsuVar.b()).b();
        return crpq.a(strB) ? dfog.O() ? this.k.b() : this.k.c() : strB;
    }

    public final String s() {
        Locale localeF = lad.a(this.j.getResources().getConfiguration()).f(0);
        String country = localeF.getCountry();
        if (TextUtils.isEmpty(country)) {
            return null;
        }
        return country.toUpperCase(localeF);
    }

    public final String t(int[] iArr) {
        return String.format(lad.a(this.j.getResources().getConfiguration()).f(0), "%03d%03d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public final String u(ephf ephfVar) {
        return ((ephj) this.c.b()).d(ephfVar);
    }

    public final String v(String str, String str2) {
        return w(str, str, str2, false);
    }

    public final String w(String str, String str2, String str3, boolean z) {
        crmw crmwVarB = b(str, str3);
        if (crmwVarB == null) {
            crmwVarB = a(str, str3);
            D(str, str3, crmwVarB);
        }
        if (crmwVarB.c() || !z) {
            return crmwVarB.c() ? crmwVarB.a() : str2;
        }
        throw new IllegalArgumentException("Phone number could not be normalized");
    }

    public final String x(String str) {
        return v(str, r());
    }

    public final String y(String str, boolean z) {
        return w(str, str, (String) k().orElse(etdn.ZZ.eW), z);
    }

    public final String z(crnc crncVar) {
        return ((ephj) this.c.b()).e(crncVar.a);
    }
}
