package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffys {
    private final List a = new ArrayList(1);

    public final synchronized boolean a(int i) {
        List list = this.a;
        if (list.size() >= 256) {
            return false;
        }
        list.add(Integer.valueOf(i));
        return true;
    }
}
