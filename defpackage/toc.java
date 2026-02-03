package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toc {
    public static boolean a(eqnd eqndVar) {
        return eqndVar.h.contains("SERVER_DELIVERED");
    }

    public static final int b() {
        ecem.b();
        botb botbVarE = botm.e();
        botbVarE.A("countUnknownSenderConversations");
        botbVarE.i(new Function() { // from class: tnw
            public final /* synthetic */ String a = "ʼUNKNOWN_SENDER!ʼ";

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.C(this.a);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return botbVarE.b().h();
    }
}
