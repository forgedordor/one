package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhin {
    public static volatile String a = "CarrierServices";
    private static final Set b;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(cqnc.U, cqnc.P, ekrl.a, eksq.a)));
        b = setUnmodifiableSet;
        ekto.a(setUnmodifiableSet);
        new AtomicBoolean(false);
    }
}
