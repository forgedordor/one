package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtca extends dtcb {
    private final Choreographer a = Choreographer.getInstance();

    @Override // defpackage.dtcb
    public final void a(dtbz dtbzVar) {
        this.a.postFrameCallback(dtbzVar.b());
    }

    @Override // defpackage.dtcb
    public final void b(dtbz dtbzVar) {
        this.a.removeFrameCallback(dtbzVar.b());
    }
}
