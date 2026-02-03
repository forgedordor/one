package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxu extends fcyz implements fdat {
    final /* synthetic */ hsf a;
    final /* synthetic */ hox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmxu(hsf hsfVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = hsfVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmxu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (dmyf.d(this.a) == lvb.e) {
            hox hoxVar = this.b;
            EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC = dmyf.c(hoxVar);
            if (embeddedPhotoPickerSessionC != null) {
                dmyf.k(embeddedPhotoPickerSessionC);
            }
            dmyf.g(hoxVar, null);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmxu(this.a, this.b, fcxyVar);
    }
}
