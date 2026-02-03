package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeig implements View.OnClickListener {
    final /* synthetic */ eeiw a;
    final /* synthetic */ eeih b;

    public eeig(eeih eeihVar, eeiw eeiwVar) {
        this.a = eeiwVar;
        this.b = eeihVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eeih eeihVar = this.b;
        eeihVar.e(this.a.F(eeihVar.b().L() + 1));
    }
}
