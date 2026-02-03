package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwb {
    private final ejwc a;
    private final String b;

    public ejwb(ejwc ejwcVar, String str) {
        this.a = ejwcVar;
        this.b = str;
    }

    public final void a(StringBuilder sb, Iterator it) throws IOException {
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ejwc ejwcVar = this.a;
                sb.append(ejwcVar.a(entry.getKey()));
                String str = this.b;
                sb.append((CharSequence) str);
                sb.append(ejwcVar.a(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ejwcVar.c);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(ejwcVar.a(entry2.getKey()));
                    sb.append((CharSequence) str);
                    sb.append(ejwcVar.a(entry2.getValue()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void b(StringBuilder sb, Iterable iterable) throws IOException {
        a(sb, iterable.iterator());
    }
}
