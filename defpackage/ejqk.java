package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqk {
    public static final Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(Locale.KOREAN, new ejqj());
        ejqm ejqmVar = new ejqm();
        map.put(Locale.FRENCH, ejqmVar);
        ejqmVar.b("|de Les|", "des");
        ejqmVar.b("|de les|", "des");
        ejqmVar.b("|De Les|", "Des");
        ejqmVar.b("|De les|", "Des");
        ejqmVar.b("|de Le|", "du");
        ejqmVar.b("|de le|", "du");
        ejqmVar.b("|De Le|", "Du");
        ejqmVar.b("|De le|", "Du");
        ejqmVar.b("|à Les|", "aux");
        ejqmVar.b("|à les|", "aux");
        ejqmVar.b("|À Les|", "Aux");
        ejqmVar.b("|À les|", "Aux");
        ejqmVar.b("|à Le|", "au");
        ejqmVar.b("|à le|", "au");
        ejqmVar.b("|À Le|", "Au");
        ejqmVar.b("|À le|", "Au");
        String[] strArr = {"de", "la", "le"};
        char[] charArray = "aeéèêioôy".toCharArray();
        int length = charArray.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                break;
            }
            char c = charArray[i2];
            int i4 = i;
            while (i4 < 3) {
                String str = strArr[i4];
                char cCharAt = str.charAt(i);
                Character chValueOf = Character.valueOf(c);
                Object[] objArr = new Object[2];
                objArr[i] = str;
                objArr[i3] = chValueOf;
                String str2 = String.format("|%s %c", objArr);
                Character chValueOf2 = Character.valueOf(cCharAt);
                int i5 = i;
                Object[] objArr2 = new Object[2];
                objArr2[i5] = chValueOf2;
                objArr2[i3] = chValueOf;
                int i6 = i3;
                ejqmVar.b(str2, String.format("%c'%c", objArr2));
                Character chValueOf3 = Character.valueOf(Character.toTitleCase(c));
                Object[] objArr3 = new Object[2];
                objArr3[i5] = str;
                objArr3[i6] = chValueOf3;
                String str3 = String.format("|%s %c", objArr3);
                Character chValueOf4 = Character.valueOf(Character.toTitleCase(c));
                String[] strArr2 = strArr;
                Object[] objArr4 = new Object[2];
                objArr4[i5] = chValueOf2;
                objArr4[i6] = chValueOf4;
                ejqmVar.b(str3, String.format("%c'%c", objArr4));
                Character chValueOf5 = Character.valueOf(Character.toTitleCase(cCharAt));
                String strSubstring = str.substring(i6);
                Object[] objArr5 = new Object[2];
                objArr5[i5] = chValueOf5;
                objArr5[i6] = strSubstring;
                String str4 = String.format("%c%s", objArr5);
                Object[] objArr6 = new Object[2];
                objArr6[i5] = str4;
                objArr6[i6] = chValueOf;
                String str5 = String.format("|%s %c", objArr6);
                Object[] objArr7 = new Object[2];
                objArr7[i5] = chValueOf5;
                objArr7[i6] = chValueOf;
                ejqmVar.b(str5, String.format("%c'%c", objArr7));
                Character chValueOf6 = Character.valueOf(Character.toTitleCase(c));
                Object[] objArr8 = new Object[2];
                objArr8[i5] = str4;
                objArr8[i6] = chValueOf6;
                String str6 = String.format("|%s %c", objArr8);
                Character chValueOf7 = Character.valueOf(Character.toTitleCase(c));
                Object[] objArr9 = new Object[2];
                objArr9[i5] = chValueOf5;
                objArr9[i6] = chValueOf7;
                ejqmVar.b(str6, String.format("%c'%c", objArr9));
                i4++;
                i = i5;
                strArr = strArr2;
                i3 = 1;
            }
            i2++;
        }
        int i7 = i;
        ejqmVar.b(". la|", ". La");
        ejqmVar.b("! la|", "! La");
        ejqmVar.b("? la|", "? La");
        ejqmVar.b(". le|", ". Le");
        ejqmVar.b("! le|", "! Le");
        ejqmVar.b("? le|", "? Le");
        ejqmVar.b(". les|", ". Les");
        ejqmVar.b("! les|", "! Les");
        ejqmVar.b("? les|", "? Les");
        ejqm ejqmVar2 = new ejqm();
        Locale locale = new Locale("be");
        Map map2 = a;
        map2.put(locale, ejqmVar2);
        ejqmVar2.b("а у", "а ў");
        ejqmVar2.b("э у", "э ў");
        ejqmVar2.b("о у", "о ў");
        ejqmVar2.b("у у", "у ў");
        ejqmVar2.b("і у", "і ў");
        ejqmVar2.b("я у", "я ў");
        ejqmVar2.b("е у", "е ў");
        ejqmVar2.b("ё у", "ё ў");
        ejqmVar2.b("ю у", "ю ў");
        ejqmVar2.b("ы у", "ы ў");
        ejqm ejqmVar3 = new ejqm();
        map2.put(Locale.ITALIAN, ejqmVar3);
        ejqmVar3.b("|a a", "ad a");
        ejqmVar3.b("|a A", "ad A");
        ejqmVar3.b("|e e", "ed e");
        ejqmVar3.b("|e E", "ed E");
        ejqmVar3.b("|o o", "od o");
        ejqmVar3.b("|o O", "od O");
        String[] strArr3 = {"a il:al", "a lo:allo", "a la:alla", "a l':all'", "a i:ai", "a gli:agli", "a le:alle", "con il:col", "con i:coi", "da il:dal", "da lo:dallo", "da la:dalla", "da l':dall'", "da i:dai", "da gli:dagli", "da le:dalle", "di il:del", "di lo:dello", "di la:della", "di l':dell'", "di i:del", "di gli:degli", "di le:delle", "in il:nel", "in lo:nello", "in la:nella", "in l':nell'", "in i:nei", "in gli:negli", "in le:nelle", "su il:sul", "su lo:sullo", "su la:sulla", "su l':sull'", "su i:sui", "su gli:sugli", "su le:sulle"};
        while (i < 37) {
            String[] strArrSplit = strArr3[i].split(":");
            Object[] objArr10 = new Object[1];
            objArr10[i7] = strArrSplit[i7];
            ejqmVar3.b(String.format("|%s|", objArr10), strArrSplit[1]);
            i++;
        }
        ejqmVar3.b("|il gn", "lo gn");
        ejqmVar3.b("|il pn", "lo pn");
        ejqmVar3.b("|il ps", "lo ps");
        ejqmVar3.b("|il pt", "lo pt");
        char[] charArray2 = "bcdfghjklmnpqrstvwxyz".toCharArray();
        int length2 = charArray2.length;
        for (int i8 = i7; i8 < length2; i8++) {
            Character chValueOf8 = Character.valueOf(charArray2[i8]);
            Object[] objArr11 = new Object[1];
            objArr11[i7] = chValueOf8;
            String str7 = String.format("|il s%c", objArr11);
            Object[] objArr12 = new Object[1];
            objArr12[i7] = chValueOf8;
            ejqmVar3.b(str7, String.format("lo s%c", objArr12));
        }
        ejqmVar3.b("|il x", "lo x");
        ejqmVar3.b("|il z", "lo z");
        char[] charArray3 = "éóíúàèìòùîaeiou".toCharArray();
        int length3 = charArray3.length;
        for (int i9 = i7; i9 < length3; i9++) {
            Character chValueOf9 = Character.valueOf(charArray3[i9]);
            Object[] objArr13 = new Object[1];
            objArr13[i7] = chValueOf9;
            String str8 = String.format("|il %c", objArr13);
            Object[] objArr14 = new Object[1];
            objArr14[i7] = chValueOf9;
            ejqmVar3.b(str8, String.format("l'%c", objArr14));
            Object[] objArr15 = new Object[1];
            objArr15[i7] = chValueOf9;
            String str9 = String.format("|il h%c", objArr15);
            Object[] objArr16 = new Object[1];
            objArr16[i7] = chValueOf9;
            ejqmVar3.b(str9, String.format("l'h%c", objArr16));
            Object[] objArr17 = new Object[1];
            objArr17[i7] = chValueOf9;
            String str10 = String.format("|la %c", objArr17);
            Object[] objArr18 = new Object[1];
            objArr18[i7] = chValueOf9;
            ejqmVar3.b(str10, String.format("l'%c", objArr18));
            Object[] objArr19 = new Object[1];
            objArr19[i7] = chValueOf9;
            String str11 = String.format("|la h%c", objArr19);
            Object[] objArr20 = new Object[1];
            objArr20[i7] = chValueOf9;
            ejqmVar3.b(str11, String.format("l'h%c", objArr20));
            Object[] objArr21 = new Object[1];
            objArr21[i7] = chValueOf9;
            String str12 = String.format("|i %c", objArr21);
            Object[] objArr22 = new Object[1];
            objArr22[i7] = chValueOf9;
            ejqmVar3.b(str12, String.format("gli %c", objArr22));
            Object[] objArr23 = new Object[1];
            objArr23[i7] = chValueOf9;
            String str13 = String.format("|i h%c", objArr23);
            Object[] objArr24 = new Object[1];
            objArr24[i7] = chValueOf9;
            ejqmVar3.b(str13, String.format("gli h%c", objArr24));
        }
        ejqmVar3.b("|il domenica|", "la domenica");
        ejqm ejqmVar4 = new ejqm();
        Locale locale2 = new Locale("es");
        Map map3 = a;
        map3.put(locale2, ejqmVar4);
        ejqmVar4.b("|a el|", "al");
        ejqmVar4.b("|de el|", "del");
        ejqmVar4.b("|A el|", "Al");
        ejqmVar4.b("|De el|", "Del");
        ejqmVar4.b("|y i", "e i");
        ejqmVar4.b("|y I", "e I");
        ejqmVar4.b("|Y I", "E I");
        ejqmVar4.b("|o o", "u o");
        ejqmVar4.b("|o O", "u O");
        ejqmVar4.b("|O O", "U O");
        ejqm ejqmVar5 = new ejqm();
        Locale locale3 = new Locale("pt");
        map3.put(locale3, ejqmVar5);
        String[] strArr4 = {"em a:na", "de a:da", "a a:à", "pra a:pra", "em as:nas", "de as:das", "a as:às", "por as:pelas", "pra as:pras", "em o:no", "de o:do", "a o:ao", "pra o:pro", "em os:nos", "de os:dos", "a os:aos", "por os:pelos", "pra os:pros", "em este:neste", "em esse:nesse", "de este:deste", "de esse:desse", "em estes:nestes", "em esses:nesses", "de estes:destes", "de esses:desses", "em esta:nesta", "em essa:nessa", "de esta:desta", "de essa:dessa", "em estas:nestas", "em essas:nessas", "de estas:destas", "de essas:dessas", "em isto:nisto", "em isso:nisso", "de isto:disto", "de isso:disso", "em aquele:naquele", "de aquele:daquele", "a aquele:àquele", "em aqueles:naqueles", "de aqueles:daqueles", "a aqueles:àqueles", "em aquela:naquela", "de aquela:daquela", "a aquela:àquela", "em aquelas:naquelas", "de aquelas:daquelas", "a aquelas:àquelas", "em aquilo:naquilo", "de aquilo:daquilo", "a aquilo:àquilo", "em ele:nele", "de ele:dele", "em eles:neles", "de eles:deles", "em ela:nela", "de ela:dela", "em elas:nelas", "de elas:delas", "a onde:aonde", "de aqui:daqui", "de ali:dali", "de ai:dai"};
        for (int i10 = i7; i10 < 65; i10++) {
            String[] strArrSplit2 = strArr4[i10].split(":");
            Object[] objArr25 = new Object[1];
            objArr25[i7] = strArrSplit2[i7];
            ejqmVar5.b(String.format("|%s|", objArr25), strArrSplit2[1]);
            Object[] objArr26 = new Object[1];
            objArr26[i7] = strArrSplit2[i7].toUpperCase(locale3);
            ejqmVar5.b(String.format("|%s|", objArr26), strArrSplit2[1].toUpperCase(locale3));
            Character chValueOf10 = Character.valueOf(Character.toTitleCase(strArrSplit2[i7].charAt(i7)));
            String strSubstring2 = strArrSplit2[i7].substring(1);
            Object[] objArr27 = new Object[2];
            objArr27[i7] = chValueOf10;
            objArr27[1] = strSubstring2;
            String str14 = String.format("|%c%s|", objArr27);
            Character chValueOf11 = Character.valueOf(Character.toTitleCase(strArrSplit2[1].charAt(i7)));
            String strSubstring3 = strArrSplit2[1].substring(1);
            Object[] objArr28 = new Object[2];
            objArr28[i7] = chValueOf11;
            objArr28[1] = strSubstring3;
            ejqmVar5.b(str14, String.format("%c%s", objArr28));
        }
    }

    public static void a(ejqm ejqmVar, StringBuilder sb, String str) {
        if (str.length() == 0) {
            return;
        }
        ejql ejqlVarA = ejqmVar.a(sb, str);
        if (ejqlVarA == null) {
            sb.append(str);
            return;
        }
        String str2 = ejqlVarA.e;
        int iIndexOf = str2.indexOf(32);
        if (iIndexOf != -1) {
            CharSequence charSequenceSubSequence = sb.subSequence(ejqlVarA.a, sb.length());
            sb.setLength(ejqlVarA.c + 1);
            sb.append((CharSequence) str2, 0, iIndexOf);
            sb.append(charSequenceSubSequence);
            sb.append((CharSequence) str, 0, ejqlVarA.b);
            sb.append((CharSequence) str2, iIndexOf + 1, str2.length());
        } else {
            sb.replace(ejqlVarA.c + 1, sb.length(), str2);
        }
        sb.append((CharSequence) str, ejqlVarA.d, str.length());
    }
}
