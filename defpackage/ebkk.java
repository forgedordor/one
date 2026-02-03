package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkk {
    public static int a(String str) throws ebki {
        try {
            if (Objects.isNull(str)) {
                throw new ebki("Invalid SDP format, integer expected but got null.");
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new ebki("Invalid SDP format, integer expected: ".concat(String.valueOf(str)), e);
        }
    }

    public static ebkn b(String str) throws IOException {
        ebkn ebknVar = new ebkn();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        try {
            ebkd ebkdVarC = null;
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                if (line.startsWith("v=")) {
                    String strC = c(line, "v=");
                    try {
                        ebknVar.d = new ebkm(Integer.parseInt(strC));
                    } catch (NumberFormatException e) {
                        throw new ebki("Invalid SDP version format: ".concat(String.valueOf(strC)), e);
                    }
                } else if (line.startsWith("o=")) {
                    ebknVar.e = ebkg.e(line);
                } else if (line.startsWith("s=")) {
                    ebknVar.f = new ebkp(c(line, "s="));
                } else if (line.startsWith("i=")) {
                    ebko ebkoVarC = ebko.c(line);
                    if (ebkdVarC == null) {
                        ebknVar.g = ebkoVarC;
                        ebkdVarC = null;
                    } else {
                        ebkdVarC.b = ebkoVarC;
                    }
                } else if (line.startsWith("c=")) {
                    ebka ebkaVarA = ebka.a(line);
                    if (ebkdVarC == null) {
                        ebknVar.h = ebkaVarA;
                        ebkdVarC = null;
                    } else {
                        ebkdVarC.c = ebkaVarA;
                    }
                } else if (line.startsWith("b=")) {
                    ebjz ebjzVarA = ebjz.a(line);
                    if (ebkdVarC == null) {
                        ebknVar.i = ebjzVarA;
                        ebkdVarC = null;
                    } else {
                        ebkdVarC.d = ebjzVarA;
                    }
                } else if (line.startsWith("t=")) {
                    String strC2 = c(line, "t=");
                    String[] strArrSplit = strC2.split(" ");
                    if (strArrSplit.length < 2) {
                        throw new ebki("Illegal format for time description: ".concat(String.valueOf(strC2)));
                    }
                    try {
                        ebknVar.c(new ebkq(Long.valueOf(strArrSplit[0]).longValue(), Long.valueOf(strArrSplit[1]).longValue()));
                    } catch (NumberFormatException e2) {
                        throw new ebki(e2);
                    }
                } else if (line.startsWith("a=")) {
                    ebkb ebkbVarA = ebkb.a(line);
                    if (ebkdVarC == null) {
                        ebknVar.b.add(ebkbVarA);
                        ebkdVarC = null;
                    } else {
                        ebkdVarC.e(ebkbVarA);
                    }
                } else if (line.startsWith("m=")) {
                    ebkdVarC = ebkd.c(line);
                    ebknVar.a(ebkdVarC);
                }
            }
            return ebknVar;
        } catch (IOException e3) {
            throw new ebki(e3);
        }
    }

    public static String c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new ebki("Invalid SDP, line is empty");
        }
        if (!Objects.isNull(str2) && !TextUtils.isEmpty(str2) && str.startsWith(str2)) {
            str = str.substring(str2.length());
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.endsWith("\r")) {
            str = str.substring(0, str.length() - 1);
        }
        if (TextUtils.isEmpty(str)) {
            throw new ebki("Invalid SDP! Line only contains line feed or type but is empty otherwise!");
        }
        return str;
    }
}
