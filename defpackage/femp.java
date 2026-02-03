package defpackage;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class femp extends PushbackReader {
    private static final char[] b = {'\r', '\n', ' '};
    private static final char[] c = {'\r', '\n', '\t'};
    private static final char[] d = {'\n', ' '};
    private static final char[] e = {'\n', '\t'};
    public int a;
    private Log f;
    private char[][] g;
    private char[][] h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public femp(Reader reader) {
        char[][] cArr;
        super(reader, 3);
        char[] cArr2 = b;
        int length = cArr2.length;
        boolean zB = fewr.b("ical4j.unfolding.relaxed");
        this.f = LogFactory.getLog(femp.class);
        int i = 0;
        this.i = 0;
        if (zB) {
            cArr = new char[][]{cArr2, c, d, e};
            this.g = cArr;
        } else {
            cArr = new char[][]{cArr2, c};
            this.g = cArr;
        }
        this.h = new char[cArr.length][];
        while (true) {
            char[][] cArr3 = this.g;
            if (i >= cArr3.length) {
                return;
            }
            this.h[i] = new char[cArr3[i].length];
            this.i = Math.max(this.i, cArr3[i].length);
            i++;
        }
    }

    private final void a() {
        boolean z;
        int i;
        do {
            z = false;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                int i3 = 0;
                while (true) {
                    char[] cArr = this.h[i2];
                    int length = cArr.length;
                    if (i3 >= length || (i = super.read(cArr, i3, length - i3)) < 0) {
                        break;
                    } else {
                        i3 += i;
                    }
                }
                if (i3 > 0) {
                    if (Arrays.equals(this.g[i2], this.h[i2])) {
                        if (this.f.isTraceEnabled()) {
                            this.f.trace("Unfolding...");
                        }
                        this.a++;
                        z = true;
                    } else {
                        unread(this.h[i2], 0, i3);
                    }
                }
            }
        } while (z);
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public final int read() throws IOException {
        int i = super.read();
        int i2 = 0;
        while (true) {
            char[][] cArr = this.g;
            if (i2 >= cArr.length) {
                return i;
            }
            if (i == cArr[i2][0]) {
                unread(i);
                a();
                return super.read();
            }
            i2++;
        }
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3 = super.read(cArr, i, i2);
        int i4 = 0;
        while (true) {
            char[][] cArr2 = this.g;
            if (i4 >= cArr2.length) {
                return i3;
            }
            if (i3 > 0 && cArr[0] == cArr2[i4][0]) {
                unread(cArr, i, i3);
                a();
                return super.read(cArr, i, this.i);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                if (cArr[i5] == this.g[i4][0]) {
                    unread(cArr, i5, i3 - i5);
                    return i5;
                }
            }
            i4++;
        }
    }
}
