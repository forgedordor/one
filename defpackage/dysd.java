package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dysd {
    public static final String a = "dysd";
    public final fr b;
    public final eg c;
    private final Context d;
    private final dyru e;

    public dysd(Context context, fr frVar, dyru dyruVar, eg egVar) {
        this.d = context.getApplicationContext();
        this.b = frVar;
        this.e = dyruVar;
        this.c = egVar;
        dysc dyscVarB = b(frVar);
        if (dyscVarB != null) {
            a(dyscVarB);
        }
    }

    public static final dysc b(fr frVar) {
        return (dysc) frVar.h(a);
    }

    public final void a(dysc dyscVar) {
        dyro dyroVar = (dyro) this.e;
        dyscVar.ai = dyroVar.a;
        dyud dyudVarA = dyroVar.b;
        dyuo dyuoVar = ((dyrs) dyudVarA).b;
        ejwi ejwiVar = ((dyuh) dyuoVar).e;
        if (ejwiVar.g()) {
            dyscVar.am = ((dyur) ejwiVar.c()).a;
        } else {
            Context context = this.d;
            dyscVar.am = new Runnable() { // from class: dyrv
                @Override // java.lang.Runnable
                public final void run() {
                }
            };
            dyrr dyrrVar = new dyrr(dyudVarA);
            dyug dyugVar = new dyug(dyuoVar);
            dyugVar.b(dyus.a(context, dyscVar.am));
            dyrrVar.b = dyugVar.e();
            dyudVarA = dyrrVar.a();
        }
        dyscVar.aj = dyudVarA;
        dyscVar.al = true;
        dyscVar.ag.b();
    }
}
