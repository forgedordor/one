package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cssw {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/ui/UiUtil");
    protected final crnp a;
    private final Context c;

    public cssw(Context context, crnp crnpVar) {
        this.c = context;
        this.a = crnpVar;
    }

    public final void a(String str, String str2) {
        Context context = this.c;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/ui/UiUtil", "copyToClipboardAndShowToast", 67, "UiUtil.java")).q("Could not get clipboard system service.");
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
            if (Build.VERSION.SDK_INT <= 32) {
                Toast.makeText(context, str2, 1).show();
            }
        }
    }

    public final boolean b(Context context) {
        crnp crnpVar = this.a;
        return crnpVar.e() && crnpVar.d() && craf.j(context);
    }
}
