package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter");
    public final fdjx b;
    public final fcyh c;
    public final fcsu d;
    public final xkw e;
    public final AudioManager f;
    public final crma g;
    public final afzc h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fdpl l;
    public final fcsu m;
    public final fduj n;
    public final yil o;
    private final fctc p;

    public xlm(fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, xkw xkwVar, AudioManager audioManager, crma crmaVar, afzc afzcVar, yil yilVar, @aoow fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdpl fdplVar, fcsu fcsuVar5, fduj fdujVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        audioManager.getClass();
        crmaVar.getClass();
        afzcVar.getClass();
        yilVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        this.b = fdjxVar;
        this.c = fcyhVar;
        this.d = fcsuVar;
        this.e = xkwVar;
        this.f = audioManager;
        this.g = crmaVar;
        this.h = afzcVar;
        this.o = yilVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.l = fdplVar;
        this.m = fcsuVar5;
        this.n = fdujVar;
        this.p = fctd.a(new fdae() { // from class: xkx
            @Override // defpackage.fdae
            public final Object invoke() {
                return ((xmd) this.a.d.b()).b().c;
            }
        });
    }

    public final dqfz a() {
        return (dqfz) this.p.a();
    }

    public final void b(Context context, int i) {
        Toast.makeText(context, context.getString(i), 0).show();
    }

    public final Object c(Context context, int i, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c), new xky(null, this, context, i), fcxyVar);
    }
}
