package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cqps {
    public abstract String a();

    public abstract String b();

    public abstract List c();

    public final cqpt d(String str) {
        return (cqpt) ((Map) c().get(0)).get(str);
    }
}
