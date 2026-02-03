package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytk implements agzt {
    private final Optional a;
    private final fcsu b;
    private agzy c;
    private boolean d;

    public cytk(Optional optional, fcsu fcsuVar) {
        this.a = optional;
        this.b = fcsuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bvqv, java.lang.Object] */
    @Override // defpackage.agzt
    public final eiju b() {
        Optional optional = this.a;
        optional.isPresent();
        return optional.get().e();
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.c = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        if (this.d) {
            this.d = false;
            agzy agzyVar = this.c;
            if (agzyVar != null) {
                agzyVar.b();
            }
        }
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) throws IOException {
        ((cyta) this.b.b()).a(context, 3);
        this.d = true;
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 16;
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
