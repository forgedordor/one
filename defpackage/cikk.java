package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cikk extends cikl {
    public final boolean a;
    public final boolean b;

    public cikk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.cikl
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cikl
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cikl) {
            cikl ciklVar = (cikl) obj;
            if (this.a == ciklVar.a() && this.b == ciklVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "GroupRenameNotifyEventLoggingInfo{causedNameChange=" + this.a + ", containedSubjectExtension=" + this.b + "}";
    }
}
