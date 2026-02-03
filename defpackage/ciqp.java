package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciqp extends fcyz implements fdat {
    final /* synthetic */ ciqt a;
    final /* synthetic */ bojh b;
    final /* synthetic */ bojh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciqp(ciqt ciqtVar, bojh bojhVar, bojh bojhVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ciqtVar;
        this.b = bojhVar;
        this.c = bojhVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciqp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final bojh bojhVar = this.c;
        final ciqt ciqtVar = this.a;
        final bojh bojhVar2 = this.b;
        ciqtVar.k.d("RepairForkedMmsGroupSynclet#mergeToTargetConversation", new Runnable() { // from class: ciqo
            @Override // java.lang.Runnable
            public final void run() {
                ekrg ekrgVar = ciqt.a;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "BugleGroupManagement");
                ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$mergeToTargetConversation$2", "invokeSuspend$lambda$0", 364, "RepairForkedMmsGroupSynclet.kt");
                bojh bojhVar3 = bojhVar;
                bojh bojhVar4 = bojhVar2;
                ekrdVar.D("Repairing forked MMS group %d by merging to conversation %s", bojhVar4.C(), bojhVar3.C());
                final ConversationIdType conversationIdTypeC = bojhVar4.C();
                conversationIdTypeC.getClass();
                String[] strArr = MessagesTable.a;
                brdk brdkVar = new brdk();
                brdkVar.f("RepairForkedMmsGroupSynclet#deleteMmsGroupCreatedTombstone");
                brdkVar.c(new Function() { // from class: cipo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar = (brec) obj2;
                        brecVar.m(conversationIdTypeC);
                        brecVar.ae(204);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int iD = brdkVar.d();
                ekrw ekrwVarE = ekrgVar.e();
                ekrwVarE.X(ekrzVar, "BugleGroupManagement");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet", "deleteMmsGroupCreatedTombstone", 458, "RepairForkedMmsGroupSynclet.kt")).r("Deleted %d MMS group created tombstones.", iD);
                bapp bappVar = (bapp) ciqtVar.g.b();
                ConversationIdType conversationIdTypeC2 = bojhVar4.C();
                ConversationIdType conversationIdTypeC3 = bojhVar3.C();
                bvdk bvdkVarG = bojhVar3.G();
                if (bvdkVarG == null) {
                    bvdkVarG = bvdk.UNARCHIVED;
                }
                bappVar.a(conversationIdTypeC2, conversationIdTypeC3, bvdkVarG);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciqp(this.a, this.b, this.c, fcxyVar);
    }
}
