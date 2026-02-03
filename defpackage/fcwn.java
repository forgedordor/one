package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcwn {
    public static final Set a(Set set) {
        ((fcxk) set).b.e();
        return ((fcun) set).c() > 0 ? set : fcxk.a;
    }

    public static final Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }
}
