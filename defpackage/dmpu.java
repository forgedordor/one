package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmpu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmpw b;
    final /* synthetic */ Uri c;
    final /* synthetic */ azg d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmpu(dmpw dmpwVar, Uri uri, azg azgVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmpwVar;
        this.c = uri;
        this.d = azgVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmpu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmpw dmpwVar = this.b;
            Uri uri = this.c;
            azg azgVar = this.d;
            int i2 = this.e;
            dogz dogzVar = dmpw.a;
            dmbx dmbxVarA = dmpwVar.a(azgVar, i2);
            this.a = 1;
            obj = dmpwVar.c.b(dogzVar, uri, dmbxVarA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return (dojr) obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmpu(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
