package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffor extends ffoo {
    public final byte[] c;
    public final byte[] d;

    public ffor(ffop ffopVar, byte[] bArr) {
        super(false, ffopVar);
        int length = bArr.length;
        int i = length - 32;
        this.c = ffwk.g(bArr, 0, i);
        this.d = ffwk.g(bArr, i, length);
    }

    public ffor(ffop ffopVar, byte[] bArr, byte[] bArr2) {
        super(false, ffopVar);
        this.c = ffwk.c(bArr);
        this.d = ffwk.c(bArr2);
    }
}
