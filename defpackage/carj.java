package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carj {
    public final apph a;

    public carj(apph apphVar) {
        this.a = apphVar;
    }

    public static final carh a(String str) throws IOException {
        List listS = fdgn.S(str, new String[]{"-"}, 0, 6);
        String string = fdgn.x((String) listS.get(0)).toString();
        String str2 = (String) listS.get(1);
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return new carh(string, Integer.parseInt(sb.toString()));
    }
}
