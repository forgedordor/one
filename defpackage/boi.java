package defpackage;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boi extends FilterOutputStream {
    private static final byte[] a = "Exif\u0000\u0000".getBytes(boc.a);
    private final boh b;
    private final byte[] c;
    private final ByteBuffer d;
    private int e;
    private int f;
    private int g;

    public boi(OutputStream outputStream, boh bohVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.c = new byte[1];
        this.d = ByteBuffer.allocate(4);
        this.e = 0;
        this.b = bohVar;
    }

    private final int a(int i, byte[] bArr, int i2, int i3) {
        ByteBuffer byteBuffer = this.d;
        int iMin = Math.min(i3, i - byteBuffer.position());
        byteBuffer.put(bArr, i2, iMin);
        return iMin;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.c;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0336, code lost:
    
        if (r3 <= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0338, code lost:
    
        r17.out.write(r18, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x033d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boi.write(byte[], int, int):void");
    }
}
