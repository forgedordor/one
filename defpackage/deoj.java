package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deoj {
    public final denz a = new denz();
    private final PutDataRequest b;

    private deoj(PutDataRequest putDataRequest) {
        this.b = putDataRequest;
    }

    public static deoj b(String str) {
        return new deoj(PutDataRequest.a(str));
    }

    public final Uri a() {
        return this.b.a;
    }

    public final PutDataRequest c() {
        deuq deuqVarB = deur.b(this.a);
        devb devbVar = deuqVarB.a;
        PutDataRequest putDataRequest = this.b;
        putDataRequest.c = devbVar.toByteArray();
        List list = deuqVarB.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String string = Integer.toString(i);
            Asset asset = (Asset) list.get(i);
            if (string == null) {
                throw new IllegalStateException("asset key cannot be null: ".concat(String.valueOf(String.valueOf(asset))));
            }
            if (asset == null) {
                throw new IllegalStateException("asset cannot be null: key=".concat(string));
            }
            if (Log.isLoggable("DataMap", 3)) {
                Log.d("DataMap", a.G(string, asset, "asPutDataRequest: adding asset: ", " "));
            }
            putDataRequest.d(string, asset);
        }
        return putDataRequest;
    }
}
