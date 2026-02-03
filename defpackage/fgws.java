package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fgws {
    protected final long a;
    protected SelectionKey b;

    protected fgws(SelectableChannel selectableChannel, long j) throws Throwable {
        Selector selectorOpen;
        this.a = j;
        try {
            selectorOpen = Selector.open();
            try {
                selectableChannel.configureBlocking(false);
                this.b = selectableChannel.register(selectorOpen, 1);
            } catch (Throwable th) {
                th = th;
                if (selectorOpen != null) {
                    selectorOpen.close();
                }
                selectableChannel.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            selectorOpen = null;
        }
    }

    protected static void a(SelectionKey selectionKey, long j) throws IOException {
        int iSelectNow;
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            if (jCurrentTimeMillis == 0) {
                iSelectNow = selectionKey.selector().selectNow();
            }
            throw new SocketTimeoutException();
        }
        iSelectNow = selectionKey.selector().select(jCurrentTimeMillis);
        if (iSelectNow != 0) {
            return;
        }
        throw new SocketTimeoutException();
    }

    protected static void c(String str, byte[] bArr) {
        if (fgyz.a("verbosemsg")) {
            int length = bArr.length;
            PrintStream printStream = System.err;
            char[] cArr = fhax.a;
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(length);
            stringBuffer2.append("b");
            stringBuffer.append(stringBuffer2.toString());
            StringBuffer stringBuffer3 = new StringBuffer(" (");
            stringBuffer3.append(str);
            stringBuffer3.append(")");
            stringBuffer.append(stringBuffer3.toString());
            stringBuffer.append(':');
            int length2 = stringBuffer.toString().length();
            stringBuffer.append('\t');
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    int i2 = (length2 + 8) & (-8);
                    if (i % ((80 - i2) / 3) == 0) {
                        stringBuffer.append('\n');
                        for (int i3 = 0; i3 < i2 / 8; i3++) {
                            stringBuffer.append('\t');
                        }
                    }
                }
                byte b = bArr[i];
                char[] cArr2 = fhax.a;
                stringBuffer.append(cArr2[(b & 255) >> 4]);
                stringBuffer.append(cArr2[b & 15]);
                stringBuffer.append(' ');
            }
            stringBuffer.append('\n');
            printStream.println(stringBuffer.toString());
        }
    }

    final void b() throws IOException {
        this.b.selector().close();
        this.b.channel().close();
    }
}
