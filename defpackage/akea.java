package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akea extends fcyz implements fdat {
    int a;
    final /* synthetic */ akee b;
    final /* synthetic */ ekgb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akea(akee akeeVar, ekgb ekgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akeeVar;
        this.c = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akea) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            akee akeeVar = this.b;
            eiju eijuVarJ = akeeVar.b.j(this.c);
            eijuVarJ.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarJ, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final fdap fdapVar = new fdap() { // from class: akdy
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ConversationId conversationId = (ConversationId) obj2;
                conversationId.getClass();
                return new EmergencyConversationId(((BugleConversationId) conversationId).a);
            }
        };
        Optional map = ((Optional) obj).map(new Function() { // from class: akdz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        return map;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akea(this.b, this.c, fcxyVar);
    }
}
