package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhs extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private res c;
    private reb d;
    private Class e;
    private String f;

    public rhs(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    private final void c(Throwable th, List list) {
        if (!(th instanceof rhs)) {
            list.add(th);
            return;
        }
        Iterator it = ((rhs) th).b.iterator();
        while (it.hasNext()) {
            c((Throwable) it.next(), list);
        }
    }

    private static void d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) throws IOException {
        d(this, appendable);
        rhr rhrVar = new rhr(appendable);
        List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                rhrVar.append("Cause (");
                int i2 = i + 1;
                rhrVar.append(String.valueOf(i2));
                rhrVar.append(" of ");
                rhrVar.append(String.valueOf(size));
                rhrVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof rhs) {
                    ((rhs) th).e(rhrVar);
                } else {
                    d(th, rhrVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    final void b(res resVar, reb rebVar, Class cls) {
        this.c = resVar;
        this.d = rebVar;
        this.e = cls;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f);
        Class cls = this.e;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        reb rebVar = this.d;
        sb.append(rebVar != null ? ", ".concat(rebVar.toString()) : "");
        res resVar = this.c;
        sb.append(resVar != null ? ", ".concat(resVar.toString()) : "");
        List<Throwable> listA = a();
        if (listA.isEmpty()) {
            return sb.toString();
        }
        if (listA.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listA.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listA) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        e(System.err);
    }

    public rhs(String str, List list) {
        this.f = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
