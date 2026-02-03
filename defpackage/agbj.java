package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbj implements crmf {
    final /* synthetic */ agbk a;
    final /* synthetic */ agbi b;

    public agbj(agbk agbkVar, agbi agbiVar) {
        this.a = agbkVar;
        this.b = agbiVar;
    }

    @Override // defpackage.crmf
    public final void a() {
        aisq aisqVar = this.b.b;
        if (aisqVar != null) {
            aisz.a(aisqVar, exmt.PERMISSION_DENIED, 1);
        }
    }

    @Override // defpackage.crmf
    public final void b() {
        agbk agbkVar = this.a;
        aijh aijhVar = (aijh) agbkVar.b.b();
        Context context = agbkVar.a;
        agbi agbiVar = this.b;
        aijhVar.L(context, agbiVar.a, agbiVar.b);
    }

    @Override // defpackage.crmf
    public final /* synthetic */ boolean c() {
        return true;
    }
}
