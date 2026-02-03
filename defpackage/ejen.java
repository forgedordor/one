package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejen {
    public static final void a(final ejfj ejfjVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(525199176);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(ejfjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            Bitmap bitmap = (Bitmap) ejfjVar.m.a();
            final fdci fdciVar = new fdci();
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(new kjg(0L), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hmwVar.ab();
            fdciVar.a = (hox) objS;
            if (bitmap != null) {
                dnc.b(new iif(bitmap), null, iye.a(egq.c(ics.e, 1.0f), new fdap() { // from class: ejel
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        int i4;
                        int i5;
                        fdci fdciVar2 = fdciVar;
                        kjg kjgVar = (kjg) obj;
                        long j = ((kjg) ((hox) fdciVar2.a).a()).a;
                        if (kjgVar == null || !kjg.e(kjgVar.a, j)) {
                            ejfj ejfjVar2 = ejfjVar;
                            ((hox) fdciVar2.a).b(kjgVar);
                            long j2 = kjgVar.a;
                            ejgh ejghVar = new ejgh((int) (j2 >> 32), (int) (j2 & 4294967295L));
                            ekrg ekrgVar = ejfjVar2.e;
                            ((ekrd) ekrgVar.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onImageLoaded", 199, "EmotifyViewModel.kt")).q("ViewModel onImageLoaded");
                            if (ejfjVar2.f.c() == ejfe.a && (i4 = ejghVar.b) > 0 && (i5 = ejghVar.a) > 0) {
                                ((ekrd) ekrgVar.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onImageLoaded", 204, "EmotifyViewModel.kt")).q("ViewModel starting segmentation");
                                Object objA = ejfjVar2.m.a();
                                if (objA == null) {
                                    throw new IllegalArgumentException("onImageLoaded call is expecting non-null _selectedImageState.value.");
                                }
                                Bitmap bitmap2 = (Bitmap) objA;
                                float f = i4;
                                float f2 = i5;
                                ejfjVar2.n = ((float) bitmap2.getHeight()) / ((float) bitmap2.getWidth()) > f / f2 ? new ejgh((int) (bitmap2.getWidth() * (f / bitmap2.getHeight())), i4) : new ejgh(i5, (int) (bitmap2.getHeight() * (f2 / bitmap2.getWidth())));
                                ((ekrd) ekrgVar.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "segmentImage", 256, "EmotifyViewModel.kt")).q("ViewModel trying to enqueue task on the background thread for segmenter");
                                Object objB = ejfjVar2.b.b();
                                objB.getClass();
                                fdil.d((fdjx) objB, null, null, new ejfi(ejfjVar2, bitmap2, null), 3);
                            }
                        }
                        return fctx.a;
                    }
                }), null, null, hmlVarC, 48, 248);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejem
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ejen.a(ejfjVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
