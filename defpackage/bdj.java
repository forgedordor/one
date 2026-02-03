package defpackage;

import android.view.Surface;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdj implements bpu {
    final /* synthetic */ lbz a;
    final /* synthetic */ Surface b;

    public bdj(lbz lbzVar, Surface surface) {
        this.a = lbzVar;
        this.b = surface;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        Objects.toString(th);
        lcg.d(th instanceof bdl, "Camera surface session should only fail with request cancellation. Instead failed due to:\n".concat(th.toString()));
        this.a.accept(new ayt(1, this.b));
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.accept(new ayt(0, this.b));
    }
}
