package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxq extends dxxp {
    public final boolean a;

    public dxxq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dxxp
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dxxp) && this.a == ((dxxp) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "AccountCapabilities{shouldHideEmail=" + this.a + "}";
    }
}
