package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecft {
    public final String a;
    public final List b;

    public ecft(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ecgq.a(!list.isEmpty(), "Missing param values", new Object[0]);
        this.a = str;
        arrayList.addAll(list);
    }

    public final String toString() {
        return ecfx.a(this.a) + "=" + TextUtils.join("+", this.b);
    }
}
