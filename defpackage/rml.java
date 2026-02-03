package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rml implements rlq {
    private final rlq a;

    public rml(rlq rlqVar) {
        this.a = rlqVar;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        Uri uriC;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uriC = null;
        } else if (str.charAt(0) == '/') {
            uriC = c(str);
        } else {
            Uri uri = Uri.parse(str);
            uriC = uri.getScheme() == null ? c(str) : uri;
        }
        if (uriC != null) {
            rlq rlqVar = this.a;
            if (rlqVar.b(uriC)) {
                return rlqVar.a(uriC, i, i2, rexVar);
            }
        }
        return null;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
