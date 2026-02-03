package defpackage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserExternalItemView;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyyk extends ehcx {
    final /* synthetic */ cyye a;

    public cyyk(cyye cyyeVar) {
        this.a = cyyeVar;
    }

    @Override // defpackage.ehcx
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (GalleryBrowserExternalItemView) LayoutInflater.from(this.a.e).inflate(R.layout.compose2o_gallery_browser_external_item_view_m2, viewGroup, false);
    }

    @Override // defpackage.ehcx
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        GalleryBrowserExternalItemView galleryBrowserExternalItemView = (GalleryBrowserExternalItemView) view;
        czaz czazVar = (czaz) obj;
        int i = czazVar.c;
        if (i == 3) {
            cyye.b(galleryBrowserExternalItemView, czazVar, new View.OnClickListener() { // from class: cyyh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.a.d.a();
                }
            });
        } else if (i == 7) {
            cyye.b(galleryBrowserExternalItemView, czazVar, new View.OnClickListener() { // from class: cyyj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cyye cyyeVar = this.a.a.c.a;
                    emsj emsjVar = emsj.EXPAND;
                    cyyeVar.a = true;
                    czav czavVar = (czav) cyyeVar.g.b();
                    ea eaVar = cyyeVar.l;
                    czavVar.j = czavVar.i.f().toEpochMilli();
                    if (czavVar.h.a()) {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                        intent.putExtra("mimeTypes", bats.c);
                        intent.putExtra("android.intent.extra.LOCAL_ONLY", false);
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("*/*");
                        eaVar.startActivityForResult(intent, 1400);
                    } else {
                        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*"});
                        intent2.putExtra("mimeTypes", bats.a);
                        intent2.putExtra("android.intent.extra.LOCAL_ONLY", false);
                        intent2.addCategory("android.intent.category.OPENABLE");
                        intent2.setType("image/*");
                        eaVar.startActivityForResult(intent2, 1400);
                    }
                    fcsu fcsuVar = cyyeVar.f;
                    ((aisc) fcsuVar.b()).d(emsp.EXTERNAL, emsr.EXPANDED, emsjVar, emsl.UNKNOWN_OPENING_STATE, 0, Duration.ofMillis(0L));
                }
            });
        } else {
            if (i != 11) {
                return;
            }
            cyye.b(galleryBrowserExternalItemView, czazVar, new View.OnClickListener() { // from class: cyyi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.a.d.b();
                }
            });
        }
    }

    @Override // defpackage.ehcx
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((GalleryBrowserExternalItemView) view).setOnClickListener(null);
    }
}
