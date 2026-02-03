package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsrf extends lcl {
    final /* synthetic */ ejwi a;
    final /* synthetic */ dsrg b;

    public dsrf(dsrg dsrgVar, ejwi ejwiVar) {
        this.a = ejwiVar;
        this.b = dsrgVar;
    }

    @Override // defpackage.lcl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 65536) {
            this.b.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        if (TextUtils.isEmpty(lhgVar.f())) {
            lhgVar.T(this.a.c());
            return;
        }
        lhgVar.T(String.valueOf(lhgVar.f()) + ", " + ((String) this.a.c()));
    }
}
