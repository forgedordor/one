package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.widget.photopicker.EmbeddedPhotoPickerProviderFactory;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvi {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/cameragallery/ui/gallery/GalleryUiAdapter");
    public final dncb b;
    public final dlus c;
    public final Executor d;
    public final fdjx e;
    public final boolean f;
    public final fctc g;
    public final fctc h;
    public final fctc i;
    public final dnhr j;
    public final fctc k;

    public dmvi(final Context context, final dmbd dmbdVar, dncb dncbVar, dlus dlusVar, Executor executor, Optional optional, fdjx fdjxVar, boolean z) {
        context.getClass();
        dlusVar.getClass();
        executor.getClass();
        this.b = dncbVar;
        this.c = dlusVar;
        this.d = executor;
        this.e = fdjxVar;
        this.f = z;
        this.g = fctd.a(new fdae() { // from class: dmuv
            @Override // defpackage.fdae
            public final Object invoke() {
                return dmbdVar.a(null);
            }
        });
        this.h = fctd.a(new fdae() { // from class: dmuw
            @Override // defpackage.fdae
            public final Object invoke() {
                final ContentResolver contentResolver = context.getContentResolver();
                final fdci fdciVar = new fdci();
                final dmvd dmvdVar = new dmvd(fdciVar, new Handler(Looper.getMainLooper()));
                ouv ouvVar = new ouv(20, 0, false, 0, 0, 0, 62);
                final dmvi dmviVar = this;
                return ooy.a(new ouu(ouvVar, new fdae() { // from class: dmup
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dmvi dmviVar2 = dmviVar;
                        dmbi dmbiVar = (dmbi) dmviVar2.g.a();
                        dmbiVar.getClass();
                        dmbn dmbnVar = new dmbn(dmbiVar);
                        final ContentResolver contentResolver2 = contentResolver;
                        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        final dmvd dmvdVar2 = dmvdVar;
                        contentResolver2.registerContentObserver(uri, true, dmvdVar2);
                        contentResolver2.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, dmvdVar2);
                        fdlw.c(((fdxz) dmviVar2.e).a).hK(new fdap() { // from class: dmut
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                contentResolver2.unregisterContentObserver(dmvdVar2);
                                return fctx.a;
                            }
                        });
                        fdciVar.a = dmbnVar;
                        return dmbnVar;
                    }
                }).a, dmviVar.e);
            }
        });
        this.i = fctd.a(new fdae() { // from class: dmux
            @Override // defpackage.fdae
            public final Object invoke() {
                return EmbeddedPhotoPickerProviderFactory.create(context);
            }
        });
        this.j = (dnhr) fdct.b(optional);
        this.k = fctd.a(new fdae() { // from class: dmuy
            @Override // defpackage.fdae
            public final Object invoke() {
                return new dnbx(false, false, 15);
            }
        });
    }

    public final void a(List list, dmvc dmvcVar) {
        dmbr dmbrVar = dmbr.a;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (true) {
            dnhn dnhnVarL = null;
            if (!it.hasNext()) {
                fdil.d(this.e, null, null, new dmvh(arrayList, this, dmbrVar, dmvcVar, null), 3);
                return;
            }
            Uri uri = (Uri) it.next();
            dnhr dnhrVar = this.j;
            if (dnhrVar != null) {
                dnhnVarL = dnhrVar.l(dmbrVar, null);
            }
            arrayList.add(new fcti(uri, dnhnVarL));
        }
    }
}
