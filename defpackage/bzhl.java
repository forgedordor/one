package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzhl extends bzhx {
    public final ekgp a;
    public final ekgp b;
    public final ekgp c;

    public bzhl(ekgp ekgpVar, ekgp ekgpVar2, ekgp ekgpVar3) {
        this.a = ekgpVar;
        this.b = ekgpVar2;
        this.c = ekgpVar3;
    }

    @Override // defpackage.bzhx
    public final ekgp a() {
        return this.b;
    }

    @Override // defpackage.bzhx
    public final ekgp b() {
        return this.c;
    }

    @Override // defpackage.bzhx
    public final ekgp c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzhx) {
            bzhx bzhxVar = (bzhx) obj;
            if (this.a.equals(bzhxVar.c()) && this.b.equals(bzhxVar.a()) && this.c.equals(bzhxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ekgp ekgpVar = this.c;
        ekgp ekgpVar2 = this.b;
        return "CmsBatchBackupFailedItems{failedParticipants=" + this.a.toString() + ", failedConversations=" + ekgpVar2.toString() + ", failedMessages=" + ekgpVar.toString() + "}";
    }
}
