package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvt implements echs {
    public final Context a;
    public final Object b;
    public final HashMap c;
    public final HashMap d;
    public final duag e;

    public duvt(Context context) {
        duag duagVar = new duag(new dieu());
        this.b = new Object();
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = context;
        this.e = duagVar;
    }

    @Override // defpackage.echs
    public final echr a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.echs
    public final echr b(Uri uri) {
        echr echrVar;
        synchronized (this.b) {
            echrVar = (echr) this.d.get(uri);
        }
        return echrVar;
    }

    @Override // defpackage.echs
    public final void h() {
    }
}
