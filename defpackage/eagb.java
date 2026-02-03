package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagb {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    private static final Logger k = Logger.getLogger(eagb.class.getName());
    private static final Map l;
    private static final Map m;
    private static final String n;
    private static final Pattern o;
    private static final Pattern p;
    private static final String q;
    private static final String r;
    private static final String s;
    private static final String t;
    private static final String u;
    private static final String v;
    private static final Pattern w;
    private static eagb x;
    public final Map h;
    public final eagx j;
    private final eagi B = new eagi();
    private final Set y = new HashSet(35);
    private final eagl z = new eagl();
    private final Set A = new HashSet(320);
    public final Set i = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        DesugarCollections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        DesugarCollections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        DesugarCollections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        DesugarCollections.unmodifiableSet(hashSet3);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map3);
        l = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        m = DesugarCollections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        DesugarCollections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        DesugarCollections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        Map map7 = l;
        String strConcat = String.valueOf(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", "")).concat(String.valueOf(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", "")));
        n = strConcat;
        a = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        o = Pattern.compile("(\\p{Nd})");
        b = Pattern.compile("[+＋\\p{Nd}]");
        c = Pattern.compile("[\\\\/] *x");
        d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        p = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + strConcat + "\\p{Nd}]*";
        q = str;
        String strM = m(true);
        r = strM;
        m(false);
        e = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strConcat2 = String.valueOf(strConcat).concat("\\p{Nd}");
        s = strConcat2;
        String strC = a.C("[", "]+((\\-)*[", strConcat2, strConcat2, "])*");
        t = strC;
        String strC2 = a.C("[", "]+((\\-)*[", strConcat, strConcat2, "])*");
        u = strC2;
        String strC3 = a.C("^(", "\\.)*", strC, strC2, "\\.?$");
        v = strC3;
        f = Pattern.compile(strC3);
        g = Pattern.compile("(?:" + strM + ")$", 66);
        w = Pattern.compile(str + "(?:" + strM + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        x = null;
    }

    public eagb(eagx eagxVar, Map map) {
        this.j = eagxVar;
        this.h = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.i.add((Integer) entry.getKey());
            } else {
                this.A.addAll(list);
            }
        }
        if (this.A.remove("001")) {
            k.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.y.addAll((Collection) map.get(1));
    }

    public static synchronized eagb a() {
        if (x == null) {
            eagm eagmVar = eagm.a;
            eafy eafyVar = eagmVar.c;
            eagy eagyVar = eagmVar.d;
            eago eagoVar = eagmVar.b;
            e(new eagb(new eagx(eagyVar), eafx.a()));
        }
        return x;
    }

    public static String c(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int iDigit = Character.digit(charSequence.charAt(i), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static void d(eagd eagdVar, String str) {
        if (eagdVar == null) {
            throw new eafz(str);
        }
    }

    static synchronized void e(eagb eagbVar) {
        x = eagbVar;
    }

    public static boolean g(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return w.matcher(charSequence).matches();
    }

    static final eagf i(eagd eagdVar, int i) {
        switch (i - 1) {
            case 0:
            case 2:
                return eagdVar.b;
            case 1:
                return eagdVar.c;
            case 3:
                return eagdVar.d;
            case 4:
                return eagdVar.e;
            case 5:
                return eagdVar.f;
            case 6:
                return eagdVar.h;
            case 7:
                return eagdVar.g;
            case 8:
                return eagdVar.i;
            case 9:
                return eagdVar.j;
            case 10:
                return eagdVar.k;
            default:
                return eagdVar.a;
        }
    }

    public static void l(StringBuilder sb) {
        if (!p.matcher(sb).matches()) {
            sb.replace(0, sb.length(), c(sb));
            return;
        }
        int length = sb.length();
        Map map = m;
        StringBuilder sb2 = new StringBuilder(sb.length());
        for (int i = 0; i < sb.length(); i++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i))));
            if (ch != null) {
                sb2.append(ch);
            }
        }
        sb.replace(0, length, sb2.toString());
    }

    private static String m(boolean z) {
        String strN = n(20);
        String str = ";ext=".concat(strN) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + n(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + n(9) + "#?") + "|" + ("[- ]+" + n(6) + "#");
        if (!z) {
            return str;
        }
        return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + n(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + n(9) + "#?");
    }

    private static String n(int i) {
        return a.e(i, "(\\p{Nd}{1,", "})");
    }

    private static boolean o(eagf eagfVar) {
        return (eagfVar.a() == 1 && ((Integer) eagfVar.b.get(0)).intValue() == -1) ? false : true;
    }

    private final int p(CharSequence charSequence, eagd eagdVar, int i) {
        eagf eagfVarI = i(eagdVar, i);
        List list = eagfVarI.b;
        if (list.isEmpty()) {
            list = eagdVar.a.b;
        }
        List list2 = eagfVarI.c;
        if (i == 3) {
            if (!o(i(eagdVar, 1))) {
                return p(charSequence, eagdVar, 2);
            }
            eagf eagfVarI2 = i(eagdVar, 2);
            if (o(eagfVarI2)) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(eagfVarI2.a() == 0 ? eagdVar.a.b : eagfVarI2.b);
                Collections.sort(arrayList);
                if (list2.isEmpty()) {
                    list2 = eagfVarI2.c;
                } else {
                    ArrayList arrayList2 = new ArrayList(list2);
                    arrayList2.addAll(eagfVarI2.c);
                    Collections.sort(arrayList2);
                    list2 = arrayList2;
                }
                list = arrayList;
            }
        }
        if (((Integer) list.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Integer numValueOf = Integer.valueOf(length);
        if (list2.contains(numValueOf)) {
            return 2;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == length) {
            return 1;
        }
        if (iIntValue > length) {
            return 4;
        }
        if (((Integer) list.get(list.size() - 1)).intValue() < length) {
            return 6;
        }
        return list.subList(1, list.size()).contains(numValueOf) ? 1 : 5;
    }

    public final eagd b(String str) {
        if (!f(str)) {
            return null;
        }
        eagx eagxVar = this.j;
        if (!eagh.a(str)) {
            throw new IllegalArgumentException(String.valueOf(str).concat(" region code is a non-geo entity"));
        }
        eagd eagdVarB = ((eagq) eagxVar.a.a(eagxVar.b.a(str))).b.b(str);
        d(eagdVarB, "Missing metadata for region code ".concat(String.valueOf(str)));
        return eagdVarB;
    }

    public final boolean f(String str) {
        return str != null && this.A.contains(str);
    }

    public final int h(CharSequence charSequence, eagd eagdVar) {
        return p(charSequence, eagdVar, 12);
    }

    public final int j(CharSequence charSequence, eagd eagdVar, StringBuilder sb, eagg eaggVar) {
        int i = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = eagdVar != null ? eagdVar.n : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = a.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                l(sb2);
            } else {
                Pattern patternA = this.z.a(str);
                l(sb2);
                Matcher matcher2 = patternA.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = o.matcher(sb2.substring(iEnd));
                    if (!matcher3.find() || !c(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, iEnd);
                    }
                }
            }
            if (sb2.length() <= 2) {
                throw new eaga(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                int length = sb2.length();
                int i2 = 1;
                while (true) {
                    if (i2 > 3 || i2 > length) {
                        break;
                    }
                    int i3 = Integer.parseInt(sb2.substring(0, i2));
                    if (this.h.containsKey(Integer.valueOf(i3))) {
                        sb.append(sb2.substring(i2));
                        i = i3;
                        break;
                    }
                    i2++;
                }
            }
            if (i == 0) {
                throw new eaga(1, "Country calling code supplied was not recognised.");
            }
            eaggVar.a(i);
            return i;
        }
        if (eagdVar != null) {
            int i4 = eagdVar.m;
            String strValueOf = String.valueOf(i4);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                eagf eagfVar = eagdVar.a;
                k(sb3, eagdVar, null);
                eagi eagiVar = this.B;
                if ((!eagiVar.a(sb2, eagfVar) && eagiVar.a(sb3, eagfVar)) || h(sb2, eagdVar) == 6) {
                    sb.append((CharSequence) sb3);
                    eaggVar.a(i4);
                    return i4;
                }
            }
        }
        eaggVar.a(0);
        return 0;
    }

    public final void k(StringBuilder sb, eagd eagdVar, StringBuilder sb2) {
        int length = sb.length();
        String str = eagdVar.q;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.z.a(str).matcher(sb);
        if (matcher.lookingAt()) {
            eagf eagfVar = eagdVar.a;
            eagi eagiVar = this.B;
            boolean zA = eagiVar.a(sb, eagfVar);
            int iGroupCount = matcher.groupCount();
            String str2 = eagdVar.r;
            if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zA || eagiVar.a(sb.substring(matcher.end()), eagfVar)) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(str2));
            if (!zA || eagiVar.a(sb3.toString(), eagfVar)) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }
}
