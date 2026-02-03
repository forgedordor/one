package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejlc extends ejlv {
    private ekgp a;
    private ekgp b;

    @Override // defpackage.ejlv
    public final ejlw a() {
        ekgp ekgpVar;
        ekgp ekgpVar2 = this.a;
        if (ekgpVar2 != null && (ekgpVar = this.b) != null) {
            return new ejld(ekgpVar2, ekgpVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" emotionToStickerNameMap");
        }
        if (this.b == null) {
            sb.append(" stickerNameToStickerMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ejlv
    public final void b(ekgp ekgpVar) {
        if (ekgpVar == null) {
            throw new NullPointerException("Null emotionToStickerNameMap");
        }
        this.a = ekgpVar;
    }

    @Override // defpackage.ejlv
    public final void c(ekgp ekgpVar) {
        if (ekgpVar == null) {
            throw new NullPointerException("Null stickerNameToStickerMap");
        }
        this.b = ekgpVar;
    }
}
