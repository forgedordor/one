package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhn extends afhp {
    final /* synthetic */ afhs a;
    private final ListenableFuture c;

    public afhn(afhs afhsVar, String str, final int i, final int i2, int i3) {
        this.a = afhsVar;
        final crqd crqdVar = (crqd) afhsVar.h.b();
        eiju eijuVarE = eiju.g(crqdVar.a(str)).i(eiid.d(new eooz() { // from class: crpw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return eijx.e(Optional.empty());
                }
                List listAr = ((eatj) optional.get()).ar();
                if (listAr == null || listAr.isEmpty()) {
                    return eijx.e(Optional.empty());
                }
                Stream streamFilter = Collection.EL.stream(listAr).filter(new Predicate() { // from class: crqa
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return true;
                    }
                });
                int i4 = ekgb.d;
                ekgb ekgbVar = (ekgb) streamFilter.collect(ekcv.a);
                if (ekgbVar.isEmpty()) {
                    return eijx.e(Optional.empty());
                }
                final int i5 = i2;
                final int i6 = i;
                crqd crqdVar2 = crqdVar;
                eauw eauwVarE = eaux.e((easz) ekgbVar.get(0));
                eatw eatwVar = (eatw) eauwVarE;
                eatwVar.a = Integer.valueOf(i6);
                eatwVar.b = Integer.valueOf(i5);
                eiju eijuVarG = eiju.g(drgi.a(((eavo) crqdVar2.d.b()).a(eauwVarE.g())));
                eooz eoozVar = new eooz() { // from class: crqb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return eijx.e(Optional.ofNullable(cqsu.e(((eauy) obj2).a(), i6, i5)));
                    }
                };
                eosc eoscVar = crqdVar2.c;
                return eijuVarG.i(eoozVar, eoscVar).e(Throwable.class, new ejvr() { // from class: crqc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ((ekrd) ((ekrd) ((ekrd) crqd.a.j()).g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPhoto", (char) 159, "PlacesMessagingClient.java")).q("Failed to get bitmap from fetch photo request.");
                        return Optional.empty();
                    }
                }, eoscVar);
            }
        }), crqdVar.c).e(Throwable.class, new ejvr() { // from class: crpx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) crqd.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPhoto", (char) 169, "PlacesMessagingClient.java")).q("Failed to get photo metadata from fetch place request.");
                return Optional.empty();
            }
        }, crqdVar.c);
        this.c = eijuVarE;
        eora afhmVar = new afhm(this, str, i3);
        eork.r(eijuVarE, ((Boolean) afhsVar.g.b()).booleanValue() ? afhmVar : auwc.a(afhmVar), afhsVar.f);
    }

    @Override // defpackage.afhp
    public final void a() {
        super.a();
        this.c.cancel(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
