package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amka implements ancm {
    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        String[] strArr = bqbb.a;
        bqay bqayVar = new bqay(bqbb.a);
        bqayVar.A("MessageCaptionLoadExtension#extendQuery");
        Function function = new Function() { // from class: amjz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqam bqamVar = (bqam) obj;
                return new bqan[]{bqamVar.a, bqamVar.b};
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bqam bqamVar = bqbb.c;
        bqayVar.c((bqan[]) function.apply(bqamVar));
        brdrVar.H(dqts.i(bqayVar.b(), bqamVar.a, MessagesTable.c.a).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        bindData.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        String[] strArr = bqbb.a;
        bqad[] bqadVarArr = (bqad[]) bindData.aH("message_captions", new bqad[0]);
        bqadVarArr.getClass();
        bqad bqadVar = (bqad) fcur.I(bqadVarArr);
        ((anaq) anckVar).d = bqadVar != null ? bqadVar.k() : null;
    }

    @Override // defpackage.ancm
    public final /* synthetic */ anbf e() {
        return new ancw("message caption");
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
