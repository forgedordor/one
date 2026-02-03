package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fezk implements Closeable {
    public Reader d;

    public abstract long a();

    public abstract feyt b();

    public abstract fffb c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fezr.r(c());
    }

    public final InputStream d() {
        return c().k();
    }

    public final Charset e() {
        feyt feytVarB = b();
        if (feytVarB != null) {
            String[] strArr = feytVarB.f;
            Charset charsetForName = fdfy.a;
            int i = 0;
            int iA = fczg.a(0, strArr.length - 1, 2);
            String str = null;
            if (iA >= 0) {
                while (true) {
                    if (!fdgn.j(strArr[i], "charset", true)) {
                        if (i == iA) {
                            break;
                        }
                        i += 2;
                    } else {
                        str = strArr[i + 1];
                        break;
                    }
                }
            }
            if (str != null) {
                try {
                    charsetForName = Charset.forName(str);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (charsetForName != null) {
                return charsetForName;
            }
        }
        return fdfy.a;
    }
}
