package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmyc extends fcyz implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ hox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmyc(hox hoxVar, hox hoxVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = hoxVar;
        this.b = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmyc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC = dmyf.c(this.a);
        if (embeddedPhotoPickerSessionC != null) {
            hox hoxVar = this.b;
            embeddedPhotoPickerSessionC.notifyResized((int) (dmyf.a(hoxVar) >> 32), (int) (dmyf.a(hoxVar) & 4294967295L));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmyc(this.a, this.b, fcxyVar);
    }
}
