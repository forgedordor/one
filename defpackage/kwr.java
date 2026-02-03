package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwr implements kux {
    public final Context a;
    public final Notification.Builder b;
    public final kvq c;
    private final Bundle d;
    private int e;

    /* JADX WARN: Removed duplicated region for block: B:145:0x0429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kwr(defpackage.kvq r21) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwr.<init>(kvq):void");
    }

    private final void a(kvf kvfVar) {
        IconCompat iconCompatA = kvfVar.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.c() : null, kvfVar.h, kvfVar.i);
        kxb[] kxbVarArr = kvfVar.b;
        if (kxbVarArr != null) {
            for (RemoteInput remoteInput : kxb.a(kxbVarArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = new Bundle(kvfVar.a);
        boolean z = kvfVar.c;
        bundle.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        int i = kvfVar.e;
        bundle.putInt("android.support.action.semanticAction", i);
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(i);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(kvfVar.f);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAuthenticationRequired(kvfVar.j);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", kvfVar.d);
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }
}
