package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgv {
    public final ClipboardManager a;

    public jgv(ClipboardManager clipboardManager) {
        this.a = clipboardManager;
    }

    public final void a(jlf jlfVar) {
        if (jlfVar != null) {
            this.a.setPrimaryClip(jlfVar.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.a.clearPrimaryClip();
        } else {
            this.a.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
