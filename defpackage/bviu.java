package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bviu extends bviw {
    public String a;
    public bvks b;
    private ezol c;
    private long d;
    private bvdm e;
    private boolean f;
    private byte g;

    @Override // defpackage.bviw
    public final bvix a() {
        ezol ezolVar;
        String str;
        bvdm bvdmVar;
        bvks bvksVar;
        if (this.g == 3 && (ezolVar = this.c) != null && (str = this.a) != null && (bvdmVar = this.e) != null && (bvksVar = this.b) != null) {
            return new bviv(ezolVar, str, this.d, bvdmVar, this.f, bvksVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" desktopId");
        }
        if (this.a == null) {
            sb.append(" requestId");
        }
        if ((this.g & 1) == 0) {
            sb.append(" lastConnectionTimeMillis");
        }
        if (this.e == null) {
            sb.append(" desktopType");
        }
        if ((this.g & 2) == 0) {
            sb.append(" isPersistent");
        }
        if (this.b == null) {
            sb.append(" dittoIdContainer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bviw
    public final void b(ezol ezolVar) {
        if (ezolVar == null) {
            throw new NullPointerException("Null desktopId");
        }
        this.c = ezolVar;
    }

    @Override // defpackage.bviw
    public final void c(bvdm bvdmVar) {
        if (bvdmVar == null) {
            throw new NullPointerException("Null desktopType");
        }
        this.e = bvdmVar;
    }

    @Override // defpackage.bviw
    public final void d(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.bviw
    public final void e(long j) {
        this.d = j;
        this.g = (byte) (this.g | 1);
    }
}
