package defpackage;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crak implements craj {
    final UserManager a;

    public crak(Context context) {
        ejwl.b(context != null, "Context cannot be null.");
        this.a = (UserManager) context.getSystemService("user");
    }

    @Override // defpackage.craj
    public final boolean a() {
        UserManager userManager = this.a;
        userManager.getClass();
        return userManager.isMainUser();
    }
}
