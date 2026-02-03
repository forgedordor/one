package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edau extends lxd {
    public static final ekrg a = ekrg.c("com/google/android/libraries/user/profile/photopicker/art/edit/viewmodel/ArtEditViewModel");
    public static final eure b;
    public final eddo c;
    public final eosc d;
    public final edds e;
    public final edar f;
    public final ejxm g;
    public final edim h;
    public final lvy i;
    public final AtomicBoolean j;
    public final eczz k;

    static {
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurr eurrVar = (eurr) eurs.a.createBuilder();
        exwf exwfVar = exwf.OBAKE_LOCAL_IO_SAVE_EDITED_PHOTO;
        eurrVar.copyOnWrite();
        eurs eursVar = (eurs) eurrVar.instance;
        eursVar.c = exwfVar.R;
        eursVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurs eursVar2 = (eurs) eurrVar.build();
        eursVar2.getClass();
        eureVar.d = eursVar2;
        eureVar.c = 2;
        b = (eure) eurdVar.build();
    }

    public edau(eddo eddoVar, eosc eoscVar, edds eddsVar, ejxm ejxmVar, edim edimVar, eczz eczzVar) {
        edny ednyVar = new edny();
        ednyVar.a = 1;
        this.i = new lvy(ednyVar.a());
        this.j = new AtomicBoolean(false);
        this.c = eddoVar;
        this.d = eoscVar;
        this.e = eddsVar;
        this.f = new edar();
        this.g = ejxmVar;
        this.h = edimVar;
        this.k = eczzVar;
    }

    public final lvv a() {
        return this.h.g;
    }

    @Override // defpackage.lxd
    protected final void fC() {
        edim edimVar = this.h;
        if (edimVar.f != null) {
            edimVar.f.cancel(true);
        }
    }
}
