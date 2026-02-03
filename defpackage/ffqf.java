package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffqf extends ffqc {
    public final byte[] c;
    public final byte[] d;

    public ffqf(ffqd ffqdVar, byte[] bArr) {
        super(false, ffqdVar);
        byte[] bArrG = ffwk.g(bArr, 0, 32);
        this.c = bArrG;
        this.d = ffwk.g(bArr, bArrG.length, bArr.length);
    }
}
