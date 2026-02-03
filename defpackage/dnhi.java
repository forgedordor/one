package defpackage;

import android.app.Activity;
import j$.util.Optional;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnhi implements dnhb {
    public final dngc a;
    public final eg b;
    private final Set c;
    private final dnhj d;

    public dnhi(Activity activity, Optional optional, dngc dngcVar) {
        activity.getClass();
        dngcVar.getClass();
        this.a = dngcVar;
        this.c = new LinkedHashSet();
        this.d = (dnhj) fdct.b(optional);
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        this.b = (eg) activity;
    }

    @Override // defpackage.dnhb
    public final /* synthetic */ Object a(List list, boolean z, fcxy fcxyVar) {
        return dngz.b(this, list, z, fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [dnhb, dnhi] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    @Override // defpackage.dnhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnhi.b(java.util.List, fcxy):java.lang.Object");
    }

    @Override // defpackage.dnhb
    public final /* synthetic */ boolean c(List list) {
        return dngz.c(this, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dnhb
    public final boolean d(dngy dngyVar) {
        dngyVar.getClass();
        ekgb ekgbVar = dngyVar.k;
        if ((ekgbVar instanceof Collection) && ekgbVar.isEmpty()) {
            return false;
        }
        ekqh it = ekgbVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            eg egVar = this.b;
            if (kxj.c(egVar, str) == 0) {
                ekgb ekgbVar2 = dngyVar.m;
                if ((ekgbVar2 instanceof Collection) && ekgbVar2.isEmpty()) {
                    return true;
                }
                ekqh it2 = ekgbVar2.iterator();
                while (it2.hasNext()) {
                    if (kxj.c(egVar, (String) it2.next()) != -1) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dnhb
    public final /* synthetic */ Object e(dngy dngyVar, fcxy fcxyVar) {
        return dngz.a(this, dngyVar, true, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r8, int r9, defpackage.fdat r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.dnhe
            if (r0 == 0) goto L13
            r0 = r11
            dnhe r0 = (defpackage.dnhe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnhe r0 = new dnhe
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r8 = r0.d
            defpackage.fctl.b(r11)
            goto L68
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.fctl.b(r11)
            return r11
        L38:
            defpackage.fctl.b(r11)
            if (r9 <= 0) goto L44
            java.lang.String r11 = "_"
            java.lang.String r11 = defpackage.a.f(r9, r8, r11)
            goto L45
        L44:
            r11 = r8
        L45:
            java.util.Set r2 = r7.c
            boolean r5 = r2.contains(r11)
            if (r5 == 0) goto L58
            int r9 = r9 + r4
            r0.c = r4
            java.lang.Object r8 = r7.f(r8, r9, r10, r0)
            if (r8 != r1) goto L57
            goto L6e
        L57:
            return r8
        L58:
            r2.add(r11)
            r0.d = r11
            r0.c = r3
            java.lang.Object r8 = r10.a(r11, r0)
            if (r8 == r1) goto L6e
            r6 = r11
            r11 = r8
            r8 = r6
        L68:
            java.util.Set r9 = r7.c
            r9.remove(r8)
            return r11
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnhi.f(java.lang.String, int, fdat, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dnhf
            if (r0 == 0) goto L13
            r0 = r9
            dnhf r0 = (defpackage.dnhf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnhf r0 = new dnhf
            r0.<init>(r7, r9)
        L18:
            r5 = r0
            java.lang.Object r9 = r5.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            java.lang.Object r8 = r5.a
            defpackage.fctl.b(r9)
            goto L8d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.fctl.b(r9)
            dnhj r9 = r7.d
            if (r9 == 0) goto L3c
            r9.c()
        L3c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            eg r1 = r7.b
            r3 = 2132084151(0x7f1505b7, float:1.9808464E38)
            java.lang.String r3 = r1.getString(r3)
            r9.append(r3)
            java.util.Iterator r3 = r8.iterator()
        L51:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r3.next()
            dngy r4 = (defpackage.dngy) r4
            java.lang.String r6 = "\n"
            r9.append(r6)
            int r4 = r4.l
            java.lang.String r4 = r1.getString(r4)
            r9.append(r4)
            goto L51
        L6c:
            java.lang.String r9 = r9.toString()
            r3 = 2132086125(0x7f150d6d, float:1.9812468E38)
            java.lang.String r3 = r1.getString(r3)
            r3.getClass()
            dnhc r4 = new dnhc
            r4.<init>()
            r5.a = r8
            r5.d = r2
            r6 = 12
            r2 = r9
            java.lang.Object r9 = defpackage.dphc.a(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L8d
            return r0
        L8d:
            r8 = r9
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L9e
            dnhj r8 = r7.d
            if (r8 == 0) goto La5
            r8.a()
            return r9
        L9e:
            dnhj r8 = r7.d
            if (r8 == 0) goto La5
            r8.b()
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnhi.g(java.util.List, fcxy):java.lang.Object");
    }
}
