package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class chyz {
    public static chyz e(enwr enwrVar, chyx chyxVar, int i, Optional optional) {
        Optional optionalOf = Optional.of(Integer.valueOf(i));
        if (enwrVar == null) {
            enwrVar = enwr.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
        }
        return new chxy(enwrVar, chyxVar, optionalOf, optional);
    }

    public abstract chyx a();

    public abstract enwr b();

    public abstract Optional c();

    public abstract Optional d();
}
