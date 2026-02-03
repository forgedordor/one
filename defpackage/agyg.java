package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyg implements bayk {
    public final Context a;
    private final Optional b;
    private final fcsu c;
    private final String d;
    private final fctc e;

    public agyg(Optional optional, Context context, fcsu fcsuVar) {
        optional.getClass();
        context.getClass();
        fcsuVar.getClass();
        this.b = optional;
        this.a = context;
        this.c = fcsuVar;
        this.d = optional.isPresent() ? ((cgsa) optional.get()).r() : null;
        this.e = fctd.a(new fdae() { // from class: agyd
            @Override // defpackage.fdae
            public final Object invoke() {
                String languageTag = craf.c(this.a.a).toLanguageTag();
                languageTag.getClass();
                return languageTag;
            }
        });
    }

    @Override // defpackage.bayk
    public final Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        if (!j() || !messageCoreData.cX()) {
            return messageCoreData;
        }
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) fcva.Y(list);
        return fdbq.f(bindData != null ? bindData.V() : null, this.d) ? d(messageCoreData, fcxyVar) : messageCoreData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.agye
            if (r0 == 0) goto L13
            r0 = r6
            agye r0 = (defpackage.agye) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            agye r0 = new agye
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.c
            java.lang.Object r6 = r6.b()
            cgte r6 = (defpackage.cgte) r6
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 == r1) goto L66
        L46:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L4d
            fctx r5 = defpackage.fctx.a
            return r5
        L4d:
            eyga r0 = r5.ac()
            civc r0 = defpackage.civc.b(r0)
            civa r1 = defpackage.civa.RCS_PENPAL_NAMESPACE
            java.lang.String r2 = "PENPAL-CONVERSATION-ID"
            r0.e(r1, r2, r6)
            eyga r6 = r0.c()
            r5.bs(r6)
            fctx r5 = defpackage.fctx.a
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyg.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.agyf
            if (r0 == 0) goto L13
            r0 = r8
            agyf r0 = (defpackage.agyf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            agyf r0 = new agyf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            return r7
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            r7.dp()
            eyga r8 = r7.ac()
            civc r8 = defpackage.civc.b(r8)
            fctc r2 = r6.e
            civa r4 = defpackage.civa.RCS_PENPAL_NAMESPACE
            java.lang.Object r2 = r2.a()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = "LOCALE"
            r8.e(r4, r5, r2)
            eyga r8 = r8.c()
            r7.bs(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.c(r7, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyg.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bayj.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && this.d != null;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, fcxy fcxyVar) {
        return messageCoreData;
    }
}
