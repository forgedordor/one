package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlq implements dxlo {
    @Override // defpackage.dxlo
    public final erzj a(Context context) {
        return erzj.c(context);
    }

    @Override // defpackage.dxlo
    public final FirebaseInstanceId b(erzj erzjVar) {
        return FirebaseInstanceId.getInstance(erzjVar);
    }

    @Override // defpackage.dxlo
    public final erzj c(Context context, erzu erzuVar) {
        String str;
        try {
            return erzj.d(context, erzuVar, "CHIME_ANDROID_SDK");
        } catch (IllegalStateException unused) {
            Object obj = erzj.a;
            synchronized (obj) {
                Map map = erzj.b;
                erzj erzjVar = (erzj) map.get("CHIME_ANDROID_SDK");
                if (erzjVar != null) {
                    ((esfo) erzjVar.f.a()).c();
                    return erzjVar;
                }
                ArrayList arrayList = new ArrayList();
                synchronized (obj) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((erzj) it.next()).g());
                    }
                    Collections.sort(arrayList);
                    if (arrayList.isEmpty()) {
                        str = "";
                    } else {
                        str = "Available app names: " + TextUtils.join(", ", arrayList);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", "CHIME_ANDROID_SDK", str));
                }
            }
        }
    }
}
