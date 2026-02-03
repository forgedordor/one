package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvzj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvzp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvzj(cvzp cvzpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvzpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvzj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cvzp cvzpVar = this.b;
            cvzpVar.g.d("has_pending_profile_photo_picker_result", false);
            afzc afzcVar = (afzc) cvzpVar.l.b();
            agfi agfiVar = new agfi("com.google.android.apps.messaging.ui.profilephotopicker");
            this.a = 1;
            obj = afzcVar.f(agfiVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        adh adhVar = (adh) obj;
        Intent intent = adhVar.b;
        Uri uri = null;
        if (intent != null) {
            if (adhVar.a != -1) {
                intent = null;
            }
            if (intent != null) {
                uri = (Uri) intent.getParcelableExtra("output");
            }
        }
        this.b.b(uri);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvzj(this.b, fcxyVar);
    }
}
