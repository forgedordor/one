package com.android.vcard;

import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import defpackage.a;
import defpackage.ejuf;
import defpackage.qyb;
import defpackage.qyj;
import defpackage.qyk;
import defpackage.qyq;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardUtils {
    private static final String LOG_TAG = "vCard";
    private static final int[] sEscapeIndicatorsV30;
    private static final int[] sEscapeIndicatorsV40;
    private static final Map<Integer, String> sKnownImPropNameMap_ItoS;
    private static final Map<String, Integer> sKnownPhoneTypeMap_StoI;
    private static final Map<Integer, String> sKnownPhoneTypesMap_ItoS;
    private static final Set<String> sMobilePhoneLabelSet;
    private static final Set<String> sPhoneTypesUnknownToContactsSet;
    private static final Set<Character> sUnAcceptableAsciiInV21WordSet;

    /* compiled from: PG */
    public static class PhoneNumberUtilsPort {
        public static String formatNumber(String str, int i) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            PhoneNumberUtils.formatNumber(spannableStringBuilder, i);
            return spannableStringBuilder.toString();
        }
    }

    /* compiled from: PG */
    public static class TextUtilsPort {
        public static boolean isPrintableAscii(char c) {
            return (c >= ' ' && c <= '~') || c == '\r' || c == '\n';
        }

        public static boolean isPrintableAsciiOnly(CharSequence charSequence) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (!isPrintableAscii(charSequence.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    static {
        HashMap map = new HashMap();
        sKnownPhoneTypesMap_ItoS = map;
        HashMap map2 = new HashMap();
        sKnownPhoneTypeMap_StoI = map2;
        map.put(9, VCardConstants.PARAM_TYPE_CAR);
        map2.put(VCardConstants.PARAM_TYPE_CAR, 9);
        map.put(6, VCardConstants.PARAM_TYPE_PAGER);
        map2.put(VCardConstants.PARAM_TYPE_PAGER, 6);
        map.put(11, VCardConstants.PARAM_TYPE_ISDN);
        map2.put(VCardConstants.PARAM_TYPE_ISDN, 11);
        map2.put(VCardConstants.PARAM_TYPE_HOME, 1);
        map2.put(VCardConstants.PARAM_TYPE_WORK, 3);
        map2.put(VCardConstants.PARAM_TYPE_CELL, 2);
        map2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER, 7);
        map2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_CALLBACK, 8);
        map2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_COMPANY_MAIN, 10);
        map2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_RADIO, 14);
        map2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_TTY_TDD, 16);
        map2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_ASSISTANT, 19);
        map2.put(VCardConstants.PARAM_TYPE_VOICE, 7);
        HashSet hashSet = new HashSet();
        sPhoneTypesUnknownToContactsSet = hashSet;
        hashSet.add(VCardConstants.PARAM_TYPE_MODEM);
        hashSet.add(VCardConstants.PARAM_TYPE_MSG);
        hashSet.add(VCardConstants.PARAM_TYPE_BBS);
        hashSet.add(VCardConstants.PARAM_TYPE_VIDEO);
        HashMap map3 = new HashMap();
        sKnownImPropNameMap_ItoS = map3;
        map3.put(0, VCardConstants.PROPERTY_X_AIM);
        map3.put(1, VCardConstants.PROPERTY_X_MSN);
        map3.put(2, VCardConstants.PROPERTY_X_YAHOO);
        map3.put(3, VCardConstants.PROPERTY_X_SKYPE_USERNAME);
        map3.put(5, VCardConstants.PROPERTY_X_GOOGLE_TALK);
        map3.put(6, VCardConstants.PROPERTY_X_ICQ);
        map3.put(7, VCardConstants.PROPERTY_X_JABBER);
        map3.put(4, VCardConstants.PROPERTY_X_QQ);
        map3.put(8, VCardConstants.PROPERTY_X_NETMEETING);
        sMobilePhoneLabelSet = new HashSet(Arrays.asList("MOBILE", "携帯電話", "携帯", "ケイタイ", "ｹｲﾀｲ"));
        sUnAcceptableAsciiInV21WordSet = new HashSet(Arrays.asList('[', ']', '=', ':', '.', ',', ' '));
        sEscapeIndicatorsV30 = new int[]{58, 59, 44, 32};
        sEscapeIndicatorsV40 = new int[]{59, 58};
    }

    private VCardUtils() {
    }

    public static boolean appearsLikeAndroidVCardQuotedPrintable(String str) {
        int length = str.length() % 3;
        if (str.length() < 2 || !(length == 1 || length == 0)) {
            return false;
        }
        for (int i = 0; i < str.length(); i += 3) {
            if (str.charAt(i) != '=') {
                return false;
            }
        }
        return true;
    }

    public static boolean areAllEmpty(String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> constructListFromValue(java.lang.String r12, int r13) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r12.length()
            r3 = 0
        Lf:
            if (r3 >= r2) goto L8d
            char r4 = r12.charAt(r3)
            r5 = 59
            r6 = 92
            if (r4 != r6) goto L78
            int r4 = r2 + (-1)
            if (r3 >= r4) goto L77
            int r4 = r3 + 1
            char r7 = r12.charAt(r4)
            boolean r8 = com.android.vcard.VCardConfig.isVersion40(r13)
            r9 = 78
            java.lang.String r10 = "\n"
            r11 = 110(0x6e, float:1.54E-43)
            if (r8 == 0) goto L3b
            if (r7 == r11) goto L6c
            if (r7 != r9) goto L36
            goto L6c
        L36:
            java.lang.String r10 = java.lang.String.valueOf(r7)
            goto L6c
        L3b:
            boolean r8 = com.android.vcard.VCardConfig.isVersion30(r13)
            if (r8 == 0) goto L4b
            if (r7 == r11) goto L6c
            if (r7 != r9) goto L46
            goto L6c
        L46:
            java.lang.String r10 = java.lang.String.valueOf(r7)
            goto L6c
        L4b:
            boolean r8 = com.android.vcard.VCardConfig.isVersion21(r13)
            if (r8 != 0) goto L58
            java.lang.String r8 = "vCard"
            java.lang.String r9 = "Unknown vCard type"
            android.util.Log.w(r8, r9)
        L58:
            if (r7 == r6) goto L68
            if (r7 == r5) goto L68
            r5 = 58
            if (r7 == r5) goto L68
            r5 = 44
            if (r7 != r5) goto L66
            r7 = r5
            goto L68
        L66:
            r10 = 0
            goto L6c
        L68:
            java.lang.String r10 = java.lang.String.valueOf(r7)
        L6c:
            if (r10 == 0) goto L73
            r1.append(r10)
            r3 = r4
            goto L8a
        L73:
            r1.append(r6)
            goto L8a
        L77:
            r4 = r6
        L78:
            if (r4 != r5) goto L87
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L8a
        L87:
            r1.append(r4)
        L8a:
            int r3 = r3 + 1
            goto Lf
        L8d:
            java.lang.String r12 = r1.toString()
            r0.add(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardUtils.constructListFromValue(java.lang.String, int):java.util.List");
    }

    public static String constructNameFromElements(int i, String str, String str2, String str3) {
        return constructNameFromElements(i, str, str2, str3, null, null);
    }

    public static boolean containsOnlyAlphaDigitHyphen(Collection<String> collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                for (int iOffsetByCodePoints = 0; iOffsetByCodePoints < length; iOffsetByCodePoints = str.offsetByCodePoints(iOffsetByCodePoints, 1)) {
                    int iCodePointAt = str.codePointAt(iOffsetByCodePoints);
                    if ((iCodePointAt < 97 || iCodePointAt >= 123) && ((iCodePointAt < 65 || iCodePointAt >= 91) && ((iCodePointAt < 48 || iCodePointAt >= 58) && iCodePointAt != 45))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean containsOnlyNonCrLfPrintableAscii(Collection<String> collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                for (int iOffsetByCodePoints = 0; iOffsetByCodePoints < length; iOffsetByCodePoints = str.offsetByCodePoints(iOffsetByCodePoints, 1)) {
                    int iCodePointAt = str.codePointAt(iOffsetByCodePoints);
                    if (iCodePointAt < 32 || iCodePointAt > 126) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean containsOnlyPrintableAscii(Collection<String> collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str) && !TextUtilsPort.isPrintableAsciiOnly(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyWhiteSpaces(Collection<String> collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                for (int iOffsetByCodePoints = 0; iOffsetByCodePoints < length; iOffsetByCodePoints = str.offsetByCodePoints(iOffsetByCodePoints, 1)) {
                    if (!Character.isWhitespace(str.codePointAt(iOffsetByCodePoints))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final String convertStringCharset(String str, String str2, String str3) {
        if (ejuf.e(str2, str3)) {
            return str;
        }
        ByteBuffer byteBufferEncode = Charset.forName(str2).encode(str);
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        try {
            return new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            Log.e("vCard", "Failed to encode: charset=".concat(String.valueOf(str3)));
            return null;
        }
    }

    public static final VCardParser getAppropriateParser(int i) throws qyq {
        if (VCardConfig.isVersion21(i)) {
            return new VCardParser_V21();
        }
        if (VCardConfig.isVersion30(i)) {
            return new VCardParser_V30();
        }
        if (VCardConfig.isVersion40(i)) {
            return new VCardParser_V40();
        }
        throw new qyq("Version is not specified");
    }

    public static int getPhoneNumberFormat(int i) {
        return VCardConfig.isJapaneseDevice(i) ? 2 : 1;
    }

    public static Object getPhoneTypeFromStrings(Collection<String> collection, String str) {
        boolean z;
        String str2 = null;
        int i = -1;
        boolean z2 = false;
        if (collection != null) {
            Iterator<String> it = collection.iterator();
            int iIntValue = -1;
            boolean z3 = false;
            z = false;
            while (it.hasNext()) {
                String next = it.next();
                if (next != null) {
                    String strD = ejuf.d(next);
                    if (strD.equals("PREF")) {
                        z3 = true;
                    } else if (strD.equals(VCardConstants.PARAM_TYPE_FAX)) {
                        z = true;
                    } else {
                        if (strD.startsWith("X-") && iIntValue < 0) {
                            next = next.substring(2);
                        }
                        if (next.length() != 0) {
                            Integer num = sKnownPhoneTypeMap_StoI.get(ejuf.d(next));
                            if (num != null) {
                                String str3 = str == null ? "" : str;
                                int iIntValue2 = num.intValue();
                                int iIndexOf = str3.indexOf("@");
                                if ((iIntValue2 == 6 && iIndexOf > 0 && iIndexOf < str3.length() - 1) || iIntValue < 0 || iIntValue == 0 || iIntValue == 7) {
                                    iIntValue = num.intValue();
                                }
                            } else if (iIntValue < 0) {
                                iIntValue = 0;
                                str2 = next;
                            }
                        }
                    }
                }
            }
            i = iIntValue;
            z2 = z3;
        } else {
            z = false;
        }
        if (i < 0) {
            i = z2 ? 12 : 1;
        }
        if (z) {
            if (i == 1) {
                i = 5;
            } else if (i == 3) {
                i = 4;
            } else if (i == 7) {
                i = 13;
            }
        }
        return i == 0 ? str2 : Integer.valueOf(i);
    }

    public static String getPhoneTypeString(Integer num) {
        return sKnownPhoneTypesMap_ItoS.get(num);
    }

    public static String getPropertyNameForIm(int i) {
        return sKnownImPropNameMap_ItoS.get(Integer.valueOf(i));
    }

    public static String guessImageType(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) {
            return "GIF";
        }
        if (length >= 4 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) {
            return "PNG";
        }
        if (length >= 2 && bArr[0] == -1 && bArr[1] == -40) {
            return "JPEG";
        }
        return null;
    }

    public static boolean isMobilePhoneLabel(String str) {
        return "_AUTO_CELL".equals(str) || sMobilePhoneLabelSet.contains(str);
    }

    public static boolean isV21Word(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int iOffsetByCodePoints = 0;
        while (iOffsetByCodePoints < length) {
            int iCodePointAt = str.codePointAt(iOffsetByCodePoints);
            if (iCodePointAt < 32 || iCodePointAt > 126 || sUnAcceptableAsciiInV21WordSet.contains(Character.valueOf((char) iCodePointAt))) {
                return false;
            }
            iOffsetByCodePoints = str.offsetByCodePoints(iOffsetByCodePoints, 1);
        }
        return true;
    }

    public static boolean isValidInV21ButUnknownToContactsPhoteType(String str) {
        return sPhoneTypesUnknownToContactsSet.contains(str);
    }

    public static String parseQuotedPrintable(String str, boolean z, String str2, String str3) throws UnsupportedEncodingException {
        String[] strArrSplit;
        byte[] bytes;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '=') {
                sb.append(cCharAt);
            } else {
                if (i < length - 1) {
                    int i2 = i + 1;
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 != ' ') {
                        if (cCharAt2 == '\t') {
                            cCharAt2 = '\t';
                        }
                    }
                    sb.append(cCharAt2);
                    i = i2;
                }
                cCharAt = '=';
                sb.append(cCharAt);
            }
            i++;
        }
        String string = sb.toString();
        if (z) {
            strArrSplit = string.split(VCardBuilder.VCARD_END_OF_LINE);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int length2 = string.length();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < length2) {
                char cCharAt3 = string.charAt(i3);
                if (cCharAt3 == '\n') {
                    arrayList.add(sb2.toString());
                    sb2 = new StringBuilder();
                } else if (cCharAt3 == '\r') {
                    arrayList.add(sb2.toString());
                    sb2 = new StringBuilder();
                    if (i3 < length2 - 1) {
                        int i4 = i3 + 1;
                        if (string.charAt(i4) == '\n') {
                            i3 = i4;
                        }
                    }
                } else {
                    sb2.append(cCharAt3);
                }
                i3++;
            }
            String string2 = sb2.toString();
            if (string2.length() > 0) {
                arrayList.add(string2);
            }
            strArrSplit = (String[]) arrayList.toArray(new String[0]);
        }
        StringBuilder sb3 = new StringBuilder();
        for (String strSubstring : strArrSplit) {
            if (strSubstring.endsWith("=")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            sb3.append(strSubstring);
        }
        String string3 = sb3.toString();
        if (TextUtils.isEmpty(string3)) {
            Log.w("vCard", "Given raw string is empty.");
        }
        try {
            bytes = string3.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            Log.w("vCard", "Failed to decode: ".concat(String.valueOf(str2)));
            bytes = string3.getBytes();
        }
        try {
            bytes = qyk.a(bytes);
        } catch (qyj unused2) {
            Log.e("vCard", "DecoderException is thrown.");
        }
        try {
            return new String(bytes, str3);
        } catch (UnsupportedEncodingException unused3) {
            Log.e("vCard", "Failed to encode: charset=".concat(String.valueOf(str3)));
            return new String(bytes);
        }
    }

    public static String[] sortNameElements(int i, String str, String str2, String str3) {
        String[] strArr = new String[3];
        int nameOrderType = VCardConfig.getNameOrderType(i);
        if (nameOrderType == 4) {
            strArr[0] = str2;
            strArr[1] = str3;
            strArr[2] = str;
            return strArr;
        }
        if (nameOrderType != 8) {
            strArr[0] = str3;
            strArr[1] = str2;
            strArr[2] = str;
            return strArr;
        }
        if (containsOnlyPrintableAscii(str) && containsOnlyPrintableAscii(str3)) {
            strArr[0] = str3;
            strArr[1] = str2;
            strArr[2] = str;
            return strArr;
        }
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        return strArr;
    }

    public static String toHalfWidthString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int iOffsetByCodePoints = 0;
        while (iOffsetByCodePoints < length) {
            char cCharAt = str.charAt(iOffsetByCodePoints);
            Map map = qyb.a;
            Character chValueOf = Character.valueOf(cCharAt);
            String str2 = map.containsKey(chValueOf) ? (String) map.get(chValueOf) : null;
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append(cCharAt);
            }
            iOffsetByCodePoints = str.offsetByCodePoints(iOffsetByCodePoints, 1);
        }
        return sb.toString();
    }

    private static String toStringAsParamValue(String str, int[] iArr) {
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        boolean z = false;
        for (int iOffsetByCodePoints = 0; iOffsetByCodePoints < length; iOffsetByCodePoints = str.offsetByCodePoints(iOffsetByCodePoints, 1)) {
            int iCodePointAt = str.codePointAt(iOffsetByCodePoints);
            if (iCodePointAt >= 32 && iCodePointAt != 34) {
                sb.appendCodePoint(iCodePointAt);
                int length2 = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    if (iCodePointAt == iArr[i]) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        }
        String string = sb.toString();
        return (string.isEmpty() || containsOnlyWhiteSpaces(string)) ? "" : z ? a.a(string, "\"", "\"") : string;
    }

    public static String toStringAsV30ParamValue(String str) {
        return toStringAsParamValue(str, sEscapeIndicatorsV30);
    }

    public static String toStringAsV40ParamValue(String str) {
        return toStringAsParamValue(str, sEscapeIndicatorsV40);
    }

    public static String constructNameFromElements(int i, String str, String str2, String str3, String str4, String str5) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        String[] strArrSortNameElements = sortNameElements(i, str, str2, str3);
        if (TextUtils.isEmpty(str4)) {
            z = true;
        } else {
            sb.append(str4);
            z = false;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            String str6 = strArrSortNameElements[i2];
            if (!TextUtils.isEmpty(str6)) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append(str6);
                z = false;
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            if (!z) {
                sb.append(' ');
            }
            sb.append(str5);
        }
        return sb.toString();
    }

    public static boolean containsOnlyPrintableAscii(String... strArr) {
        if (strArr == null) {
            return true;
        }
        return containsOnlyPrintableAscii(Arrays.asList(strArr));
    }

    public static boolean containsOnlyAlphaDigitHyphen(String... strArr) {
        if (strArr == null) {
            return true;
        }
        return containsOnlyAlphaDigitHyphen(Arrays.asList(strArr));
    }

    public static boolean containsOnlyNonCrLfPrintableAscii(String... strArr) {
        if (strArr == null) {
            return true;
        }
        return containsOnlyNonCrLfPrintableAscii(Arrays.asList(strArr));
    }

    public static boolean containsOnlyWhiteSpaces(String... strArr) {
        if (strArr == null) {
            return true;
        }
        return containsOnlyWhiteSpaces(Arrays.asList(strArr));
    }
}
