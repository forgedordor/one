package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddx {
    public static final Uri a(etwu etwuVar) {
        etwuVar.getClass();
        StringBuilder sb = new StringBuilder("https://lh3.googleusercontent.com/p/");
        if ((etwuVar.b & 1) != 0) {
            sb.append(etwuVar.c);
        }
        if ((etwuVar.b & 2) != 0) {
            sb.append("=iv");
            sb.append(etwuVar.d);
        }
        return Uri.parse(sb.toString());
    }
}
