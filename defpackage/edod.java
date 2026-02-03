package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edod extends lxd {
    public static final ekrg a = ekrg.c("com/google/android/libraries/user/profile/photopicker/edit/viewmodel/EditViewModel");
    public static final eure b;
    public final eddo c;
    public final eosc d;
    public final edds e;
    public final edoa f;
    public final ejxm g;
    public final lvy h;
    public final AtomicBoolean i;

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

    public edod(eddo eddoVar, eosc eoscVar, edds eddsVar, ejxm ejxmVar) {
        edny ednyVar = new edny();
        ednyVar.a = 1;
        this.h = new lvy(ednyVar.a());
        this.i = new AtomicBoolean(false);
        this.c = eddoVar;
        this.d = eoscVar;
        this.e = eddsVar;
        this.f = new edoa();
        this.g = ejxmVar;
    }
}
