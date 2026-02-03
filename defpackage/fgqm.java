package defpackage;

import java.io.DataInput;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqm {
    static long a(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = unsignedByte2 >> 6;
        if (i == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            unsignedByte = ((unsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return unsignedByte * j;
    }

    public static fgmz b(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return new fgqh(fgqk.n(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return fgqk.n(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        fgqo fgqoVar = new fgqo(str, dataInput.readUTF(), (int) a(dataInput), (int) a(dataInput));
        fgmz fgmzVar = fgmz.a;
        return fgqoVar.equals(fgmzVar) ? fgmzVar : fgqoVar;
    }
}
