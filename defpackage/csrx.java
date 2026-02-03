package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrx {
    public static final /* synthetic */ int a = 0;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/text/Base32Utils");
    private static final ejxr c = ejxx.a(new ejxr() { // from class: csrw
        @Override // defpackage.ejxr
        public final Object get() {
            int i = csrx.a;
            return Pattern.compile("^(?:[a-z2-7]{8})*(?:[a-z2-7]{2}={6}|[a-z2-7]{4}={4}|[a-z2-7]{5}={3}|[a-z2-7]{7}=)?$");
        }
    });
    private static final eldz d = eldz.g.f();

    public final String a(String str) {
        if (b(str)) {
            try {
                return new String(d.k(str), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                ekrw ekrwVarI = b.i();
                ekrwVarI.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/text/Base32Utils", "decode", 'c', "Base32Utils.java")).q("UTF-8 unsupported, cannot decode Base32");
                return str;
            } catch (IllegalArgumentException unused) {
                ekrw ekrwVarJ = b.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/text/Base32Utils", "decode", 96, "Base32Utils.java")).t("Base32Utils. %s is not Base32 encoded.", str);
            }
        }
        return str;
    }

    public final boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((Pattern) c.get()).matcher(str).matches();
    }

    public final String c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "@");
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(a(stringTokenizer.nextToken()));
        while (stringTokenizer.hasMoreTokens()) {
            sb.append("@");
            sb.append(stringTokenizer.nextToken());
        }
        return sb.toString();
    }

    public final String d(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "@");
        StringBuilder sb = new StringBuilder();
        if (stringTokenizer.hasMoreTokens()) {
            sb.append(d.j(stringTokenizer.nextToken().getBytes(StandardCharsets.UTF_8)));
            while (stringTokenizer.hasMoreTokens()) {
                sb.append("@");
                sb.append(stringTokenizer.nextToken());
            }
        }
        return sb.toString();
    }
}
