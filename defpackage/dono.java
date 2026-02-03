package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dono implements rti {
    final /* synthetic */ donr a;
    final /* synthetic */ dohs b;
    final /* synthetic */ dohs c;

    public dono(donr donrVar, dohs dohsVar, dohs dohsVar2) {
        this.a = donrVar;
        this.b = dohsVar;
        this.c = dohsVar2;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        ekrd ekrdVar = (ekrd) donr.s.j();
        Throwable runtimeException = rhsVar;
        if (rhsVar == null) {
            runtimeException = new RuntimeException("Glide failed with null exception");
        }
        ekrd ekrdVar2 = (ekrd) ekrdVar.g(runtimeException).h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$$inlined$simpleGlideListener$1", "onLoadFailed", 133, "MediaViewHolder.kt");
        donr donrVar = this.a;
        ekrdVar2.D("Failed to load %s with media=%s", donrVar.w, this.b);
        donrVar.E();
        return false;
    }

    @Override // defpackage.rti
    public final boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        ((ekrd) donr.s.f().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$$inlined$simpleGlideListener$1", "onResourceReady", 137, "MediaViewHolder.kt")).t("Successfully rendered media=%s", this.c);
        return false;
    }
}
