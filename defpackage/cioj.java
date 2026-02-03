package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cioj {
    public final dqsn a;
    public final fcyh b;
    public final fdjx c;
    public final fcsu d;
    public final cogw e;
    public final area f;

    public cioj(dqsn dqsnVar, fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar, cogw cogwVar, area areaVar) {
        dqsnVar.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        cogwVar.getClass();
        areaVar.getClass();
        this.a = dqsnVar;
        this.b = fcyhVar;
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.e = cogwVar;
        this.f = areaVar;
    }

    public static final Integer c(final ConversationIdType conversationIdType) {
        botb botbVarE = botm.e();
        botbVarE.A("MmsGroupUpgradeDatabaseOperations#getMmsGroupUpgradeRetriesBlocking");
        botbVarE.g(new Function() { // from class: cint
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bopp) obj).at;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.i(new Function() { // from class: cinu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.r(conversationIdType);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.y(1);
        ekgb ekgbVarZ = botbVarE.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((bojh) it.next()).o()));
        }
        return (Integer) fcva.Y(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cioa
            if (r0 == 0) goto L13
            r0 = r7
            cioa r0 = (defpackage.cioa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cioa r0 = new cioa
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.b
            fcyh r7 = defpackage.eicg.a(r7)
            cinz r2 = new cinz
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cioj.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r17, java.lang.String r18, java.lang.String r19, defpackage.cigb r20, java.lang.String r21, java.lang.String r22, defpackage.alqm r23, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r24, java.util.List r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            r16 = this;
            r2 = r16
            r0 = r26
            boolean r1 = r0 instanceof defpackage.cioe
            if (r1 == 0) goto L17
            r1 = r0
            cioe r1 = (defpackage.cioe) r1
            int r3 = r1.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r1.c = r3
            goto L1c
        L17:
            cioe r1 = new cioe
            r1.<init>(r2, r0)
        L1c:
            r12 = r1
            java.lang.Object r0 = r12.a
            fcyl r13 = defpackage.fcyl.a
            int r1 = r12.c
            r14 = 1
            if (r1 == 0) goto L34
            if (r1 != r14) goto L2c
            defpackage.fctl.b(r0)
            goto L5e
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            defpackage.fctl.b(r0)
            fcyh r0 = r2.b
            fcyh r15 = defpackage.eicg.a(r0)
            ciod r0 = new ciod
            r1 = 0
            r8 = r17
            r3 = r18
            r4 = r19
            r6 = r20
            r9 = r21
            r11 = r22
            r7 = r23
            r5 = r24
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.c = r14
            java.lang.Object r0 = defpackage.fdin.a(r15, r0, r12)
            if (r0 != r13) goto L5e
            return r13
        L5e:
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cioj.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, java.lang.String, cigb, java.lang.String, java.lang.String, alqm, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.util.List, fcxy):java.lang.Object");
    }
}
