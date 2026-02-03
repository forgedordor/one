package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aocw implements aofc {
    public final fdjx a;
    public final aoeq b;
    public final fcsu c;
    public final fcsu d;
    public final bsbm e;
    private final eosc f;
    private final fdjx g;
    private final aocg h;
    private final fcsu i;
    private final fcsu j;
    private final Optional k;
    private final bsbt l;
    private final anpj m;
    private final anpj n;
    private final bsbm o;
    private final fctc p;
    private final anpj q;
    private final aofp r;

    public aocw(eosc eoscVar, fdjx fdjxVar, fdjx fdjxVar2, aoeq aoeqVar, anph anphVar, aocg aocgVar, fcsu fcsuVar, fcsu fcsuVar2, Optional optional, fcsu fcsuVar3, aofp aofpVar, fcsu fcsuVar4) {
        eoscVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        anphVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        optional.getClass();
        fcsuVar3.getClass();
        aofpVar.getClass();
        fcsuVar4.getClass();
        this.f = eoscVar;
        this.a = fdjxVar;
        this.g = fdjxVar2;
        this.b = aoeqVar;
        this.h = aocgVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = optional;
        this.c = fcsuVar3;
        this.r = aofpVar;
        this.d = fcsuVar4;
        String[] strArr = ParticipantsTable.a;
        bsbx bsbxVar = new bsbx();
        bsbxVar.w(-2);
        bsbt bsbtVar = new bsbt(bsbxVar);
        this.l = bsbtVar;
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("selfParticipantsQuery");
        bsboVarE.s();
        bsboVarE.k(bsbtVar);
        brzh brzhVar = ParticipantsTable.c;
        bsboVarE.d(new bsbl(brzhVar.m, true), new bsbl(brzhVar.g, true));
        this.e = bsboVarE.b();
        anpg anpgVarA = anphVar.a(((antp) fcsuVar.b()).a(new fdat() { // from class: aocn
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((Set) obj).getClass();
                return bool;
            }
        }, new aocq(this)));
        anpgVarA.getClass();
        this.m = anpgVarA;
        anpg anpgVarA2 = anphVar.a(((antp) fcsuVar2.b()).a(new fdat() { // from class: aock
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((Set) obj).getClass();
                return bool;
            }
        }, new aocp(this)));
        anpgVarA2.getClass();
        this.n = anpgVarA2;
        bsbo bsboVarE2 = ParticipantsTable.e();
        bsboVarE2.A("selfParticipantsQueryWithProfiles");
        bsboVarE2.s();
        bsboVarE2.k(bsbtVar);
        bsboVarE2.d(new bsbl(brzhVar.m, true), new bsbl(brzhVar.g, true));
        dqtr dqtrVarI = dqts.i(ProfilesTable.a().b(), ProfilesTable.c.b, brzhVar.a);
        ((dqos) dqtrVarI).e = "profiles_table_join_tag";
        bsboVarE2.H(dqtrVarI.g());
        bsboVarE2.w(brzhVar.a);
        this.o = bsboVarE2.b();
        this.p = fctd.a(new fdae() { // from class: aoch
            @Override // defpackage.fdae
            public final Object invoke() {
                return ((aojw) this.a.d.b()).a();
            }
        });
        anpg anpgVarA3 = anphVar.a(new anpl(anpgVarA, new ejvr() { // from class: aoci
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aoeq aoeqVar2 = this.a.b;
                axfu axfuVar = aoeqVar2.b;
                axfuVar.n((ekgb) obj);
                ekfw ekfwVar = new ekfw();
                ekgb ekgbVarI = axfuVar.i();
                int i = ((ekoe) ekgbVarI).c;
                axcy axcyVar = null;
                for (int i2 = 0; i2 < i; i2++) {
                    axcy axcyVar2 = (axcy) ekgbVarI.get(i2);
                    if (axcyVar2.e() == -1) {
                        axcyVar = axcyVar2;
                    } else {
                        ekfwVar.h(aoeqVar2.a(axcyVar2));
                    }
                }
                ekgb ekgbVarG = ekfwVar.g();
                cqce cqceVar = aoeq.a;
                cqbd cqbdVarA = cqceVar.a();
                cqbdVarA.L("ActiveSubscriptions", ekgbVarG);
                cqbdVarA.B("defaultActiveSelfSub exists", axcyVar != null);
                cqbdVarA.r();
                if (ekgbVarG.isEmpty() && axcyVar != null) {
                    cqbd cqbdVarE = cqceVar.e();
                    cqbdVarE.I("Found the active dummy sub with subId = -1, but didn't find the actual default sms sub.");
                    cqbdVarE.r();
                    return ekgb.r(aoeqVar2.a(axcyVar));
                }
                cqbd cqbdVarA2 = cqceVar.a();
                cqbdVarA2.I("SelfIdentitiesTracker getActiveSelfIdentities:");
                cqbdVarA2.A("selfIdentityList", ekgbVarG);
                cqbdVarA2.r();
                return ekgbVarG;
            }
        }, eoscVar));
        anpgVarA3.getClass();
        this.q = anpgVarA3;
        anpgVarA3.a(new anpi() { // from class: aocj
            @Override // defpackage.anpi
            public final eiju a() {
                return eijx.e(null);
            }
        });
    }

    @Override // defpackage.aofc
    public final anpj a() {
        return this.q;
    }

    @Override // defpackage.aofc
    public final anpj b() {
        return this.r.a();
    }

    @Override // defpackage.aofc
    public final anpj c() {
        return (anpj) this.p.a();
    }

    @Override // defpackage.aofc
    public final anpj d() {
        return this.n;
    }

    @Override // defpackage.aofc
    public final eiju e(SelfIdentityId selfIdentityId) {
        selfIdentityId.getClass();
        eieu eieuVarH = eiiy.h("SelfIdentityRepository#getSelfIdentityById");
        try {
            eiju eijuVarC = auvw.c(this.g, fcyi.a, fdjz.a, new aoct(this, selfIdentityId, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.aofc
    public final eiju f() throws IOException {
        eieu eieuVarH = eiiy.h("SelfIdentityRepository#getSelfIdentityForCreatingNewConversationsOrPreservingLegacyBugsNoOtherReason");
        try {
            eiju eijuVarC = auvw.c(this.a, fcyi.a, fdjz.a, new aocu(this, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.aofc
    public final eiju g(SelfIdentityId selfIdentityId, alqm alqmVar) throws IOException {
        selfIdentityId.getClass();
        alqmVar.getClass();
        eieu eieuVarH = eiiy.h("SelfIdentityRepository#setMsisdn");
        try {
            eiju eijuVarC = auvw.c(this.g, fcyi.a, fdjz.a, new aocv(this, selfIdentityId, alqmVar, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.aofc
    public final eiju h(final Optional optional) {
        final fdap fdapVar = new fdap() { // from class: aocl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((aogn) obj).b(this.a, optional);
            }
        };
        Object objOrElse = this.k.map(new Function() { // from class: aocm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(eijx.e(false));
        objOrElse.getClass();
        return (eiju) objOrElse;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.aocr
            if (r0 == 0) goto L13
            r0 = r8
            aocr r0 = (defpackage.aocr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aocr r0 = new aocr
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.fctl.b(r8)
            anpj r8 = r7.q
            eiju r8 = r8.b()
            r8.getClass()
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L76
        L43:
            ekgb r8 = (defpackage.ekgb) r8
            r8.getClass()
            java.util.Iterator r0 = r8.iterator()
            r1 = 0
            r2 = 0
            r4 = r1
        L4f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r0.next()
            r6 = r5
            aoer r6 = (defpackage.aoer) r6
            boolean r6 = r6.x()
            if (r6 == 0) goto L4f
            if (r2 == 0) goto L65
            goto L6c
        L65:
            r2 = r3
            r4 = r5
            goto L4f
        L68:
            if (r2 != 0) goto L6b
            goto L6c
        L6b:
            r1 = r4
        L6c:
            aoer r1 = (defpackage.aoer) r1
            if (r1 == 0) goto L71
            return r1
        L71:
            java.lang.Object r8 = defpackage.fcva.P(r8)
            return r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aocw.i(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r12 != r2) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x0032, B:39:0x00c3, B:41:0x00d0, B:26:0x0079, B:28:0x0080, B:30:0x008c, B:32:0x0096, B:34:0x009c, B:36:0x00a4, B:40:0x00cb, B:42:0x00dd, B:18:0x0041, B:25:0x0064, B:23:0x0051), top: B:50:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x0032, B:39:0x00c3, B:41:0x00d0, B:26:0x0079, B:28:0x0080, B:30:0x008c, B:32:0x0096, B:34:0x009c, B:36:0x00a4, B:40:0x00cb, B:42:0x00dd, B:18:0x0041, B:25:0x0064, B:23:0x0051), top: B:50:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bf -> B:39:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aocw.j(fcxy):java.lang.Object");
    }
}
