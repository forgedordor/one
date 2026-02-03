package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class entn implements evsv {
    static final evsv a = new entn();

    private entn() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ento entoVar;
        switch (i) {
            case 0:
                entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED;
                break;
            case 1:
                entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_REPHRASE;
                break;
            case 2:
                entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_SHAKESPEARE;
                break;
            case 3:
                entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FELLOW_KID;
                break;
            case 4:
                entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_EXCITED;
                break;
            case 5:
                entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_RHYMES;
                break;
            case 6:
                entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FORMAL;
                break;
            case 7:
                entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_CONCISE;
                break;
            default:
                entoVar = null;
                break;
        }
        return entoVar != null;
    }
}
