package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhr implements anhs {
    private final ckya a;
    private final ckmg b;
    private final arxn c;

    public anhr(ckya ckyaVar, ckmg ckmgVar, arxn arxnVar) {
        ckyaVar.getClass();
        ckmgVar.getClass();
        arxnVar.getClass();
        this.a = ckyaVar;
        this.b = ckmgVar;
        this.c = arxnVar;
    }

    private final ckmb d(angl anglVar) {
        return this.b.b(anglVar.a);
    }

    private static final ckmc e(anhk anhkVar) {
        int iOrdinal = anhkVar.ordinal();
        if (iOrdinal == 0) {
            return ckmc.ADD_REACTION;
        }
        if (iOrdinal == 1) {
            return ckmc.REMOVE_REACTION;
        }
        throw new fctg();
    }

    @Override // defpackage.anhs
    public final /* synthetic */ amwf a(MessageCoreData messageCoreData, anhj anhjVar, anhk anhkVar, boolean z) {
        String strA;
        angl anglVar = (angl) anhjVar;
        anhkVar.getClass();
        ckmb ckmbVarD = d(anglVar);
        if (z) {
            strA = anglVar.a;
        } else {
            strA = this.a.a(e(anhkVar), ckmbVarD, cknp.a(((MessageData) messageCoreData).i));
        }
        amul amulVarD = amum.d();
        amulVarD.c(strA);
        return amulVarD.a();
    }

    @Override // defpackage.anhs
    public final /* bridge */ /* synthetic */ ekgb b(anhj anhjVar, anhk anhkVar) {
        anhkVar.getClass();
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        return ekgbVar;
    }

    @Override // defpackage.anhs
    public final void c(MessageCoreData messageCoreData, anhn anhnVar, ajlh ajlhVar, MessageCoreData messageCoreData2, boolean z) {
        String str;
        String str2;
        String str3;
        ajlhVar.getClass();
        aoer aoerVarG = ajlhVar.g();
        if (aoerVarG == null) {
            throw new IllegalArgumentException("Could not send a reaction without a SelfIdentity");
        }
        ConversationIdType conversationIdType = ((BugleConversationId) ajlhVar.f()).a;
        MessageIdType messageIdTypeC = messageCoreData.C();
        messageIdTypeC.getClass();
        angl anglVar = (angl) anhnVar.b();
        anhk anhkVarC = anhnVar.c();
        ckmh ckmhVar = (ckmh) ckmi.a.createBuilder();
        ckmhVar.getClass();
        cklx cklxVar = (cklx) ckly.a.createBuilder();
        cklxVar.getClass();
        cklz.b(true, cklxVar);
        cklz.c(aoerVarG.h().b(), cklxVar);
        ckmj.b(cklz.a(cklxVar), ckmhVar);
        fhaz fhazVarAJ = messageCoreData2.aJ();
        fhazVarAJ.getClass();
        ckmj.d(fhazVarAJ, ckmhVar);
        if (this.c.a() && (str3 = messageCoreData2.F().b) != null) {
            ckmj.c(str3, ckmhVar);
        }
        ckmi ckmiVarA = ckmj.a(ckmhVar);
        ckmm ckmmVar = (ckmm) ckmo.a.createBuilder();
        ckmmVar.getClass();
        ckmp.b(anhnVar.d(), ckmmVar);
        int iB = aoerVarG.b();
        ckmmVar.copyOnWrite();
        ((ckmo) ckmmVar.instance).c = iB;
        ((MessageData) messageCoreData2).l = ckwk.a(conversationIdType, messageIdTypeC, d(anglVar), ckmiVarA, e(anhkVarC), ckmp.a(ckmmVar));
        messageCoreData2.bx(true);
        if (messageCoreData2.cX()) {
            anhk anhkVarC2 = anhnVar.c();
            ckmn ckmnVarD = anhnVar.d();
            civc civcVarB = civc.b(messageCoreData2.ac());
            if (z) {
                civa civaVar = civa.GSMA_RCS_NAMESPACE;
                int iOrdinal = anhkVarC2.ordinal();
                if (iOrdinal == 0) {
                    str2 = "+Reaction";
                } else {
                    if (iOrdinal != 1) {
                        throw new fctg();
                    }
                    str2 = "-Reaction";
                }
                civcVarB.e(civaVar, "Reference-Type", str2);
            } else {
                civa civaVar2 = civa.REACTIONS_NAMESPACE;
                int iOrdinal2 = anhkVarC2.ordinal();
                if (iOrdinal2 == 0) {
                    str = "message-reaction-add";
                } else {
                    if (iOrdinal2 != 1) {
                        throw new fctg();
                    }
                    str = "message-reaction-remove";
                }
                civcVarB.e(civaVar2, "Message-Reply-Type", str);
            }
            if (messageCoreData.E().k() || messageCoreData.F().k()) {
                String str4 = messageCoreData.E().k() ? messageCoreData.E().b : messageCoreData.F().b;
                if (z) {
                    civcVarB.e(civa.GSMA_RCS_NAMESPACE, "Reference-ID", str4);
                } else {
                    civcVarB.e(civa.REACTIONS_NAMESPACE, "In-Reply-To-Message-Id", str4);
                }
            }
            civcVarB.e(civa.REACTIONS_NAMESPACE, "Origin-Surface-Type", String.valueOf(ckle.a(ckmnVarD).k));
            eyga eygaVarC = civcVarB.c();
            eygaVarC.getClass();
            messageCoreData2.bs(eygaVarC);
            if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
                eyga eygaVarAc = messageCoreData.ac();
                civa civaVar3 = civa.RCS_PENPAL_NAMESPACE;
                Optional optionalA = civb.a(eygaVarAc, civaVar3, "PENPAL-CONVERSATION-ID");
                Optional optionalA2 = civb.a(messageCoreData.ac(), civaVar3, "PENPAL-MESSAGE-ID");
                if (optionalA.isEmpty() || optionalA2.isEmpty()) {
                    return;
                }
                civc civcVarB2 = civc.b(messageCoreData2.ac());
                civcVarB2.e(civaVar3, "PENPAL-CONVERSATION-ID", (String) optionalA.get());
                civcVarB2.e(civaVar3, "PENPAL-MESSAGE-ID", (String) optionalA2.get());
                messageCoreData2.bs(civcVarB2.c());
            }
        }
    }
}
