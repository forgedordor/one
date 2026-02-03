package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anhi implements ancm {
    private final Context a;
    private final dnwr b;
    private final anha c;

    public anhi(Context context, dnwr dnwrVar, anha anhaVar) {
        context.getClass();
        dnwrVar.getClass();
        anhaVar.getClass();
        this.a = context;
        this.b = dnwrVar;
        this.c = anhaVar;
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        bqkg bqkgVarA = bqkl.a();
        bqkgVarA.A("MessageReactionsStateExtension.extendQuery");
        bqkgVarA.d(new Function() { // from class: angv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqjp bqjpVar = bqkl.c;
                return new bqjq[]{bqjpVar.c, bqjpVar.g};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.H(dqts.i(bqkgVarA.b(), bqkl.c.b, MessagesTable.c.a).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        ckmb ckmbVar;
        cklv cklvVarN;
        bindData.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        String[] strArr = bqkl.a;
        bqit[] bqitVarArr = (bqit[]) bindData.aH("message_reactions", new bqit[0]);
        bqitVarArr.getClass();
        bqit bqitVar = (bqit) fcur.I(bqitVarArr);
        angm angmVar = null;
        if (bqitVar != null) {
            bqitVar.aA(6, "animation_effect");
            ckmbVar = bqitVar.g;
        } else {
            ckmbVar = null;
        }
        bqit bqitVar2 = (bqit) fcur.I(bqitVarArr);
        if (bqitVar2 != null && (cklvVarN = bqitVar2.n()) != null) {
            angmVar = new angm(this.a, andwVar, ekgpVar, cklvVarN, ckmbVar);
        }
        ((anaq) anckVar).b = angmVar;
    }

    @Override // defpackage.ancm
    public final anbf e() {
        return this.c;
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
