package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couf extends coxg {
    public basd a;
    private aucl d;
    private Optional c = Optional.empty();
    public Optional b = Optional.empty();

    @Override // defpackage.coxg
    public final coxh a() {
        aucl auclVar;
        basd basdVar = this.a;
        if (basdVar != null && (auclVar = this.d) != null) {
            return new coug(basdVar, this.c, this.b, auclVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rcsMessageId");
        }
        if (this.d == null) {
            sb.append(" fileUploadResponse");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.coxg
    public final void b(String str) {
        this.c = Optional.ofNullable(str);
    }

    @Override // defpackage.coxg
    public final void c(aucl auclVar) {
        if (auclVar == null) {
            throw new NullPointerException("Null fileUploadResponse");
        }
        this.d = auclVar;
    }
}
