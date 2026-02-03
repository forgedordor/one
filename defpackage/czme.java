package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czme implements eind {
    final /* synthetic */ czmd a;

    public czme(czmd czmdVar) {
        this.a = czmdVar;
    }

    @Override // defpackage.eind
    public final /* synthetic */ eine a(einb einbVar) {
        MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) einbVar;
        czmd czmdVar = this.a;
        String strA = czmdVar.f ? ejwk.a((String) mediaViewerPrimaryButtonEvent.b.orElse(null)) : null;
        if (mediaViewerPrimaryButtonEvent.a.isPresent()) {
            czmdVar.a.setResult(-1, czmdVar.a(((cznw) mediaViewerPrimaryButtonEvent.a.get()).a, ((cznw) mediaViewerPrimaryButtonEvent.a.get()).c, true, czmdVar.f && czmdVar.g, strA));
        } else {
            MediaViewerItem mediaViewerItem = czmdVar.d.H().N;
            czmdVar.a.setResult(-1, czmdVar.a(mediaViewerItem.b(), mediaViewerItem.h(), false, czmdVar.f && czmdVar.g, strA));
        }
        czmdVar.a.finish();
        return eine.a;
    }
}
