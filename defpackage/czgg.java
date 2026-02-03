package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czgg implements eind {
    final /* synthetic */ czgf a;

    public czgg(czgf czgfVar) {
        this.a = czgfVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) einbVar;
        boolean zBooleanValue = ((Boolean) czns.a.e()).booleanValue();
        czgf czgfVar = this.a;
        if (zBooleanValue && czgfVar.Z != null) {
            czmk czmkVar = czgfVar.Y;
            if (czmkVar != null) {
                czmkVar.H().C(5);
            }
            czgfVar.Z.z(mediaViewerPrimaryButtonEvent.a);
        } else if (czgfVar.aa != null) {
            czmk czmkVar2 = czgfVar.Y;
            if (czmkVar2 != null) {
                czmkVar2.H().C(5);
            }
            czgfVar.aa.run();
        }
        return eine.a;
    }
}
