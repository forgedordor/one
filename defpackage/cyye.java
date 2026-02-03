package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryRecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyye implements czat {
    public boolean a;
    public cyzt b;
    public cyyt c;
    public czah d;
    public final Context e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final GalleryBrowserActivity k;
    public final ea l;
    public final cyzj m;
    public final efwo n;
    public final fcsu o;
    public final cyzl p;
    public final egzv q = new egzv<List<czbb>>() { // from class: cyye.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cqca.p("Bugle", th, "AccountFullscreenGalleryFragmentPeer: failed to load gallery data.");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            List list = (List) obj;
            ecem.c();
            cyye cyyeVar = cyye.this;
            ehcw ehcwVar = cyyeVar.u;
            if (list == null) {
                List list2 = ehcwVar.d;
                int size = list2 == null ? 0 : list2.size();
                ehcwVar.d = null;
                ehcwVar.x(0, size);
            } else {
                List list3 = ehcwVar.d;
                if (list3 == null) {
                    ehcwVar.d = list;
                    ehcwVar.w(0, ehcwVar.d.size());
                } else {
                    int size2 = list3.size();
                    List list4 = ehcwVar.d;
                    ehcwVar.d = list;
                    if (size2 > list.size()) {
                        ehcwVar.x(list.size(), size2 - list.size());
                    } else if (size2 < list.size()) {
                        ehcwVar.w(size2, list.size() - size2);
                    }
                    int iMin = Math.min(size2, list.size());
                    List list5 = ehcwVar.d;
                    ehct ehctVar = ehcwVar.e;
                    List listSubList = list4.subList(0, iMin);
                    List listSubList2 = list5.subList(0, iMin);
                    ejvp ejvpVar = ehcwVar.a;
                    int iMin2 = Math.min(listSubList.size(), listSubList2.size());
                    for (int i = 0; i < iMin2; i++) {
                        Object obj2 = listSubList.get(i);
                        Object obj3 = listSubList2.get(i);
                        if (ejvpVar.c(obj2, obj3)) {
                            ehcs ehcsVar = ehctVar.b;
                            if (!ecei.a(obj2, obj3)) {
                                ehctVar.a.q(i);
                            }
                        } else {
                            ehcw ehcwVar2 = ehctVar.a;
                            ehcwVar2.y(i);
                            ehcwVar2.s(i);
                        }
                    }
                }
            }
            cyyeVar.k.af(emsl.LOADED);
        }

        @Override // defpackage.egzv
        public final void hn() {
        }
    };
    public final ehcx r = new cyyg(this);
    public final ehcx s = new cyyk(this);
    public final ehcx t = new cyym(this);
    public final ehcw u;
    private final fcsu v;

    public cyye(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, cyxz cyxzVar, efwo efwoVar, fcsu fcsuVar7, cyzl cyzlVar) {
        ejvr ejvrVar = new ejvr() { // from class: cyya
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                czbb czbbVar = (czbb) obj;
                boolean z = czbbVar instanceof czbd;
                cyye cyyeVar = this.a;
                if (z) {
                    return cyyeVar.r;
                }
                if (czbbVar instanceof czaz) {
                    return czbbVar.c == 2 ? cyyeVar.t : cyyeVar.s;
                }
                throw new IllegalStateException();
            }
        };
        ejvr ejvrVar2 = new ejvr() { // from class: cyyb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Integer.valueOf(((czbb) obj).a());
            }
        };
        ejwl.m(true, "Equivalence is already set.");
        this.u = new ehcw(ejvrVar, new ejvs(ejvrVar2, ejvm.a));
        this.e = context;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.v = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.l = cyxzVar;
        this.n = efwoVar;
        this.o = fcsuVar7;
        this.p = cyzlVar;
        this.m = new cyzj(cyxzVar);
        this.k = (GalleryBrowserActivity) cyxzVar.G();
    }

    static void b(View view, czaz czazVar, View.OnClickListener onClickListener) {
        view.setOnClickListener(onClickListener);
        view.setBackgroundResource(R.drawable.compose2o_tile_background);
        ((ImageView) view.findViewById(R.id.gallery_external_item_icon)).setImageResource(czazVar.b);
        ((TextView) view.findViewById(R.id.gallery_external_item_text)).setText(czazVar.a);
    }

    public final void a(ejxr ejxrVar, Bundle bundle) {
        czai czaiVar = (czai) this.v.b();
        cyys cyysVar = new cyys(this);
        fcsu fcsuVar = czaiVar.a;
        cyzl cyzlVar = this.p;
        AttachmentQueueState attachmentQueueState = ((cyvb) this.k).n;
        cyyt cyytVar = this.c;
        long j = cyzlVar.b;
        Context context = (Context) fcsuVar.b();
        context.getClass();
        ((uis) czaiVar.b.b()).getClass();
        cogw cogwVar = (cogw) czaiVar.c.b();
        cogwVar.getClass();
        acgu acguVar = (acgu) czaiVar.d.b();
        acguVar.getClass();
        crma crmaVar = (crma) czaiVar.e.b();
        crmaVar.getClass();
        eosc eoscVar = (eosc) czaiVar.g.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) czaiVar.h.b();
        eoscVar2.getClass();
        dakl daklVar = (dakl) czaiVar.i.b();
        daklVar.getClass();
        srx srxVar = (srx) czaiVar.j.b();
        srxVar.getClass();
        abvt abvtVar = (abvt) czaiVar.k.b();
        abvtVar.getClass();
        abvt abvtVar2 = (abvt) czaiVar.l.b();
        abvtVar2.getClass();
        ea eaVar = this.l;
        eaVar.getClass();
        attachmentQueueState.getClass();
        cyytVar.getClass();
        fcsu fcsuVar2 = czaiVar.m;
        this.d = new czah(context, cogwVar, acguVar, crmaVar, czaiVar.f, eoscVar, eoscVar2, daklVar, srxVar, abvtVar, abvtVar2, eaVar, cyysVar, attachmentQueueState, cyytVar, j, ejxrVar);
        FullscreenGalleryRecyclerView fullscreenGalleryRecyclerView = (FullscreenGalleryRecyclerView) eaVar.N().findViewById(R.id.full_screen_gallery_recycler_view);
        czah czahVar = this.d;
        czahVar.a = fullscreenGalleryRecyclerView;
        if (bundle != null) {
            czahVar.q = (Uri) bundle.getParcelable("media_uri");
            int i = bundle.getInt("media_type");
            int[] iArr = {1, 2};
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= 2) {
                    break;
                }
                int i4 = iArr[i3];
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == i) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
            czahVar.y = i2;
            czahVar.r = bundle.getString("media_content_type");
            String string = bundle.getString("media_file");
            if (string != null) {
                czahVar.s = new File(string);
            }
        }
    }

    final void c() {
        GalleryBrowserActivity galleryBrowserActivity = this.k;
        int iC = ((cyvb) galleryBrowserActivity).n.c(GalleryContentItem.class);
        int color = iC > 0 ? galleryBrowserActivity.getColor(R.color.primary_brand_non_icon_color) : cpds.a(galleryBrowserActivity, android.R.attr.colorControlNormal);
        SpannableString spannableString = new SpannableString(iC > 0 ? galleryBrowserActivity.getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection, iC, Integer.valueOf(iC)) : galleryBrowserActivity.getResources().getString(R.string.mediapicker_gallery_title));
        spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 18);
        cukg.b(galleryBrowserActivity.k(), spannableString);
        Drawable drawable = galleryBrowserActivity.getDrawable(R.drawable.quantum_ic_arrow_back_black_24);
        if (drawable != null) {
            drawable.setTint(color);
            im imVarK = galleryBrowserActivity.k();
            if (imVarK != null) {
                imVarK.setHomeAsUpIndicator(drawable);
            }
        }
    }
}
