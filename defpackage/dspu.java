package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspu implements dsop {
    public final dsoj a;
    private final fdjx b;

    public dspu(dsoj dsojVar, dsah dsahVar, fdjx fdjxVar) {
        dsojVar.getClass();
        dsahVar.getClass();
        fdjxVar.getClass();
        this.a = dsojVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.dsop
    public final View a(eg egVar, etnj etnjVar) {
        return null;
    }

    @Override // defpackage.dsop
    public final void b(eg egVar, View view, dsbi dsbiVar, etns etnsVar) {
        fdil.d(this.b, null, null, new dspt(this, dsbiVar, null), 3);
    }

    @Override // defpackage.dsop
    public final boolean c(etni etniVar) {
        return etniVar == etni.UITYPE_GNP_CUSTOM_UI;
    }
}
