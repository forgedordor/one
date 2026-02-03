package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoan implements anzv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactDataServiceImpl");
    private static final dzfh d = new dzfh("RecipientSyncDestinationMatchLatency");
    public final fcsu b;
    public final fcsu c;
    private final alrj e;
    private final fcsu f;
    private final fcsu g;
    private final fdjx h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;

    public aoan(alrj alrjVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14) {
        alrjVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        this.e = alrjVar;
        this.b = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fdjxVar;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = fcsuVar6;
        this.l = fcsuVar7;
        this.m = fcsuVar8;
        this.n = fcsuVar9;
        this.o = fcsuVar10;
        this.p = fcsuVar11;
        this.q = fcsuVar12;
        this.r = fcsuVar13;
        this.c = fcsuVar14;
    }

    public static final String m(avdp avdpVar) {
        String str = avdpVar.j;
        return str == null ? avdpVar.l : str;
    }

    static /* synthetic */ Object n(aoan aoanVar, ekgb ekgbVar, ekgb ekgbVar2, fcxy fcxyVar, int i) {
        if (1 == (i & 1)) {
            ekgbVar = null;
        }
        if ((i & 2) != 0) {
            ekgbVar2 = null;
        }
        return aoanVar.i(ekgbVar, ekgbVar2, fcxyVar);
    }

    public static final List o(Collection collection) {
        return fcva.al(collection, new aoai());
    }

    public static final List p(final List list, int i, final ekhx ekhxVar) {
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("updateContactInfo");
        bsbsVarF.U(new Function() { // from class: aoac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.m(list);
                bsbxVar.j(ekhxVar);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF.n(-2L);
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                bsbsVarF.C();
                bsbsVarF.m();
                bsbsVarF.S(0);
                bsbsVarF.q(-1L);
                bsbsVarF.w();
                bsbsVarF.u();
                chpq chpqVar = chpq.PROFILE_UNSPECIFIED_SOURCE;
                bsbsVarF.F(chpqVar);
                bsbsVarF.J(chpqVar);
                bsbsVarF.p();
                bsbsVarF.a.putNull("profile_photo_uri");
                bsbsVarF.o();
                bsbsVarF.y();
            } else {
                bsbsVarF.C();
                bsbsVarF.m();
                bsbsVarF.S(0);
                bsbsVarF.q(-1L);
                bsbsVarF.w();
                bsbsVarF.u();
                bsbsVarF.F(chpq.PROFILE_UNSPECIFIED_SOURCE);
                bsbsVarF.p();
                bsbsVarF.o();
                bsbsVarF.y();
            }
        }
        bsbsVarF.am();
        ekgb ekgbVarB = bsbsVarF.b().b();
        ekgbVarB.getClass();
        return ekgbVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(defpackage.brvp r9, defpackage.avdp r10, defpackage.aoad r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoan.q(brvp, avdp, aoad):void");
    }

    private final void r(brvp brvpVar) {
        if (brvpVar.I != -1 && !cqjb.e().contains(Long.valueOf(brvpVar.I))) {
            brvpVar.l(-2L);
        } else if (brvpVar.Q == chpq.PROFILE_PEOPLE_SHARING_SOURCE) {
            brvpVar.l(-2L);
            brvpVar.D(null);
            brvpVar.k(null);
            brvpVar.W(0);
            brvpVar.p(-1L);
            brvpVar.u(null);
            brvpVar.t(null);
            brvpVar.G(chpq.PROFILE_UNSPECIFIED_SOURCE);
            brvpVar.n(null);
            brvpVar.m(null);
            brvpVar.x(false);
        } else {
            brvpVar.l(-2L);
            brvpVar.D(null);
            brvpVar.k(null);
            brvpVar.W(0);
            brvpVar.p(-1L);
            brvpVar.u(null);
            brvpVar.t(null);
            chpq chpqVar = chpq.PROFILE_UNSPECIFIED_SOURCE;
            brvpVar.G(chpqVar);
            brvpVar.K(chpqVar);
            brvpVar.n(null);
            brvpVar.N(null);
            brvpVar.m(null);
            brvpVar.x(false);
        }
        if (brvpVar.t != 2) {
            ((bbax) this.b.b()).c(brvpVar);
        }
    }

    private final void s(int i, int i2) {
        ((ains) this.g.b()).f("Bugle.Recipient.Sync.Result.Count", i, i2);
    }

    @Override // defpackage.anzv
    public final eiju a(ekgb ekgbVar) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new aoak(this, ekgbVar, null));
    }

    @Override // defpackage.anzv
    public final eiju b(ekhx ekhxVar) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new aoal(this, ekhxVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.anzv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoan.c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023f  */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    @Override // defpackage.anzv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.brvp r18, int r19) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoan.d(brvp, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoan.e(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.Set r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aoaf
            if (r0 == 0) goto L13
            r0 = r6
            aoaf r0 = (defpackage.aoaf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aoaf r0 = new aoaf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            r0.c = r3
            java.lang.Object r6 = r4.h(r5, r0)
            if (r6 == r1) goto L70
        L3a:
            java.util.List r6 = (java.util.List) r6
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r1 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r1
            long r1 = r1.u()
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            java.lang.Object r1 = r5.get(r3)
            if (r1 != 0) goto L69
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.put(r3, r1)
        L69:
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
            goto L45
        L6f:
            return r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoan.f(java.util.Set, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ekgb r17, java.util.Map r18, java.util.List r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoan.g(ekgb, java.util.Map, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(final java.util.Set r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aoah
            if (r0 == 0) goto L13
            r0 = r6
            aoah r0 = (defpackage.aoah) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aoah r0 = new aoah
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            bsbo r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.e()
            java.lang.String r2 = "getRecipientsByContactIdsQuery"
            r6.A(r2)
            aoaa r2 = new aoaa
            r2.<init>()
            r6.h(r2)
            bsbm r5 = r6.b()
            eiju r5 = r5.x()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoan.h(java.util.Set, fcxy):java.lang.Object");
    }

    public final Object i(final ekgb ekgbVar, final ekgb ekgbVar2, fcxy fcxyVar) {
        final ArrayList arrayList = new ArrayList();
        ((awlc) this.j.b()).d(new Consumer() { // from class: anzz
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [ekgb, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r1v4, types: [fcvo] */
            /* JADX WARN: Type inference failed for: r5v1, types: [aoaq, java.lang.Object] */
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ?? r5 = (aoaq) obj;
                r5.getClass();
                List list = arrayList;
                ?? r1 = ekgbVar;
                if (r1 != 0) {
                    list.add(r5.b(r1));
                }
                List list2 = ekgbVar2;
                if (list2 != null) {
                    list.add(r5.c());
                }
                if ((r1 == 0 || r1.isEmpty()) && (list2 == null || list2.isEmpty())) {
                    return;
                }
                if (r1 == 0) {
                    r1 = fcvo.a;
                }
                if (list2 == null) {
                    list2 = fcvo.a;
                }
                list.add(r5.a(ekfv.a(fcva.ah(r1, list2))));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(auvw.e((eiju) it.next()));
        }
        Object objA = fdii.a(arrayList2, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.Map r7, defpackage.aoad r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.aoam
            if (r0 == 0) goto L13
            r0 = r9
            aoam r0 = (defpackage.aoam) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aoam r0 = new aoam
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L95
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r9)
            java.util.Set r7 = r7.entrySet()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L3f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4
            java.lang.Object r2 = r2.getValue()
            avdp r2 = (defpackage.avdp) r2
            brvp r5 = r4.C()
            r6.q(r5, r2, r8)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r2 = r5.a()
            r2.getClass()
            boolean r4 = defpackage.fdbq.f(r2, r4)
            if (r3 != r4) goto L6c
            r2 = 0
        L6c:
            if (r2 == 0) goto L3f
            r9.add(r2)
            goto L3f
        L72:
            ekgb r7 = defpackage.ekfv.a(r9)
            fcsu r8 = r6.l
            java.lang.Object r8 = r8.b()
            byeq r8 = (defpackage.byeq) r8
            anzy r9 = new anzy
            r9.<init>()
            java.lang.String r7 = "RecipientContactDataServiceImpl#updateRecipientsContactData"
            eiju r7 = r8.a(r7, r9)
            r7.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r7, r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoan.j(java.util.Map, aoad, fcxy):java.lang.Object");
    }

    public final void k(int i) {
        fcsu fcsuVar = this.g;
        ((ains) fcsuVar.b()).e("Bugle.Recipient.Sync.RecipientsUnmatched.Count", i);
        crny crnyVar = (crny) this.i.b();
        if (crnyVar.h(crnyVar.c()).B()) {
            ((ains) fcsuVar.b()).e("Bugle.Recipient.Sync.RecipientsUnmatchedRoaming.Count", i);
        }
    }

    public final void l(aoad aoadVar) {
        int i = aoadVar.d;
        if (i > 0) {
            s(5, i);
            if (aoadVar.d >= ((int) ((Number) this.k.b()).longValue())) {
                s(6, 1);
            }
        }
        int i2 = aoadVar.c;
        if (i2 > 0) {
            s(4, i2);
        }
        int i3 = aoadVar.a;
        if (i3 > 0) {
            s(3, i3);
        }
        int i4 = aoadVar.b;
        if (i4 > 0) {
            int i5 = ((aoadVar.c + aoadVar.a) + i4) - aoadVar.e;
            int i6 = i4 - i5;
            if (i6 > 0) {
                s(2, i6);
            }
            if (i5 > 0) {
                s(1, i5);
            }
        }
        int i7 = aoadVar.f;
        if (i7 > 0) {
            s(7, i7);
        }
        int i8 = aoadVar.g;
        if (i8 > 0) {
            s(8, i8);
        }
    }
}
