package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqg {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b;
    private static final int c;

    static {
        byte[] bArr = eboz.a;
        b = bArr;
        c = bArr.length;
    }

    public static ebpc a(InputStream inputStream) {
        ebpc ebpeVar;
        int i;
        if (!inputStream.markSupported()) {
            throw new IOException("SipMessageParser requires markable streams");
        }
        String strA = dhij.a(inputStream);
        if (strA.length() == 0) {
            if (inputStream.available() == 0) {
                return new eboz();
            }
            int i2 = c;
            inputStream.mark(i2);
            byte[] bArr = new byte[i2];
            inputStream.read(bArr, 0, i2);
            if (Arrays.equals(bArr, b)) {
                return new eboy();
            }
            inputStream.reset();
            return new eboz();
        }
        if (strA.startsWith("SIP/2.0")) {
            String strConcat = strA.concat("\n");
            ebpx ebpxVar = new ebpx();
            ebpxVar.a = new ebpu("status_lineLexer", strConcat);
            ebpxVar.h();
            ebpxVar.a.h();
            try {
                int i3 = Integer.parseInt(ebpxVar.a.d());
                ebpxVar.a.h();
                String strC = ebpxVar.a.c();
                if (strC == null) {
                    throw new ebml("Rest is null");
                }
                String strTrim = strC.trim();
                ebpxVar.a.h();
                ebpeVar = new ebpe(new ebor(i3, strTrim));
            } catch (NumberFormatException e) {
                String str = ebpxVar.a.f + ":" + e.getMessage();
                int i4 = ebpxVar.a.g;
                throw new ebml(str);
            }
        } else {
            String strConcat2 = strA.concat("\n");
            ebpx ebpxVar2 = new ebpx();
            ebpxVar2.a = new ebpu("method_keywordLexer", strConcat2);
            String strG = ebpxVar2.g();
            ebpxVar2.a.h();
            ebpxVar2.a.j("sip_urlLexer");
            ebma ebmaVarE = new ebqi((ebpu) ebpxVar2.a).e();
            ebpxVar2.a.h();
            ebpxVar2.a.j("request_lineLexer");
            ebpxVar2.h();
            ebpxVar2.a.h();
            ebpxVar2.a.a(10);
            ebpeVar = new ebpd(new ebom(strG, ebmaVarE));
        }
        String strA2 = dhij.a(inputStream);
        while (strA2.trim().length() > 0) {
            ebpt ebptVarA = ebpy.a(strA2.concat("\n"));
            if (ebptVarA == null) {
                throw new ebml("Header Parser is null");
            }
            try {
                ebpeVar.k(ebptVarA.b());
                strA2 = dhij.a(inputStream);
            } catch (IllegalArgumentException | StringIndexOutOfBoundsException e2) {
                throw new ebml("Unable to parse SIP header:".concat(String.valueOf(e2.getMessage())));
            }
        }
        ebnu ebnuVar = ebpeVar.i;
        if (ebnuVar != null && (i = ebnuVar.a) > 0) {
            byte[] bArr2 = new byte[i];
            int i5 = inputStream.read(bArr2);
            while (i5 < i) {
                try {
                    i5 += inputStream.read(bArr2, i5, i - i5);
                } catch (IndexOutOfBoundsException e3) {
                    throw new ebml(String.format("At byte:[%d] of [%d] Unable to read content from SIP message: %s", Integer.valueOf(i5), Integer.valueOf(i), e3.getMessage()));
                }
            }
            ebpeVar.n(bArr2);
        }
        return ebpeVar;
    }
}
