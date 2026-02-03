package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbty extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;
    private final UserHandle b;

    protected fbty(Intent intent) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        ejwl.b(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.a = intent;
        this.b = null;
    }

    public static fbty a(ComponentName componentName) {
        return new fbty(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    public static fbty b(Context context) {
        return a(new ComponentName(context, context.getClass()));
    }

    public static fbty c(String str, String str2) {
        return a(new ComponentName(str, str2));
    }

    public final String d() {
        Intent intent = this.a;
        return intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fbty) {
            fbty fbtyVar = (fbty) obj;
            if (this.a.filterEquals(fbtyVar.a)) {
                UserHandle userHandle = fbtyVar.b;
                if (ejwh.a(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        return "AndroidComponentAddress[" + this.a + "]";
    }
}
