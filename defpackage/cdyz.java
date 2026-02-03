package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdyz implements bayk, bayb {
    private static final eksp b = eksp.c("BugleCaption");
    public final Optional a;
    private final bahv c;
    private final ajvr d;
    private final fctc e;

    public cdyz(bahv bahvVar, ajvr ajvrVar, Optional optional) {
        bahvVar.getClass();
        ajvrVar.getClass();
        optional.getClass();
        this.c = bahvVar;
        this.d = ajvrVar;
        this.a = optional;
        this.e = fctd.a(new fdae() { // from class: cdyw
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional2 = this.a.a;
                if (true != optional2.isPresent()) {
                    optional2 = null;
                }
                if (optional2 != null) {
                    return ((cgsa) optional2.get()).r();
                }
                return null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bayk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, java.util.List r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cdyx
            if (r0 == 0) goto L13
            r0 = r8
            cdyx r0 = (defpackage.cdyx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdyx r0 = new cdyx
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r6 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r7 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "ImageCaptionTransportListener::onBeforeInsertion"
            eieu r8 = defpackage.eiiy.h(r8)
            r0.d = r8     // Catch: java.lang.Throwable -> L4f
            r0.c = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r5.c(r6, r7, r0)     // Catch: java.lang.Throwable -> L4f
            if (r6 == r1) goto L4e
            r4 = r8
            r8 = r6
            r6 = r4
        L49:
            r7 = 0
            defpackage.fczl.a(r6, r7)
            return r8
        L4e:
            return r1
        L4f:
            r6 = move-exception
            r7 = r6
            r6 = r8
        L52:
            throw r7     // Catch: java.lang.Throwable -> L53
        L53:
            r8 = move-exception
            defpackage.fczl.a(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdyz.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9, java.util.List r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdyz.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.util.List, fcxy):java.lang.Object");
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (messageCoreData.cX()) {
            String strA = cdyv.a(messageCoreData.ac());
            if (strA != null) {
                messageCoreData.bo(new baxt(strA));
            }
            if (messageCoreData.G() != null) {
                ((eksl) b.h()).q("Successfully deserialized an image caption.");
            }
        }
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bayj.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return true;
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
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
