package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acan implements acad {
    public final acac a;
    public final fcsu b;
    public final eygg c;
    private final Activity d;
    private final eigp e;
    private final eygg f;

    public acan(Activity activity, eigp eigpVar, acac acacVar, eygg eyggVar, fcsu fcsuVar, eygg eyggVar2) {
        this.d = activity;
        this.e = eigpVar;
        this.a = acacVar;
        this.f = eyggVar;
        this.b = fcsuVar;
        this.c = eyggVar2;
    }

    @Override // defpackage.acad
    public final dyit a() {
        final abwv abwvVar;
        final int i;
        int i2;
        eygg eyggVar = this.f;
        if (((Optional) eyggVar.b()).isPresent() && ((abdk) ((Optional) eyggVar.b()).get()).m()) {
            abwvVar = abwv.CHOOOSE_TEXTING_MODE;
            i = 6;
            i2 = R.string.account_menu_choose_texting_mode;
        } else {
            abwvVar = abwv.DEVICE_PAIRING;
            i = 5;
            i2 = R.string.account_menu_device_pairing;
        }
        Activity activity = this.d;
        dyis dyisVarK = dyit.k();
        dyisVarK.b(activity.getString(i2));
        Drawable drawableA = ku.a(activity, R.drawable.quantum_gm_ic_devices_vd_theme_24);
        drawableA.getClass();
        dyij dyijVar = (dyij) dyisVarK;
        dyijVar.b = drawableA;
        dyijVar.d = new eifs(this.e, "com/google/android/apps/messaging/gaia/customactions/devicepairing/DevicePairingPlugin", "getSpec", 70, "Clicked device pairing", new View.OnClickListener() { // from class: acal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acan acanVar = this.a;
                ((abwy) acanVar.b.b()).a(new abww(abwvVar));
                acanVar.a.a(i);
            }
        });
        dyijVar.e = new acam(this);
        return dyisVarK.d();
    }
}
