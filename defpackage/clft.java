package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clft implements bayk {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleReplies");
    private final clge c;
    private final dqsn d;

    public clft(clge clgeVar, dqsn dqsnVar) {
        dqsnVar.getClass();
        this.c = clgeVar;
        this.d = dqsnVar;
    }

    public static final void c(MessageIdType messageIdType, MessageIdType messageIdType2) {
        String[] strArr = bqmc.a;
        bqkx bqkxVar = new bqkx();
        bqkxVar.d(messageIdType);
        bqkxVar.e(messageIdType2);
        bqkxVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bayk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.clfs
            if (r0 == 0) goto L13
            r0 = r8
            clfs r0 = (defpackage.clfs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clfs r0 = new clfs
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r7 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L57
        L2a:
            r8 = move-exception
            goto L60
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "RepliesOnOutgoingMessageInsertionListener::onBeforeInsertion"
            eieu r8 = defpackage.eiiy.h(r8)
            clge r2 = r6.c     // Catch: java.lang.Throwable -> L5c
            r0.d = r8     // Catch: java.lang.Throwable -> L5c
            r0.c = r4     // Catch: java.lang.Throwable -> L5c
            fcyh r2 = r2.a     // Catch: java.lang.Throwable -> L5c
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> L5c
            clgd r4 = new clgd     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r3, r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = defpackage.fdin.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L5c
            if (r7 == r1) goto L5b
            r5 = r8
            r8 = r7
            r7 = r5
        L57:
            defpackage.fczl.a(r7, r3)
            return r8
        L5b:
            return r1
        L5c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L60:
            throw r8     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            defpackage.fczl.a(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clft.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bayj.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bayk
    public final void h(MessageCoreData messageCoreData) {
        clfy clfyVarW = messageCoreData.W();
        if (clfyVarW != null) {
            int iK = messageCoreData.k();
            final MessageIdType messageIdType = clfyVarW.b;
            if (iK != 3) {
                MessageIdType messageIdTypeC = messageCoreData.C();
                messageIdTypeC.getClass();
                c(messageIdTypeC, messageIdType);
            } else {
                final MessageIdType messageIdTypeC2 = messageCoreData.C();
                messageIdTypeC2.getClass();
                if (((Boolean) this.d.c("RepliesOnOutgoingMessageInsertionListener.onInsertInTransactionForDraft", new ejxr() { // from class: clfq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("onInsertInTransactionForDraft");
                        final MessageIdType messageIdType2 = messageIdType;
                        brdrVarD.h(new Function() { // from class: clfr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar = (brec) obj;
                                int i = clft.a;
                                brecVar.p(messageIdType2);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boolean zU = brdrVarD.b().U();
                        if (zU) {
                            clft.c(messageIdTypeC2, messageIdType2);
                        }
                        return Boolean.valueOf(zU);
                    }
                })).booleanValue()) {
                    return;
                }
                b.n().q("RepliesOnOutgoingMessageInsertionListener skipped inserting draft reply to missing");
            }
        }
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return true;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
