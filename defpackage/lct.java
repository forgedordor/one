package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lct implements lcu {
    private final ContentInfo a;

    public lct(ContentInfo contentInfo) {
        lcg.i(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.lcu
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.lcu
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.lcu
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.lcu
    public final Uri d() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.lcu
    public final Bundle e() {
        return this.a.getExtras();
    }

    @Override // defpackage.lcu
    public final ContentInfo f() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
