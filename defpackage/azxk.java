package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxk implements azxa {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final dqsn e;
    private final fcyh f;
    private final fcsu g;
    private final feav h;
    private final Set i;

    public azxk(fcsu fcsuVar, fcsu fcsuVar2, dqsn dqsnVar, fcyh fcyhVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        dqsnVar.getClass();
        fcyhVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.e = dqsnVar;
        this.f = fcyhVar;
        this.d = fcsuVar3;
        this.g = fcsuVar4;
        this.h = new feaz();
        this.i = new LinkedHashSet();
    }

    @Override // defpackage.azxa
    public final Object a(fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.f), new azxh(null, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.azxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ekgb r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.azxj
            if (r0 == 0) goto L13
            r0 = r6
            azxj r0 = (defpackage.azxj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            azxj r0 = new azxj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            feaz r5 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r6)
            r6 = r5
            r5 = r0
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r6)
            feav r6 = r4.h
            r0.a = r5
            r2 = r6
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto Lca
        L49:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc5
            r0.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc5
        L52:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto L87
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> Lc5
            r2 = r1
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r2     // Catch: java.lang.Throwable -> Lc5
            fcsu r3 = r4.d     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lc5
            arjp r3 = (defpackage.arjp) r3     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r3.a()     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto L75
            java.util.Set r3 = r4.i     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> Lc5
            if (r3 != 0) goto L52
        L75:
            fcsu r3 = r4.b     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lc5
            baqi r3 = (defpackage.baqi) r3     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r3.k(r2)     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto L52
            r0.add(r1)     // Catch: java.lang.Throwable -> Lc5
            goto L52
        L87:
            fcsu r5 = r4.g     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lc5
            arjl r5 = (defpackage.arjl) r5     // Catch: java.lang.Throwable -> Lc5
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L9d
            ekgb r5 = defpackage.ekfv.a(r0)     // Catch: java.lang.Throwable -> Lc5
            r4.c(r5)     // Catch: java.lang.Throwable -> Lc5
            goto Laa
        L9d:
            dqsn r5 = r4.e     // Catch: java.lang.Throwable -> Lc5
            azxf r1 = new azxf     // Catch: java.lang.Throwable -> Lc5
            r1.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r5 = r5.b(r1)     // Catch: java.lang.Throwable -> Lc5
            fctx r5 = (defpackage.fctx) r5     // Catch: java.lang.Throwable -> Lc5
        Laa:
            fcsu r5 = r4.d     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lc5
            arjp r5 = (defpackage.arjp) r5     // Catch: java.lang.Throwable -> Lc5
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto Lbd
            java.util.Set r5 = r4.i     // Catch: java.lang.Throwable -> Lc5
            r5.addAll(r0)     // Catch: java.lang.Throwable -> Lc5
        Lbd:
            ekgb r5 = defpackage.ekfv.a(r0)     // Catch: java.lang.Throwable -> Lc5
            r6.d()
            return r5
        Lc5:
            r5 = move-exception
            r6.d()
            throw r5
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxk.b(ekgb, fcxy):java.lang.Object");
    }

    @Override // defpackage.azxa
    public final void c(final ekgb ekgbVar) {
        this.e.d("refreshConversationsInTransaction", new Runnable() { // from class: azxg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                ekgb ekgbVar2 = ekgbVar;
                ekqh it = ekgbVar2.iterator();
                it.getClass();
                while (true) {
                    azxk azxkVar = this;
                    if (!it.hasNext()) {
                        ((bakt) azxkVar.c.b()).Q(ekfv.f(ekgbVar2));
                        return;
                    }
                    ConversationIdType conversationIdType = (ConversationIdType) it.next();
                    ekrw ekrwVarG = azxk.a.g();
                    ekrwVarG.X(eksq.a, "BugleRestore");
                    ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl", "refreshConversationsInTransaction$lambda$6", 121, "ConversationRefresherImpl.kt")).t("Refreshing conversation [%s]", conversationIdType);
                    ((baqi) azxkVar.b.b()).c(conversationIdType, true, null);
                }
            }
        });
    }

    @Override // defpackage.azxa
    public final void d() {
        if (((arjp) this.d.b()).a()) {
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleRestore");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl", "reset", 72, "ConversationRefresherImpl.kt")).q("Resetting ConversationRefresherImpl");
            this.i.clear();
        }
    }
}
