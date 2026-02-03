package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class angk implements ancm {
    private final fcsu a;

    public angk(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        String[] strArr = bqfo.a;
        bqfj bqfjVar = new bqfj(bqfo.a);
        bqfjVar.A("+loadEditStatus");
        bqfjVar.e(new Function() { // from class: angh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqeu bqeuVar = (bqeu) obj;
                return new bqev[]{bqeuVar.a, bqeuVar.c, bqeuVar.d, bqeuVar.e};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.H(dqts.i(bqfjVar.b(), bqfo.c.b, MessagesTable.c.a).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final /* bridge */ /* synthetic */ boolean c() {
        return ((Boolean) this.a.b()).booleanValue();
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        bindData.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        String[] strArr = bqfo.a;
        Object[] objArrAH = bindData.aH("message_edits", new bqec[0]);
        objArrAH.getClass();
        angi angiVar = new angi();
        int length = objArrAH.length;
        if (length != 0) {
            objArrAH = Arrays.copyOf(objArrAH, length);
            objArrAH.getClass();
            fcur.e(objArrAH, angiVar);
        }
        List listC = fcur.c(objArrAH);
        if (listC.isEmpty()) {
            return;
        }
        ((anaq) anckVar).i = new angj(listC);
    }

    @Override // defpackage.ancm
    public final /* synthetic */ anbf e() {
        return new ancw("rcs edit");
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
