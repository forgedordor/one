package defpackage;

import android.net.Uri;
import android.widget.photopicker.EmbeddedPhotoPickerSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmya extends fcyz implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ hox b;
    final /* synthetic */ hsf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmya(hox hoxVar, hox hoxVar2, hsf hsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = hoxVar;
        this.b = hoxVar2;
        this.c = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmya) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        hox hoxVar = this.a;
        if (dmyf.c(hoxVar) != null) {
            hox hoxVar2 = this.b;
            List list = (List) hoxVar2.a();
            hsf hsfVar = this.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!dmyf.f(hsfVar).contains((dojv) obj2)) {
                    arrayList.add(obj2);
                }
            }
            hoxVar2.b(dmyf.f(hsfVar));
            if (!arrayList.isEmpty()) {
                ((ekrd) dmyf.e().h().h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt$EmbeddedGallery$5$1", "invokeSuspend", 156, "EmbeddedGallery.kt")).r("Revoking URI permission for %s media", arrayList.size());
                EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC = dmyf.c(hoxVar);
                if (embeddedPhotoPickerSessionC != null) {
                    ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Uri.parse(((dojv) it.next()).f()));
                    }
                    embeddedPhotoPickerSessionC.requestRevokeUriPermission(arrayList2);
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmya(this.a, this.b, this.c, fcxyVar);
    }
}
