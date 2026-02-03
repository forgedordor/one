package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evov {
    public static final /* synthetic */ int a = 0;
    private static final ejwc b = new ejwc("-");

    public static final String a(evow evowVar) {
        boolean z;
        String strJ;
        String str = evowVar.a;
        Map map = evowVar.c;
        if (map.size() == 0) {
            return str.isEmpty() ? "" : "".concat(String.valueOf(str));
        }
        Map map2 = evowVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = map2.entrySet().iterator();
        Iterator it2 = map.entrySet().iterator();
        Map.Entry entry = it.hasNext() ? (Map.Entry) it.next() : null;
        Map.Entry entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
        boolean z2 = false;
        while (true) {
            if (entry == null && entry2 == null) {
                if (z2) {
                    arrayList.add(str.substring(0, 0));
                }
                return arrayList.isEmpty() ? "" : "".concat(b.b(arrayList));
            }
            if (entry2 == null) {
                z = true;
            } else if (entry == null) {
                z = false;
            } else {
                int iCompareTo = ((evot) entry.getKey()).compareTo((evot) entry2.getKey());
                z = iCompareTo < 0;
                if (iCompareTo == 0) {
                    entry = null;
                }
            }
            if (z) {
                evou evouVar = (evou) entry.getValue();
                if (z2) {
                    int i = evouVar.a;
                    arrayList.add(str.substring(0, 0));
                    int i2 = evouVar.a;
                    int i3 = evouVar.b;
                } else {
                    int i4 = evouVar.a;
                    int i5 = evouVar.b;
                }
                entry = null;
                z2 = true;
            } else {
                evot evotVar = (evot) entry2.getKey();
                evox evoxVar = (evox) entry2.getValue();
                if (z2) {
                    arrayList.add(str.substring(0, 0));
                }
                if (evoxVar.a != null) {
                    boolean z3 = evoxVar.b;
                    String str2 = evotVar.be;
                    int i6 = evotVar.bf;
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    switch (i7) {
                        case 0:
                            strJ = eldz.f.g().j(eonh.d(((Long) ((evox) entry2.getValue()).a).longValue()));
                            break;
                        case 1:
                            strJ = "";
                            break;
                        case 2:
                            strJ = ((String) ((evox) entry2.getValue()).a).replace(';', ':');
                            break;
                        case 3:
                            strJ = ((Integer) ((evox) entry2.getValue()).a).toString();
                            break;
                        case 4:
                            strJ = ((Long) ((evox) entry2.getValue()).a).toString();
                            break;
                        case 5:
                            strJ = ((Float) ((evox) entry2.getValue()).a).toString();
                            break;
                        case 6:
                            Integer num = (Integer) ((evox) entry2.getValue()).a;
                            num.intValue();
                            strJ = "0x".concat(String.valueOf(String.format("%08x", num)));
                            break;
                        case 7:
                            strJ = eldz.f.g().j(((String) ((evox) entry2.getValue()).a).getBytes(StandardCharsets.ISO_8859_1)).replace('-', '~');
                            break;
                        default:
                            throw new IllegalStateException("OptionType " + evos.a(i6) + " not handled.");
                    }
                    arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                }
                entry2 = null;
                z2 = false;
            }
            if (entry == null && it.hasNext()) {
                entry = (Map.Entry) it.next();
            }
            if (entry2 == null && it2.hasNext()) {
                entry2 = (Map.Entry) it2.next();
            }
        }
    }
}
