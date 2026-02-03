package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evcd implements evsv {
    static final evsv a = new evcd();

    private evcd() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        evce evceVar;
        switch (i) {
            case 0:
                evceVar = evce.IMPORTANCE_UNSPECIFIED;
                break;
            case 1:
                evceVar = evce.IMPORTANCE_NONE;
                break;
            case 2:
                evceVar = evce.IMPORTANCE_DEFAULT;
                break;
            case 3:
                evceVar = evce.IMPORTANCE_HIGH;
                break;
            case 4:
                evceVar = evce.IMPORTANCE_LOW;
                break;
            case 5:
                evceVar = evce.IMPORTANCE_MAX;
                break;
            case 6:
                evceVar = evce.IMPORTANCE_MIN;
                break;
            default:
                evceVar = null;
                break;
        }
        return evceVar != null;
    }
}
