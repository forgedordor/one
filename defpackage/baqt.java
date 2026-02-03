package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baqt {
    private static final cqce a = cqce.g("BugleDataModel", "ConversationRecipientDatabaseOperations");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public baqt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:3:0x0006, B:4:0x0022, B:6:0x0028, B:8:0x0030, B:11:0x003f, B:15:0x0052, B:17:0x0058, B:18:0x006e, B:12:0x0044, B:14:0x004e, B:19:0x0072, B:21:0x007c), top: B:31:0x0006 }] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ConversationRecipientDatabaseOperationsImpl#getRecipientsForConversationLegacy"
            eieu r0 = defpackage.eiiy.k(r0)
            defpackage.cqaz.h()     // Catch: java.lang.Throwable -> Lb7
            fcsu r1 = r7.e     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lb7
            bakt r1 = (defpackage.bakt) r1     // Catch: java.lang.Throwable -> Lb7
            java.util.List r1 = r1.K(r8)     // Catch: java.lang.Throwable -> Lb7
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb7
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Lb7
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> Lb7
        L22:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto L72
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb7
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4     // Catch: java.lang.Throwable -> Lb7
            if (r9 == 0) goto L44
            int r5 = defpackage.bbbd.a     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = r4.V()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = "ʼUNKNOWN_SENDER!ʼ"
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch: java.lang.Throwable -> Lb7
            if (r5 == 0) goto L3f
            goto L44
        L3f:
            java.lang.String r5 = r4.T()     // Catch: java.lang.Throwable -> Lb7
            goto L52
        L44:
            java.lang.String r5 = r4.V()     // Catch: java.lang.Throwable -> Lb7
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb7
            if (r6 == 0) goto L52
            java.lang.String r5 = r4.T()     // Catch: java.lang.Throwable -> Lb7
        L52:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb7
            if (r6 == 0) goto L6e
            cqce r5 = defpackage.baqt.a     // Catch: java.lang.Throwable -> Lb7
            cqbd r5 = r5.e()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = "Found participant with empty destination."
            r5.I(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.R()     // Catch: java.lang.Throwable -> Lb7
            r5.f(r4)     // Catch: java.lang.Throwable -> Lb7
            r5.r()     // Catch: java.lang.Throwable -> Lb7
            goto L22
        L6e:
            r2.add(r5)     // Catch: java.lang.Throwable -> Lb7
            goto L22
        L72:
            int r9 = r2.size()     // Catch: java.lang.Throwable -> Lb7
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Lb7
            if (r9 >= r3) goto Lb3
            fcsu r9 = r7.b     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> Lb7
            ains r9 = (defpackage.ains) r9     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "Bugle.Datamodel.Operations.EmptyRecipient.Found"
            r9.c(r3)     // Catch: java.lang.Throwable -> Lb7
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb7
            fcsu r3 = r7.c     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lb7
            bxjb r3 = (defpackage.bxjb) r3     // Catch: java.lang.Throwable -> Lb7
            defpackage.ecem.b()     // Catch: java.lang.Throwable -> Lb7
            int r4 = r1.size()     // Catch: java.lang.Throwable -> Lb7
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Lb7
            j$.util.Optional r8 = r3.b(r8, r4, r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r8 = r8.orElse(r2)     // Catch: java.lang.Throwable -> Lb7
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> Lb7
            ekgb r2 = r3.a(r8)     // Catch: java.lang.Throwable -> Lb7
            r3.c(r1, r2)     // Catch: java.lang.Throwable -> Lb7
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb7
            r2 = r9
        Lb3:
            r0.close()
            return r2
        Lb7:
            r8 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lbc
            goto Lc0
        Lbc:
            r9 = move-exception
            r8.addSuppressed(r9)
        Lc0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baqt.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    public final ekgb b(ConversationIdType conversationIdType) {
        ekgb ekgbVarN;
        eieu eieuVarK = eiiy.k("ConversationRecipientDatabaseOperationsImpl#getRecipientsForConversation");
        try {
            cqaz.h();
            List listK = ((bakt) this.e.b()).K(conversationIdType);
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                alqm alqmVarQ = ((alrj) this.d.b()).q((ParticipantsTable.BindData) it.next());
                if (!dhim.d(alqmVarQ.n())) {
                    ekfwVar.h(alqmVarQ);
                }
            }
            if (((ekoe) ekfwVar.g()).c < listK.size()) {
                ((ains) this.b.b()).c("Bugle.Datamodel.Operations.EmptyRecipient.Found");
                ekfw ekfwVar2 = new ekfw();
                bxjb bxjbVar = (bxjb) this.c.b();
                ekgb ekgbVarG = ekfwVar.g();
                ecem.b();
                Optional optionalB = bxjbVar.b(conversationIdType, listK.size(), ((ekoe) ekgbVarG).c);
                if (optionalB.isPresent()) {
                    ekgbVarN = bxjbVar.a(optionalB.get());
                    bxjbVar.c(listK, ekgbVarN);
                } else {
                    ekgbVarN = ekgb.n(ekgbVarG);
                }
                ekfwVar2.j(ekgbVarN);
                ekfwVar = ekfwVar2;
            }
            ekgb ekgbVarG2 = ekfwVar.g();
            eieuVarK.close();
            return ekgbVarG2;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
