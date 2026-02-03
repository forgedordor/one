package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crah {
    public final Context a;

    public crah(Context context) {
        this.a = context;
    }

    public final void a(int i) throws fekk {
        fekj fekjVar = fekl.a;
        try {
            fekj fekjVar2 = fekl.a;
            Context context = this.a;
            if (fekjVar2 == null && !fekl.a(context)) {
                throw new fekk("No default launcher available");
            }
            try {
                fekl.a.b(context, fekl.b, i);
            } catch (Exception e) {
                throw new fekk(e);
            }
        } catch (fekk e2) {
            if (Log.isLoggable("ShortcutBadger", 3)) {
                Log.d("ShortcutBadger", "Unable to execute badge", e2);
            }
        }
    }

    public final boolean b() {
        if (((Boolean) cgdb.a.e()).booleanValue()) {
            return false;
        }
        return fekl.b(this.a);
    }
}
