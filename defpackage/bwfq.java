package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfq implements bagx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl");
    public final eygg b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcyh i;
    public final fcsu j;
    public final fcsu k;
    public final aubq l;
    private final fcsu m;
    private final fcyh n;
    private final fcyh o;
    private final ConversationIdType p;

    public bwfq(eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcyh fcyhVar, fcyh fcyhVar2, fcyh fcyhVar3, fcsu fcsuVar8, fcsu fcsuVar9, aubq aubqVar, ConversationIdType conversationIdType) {
        eyggVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fcyhVar3.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        aubqVar.getClass();
        conversationIdType.getClass();
        this.b = eyggVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.m = fcsuVar7;
        this.n = fcyhVar;
        this.i = fcyhVar2;
        this.o = fcyhVar3;
        this.j = fcsuVar8;
        this.k = fcsuVar9;
        this.l = aubqVar;
        this.p = conversationIdType;
        String str = aubqVar.d;
        str.getClass();
        if (fdgn.H(str)) {
            throw new IllegalStateException("Self identity is blank.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bagx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ekhx r6, defpackage.elyd r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.bwfo
            if (r0 == 0) goto L13
            r0 = r8
            bwfo r0 = (defpackage.bwfo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwfo r0 = new bwfo
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L53
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L3e
            qao r6 = new qao
            r6.<init>()
            return r6
        L3e:
            fcyh r8 = r5.n
            fcyh r8 = defpackage.eicg.a(r8)
            bwfn r2 = new bwfn
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwfq.a(ekhx, elyd, fcxy):java.lang.Object");
    }

    @Override // defpackage.bagx
    public final Object b(int i, bwvi bwviVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.o), new bwfp(null, this, i, bwviVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.bagx
    public final void c(final aubq aubqVar, boolean z, final elyd elydVar) {
        aubqVar.getClass();
        elydVar.getClass();
        final bwjw bwjwVar = (bwjw) this.d.b();
        final String str = aubqVar.d;
        cqbd cqbdVarC = bwjw.a.c();
        cqbdVarC.I("Disabling Etouffee");
        cqbdVarC.M("normalizedDestination", str);
        cqbdVarC.B("forGroup", z);
        cqbdVarC.r();
        if (z) {
            String[] strArr = btmf.a;
            btmc btmcVar = new btmc();
            btmcVar.ap("setHasNoGroupEncryption");
            btmcVar.e(false);
            btmcVar.g(celq.a(str));
            btmcVar.b().e();
        } else {
            celq celqVar = bwjwVar.f;
            String[] strArr2 = btmf.a;
            btmc btmcVar2 = new btmc();
            btmcVar2.ap("setHasNoEncryption");
            btmcVar2.d(false);
            btmcVar2.e(false);
            btmcVar2.g(celq.a(str));
            btmcVar2.b().e();
            celqVar.f(str, false);
        }
        final aubq aubqVar2 = this.l;
        bwjwVar.g.c("Bugle.Etouffee.DisableEtouffeeUntilRefresh.Counts");
        eijx.h(new eooy() { // from class: bwjp
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return bwjwVar.b(aubqVar2, ekgb.r(aubqVar), ekgb.r(str), elydVar);
            }
        }, bwjwVar.b).k(auwc.a(new cqob(new Consumer() { // from class: bwjq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bwjw.a.p("Retrieved latest registration for disabled Etouffee");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: bwjr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bwjw.a.s("Failed to retrieve latest registration for disabled Etouffee", (Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), eoqg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ekhx r6, defpackage.elyd r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.bwfm
            if (r0 == 0) goto L13
            r0 = r8
            bwfm r0 = (defpackage.bwfm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwfm r0 = new bwfm
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fcyh r8 = r5.i
            fcyh r8 = defpackage.eicg.a(r8)
            bwfl r2 = new bwfl
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwfq.d(ekhx, elyd, fcxy):java.lang.Object");
    }

    public final void e(int i, bwvi bwviVar) {
        ((bvus) this.m.b()).h(this.l, this.p, i, bwviVar);
    }
}
