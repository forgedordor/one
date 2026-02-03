package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dorv extends fcyz implements fdat {
    int a;
    final /* synthetic */ dosd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dorv(dosd dosdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dosdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dorv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dose doseVar = this.b.aj;
            if (doseVar == null) {
                fdbq.c("preferences");
                doseVar = null;
            }
            this.a = 1;
            adhb adhbVar = (adhb) doseVar;
            obj = fdin.a(eicg.a(adhbVar.b), new adgx(null, adhbVar), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            final dosd dosdVar = this.b;
            Button buttonA = dosdVar.aZ().a();
            String string = buttonA.getResources().getString(R.string.gallery_google_photos_option_tray_button_just_once);
            string.getClass();
            dorr.a(buttonA, string);
            buttonA.setOnClickListener(new View.OnClickListener() { // from class: doro
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dosd dosdVar2 = dosdVar;
                    fdil.d(lvk.a(dosdVar2), null, null, new dosa(dosdVar2, null), 3);
                }
            });
            Button buttonB = dosdVar.aZ().b();
            String string2 = buttonB.getResources().getString(R.string.gallery_google_photos_option_tray_button_always);
            string2.getClass();
            dorr.a(buttonB, string2);
            buttonB.setOnClickListener(new View.OnClickListener() { // from class: dorp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dosd dosdVar2 = dosdVar;
                    fdil.d(lvk.a(dosdVar2), null, null, new dosc(dosdVar2, null), 3);
                }
            });
        } else {
            final dosd dosdVar2 = this.b;
            Button buttonA2 = dosdVar2.aZ().a();
            String string3 = buttonA2.getResources().getString(R.string.gallery_google_photos_option_tray_button_cancel);
            string3.getClass();
            dorr.a(buttonA2, string3);
            buttonA2.setOnClickListener(new View.OnClickListener() { // from class: dork
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dosd dosdVar3 = dosdVar2;
                    fdil.d(lvk.a(dosdVar3), null, null, new dorw(dosdVar3, null), 3);
                }
            });
            Button buttonB2 = dosdVar2.aZ().b();
            String string4 = buttonB2.getResources().getString(R.string.gallery_google_photos_option_tray_button_add);
            string4.getClass();
            dorr.a(buttonB2, string4);
            buttonB2.setOnClickListener(new View.OnClickListener() { // from class: dorl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dosd dosdVar3 = dosdVar2;
                    fdil.d(lvk.a(dosdVar3), null, null, new dory(dosdVar3, null), 3);
                }
            });
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dorv(this.b, fcxyVar);
    }
}
