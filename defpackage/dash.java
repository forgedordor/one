package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dash extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dasl d;
    final /* synthetic */ dasi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dash(dasl daslVar, dasi dasiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = daslVar;
        this.e = dasiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dash) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cbcw cbcwVarI;
        eieu eieuVar;
        dasi dasiVar;
        dasi dasiVar2;
        ?? r0 = fcyl.a;
        int i = this.c;
        try {
            if (i == 0) {
                fctl.b(obj);
                dasl daslVar = this.d;
                dasi dasiVar3 = this.e;
                eieu eieuVarH = eiiy.h("SyncConversationDataToWearableHandler#processPendingWorkItemAsync");
                try {
                    ConversationIdType conversationIdTypeB = barn.b(daslVar.b);
                    eieu eieuVarH2 = eiiy.h("SyncConversationDataToWearableHandler#getArchiveStatusFromConversationId");
                    try {
                        bvdk bvdkVar = (bvdk) botm.j(conversationIdTypeB, new Function() { // from class: dasg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((bojh) obj2).G();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        fczl.a(eieuVarH2, null);
                        if (bvdkVar == null) {
                            this.a = dasiVar3;
                            this.b = eieuVarH;
                            this.c = 1;
                            obj = dasiVar3.k(conversationIdTypeB, this);
                            if (obj != r0) {
                                r0 = eieuVarH;
                                dasiVar = dasiVar3;
                                cbcwVarI = (cbcw) obj;
                                eieu eieuVarH3 = eiiy.h("SyncConversationDataToWearableHandler#logConversationDeletionSent");
                                eksp ekspVar = dasi.a;
                                ((aill) ((ctaj) dasiVar.c.b()).a.b()).n(ctaj.a(2));
                                fczl.a(eieuVarH3, null);
                                eieuVar = r0;
                            }
                        } else if (bvdkVar != bvdk.UNARCHIVED) {
                            this.a = dasiVar3;
                            this.b = eieuVarH;
                            this.c = 2;
                            obj = dasiVar3.k(conversationIdTypeB, this);
                            if (obj != r0) {
                                r0 = eieuVarH;
                                dasiVar2 = dasiVar3;
                                cbcwVarI = (cbcw) obj;
                                eieu eieuVarH4 = eiiy.h("SyncConversationDataToWearableHandler#logConversationDeletionFromArchiveSent");
                                eksp ekspVar2 = dasi.a;
                                ((aill) ((ctaj) dasiVar2.c.b()).a.b()).n(ctaj.a(3));
                                fczl.a(eieuVarH4, null);
                                eieuVar = r0;
                            }
                        } else {
                            ekrw ekrwVarN = dasi.a.n();
                            ekrwVarN.X(cqnc.S, "SyncConversationDataToWearableHandler");
                            ekrwVarN.X(cqnc.s, conversationIdTypeB);
                            ekrwVarN.q("Skip syncing conversation deletion to data client.");
                            cbcwVarI = cbcw.i();
                            eieuVar = eieuVarH;
                        }
                        return r0;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r0 = eieuVarH;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(r0, th);
                        throw th2;
                    }
                }
            }
            if (i != 1) {
                Object obj2 = this.b;
                ?? r1 = this.a;
                fctl.b(obj);
                r0 = obj2;
                dasiVar2 = r1;
                cbcwVarI = (cbcw) obj;
                eieu eieuVarH42 = eiiy.h("SyncConversationDataToWearableHandler#logConversationDeletionFromArchiveSent");
                try {
                    eksp ekspVar22 = dasi.a;
                    ((aill) ((ctaj) dasiVar2.c.b()).a.b()).n(ctaj.a(3));
                    fczl.a(eieuVarH42, null);
                    eieuVar = r0;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                Object obj3 = this.b;
                ?? r12 = this.a;
                fctl.b(obj);
                r0 = obj3;
                dasiVar = r12;
                cbcwVarI = (cbcw) obj;
                eieu eieuVarH32 = eiiy.h("SyncConversationDataToWearableHandler#logConversationDeletionSent");
                try {
                    eksp ekspVar3 = dasi.a;
                    ((aill) ((ctaj) dasiVar.c.b()).a.b()).n(ctaj.a(2));
                    fczl.a(eieuVarH32, null);
                    eieuVar = r0;
                } finally {
                }
            }
            cbcwVarI.getClass();
            fczl.a(eieuVar, null);
            return cbcwVarI;
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dash(this.d, this.e, fcxyVar);
    }
}
