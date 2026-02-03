package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdqc {
    public static final fdpl a(fdpl fdplVar) {
        return fdpn.a(fdplVar, -1, 2);
    }

    public static final fdpl b(fdpl fdplVar, fcyh fcyhVar) {
        if (fcyhVar.get(fdlr.c) == null) {
            return !fdbq.f(fcyhVar, fcyi.a) ? fdplVar instanceof fdww ? fdwv.a((fdww) fdplVar, fcyhVar, 0, 0, 6) : new fdwb(fdplVar, fcyhVar, 0, 0, 12) : fdplVar;
        }
        Objects.toString(fcyhVar);
        throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(fcyhVar)));
    }
}
