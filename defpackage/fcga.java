package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcga implements fchl {
    final /* synthetic */ fcgx a;

    public fcga(fcgx fcgxVar) {
        this.a = fcgxVar;
    }

    @Override // defpackage.fchl
    public final void a(boolean z) {
        fcgx fcgxVar = this.a;
        fcgxVar.S.c(fcgxVar.z, z);
        if (z) {
            fcgxVar.k();
        }
    }

    @Override // defpackage.fchl
    public final void c(Status status) {
        throw null;
    }

    @Override // defpackage.fchl
    public final void d() {
        throw null;
    }

    @Override // defpackage.fchl
    public final void e() {
        throw null;
    }

    @Override // defpackage.fchl
    public final void b() {
    }
}
