package defpackage;

import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxjp extends dxjv {
    public URL a;
    public String b;
    public Map c;
    public byte[] d;
    public int e;

    public dxjp() {
    }

    @Override // defpackage.dxjv
    public final dxjx a() {
        Map map;
        int i;
        URL url = this.a;
        if (url != null && (map = this.c) != null && (i = this.e) != 0) {
            return new dxjq(url, this.b, map, this.d, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" url");
        }
        if (this.c == null) {
            sb.append(" headers");
        }
        if (this.e == 0) {
            sb.append(" purpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dxjv
    public final Map b() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public dxjp(dxjx dxjxVar) {
        dxjq dxjqVar = (dxjq) dxjxVar;
        this.a = dxjqVar.a;
        this.b = dxjqVar.b;
        this.c = dxjqVar.c;
        this.d = dxjqVar.d;
        this.e = dxjqVar.e;
    }
}
