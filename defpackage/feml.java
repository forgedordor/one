package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.text.MessageFormat;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feml implements femd {
    public final Log a = LogFactory.getLog(feml.class);
    public final femf b = new femf(this);
    public final femg c = new femg(this);
    public final femj d = new femj(this);
    public final femk e = new femk(this);
    public final femh f = new femh(this);
    public final femi g = new femi(this);

    public static final int d(StreamTokenizer streamTokenizer, Reader reader) {
        int iLineno = streamTokenizer.lineno();
        if (streamTokenizer.ttype == 10) {
            iLineno--;
        }
        return iLineno + ((femp) reader).a;
    }

    public static final int e(StreamTokenizer streamTokenizer, Reader reader) throws IOException, femo {
        int iNextToken = streamTokenizer.nextToken();
        if (iNextToken != -1) {
            return iNextToken;
        }
        throw new femo("Unexpected end of file", d(streamTokenizer, reader));
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader) {
        while (e(streamTokenizer, reader) == 10) {
            Log log = this.a;
            if (log.isTraceEnabled()) {
                log.trace("Absorbing extra whitespace..");
            }
        }
        Log log2 = this.a;
        if (log2.isTraceEnabled()) {
            log2.trace("Aborting: absorbing extra whitespace complete");
        }
    }

    public final void b(StreamTokenizer streamTokenizer, Reader reader, int i) throws femo {
        if (e(streamTokenizer, reader) != i) {
            throw new femo(MessageFormat.format("Expected [{0}], read [{1}]", Integer.valueOf(i), Integer.valueOf(streamTokenizer.ttype)), d(streamTokenizer, reader));
        }
        Log log = this.a;
        if (log.isDebugEnabled()) {
            log.debug(a.e(i, "[", "]"));
        }
    }

    public final void c(StreamTokenizer streamTokenizer, Reader reader, String str, boolean z) throws femo {
        b(streamTokenizer, reader, -3);
        if (z) {
            if (!str.equalsIgnoreCase(streamTokenizer.sval)) {
                throw new femo(MessageFormat.format("Expected [{0}], read [{1}]", str, streamTokenizer.sval), d(streamTokenizer, reader));
            }
        } else if (!str.equals(streamTokenizer.sval)) {
            throw new femo(MessageFormat.format("Expected [{0}], read [{1}]", str, streamTokenizer.sval), d(streamTokenizer, reader));
        }
        Log log = this.a;
        if (log.isDebugEnabled()) {
            log.debug(a.a(str, "[", "]"));
        }
    }
}
