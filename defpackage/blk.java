package defpackage;

import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blk extends bmx {
    public blk(Map map) {
        super(map);
    }

    public static blk a() {
        return new blk(new ArrayMap());
    }

    public final void b(String str, Object obj) {
        this.b.put(str, obj);
    }
}
