package defpackage;

import j$.util.Optional;
import j$.util.OptionalLong;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coyg implements coyd {
    public static final Long a = 10485760L;
    public static final Long b = 20971520L;
    public final fcsu c;
    private final fcsu d;
    private final dggl e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public coyg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, dggl dgglVar) {
        this.d = fcsuVar;
        this.e = dgglVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.c = fcsuVar5;
    }

    @Override // defpackage.coyd
    public final Optional a(Optional optional, final OptionalLong optionalLong) {
        String str = ((Boolean) this.f.b()).booleanValue() ? (String) this.g.b() : ((Boolean) this.h.b()).booleanValue() ? "https://rcs-copper-dynamic.sandbox.googleapis.com" : null;
        if (str != null) {
            return Optional.of(str);
        }
        return ((dggz) this.d.b()).j(this.e.a(((aubq) optional.orElseThrow()).d)).map(new Function() { // from class: coye
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = ((dgiq) obj).o().mFtHttpContentServerUri;
                if (!((aral) this.a.c.b()).a()) {
                    return str2;
                }
                OptionalLong optionalLong2 = optionalLong;
                int i = efvm.b;
                efvm efvmVar = new efvm(Arrays.asList("rcs-copper-optimized-eu.googleapis.com", "rcs-copper-optimized-us.googleapis.com", "rcs-copper-optimized-ap.googleapis.com"));
                int i2 = 0;
                if (optionalLong2.isPresent() && optionalLong2.getAsLong() > 0) {
                    long asLong = optionalLong2.getAsLong();
                    coyf coyfVar = coyf.b;
                    if (asLong > coyfVar.d) {
                        i2 = coyfVar.c;
                    } else {
                        long asLong2 = optionalLong2.getAsLong();
                        coyf coyfVar2 = coyf.a;
                        if (asLong2 > coyfVar2.d) {
                            i2 = coyfVar2.c;
                        }
                    }
                }
                if (str2 == null) {
                    return str2;
                }
                try {
                    eomp eompVarA = eomo.a(str2);
                    eompVarA.a();
                    return (!efvmVar.a.contains(ejuf.c(eompVarA.a().a)) || i2 <= 0) ? str2 : str2.replace("rcs-copper-optimized-eu", a.g(i2, "rcs-copper-eu-")).replace("rcs-copper-optimized-us", a.g(i2, "rcs-copper-us-")).replace("rcs-copper-optimized-ap", a.g(i2, "rcs-copper-ap-"));
                } catch (IllegalStateException unused) {
                    return str2;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
