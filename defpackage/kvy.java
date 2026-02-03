package defpackage;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvy extends kwk {
    private final ArrayList a = new ArrayList();

    public kvy() {
    }

    @Override // defpackage.kwk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.kwk
    public final void b(kux kuxVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((kwr) kuxVar).b).setBigContentTitle(this.h);
        if (this.j) {
            bigContentTitle.setSummaryText(this.i);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }

    @Override // defpackage.kwk
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.textLines");
    }

    @Override // defpackage.kwk
    protected final void d(Bundle bundle) {
        super.d(bundle);
        ArrayList arrayList = this.a;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    public final void g(CharSequence charSequence) {
        if (charSequence != null) {
            this.a.add(kvq.c(charSequence));
        }
    }

    public kvy(kvq kvqVar) {
        i(kvqVar);
    }
}
