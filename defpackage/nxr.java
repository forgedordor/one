package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxr {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.text.SpannedString a(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxr.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static nxl b(String str, Matcher matcher, mfr mfrVar, List list) {
        nxq nxqVar = new nxq();
        try {
            String strGroup = matcher.group(1);
            mee.f(strGroup);
            nxqVar.a = nxt.b(strGroup);
            String strGroup2 = matcher.group(2);
            mee.f(strGroup2);
            nxqVar.b = nxt.b(strGroup2);
            String strGroup3 = matcher.group(3);
            mee.f(strGroup3);
            c(strGroup3, nxqVar);
            StringBuilder sb = new StringBuilder();
            String strU = mfrVar.u();
            while (!TextUtils.isEmpty(strU)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strU.trim());
                strU = mfrVar.u();
            }
            nxqVar.c = a(str, sb.toString(), list);
            return new nxl(nxqVar.a().a(), nxqVar.a, nxqVar.b);
        } catch (IllegalArgumentException unused) {
            mff.f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void c(String str, nxq nxqVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            mee.f(strGroup);
            int i2 = 2;
            String strGroup2 = matcher.group(2);
            mee.f(strGroup2);
            try {
                char c2 = 65535;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            i2 = 0;
                        } else if (c2 == 1 || c2 == 2) {
                            i2 = 1;
                        } else if (c2 != 3) {
                            mff.f("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        nxqVar.g = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        nxqVar.e = nxt.a(strGroup2);
                        nxqVar.f = 0;
                    } else {
                        nxqVar.e = Integer.parseInt(strGroup2);
                        nxqVar.f = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 == 1) {
                            i = 4;
                        } else if (c2 == 2 || c2 == 3) {
                            i = 2;
                        } else if (c2 != 4) {
                            i = 5;
                            if (c2 != 5) {
                                mff.f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                            }
                        } else {
                            i = 3;
                        }
                    }
                    nxqVar.d = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0 || c2 == 1) {
                            i = 0;
                        } else if (c2 != 2 && c2 != 3) {
                            if (c2 == 4 || c2 == 5) {
                                i = 2;
                            } else {
                                mff.f("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        nxqVar.i = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    nxqVar.h = nxt.a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    nxqVar.j = nxt.a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            c2 = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        c2 = 1;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            mff.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    nxqVar.k = i;
                } else {
                    mff.f("WebvttCueParser", a.n(strGroup2, strGroup, "Unknown cue setting ", ":"));
                }
            } catch (NumberFormatException unused) {
                mff.f("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    private static int d(List list, String str, nxo nxoVar) {
        List listE = e(list, str, nxoVar);
        for (int i = 0; i < listE.size(); i++) {
            int i2 = ((nxp) listE.get(i)).b.o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List e(java.util.List r10, java.lang.String r11, defpackage.nxo r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r10.size()
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r10.get(r2)
            nxk r3 = (defpackage.nxk) r3
            java.lang.String r4 = r12.a
            java.util.Set r5 = r12.d
            java.lang.String r6 = r12.c
            java.lang.String r7 = r3.a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            java.lang.String r7 = r3.b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            java.util.Set r7 = r3.c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            java.lang.String r7 = r3.d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L41
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L6c
            r4 = 1
            goto L6d
        L41:
            java.lang.String r7 = r3.a
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = defpackage.nxk.b(r1, r7, r11, r8)
            java.lang.String r8 = r3.b
            r9 = 2
            int r4 = defpackage.nxk.b(r7, r8, r4, r9)
            java.lang.String r7 = r3.d
            r8 = 4
            int r4 = defpackage.nxk.b(r4, r7, r6, r8)
            r6 = -1
            if (r4 == r6) goto L6c
            java.util.Set r6 = r3.c
            boolean r5 = r5.containsAll(r6)
            if (r5 != 0) goto L63
            goto L6c
        L63:
            java.util.Set r5 = r3.c
            int r5 = r5.size()
            int r5 = r5 * r8
            int r4 = r4 + r5
            goto L6d
        L6c:
            r4 = r1
        L6d:
            if (r4 <= 0) goto L77
            nxp r5 = new nxp
            r5.<init>(r4, r3)
            r0.add(r5)
        L77:
            int r2 = r2 + 1
            goto L7
        L7a:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxr.e(java.util.List, java.lang.String, nxo):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(java.lang.String r17, defpackage.nxo r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxr.f(java.lang.String, nxo, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }
}
