package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecan implements ecac {
    private final Context a;

    public ecan(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.ecac
    public final void a(ebzy ebzyVar) {
        Context context = this.a;
        Iterator it = ebyy.a(context, ebzv.class).iterator();
        while (it.hasNext()) {
            ebzyVar.i((ebzv) it.next());
        }
        Iterator it2 = ebyy.a(context, ebzu.class).iterator();
        while (it2.hasNext()) {
            ebzyVar.g((ebzu) it2.next());
        }
    }
}
