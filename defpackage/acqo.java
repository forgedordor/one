package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acqo implements wd {
    final /* synthetic */ acrt a;

    public acqo(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.wd
    public final void c(View view) {
        acrt.b(this.a.b).setImportantForAccessibility(1);
    }

    @Override // defpackage.wd
    public final void d(View view) {
        acom acomVar = this.a.b;
        if (acrt.b(acomVar).getChildCount() == 0) {
            acrt.b(acomVar).setImportantForAccessibility(2);
        }
    }
}
