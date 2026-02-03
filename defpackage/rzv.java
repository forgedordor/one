package defpackage;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rzv {
    public final PrintStream a;
    public final List b;

    public rzv(InputStream inputStream, PrintStream printStream, PrintStream printStream2, List list) {
        rzn.c(inputStream);
        rzn.c(printStream);
        this.a = printStream;
        rzn.c(printStream2);
        this.b = list;
    }
}
