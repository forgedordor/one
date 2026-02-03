package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akht implements akhq {
    private static final cqce a = cqce.g("Lighter", "LighterConversationManagerImpl");
    private final avnh b;
    private final cogw c;
    private final akid d;
    private final fcsu e;

    public akht(avnh avnhVar, cogw cogwVar, akid akidVar, fcsu fcsuVar) {
        this.b = avnhVar;
        this.c = cogwVar;
        this.d = akidVar;
        this.e = fcsuVar;
    }

    @Override // defpackage.akhq
    public final void a(akhv akhvVar) {
        int i = akhvVar.b;
        if ((i & 1) == 0) {
            throw new IllegalStateException("MessagesLighterConversation.business_id is empty.");
        }
        if ((i & 2) == 0) {
            throw new IllegalStateException("MessagesLighterConversation.hasConversationIdAsJsonString is empty.");
        }
        if (((Boolean) this.e.b()).booleanValue() && (akhvVar.b & 1024) == 0) {
            throw new IllegalStateException("MessagesLighterConversation.hasSyncTimestamp is empty.");
        }
        akid akidVar = this.d;
        caxr caxrVar = new caxr();
        caxrVar.d = akhvVar.c;
        ((cazj) akidVar.a.b()).a(cbcu.g("create_or_update_lighter_conversation", akhvVar, caxrVar.a()));
    }

    @Override // defpackage.akhq
    public final void b(final String str) {
        botb botbVarE = botm.e();
        botbVarE.A("LighterConversationManagerImpl#getExistingConversation");
        botbVarE.s();
        botbVarE.d();
        botbVarE.i(new Function() { // from class: akhr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.M(4);
                botlVar.l();
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bptj bptjVarA = bpto.a();
        bptjVarA.s();
        bptjVarA.c(new Function() { // from class: akhs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bptn bptnVar = (bptn) obj;
                bptnVar.b(str);
                return bptnVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.H(dqts.i(bptjVarA.b(), bpto.c.b, botm.c.a).g());
        ConversationIdType conversationIdType = (ConversationIdType) Collection.EL.stream(botbVarE.b().g()).findFirst().orElse(barn.a);
        if (conversationIdType.b()) {
            a.r("Tried to delete a non existing conversation on Bugle.");
            return;
        }
        boolean z = false;
        while (!z) {
            try {
                ((cazj) this.d.a.b()).e("create_or_update_lighter_conversation", str);
            } catch (IndexOutOfBoundsException unused) {
                cqbd cqbdVarC = a.c();
                cqbdVarC.I("Nothing to cancel in CreateOrUpdateLighterConversationQueue");
                cqbdVarC.r();
                z = true;
            }
        }
        avnh avnhVar = this.b;
        avnk avnkVarF = avnl.f();
        avnkVarF.f(elka.CONVERSATION_FROM_LIST);
        avnkVarF.c(this.c.f().toEpochMilli());
        avnkVarF.b(conversationIdType);
        avnhVar.b(avnkVarF.a());
    }
}
