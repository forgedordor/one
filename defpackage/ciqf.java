package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciqf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ciqt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciqf(ciqt ciqtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ciqtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciqf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ciqt ciqtVar = this.b;
            this.a = 1;
            obj = ciqtVar.e(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final Set set = (Set) obj;
        botb botbVarE = botm.e();
        botbVarE.A("getMmsGroupConversations");
        botbVarE.s();
        botbVarE.i(new Function() { // from class: ciqd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                botl botlVar = (botl) obj2;
                botlVar.j(1);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.i(new Function() { // from class: ciqe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                botl botlVar = (botl) obj2;
                ekfw ekfwVar = new ekfw();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ekfwVar.h(String.valueOf(barn.a((ConversationIdType) it.next())));
                }
                botlVar.ap(new dqpm("conversations._id", 4, botl.as(ekfwVar.g()), true));
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.e(new bosy(botm.c.r, false));
        botbVarE.y((int) ((Number) this.b.m.b()).longValue());
        return botbVarE.b().z();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciqf(this.b, fcxyVar);
    }
}
