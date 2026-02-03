package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dxun extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evce evceVar = (evce) obj;
        switch (evceVar) {
            case IMPORTANCE_UNSPECIFIED:
                return evgx.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return evgx.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return evgx.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return evgx.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return evgx.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return evgx.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return evgx.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(evceVar.toString()));
        }
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evgx evgxVar = (evgx) obj;
        switch (evgxVar) {
            case IMPORTANCE_UNSPECIFIED:
                return evce.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return evce.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return evce.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return evce.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return evce.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return evce.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return evce.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(evgxVar.toString()));
        }
    }
}
