package defpackage;

import android.net.Uri;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deri implements denv {
    private final Uri a;
    private final byte[] b;
    private final Map c;

    public deri(denv denvVar) {
        this.a = denvVar.a();
        this.b = denvVar.c();
        HashMap map = new HashMap();
        for (Map.Entry entry : denvVar.b().entrySet()) {
            if (entry.getKey() != null) {
                map.put((String) entry.getKey(), (denw) ((denw) entry.getValue()).d());
            }
        }
        this.c = DesugarCollections.unmodifiableMap(map);
    }

    @Override // defpackage.denv
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.denv
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.denv
    public final byte[] c() {
        return this.b;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(this.a))));
        byte[] bArr = this.b;
        sb.append(", dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Map map = this.c;
        sb.append(", numAssets=" + map.size());
        if (zIsLoggable && !map.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : map.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((denw) entry.getValue()).b());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
