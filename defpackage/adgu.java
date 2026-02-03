package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgu {
    public final fctc a;
    public GalleryContent b;
    public int c;

    public adgu(final fcsu fcsuVar) {
        this.a = fctd.a(new fdae() { // from class: adgs
            @Override // defpackage.fdae
            public final Object invoke() {
                return (adgr) fcsuVar.b();
            }
        });
        fctd.a(new fdae() { // from class: adgt
            @Override // defpackage.fdae
            public final Object invoke() {
                Object objA = this.a.a.a();
                objA.getClass();
                return ((adgr) objA).aZ();
            }
        });
        this.c = -1;
    }

    public final void a(GalleryContent galleryContent) {
        galleryContent.getClass();
        this.b = galleryContent;
    }
}
