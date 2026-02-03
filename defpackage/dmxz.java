package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxz extends fcyz implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ hox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmxz(hox hoxVar, hox hoxVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = hoxVar;
        this.b = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmxz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC = dmyf.c(this.a);
        if (embeddedPhotoPickerSessionC != null) {
            embeddedPhotoPickerSessionC.notifyPhotoPickerExpanded(dmyf.l(this.b));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmxz(this.a, this.b, fcxyVar);
    }
}
