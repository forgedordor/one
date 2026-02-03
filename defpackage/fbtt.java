package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbtt extends fbor {
    public Context a;
    private final fbqo b;

    static {
        try {
            try {
                try {
                    ((fbqq) Class.forName("fcoy").asSubclass(fbqq.class).getConstructor(null).newInstance(null)).c();
                } catch (Exception e) {
                    Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
                }
            } catch (ClassCastException e2) {
                Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
            }
        } catch (ClassNotFoundException e3) {
            Log.w("AndroidChannelBuilder", "Failed to find OkHttpChannelProvider", e3);
        }
    }

    public fbtt(fbqo fbqoVar) {
        this.b = fbqoVar;
    }

    @Override // defpackage.fboq, defpackage.fbqo
    public final fbqm a() {
        return new fbts(this.b.a(), this.a);
    }

    @Override // defpackage.fbor, defpackage.fboq
    protected final fbqo b() {
        return this.b;
    }
}
