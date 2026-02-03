package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afwu implements afvu {
    public static final cqce a = cqce.g("BugleMultiShare", "SuggestionsAdapterImpl");
    public final Context b;
    public final fcsu c;
    public final fcsu d;
    public final afuc e;
    public final afmz f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final envd j;
    public final asgv k;
    public final fcsu l;
    public final afvt m;
    private final fdjx n;
    private final ajoy o;
    private final fcsu p;
    private final fdvc q;
    private final fdvc r;
    private final fdvc s;
    private final fdvc t;
    private final fdvc u;
    private final fdvc v;

    public afwu(fdjx fdjxVar, Context context, fcsu fcsuVar, fcsu fcsuVar2, afuc afucVar, ajoy ajoyVar, afmz afmzVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, envd envdVar, asgv asgvVar, fcsu fcsuVar7) {
        fdjxVar.getClass();
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        afucVar.getClass();
        ajoyVar.getClass();
        afmzVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        envdVar.getClass();
        fcsuVar7.getClass();
        this.n = fdjxVar;
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = afucVar;
        this.o = ajoyVar;
        this.f = afmzVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.p = fcsuVar6;
        this.j = envdVar;
        this.k = asgvVar;
        this.l = fcsuVar7;
        afvt afvtVar = new afvt(null);
        this.m = afvtVar;
        fdvc fdvcVarB = fdtg.b(new afwj(afucVar.b(), this), fdjxVar, fdur.a(0L, 3), new afvq(null));
        this.q = fdvcVarB;
        fdvc fdvcVarB2 = fdtg.b(new fdua(new afwm(fdvcVarB, this), afmzVar.b(), new afwd(this)), fdjxVar, fdur.a(0L, 3), afvtVar);
        this.r = fdvcVarB2;
        fdua fduaVar = new fdua(new afwp(fdvcVarB, this), afmzVar.b(), new afwt(this, null));
        fdus fdusVarA = fdur.a(0L, 3);
        fcvo fcvoVar = fcvo.a;
        fdvc fdvcVarB3 = fdtg.b(fduaVar, fdjxVar, fdusVarA, fcvoVar);
        this.s = fdvcVarB3;
        fdvc fdvcVarB4 = fdtg.b(new fdua(new afws(fdvcVarB, this), afmzVar.b(), new afwb(this, null)), fdjxVar, fdur.a(0L, 3), fcvoVar);
        this.t = fdvcVarB4;
        fdvc fdvcVarA = ((afvf) fcsuVar6.b()).a();
        this.u = fdvcVarA;
        this.v = fdtg.b(fdud.b(fdvcVarB2, fdvcVarB3, fdvcVarB4, fdvcVarA, new afwc(this)), fdjxVar, fdur.a(0L, 3), afvtVar);
    }

    @Override // defpackage.afvu
    public final fdvc a() {
        return this.v;
    }

    public final afvo b(final ajpq ajpqVar, final String str, final afmy afmyVar, final Pattern pattern) {
        return new afvo(str, new fdae() { // from class: afwa
            @Override // defpackage.fdae
            public final Object invoke() {
                final afwu afwuVar = this;
                final ajpq ajpqVar2 = ajpqVar;
                String strC = ajpqVar2.c();
                dkri dkriVarD = uds.d((uds) afwuVar.i.b(), ajpqVar2);
                afmy afmyVar2 = afmyVar;
                String strE = ajpqVar2.e();
                String strD = ajpqVar2.d();
                boolean zF = afmyVar2.f(ajpqVar2.b());
                Pattern pattern2 = pattern;
                List listF = afwuVar.f(pattern2, ajpqVar2.e(), 1, 0);
                String strConcat = strC.concat(" ");
                return new afvc(str, new djys(dkriVarD, strE, strConcat.concat(strD), zF, fcva.ah(listF, afwuVar.f(pattern2, ajpqVar2.d(), 2, strConcat.length())), new fdae() { // from class: afvw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        afwu afwuVar2 = afwuVar;
                        afxx.d((afxx) afwuVar2.h.b(), 6, 0, 0, 6);
                        ajpq ajpqVar3 = ajpqVar2;
                        ajpqVar3.getClass();
                        afwuVar2.f.c(new ChipData(new ChipId.Identity(ajpqVar3.b()), ajpqVar3.e(), ajpqVar3.g(), ajpqVar3.a(), false, 16, null));
                        afwuVar2.e.c();
                        return fctx.a;
                    }
                }, new djyo(afwuVar.k.a())));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, java.util.regex.Pattern r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.afwe
            if (r0 == 0) goto L13
            r0 = r8
            afwe r0 = (defpackage.afwe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afwe r0 = new afwe
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.util.regex.Pattern r7 = r0.e
            java.lang.String r6 = r0.d
            defpackage.fctl.b(r8)
            goto L70
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.fctl.b(r8)
            int r8 = r6.length()
            if (r8 != 0) goto L45
            afvb r6 = new afvb
            r7 = 0
            r6.<init>(r7)
            return r6
        L45:
            cqce r8 = defpackage.afwu.a
            cqbd r8 = r8.a()
            r8.M(r3, r6)
            java.lang.String r2 = "searching corp contacts"
            r8.I(r2)
            r8.r()
            ajoy r8 = r5.o
            ajoz r8 = r8.b()
            eiju r8 = r8.a(r6)
            r8.getClass()
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            ekgb r8 = (defpackage.ekgb) r8
            cqce r0 = defpackage.afwu.a
            cqbd r0 = r0.a()
            r0.M(r3, r6)
            java.lang.String r1 = "finished searching corp contacts"
            r0.I(r1)
            r0.r()
            afvb r0 = new afvb
            r8.getClass()
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afwu.c(java.lang.String, java.util.regex.Pattern, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, java.util.regex.Pattern r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.afwf
            if (r0 == 0) goto L13
            r0 = r9
            afwf r0 = (defpackage.afwf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afwf r0 = new afwf
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            dzub r7 = r0.f
            java.util.regex.Pattern r8 = r0.e
            java.lang.String r0 = r0.d
            defpackage.fctl.b(r9)
            r5 = r9
            r9 = r7
            r7 = r0
            r0 = r5
            goto L83
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            defpackage.fctl.b(r9)
            int r9 = r7.length()
            if (r9 != 0) goto L4b
            afvp r7 = new afvp
            r8 = 0
            r7.<init>(r8)
            return r7
        L4b:
            cqce r9 = defpackage.afwu.a
            cqbd r9 = r9.a()
            r9.M(r3, r7)
            java.lang.String r2 = "searching personal contacts"
            r9.I(r2)
            r9.r()
            fcsu r9 = r6.g
            java.lang.Object r9 = r9.b()
            dzuc r9 = (defpackage.dzuc) r9
            dzub r9 = r9.d()
            ajoy r2 = r6.o
            ajoz r2 = r2.b()
            eiju r2 = r2.b(r7)
            r2.getClass()
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.c = r4
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto L9e
        L83:
            ekgb r0 = (defpackage.ekgb) r0
            cqce r1 = defpackage.afwu.a
            cqbd r1 = r1.a()
            r1.M(r3, r7)
            java.lang.String r2 = "finished searching personal contacts"
            r1.I(r2)
            r1.r()
            afvp r1 = new afvp
            r0.getClass()
            r1.<init>(r7, r0, r8, r9)
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afwu.d(java.lang.String, java.util.regex.Pattern, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, java.util.regex.Pattern r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.afwg
            if (r0 == 0) goto L13
            r0 = r8
            afwg r0 = (defpackage.afwg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afwg r0 = new afwg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.util.regex.Pattern r7 = r0.e
            java.lang.String r6 = r0.d
            defpackage.fctl.b(r8)
            goto L70
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.fctl.b(r8)
            int r8 = r6.length()
            if (r8 != 0) goto L45
            afvb r6 = new afvb
            r7 = 0
            r6.<init>(r7)
            return r6
        L45:
            cqce r8 = defpackage.afwu.a
            cqbd r8 = r8.a()
            r8.M(r3, r6)
            java.lang.String r2 = "searching work contacts"
            r8.I(r2)
            r8.r()
            ajoy r8 = r5.o
            ajoz r8 = r8.b()
            eiju r8 = r8.c(r6)
            r8.getClass()
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            ekgb r8 = (defpackage.ekgb) r8
            cqce r0 = defpackage.afwu.a
            cqbd r0 = r0.a()
            r0.M(r3, r6)
            java.lang.String r1 = "finished searching work contacts"
            r0.I(r1)
            r0.r()
            afvb r0 = new afvb
            r8.getClass()
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afwu.e(java.lang.String, java.util.regex.Pattern, fcxy):java.lang.Object");
    }

    public final List f(Pattern pattern, String str, int i, int i2) {
        if (pattern == null) {
            return fcvo.a;
        }
        Locale localeC = craf.c(this.b);
        localeC.getClass();
        String lowerCase = str.toLowerCase(localeC);
        lowerCase.getClass();
        Matcher matcher = pattern.matcher(lowerCase);
        matcher.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (matcher.find(i3)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            arrayList.add(new djwf(2, i, iStart + i2, iEnd + i2));
            i3 = iEnd;
        }
        if (i == 2) {
            arrayList.add(new djwf(3, 2, i2, str.length() + i2));
        }
        return arrayList;
    }
}
