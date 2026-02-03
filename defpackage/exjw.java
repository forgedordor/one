package defpackage;

import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.RemoteAssetManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class exjw {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final ekjo e = new ekby();
    public final RemoteAssetManager f;

    public exjw(RemoteAssetManager remoteAssetManager) {
        this.f = remoteAssetManager;
    }

    public final void a(String str, Effect effect, String str2) {
        ArrayList arrayList;
        synchronized (this) {
            if (effect != null) {
                effect.nativeSetName(effect.b, (String) ((ejwt) ejwi.j(str)).a);
                this.d.put(str, effect);
                arrayList = new ArrayList(this.e.d(str));
            } else {
                arrayList = new ArrayList(this.e.d(str));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dbgh) arrayList.get(i)).a(str, effect, str2);
        }
    }
}
