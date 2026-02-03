package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxyo implements ancm {
    private final bxys a;

    public bxyo(bxys bxysVar) {
        this.a = bxysVar;
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        String[] strArr = bqsm.a;
        bqsh bqshVar = new bqsh(bqsm.a);
        bqshVar.A("LoadStarMessageStateExtension#extendQuery");
        bqshVar.d(new Function() { // from class: bxyn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqrv bqrvVar = (bqrv) obj;
                return new bqrw[]{bqrvVar.a, bqrvVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.H(dqts.i(bqshVar.b(), bqsm.c.b, MessagesTable.c.a).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        String[] strArr = bqsm.a;
        anckVar.e(((bqrm[]) bindData.aH("message_star", new bqrm[0])).length > 0);
    }

    @Override // defpackage.ancm
    public final anbf e() {
        return this.a;
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
