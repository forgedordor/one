package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqxc {
    public static dqxc c(String str, String[] strArr) {
        return new dqoz(str, strArr == null ? Arrays.asList(new String[0]) : Arrays.asList(strArr));
    }

    public abstract String a();

    public abstract List b();
}
