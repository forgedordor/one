package defpackage;

import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.doav;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docn<I, T extends doav> extends vo<dobk<T>> implements Iterable<I>, fdcn {
    private static final ekrg h = ekrg.c("com/google/android/libraries/compose/gifsticker/ui/screen/adapter/GifStickerMediaAdapter");
    public final doim a;
    public final fdat d;
    public final fdau e;
    public List f = fcvo.a;
    public String g;
    private final dobl i;
    private final dons j;

    public docn(dobl doblVar, dons donsVar, doim doimVar, fdat fdatVar, fdau fdauVar) {
        this.i = doblVar;
        this.j = donsVar;
        this.a = doimVar;
        this.d = fdatVar;
        this.e = fdauVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return this.i.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gifsticker_media_item_layout, viewGroup, false), this.j);
    }

    @Override // java.lang.Iterable
    public final Iterator<I> iterator() {
        return this.f.iterator();
    }

    @Override // defpackage.vo
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void g(final dobk dobkVar, int i) {
        dobkVar.getClass();
        try {
            donr.H(dobkVar, new docm(this, this.f.get(i), null), new fdap() { // from class: dock
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    doav doavVar = (doav) obj;
                    doavVar.getClass();
                    docn docnVar = this.a;
                    docnVar.d.a(doavVar, docnVar.g);
                    return fctx.a;
                }
            }, new donn() { // from class: docl
                @Override // defpackage.donn
                public final boolean a(Object obj, PointF pointF) {
                    return ((Boolean) this.a.e.a((doav) obj, dobkVar.a, pointF)).booleanValue();
                }
            });
        } catch (RuntimeException e) {
            ((ekrd) ((ekrd) h.i()).g(e).h("com/google/android/libraries/compose/gifsticker/ui/screen/adapter/GifStickerMediaAdapter", "onBindViewHolder", 53, "GifStickerMediaAdapter.kt")).q("Unable to resolve GIF/sticker from record.");
            dobkVar.E();
        } catch (UnknownHostException e2) {
            ((ekrd) ((ekrd) h.i()).g(e2).h("com/google/android/libraries/compose/gifsticker/ui/screen/adapter/GifStickerMediaAdapter", "onBindViewHolder", 50, "GifStickerMediaAdapter.kt")).q("Unable to resolve GIF/sticker from record.");
            dobkVar.E();
        }
    }
}
