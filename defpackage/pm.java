package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pm extends tu {
    final /* synthetic */ pn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(pn pnVar, View view) {
        super(view);
        this.a = pnVar;
    }

    @Override // defpackage.tu
    public final ot a() {
        po poVar = this.a.a.j;
        if (poVar == null) {
            return null;
        }
        return poVar.a();
    }

    @Override // defpackage.tu
    public final boolean b() {
        this.a.a.p();
        return true;
    }

    @Override // defpackage.tu
    public final boolean c() {
        ps psVar = this.a.a;
        if (psVar.l != null) {
            return false;
        }
        psVar.m();
        return true;
    }
}
