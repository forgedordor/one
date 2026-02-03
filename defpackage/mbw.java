package defpackage;

import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbw {
    private static final ArrayList a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r7.hashCode()
            r1 = 7
            r2 = 9
            r3 = 5
            r4 = 6
            r5 = 8
            r6 = 0
            switch(r0) {
                case -2123537834: goto L84;
                case -1365340241: goto L7a;
                case -1095064472: goto L70;
                case -53558318: goto L66;
                case 187078296: goto L5c;
                case 187078297: goto L52;
                case 550520934: goto L48;
                case 1504578661: goto L3e;
                case 1504831518: goto L34;
                case 1504891608: goto L28;
                case 1505942594: goto L1d;
                case 1556697186: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L8e
        L11:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 10
            goto L8f
        L1d:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r1
            goto L8f
        L28:
            java.lang.String r0 = "audio/opus"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 11
            goto L8f
        L34:
            java.lang.String r0 = "audio/mpeg"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r6
            goto L8f
        L3e:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 3
            goto L8f
        L48:
            java.lang.String r0 = "audio/vnd.dts.uhd;profile=p2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r2
            goto L8f
        L52:
            java.lang.String r0 = "audio/ac4"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r3
            goto L8f
        L5c:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 2
            goto L8f
        L66:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 1
            goto L8f
        L70:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r4
            goto L8f
        L7a:
            java.lang.String r0 = "audio/vnd.dts.hd;profile=lbr"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r5
            goto L8f
        L84:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 4
            goto L8f
        L8e:
            r7 = -1
        L8f:
            switch(r7) {
                case 0: goto Lb5;
                case 1: goto La6;
                case 2: goto La5;
                case 3: goto La4;
                case 4: goto La1;
                case 5: goto L9e;
                case 6: goto L9d;
                case 7: goto L9c;
                case 8: goto L9c;
                case 9: goto L99;
                case 10: goto L96;
                case 11: goto L93;
                default: goto L92;
            }
        L92:
            return r6
        L93:
            r7 = 20
            return r7
        L96:
            r7 = 14
            return r7
        L99:
            r7 = 30
            return r7
        L9c:
            return r5
        L9d:
            return r1
        L9e:
            r7 = 17
            return r7
        La1:
            r7 = 18
            return r7
        La4:
            return r4
        La5:
            return r3
        La6:
            if (r8 != 0) goto La9
            return r6
        La9:
            mbv r7 = c(r8)
            if (r7 != 0) goto Lb0
            return r6
        Lb0:
            int r7 = r7.a()
            return r7
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbw.a(java.lang.String, java.lang.String):int");
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if (j(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mbu mbuVar = (mbu) arrayList.get(i);
            String str2 = mbuVar.a;
            if (str.equals(null)) {
                int i2 = mbuVar.c;
                return 0;
            }
        }
        return -1;
    }

    static mbv c(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        mee.f(strGroup);
        String strGroup2 = matcher.group(2);
        try {
            return new mbv(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(String str) {
        mbv mbvVarC;
        String strE = null;
        if (str != null) {
            String strC = ejuf.c(str.trim());
            if (!strC.startsWith("avc1") && !strC.startsWith("avc3")) {
                if (!strC.startsWith("hev1") && !strC.startsWith("hvc1")) {
                    if (!strC.startsWith("dvav") && !strC.startsWith("dva1") && !strC.startsWith("dvhe") && !strC.startsWith("dvh1")) {
                        if (!strC.startsWith("av01")) {
                            if (!strC.startsWith("vp9") && !strC.startsWith("vp09")) {
                                if (!strC.startsWith("vp8") && !strC.startsWith("vp08")) {
                                    if (!strC.startsWith("mp4a")) {
                                        if (!strC.startsWith("mha1")) {
                                            if (!strC.startsWith("mhm1")) {
                                                if (!strC.startsWith("ac-3") && !strC.startsWith("dac3")) {
                                                    if (!strC.startsWith("ec-3") && !strC.startsWith("dec3")) {
                                                        if (!strC.startsWith("ec+3")) {
                                                            if (!strC.startsWith("ac-4") && !strC.startsWith("dac4")) {
                                                                if (!strC.startsWith("dtsc")) {
                                                                    if (!strC.startsWith("dtse")) {
                                                                        if (!strC.startsWith("dtsh") && !strC.startsWith("dtsl")) {
                                                                            if (!strC.startsWith("dtsx")) {
                                                                                if (!strC.startsWith("opus")) {
                                                                                    if (!strC.startsWith("vorbis")) {
                                                                                        if (!strC.startsWith("flac")) {
                                                                                            if (!strC.startsWith("stpp")) {
                                                                                                if (!strC.startsWith("wvtt")) {
                                                                                                    if (!strC.contains("cea708")) {
                                                                                                        if (!strC.contains("eia608") && !strC.contains("cea608")) {
                                                                                                            ArrayList arrayList = a;
                                                                                                            int size = arrayList.size();
                                                                                                            int i = 0;
                                                                                                            while (true) {
                                                                                                                if (i >= size) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                mbu mbuVar = (mbu) arrayList.get(i);
                                                                                                                String str2 = mbuVar.b;
                                                                                                                if (strC.startsWith(null)) {
                                                                                                                    String str3 = mbuVar.a;
                                                                                                                    break;
                                                                                                                }
                                                                                                                i++;
                                                                                                            }
                                                                                                        } else {
                                                                                                            return "application/cea-608";
                                                                                                        }
                                                                                                    } else {
                                                                                                        return "application/cea-708";
                                                                                                    }
                                                                                                } else {
                                                                                                    return "text/vtt";
                                                                                                }
                                                                                            } else {
                                                                                                return "application/ttml+xml";
                                                                                            }
                                                                                        } else {
                                                                                            return "audio/flac";
                                                                                        }
                                                                                    } else {
                                                                                        return "audio/vorbis";
                                                                                    }
                                                                                } else {
                                                                                    return "audio/opus";
                                                                                }
                                                                            } else {
                                                                                return "audio/vnd.dts.uhd;profile=p2";
                                                                            }
                                                                        } else {
                                                                            return "audio/vnd.dts.hd";
                                                                        }
                                                                    } else {
                                                                        return "audio/vnd.dts.hd;profile=lbr";
                                                                    }
                                                                } else {
                                                                    return "audio/vnd.dts";
                                                                }
                                                            } else {
                                                                return "audio/ac4";
                                                            }
                                                        } else {
                                                            return "audio/eac3-joc";
                                                        }
                                                    } else {
                                                        return "audio/eac3";
                                                    }
                                                } else {
                                                    return "audio/ac3";
                                                }
                                            } else {
                                                return "audio/mhm1";
                                            }
                                        } else {
                                            return "audio/mha1";
                                        }
                                    } else {
                                        if (strC.startsWith("mp4a.") && (mbvVarC = c(strC)) != null) {
                                            strE = e(mbvVarC.a);
                                        }
                                        return strE == null ? "audio/mp4a-latm" : strE;
                                    }
                                } else {
                                    return "video/x-vnd.on2.vp8";
                                }
                            } else {
                                return "video/x-vnd.on2.vp9";
                            }
                        } else {
                            return "video/av01";
                        }
                    } else {
                        return "video/dolby-vision";
                    }
                } else {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return null;
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 97:
            case 98:
            case 99:
            case VCardConstants.DEFAULT_PREF /* 100 */:
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(java.lang.String r1) {
        /*
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r1 = defpackage.ejuf.c(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1833600100: goto L4c;
                case -1007807498: goto L42;
                case -979095690: goto L38;
                case -586683234: goto L2e;
                case -432836268: goto L24;
                case -432836267: goto L1a;
                case 187090231: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L56
        L10:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 2
            goto L57
        L1a:
            java.lang.String r0 = "audio/mpeg-l2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 6
            goto L57
        L24:
            java.lang.String r0 = "audio/mpeg-l1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 5
            goto L57
        L2e:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 3
            goto L57
        L38:
            java.lang.String r0 = "application/x-mpegurl"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 4
            goto L57
        L42:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 1
            goto L57
        L4c:
            java.lang.String r0 = "video/x-mvhevc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 0
            goto L57
        L56:
            r0 = -1
        L57:
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L6a;
                case 2: goto L67;
                case 3: goto L64;
                case 4: goto L61;
                case 5: goto L5e;
                case 6: goto L5b;
                default: goto L5a;
            }
        L5a:
            return r1
        L5b:
            java.lang.String r1 = "audio/mpeg-L2"
            return r1
        L5e:
            java.lang.String r1 = "audio/mpeg-L1"
            return r1
        L61:
            java.lang.String r1 = "application/x-mpegURL"
            return r1
        L64:
            java.lang.String r1 = "audio/wav"
            return r1
        L67:
            java.lang.String r1 = "audio/mpeg"
            return r1
        L6a:
            java.lang.String r1 = "audio/flac"
            return r1
        L6d:
            java.lang.String r1 = "video/mv-hevc"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbw.f(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L76;
                case -432837260: goto L6c;
                case -432837259: goto L62;
                case -53558318: goto L57;
                case 187078296: goto L4d;
                case 187094639: goto L43;
                case 1504578661: goto L38;
                case 1504619009: goto L2e;
                case 1504831518: goto L24;
                case 1903231877: goto L19;
                case 1903589369: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L81
        Le:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 5
            goto L82
        L19:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 4
            goto L82
        L24:
            java.lang.String r1 = "audio/mpeg"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = r0
            goto L82
        L2e:
            java.lang.String r1 = "audio/flac"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 6
            goto L82
        L38:
            java.lang.String r1 = "audio/eac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 8
            goto L82
        L43:
            java.lang.String r1 = "audio/raw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 3
            goto L82
        L4d:
            java.lang.String r1 = "audio/ac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 7
            goto L82
        L57:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 10
            goto L82
        L62:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 2
            goto L82
        L6c:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = r2
            goto L82
        L76:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 9
            goto L82
        L81:
            r3 = -1
        L82:
            switch(r3) {
                case 0: goto L9c;
                case 1: goto L9c;
                case 2: goto L9c;
                case 3: goto L9c;
                case 4: goto L9c;
                case 5: goto L9c;
                case 6: goto L9c;
                case 7: goto L9c;
                case 8: goto L9c;
                case 9: goto L9c;
                case 10: goto L86;
                default: goto L85;
            }
        L85:
            return r0
        L86:
            if (r4 != 0) goto L89
            return r0
        L89:
            mbv r3 = c(r4)
            if (r3 != 0) goto L90
            return r0
        L90:
            int r3 = r3.a()
            if (r3 == 0) goto L9b
            r4 = 16
            if (r3 == r4) goto L9b
            return r2
        L9b:
            return r0
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbw.g(java.lang.String, java.lang.String):boolean");
    }

    public static boolean h(String str, String str2) {
        String string = null;
        if (str != null) {
            String[] strArrAj = mgb.aj(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrAj) {
                if (str2.equals(d(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                string = sb.toString();
            }
        }
        return string != null;
    }

    public static boolean i(String str) {
        return "audio".equals(m(str));
    }

    public static boolean j(String str) {
        return "image".equals(m(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean k(String str) {
        return ConversationSuggestion.SUGGESTION_PROPERTY_TEXT.equals(m(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return "video".equals(m(str));
    }

    private static String m(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
