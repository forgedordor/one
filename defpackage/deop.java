package defpackage;

import android.os.Looper;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deop implements dcfa {
    public static final deop a = new deop(new deoo());
    private final Looper b;

    public deop(deoo deooVar) {
        this.b = deooVar.a;
    }

    public final dcfl a() {
        Looper looper = this.b;
        if (looper == null) {
            return dcfl.a;
        }
        dcfk dcfkVar = new dcfk();
        dcfkVar.b(looper);
        return dcfkVar.a();
    }

    public final boolean equals(Object obj) {
        return obj instanceof deop;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass()});
    }
}
