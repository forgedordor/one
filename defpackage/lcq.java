package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcq implements lcr {
    private final ContentInfo.Builder a;

    public lcq(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.lcr
    public final lcw a() {
        return new lcw(new lct(this.a.build()));
    }

    @Override // defpackage.lcr
    public final void b(ClipData clipData) {
        this.a.setClip(clipData);
    }

    @Override // defpackage.lcr
    public final void c(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.lcr
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.lcr
    public final void e(Uri uri) {
        this.a.setLinkUri(uri);
    }

    public lcq(lcw lcwVar) {
        this.a = new ContentInfo.Builder(lcwVar.e());
    }
}
