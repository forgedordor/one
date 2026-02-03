package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerAddMoreButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmf implements eind {
    final /* synthetic */ czmd a;

    public czmf(czmd czmdVar) {
        this.a = czmdVar;
    }

    @Override // defpackage.eind
    public final /* synthetic */ eine a(einb einbVar) {
        MediaViewerAddMoreButtonEvent mediaViewerAddMoreButtonEvent = (MediaViewerAddMoreButtonEvent) einbVar;
        czmd czmdVar = this.a;
        String strA = czmdVar.f ? ejwk.a((String) mediaViewerAddMoreButtonEvent.b.orElse(null)) : null;
        if (mediaViewerAddMoreButtonEvent.a.isPresent()) {
            czmdVar.a.setResult(-1, czmdVar.a(((cznw) mediaViewerAddMoreButtonEvent.a.get()).a, ((cznw) mediaViewerAddMoreButtonEvent.a.get()).c, true, false, strA));
        } else {
            MediaViewerItem mediaViewerItem = czmdVar.d.H().N;
            czmdVar.a.setResult(-1, czmdVar.a(mediaViewerItem.b(), mediaViewerItem.h(), false, false, strA));
        }
        czmdVar.a.finish();
        return eine.a;
    }
}
