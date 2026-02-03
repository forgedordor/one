package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czeo extends czen {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.czen
    public final void a(emoo emooVar) {
        emss emssVarB = b();
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emopVar.d = emssVarB;
        emopVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public abstract emss b();
}
