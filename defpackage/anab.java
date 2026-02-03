package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anab implements ancm {
    private final fcsu a;

    public anab(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        String[] strArr = bpkz.a;
        bpky bpkyVar = new bpky(bpkz.a);
        bpkyVar.A("ExtensionMessageLoadExtension#extendQuery");
        brdrVar.H(dqts.i(bpkyVar.b(), bpkz.b.a, MessagesTable.c.a).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        bindData.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        String[] strArr = bpkz.a;
        dqpd[] dqpdVarArrAH = bindData.aH("extension_messages", new bpkc[0]);
        dqpdVarArrAH.getClass();
        bpkc bpkcVar = (bpkc) fcur.I(dqpdVarArrAH);
        if (bpkcVar == null) {
            return;
        }
        bpkcVar.aA(1, "extension_id");
        String str = bpkcVar.b;
        str.getClass();
        bpkcVar.aA(2, "extension_package_name");
        String str2 = bpkcVar.c;
        str2.getClass();
        ((anaq) anckVar).g = new anac(str, str2);
    }

    @Override // defpackage.ancm
    public final anbf e() {
        return new ancw("extension message");
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
