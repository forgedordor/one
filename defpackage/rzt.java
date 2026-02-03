package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rzt implements sav {
    public static final byte[] a = {68, 85, 77, 80};
    private final rzu b;

    public rzt(rzu rzuVar) {
        this.b = rzuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0244, code lost:
    
        r15 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0295 A[EXC_TOP_SPLITTER, LOOP:5: B:198:0x0295->B:217:0x0295, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106 A[Catch: RuntimeException -> 0x0369, rzo -> 0x036d, ffgs -> 0x0371, rzs -> 0x037c, TryCatch #2 {rzs -> 0x037c, blocks: (B:4:0x000c, B:5:0x001a, B:7:0x0020, B:8:0x002c, B:9:0x003b, B:11:0x0042, B:12:0x004c, B:14:0x0065, B:16:0x006a, B:17:0x0073, B:20:0x007d, B:22:0x0085, B:44:0x0106, B:45:0x0108, B:47:0x010b, B:49:0x0115, B:24:0x008e, B:26:0x0094, B:28:0x009a, B:30:0x00a0, B:32:0x00aa, B:33:0x00ae, B:35:0x00b8, B:37:0x00c7, B:38:0x00e0, B:40:0x00ec, B:41:0x00fb, B:42:0x00ff, B:50:0x011b, B:51:0x0130, B:53:0x0136, B:129:0x0295, B:131:0x029b, B:133:0x02a7, B:56:0x0147, B:59:0x014e, B:61:0x0154, B:63:0x015c, B:64:0x0162, B:66:0x016a, B:68:0x0178, B:70:0x0187, B:72:0x0196, B:73:0x01a5, B:75:0x01ae, B:77:0x01b4, B:79:0x01c2, B:81:0x01c8, B:113:0x0240, B:115:0x0246, B:124:0x0271, B:121:0x0267, B:122:0x026e, B:118:0x0253, B:69:0x017f, B:125:0x0279, B:126:0x028a, B:127:0x028b, B:135:0x02b2, B:137:0x02bc, B:139:0x02ca, B:141:0x02d0, B:143:0x02da, B:144:0x02e9, B:146:0x02ef, B:147:0x02fd, B:149:0x0307, B:150:0x0313, B:152:0x031b, B:154:0x0326, B:156:0x0337, B:157:0x0341, B:158:0x034e, B:159:0x034f, B:160:0x0356, B:161:0x0357, B:162:0x035b, B:163:0x0362), top: B:192:0x000c, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void b(defpackage.rzu r18, defpackage.saa r19, java.lang.String[] r20) throws defpackage.ffgu, defpackage.rzo, defpackage.ffgo, defpackage.ffgn, java.io.IOException {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzt.b(rzu, saa, java.lang.String[]):void");
    }

    private static IOException c(String str) throws IOException {
        rzl.d(str);
        throw new IOException(str);
    }

    @Override // defpackage.sav
    public final void a(sau sauVar) throws ffgu, rzo, ffgo, ffgn, IOException {
        String[] strArr;
        DataInputStream dataInputStream = new DataInputStream(sauVar.a());
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        if (!Arrays.equals(a, bArr)) {
            throw c("Incompatible protocol, are you using an old dumpapp script?");
        }
        int i = dataInputStream.readInt();
        if (i != 1) {
            throw c(a.g(i, "Expected version=1; got="));
        }
        saa saaVar = new saa(dataInputStream, sauVar.b());
        synchronized (saaVar) {
            byte bA = saaVar.a();
            if (bA != 33) {
                throw new rzp(a.g(bA, "Expected enter frame, got: "));
            }
            int iB = saaVar.b();
            strArr = new String[iB];
            for (int i2 = 0; i2 < iB; i2++) {
                DataInputStream dataInputStream2 = saaVar.a;
                byte[] bArr2 = new byte[dataInputStream2.readUnsignedShort()];
                dataInputStream2.readFully(bArr2);
                strArr[i2] = new String(bArr2, Charset.forName("UTF-8"));
            }
        }
        b(this.b, saaVar, strArr);
    }
}
