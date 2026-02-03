package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyv implements divg {
    public final List a;
    public final fdae b;
    private final boolean c;

    public zyv(List list, fdae fdaeVar) {
        list.getClass();
        this.a = list;
        this.c = true;
        this.b = fdaeVar;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new zyv(this.a, this.b);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.b;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyv)) {
            return false;
        }
        zyv zyvVar = (zyv) obj;
        if (!fdbq.f(this.a, zyvVar.a)) {
            return false;
        }
        boolean z = zyvVar.c;
        return fdbq.f(this.b, zyvVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DebugActionsBottomSheetUiData(debugActions=" + this.a + ", includeScrim=true, onDismiss=" + this.b + ")";
    }
}
