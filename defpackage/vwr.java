package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwr implements eyif {
    public static vwo a(lwn lwnVar) {
        vwo vwoVar;
        Integer num = (Integer) lwnVar.b("COMPOSE_ROW_MODE");
        if (num != null) {
            vwoVar = vwo.values()[num.intValue()];
        } else {
            vwoVar = null;
        }
        if (vwoVar == null) {
            throw new IllegalStateException("Screen did not set ComposeRowMode");
        }
        ekrw ekrwVarE = vwq.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/mode/ComposeRowModeModule", "provideComposeRowMode", 25, "ComposeRowModeModule.kt")).t("Using compose row mode %s", vwoVar);
        return vwoVar;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
