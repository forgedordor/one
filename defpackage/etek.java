package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etek {
    public static final Logger a = Logger.getLogger(etek.class.getName());
    public static final ekgp b;
    public static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    public static final etdn g;
    private static final ekhx h;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static final String l;
    private static final String m;
    private static final Pattern n;
    private static final Pattern o;
    private static final Pattern p;
    private static etek q;
    private final etec r;
    private final Map s;
    private final Set t = EnumSet.noneOf(etdn.class);
    private final eter u = new eter();
    private final Set v = new HashSet(320);
    private final Set w = new HashSet();
    private final etfi x;

    static {
        ekgp.l(54, "9");
        ekhv ekhvVar = new ekhv();
        ekhvVar.c(86);
        ekhx ekhxVarG = ekhvVar.g();
        h = ekhxVarG;
        new ekph(52);
        ekhv ekhvVar2 = new ekhv();
        ekhvVar2.c(52);
        ekhvVar2.c(54);
        ekhvVar2.c(55);
        ekhvVar2.c(62);
        ekhvVar2.j(ekhxVarG);
        ekhvVar2.g();
        ekgi ekgiVar = new ekgi();
        ekgiVar.g(etds.a);
        ekgiVar.i('+', '+');
        ekgiVar.i('*', '*');
        ekgiVar.i('#', '#');
        ekgiVar.c();
        HashMap map = new HashMap();
        ekqg ekqgVarListIterator = etds.b.keySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Character ch = (Character) ekqgVarListIterator.next();
            map.put(Character.valueOf(ejuf.a(ch.charValue())), ch);
            map.put(ch, ch);
        }
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.g(etds.a);
        ekgiVar2.g(map);
        ekgiVar2.i('-', '-');
        ekgiVar2.i((char) 65293, '-');
        ekgiVar2.i((char) 8208, '-');
        ekgiVar2.i((char) 8209, '-');
        ekgiVar2.i((char) 8210, '-');
        ekgiVar2.i((char) 8211, '-');
        ekgiVar2.i((char) 8212, '-');
        ekgiVar2.i((char) 8213, '-');
        ekgiVar2.i((char) 8722, '-');
        ekgiVar2.i('/', '/');
        ekgiVar2.i((char) 65295, '/');
        ekgiVar2.i(' ', ' ');
        ekgiVar2.i((char) 12288, ' ');
        ekgiVar2.i((char) 8288, ' ');
        ekgiVar2.i('.', '.');
        ekgiVar2.i((char) 65294, '.');
        b = ekgiVar2.c();
        c = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        d = Pattern.compile("[+＋]+");
        i = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        j = Pattern.compile("(\\p{Nd})");
        k = Pattern.compile("[+＋\\p{Nd}]");
        e = Pattern.compile("[\\\\/] *x");
        f = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + etds.d + "\\p{Nd}]*";
        l = str;
        String strH = H(true);
        m = strH;
        H(false);
        n = Pattern.compile("(?:" + strH + ")$", 66);
        o = Pattern.compile(str + "(?:" + strH + ")?", 66);
        Pattern.compile("(\\D+)");
        p = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        q = null;
        g = eteo.a;
    }

    public etek(etfi etfiVar, Map map) {
        this.r = new etec(map.keySet());
        this.x = etfiVar;
        this.s = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && g.equals(list.get(0))) {
                this.w.add((Integer) entry.getKey());
            } else {
                this.v.addAll(list);
            }
        }
        if (this.v.remove(g)) {
            a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "<init>", "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.t.addAll((Collection) map.get(1));
    }

    static void D(StringBuilder sb) {
        if (etds.e.matcher(sb).matches()) {
            sb.replace(0, sb.length(), E(sb, etds.c));
        } else {
            sb.replace(0, sb.length(), etej.a(sb));
        }
    }

    public static String E(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(ejuf.b(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    static final boolean F(String str, etei eteiVar) {
        evsx evsxVar = eteiVar.d;
        return (evsxVar.isEmpty() || evsxVar.contains(Integer.valueOf(str.length()))) && eten.a(str, eteiVar) == 1;
    }

    private static etfm G(etfp etfpVar) {
        etfm etfmVar = (etfm) etfp.a.createBuilder();
        int i2 = etfpVar.c;
        etfmVar.copyOnWrite();
        etfp etfpVar2 = (etfp) etfmVar.instance;
        etfpVar2.b |= 1;
        etfpVar2.c = i2;
        long j2 = etfpVar.d;
        etfmVar.copyOnWrite();
        etfp etfpVar3 = (etfp) etfmVar.instance;
        etfpVar3.b |= 2;
        etfpVar3.d = j2;
        if (etfpVar.e.length() > 0) {
            String str = etfpVar.e;
            etfmVar.copyOnWrite();
            etfp etfpVar4 = (etfp) etfmVar.instance;
            str.getClass();
            etfpVar4.b |= 4;
            etfpVar4.e = str;
        }
        if (etfpVar.f) {
            etfmVar.copyOnWrite();
            etfp.a((etfp) etfmVar.instance);
            int i3 = etfpVar.g;
            etfmVar.copyOnWrite();
            etfp etfpVar5 = (etfp) etfmVar.instance;
            etfpVar5.b |= 16;
            etfpVar5.g = i3;
        }
        return etfmVar;
    }

    private static String H(boolean z) {
        String strI = I(20);
        String str = ";ext=".concat(strI) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + I(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + I(9) + "#?") + "|" + ("[- ]+" + I(6) + "#");
        if (!z) {
            return str;
        }
        return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + I(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + I(9) + "#?");
    }

    private static String I(int i2) {
        return a.e(i2, "(\\p{Nd}{1,", "})");
    }

    private static void J(etee eteeVar, String str) {
        if (eteeVar == null) {
            throw new etdv(str);
        }
    }

    private static boolean K(etei eteiVar) {
        return (eteiVar.d.size() == 1 && eteiVar.d.d(0) == -1) ? false : true;
    }

    private static etei L(etee eteeVar, int i2) {
        switch (i2 - 1) {
            case 0:
            case 2:
                etei eteiVar = eteeVar.d;
                if (eteiVar == null) {
                    break;
                }
                break;
            case 1:
                etei eteiVar2 = eteeVar.e;
                if (eteiVar2 == null) {
                    break;
                }
                break;
            case 3:
                etei eteiVar3 = eteeVar.f;
                if (eteiVar3 == null) {
                    break;
                }
                break;
            case 4:
                etei eteiVar4 = eteeVar.g;
                if (eteiVar4 == null) {
                    break;
                }
                break;
            case 5:
                etei eteiVar5 = eteeVar.h;
                if (eteiVar5 == null) {
                    break;
                }
                break;
            case 6:
                etei eteiVar6 = eteeVar.j;
                if (eteiVar6 == null) {
                    break;
                }
                break;
            case 7:
                etei eteiVar7 = eteeVar.i;
                if (eteiVar7 == null) {
                    break;
                }
                break;
            case 8:
                etei eteiVar8 = eteeVar.k;
                if (eteiVar8 == null) {
                    break;
                }
                break;
            case 9:
                etei eteiVar9 = eteeVar.l;
                if (eteiVar9 == null) {
                    break;
                }
                break;
            case 10:
                etei eteiVar10 = eteeVar.m;
                if (eteiVar10 == null) {
                    break;
                }
                break;
            default:
                etei eteiVar11 = eteeVar.c;
                if (eteiVar11 == null) {
                    break;
                }
                break;
        }
        return etei.a;
    }

    private final int M(CharSequence charSequence, etee eteeVar) {
        return N(charSequence, eteeVar, 12);
    }

    private final int N(CharSequence charSequence, etee eteeVar, int i2) {
        List list;
        evsx evsxVar;
        etei eteiVarL = L(eteeVar, i2);
        if (eteiVarL.d.size() == 0) {
            etei eteiVar = eteeVar.c;
            if (eteiVar == null) {
                eteiVar = etei.a;
            }
            list = eteiVar.d;
        } else {
            list = eteiVarL.d;
        }
        List list2 = eteiVarL.e;
        if (i2 == 3) {
            if (!K(L(eteeVar, 1))) {
                return N(charSequence, eteeVar, 2);
            }
            etei eteiVarL2 = L(eteeVar, 2);
            if (K(eteiVarL2)) {
                List arrayList = new ArrayList(list);
                if (eteiVarL2.d.size() == 0) {
                    etei eteiVar2 = eteeVar.c;
                    if (eteiVar2 == null) {
                        eteiVar2 = etei.a;
                    }
                    evsxVar = eteiVar2.d;
                } else {
                    evsxVar = eteiVarL2.d;
                }
                arrayList.addAll(evsxVar);
                Collections.sort(arrayList);
                if (list2.isEmpty()) {
                    list2 = eteiVarL2.e;
                } else {
                    List arrayList2 = new ArrayList(list2);
                    arrayList2.addAll(eteiVarL2.e);
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
        Object objValueOf = Integer.valueOf(length);
        if (list2.contains(objValueOf)) {
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
        return list.subList(1, list.size()).contains(objValueOf) ? 1 : 5;
    }

    private static final boolean O(etfp etfpVar, etfp etfpVar2) {
        String strValueOf = String.valueOf(etfpVar.d);
        String strValueOf2 = String.valueOf(etfpVar2.d);
        return strValueOf.endsWith(strValueOf2) || strValueOf2.endsWith(strValueOf);
    }

    public static synchronized etek h() {
        if (q == null) {
            n(new etek(etem.a().b, etdt.a));
        }
        return q;
    }

    static synchronized void n(etek etekVar) {
        q = etekVar;
    }

    public static boolean s(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return o.matcher(charSequence).matches();
    }

    public final void A(int i2, int i3, StringBuilder sb) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (i4 == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else {
            if (i4 != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    public final String B(String str, etdx etdxVar, int i2) {
        String strReplaceAll;
        eter eterVar = this.u;
        String str2 = etdxVar.d;
        Matcher matcher = eterVar.a(etdxVar.c).matcher(str);
        String str3 = etdxVar.f;
        int i3 = 3;
        if (i2 != 3) {
            strReplaceAll = matcher.replaceAll(str2);
            i3 = i2;
        } else if (str3.length() > 0) {
            strReplaceAll = matcher.replaceAll(p.matcher(str2).replaceFirst(str3));
        } else {
            i2 = 3;
            strReplaceAll = matcher.replaceAll(str2);
            i3 = i2;
        }
        if (i3 != 4) {
            return strReplaceAll;
        }
        Matcher matcher2 = i.matcher(strReplaceAll);
        if (matcher2.lookingAt()) {
            strReplaceAll = matcher2.replaceFirst("");
        }
        return matcher2.reset(strReplaceAll).replaceAll("-");
    }

    final void C(StringBuilder sb, etee eteeVar, StringBuilder sb2) {
        int length = sb.length();
        String str = eteeVar.s;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.u.a(str).matcher(sb);
        if (matcher.lookingAt()) {
            etei eteiVar = eteeVar.c;
            if (eteiVar == null) {
                eteiVar = etei.a;
            }
            int iA = eten.a(sb, eteiVar);
            int iGroupCount = matcher.groupCount();
            String str2 = eteeVar.t;
            if (str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (iA != 1 || eten.a(sb.substring(matcher.end()), eteiVar) == 1) {
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
            if (iA != 1 || eten.a(sb3.toString(), eteiVar) == 1) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final int a(etdn etdnVar) {
        etee eteeVarF = f(etdnVar);
        if (eteeVarF != null) {
            return eteeVarF.o;
        }
        throw new IllegalArgumentException("Invalid region code: ".concat(String.valueOf(String.valueOf(etdnVar))));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int b(java.lang.CharSequence r9, defpackage.etee r10, java.lang.StringBuilder r11, boolean r12, defpackage.etfm r13) throws java.lang.NumberFormatException, defpackage.etdy {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etek.b(java.lang.CharSequence, etee, java.lang.StringBuilder, boolean, etfm):int");
    }

    public final etdn c(int i2) {
        List list = (List) this.s.get(Integer.valueOf(i2));
        return list == null ? etdn.ZZ : (etdn) list.get(0);
    }

    public final etdn d(etfp etfpVar) {
        int i2 = etfpVar.c;
        List<etdn> list = (List) this.s.get(Integer.valueOf(i2));
        if (list == null) {
            a.logp(Level.INFO, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getRegionCodeForNumber", a.e(i2, "Missing/invalid country_code (", ")"));
            return null;
        }
        if (list.size() == 1) {
            return (etdn) list.get(0);
        }
        String strK = k(etfpVar);
        for (etdn etdnVar : list) {
            etee eteeVarF = f(etdnVar);
            if ((eteeVarF.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
                if (this.u.a(eteeVarF.x).matcher(strK).lookingAt()) {
                    return etdnVar;
                }
            } else if (v(strK, eteeVarF) != 12) {
                return etdnVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final etdx e(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            etdx etdxVar = (etdx) it.next();
            int size = etdxVar.e.size();
            if (size != 0) {
                if (!this.u.a((String) etdxVar.e.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.u.a(etdxVar.c).matcher(str).matches()) {
                return etdxVar;
            }
        }
        return null;
    }

    public final etee f(etdn etdnVar) {
        if (!r(etdnVar)) {
            return null;
        }
        etfi etfiVar = this.x;
        ejwl.a(eteo.a(etdnVar));
        etee eteeVarB = ((etfb) etfiVar.a.a(etfiVar.b.a(etdnVar))).b.b(etdnVar);
        J(eteeVarB, "Missing metadata for region code ".concat(String.valueOf(String.valueOf(etdnVar))));
        return eteeVarB;
    }

    public final etee g(int i2, etdn etdnVar) {
        if (!g.equals(etdnVar)) {
            return f(etdnVar);
        }
        Set set = this.w;
        Integer numValueOf = Integer.valueOf(i2);
        if (!set.contains(numValueOf)) {
            return null;
        }
        etfi etfiVar = this.x;
        etdn etdnVar2 = eteo.a;
        List list = (List) etdt.a.get(numValueOf);
        boolean z = false;
        if (list != null && !list.contains(eteo.a)) {
            z = true;
        }
        ejwl.a(!z);
        etee eteeVarB = ((etfb) etfiVar.a.a(etfiVar.b.a(numValueOf))).a.b(numValueOf);
        J(eteeVarB, a.g(i2, "Missing metadata for country code "));
        return eteeVarB;
    }

    public final etfp i(CharSequence charSequence, etdn etdnVar) {
        etdz etdzVarC = etea.c();
        ((etdp) etdzVarC).a = etdnVar;
        return j(charSequence, etdzVarC.a());
    }

    public final etfp j(CharSequence charSequence, etea eteaVar) {
        etfm etfmVar = (etfm) etfp.a.createBuilder();
        etdq etdqVar = (etdq) eteaVar;
        m(charSequence, etdqVar.a, etdqVar.b, true, etfmVar);
        return (etfp) etfmVar.build();
    }

    public final String k(etfp etfpVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (etfpVar.f && (i2 = etfpVar.g) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(etfpVar.d);
        return sb.toString();
    }

    public final String l(StringBuilder sb) {
        Matcher matcher = n.matcher(sb);
        if (!matcher.find() || !s(sb.substring(0, matcher.start()))) {
            return "";
        }
        int iGroupCount = matcher.groupCount();
        for (int i2 = 1; i2 <= iGroupCount; i2++) {
            if (matcher.group(i2) != null) {
                String strGroup = matcher.group(i2);
                sb.delete(matcher.start(), sb.length());
                return strGroup;
            }
        }
        return "";
    }

    public final void m(CharSequence charSequence, etdn etdnVar, boolean z, boolean z2, etfm etfmVar) {
        String strSubstring;
        int i2;
        StringBuilder sb;
        etek etekVar;
        etfm etfmVar2;
        int iB;
        if (charSequence == null) {
            throw new etdy(2, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new etdy(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
        String string = charSequence.toString();
        etec etecVar = this.r;
        int iIndexOf = string.indexOf(";phone-context=");
        CharSequence charSequenceSubSequence = "";
        etdr etdrVar = null;
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i3 = iIndexOf + 15;
            if (i3 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i3);
                strSubstring = iIndexOf2 < 0 ? string.substring(i3) : string.substring(i3, iIndexOf2);
            }
        }
        int i4 = 1;
        if (strSubstring == null) {
            i2 = 5;
        } else {
            if (strSubstring.isEmpty() || !(etds.f.matcher(strSubstring).matches() || etds.k.matcher(strSubstring).matches())) {
                throw new etdy(2, "The phone-context value is invalid.");
            }
            if (strSubstring.charAt(0) != '+') {
                etdrVar = new etdr(strSubstring, null);
                i2 = 5;
            } else {
                String strA = etej.a(strSubstring.substring(1));
                if (strA.isEmpty()) {
                    i2 = 5;
                } else {
                    i2 = 5;
                    if (strA.length() <= 3) {
                        int i5 = Integer.parseInt(strA);
                        Set set = etecVar.a;
                        Integer numValueOf = Integer.valueOf(i5);
                        if (set.contains(numValueOf)) {
                            etdrVar = new etdr(strSubstring, numValueOf);
                        }
                    }
                }
                etdrVar = new etdr(strSubstring, null);
            }
        }
        if (etdrVar == null) {
            Matcher matcher = k.matcher(string);
            if (matcher.find()) {
                CharSequence charSequenceSubSequence2 = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = f.matcher(charSequenceSubSequence2);
                if (matcher2.find()) {
                    charSequenceSubSequence2 = charSequenceSubSequence2.subSequence(0, matcher2.start());
                }
                charSequenceSubSequence = charSequenceSubSequence2;
                Matcher matcher3 = e.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            }
            sb2.append(charSequenceSubSequence);
            int iIndexOf3 = sb2.indexOf(";isub=");
            if (iIndexOf3 >= 0) {
                sb2.delete(iIndexOf3, sb2.length());
            }
        } else {
            int iIndexOf4 = string.indexOf("tel:");
            int i6 = iIndexOf4 >= 0 ? iIndexOf4 + 4 : 0;
            int iIndexOf5 = string.indexOf(";", i6);
            if (iIndexOf5 < 0) {
                throw new etdy(2, "The string supplied does not form a valid RFC3966 number.");
            }
            String strSubstring2 = string.substring(i6, iIndexOf5);
            String str = etdrVar.a;
            if (str.charAt(0) == '+') {
                Integer num = etdrVar.b;
                if (num == null) {
                    strSubstring2 = str.concat(String.valueOf(strSubstring2));
                } else {
                    etee eteeVarG = g(num.intValue(), c(num.intValue()));
                    if (eteeVarG == null) {
                        strSubstring2 = str.concat(String.valueOf(strSubstring2));
                    } else {
                        StringBuilder sb3 = new StringBuilder(strSubstring2);
                        C(sb3, eteeVarG, new StringBuilder());
                        strSubstring2 = "+" + num.toString() + sb3.toString();
                    }
                }
            }
            sb2.append(strSubstring2);
            int iIndexOf6 = string.indexOf(";ext=");
            if (iIndexOf6 >= 0) {
                int i7 = iIndexOf6 + 5;
                int iIndexOf7 = string.indexOf(";", i7);
                if (iIndexOf7 < 0) {
                    iIndexOf7 = string.length();
                }
                sb2.append(" ext. ");
                sb2.append((CharSequence) string, i7, iIndexOf7);
            }
        }
        if (!s(sb2)) {
            throw new etdy(2, "The string supplied did not seem to be a phone number.");
        }
        if (z2 && !r(etdnVar) && (sb2.length() == 0 || !d.matcher(sb2).lookingAt())) {
            throw new etdy(1, "Missing or invalid default region.");
        }
        if (z) {
            etfmVar.copyOnWrite();
            etfp etfpVar = (etfp) etfmVar.instance;
            etfp etfpVar2 = etfp.a;
            string.getClass();
            etfpVar.b |= 32;
            etfpVar.h = string;
        }
        String strL = l(sb2);
        if (strL.length() > 0) {
            etfmVar.copyOnWrite();
            etfp etfpVar3 = (etfp) etfmVar.instance;
            etfp etfpVar4 = etfp.a;
            strL.getClass();
            etfpVar3.b |= 4;
            etfpVar3.e = strL;
        }
        etee eteeVarF = f(etdnVar);
        StringBuilder sb4 = new StringBuilder();
        try {
            iB = b(sb2, eteeVarF, sb4, z, etfmVar);
            sb = sb2;
            etekVar = this;
            etfmVar2 = etfmVar;
        } catch (etdy e2) {
            sb = sb2;
            Matcher matcher4 = d.matcher(sb);
            int i8 = e2.a;
            if (i8 != 1) {
                i4 = i8;
            } else if (matcher4.lookingAt()) {
                String strSubstring3 = sb.substring(matcher4.end());
                etekVar = this;
                etfmVar2 = etfmVar;
                iB = etekVar.b(strSubstring3, eteeVarF, sb4, z, etfmVar2);
                if (iB == 0) {
                    throw new etdy(1, "Could not interpret numbers after plus-sign.");
                }
            }
            throw new etdy(i4, e2.getMessage());
        }
        if (iB != 0) {
            etdn etdnVarC = etekVar.c(iB);
            if (!etdnVarC.equals(etdnVar)) {
                eteeVarF = etekVar.g(iB, etdnVarC);
            }
        } else {
            D(sb);
            sb4.append((CharSequence) sb);
            if (etdnVar != null) {
                int i9 = eteeVarF.o;
                etfmVar2.copyOnWrite();
                etfp etfpVar5 = (etfp) etfmVar2.instance;
                etfp etfpVar6 = etfp.a;
                etfpVar5.b |= 1;
                etfpVar5.c = i9;
            } else if (z) {
                etfmVar2.copyOnWrite();
                etfp etfpVar7 = (etfp) etfmVar2.instance;
                etfp etfpVar8 = etfp.a;
                etfpVar7.b &= -65;
                etfpVar7.i = 0;
            }
        }
        if (sb4.length() < 2) {
            throw new etdy(4, "The string supplied is too short to be a phone number.");
        }
        if (eteeVarF != null) {
            StringBuilder sb5 = new StringBuilder();
            StringBuilder sb6 = new StringBuilder(sb4);
            etekVar.C(sb6, eteeVarF, sb5);
            int iM = etekVar.M(sb6, eteeVarF);
            if (iM != 4 && iM != 2 && iM != i2) {
                if (z && sb5.length() > 0) {
                    String string2 = sb5.toString();
                    etfmVar2.copyOnWrite();
                    etfp etfpVar9 = (etfp) etfmVar2.instance;
                    etfp etfpVar10 = etfp.a;
                    etfpVar9.b |= 128;
                    etfpVar9.j = string2;
                }
                sb4 = sb6;
            }
        }
        int length = sb4.length();
        if (length < 2) {
            throw new etdy(4, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new etdy(5, "The string supplied is too long to be a phone number.");
        }
        if (sb4.length() > 1 && sb4.charAt(0) == '0') {
            etfmVar2.copyOnWrite();
            etfp.a((etfp) etfmVar2.instance);
            int i10 = 1;
            while (i10 < sb4.length() - 1 && sb4.charAt(i10) == '0') {
                i10++;
            }
            if (i10 != 1) {
                etfmVar2.copyOnWrite();
                etfp etfpVar11 = (etfp) etfmVar2.instance;
                etfpVar11.b |= 16;
                etfpVar11.g = i10;
            }
        }
        long j2 = Long.parseLong(sb4.toString());
        etfmVar2.copyOnWrite();
        etfp etfpVar12 = (etfp) etfmVar2.instance;
        etfp etfpVar13 = etfp.a;
        etfpVar12.b |= 2;
        etfpVar12.d = j2;
    }

    public final boolean o(int i2) {
        return this.s.containsKey(Integer.valueOf(i2));
    }

    public final boolean p(etdn etdnVar) {
        return this.t.contains(etdnVar);
    }

    public final boolean q(etfp etfpVar) {
        int iW = w(etfpVar);
        return iW == 1 || iW == 2;
    }

    public final boolean r(etdn etdnVar) {
        return etdnVar != null && this.v.contains(etdnVar);
    }

    public final int t(etfp etfpVar, etfp etfpVar2) {
        etfm etfmVarG = G(etfpVar);
        etfp etfpVar3 = (etfp) etfmVarG.build();
        etfp etfpVar4 = (etfp) G(etfpVar2).build();
        if ((etfpVar3.b & 4) != 0 && (etfpVar4.b & 4) != 0 && !etfpVar3.e.equals(etfpVar4.e)) {
            return 2;
        }
        int i2 = etfpVar3.c;
        int i3 = etfpVar4.c;
        if (i2 != 0 && i3 != 0) {
            if (etfpVar3.equals(etfpVar4)) {
                return 5;
            }
            return (i2 == i3 && O(etfpVar3, etfpVar4)) ? 3 : 2;
        }
        etfmVarG.copyOnWrite();
        etfp etfpVar5 = (etfp) etfmVarG.instance;
        etfpVar5.b |= 1;
        etfpVar5.c = i3;
        etfp etfpVar6 = (etfp) etfmVarG.build();
        if (etfpVar6.equals(etfpVar4)) {
            return 4;
        }
        return O(etfpVar6, etfpVar4) ? 3 : 2;
    }

    public final int u(etfp etfpVar, CharSequence charSequence) {
        try {
            return t(etfpVar, i(charSequence, etdn.ZZ));
        } catch (etdy e2) {
            if (e2.a == 1) {
                etdn etdnVarC = c(etfpVar.c);
                try {
                    if (etdnVarC.equals(etdn.ZZ)) {
                        etfm etfmVar = (etfm) etfp.a.createBuilder();
                        try {
                            m(charSequence, null, false, false, etfmVar);
                            return t(etfpVar, (etfp) etfmVar.build());
                        } catch (etdy unused) {
                            return 1;
                        }
                    }
                    int iT = t(etfpVar, i(charSequence, etdnVarC));
                    if (iT == 5) {
                        return 4;
                    }
                    return iT;
                } catch (etdy unused2) {
                    return 1;
                }
            }
            return 1;
        }
    }

    public final int v(String str, etee eteeVar) {
        etei eteiVar = eteeVar.c;
        if (eteiVar == null) {
            eteiVar = etei.a;
        }
        if (!F(str, eteiVar)) {
            return 12;
        }
        etei eteiVar2 = eteeVar.g;
        if (eteiVar2 == null) {
            eteiVar2 = etei.a;
        }
        if (F(str, eteiVar2)) {
            return 5;
        }
        etei eteiVar3 = eteeVar.f;
        if (eteiVar3 == null) {
            eteiVar3 = etei.a;
        }
        if (F(str, eteiVar3)) {
            return 4;
        }
        etei eteiVar4 = eteeVar.h;
        if (eteiVar4 == null) {
            eteiVar4 = etei.a;
        }
        if (F(str, eteiVar4)) {
            return 6;
        }
        etei eteiVar5 = eteeVar.j;
        if (eteiVar5 == null) {
            eteiVar5 = etei.a;
        }
        if (F(str, eteiVar5)) {
            return 7;
        }
        etei eteiVar6 = eteeVar.i;
        if (eteiVar6 == null) {
            eteiVar6 = etei.a;
        }
        if (F(str, eteiVar6)) {
            return 8;
        }
        etei eteiVar7 = eteeVar.k;
        if (eteiVar7 == null) {
            eteiVar7 = etei.a;
        }
        if (F(str, eteiVar7)) {
            return 9;
        }
        etei eteiVar8 = eteeVar.l;
        if (eteiVar8 == null) {
            eteiVar8 = etei.a;
        }
        if (F(str, eteiVar8)) {
            return 10;
        }
        etei eteiVar9 = eteeVar.m;
        if (eteiVar9 == null) {
            eteiVar9 = etei.a;
        }
        if (F(str, eteiVar9)) {
            return 11;
        }
        etei eteiVar10 = eteeVar.d;
        if (eteiVar10 == null) {
            eteiVar10 = etei.a;
        }
        if (F(str, eteiVar10)) {
            if (eteeVar.u) {
                return 3;
            }
            etei eteiVar11 = eteeVar.e;
            if (eteiVar11 == null) {
                eteiVar11 = etei.a;
            }
            return F(str, eteiVar11) ? 3 : 1;
        }
        if (!eteeVar.u) {
            etei eteiVar12 = eteeVar.e;
            if (eteiVar12 == null) {
                eteiVar12 = etei.a;
            }
            if (F(str, eteiVar12)) {
                return 2;
            }
        }
        return 12;
    }

    public final int w(etfp etfpVar) {
        String strK = k(etfpVar);
        int i2 = etfpVar.c;
        if (o(i2)) {
            return N(strK, g(i2, c(i2)), 12);
        }
        return 3;
    }

    public final String x(etfp etfpVar, int i2) {
        if (etfpVar.d == 0) {
            String str = etfpVar.h;
            if (str.length() > 0 || (etfpVar.b & 1) == 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i3 = etfpVar.c;
        String strK = k(etfpVar);
        if (i2 == 1) {
            sb.append(strK);
            A(i3, 1, sb);
        } else if (o(i3)) {
            etee eteeVarG = g(i3, c(i3));
            sb.append(y(strK, eteeVarG, i2));
            z(etfpVar, eteeVarG, i2, sb);
            A(i3, i2, sb);
        } else {
            sb.append(strK);
        }
        return sb.toString();
    }

    public final String y(String str, etee eteeVar, int i2) {
        etdx etdxVarE = e((eteeVar.w.isEmpty() || i2 == 3) ? eteeVar.v : eteeVar.w, str);
        return etdxVarE == null ? str : B(str, etdxVarE, i2);
    }

    public final void z(etfp etfpVar, etee eteeVar, int i2, StringBuilder sb) {
        if ((etfpVar.b & 4) == 0 || etfpVar.e.length() <= 0) {
            return;
        }
        if (i2 == 4) {
            sb.append(";ext=");
            sb.append(etfpVar.e);
        } else if ((eteeVar.b & 4194304) != 0) {
            sb.append(eteeVar.r);
            sb.append(etfpVar.e);
        } else {
            sb.append(" ext. ");
            sb.append(etfpVar.e);
        }
    }
}
