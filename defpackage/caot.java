package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caot extends capi {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private long g;
    private long h;
    private emct i;
    private byte j;

    @Override // defpackage.capi
    public final capj a() {
        emct emctVar;
        if (this.j == -1 && (emctVar = this.i) != null) {
            return new caou(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, emctVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" unknownSenderCount");
        }
        if ((this.j & 2) == 0) {
            sb.append(" restoreSkippedItemCount");
        }
        if ((this.j & 4) == 0) {
            sb.append(" numOfParticipantsTotalToRestore");
        }
        if ((this.j & 8) == 0) {
            sb.append(" numOfParticipantsRestored");
        }
        if ((this.j & 16) == 0) {
            sb.append(" numOfConvTotalToRestore");
        }
        if ((this.j & 32) == 0) {
            sb.append(" numOfConvRestored");
        }
        if ((this.j & 64) == 0) {
            sb.append(" numOfMsgTotalToRestore");
        }
        if ((this.j & 128) == 0) {
            sb.append(" numOfMsgRestored");
        }
        if (this.i == null) {
            sb.append(" initialRestoreTimingStats");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.capi
    public final void b(emct emctVar) {
        if (emctVar == null) {
            throw new NullPointerException("Null initialRestoreTimingStats");
        }
        this.i = emctVar;
    }

    @Override // defpackage.capi
    public final void c(int i) {
        this.f = i;
        this.j = (byte) (this.j | 32);
    }

    @Override // defpackage.capi
    public final void d(int i) {
        this.e = i;
        this.j = (byte) (this.j | 16);
    }

    @Override // defpackage.capi
    public final void e(long j) {
        this.h = j;
        this.j = (byte) (this.j | (-128));
    }

    @Override // defpackage.capi
    public final void f(long j) {
        this.g = j;
        this.j = (byte) (this.j | 64);
    }

    @Override // defpackage.capi
    public final void g(int i) {
        this.d = i;
        this.j = (byte) (this.j | 8);
    }

    @Override // defpackage.capi
    public final void h(int i) {
        this.c = i;
        this.j = (byte) (this.j | 4);
    }

    @Override // defpackage.capi
    public final void i(int i) {
        this.b = i;
        this.j = (byte) (this.j | 2);
    }

    @Override // defpackage.capi
    public final void j(int i) {
        this.a = i;
        this.j = (byte) (this.j | 1);
    }
}
