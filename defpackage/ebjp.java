package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebjp implements Iterator {
    final ByteBuffer a;
    long b = 0;
    final InputStream c;
    final long d;
    final boolean e;
    boolean f;
    final /* synthetic */ ebjj g;
    final /* synthetic */ ebjq h;

    public ebjp(ebjq ebjqVar, ebjj ebjjVar) {
        this.g = ebjjVar;
        this.h = ebjqVar;
        this.a = ByteBuffer.wrap(new byte[ebjqVar.b + 4000]);
        this.c = ebjjVar.c.d();
        long jL = ebjjVar.c.l();
        this.d = jL;
        this.e = jL > 0;
        this.f = true;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ByteBuffer next() throws IOException {
        long j;
        long j2;
        try {
            ebjj ebjjVar = this.g;
            boolean z = ebjjVar.m;
            long j3 = this.d;
            long j4 = j3 - this.b;
            ebjq ebjqVar = this.h;
            int iMin = (int) Math.min(j4, ebjqVar.b);
            byte[] bArr = new byte[8];
            ebjqVar.a.nextBytes(bArr);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
            }
            String string = sb.toString();
            ebjjVar.d.add(string);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.rewind();
            int i2 = ebjjVar.r;
            String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REPORT" : "SEND" : "UNKNOWN";
            if (i2 == 0) {
                throw null;
            }
            ebjq.c(byteBuffer, string, str);
            for (Map.Entry entry : ebjjVar.g.a.entrySet()) {
                byteBuffer.put(((String) entry.getKey()).getBytes());
                byteBuffer.put(ebjb.e);
                byteBuffer.put(((String) entry.getValue()).getBytes());
                byteBuffer.put(ebjb.b);
            }
            if (ebjjVar.r == 3) {
                j = ebjjVar.f;
                j2 = j;
            } else {
                j = this.b + iMin;
                j2 = j3;
            }
            ebjq.b(byteBuffer, ebjb.f, (Long.toString(this.b + 1) + "-" + j + "/" + j2).getBytes());
            if (this.e) {
                String str2 = ebjjVar.h;
                if (str2 == null) {
                    throw new IllegalStateException("expected non-null contents");
                }
                ebjq.b(byteBuffer, ebjb.h, str2.getBytes());
                byte[] bArr2 = ebjb.b;
                byteBuffer.put(bArr2);
                int i3 = iMin;
                while (i3 > 0) {
                    int i4 = this.c.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i3);
                    i3 -= i4;
                    byteBuffer.position(byteBuffer.position() + i4);
                }
                byteBuffer.put(bArr2);
            }
            if (ebjjVar.r == 3) {
                ebjq.b(byteBuffer, ebjb.g, ebjb.k);
            }
            long j5 = this.b + iMin;
            this.b = j5;
            boolean z2 = j5 < j3;
            ebjq.a(byteBuffer, string, z ? 35 : z2 ? 43 : 36);
            this.f = z2 && !z;
            return byteBuffer;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }
}
