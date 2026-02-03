package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class esyj {
    @Deprecated
    public esyj() {
    }

    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final esyg b() {
        if (this instanceof esyg) {
            return (esyg) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final esym c() {
        if (this instanceof esym) {
            return (esym) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            etdd etddVar = new etdd(stringWriter);
            etddVar.d(1);
            etas.b(this, etddVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
