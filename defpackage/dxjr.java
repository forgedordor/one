package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxjr extends dxjy {
    public Integer a;
    public Map b;
    public byte[] c;
    public byte[] d;
    public Exception e;

    @Override // defpackage.dxjy
    public final Map a() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }
}
