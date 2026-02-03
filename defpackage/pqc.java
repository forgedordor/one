package defpackage;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pqc implements pqg {
    public static final Set a = new HashSet();
    private final String b;
    private final String c;

    public pqc(String str, String str2) {
        this.b = str;
        this.c = str2;
        a.add(this);
    }

    public abstract boolean a();

    @Override // defpackage.pqg
    public final String b() {
        return this.b;
    }

    @Override // defpackage.pqg
    public final boolean c() {
        return a() || d();
    }

    public boolean d() {
        Set set = ppt.a;
        String str = this.c;
        if (set.contains(str)) {
            return true;
        }
        return ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) && set.contains(str.concat(":dev"));
    }
}
