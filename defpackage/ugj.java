package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugj extends lxd {
    public final ConversationIdType a;
    private final fctc b;
    private final fctc c;
    private final fctc d;
    private final fctc e;
    private final fctc f;

    public ugj(lwn lwnVar, final fcsu fcsuVar, final fcsu fcsuVar2, final fcsu fcsuVar3, final fcsu fcsuVar4) {
        lwnVar.getClass();
        this.a = barn.b((String) lwnVar.b("conversation_id"));
        this.b = fctd.a(new fdae() { // from class: uge
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.fdae
            public final Object invoke() {
                ugs ugsVar = (ugs) fcsuVar.b();
                ugz ugzVar = ugsVar.b;
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                if (ekgbVar == null) {
                    throw new NullPointerException("Null conversationIds");
                }
                bbms bbmsVar = new bbms(this.a, ekgbVar);
                bdxh bdxhVarA = bcvh.a();
                String[] strArr = bdxk.a;
                bdxj bdxjVar = new bdxj();
                int iIntValue = bdxk.c().intValue();
                if (iIntValue < 29020) {
                    dqru.x("delete_timestamp", iIntValue);
                }
                bdxjVar.ap(new dqty("conversations.delete_timestamp", 1, 0L));
                bdxl.l(null);
                bdxl.l(null);
                bdxl.l(null);
                bdxl.l(null);
                bdxl.l(null);
                bdxl.l(null);
                bdxl.l(false);
                ConversationIdType conversationIdType = bbmsVar.a;
                if (!conversationIdType.b()) {
                    bdxjVar.ap(new dqpj("conversations._id", 1, Long.valueOf(barn.a(conversationIdType))));
                }
                ekgb ekgbVar2 = bbmsVar.b;
                if (!ekgbVar2.isEmpty()) {
                    ekfw ekfwVar = new ekfw();
                    ekqh it = ekgbVar2.iterator();
                    while (it.hasNext()) {
                        ekfwVar.h(String.valueOf(barn.a((ConversationIdType) it.next())));
                    }
                    bdxjVar.ap(new dqpm("conversations._id", 3, bdxj.as(ekfwVar.g()), true));
                }
                bdxh bdxhVarA2 = bcvh.a();
                bdxhVarA2.d(bdxjVar);
                if (((Boolean) ((cczi) bvfd.p.get()).e()).booleanValue()) {
                    bdxb bdxbVar = bdxk.b;
                    bdxhVarA2.c(new bdxe(bdxbVar.b, false), new bdxe(bdxbVar.a, true));
                } else {
                    bdxhVarA2.c(new bdxe(bdxk.b.b, false));
                }
                bdxhVarA.d(bdxjVar);
                bdxhVarA.c(new bdxe(bdxk.b.b, false));
                return ugzVar.a("conversation_metadata", bdxhVarA.b(), new ugp(ugsVar, null));
            }
        });
        this.c = fctd.a(new fdae() { // from class: ugf
            @Override // defpackage.fdae
            public final Object invoke() {
                ugs ugsVar = (ugs) fcsuVar.b();
                ugz ugzVar = ugsVar.b;
                bcvf bcvfVarN = bcvg.n();
                ((bbmq) bcvfVarN).f = this.a;
                return ugzVar.a("conversation_metadata", bcvfVarN.a().l(), new ugr(ugsVar, null));
            }
        });
        this.d = fctd.a(new fdae() { // from class: ugg
            @Override // defpackage.fdae
            public final Object invoke() {
                ugv ugvVar = (ugv) fcsuVar2.b();
                ugz ugzVar = ugvVar.c;
                ConversationIdType conversationIdType = this.a;
                return ugzVar.a("participants", baga.c(conversationIdType), new ugu(ugvVar, conversationIdType, null));
            }
        });
        this.e = fctd.a(new fdae() { // from class: ugh
            @Override // defpackage.fdae
            public final Object invoke() {
                uhg uhgVar = (uhg) fcsuVar3.b();
                ugz ugzVar = uhgVar.b;
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("SelfParticipantsDataServiceFactory");
                bsboVarE.h(new Function() { // from class: uhd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsbx bsbxVar = (bsbx) obj;
                        bsbxVar.w(-2);
                        return bsbxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return ugzVar.a("self_participant", bsboVarE.b(), new uhf(uhgVar, null));
            }
        });
        this.f = fctd.a(new fdae() { // from class: ugi
            @Override // defpackage.fdae
            public final Object invoke() {
                uhc uhcVar = (uhc) fcsuVar4.b();
                BugleConversationId bugleConversationId = new BugleConversationId(this.a);
                ugn ugnVar = uhcVar.b;
                anpj anpjVarE = uhcVar.c.e(bugleConversationId);
                uhb uhbVar = new uhb(uhcVar, null);
                ugm ugmVar = new ugm(anpjVarE);
                new ugk(uhbVar, anpjVarE, null);
                return ugnVar.a.a("recipients_model", ugmVar);
            }
        });
    }

    @Override // defpackage.lxd
    protected final void fC() {
        fctc fctcVar = this.b;
        if (fctcVar.b()) {
            ((ugc) fctcVar.a()).a();
        }
        fctc fctcVar2 = this.c;
        if (fctcVar2.b()) {
            ((ugc) fctcVar2.a()).a();
        }
        fctc fctcVar3 = this.d;
        if (fctcVar3.b()) {
            ((ugc) fctcVar3.a()).a();
        }
        fctc fctcVar4 = this.e;
        if (fctcVar4.b()) {
            ((ugc) fctcVar4.a()).a();
        }
        fctc fctcVar5 = this.f;
        if (fctcVar5.b()) {
            ((ugc) fctcVar5.a()).a();
        }
    }
}
