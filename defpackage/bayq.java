package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bayq extends fcyz implements fdat {
    int a;
    final /* synthetic */ bays b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ List d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bayq(fcxy fcxyVar, bays baysVar, MessageCoreData messageCoreData, List list) {
        super(2, fcxyVar);
        this.b = baysVar;
        this.c = messageCoreData;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bayq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r8 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:17:0x0040, B:19:0x0046, B:24:0x0061, B:16:0x0032), top: B:43:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:17:0x0040, B:19:0x0046, B:24:0x0061, B:16:0x0032), top: B:43:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: all -> 0x0014, TryCatch #2 {all -> 0x0014, blocks: (B:6:0x000f, B:30:0x0089, B:26:0x006e, B:28:0x0074), top: B:45:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0058 -> B:22:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:30:0x0089). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            if (r1 == 0) goto L25
            if (r1 == r2) goto L17
            java.lang.Object r1 = r7.e
            java.lang.Object r2 = r7.f
            java.io.Closeable r2 = (java.io.Closeable) r2
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L14
            goto L89
        L14:
            r8 = move-exception
            goto L96
        L17:
            java.lang.Object r1 = r7.e
            java.lang.Object r3 = r7.f
            java.io.Closeable r3 = (java.io.Closeable) r3
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L21
            goto L5b
        L21:
            r8 = move-exception
            r2 = r3
            goto L96
        L25:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.f
            fdjx r8 = (defpackage.fdjx) r8
            java.lang.String r8 = "OutgoingMessageInsertionListenersManager::onBeforeInsertion"
            eieu r8 = defpackage.eiiy.h(r8)
            bays r1 = r7.b     // Catch: java.lang.Throwable -> L93
            ejxr r3 = defpackage.bays.a     // Catch: java.lang.Throwable -> L93
            java.util.Collection r1 = r1.b()     // Catch: java.lang.Throwable -> L93
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = r7.c     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L93
        L40:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L61
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L93
            bayk r4 = (defpackage.bayk) r4     // Catch: java.lang.Throwable -> L93
            r7.f = r8     // Catch: java.lang.Throwable -> L93
            r7.e = r1     // Catch: java.lang.Throwable -> L93
            r7.a = r2     // Catch: java.lang.Throwable -> L93
            java.lang.Object r3 = r4.a(r3, r7)     // Catch: java.lang.Throwable -> L93
            if (r3 == r0) goto L8d
            r6 = r3
            r3 = r8
            r8 = r6
        L5b:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r8 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r8     // Catch: java.lang.Throwable -> L21
            r6 = r3
            r3 = r8
            r8 = r6
            goto L40
        L61:
            bays r1 = r7.b     // Catch: java.lang.Throwable -> L93
            ejxr r2 = defpackage.bays.a     // Catch: java.lang.Throwable -> L93
            java.util.Collection r1 = r1.b()     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L93
            r2 = r8
        L6e:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8e
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L14
            bayk r8 = (defpackage.bayk) r8     // Catch: java.lang.Throwable -> L14
            java.util.List r4 = r7.d     // Catch: java.lang.Throwable -> L14
            r7.f = r2     // Catch: java.lang.Throwable -> L14
            r7.e = r1     // Catch: java.lang.Throwable -> L14
            r5 = 2
            r7.a = r5     // Catch: java.lang.Throwable -> L14
            java.lang.Object r8 = r8.b(r3, r4, r7)     // Catch: java.lang.Throwable -> L14
            if (r8 == r0) goto L8d
        L89:
            r3 = r8
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r3     // Catch: java.lang.Throwable -> L14
            goto L6e
        L8d:
            return r0
        L8e:
            r8 = 0
            defpackage.fczl.a(r2, r8)
            return r3
        L93:
            r0 = move-exception
            r2 = r8
            r8 = r0
        L96:
            throw r8     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            defpackage.fczl.a(r2, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bayq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bayq bayqVar = new bayq(fcxyVar, this.b, this.c, this.d);
        bayqVar.f = obj;
        return bayqVar;
    }
}
