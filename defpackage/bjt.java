package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjt {
    public static final Set a = DesugarCollections.unmodifiableSet(EnumSet.of(bhx.PASSIVE_FOCUSED, bhx.PASSIVE_NOT_FOCUSED, bhx.LOCKED_FOCUSED, bhx.LOCKED_NOT_FOCUSED));
    public static final Set b = DesugarCollections.unmodifiableSet(EnumSet.of(bhy.CONVERGED, bhy.UNKNOWN));
    public static final Set c;
    public static final Set d;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(EnumSet.of(bhw.CONVERGED, bhw.FLASH_REQUIRED, bhw.UNKNOWN));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(bhw.FLASH_REQUIRED);
        enumSetCopyOf.remove(bhw.UNKNOWN);
        d = DesugarCollections.unmodifiableSet(enumSetCopyOf);
    }
}
