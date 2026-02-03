package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acjl extends acjr {
    public final int a;
    public final int b;
    public final acms c;

    public acjl(int i, int i2, acms acmsVar) {
        this.a = i;
        this.b = i2;
        this.c = acmsVar;
    }

    @Override // defpackage.acjr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.acjr
    public final int b() {
        return this.b;
    }

    @Override // defpackage.acjr
    public final acms c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acjr) {
            acjr acjrVar = (acjr) obj;
            if (this.a == acjrVar.a() && this.b == acjrVar.b() && equals(acjrVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ hashCode();
    }

    public final String toString() {
        return "ProblematicConversationDataRequest{maxConversationCount=" + this.a + ", maxMessageCount=" + this.b + ", converter=" + String.valueOf(this.c) + "}";
    }
}
