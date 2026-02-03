package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajzg extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ ajzh f;
    final /* synthetic */ ajlm g;
    final /* synthetic */ BugleConversation h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzg(ajzh ajzhVar, ajlm ajlmVar, BugleConversation bugleConversation, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = ajzhVar;
        this.g = ajlmVar;
        this.h = bugleConversation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajzg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        int i;
        SelfIdentityId selfIdentityId;
        fcyl fcylVar = fcyl.a;
        int i2 = this.e;
        if (i2 == 0) {
            fctl.b(obj);
            if (((eoth) ((arkm) this.f.a).a.b()).a("bugle.enable_legacy_group_protocol_switch_open_conversation_listener") && this.g == ajlm.FOR_DISPLAY) {
                eiju eijuVarB = ((DefaultConversation) this.h).f.b();
                eijuVarB.getClass();
                this.e = 1;
                obj = fdxs.c(eijuVarB, this);
                if (obj != fcylVar) {
                }
                return fcylVar;
            }
            return fctx.a;
        }
        if (i2 != 1) {
            int i3 = this.d;
            Object obj4 = this.c;
            obj2 = this.b;
            obj3 = this.a;
            fctl.b(obj);
            i = i3;
            selfIdentityId = obj4;
            int size = ((ekgb) obj).size();
            cpeh cpehVar = (cpeh) obj3;
            byeb byebVar = (byeb) cpehVar.b.b();
            byebVar.getClass();
            bbdl bbdlVar = (bbdl) cpehVar.c.b();
            bbdlVar.getClass();
            cogw cogwVar = (cogw) cpehVar.d.b();
            cogwVar.getClass();
            obj2.getClass();
            new LegacyGroupProtocolSwitchAction(cpehVar.a, byebVar, bbdlVar, cogwVar, (ConversationIdType) obj2, selfIdentityId, i, size, false).s();
            return fctx.a;
        }
        fctl.b(obj);
        ajts ajtsVar = (ajts) obj;
        aoer aoerVarH = ajtsVar.h();
        if (ajtsVar.c() == ajlj.GROUP && !ajtsVar.S() && aoerVarH != null) {
            ajzh ajzhVar = this.f;
            DefaultConversation defaultConversation = (DefaultConversation) this.h;
            anpj anpjVar = defaultConversation.d;
            SelfIdentityId selfIdentityIdH = aoerVarH.h();
            int iB = aoerVarH.b();
            eiju eijuVarB2 = anpjVar.b();
            eijuVarB2.getClass();
            cpeh cpehVar2 = ajzhVar.b;
            this.a = cpehVar2;
            obj2 = defaultConversation.a.a;
            this.b = obj2;
            this.c = selfIdentityIdH;
            this.d = iB;
            this.e = 2;
            Object objC = fdxs.c(eijuVarB2, this);
            if (objC != fcylVar) {
                obj3 = cpehVar2;
                obj = objC;
                i = iB;
                selfIdentityId = selfIdentityIdH;
                int size2 = ((ekgb) obj).size();
                cpeh cpehVar3 = (cpeh) obj3;
                byeb byebVar2 = (byeb) cpehVar3.b.b();
                byebVar2.getClass();
                bbdl bbdlVar2 = (bbdl) cpehVar3.c.b();
                bbdlVar2.getClass();
                cogw cogwVar2 = (cogw) cpehVar3.d.b();
                cogwVar2.getClass();
                obj2.getClass();
                new LegacyGroupProtocolSwitchAction(cpehVar3.a, byebVar2, bbdlVar2, cogwVar2, (ConversationIdType) obj2, selfIdentityId, i, size2, false).s();
            }
            return fcylVar;
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajzg(this.f, this.g, this.h, fcxyVar);
    }
}
