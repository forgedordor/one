package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepu {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory");
    private final fcsu b;
    private final fcsu c;

    public cepu(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    private final void b(int i) {
        ((ains) this.c.b()).e("Bugle.Tachyon.Grpc.Configuration.Create", i);
    }

    private final void c(int i, String str) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleTachygram");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.Z(eksk.MEDIUM);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/common/PhoneChannelConfigurationFactory", "logError", 88, "PhoneChannelConfigurationFactory.kt")).q(str.concat(", using default P/H channel config"));
        b(i);
    }

    public final ceog a(dggk dggkVar) throws IOException {
        ceog ceogVarB;
        eieu eieuVarH = eiiy.h("PhoneChannelConfigurationFactory#create");
        try {
            Optional optionalJ = ((dggz) this.b.b()).j(dggkVar);
            if (optionalJ.isEmpty()) {
                c(2, "Configuration is empty for msisdn");
                cczi ccziVar = ceog.a;
                ceogVarB = ceof.b();
            } else {
                final cept ceptVar = cept.a;
                Optional optionalFlatMap = optionalJ.flatMap(new Function() { // from class: ceps
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ceptVar.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                optionalFlatMap.getClass();
                String str = (String) fdct.b(optionalFlatMap);
                if (str == null || fdgn.H(str)) {
                    c(3, "Tachyon URL is empty for msisdn");
                    cczi ccziVar2 = ceog.a;
                    ceogVarB = ceof.b();
                } else {
                    List listI = ejxk.b(':').i(str);
                    if (listI.size() != 2) {
                        c(4, "Tachyon endpoint is malformed");
                    } else {
                        listI.getClass();
                        String str2 = (String) listI.get(1);
                        str2.getClass();
                        Integer numG = fdgn.g(str2);
                        if (numG == null) {
                            c(6, "Tachyon port is malformed");
                        } else if (numG.intValue() <= 0) {
                            c(5, "Tachyon port is not valid");
                        } else {
                            b(1);
                            cczi ccziVar3 = ceog.a;
                            ceogVarB = ceof.a(str);
                        }
                    }
                    cczi ccziVar4 = ceog.a;
                    ceogVarB = ceof.b();
                }
            }
            fczl.a(eieuVarH, null);
            return ceogVarB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }
}
