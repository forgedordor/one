package defpackage;

import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eecy implements ldn {
    final /* synthetic */ eedc a;

    public eecy(eedc eedcVar) {
        this.a = eedcVar;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        eedc eedcVar = this.a;
        lgt lgtVar2 = true != eedcVar.getFitsSystemWindows() ? null : lgtVar;
        if (!Objects.equals(eedcVar.f, lgtVar2)) {
            eedcVar.f = lgtVar2;
            eedcVar.requestLayout();
        }
        return lgtVar.m();
    }
}
