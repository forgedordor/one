package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxiu implements bxjh {
    public final fcsu b;
    public final Optional c;
    private final fcsu e;
    private final fcsu f;
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations");
    static final cczv a = cdag.h(cdag.b, "fix_invalid_thread_id", true);

    public bxiu(fcsu fcsuVar, fcsu fcsuVar2, Optional optional, fcsu fcsuVar3) {
        this.b = fcsuVar;
        this.e = fcsuVar2;
        this.c = optional;
        this.f = fcsuVar3;
    }

    private static cnqj c(ConversationIdType conversationIdType) {
        ekrg ekrgVar = d;
        ekrd ekrdVar = (ekrd) ekrgVar.j();
        ekrdVar.Z(eksk.FULL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 106, "DatabaseThreadOperations.java")).t("GetOrCreateThreadIdForConversation for conversation %s failed. Attempting to recover from Conversations Table", conversationIdType);
        cnqj cnqjVar = new cnqj();
        bojh bojhVarB = botm.b(conversationIdType);
        if (bojhVarB == null || !bojhVarB.N().c()) {
            ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 117, "DatabaseThreadOperations.java")).q("Failed to retrieve thread ID from conversations table. Setting thread ID as unknown.");
            return cnqjVar;
        }
        cnqj cnqjVarN = bojhVarB.N();
        ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 115, "DatabaseThreadOperations.java")).q("Retrieved valid thread ID from conversations table.");
        return cnqjVarN;
    }

    @Override // defpackage.bxjh
    public final cnqj a(ConversationIdType conversationIdType) {
        cnqj cnqjVarC;
        eieu eieuVarK = eiiy.k("DatabaseThreadOperations#getThreadId");
        try {
            if (((Boolean) avos.a.e()).booleanValue()) {
                try {
                    cnqjVarC = ((avmr) this.f.b()).a(conversationIdType);
                    if (cnqjVarC.d()) {
                        cnqjVarC = c(conversationIdType);
                    }
                } catch (ejyc unused) {
                    cnqjVarC = c(conversationIdType);
                }
            } else {
                cqaz.h();
                cnqjVarC = (cnqj) botm.i(conversationIdType, new Function() { // from class: bxis
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    /* JADX WARN: Type inference failed for: r0v9, types: [fcsu, java.lang.Object] */
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bojh bojhVar = (bojh) obj;
                        if (bojhVar.N().c()) {
                            return bojhVar.N();
                        }
                        if (bojhVar.N().c()) {
                            return bojhVar.N();
                        }
                        bxiu bxiuVar = this.a;
                        if (bojhVar.al()) {
                            ((ains) bxiuVar.b.b()).c("Bugle.Wipeout.ReverseTelephonySync.GetThreadId.AwaitingSync.InvalidThreadId");
                            if (((Boolean) bxiu.a.e()).booleanValue()) {
                                Optional optional = bxiuVar.c;
                                optional.isPresent();
                                return ((cnlo) optional.get().b()).a(bojhVar.C());
                            }
                        } else {
                            ((ains) bxiuVar.b.b()).c("Bugle.Wipeout.ReverseTelephonySync.GetThreadId.NotAwaitingSync.InvalidThreadId");
                        }
                        return bojhVar.N();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: bxit
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new cnqj();
                    }
                });
            }
            eieuVarK.close();
            return cnqjVarC;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bxjh
    public final void b(List list, bvdk bvdkVar) {
        boolean zD = bvdkVar.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cnqj cnqjVarA = a((ConversationIdType) it.next());
            if (cnqjVarA.d()) {
                ((ekrd) ((ekrd) d.j()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "setThreadsArchiveStatusInTelephony", 152, "DatabaseThreadOperations.java")).q("Thread Id for conversation not found, skipping telephony archive status update");
            } else {
                ((cmqj) this.e.b()).M(cnqjVarA, zD);
            }
        }
    }
}
