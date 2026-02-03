package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecyn {
    public final fcsu a;
    public final fcsu b;
    private final Activity c;
    private final fr d;

    public ecyn(eg egVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = egVar;
        this.d = egVar.a();
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final void a(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("collectionIdKey", j);
        bundle.putString("collectionTitleKey", str);
        ecyv ecyvVar = new ecyv();
        ecyvVar.at(bundle);
        b(ecyvVar, "ArtCollectionsTag");
    }

    public final void b(ea eaVar, String str) {
        fr frVar = this.d;
        cg cgVar = new cg(frVar);
        cgVar.x(R.id.content, eaVar, str);
        cgVar.B();
        cgVar.v(null);
        cgVar.j();
        frVar.al();
    }

    public final void c(long j, String str) {
        edaa edaaVar = new edaa(ejwi.j(new edjr(j)), ejwi.i(str));
        Intent intent = new Intent();
        Activity activity = this.c;
        Intent intentPutExtras = intent.setClassName(activity, "com.google.android.libraries.user.profile.photopicker.art.edit.ArtEditActivity").putExtras(activity.getIntent());
        ejwi ejwiVar = edaaVar.a;
        if (ejwiVar.g()) {
            if (((edkw) ejwiVar.c()).b() == 1) {
                intentPutExtras.putExtra("IMAGE_ID", ((edkw) ejwiVar.c()).a());
                ejwi ejwiVar2 = edaaVar.b;
                if (ejwiVar2.g()) {
                    intentPutExtras.putExtra("IMAGE_DISPLAY_NAME", (String) ejwiVar2.c());
                }
            } else {
                intentPutExtras.setData(((edkw) ejwiVar.c()).c());
            }
        }
        activity.startActivityForResult(intentPutExtras, 10000);
    }
}
