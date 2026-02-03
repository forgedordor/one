package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cznn implements eind {
    final /* synthetic */ czmx a;

    public cznn(czmx czmxVar) {
        this.a = czmxVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        czmx czmxVar = this.a;
        MediaViewerItem mediaViewerItem = czmxVar.N;
        if (mediaViewerItem != null) {
            cznq cznqVar = czmxVar.Y;
            if (cznqVar != null) {
                cznqVar.e = 4;
            }
            if (czmxVar.m.a) {
                avmp avmpVar = czmxVar.f;
                eg egVarG = czmxVar.H.G();
                egVarG.getClass();
                avmpVar.t(egVarG, mediaViewerItem.d(), mediaViewerItem.c(), mediaViewerItem.b());
            } else {
                czmxVar.f.v(czmxVar.H.z(), mediaViewerItem.d(), mediaViewerItem.c(), mediaViewerItem.b());
            }
        }
        return eine.a;
    }
}
