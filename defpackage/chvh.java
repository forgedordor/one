package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chvh extends fcyz implements fdat {
    int a;
    final /* synthetic */ chvm b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ alqm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chvh(chvm chvmVar, MessageCoreData messageCoreData, alqm alqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chvmVar;
        this.c = messageCoreData;
        this.d = alqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chvh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chvm chvmVar = this.b;
        ((ains) chvmVar.e.b()).c("Bugle.Rcs.Chat.Message.Revoke.Send.Counts");
        ekrw ekrwVarE = chvm.a.e();
        ekrwVarE.X(eksq.a, "BugleAction");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        MessageCoreData messageCoreData = this.c;
        ekrdVar.X(cqnc.b, messageCoreData.C());
        ekrdVar.X(cqnc.e, messageCoreData.F().b);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/RcsRevocationSenderImpl$revokeMessage$1", "invokeSuspend", 51, "RcsRevocationSenderImpl.kt")).q("Revocation send attempt.");
        alqm alqmVar = this.d;
        this.a = 1;
        Object objA = fdin.a(eicg.a(chvmVar.b), new chvi(null, messageCoreData, alqmVar, chvmVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chvh(this.b, this.c, this.d, fcxyVar);
    }
}
