package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crqd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient");
    public final List b = Arrays.asList(eatg.ID, eatg.TYPES, eatg.FORMATTED_ADDRESS, eatg.DISPLAY_NAME, eatg.LOCATION);
    public final eosc c;
    public final fcsu d;

    public crqd(eosc eoscVar, fcsu fcsuVar) {
        this.c = eoscVar;
        this.d = fcsuVar;
    }

    public final eiju a(String str) {
        eiju eijuVarG = eiju.g(drgi.a(((eavo) this.d.b()).b(eava.f(str, this.b).c())));
        eooz eoozVar = new eooz() { // from class: crpu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eijx.e(Optional.ofNullable(((eavb) obj).a()));
            }
        };
        eosc eoscVar = this.c;
        return eijuVarG.i(eoozVar, eoscVar).e(Throwable.class, new ejvr() { // from class: crpv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) crqd.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPlace", ']', "PlacesMessagingClient.java")).q("Failed to get place from fetch place request.");
                return Optional.empty();
            }
        }, eoscVar);
    }
}
