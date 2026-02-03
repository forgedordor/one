package defpackage;

import android.os.Bundle;
import androidx.core.app.RemoteActionCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujz {
    public String a;
    public Bundle b;
    private String c;
    private final List d = new ArrayList();
    private final Map e = new csq();

    public final eukb a() {
        String str = this.c;
        euiz euizVar = new euiz(this.e);
        String str2 = this.a;
        Bundle bundle = this.b;
        return new eukb(str, this.d, euizVar, str2, bundle == null ? Bundle.EMPTY : bundle.deepCopy());
    }

    public final void b(RemoteActionCompat remoteActionCompat) {
        ejwl.a(remoteActionCompat != null);
        this.d.add(remoteActionCompat);
    }

    public final void c(String str, float f) {
        this.e.put(str, Float.valueOf(f));
    }

    public final void d(CharSequence charSequence) {
        this.c = charSequence == null ? null : charSequence.toString();
    }
}
