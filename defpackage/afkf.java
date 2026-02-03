package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkf extends fcyz implements fdat {
    final /* synthetic */ afki a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afkf(fcxy fcxyVar, afki afkiVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = afkiVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afkf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fctl.b(obj);
        String[] strArr = bngz.a;
        bngw bngwVar = new bngw();
        bngwVar.ap("dismissScamClassificationInternal");
        aukf aukfVar = aukf.CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM;
        bngwVar.d(aukfVar);
        bngwVar.c(aukd.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
        bngy bngyVar = new bngy();
        ConversationIdType conversationIdType = this.b;
        bngyVar.d(conversationIdType);
        bngyVar.c(aukfVar);
        bngwVar.af(new bngx(bngyVar));
        int iE = bngwVar.b().e();
        if (iE == 0) {
            z = false;
        } else {
            if (iE > 1) {
                ((ekrd) afki.a.j().h("com/google/android/apps/messaging/messageclassifications/ConversationClassificationPersisterImpl", "dismissScamClassificationInternal", 243, "ConversationClassificationPersisterImpl.kt")).B("Multiple rows updated for conversation %s with classification type %d", conversationIdType, aukfVar.a());
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afkf afkfVar = new afkf(fcxyVar, this.a, this.b);
        afkfVar.c = obj;
        return afkfVar;
    }
}
