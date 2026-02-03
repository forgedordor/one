package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyyg extends ehcx {
    final /* synthetic */ cyye a;

    public cyyg(cyye cyyeVar) {
        this.a = cyyeVar;
    }

    @Override // defpackage.ehcx
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (GalleryContentItemView) LayoutInflater.from(this.a.e).inflate(R.layout.full_screen_gallery_compose2o_gallery_item_view, viewGroup, false);
    }

    @Override // defpackage.ehcx
    public final /* synthetic */ void b(View view, Object obj) {
        boolean zL;
        final int iF;
        czbb czbbVar;
        cyye cyyeVar = this.a;
        final GalleryContentItemView galleryContentItemView = (GalleryContentItemView) view;
        czbd czbdVar = (czbd) obj;
        AttachmentQueueState attachmentQueueState = ((cyvb) cyyeVar.k).n;
        if (((Boolean) ccze.m.e()).booleanValue()) {
            GalleryContent galleryContentB = czbdVar.b(elha.GALLERY_CHOOSER);
            zL = attachmentQueueState.k(galleryContentB);
            iF = attachmentQueueState.e(galleryContentB);
            galleryContentItemView.j = galleryContentB;
        } else {
            GalleryContentItem galleryContentItemC = czbdVar.c(elha.GALLERY_CHOOSER);
            zL = attachmentQueueState.l(galleryContentItemC);
            iF = attachmentQueueState.f(galleryContentItemC);
            galleryContentItemView.i = galleryContentItemC;
        }
        galleryContentItemView.n = iF;
        galleryContentItemView.m = zL;
        galleryContentItemView.clearAnimation();
        TextView textView = galleryContentItemView.g;
        if (textView != null && galleryContentItemView.h != null) {
            if (galleryContentItemView.m) {
                textView.setText(Integer.toString(galleryContentItemView.n + 1));
                galleryContentItemView.f.f(galleryContentItemView, 0.88f);
                galleryContentItemView.g.setVisibility(0);
                galleryContentItemView.h.setBackgroundColor(galleryContentItemView.l);
            } else {
                galleryContentItemView.f.f(galleryContentItemView, 1.0f);
                galleryContentItemView.g.setVisibility(8);
                galleryContentItemView.h.setBackgroundColor(galleryContentItemView.k);
            }
        }
        galleryContentItemView.c = czbdVar;
        ehqu ehquVarP = ehqs.a(cyyeVar.e).c().q(rtj.a()).p(rqi.b());
        if (galleryContentItemView.a != null && galleryContentItemView.b != null && (czbbVar = galleryContentItemView.c) != null) {
            ehquVarP.i(((czbd) czbbVar).d).v(galleryContentItemView.a);
            Context context = galleryContentItemView.getContext();
            czbd czbdVar2 = (czbd) galleryContentItemView.c;
            long j = czbdVar2.b;
            String str = czbdVar2.a;
            ekrg ekrgVar = cpga.a;
            int i = le.m(str) ? j > 0 ? R.string.mediapicker_gallery_image_item_description : R.string.mediapicker_gallery_image_item_description_no_date : le.z(str) ? j > 0 ? R.string.mediapicker_gallery_video_item_description : R.string.mediapicker_gallery_video_item_description_no_date : le.f(str) ? j > 0 ? R.string.mediapicker_gallery_audio_item_description : R.string.mediapicker_gallery_audio_item_description_no_date : -1;
            String string = i > 0 ? context.getResources().getString(i, Long.valueOf(j * TimeUnit.SECONDS.toMillis(1L))) : null;
            if (!TextUtils.isEmpty(string)) {
                galleryContentItemView.a.setContentDescription(string);
            }
            czbb czbbVar2 = galleryContentItemView.c;
            if (czbbVar2 instanceof czbe) {
                galleryContentItemView.b.e(((czbe) czbbVar2).g);
                galleryContentItemView.b.setVisibility(0);
            } else {
                galleryContentItemView.b.setVisibility(8);
            }
        }
        galleryContentItemView.setOnClickListener(new View.OnClickListener() { // from class: cyyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cyye cyyeVar2 = this.a.a;
                czah czahVar = cyyeVar2.d;
                abvt abvtVar = czahVar.o;
                GalleryContentItemView galleryContentItemView2 = galleryContentItemView;
                uig uigVar = galleryContentItemView2.j;
                boolean z = galleryContentItemView2.m;
                adhd adhdVar = (adhd) abvtVar.a().orElse(null);
                boolean zBooleanValue = ((Boolean) ccze.m.e()).booleanValue();
                int i2 = iF;
                if (zBooleanValue && adhdVar != null) {
                    cwkb cwkbVar = czahVar.v;
                    if (((Boolean) czahVar.u.get()).booleanValue()) {
                        String str2 = ((uhv) uigVar).a;
                        if ((le.z(str2) || (((Boolean) cgwx.c.e()).booleanValue() && le.m(str2))) && !z) {
                            adhdVar.a((GalleryContent) uigVar, i2);
                            return;
                        }
                    }
                }
                cyyeVar2.d.c((GalleryContent) galleryContentItemView2.j, (GalleryContentItem) galleryContentItemView2.i, !galleryContentItemView2.m, i2);
            }
        });
    }

    @Override // defpackage.ehcx
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((GalleryContentItemView) view).setOnClickListener(null);
    }
}
