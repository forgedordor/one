package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acva extends fcyz implements fdat {
    final /* synthetic */ SelectedConversation a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acva(SelectedConversation selectedConversation, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = selectedConversation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acva) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        botbVarE.A("DebugConversationDetailsMenuExtension#getConversationDetails");
        final SelectedConversation selectedConversation = this.a;
        botbVarE.i(new Function() { // from class: acuz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                botl botlVar = (botl) obj2;
                botlVar.r(selectedConversation.a);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqqj dqqjVarP = botbVarE.b().p();
        try {
            dqpd dqpdVarCS = ((bopr) dqqjVarP).cS();
            dqpdVarCS.getClass();
            String strA = ((bojh) dqpdVarCS).a();
            fczl.a(dqqjVarP, null);
            strA.getClass();
            return strA;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acva(this.a, fcxyVar);
    }
}
