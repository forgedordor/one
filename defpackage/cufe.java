package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufe implements cmxw {
    final /* synthetic */ cgeu a;
    public final /* synthetic */ ParticipantsTable.BindData b;
    final /* synthetic */ csyk c;

    public cufe(cgeu cgeuVar, ParticipantsTable.BindData bindData, csyk csykVar) {
        this.a = cgeuVar;
        this.b = bindData;
        this.c = csykVar;
    }

    @Override // defpackage.cmxw
    public final bbew a() {
        return ((cget) this.a).f;
    }

    @Override // defpackage.cmxw
    public final /* synthetic */ Object b(fcxy fcxyVar) {
        return cmxs.d();
    }

    @Override // defpackage.cmxw
    public final Object c(fcxy fcxyVar) {
        return Boolean.valueOf(((cget) this.a).c);
    }

    @Override // defpackage.cmxw
    public final /* synthetic */ Object d(fcxy fcxyVar) {
        return cmxs.a(this, fcxyVar);
    }

    @Override // defpackage.cmxw
    public final /* synthetic */ Object e(fcxy fcxyVar) {
        return cmxs.b(this, fcxyVar);
    }

    @Override // defpackage.cmxw
    public final Object f(fcxy fcxyVar) {
        ParticipantsTable.BindData bindData = this.b;
        return Boolean.valueOf(alwh.k(bindData != null ? bindData.T() : null));
    }

    @Override // defpackage.cmxw
    public final /* synthetic */ Object g(fcxy fcxyVar) {
        return cmxs.c(this, fcxyVar);
    }

    @Override // defpackage.cmxw
    public final Object h(fcxy fcxyVar) {
        ParticipantsTable.BindData bindData = this.b;
        boolean z = false;
        if (bindData != null) {
            csyk csykVar = this.c;
            if (csykVar.d(bindData) || csykVar.e(bindData)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cmxw
    public final boolean i() {
        return true;
    }

    @Override // defpackage.cmxw
    public final void j() {
    }
}
