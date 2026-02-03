package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crru {
    public static final cczi a = cdag.e(cdag.b, "rcs_service_connection_timeout_seconds", 60);
    public static final eksp b = eksp.c("ConnectedRcsService");
    private final Context c;
    private final eosd d;
    private final eosc e;

    public crru(Context context, eosd eosdVar, eosc eoscVar) {
        this.c = context;
        this.d = eosdVar;
        this.e = eoscVar;
    }

    public final eiju a(BiFunction biFunction, final Class cls) {
        eiju eijuVarD;
        final crrt crrtVar = new crrt();
        try {
            final efaj efajVar = (efaj) biFunction.apply(this.c, crrtVar);
            if (dfog.L()) {
                ((eksl) b.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory", "connectToInstance", 144, "ConnectedRcsServiceFactory.java")).t("connectToInstance() start for rcsService %s", efajVar);
                eijuVarD = eijx.h(new eooy() { // from class: crrs
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        cczi ccziVar = crru.a;
                        final efaj efajVar2 = efajVar;
                        final crrt crrtVar2 = crrtVar;
                        final Class cls2 = cls;
                        return eiju.g(kol.a(new koi() { // from class: crrr
                            @Override // defpackage.koi
                            public final Object a(kog kogVar) {
                                cczi ccziVar2 = crru.a;
                                crrt crrtVar3 = crrtVar2;
                                efaj efajVar3 = efajVar2;
                                Class cls3 = cls2;
                                try {
                                    ((eksl) crru.b.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory", "connectToInstance", 151, "ConnectedRcsServiceFactory.java")).t("connectToInstance() try serviceListener.init for rcsService %s and completer", efajVar3);
                                    crrtVar3.b = efajVar3;
                                    crrtVar3.a = kogVar;
                                    if (efajVar3.connect()) {
                                        return "Connected RCS Service";
                                    }
                                    crrtVar3.a.c(new crsk(cls3.getName(), efap.UNKNOWN));
                                    return "Connected RCS Service";
                                } catch (SecurityException e) {
                                    cqca.p("Bugle", e, "ConnectedRcsService: Can't connect to rcsService");
                                    crrtVar3.a.c(e);
                                    return "Connected RCS Service";
                                }
                            }
                        }));
                    }
                }, this.e);
            } else {
                eksl ekslVar = (eksl) b.i();
                ekslVar.V(10, TimeUnit.MINUTES);
                ekslVar.Z(eksk.MEDIUM);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory", "connectToInstance", 138, "ConnectedRcsServiceFactory.java")).t("DualRegSip is disabled, nothing should connect to %s", cls);
                eijuVarD = eijx.d(new efak());
            }
        } catch (Exception e) {
            cqca.p("Bugle", e, "ConnectedRcsService: Unsupported service class ".concat(cls.toString()));
            eijuVarD = eijx.d(new IllegalArgumentException("Unsupported service class ".concat(cls.toString())));
        }
        return eijuVarD.j(((Integer) a.e()).intValue(), TimeUnit.SECONDS, this.d);
    }
}
