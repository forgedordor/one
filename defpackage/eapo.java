package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eapo implements Parcelable {
    public static eapn d(String str, List list) {
        eany eanyVar = new eany();
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        eanyVar.a = str;
        eanyVar.b(list);
        return eanyVar;
    }

    public abstract String a();

    public abstract String b();

    public abstract List c();
}
