package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwq implements bayk {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final amif d;

    public ckwq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, amif amifVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        amifVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = amifVar;
    }

    @Override // defpackage.bayk
    public final Object a(MessageCoreData messageCoreData, fcxy fcxyVar) {
        if (messageCoreData.t() == 0) {
            messageCoreData.bW(this.d.a().a);
        }
        return messageCoreData;
    }

    @Override // defpackage.bayk
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        String str;
        String str2;
        ckmn ckmnVar;
        messageCoreData.getClass();
        messageIdType.getClass();
        ckwl ckwlVarV = messageCoreData.V();
        if (ckwlVarV != null) {
            ((ckvy) this.a.b()).a(ckwlVarV, messageIdType);
            cklf cklfVar = (cklf) this.b.b();
            if (messageCoreData.t() == 0) {
                messageCoreData.bW(cklfVar.c.d(messageCoreData));
            }
            ckwl ckwlVarV2 = messageCoreData.V();
            if (ckwlVarV2 != null) {
                ckmc ckmcVarD = ckwlVarV2.d();
                ckml ckmlVarB = ckml.b(ckwlVarV2.c().e);
                if (ckmlVarB == null) {
                    ckmlVarB = ckml.UNRECOGNIZED;
                }
                boolean z = ckmlVarB == ckml.CUSTOM;
                ckmb ckmbVarC = ckwlVarV2.c();
                engg enggVarC = messageCoreData.cX() ? ciuy.b(messageCoreData.ac()).isPresent() ? cklf.c(ckmcVarD, true, z, cklf.f(ckmbVarC, messageCoreData.ac())) : cklf.b(ckmcVarD, true, z, cklf.e(ckmbVarC, messageCoreData.ac(), messageCoreData.F())) : cklf.d(ckmcVarD, true, z, engo.a);
                emoo emooVar = (emoo) emop.a.createBuilder();
                emqp emqpVar = (emqp) emqs.a.createBuilder();
                switch (ckwlVarV2.f().b) {
                    case 0:
                        ckmnVar = ckmn.UNKNOWN;
                        break;
                    case 1:
                        ckmnVar = ckmn.REACTION_BAR;
                        break;
                    case 2:
                        ckmnVar = ckmn.CUSTOM_REACTION_PICKER;
                        break;
                    case 3:
                        ckmnVar = ckmn.DITTO_REACTION_BAR;
                        break;
                    case 4:
                        ckmnVar = ckmn.REACTION_SUMMARY;
                        break;
                    case 5:
                        ckmnVar = ckmn.EMOTIFY_CREATION;
                        break;
                    case 6:
                        ckmnVar = ckmn.EMOTIFY_PICKER_SELF_OWNED;
                        break;
                    case 7:
                        ckmnVar = ckmn.EMOTIFY_PICKER_AUTO_SAVED;
                        break;
                    case 8:
                        ckmnVar = ckmn.DOUBLE_TAP_TO_REACT;
                        break;
                    case 9:
                        ckmnVar = ckmn.MEDIA_VIEWER_REACTION_PICKER;
                        break;
                    default:
                        ckmnVar = null;
                        break;
                }
                if (ckmnVar == null) {
                    ckmnVar = ckmn.UNRECOGNIZED;
                }
                emqr emqrVarA = ckle.a(ckmnVar);
                emqpVar.copyOnWrite();
                emqs emqsVar = (emqs) emqpVar.instance;
                emqsVar.c = emqrVarA.k;
                emqsVar.b |= 1;
                emooVar.copyOnWrite();
                emop emopVar = (emop) emooVar.instance;
                emqs emqsVar2 = (emqs) emqpVar.build();
                emqsVar2.getClass();
                emopVar.d = emqsVar2;
                emopVar.c = 103;
                emqn emqnVar = (emqn) emqo.a.createBuilder();
                int iA = cklf.a(messageCoreData.as());
                emqnVar.copyOnWrite();
                emqo emqoVar = (emqo) emqnVar.instance;
                emqoVar.b |= 1;
                emqoVar.c = iA;
                emqo emqoVar2 = (emqo) emqnVar.build();
                emooVar.copyOnWrite();
                emop emopVar2 = (emop) emooVar.instance;
                emqoVar2.getClass();
                emopVar2.f = emqoVar2;
                emopVar2.e = 209;
                ekgb ekgbVarR = ekgb.r((emop) emooVar.build());
                aiqu aiquVar = cklfVar.a;
                long jT = messageCoreData.t();
                int iA2 = aisd.a(messageCoreData);
                int iB = cklfVar.b.a(ckwlVarV2.f().c).b();
                ekgbVarR.getClass();
                aiqu.b(aiquVar, jT, iA2, iB, ekgbVarR, enggVarC, null, 96);
            }
            if (messageCoreData.cB()) {
                cklg cklgVar = (cklg) this.c.b();
                ckmc ckmcVarD2 = ckwlVarV.d();
                ains ainsVar = cklgVar.a;
                int iOrdinal = ckmcVarD2.ordinal();
                if (iOrdinal == 1) {
                    str2 = "Bugle.MessageReactions.Sent.Add.EncryptedCount";
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalArgumentException("Invalid reaction action when logging: " + ckmcVarD2.a());
                    }
                    str2 = "Bugle.MessageReactions.Sent.Remove.EncryptedCount";
                }
                ainsVar.c(str2);
            } else {
                cklg cklgVar2 = (cklg) this.c.b();
                ckml ckmlVarB2 = ckml.b(ckwlVarV.c().e);
                if (ckmlVarB2 == null) {
                    ckmlVarB2 = ckml.UNRECOGNIZED;
                }
                ckmc ckmcVarD3 = ckwlVarV.d();
                ains ainsVar2 = cklgVar2.a;
                int iOrdinal2 = ckmcVarD3.ordinal();
                if (iOrdinal2 == 1) {
                    str = "Bugle.MessageReactions.Sent.Add.Type";
                } else {
                    if (iOrdinal2 != 2) {
                        throw new IllegalArgumentException("Invalid reaction action when logging: " + ckmcVarD3.a());
                    }
                    str = "Bugle.MessageReactions.Sent.Remove.Type";
                }
                ainsVar2.e(str, cklg.a(ckmlVarB2));
            }
            cklg cklgVar3 = (cklg) this.c.b();
            if (cklgVar3.c(ckwlVarV.c(), ckwlVarV.d(), true)) {
                ((ains) cklgVar3.b.b()).c("Bugle.MessageReactions.AnimationEffects.Sent");
            }
        }
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return true;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
