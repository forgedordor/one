package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class difm extends difn {
    private final int a;

    public difm(int i) {
        this.a = i;
    }

    @Override // defpackage.dify
    public final int b() {
        return 2;
    }

    @Override // defpackage.difn, defpackage.dify
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dify) {
            dify difyVar = (dify) obj;
            if (difyVar.b() == 2 && this.a == difyVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a.a(Integer.toString(this.a - 2), "ConfigDataMapOrSyncFailureReason{syncFailureReason=", "}");
    }
}
