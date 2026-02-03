package defpackage;

import java.io.IOException;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyo {
    public static esyj a(etdb etdbVar) {
        int i = etdbVar.i;
        if (i == 2) {
            etdbVar.u(1);
        }
        try {
            try {
                return etas.a(etdbVar);
            } catch (OutOfMemoryError e) {
                throw new esyn(a.b(etdbVar, "Failed parsing JSON source: ", " to Json"), e);
            } catch (StackOverflowError e2) {
                throw new esyn(a.b(etdbVar, "Failed parsing JSON source: ", " to Json"), e2);
            }
        } finally {
            etdbVar.u(i);
        }
    }

    public static esyj b(Reader reader) {
        try {
            etdb etdbVar = new etdb(reader);
            esyj esyjVarA = a(etdbVar);
            if (!(esyjVarA instanceof esyl) && etdbVar.t() != 10) {
                throw new esyr("Did not consume the entire document.");
            }
            return esyjVarA;
        } catch (etde e) {
            throw new esyr(e);
        } catch (IOException e2) {
            throw new esyk(e2);
        } catch (NumberFormatException e3) {
            throw new esyr(e3);
        }
    }
}
