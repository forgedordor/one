package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadc implements divg {
    public final String a;
    public final fdae b;
    public final fdae c;

    public aadc(String str, fdae fdaeVar, fdae fdaeVar2) {
        this.a = str;
        this.b = fdaeVar;
        this.c = fdaeVar2;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new aadc(this.a, fdaeVar, this.c);
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
        if (!(obj instanceof aadc)) {
            return false;
        }
        aadc aadcVar = (aadc) obj;
        return fdbq.f(this.a, aadcVar.a) && fdbq.f(this.b, aadcVar.b) && fdbq.f(this.c, aadcVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DuoKitInviteLinkQuestionUiData(recipientDisplayName=" + this.a + ", onDismiss=" + this.b + ", onSendInvite=" + this.c + ")";
    }
}
