package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dddg implements ddce {
    public static final Status a = new Status(13);

    static final void b(final Activity activity, final Intent intent, GoogleHelp googleHelp) {
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            InProductHelp inProductHelp = (InProductHelp) dclx.a(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
            inProductHelp.a = googleHelp;
            dclx.b(inProductHelp, intent);
        }
        new ddmy(Looper.getMainLooper()).post(new Runnable() { // from class: ddcs
            @Override // java.lang.Runnable
            public final void run() {
                activity.startActivityForResult(intent, 123);
            }
        });
    }

    final void a(GoogleHelp googleHelp) {
        ArrayList arrayList;
        int i = googleHelp.M;
        if (i == 0 || i == 1) {
            ekea ekeaVar = dddp.a;
            synchronized (ekeaVar) {
                arrayList = new ArrayList(ekeaVar);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            googleHelp.N = arrayList;
        }
    }
}
