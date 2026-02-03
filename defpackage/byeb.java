package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byeb implements bycz, bycx, bydc, bycw, bycv, bycy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter");
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final cogw f;
    public final fcsu g;
    public final axjf h;
    public final bbfn i;
    public final dqsn j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final eosc n;
    private final fcsu o;
    private final cmuq p;
    private final ains q;
    private final bxlc r;
    private final bveg s;
    private final Optional t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;

    public byeb(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cmuq cmuqVar, cogw cogwVar, ains ainsVar, fcsu fcsuVar5, bxlc bxlcVar, axjf axjfVar, bbfn bbfnVar, dqsn dqsnVar, bveg bvegVar, Optional optional, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, eosc eoscVar) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.o = fcsuVar4;
        this.p = cmuqVar;
        this.f = cogwVar;
        this.q = ainsVar;
        this.g = fcsuVar5;
        this.r = bxlcVar;
        this.h = axjfVar;
        this.i = bbfnVar;
        this.j = dqsnVar;
        this.s = bvegVar;
        this.t = optional;
        this.u = fcsuVar6;
        this.k = fcsuVar7;
        this.l = fcsuVar8;
        this.m = fcsuVar9;
        this.n = eoscVar;
        this.v = fcsuVar10;
        this.w = fcsuVar11;
    }

    private final MessageCoreData r(final Optional optional, final ConversationIdType conversationIdType, final axcy axcyVar, final ParticipantsTable.BindData bindData, final List list, final int i, final long j, final long j2) {
        cqaz.h();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.s, conversationIdType);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertTombstoneWithSelfIdentityId", 289, "TombstoneInserter.java")).r("Inserting tombstone with type: %d", i);
        return (MessageCoreData) this.j.c("TombstoneInserter#insertTombstone", new ejxr() { // from class: bydh
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.m(optional, conversationIdType, axcyVar, bindData, list, i, j, j2, null);
            }
        });
    }

    private final void s(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, String str) {
        ekgb ekgbVarR;
        axcy axcyVarD = ((bbdl) this.g.b()).d();
        long jG = ((bakt) this.d.b()).g(conversationIdType);
        Optional optionalEmpty = Optional.empty();
        ParticipantsTable.BindData bindDataA = bindData != null ? bindData : axcyVarD.a();
        if (bindData != null) {
            ekgbVarR = ekgb.r(bindData);
        } else {
            int i = ekgb.d;
            ekgbVarR = ekoe.a;
        }
        l(optionalEmpty, conversationIdType, axcyVarD, bindDataA, ekgbVarR, 245, this.f.f().toEpochMilli(), jG, str);
    }

    @Override // defpackage.bycv
    public final eiju a(final ConversationIdType conversationIdType, final SelfIdentityId selfIdentityId) {
        return eijx.g(new Callable() { // from class: bydg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final byeb byebVar = this.a;
                final ConversationIdType conversationIdType2 = conversationIdType;
                final SelfIdentityId selfIdentityId2 = selfIdentityId;
                return (Boolean) byebVar.j.c("TombstoneInserter#insertActiveSelfIdentityChangedTombstone", new ejxr() { // from class: bydi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return Boolean.valueOf(byebVar.b(conversationIdType2, selfIdentityId2));
                    }
                });
            }
        }, this.n);
    }

    @Override // defpackage.bycv
    public final boolean b(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        MessageCoreData messageCoreDataP = ((baxe) this.e.b()).p(conversationIdType);
        if (messageCoreDataP != null && messageCoreDataP.k() == 259) {
            int iA = ((cdww) this.l.b()).a(messageCoreDataP.C());
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertActiveSelfIdentityChangedTombstoneSyncrhonously", 1464, "TombstoneInserter.java")).r("Deleted %s active self identity tombstones", iA);
        }
        axcy axcyVarE = ((bbdl) this.g.b()).e(selfIdentityId);
        if (axcyVarE == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertActiveSelfIdentityChangedTombstoneSyncrhonously", 1488, "TombstoneInserter.java")).t("Skipped inserting self identity changed tombstone, no subscription for %s", selfIdentityId);
            return false;
        }
        Optional optionalOf = Optional.of(selfIdentityId);
        ParticipantsTable.BindData bindDataA = axcyVarE.a();
        int i = ekgb.d;
        MessageCoreData messageCoreDataR = r(optionalOf, conversationIdType, axcyVarE, bindDataA, ekoe.a, 259, this.f.f().toEpochMilli(), ((bakt) this.d.b()).g(conversationIdType));
        if (messageCoreDataR != null) {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertActiveSelfIdentityChangedTombstoneSyncrhonously", 1481, "TombstoneInserter.java")).t("Inserted active self identity tombstone %s", messageCoreDataR.C());
            return true;
        }
        ekrw ekrwVarJ2 = a.j();
        ekrwVarJ2.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertActiveSelfIdentityChangedTombstoneSyncrhonously", 1485, "TombstoneInserter.java")).q("Failed to insert active self identity tombstone");
        return false;
    }

    @Override // defpackage.bycw
    public final void c(final ConversationIdType conversationIdType, crwi crwiVar, boolean z) {
        int i;
        final axcy axcyVarD = ((bbdl) this.g.b()).d();
        final long jG = ((bakt) this.d.b()).g(conversationIdType);
        switch (crwiVar.ordinal()) {
            case 1:
                if (true == z) {
                    i = 256;
                    break;
                } else {
                    i = 270;
                    break;
                }
            case 2:
                i = 258;
                break;
            case 3:
                if (true == z) {
                    i = 255;
                    break;
                } else {
                    i = 269;
                    break;
                }
            case 4:
                i = 257;
                break;
            case 5:
                i = 262;
                break;
            case 6:
                i = 263;
                break;
            default:
                i = 0;
                break;
        }
        final int i2 = i;
        if (i2 == 0) {
            return;
        }
        final Optional optionalEmpty = Optional.empty();
        final ParticipantsTable.BindData bindDataA = axcyVarD.a();
        final long epochMilli = this.f.f().toEpochMilli();
        ecem.b();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.s, conversationIdType);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertOrUpdateSubscriptionTombstoneInternal", 330, "TombstoneInserter.java")).r("Inserting tombstone with type: %d", i2);
    }

    @Override // defpackage.bycx
    public final void d(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, String str) {
        s(conversationIdType, bindData, str);
    }

    @Override // defpackage.bycx
    public final void e(ConversationIdType conversationIdType, String str) {
        s(conversationIdType, null, str);
    }

    @Override // defpackage.bycy
    public final void f(ConversationIdType conversationIdType, boolean z, ekgb ekgbVar, Instant instant, aoer aoerVar) {
        int i = i(true, conversationIdType, z, Collection.EL.stream(ekgbVar).anyMatch(new Predicate() { // from class: bydl
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
                ekrg ekrgVar = byeb.a;
                return ((ResolvedRecipient) obj).g().z();
            }
        }), ekgbVar.size(), aoerVar != null ? aoerVar.b() : -1);
        ejwl.l(i != 0);
        p(Optional.ofNullable(aoerVar), conversationIdType, (List) Collection.EL.stream(ekgbVar).map(new Function() { // from class: bydm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = byeb.a;
                return ((anug) ((ResolvedRecipient) obj)).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a), i, instant.toEpochMilli());
    }

    @Override // defpackage.bycz
    public final void g(final ConversationIdType conversationIdType, final String str) {
        final axcy axcyVarD = ((bbdl) this.g.b()).d();
        this.j.d("TombstoneInserter#insertLocalGroupRenameTombstone", new Runnable() { // from class: byde
            @Override // java.lang.Runnable
            public final void run() {
                axcy axcyVar = axcyVarD;
                Optional optionalEmpty = Optional.empty();
                ParticipantsTable.BindData bindDataA = axcyVar.a();
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                byeb byebVar = this.a;
                byebVar.l(optionalEmpty, conversationIdType, axcyVar, bindDataA, ekgbVar, 211, byebVar.f.f().toEpochMilli(), -1L, str);
            }
        });
    }

    @Override // defpackage.bydc
    public final eiju h(final ConversationIdType conversationIdType, final SelfIdentityId selfIdentityId, final Optional optional) {
        return eijx.g(new Callable() { // from class: bydz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final byeb byebVar = this.a;
                final ConversationIdType conversationIdType2 = conversationIdType;
                final SelfIdentityId selfIdentityId2 = selfIdentityId;
                final Optional optional2 = optional;
                byebVar.j.d("TombstoneInserter#onRbmSimChange", new Runnable() { // from class: bydj
                    @Override // java.lang.Runnable
                    public final void run() {
                        byeb byebVar2 = byebVar;
                        baxe baxeVar = (baxe) byebVar2.e.b();
                        ConversationIdType conversationIdType3 = conversationIdType2;
                        MessageCoreData messageCoreDataP = baxeVar.p(conversationIdType3);
                        if (messageCoreDataP != null && messageCoreDataP.dj()) {
                            ((cdww) byebVar2.l.b()).a(messageCoreDataP.C());
                        }
                        SelfIdentityId selfIdentityId3 = selfIdentityId2;
                        fcsu fcsuVar = byebVar2.d;
                        List listK = ((bakt) fcsuVar.b()).K(conversationIdType3);
                        long jG = ((bakt) fcsuVar.b()).g(conversationIdType3);
                        axcy axcyVarC = ((bbdl) byebVar2.g.b()).c(selfIdentityId3);
                        if (axcyVarC == null) {
                            return;
                        }
                        byebVar2.l(optional2, conversationIdType3, axcyVarC, axcyVarC.a(), listK, 240, byebVar2.f.f().toEpochMilli(), jG, String.format(Locale.ENGLISH, "%d (%s) ", Integer.valueOf(axcyVarC.c()), axcyVarC.g()));
                    }
                });
                return null;
            }
        }, this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(boolean r5, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, boolean r7, boolean r8, int r9, int r10) {
        /*
            r4 = this;
            defpackage.cqaz.h()
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 205(0xcd, float:2.87E-43)
            r2 = 1
            if (r5 == 0) goto L40
            if (r7 == 0) goto L31
            if (r9 > r2) goto L2e
            fcsu r5 = r4.c
            java.lang.Object r5 = r5.b()
            axgh r5 = (defpackage.axgh) r5
            bajf r5 = r5.a(r6)
            if (r5 == 0) goto L26
            boolean r5 = r5.P()
            if (r5 != 0) goto L23
            goto L26
        L23:
            r5 = 241(0xf1, float:3.38E-43)
            return r5
        L26:
            if (r8 == 0) goto L2b
            r5 = 242(0xf2, float:3.39E-43)
            return r5
        L2b:
            r5 = 207(0xcf, float:2.9E-43)
            return r5
        L2e:
            r5 = 203(0xcb, float:2.84E-43)
            return r5
        L31:
            if (r9 <= r2) goto L3d
            cmuq r5 = r4.p
            boolean r5 = r5.d(r10)
            if (r5 == 0) goto L3c
            return r0
        L3c:
            return r1
        L3d:
            r5 = 206(0xce, float:2.89E-43)
            return r5
        L40:
            r5 = 0
            if (r7 != 0) goto Lb1
            if (r9 <= r2) goto Lb1
            cmuq r7 = r4.p
            boolean r7 = r7.d(r10)
            fcsu r8 = r4.e
            java.lang.Object r8 = r8.b()
            baxe r8 = (defpackage.baxe) r8
            java.lang.String r9 = "MessageDatabaseOperations#getLatestOutgoingOrTombstoneMessageForConversation"
            eieu r9 = defpackage.eiiy.k(r9)
            java.lang.String[] r10 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a     // Catch: java.lang.Throwable -> La7
            brec r10 = new brec     // Catch: java.lang.Throwable -> La7
            r10.<init>()     // Catch: java.lang.Throwable -> La7
            r10.m(r6)     // Catch: java.lang.Throwable -> La7
            r6 = 2
            java.util.function.Function[] r6 = new java.util.function.Function[r6]     // Catch: java.lang.Throwable -> La7
            baur r3 = new baur     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
            r6[r5] = r3     // Catch: java.lang.Throwable -> La7
            baus r3 = new baus     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
            r6[r2] = r3     // Catch: java.lang.Throwable -> La7
            r10.b(r6)     // Catch: java.lang.Throwable -> La7
            brdv r6 = new brdv     // Catch: java.lang.Throwable -> La7
            r6.<init>(r10)     // Catch: java.lang.Throwable -> La7
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6 = r8.n(r6)     // Catch: java.lang.Throwable -> La7
            r9.close()
            if (r6 != 0) goto L89
            if (r7 != 0) goto L88
            return r1
        L88:
            return r0
        L89:
            int r8 = r6.d()
            if (r8 != r2) goto L96
            if (r7 != 0) goto L94
            r7 = 209(0xd1, float:2.93E-43)
            goto L9f
        L94:
            r7 = r2
            goto L97
        L96:
            r2 = r8
        L97:
            if (r2 != 0) goto L9e
            if (r7 == 0) goto L9e
            r7 = 208(0xd0, float:2.91E-43)
            goto L9f
        L9e:
            r7 = r5
        L9f:
            int r6 = r6.k()
            if (r6 != r7) goto La6
            return r5
        La6:
            return r7
        La7:
            r5 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r6 = move-exception
            r5.addSuppressed(r6)
        Lb0:
            throw r5
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byeb.i(boolean, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean, boolean, int, int):int");
    }

    public final MessageCoreData j(Optional optional, ConversationIdType conversationIdType, final axcy axcyVar, ParticipantsTable.BindData bindData, int i, long j, String str, boolean z, boolean z2) {
        String str2 = (String) optional.map(new Function() { // from class: byea
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((SelfIdentityId) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(bindData.R());
        axcyVar.getClass();
        MessageCoreData messageCoreDataK = this.s.k(str2, (SelfIdentityId) optional.orElseGet(new Supplier() { // from class: bydf
            @Override // java.util.function.Supplier
            public final Object get() {
                return axcyVar.f();
            }
        }), conversationIdType, i, j, str);
        if (z) {
            messageCoreDataK.bB(false);
        }
        if (z2) {
            messageCoreDataK.by();
        }
        ((bauh) this.u.b()).a(messageCoreDataK);
        this.q.e("Bugle.Tombstone.Generated", i);
        return messageCoreDataK;
    }

    public final MessageCoreData k(Optional optional, ConversationIdType conversationIdType, axcy axcyVar, ParticipantsTable.BindData bindData, List list, int i, long j, long j2) {
        return r(optional.map(new bydk()), conversationIdType, axcyVar, bindData, list, i, j, j2);
    }

    public final MessageCoreData l(Optional optional, ConversationIdType conversationIdType, axcy axcyVar, ParticipantsTable.BindData bindData, List list, int i, long j, long j2, String str) {
        return m(optional.map(new bydk()), conversationIdType, axcyVar, bindData, list, i, j, j2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f8 A[PHI: r2
      0x01f8: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v19 int) binds: [B:132:0x01dc, B:134:0x01e0, B:138:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [int] */
    /* JADX WARN: Type inference failed for: r6v54 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData m(j$.util.Optional r22, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r23, defpackage.axcy r24, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r25, java.util.List r26, int r27, long r28, long r30, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byeb.m(j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, axcy, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, java.util.List, int, long, long, java.lang.String):com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData");
    }

    public final void n(axcy axcyVar, long j, ConversationIdType conversationIdType, long j2, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(axcyVar.a());
        k(Optional.empty(), conversationIdType, axcyVar, axcyVar.a(), arrayList, i, j, j2);
    }

    public final void o(ConversationIdType conversationIdType, long j, MessageCoreData messageCoreData, ParticipantsTable.BindData bindData) {
        bvdk bvdkVarS = ((bakt) this.d.b()).s(conversationIdType);
        if (bvdkVarS == null) {
            bvdkVarS = bvdk.UNARCHIVED;
        }
        bvdk bvdkVar = bvdkVarS;
        int iK = messageCoreData.k();
        if (!baui.d(iK) && iK != 234 && iK != 233 && iK != 252 && iK != 210 && iK != 208 && iK != 245) {
            baqi baqiVar = (baqi) this.o.b();
            MessageIdType messageIdTypeC = messageCoreData.C();
            Long lValueOf = Long.valueOf(messageCoreData.o());
            cqaz.h();
            baqiVar.h(conversationIdType, messageIdTypeC, lValueOf, bvdkVar, null, true, j, null, null);
        }
        this.i.b(conversationIdType, bindData, messageCoreData);
    }

    public final void p(Optional optional, ConversationIdType conversationIdType, List list, int i, long j) {
        axcy axcyVarD = ((bbdl) this.g.b()).d();
        k(optional, conversationIdType, axcyVarD, axcyVarD.a(), list, i, j, -1L);
    }

    public final void q() {
        this.t.ifPresent(new Consumer() { // from class: bydn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekrg ekrgVar = byeb.a;
                ((byec) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
