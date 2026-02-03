package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuds implements fdpm {
    final /* synthetic */ igr a;
    final /* synthetic */ dpir b;
    final /* synthetic */ View c;

    public cuds(igr igrVar, dpir dpirVar, View view) {
        this.a = igrVar;
        this.b = dpirVar;
        this.c = view;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        if (((Boolean) obj).booleanValue()) {
            this.a.a(new igq());
            dpir dpirVar = this.b;
            if (dpirVar != null) {
                dpirVar.h(this.c, false);
            }
        }
        return fctx.a;
    }
}
