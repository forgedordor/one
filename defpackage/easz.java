package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class easz implements Parcelable {
    public static easy g(String str) {
        eaov eaovVar = new eaov();
        if (str == null) {
            throw new NullPointerException("Null photoReference");
        }
        eaovVar.a = str;
        eaovVar.d(0);
        eaovVar.c(0);
        eaovVar.b("");
        return eaovVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract eaps c();

    public abstract String d();

    public abstract String e();

    public abstract String f();
}
