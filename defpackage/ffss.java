package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffss implements Serializable {
    private static final long serialVersionUID = -3464451825208522308L;
    public final Map a = new TreeMap();
    public transient long b;

    public ffss(long j) {
        this.b = j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.b = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.b);
    }

    final void a(int i, byte[] bArr, byte[] bArr2, fftd fftdVar) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
    }

    public ffss(ffss ffssVar, long j) {
        for (Integer num : ffssVar.a.keySet()) {
            this.a.put(num, new ffsr((ffsr) ffssVar.a.get(num)));
        }
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ffss(defpackage.fftm r25, long r26, byte[] r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffss.<init>(fftm, long, byte[], byte[]):void");
    }
}
