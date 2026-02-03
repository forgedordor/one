package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fere implements Serializable {
    private static final long serialVersionUID = -417427815871330636L;
    private List a = new CopyOnWriteArrayList();

    public fere() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(fexb.a((String) it.next()));
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public fere(String str) {
        Matcher matcher = Pattern.compile("([^\\\\](?:\\\\{2})),|([^\\\\]),").matcher(str);
        String[] strArrSplit = matcher.find() ? matcher.replaceAll("$1$2&quot;").split("&quot;") : str.split("(?<!\\\\),");
        for (String str2 : strArrSplit) {
            this.a.add(fexb.d(str2));
        }
    }
}
