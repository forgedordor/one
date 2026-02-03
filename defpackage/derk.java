package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derk extends dcjj implements denv {
    private final int d;

    public derk(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    @Override // defpackage.denv
    public final Uri a() {
        return Uri.parse(gt("path"));
    }

    @Override // defpackage.denv
    public final Map b() {
        int i = this.d;
        HashMap map = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            derh derhVar = new derh(this.a, this.b + i2);
            if (derhVar.a() != null) {
                map.put(derhVar.a(), derhVar);
            }
        }
        return map;
    }

    @Override // defpackage.denv
    public final byte[] c() {
        return this.a.g(GroupManagementRequest.DATA_TAG, this.b, this.c);
    }

    @Override // defpackage.dcjo
    public final /* synthetic */ Object d() {
        return new deri(this);
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        byte[] bArrC = c();
        Map mapB = b();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(a()))));
        sb.append(", dataSz=".concat((bArrC == null ? "null" : Integer.valueOf(bArrC.length)).toString()));
        sb.append(", numAssets=" + mapB.size());
        if (zIsLoggable && !mapB.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : mapB.entrySet()) {
                sb.append(str + ((String) entry.getKey()) + ": " + ((denw) entry.getValue()).b());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
