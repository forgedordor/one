package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfet extends dfey {
    private boolean a;
    private boolean b;
    private byte c;

    @Override // defpackage.dfey
    public final dfez a() {
        if (this.c == 3) {
            return new dfeu(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" cleanupFileTransferAfterUploadCompletes");
        }
        if ((this.c & 2) == 0) {
            sb.append(" isFileTransferViaSmsSupported");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dfey
    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.dfey
    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }
}
