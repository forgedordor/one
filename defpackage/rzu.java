package defpackage;

import j$.util.DesugarCollections;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rzu {
    public final Map a;
    public final sab b;
    public final ffgt c;

    public rzu(Iterable iterable) {
        ffgk ffgkVar = new ffgk();
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            rzw rzwVar = (rzw) it.next();
            map.put(rzwVar.a(), rzwVar);
        }
        this.a = DesugarCollections.unmodifiableMap(map);
        this.c = ffgkVar;
        this.b = new sab();
    }

    public final void a(PrintStream printStream) {
        String property = System.getProperty("line.separator");
        ffgl ffglVar = new ffgl();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            ffgr ffgrVar = this.b.d;
            StringBuffer stringBuffer = new StringBuffer();
            String strA = ffgm.a(1);
            String strA2 = ffgm.a(3);
            ArrayList arrayList = new ArrayList();
            List listA = ffgrVar.a();
            Collections.sort(listA, ffglVar);
            Iterator it = listA.iterator();
            int length = 0;
            while (it.hasNext()) {
                ffgp ffgpVar = (ffgp) it.next();
                StringBuffer stringBuffer2 = new StringBuffer();
                Iterator it2 = it;
                String str = ffgpVar.a;
                stringBuffer2.append(strA);
                stringBuffer2.append("-");
                stringBuffer2.append(str);
                if (ffgpVar.b()) {
                    stringBuffer2.append(',');
                    stringBuffer2.append("--");
                    stringBuffer2.append(ffgpVar.b);
                }
                if (ffgpVar.a()) {
                    ffgpVar.b();
                    stringBuffer2.append(" ");
                    stringBuffer2.append("<");
                    stringBuffer2.append("arg");
                    stringBuffer2.append(">");
                }
                arrayList.add(stringBuffer2);
                if (stringBuffer2.length() > length) {
                    length = stringBuffer2.length();
                }
                it = it2;
            }
            Iterator it3 = listA.iterator();
            int i = 0;
            while (it3.hasNext()) {
                ffgp ffgpVar2 = (ffgp) it3.next();
                int i2 = i + 1;
                StringBuilder sb = new StringBuilder(((StringBuffer) arrayList.get(i)).toString());
                if (sb.length() < length) {
                    sb.append(ffgm.a(length - sb.length()));
                }
                sb.append(strA2);
                int i3 = length + 3;
                String str2 = ffgpVar2.c;
                if (str2 != null) {
                    sb.append(str2);
                }
                String string = sb.toString();
                int iC = ffgm.c(string);
                int i4 = -1;
                if (iC == -1) {
                    stringBuffer.append(ffgm.b(string));
                } else {
                    stringBuffer.append(ffgm.b(string.substring(0, iC)));
                    stringBuffer.append(property);
                    if (i3 >= 74) {
                        i3 = 1;
                    }
                    String strA3 = ffgm.a(i3);
                    while (true) {
                        string = strA3.concat(String.valueOf(string.substring(iC).trim()));
                        iC = ffgm.c(string);
                        if (iC == i4) {
                            break;
                        }
                        if (string.length() > 74 && iC == i3 - 1) {
                            iC = 74;
                        }
                        stringBuffer.append(ffgm.b(string.substring(0, iC)));
                        stringBuffer.append(property);
                        i4 = -1;
                    }
                    stringBuffer.append(string);
                }
                if (it3.hasNext()) {
                    stringBuffer.append(property);
                }
                i = i2;
            }
            printWriter.println(stringBuffer.toString());
        } finally {
            printWriter.flush();
        }
    }
}
