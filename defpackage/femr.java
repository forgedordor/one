package defpackage;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class femr implements Serializable {
    private static final long serialVersionUID = 81383256078213569L;
    private List a = new CopyOnWriteArrayList();

    public femr() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String strF = fexb.f(it.next());
            int i = fexd.a;
            stringBuffer.append(fexb.c(strF));
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public femr(String str) throws URISyntaxException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            try {
                this.a.add(new URI(fexd.a(fexb.e(stringTokenizer.nextToken()))));
            } catch (URISyntaxException e) {
                if (!fewr.b("ical4j.parsing.relaxed")) {
                    throw e;
                }
            }
        }
    }
}
