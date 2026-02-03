package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwjw extends dwkf {
    private final dwjo a;

    public dwjw(dwjo dwjoVar) {
        this.a = dwjoVar;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.COMPOSED_OVERLAY_ACTION;
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final dwjo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.COMPOSED_OVERLAY_ACTION == dwjiVar.a() && this.a.equals(dwjiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{composedOverlayAction=" + this.a.toString() + "}";
    }
}
