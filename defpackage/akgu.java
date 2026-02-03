package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akgu extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ akgw c;
    final /* synthetic */ BugleConversationId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akgu(akgw akgwVar, BugleConversationId bugleConversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = akgwVar;
        this.d = bugleConversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akgu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            botb botbVarE = botm.e();
            botbVarE.A("GroupObservableSupplier::groupToken");
            botbVarE.g(new Function() { // from class: akgs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    return ((bopp) obj3).C;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final BugleConversationId bugleConversationId = this.d;
            botbVarE.i(new Function() { // from class: akgt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    botl botlVar = (botl) obj3;
                    botlVar.r(bugleConversationId.a);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = botbVarE.b().z();
            ekgbVarZ.getClass();
            bojh bojhVar = (bojh) fcva.Y(ekgbVarZ);
            if (bojhVar == null) {
                return null;
            }
            awjl awjlVarB = bojhVar.B();
            if (awjlVarB == null) {
                ekrw ekrwVarJ = akgw.a.j();
                ekrwVarJ.X(eksq.a, "BugleConversation");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/conversation/group/GroupObservableSupplier$groupToken$1$1", "invokeSuspend", 63, "GroupObservableSupplier.kt")).q("Conversation has no destination token.");
                return null;
            }
            akgw akgwVar = this.c;
            this.a = awjlVarB;
            this.b = 1;
            obj = akgwVar.d.q(awjlVarB, this);
            obj2 = awjlVarB;
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            fctl.b(obj);
            return obj;
        }
        Object obj3 = this.a;
        fctl.b(obj);
        obj2 = obj3;
        if (!((Boolean) obj).booleanValue()) {
            ekrw ekrwVarJ2 = akgw.a.j();
            ekrwVarJ2.X(eksq.a, "BugleConversation");
            ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/group/GroupObservableSupplier$groupToken$1$1", "invokeSuspend", 67, "GroupObservableSupplier.kt")).q("Conversation is not a group.");
            return null;
        }
        akgw akgwVar2 = this.c;
        this.a = null;
        this.b = 2;
        Object objK = akgwVar2.d.k((awjl) obj2, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akgu(this.c, this.d, fcxyVar);
    }
}
