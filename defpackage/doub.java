package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doub implements eeva {
    final /* synthetic */ fdap a;
    final /* synthetic */ List b;
    final /* synthetic */ douf c;

    public doub(fdap fdapVar, List list, douf doufVar) {
        this.a = fdapVar;
        this.b = list;
        this.c = doufVar;
    }

    @Override // defpackage.eeuz
    public final void a(eeve eeveVar) {
        if (eeveVar != null) {
            this.a.invoke(this.b.get(eeveVar.e));
        }
    }

    @Override // defpackage.eeuz
    public final void b(eeve eeveVar) {
        this.a.invoke(this.b.get(eeveVar.e));
        douf doufVar = this.c;
        if (((Boolean) fdct.a(doufVar.c, false)).booleanValue()) {
            doufVar.d(doufVar.d.j);
        }
    }

    @Override // defpackage.eeuz
    public final void c() {
    }
}
