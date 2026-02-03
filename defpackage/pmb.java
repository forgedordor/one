package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmb implements pmq {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public pmb(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.pmq
    public final void b(pmx pmxVar) {
        pmxVar.I(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.pmq
    public final void e(pmx pmxVar) {
        pmxVar.I(this);
        pmxVar.F(this);
    }

    @Override // defpackage.pmq
    public final /* synthetic */ void f(pmx pmxVar) {
        pmp.a(this, pmxVar);
    }

    @Override // defpackage.pmq
    public final /* synthetic */ void g(pmx pmxVar) {
        pmp.b(this, pmxVar);
    }

    @Override // defpackage.pmq
    public final void c() {
    }

    @Override // defpackage.pmq
    public final void d() {
    }

    @Override // defpackage.pmq
    public final void a(pmx pmxVar) {
    }
}
