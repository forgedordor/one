package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryRecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czet extends cywp {
    private final cywo b;
    public final AttachmentQueueState z;

    protected czet(AttachmentQueueState attachmentQueueState) {
        cywo cywoVar = new cywo() { // from class: czes
            @Override // defpackage.cywo
            public final void a(AttachmentQueueState attachmentQueueState2) {
                int iF;
                boolean zL;
                TextView textView;
                uig uigVar;
                FullscreenGalleryRecyclerView fullscreenGalleryRecyclerView = this.a.a;
                if (fullscreenGalleryRecyclerView == null) {
                    return;
                }
                int iL = fullscreenGalleryRecyclerView.ab.L();
                int iM = fullscreenGalleryRecyclerView.ab.M();
                ArrayList<View> arrayList = new ArrayList();
                if (iL >= 0) {
                    while (iL <= iM) {
                        wv wvVarI = fullscreenGalleryRecyclerView.i(iL);
                        if (wvVarI != null) {
                            arrayList.add(wvVarI.a);
                        }
                        iL++;
                    }
                }
                for (View view : arrayList) {
                    if (view instanceof SelectableContentItemView) {
                        final SelectableContentItemView selectableContentItemView = (SelectableContentItemView) view;
                        if (!((Boolean) ccze.m.e()).booleanValue() || (uigVar = selectableContentItemView.j) == null) {
                            iF = attachmentQueueState2.f(selectableContentItemView.i);
                            zL = attachmentQueueState2.l(selectableContentItemView.i);
                        } else {
                            iF = attachmentQueueState2.e(uigVar);
                            zL = attachmentQueueState2.k(selectableContentItemView.j);
                        }
                        selectableContentItemView.n = iF;
                        if (iF != -1 && (textView = selectableContentItemView.g) != null) {
                            textView.setText(Integer.toString(iF + 1));
                        }
                        if (selectableContentItemView.m != zL) {
                            selectableContentItemView.m = zL;
                            TextView textView2 = selectableContentItemView.g;
                            if (textView2 != null && selectableContentItemView.h != null) {
                                textView2.clearAnimation();
                                if (selectableContentItemView.m) {
                                    selectableContentItemView.f.g(selectableContentItemView, 0.88f);
                                    selectableContentItemView.f.d(selectableContentItemView.g, 0, null);
                                    selectableContentItemView.f.b(selectableContentItemView.h, selectableContentItemView.k, selectableContentItemView.l);
                                } else {
                                    selectableContentItemView.f.g(selectableContentItemView, 1.0f);
                                    selectableContentItemView.f.d(selectableContentItemView.g, 8, new Runnable() { // from class: czeu
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            SelectableContentItemView selectableContentItemView2 = selectableContentItemView;
                                            if (selectableContentItemView2.m) {
                                                selectableContentItemView2.f.d(selectableContentItemView2.g, 0, null);
                                            }
                                        }
                                    });
                                    selectableContentItemView.f.b(selectableContentItemView.h, selectableContentItemView.l, selectableContentItemView.k);
                                }
                            }
                        }
                    }
                }
            }

            @Override // defpackage.cywo
            public final /* synthetic */ void b() {
            }
        };
        this.b = cywoVar;
        this.z = attachmentQueueState;
        attachmentQueueState.h(cywoVar);
    }

    public final void f(uig uigVar, boolean z, int i) {
        if (z) {
            AttachmentQueueState attachmentQueueState = this.z;
            attachmentQueueState.getClass();
            attachmentQueueState.n(uigVar);
        } else {
            AttachmentQueueState attachmentQueueState2 = this.z;
            attachmentQueueState2.getClass();
            MediaContentItem mediaContentItemG = AttachmentQueueState.g(uigVar);
            mediaContentItemG.getClass();
            attachmentQueueState2.o(mediaContentItemG);
        }
    }

    @Deprecated
    public final void g(MediaContentItem mediaContentItem, boolean z) {
        if (z) {
            AttachmentQueueState attachmentQueueState = this.z;
            attachmentQueueState.getClass();
            attachmentQueueState.m(mediaContentItem);
        } else {
            AttachmentQueueState attachmentQueueState2 = this.z;
            attachmentQueueState2.getClass();
            attachmentQueueState2.o(mediaContentItem);
        }
    }
}
