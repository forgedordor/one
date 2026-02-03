package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.text.MessageFormat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cplo implements femd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/calendar/VCalendarParser");
    public final cplj b = new cplj(this);
    public final cplk c = new cplk(this);
    public final cplm d = new cplm(this);
    public final cpln e = new cpln(this);
    public final cpll f = new cpll(this);

    public static int a(StreamTokenizer streamTokenizer, Reader reader) {
        int iLineno = streamTokenizer.lineno();
        if (streamTokenizer.ttype == 10) {
            iLineno--;
        }
        return iLineno + ((femp) reader).a;
    }

    public static int b(StreamTokenizer streamTokenizer, Reader reader) throws IOException, femo {
        int iNextToken = streamTokenizer.nextToken();
        if (iNextToken != -1) {
            return iNextToken;
        }
        throw new femo("Unexpected end of file", a(streamTokenizer, reader));
    }

    public static void c(StreamTokenizer streamTokenizer, Reader reader) {
        while (b(streamTokenizer, reader) == 10) {
        }
    }

    public static void d(StreamTokenizer streamTokenizer, StringBuilder sb) {
        if (streamTokenizer.ttype == -3) {
            sb.append(streamTokenizer.sval);
        } else {
            sb.append((char) streamTokenizer.ttype);
        }
    }

    public static void e(StreamTokenizer streamTokenizer, Reader reader, String str, boolean z) throws femo {
        f(streamTokenizer, reader, -3);
        if (!(z ? ejuf.e(str, streamTokenizer.sval) : str.equals(streamTokenizer.sval))) {
            throw new femo(MessageFormat.format("Expected [{0}], read [{1}]", Integer.valueOf(str), streamTokenizer.sval), a(streamTokenizer, reader));
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public static void f(StreamTokenizer streamTokenizer, Reader reader, int i) {
        if (b(streamTokenizer, reader) != i) {
            throw new femo(MessageFormat.format("Expected [{0}], read [{1}]", Integer.valueOf(i), Integer.valueOf(streamTokenizer.ttype)), a(streamTokenizer, reader));
        }
    }
}
