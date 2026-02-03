package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzhk extends bzhw {
    private ekgp a;
    private ekgp b;
    private ekgp c;

    @Override // defpackage.bzhw
    public final bzhx a() {
        ekgp ekgpVar;
        ekgp ekgpVar2;
        ekgp ekgpVar3 = this.a;
        if (ekgpVar3 != null && (ekgpVar = this.b) != null && (ekgpVar2 = this.c) != null) {
            return new bzhl(ekgpVar3, ekgpVar, ekgpVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" failedParticipants");
        }
        if (this.b == null) {
            sb.append(" failedConversations");
        }
        if (this.c == null) {
            sb.append(" failedMessages");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bzhw
    public final void b(ekgp ekgpVar) {
        if (ekgpVar == null) {
            throw new NullPointerException("Null failedConversations");
        }
        this.b = ekgpVar;
    }

    @Override // defpackage.bzhw
    public final void c(ekgp ekgpVar) {
        if (ekgpVar == null) {
            throw new NullPointerException("Null failedMessages");
        }
        this.c = ekgpVar;
    }

    @Override // defpackage.bzhw
    public final void d(ekgp ekgpVar) {
        if (ekgpVar == null) {
            throw new NullPointerException("Null failedParticipants");
        }
        this.a = ekgpVar;
    }
}
