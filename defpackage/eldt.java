package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldt {
    private static final ekhx a = ekhx.t("http", "https", "mailto", "ftp");
    private static final ekhx b = ekhx.v("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf");
    private static final ekhx c = ekon.a;

    public static elds a(String str) {
        char cCharAt;
        int i;
        char cCharAt2;
        char cCharAt3;
        elds eldsVar = elds.a;
        ekhx ekhxVar = c;
        String strC = ejuf.c(str);
        ekqg ekqgVarListIterator = a.listIterator();
        while (true) {
            if (!ekqgVarListIterator.hasNext()) {
                if (strC.startsWith("data:")) {
                    String strC2 = ejuf.c(str);
                    if (strC2.startsWith("data:") && strC2.length() > 5) {
                        int i2 = 5;
                        while (i2 < strC2.length() && (cCharAt3 = strC2.charAt(i2)) != ';' && cCharAt3 != ',') {
                            i2++;
                        }
                        if (b.contains(strC2.substring(5, i2)) && strC2.startsWith(";base64,", i2) && (i = i2 + 8) < strC2.length()) {
                            while (i < strC2.length() && (cCharAt2 = strC2.charAt(i)) != '=') {
                                if ((cCharAt2 < 'a' || cCharAt2 > 'z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '/')) {
                                    break;
                                }
                                i++;
                            }
                            while (i < strC2.length()) {
                                if (strC2.charAt(i) == '=') {
                                    i++;
                                }
                            }
                        }
                    }
                    return eldsVar;
                }
                ekqg ekqgVarListIterator2 = ((ekon) ekhxVar).listIterator();
                while (true) {
                    if (ekqgVarListIterator2.hasNext()) {
                        if (strC.startsWith(String.valueOf(ejuf.c(((eldo) ekqgVarListIterator2.next()).name()).replace('_', '-')).concat(":"))) {
                            break;
                        }
                    } else {
                        for (int i3 = 0; i3 < str.length() && (cCharAt = str.charAt(i3)) != '#' && cCharAt != '/'; i3++) {
                            if (cCharAt != ':') {
                                if (cCharAt == '?') {
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                if (strC.startsWith(String.valueOf((String) ekqgVarListIterator.next()).concat(":"))) {
                    break;
                }
            }
        }
        return new elds(str);
    }
}
