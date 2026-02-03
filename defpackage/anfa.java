package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anfa implements ancm {
    public final cogw a;
    private final anfe b;

    public anfa(anfe anfeVar, cogw cogwVar) {
        anfeVar.getClass();
        cogwVar.getClass();
        this.b = anfeVar;
        this.a = cogwVar;
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        bpxe bpxeVarB = bpxj.b();
        bpxeVarB.A("PreviewMessageStateExtension#extendQuery");
        bpxeVarB.d(new Function() { // from class: aney
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpwi bpwiVar = (bpwi) obj;
                return new bpwj[]{bpwiVar.a, bpwiVar.e, bpwiVar.f, bpwiVar.h, bpwiVar.g, bpwiVar.i, bpwiVar.c, bpwiVar.j, bpwiVar.k, bpwiVar.d, bpwiVar.l};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.H(dqts.i(bpxeVarB.b(), bpxj.c.b, MessagesTable.c.a).g());
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
        String[] strArr = bpxj.a;
        bpvd[] bpvdVarArr = (bpvd[]) bindData.aH("link_preview", new bpvd[0]);
        bpvdVarArr.getClass();
        bpvd bpvdVar = (bpvd) fcur.I(bpvdVarArr);
        ((anaq) anckVar).a = bpvdVar != null ? new anez(bpvdVar, this) : null;
    }

    @Override // defpackage.ancm
    public final anbf e() {
        return this.b;
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
