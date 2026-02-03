package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic");
    public final crqv b;
    public final eosc c;
    public final cmlb d;
    public final cebq e;
    public final cebf f;
    public final eosc g;
    public final eosc h;
    private final cpdm i;
    private final crsg j;

    public cpdk(crqv crqvVar, cpdm cpdmVar, crsg crsgVar, eosc eoscVar, cmlb cmlbVar, cebq cebqVar, cebf cebfVar, eosc eoscVar2, eosc eoscVar3) {
        this.b = crqvVar;
        this.i = cpdmVar;
        this.j = crsgVar;
        this.c = eoscVar;
        this.d = cmlbVar;
        this.e = cebqVar;
        this.f = cebfVar;
        this.g = eoscVar2;
        this.h = eoscVar3;
    }

    public static boolean c() {
        return ((Boolean) ccze.U.e()).booleanValue();
    }

    public final boolean a() {
        return this.i.f();
    }

    @Deprecated
    public final boolean b() {
        crsg crsgVar = this.j;
        if (!((crqv) crsgVar.b.b()).q("fast_track_prompt_dismissed", false)) {
            return crsgVar.a();
        }
        cqbd cqbdVarA = crsg.a.a();
        cqbdVarA.I("Don't show Google ToS popup because it's dismissed");
        cqbdVarA.r();
        return false;
    }

    public final boolean d() {
        return this.b.q("should_show_google_tos_prompt", false);
    }
}
