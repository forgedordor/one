package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avmg implements avlm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncImpl");
    public final fcyh b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;

    public avmg(fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        fcyhVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar9.getClass();
        this.b = fcyhVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.f = fcsuVar4;
        this.e = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fcsuVar9;
    }

    private final void j(Collection collection) {
        try {
            avkv avkvVar = (avkv) avkw.a.createBuilder();
            ArrayList arrayList = new ArrayList(fcva.p(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(avdq.a((avdp) it.next()));
            }
            avkvVar.a(arrayList);
            avkvVar.copyOnWrite();
            avkw avkwVar = (avkw) avkvVar.instance;
            avkwVar.f = avko.a(4);
            avkwVar.b = 4 | avkwVar.b;
            evsn evsnVarBuild = avkvVar.build();
            evsnVarBuild.getClass();
            ((avkx) this.g.b()).a((avkw) evsnVarBuild);
        } catch (Throwable th) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleWorkContactsSync");
            ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncImpl", "queueChangedContactsForRecipientSync", 193, "WorkProfileContactsSyncImpl.kt")).q("Failed to queue changes.");
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avlm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.avlw
            if (r0 == 0) goto L13
            r0 = r8
            avlw r0 = (defpackage.avlw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avlw r0 = new avlw
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r0 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r8 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.fctl.b(r8)
            fcyh r8 = r0.u()
            boolean r8 = defpackage.eicg.b(r8)
            if (r8 == 0) goto L6a
            java.lang.String r8 = "WorkProfileContactsSyncImpl#syncFull"
            eieu r8 = defpackage.eiiy.h(r8)
            dzfh r2 = defpackage.avbv.u     // Catch: java.lang.Throwable -> L60
            avly r5 = new avly     // Catch: java.lang.Throwable -> L60
            r5.<init>(r7, r3)     // Catch: java.lang.Throwable -> L60
            r0.d = r8     // Catch: java.lang.Throwable -> L60
            r0.c = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r7.e(r2, r5, r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == r1) goto L5f
            r0 = r8
        L59:
            defpackage.fczl.a(r0, r3)
            fctx r8 = defpackage.fctx.a
            return r8
        L5f:
            return r1
        L60:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r1 = move-exception
            defpackage.fczl.a(r0, r8)
            throw r1
        L6a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmg.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avlm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.avlz
            if (r0 == 0) goto L13
            r0 = r8
            avlz r0 = (defpackage.avlz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avlz r0 = new avlz
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r0 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r8 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.fctl.b(r8)
            fcyh r8 = r0.u()
            boolean r8 = defpackage.eicg.b(r8)
            if (r8 == 0) goto L6a
            java.lang.String r8 = "WorkProfileContactsSyncImpl#syncIncremental"
            eieu r8 = defpackage.eiiy.h(r8)
            dzfh r2 = defpackage.avbv.v     // Catch: java.lang.Throwable -> L60
            avmb r5 = new avmb     // Catch: java.lang.Throwable -> L60
            r5.<init>(r7, r3)     // Catch: java.lang.Throwable -> L60
            r0.d = r8     // Catch: java.lang.Throwable -> L60
            r0.c = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r7.e(r2, r5, r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == r1) goto L5f
            r0 = r8
        L59:
            defpackage.fczl.a(r0, r3)
            fctx r8 = defpackage.fctx.a
            return r8
        L5f:
            return r1
        L60:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r1 = move-exception
            defpackage.fczl.a(r0, r8)
            throw r1
        L6a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmg.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avlm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.avmc
            if (r0 == 0) goto L13
            r0 = r8
            avmc r0 = (defpackage.avmc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avmc r0 = new avmc
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r0 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r8 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.fctl.b(r8)
            fcyh r8 = r0.u()
            boolean r8 = defpackage.eicg.b(r8)
            if (r8 == 0) goto L6a
            java.lang.String r8 = "WorkProfileContactsSyncImpl#syncDeleted"
            eieu r8 = defpackage.eiiy.h(r8)
            dzfh r2 = defpackage.avbv.w     // Catch: java.lang.Throwable -> L60
            avmf r5 = new avmf     // Catch: java.lang.Throwable -> L60
            r5.<init>(r7, r3)     // Catch: java.lang.Throwable -> L60
            r0.d = r8     // Catch: java.lang.Throwable -> L60
            r0.c = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r7.e(r2, r5, r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == r1) goto L5f
            r0 = r8
        L59:
            defpackage.fczl.a(r0, r3)
            fctx r8 = defpackage.fctx.a
            return r8
        L5f:
            return r1
        L60:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r1 = move-exception
            defpackage.fczl.a(r0, r8)
            throw r1
        L6a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmg.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Set r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avlt
            if (r0 == 0) goto L13
            r0 = r7
            avlt r0 = (defpackage.avlt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avlt r0 = new avlt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L77
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.f     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L77
            avdr r7 = (defpackage.avdr) r7     // Catch: java.lang.Throwable -> L77
            java.util.List r2 = defpackage.fcva.ao(r6)     // Catch: java.lang.Throwable -> L77
            r0.a = r6     // Catch: java.lang.Throwable -> L77
            r0.d = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.o(r2, r0)     // Catch: java.lang.Throwable -> L77
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L77
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L77
            r0.<init>()     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L77
        L56:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L77
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L77
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L77
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L77
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L77
            boolean r2 = r7.contains(r4)     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L56
            r0.add(r1)     // Catch: java.lang.Throwable -> L77
            goto L56
        L76:
            return r0
        L77:
            r6 = move-exception
            ekrg r7 = defpackage.avmg.a
            ekrw r7 = r7.i()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleWorkContactsSync"
            r7.X(r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            ekrw r7 = r7.g(r6)
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r1 = "WorkProfileContactsSyncImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncImpl"
            java.lang.String r3 = "filterDeletedContacts"
            ekrw r7 = r7.h(r2, r3, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "Failed to query for contact deletion"
            r7.q(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmg.d(java.util.Set, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dzfh r7, defpackage.fdap r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.avlu
            if (r0 == 0) goto L13
            r0 = r9
            avlu r0 = (defpackage.avlu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avlu r0 = new avlu
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            dzua r7 = r0.f
            dzub r8 = r0.e
            dzfh r0 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L30
            r2 = r7
            r7 = r0
            goto L5c
        L30:
            r9 = move-exception
            r2 = r7
            r7 = r0
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            defpackage.fctl.b(r9)
            fcsu r9 = r6.i
            java.lang.Object r9 = r9.b()
            dzuc r9 = (defpackage.dzuc) r9
            dzub r9 = r9.d()
            dzua r2 = defpackage.dzua.SUCCESS
            r0.d = r7     // Catch: java.lang.Throwable -> L6b
            r0.e = r9     // Catch: java.lang.Throwable -> L6b
            r0.f = r2     // Catch: java.lang.Throwable -> L6b
            r0.c = r4     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6b
            if (r8 == r1) goto L6a
            r8 = r9
        L5c:
            fcsu r9 = r6.i
            java.lang.Object r9 = r9.b()
            dzuc r9 = (defpackage.dzuc) r9
            r9.f(r8, r7, r3, r2)
            fctx r7 = defpackage.fctx.a
            return r7
        L6a:
            return r1
        L6b:
            r8 = move-exception
            r5 = r9
            r9 = r8
            r8 = r5
        L6f:
            dzua r2 = defpackage.dzua.ERROR     // Catch: java.lang.Throwable -> L72
            throw r9     // Catch: java.lang.Throwable -> L72
        L72:
            r9 = move-exception
            fcsu r0 = r6.i
            java.lang.Object r0 = r0.b()
            dzuc r0 = (defpackage.dzuc) r0
            r0.f(r8, r7, r3, r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmg.e(dzfh, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(j$.time.Instant r10, defpackage.fcxy r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmg.f(j$.time.Instant, fcxy):java.lang.Object");
    }

    public final Object g(final Instant instant, final boolean z, fcxy fcxyVar) {
        Object objD = ((cmfo) this.d.b()).d(new fdap() { // from class: avls
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                avde avdeVar = (avde) obj;
                avdeVar.getClass();
                avda avdaVar = (avda) avdeVar.toBuilder();
                Instant instant2 = instant;
                evvp evvpVarB = evxd.b(instant2);
                avdaVar.copyOnWrite();
                avde avdeVar2 = (avde) avdaVar.instance;
                avdeVar2.h = evvpVarB;
                avdeVar2.b |= 16;
                if (z) {
                    evvp evvpVarB2 = evxd.b(instant2);
                    avdaVar.copyOnWrite();
                    avde avdeVar3 = (avde) avdaVar.instance;
                    avdeVar3.i = evvpVarB2;
                    avdeVar3.b |= 32;
                }
                evsn evsnVarBuild = avdaVar.build();
                evsnVarBuild.getClass();
                return (avde) evsnVarBuild;
            }
        }, fcxyVar);
        return objD == fcyl.a ? objD : fctx.a;
    }

    public final void h(String str, int i) {
        ((ains) this.j.b()).e(str, i);
    }

    public final void i(Collection collection) {
        try {
            Instant instantF = ((cogw) this.c.b()).f();
            avla avlaVar = (avla) avlb.a.createBuilder();
            ArrayList arrayList = new ArrayList(fcva.p(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                instantF.getClass();
                arrayList.add(avcz.a(new avcy(jLongValue, instantF)));
            }
            avlaVar.a(arrayList);
            avlaVar.copyOnWrite();
            avlb avlbVar = (avlb) avlaVar.instance;
            avlbVar.e = avll.a(4);
            avlbVar.b |= 1;
            evsn evsnVarBuild = avlaVar.build();
            evsnVarBuild.getClass();
            ((avlc) this.h.b()).a((avlb) evsnVarBuild);
        } catch (Throwable th) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleWorkContactsSync");
            ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/shared/contacts/sync/workprofile/WorkProfileContactsSyncImpl", "queueDeletedContactsForRecipientSync", 210, "WorkProfileContactsSyncImpl.kt")).q("Failed to queue deletions.");
            throw th;
        }
    }
}
