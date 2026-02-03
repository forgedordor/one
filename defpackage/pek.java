package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pek extends pfl {
    private final Callable j;

    public pek(pex pexVar, pdq pdqVar, String[] strArr, Callable callable) {
        super(pexVar, pdqVar, strArr);
        this.j = callable;
    }

    @Override // defpackage.pfl
    public final Object b() {
        return ((qjz) this.j).call();
    }
}
