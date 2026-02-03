package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddxf implements ddum {
    private final Status a;
    private final ddxp b;

    public ddxf(Status status, ddxp ddxpVar) {
        this.a = status;
        this.b = ddxpVar;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.dcfu
    public final void b() {
        ddxp ddxpVar = this.b;
        if (ddxpVar != null) {
            ddxpVar.b();
        }
    }

    @Override // defpackage.ddum
    public final ddxp c() {
        return this.b;
    }
}
