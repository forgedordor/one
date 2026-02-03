package defpackage;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lia {
    public final lhz a;

    public lia(lhz lhzVar) {
        this.a = lhzVar;
    }

    public final ClipDescription a() {
        return this.a.a.getDescription();
    }

    public final Uri b() {
        return this.a.a.getContentUri();
    }

    public final void c() {
        this.a.a.requestPermission();
    }
}
