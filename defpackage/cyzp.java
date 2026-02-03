package defpackage;

import android.R;
import android.content.Intent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyzp extends cyzr implements efzm {
    public final GalleryBrowserActivity a;
    public abs b;
    private final fcsu d;

    public cyzp(GalleryBrowserActivity galleryBrowserActivity, efxf efxfVar, fcsu fcsuVar) {
        this.a = galleryBrowserActivity;
        this.d = fcsuVar;
        efxfVar.e(this);
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        efwo efwoVarA = efzkVar.a();
        cyzk cyzkVar = (cyzk) cyzl.a.createBuilder();
        GalleryBrowserActivity galleryBrowserActivity = this.a;
        long j = ((cyvb) galleryBrowserActivity).H;
        Long.valueOf(j).getClass();
        cyzkVar.copyOnWrite();
        ((cyzl) cyzkVar.instance).b = j;
        boolean z = galleryBrowserActivity.I;
        cyzkVar.copyOnWrite();
        ((cyzl) cyzkVar.instance).c = z;
        cyzl cyzlVar = (cyzl) cyzkVar.build();
        cyxz cyxzVar = new cyxz();
        eyhj.e(cyxzVar);
        ehok.b(cyxzVar, efwoVarA);
        ehog.a(cyxzVar, cyzlVar);
        cg cgVar = new cg(galleryBrowserActivity.a());
        cgVar.x(R.id.content, cyxzVar, "gallery_browser_fragment_tag");
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((abxv) this.d.b()).a(efygVar);
    }

    final void e() {
        Intent intent = new Intent();
        GalleryBrowserActivity galleryBrowserActivity = this.a;
        intent.putExtra("attachment_queue_state_extra_key", ((cyvb) galleryBrowserActivity).n);
        galleryBrowserActivity.setResult(-1, intent);
        galleryBrowserActivity.finish();
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
