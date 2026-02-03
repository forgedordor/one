package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxru implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Context c;

    public cxru(String str, String str2, Context context) {
        this.a = str;
        this.b = str2;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        String str = this.a;
        cxrv.a("rm ".concat(str));
        StringBuilder sb = new StringBuilder("ln -s ");
        String str2 = this.b;
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        cxrv.a(sb.toString());
        Toast.makeText(this.c, "link updated to target ".concat(str2), 1).show();
    }
}
