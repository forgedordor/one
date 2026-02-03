package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpda implements rez {
    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        inputStream.getClass();
        rexVar.getClass();
        try {
            int i3 = ryk.e;
            ryk rykVarB = new rze().b(inputStream);
            if (rykVarB.a == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            float f = rykVarB.b;
            if (rykVarB.c().c == -1.0f && i != Integer.MIN_VALUE) {
                rxk rxkVar = rykVarB.a;
                if (rxkVar == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                rxkVar.c = new rwu(i);
            }
            if (rykVarB.a == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            if (rykVarB.c().d == -1.0f && i2 != Integer.MIN_VALUE) {
                rxk rxkVar2 = rykVarB.a;
                if (rxkVar2 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                rxkVar2.d = new rwu(i2);
            }
            rykVarB.getClass();
            return new rnl(new cpdc(rykVarB));
        } catch (ryw e) {
            throw new IOException("Unable to decode SVG from stream.", e);
        }
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        inputStream.getClass();
        rexVar.getClass();
        int i = elec.a;
        InputStreamReader inputStreamReader = new InputStreamReader(new eleb(inputStream, 256L), fdfy.a);
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[2048];
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (i2 == -1) {
                break;
            }
            sb.append(cArr, 0, i2);
        }
        String string = sb.toString();
        return fdgn.G(string, "<svg", true) || fdgn.G(string, " svg ", true);
    }
}
