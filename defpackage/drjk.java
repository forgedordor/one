package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjk extends evor {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r5 > 6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri a(int r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drjk.a(int, android.net.Uri):android.net.Uri");
    }

    public final boolean b(Uri uri) {
        drjh drjhVar = new drjh(uri);
        ejwl.a(true);
        String string = drjhVar.toString();
        Pattern pattern = evoy.a;
        if (string != null) {
            return evoy.a.matcher(string).find();
        }
        throw new IllegalArgumentException();
    }
}
