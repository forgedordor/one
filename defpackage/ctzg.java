package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctzg implements ctyf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl");
    private final fdvc A;
    private final fdvc B;
    private final fdvc C;
    private final fdvc D;
    public final Context b;
    public final cucf c;
    public final fcsu d;
    public final ctuu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final asgz i;
    public final aquo j;
    public final ardr k;
    public final ctma l;
    public final ctye m;
    private final fdjx n;
    private final ajoy o;
    private final cudy p;
    private final fcsu q;
    private final fcsu r;
    private final ctpr s;
    private final fdvc t;
    private final fdvc u;
    private final fdvc v;
    private final fdpl w;
    private final fdpl x;
    private final fdpl y;
    private final fdvc z;

    /* JADX WARN: Multi-variable type inference failed */
    public ctzg(fdjx fdjxVar, Context context, cucf cucfVar, ajoy ajoyVar, cudy cudyVar, fcsu fcsuVar, ctuu ctuuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, asgz asgzVar, ctpr ctprVar, aquo aquoVar, ardr ardrVar, ctma ctmaVar) {
        fdvc auxsVar;
        fdjxVar.getClass();
        context.getClass();
        cucfVar.getClass();
        ajoyVar.getClass();
        cudyVar.getClass();
        ctuuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        ctprVar.getClass();
        aquoVar.getClass();
        ardrVar.getClass();
        ctmaVar.getClass();
        this.n = fdjxVar;
        this.b = context;
        this.c = cucfVar;
        this.o = ajoyVar;
        this.p = cudyVar;
        this.d = fcsuVar;
        this.e = ctuuVar;
        this.q = fcsuVar2;
        this.r = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.i = asgzVar;
        this.s = ctprVar;
        this.j = aquoVar;
        this.k = ardrVar;
        this.l = ctmaVar;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        ctye ctyeVar = new ctye((String) null, (List) null, (fdae) null, (String) null, (ctyd) null, (fdae) null, 127);
        this.m = ctyeVar;
        fdvc fdvcVarB = fdtg.b(new ctyv(cucfVar.b(), this), fdjxVar, fdur.a(0L, 3), new cubm(null));
        this.t = fdvcVarB;
        fdvc fdvcVarA = ((cubb) fcsuVar2.b()).a();
        this.u = fdvcVarA;
        fdvc fdvcVarA2 = ((cual) fcsuVar3.b()).a();
        this.v = fdvcVarA2;
        fdpl ctyyVar = new ctyy(fdvcVarB, this);
        ctyyVar = ardrVar.a() ? fdtg.b(ctyyVar, fdjxVar, fdur.a(0L, 3), new cuaz(objArr3 == true ? 1 : 0)) : ctyyVar;
        this.w = ctyyVar;
        fdpl ctzbVar = new ctzb(fdvcVarB, this);
        ctzbVar = ardrVar.a() ? fdtg.b(ctzbVar, fdjxVar, fdur.a(0L, 3), new ctxy(objArr2 == true ? 1 : 0)) : ctzbVar;
        this.x = ctzbVar;
        fdpl ctzeVar = new ctze(fdvcVarB, this);
        ctzeVar = ardrVar.a() ? fdtg.b(ctzeVar, fdjxVar, fdur.a(0L, 3), new ctxy(objArr == true ? 1 : 0)) : ctzeVar;
        this.y = ctzeVar;
        if (ardrVar.a()) {
            fdpl fdplVarA = fdud.a(ctyyVar, ctzbVar, ctzeVar, new ctyr(null));
            ctys ctysVar = new ctys(null, this);
            int i = fdsn.a;
            auxsVar = fdtg.b(new fdwg(ctysVar, fdplVarA), fdjxVar, fdur.a(0L, 3), fcvp.a);
        } else {
            auxsVar = new auxs(new fdae() { // from class: ctyg
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fcvp.a;
                }
            });
        }
        this.z = auxsVar;
        fdvc fdvcVarB2 = fdtg.b(fdud.a(ctyyVar, cudyVar.a(), auxsVar, new ctyn(this)), fdjxVar, fdur.a(0L, 3), ctyeVar);
        this.A = fdvcVarB2;
        fdpl fdplVarA2 = fdud.a(ctzbVar, cudyVar.a(), auxsVar, new ctzf(this, null));
        fdus fdusVarA = fdur.a(0L, 3);
        fcvo fcvoVar = fcvo.a;
        fdvc fdvcVarB3 = fdtg.b(fdplVarA2, fdjxVar, fdusVarA, fcvoVar);
        this.B = fdvcVarB3;
        fdvc fdvcVarB4 = fdtg.b(fdud.a(ctzeVar, cudyVar.a(), auxsVar, new ctyl(this, null)), fdjxVar, fdur.a(0L, 3), fcvoVar);
        this.C = fdvcVarB4;
        this.D = fdtg.b(auyf.a(fdvcVarA, fdvcVarB2, fdvcVarB3, fdvcVarB4, fdvcVarA2, ctprVar.a(), new ctym(this)), fdjxVar, fdur.a(0L, 3), ctyeVar);
    }

    @Override // defpackage.ctyf
    public final /* synthetic */ fdpl a() {
        return this.D;
    }

    public final ctzh b() {
        String string = this.b.getString(R.string.group_directory_header);
        string.getClass();
        return new ctzh("group_header", new djyp(string));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, java.util.regex.Pattern r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ctyo
            if (r0 == 0) goto L13
            r0 = r11
            ctyo r0 = (defpackage.ctyo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctyo r0 = new ctyo
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "queryCorp"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "BugleContacts"
            r6 = 1
            java.lang.String r7 = "ContactSuggestionsAdapterImpl.kt"
            if (r2 == 0) goto L3b
            if (r2 != r6) goto L33
            java.util.regex.Pattern r10 = r0.e
            java.lang.String r9 = r0.d
            defpackage.fctl.b(r11)
            goto L84
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.fctl.b(r11)
            int r11 = r9.length()
            if (r11 != 0) goto L4b
            ctxy r9 = new ctxy
            r10 = 0
            r9.<init>(r10)
            return r9
        L4b:
            ekrg r11 = defpackage.ctzg.a
            ekrw r11 = r11.e()
            ekrz r2 = defpackage.eksq.a
            r11.X(r2, r5)
            ekrd r11 = (defpackage.ekrd) r11
            ekrz r2 = defpackage.cqnc.I
            r11.X(r2, r9)
            r2 = 248(0xf8, float:3.48E-43)
            ekrw r11 = r11.h(r4, r3, r2, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "searching corp contacts"
            r11.q(r2)
            ajoy r11 = r8.o
            ajoz r11 = r11.b()
            eiju r11 = r11.a(r9)
            r11.getClass()
            r0.d = r9
            r0.e = r10
            r0.c = r6
            java.lang.Object r11 = defpackage.fdxs.c(r11, r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            ekgb r11 = (defpackage.ekgb) r11
            ekrg r0 = defpackage.ctzg.a
            ekrw r0 = r0.e()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.cqnc.I
            r0.X(r1, r9)
            r1 = 251(0xfb, float:3.52E-43)
            ekrw r0 = r0.h(r4, r3, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "finished searching corp contacts"
            r0.q(r1)
            ctxy r0 = new ctxy
            r11.getClass()
            r0.<init>(r9, r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctzg.c(java.lang.String, java.util.regex.Pattern, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r10, java.util.regex.Pattern r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ctyp
            if (r0 == 0) goto L13
            r0 = r12
            ctyp r0 = (defpackage.ctyp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctyp r0 = new ctyp
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "queryPersonal"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "BugleContacts"
            r6 = 1
            java.lang.String r7 = "ContactSuggestionsAdapterImpl.kt"
            if (r2 == 0) goto L41
            if (r2 != r6) goto L39
            dzub r10 = r0.f
            java.util.regex.Pattern r11 = r0.e
            java.lang.String r0 = r0.d
            defpackage.fctl.b(r12)
            r8 = r12
            r12 = r10
            r10 = r0
            r0 = r8
            goto L97
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            defpackage.fctl.b(r12)
            int r12 = r10.length()
            if (r12 != 0) goto L51
            cuaz r10 = new cuaz
            r11 = 0
            r10.<init>(r11)
            return r10
        L51:
            ekrg r12 = defpackage.ctzg.a
            ekrw r12 = r12.e()
            ekrz r2 = defpackage.eksq.a
            r12.X(r2, r5)
            ekrd r12 = (defpackage.ekrd) r12
            ekrz r2 = defpackage.cqnc.I
            r12.X(r2, r10)
            r2 = 225(0xe1, float:3.15E-43)
            ekrw r12 = r12.h(r4, r3, r2, r7)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r2 = "searching personal contacts"
            r12.q(r2)
            fcsu r12 = r9.d
            java.lang.Object r12 = r12.b()
            dzuc r12 = (defpackage.dzuc) r12
            dzub r12 = r12.d()
            ajoy r2 = r9.o
            ajoz r2 = r2.b()
            eiju r2 = r2.b(r10)
            r2.getClass()
            r0.d = r10
            r0.e = r11
            r0.f = r12
            r0.c = r6
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto Lc0
        L97:
            ekgb r0 = (defpackage.ekgb) r0
            ekrg r1 = defpackage.ctzg.a
            ekrw r1 = r1.e()
            ekrz r2 = defpackage.eksq.a
            r1.X(r2, r5)
            ekrd r1 = (defpackage.ekrd) r1
            ekrz r2 = defpackage.cqnc.I
            r1.X(r2, r10)
            r2 = 229(0xe5, float:3.21E-43)
            ekrw r1 = r1.h(r4, r3, r2, r7)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "finished searching personal contacts"
            r1.q(r2)
            cuaz r1 = new cuaz
            r0.getClass()
            r1.<init>(r10, r0, r11, r12)
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctzg.d(java.lang.String, java.util.regex.Pattern, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, java.util.regex.Pattern r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ctyq
            if (r0 == 0) goto L13
            r0 = r11
            ctyq r0 = (defpackage.ctyq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctyq r0 = new ctyq
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "queryWork"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "BugleContacts"
            r6 = 1
            java.lang.String r7 = "ContactSuggestionsAdapterImpl.kt"
            if (r2 == 0) goto L3b
            if (r2 != r6) goto L33
            java.util.regex.Pattern r10 = r0.e
            java.lang.String r9 = r0.d
            defpackage.fctl.b(r11)
            goto L84
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.fctl.b(r11)
            int r11 = r9.length()
            if (r11 != 0) goto L4b
            ctxy r9 = new ctxy
            r10 = 0
            r9.<init>(r10)
            return r9
        L4b:
            ekrg r11 = defpackage.ctzg.a
            ekrw r11 = r11.e()
            ekrz r2 = defpackage.eksq.a
            r11.X(r2, r5)
            ekrd r11 = (defpackage.ekrd) r11
            ekrz r2 = defpackage.cqnc.I
            r11.X(r2, r9)
            r2 = 237(0xed, float:3.32E-43)
            ekrw r11 = r11.h(r4, r3, r2, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "searching work contacts"
            r11.q(r2)
            ajoy r11 = r8.o
            ajoz r11 = r11.b()
            eiju r11 = r11.c(r9)
            r11.getClass()
            r0.d = r9
            r0.e = r10
            r0.c = r6
            java.lang.Object r11 = defpackage.fdxs.c(r11, r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            ekgb r11 = (defpackage.ekgb) r11
            ekrg r0 = defpackage.ctzg.a
            ekrw r0 = r0.e()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.cqnc.I
            r0.X(r1, r9)
            r1 = 240(0xf0, float:3.36E-43)
            ekrw r0 = r0.h(r4, r3, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "finished searching work contacts"
            r0.q(r1)
            ctxy r0 = new ctxy
            r11.getClass()
            r0.<init>(r9, r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctzg.e(java.lang.String, java.util.regex.Pattern, fcxy):java.lang.Object");
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
        while (true) {
            int i4 = 2;
            if (!matcher.find(i3)) {
                break;
            }
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (true == this.k.a()) {
                i4 = 1;
            }
            arrayList.add(new djwf(i4, i, iStart + i2, iEnd + i2));
            i3 = iEnd;
        }
        if (i == 2) {
            arrayList.add(new djwf(3, 2, i2, str.length() + i2));
        }
        return arrayList;
    }

    public final cuaq g(final ajpq ajpqVar, final String str, final cudx cudxVar, final Pattern pattern, final int i) {
        return new cuaq(str, new fdae() { // from class: ctyj
            @Override // defpackage.fdae
            public final Object invoke() {
                djyu djysVar;
                ctzg ctzgVar = this;
                Pattern pattern2 = pattern;
                ajpq ajpqVar2 = ajpqVar;
                cudx cudxVar2 = cudxVar;
                ardr ardrVar = ctzgVar.k;
                String strC = ajpqVar2.c();
                if (ardrVar.a()) {
                    int i2 = i;
                    dkri dkriVarD = uds.d((uds) ctzgVar.g.b(), ajpqVar2);
                    String strE = ajpqVar2.e();
                    String str2 = ajpqVar2.d() + " · " + ajpqVar2.c();
                    boolean zB = cudxVar2.b(ajpqVar2.b());
                    List listAh = fcva.ah(ctzgVar.f(pattern2, ajpqVar2.e(), 1, 0), ctzgVar.f(pattern2, ajpqVar2.d(), 2, 0));
                    int i3 = i2 - 1;
                    djysVar = new djym(dkriVarD, strE, str2, i2 == 2 ? ctzgVar.b.getString(R.string.contact_list_item_rich_tertiary_text) : null, zB, listAh, i3 != 0 ? i3 != 1 ? djyi.a : djyi.b : djyi.c, ((cuar) ctzgVar.f.b()).c(ajpqVar2, cudxVar2), new djyo(ctzgVar.i.a()), 16);
                } else {
                    String strConcat = strC.concat(" ");
                    djysVar = cudxVar2.d.e() ? new djys(uds.d((uds) ctzgVar.g.b(), ajpqVar2), ajpqVar2.e(), strConcat.concat(ajpqVar2.d()), cudxVar2.b(ajpqVar2.b()), fcva.ah(ctzgVar.f(pattern2, ajpqVar2.e(), 1, 0), ctzgVar.f(pattern2, ajpqVar2.d(), 2, strConcat.length())), ((cuar) ctzgVar.f.b()).c(ajpqVar2, cudxVar2), new djyo(ctzgVar.i.a())) : new djyl(uds.d((uds) ctzgVar.g.b(), ajpqVar2), ajpqVar2.e(), strConcat.concat(ajpqVar2.d()), fcva.ah(ctzgVar.f(pattern2, ajpqVar2.e(), 1, 0), ctzgVar.f(pattern2, ajpqVar2.d(), 2, strConcat.length())), ((cuar) ctzgVar.f.b()).c(ajpqVar2, cudxVar2), new djyo(ctzgVar.i.a()), 8);
                }
                return new ctzh(str, djysVar);
            }
        });
    }
}
