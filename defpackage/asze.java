package defpackage;

import android.content.Context;
import android.telephony.ims.ImsException;
import android.telephony.ims.RcsContactPresenceTuple;
import android.telephony.ims.RcsContactUceCapability;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asze implements asxy, aszp {
    public final Context a;
    public final chwq b;
    public final asvj c;
    public final eosc d;
    public final cogw e;
    public final dewm f;
    private final Random g = new Random();
    private final awlc h;

    public asze(Context context, eosc eoscVar, chwq chwqVar, asvj asvjVar, cogw cogwVar, dewm dewmVar, awlc awlcVar) {
        this.a = context;
        this.b = chwqVar;
        this.c = asvjVar;
        this.d = eoscVar;
        this.e = cogwVar;
        this.f = dewmVar;
        this.h = awlcVar;
    }

    @Override // defpackage.asxy
    public final eiju a(Iterable iterable) {
        return eijx.d(new IllegalStateException("getBatchCapabilities not supported for SingleReg."));
    }

    @Override // defpackage.asxy
    public final eiju b(final aubq aubqVar) {
        final long jNextLong = this.g.nextLong();
        eiju eijuVarG = eiju.g(kol.a(new koi() { // from class: asyy
            /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
            @Override // defpackage.koi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(defpackage.kog r9) throws defpackage.assm {
                /*
                    r8 = this;
                    ewih r0 = defpackage.ewih.a
                    evsf r0 = r0.createBuilder()
                    ewig r0 = (defpackage.ewig) r0
                    r0.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
                    ewih r1 = (defpackage.ewih) r1
                    int r2 = r1.b
                    r3 = 1
                    r2 = r2 | r3
                    r1.b = r2
                    long r4 = r2
                    r1.e = r4
                    r0.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
                    ewih r1 = (defpackage.ewih) r1
                    r2 = 2
                    r1.f = r2
                    int r6 = r1.b
                    r6 = r6 | r2
                    r1.b = r6
                    r0.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
                    ewih r1 = (defpackage.ewih) r1
                    r1.g = r3
                    int r6 = r1.b
                    r6 = r6 | 4
                    r1.b = r6
                    evsn r0 = r0.build()
                    ewih r0 = (defpackage.ewih) r0
                    asze r1 = r8.a
                    dewm r6 = r1.f
                    r6.a(r0)
                    chwq r0 = r1.b
                    axcy r0 = r0.g()
                    int r0 = r0.e()
                    boolean r6 = defpackage.craf.e
                    if (r6 == 0) goto Le6
                    android.content.Context r6 = r1.a
                    java.lang.Class r7 = defpackage.aee$$ExternalSyntheticApiModelOutline0.m62m()
                    java.lang.Object r6 = r6.getSystemService(r7)
                    android.telephony.ims.ImsManager r6 = defpackage.aee$$ExternalSyntheticApiModelOutline0.m59m(r6)
                    if (r6 == 0) goto Lde
                    aubq r7 = r4
                    android.telephony.ims.ImsRcsManager r0 = defpackage.aee$$ExternalSyntheticApiModelOutline0.m(r6, r0)
                    android.telephony.ims.RcsUceAdapter r0 = defpackage.aee$$ExternalSyntheticApiModelOutline0.m(r0)
                    int r6 = r7.b
                    r2 = r2 & r6
                    if (r2 == 0) goto Ld6
                    java.lang.String r2 = r7.d
                    int r6 = r7.c
                    aubp r6 = defpackage.aubp.b(r6)
                    if (r6 != 0) goto L7d
                    aubp r6 = defpackage.aubp.UNKNOWN_TYPE
                L7d:
                    int r6 = r6.ordinal()
                    if (r6 == r3) goto Lbb
                    r3 = 3
                    if (r6 == r3) goto La4
                    java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                    int r0 = r7.c
                    aubp r0 = defpackage.aubp.b(r0)
                    if (r0 != 0) goto L92
                    aubp r0 = defpackage.aubp.UNKNOWN_TYPE
                L92:
                    java.lang.String r0 = r0.name()
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = "Unsupported endpoint type: "
                    java.lang.String r0 = r1.concat(r0)
                    r9.<init>(r0)
                    throw r9
                La4:
                    cqce r3 = defpackage.cmvy.a
                    boolean r3 = defpackage.alwh.i(r2)
                    if (r3 == 0) goto Lbb
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    java.lang.String r3 = "sip:"
                    java.lang.String r2 = r3.concat(r2)
                    android.net.Uri r2 = android.net.Uri.parse(r2)
                    goto Lc9
                Lbb:
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    java.lang.String r3 = "tel:"
                    java.lang.String r2 = r3.concat(r2)
                    android.net.Uri r2 = android.net.Uri.parse(r2)
                Lc9:
                    eosc r3 = r1.d
                    aszd r6 = new aszd
                    r6.<init>(r1, r9, r4)
                    r0.requestAvailability(r2, r3, r6)
                    java.lang.String r9 = "SingleRegistrationNetworkCapabilitiesProvider.getCapabilities"
                    return r9
                Ld6:
                    java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "No rcs identifier found in ChatEndpoint"
                    r9.<init>(r0)
                    throw r9
                Lde:
                    assm r9 = new assm
                    java.lang.String r0 = "[Single Registration] Unable to get UCE adapter from the platform."
                    r9.<init>(r0)
                    throw r9
                Le6:
                    assm r9 = new assm
                    java.lang.String r0 = "[Single Registration] Version S or higher is only supported"
                    r9.<init>(r0)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.asyy.a(kog):java.lang.Object");
            }
        }));
        eooz eoozVar = new eooz() { // from class: asyz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                asva asvaVarA;
                ekgb ekgbVar;
                asze aszeVar = this.a;
                RcsContactUceCapability rcsContactUceCapability = (RcsContactUceCapability) obj;
                Instant instantF = aszeVar.e.f();
                int capabilityMechanism = rcsContactUceCapability.getCapabilityMechanism();
                asvj asvjVar = aszeVar.c;
                if (capabilityMechanism == 1) {
                    List<RcsContactPresenceTuple> capabilityTuples = rcsContactUceCapability.getCapabilityTuples();
                    HashSet hashSet = new HashSet();
                    for (RcsContactPresenceTuple rcsContactPresenceTuple : capabilityTuples) {
                        if (rcsContactPresenceTuple == null) {
                            ((eksl) ((eksl) asvj.a.j()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/converter/RcsCapabilitiesConverter", "convertTupleListToRcsCapabilities", 73, "RcsCapabilitiesConverter.java")).q("[SR] Received a null presence capabilities tuple.");
                        } else if (!"closed".equals(rcsContactPresenceTuple.getStatus())) {
                            asvd asvdVar = new asvd();
                            asvdVar.b(rcsContactPresenceTuple.getServiceId());
                            asvdVar.c(rcsContactPresenceTuple.getServiceVersion());
                            asvg asvgVarA = asvdVar.a();
                            ekgp ekgpVar = (ekgp) asvjVar.b.a.get();
                            if (ekgpVar.containsKey(asvgVarA)) {
                                ekgbVar = (ekgb) ekgpVar.get(asvgVarA);
                            } else {
                                int i = ekgb.d;
                                ekgbVar = ekoe.a;
                            }
                            hashSet.addAll(ekgbVar);
                            RcsContactPresenceTuple.ServiceCapabilities serviceCapabilities = rcsContactPresenceTuple.getServiceCapabilities();
                            if (serviceCapabilities != null && asvgVarA.equals(asvk.m) && serviceCapabilities.isVideoCapable()) {
                                hashSet.add("video");
                            }
                        }
                    }
                    if (!hashSet.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp")) {
                        hashSet.remove("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session.group");
                    }
                    asvaVarA = asvj.a(asvjVar.c.a(hashSet));
                } else {
                    asvaVarA = asvj.a(asvjVar.c.a(rcsContactUceCapability.getFeatureTags()));
                }
                int i2 = asts.b;
                aste asteVar = new aste();
                asteVar.c(asvaVarA);
                asteVar.b(instantF);
                return eijx.e(asteVar.a());
            }
        };
        eosc eoscVar = this.d;
        return eijuVarG.i(eoozVar, eoscVar).f(IllegalArgumentException.class, new eooz() { // from class: asza
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                this.a.f(jNextLong);
                return eijx.d(new assm("[Single Registration] Failed to force the platform to make a network exchange", (IllegalArgumentException) obj));
            }
        }, eoscVar).f(aee$$ExternalSyntheticApiModelOutline0.m73m$1(), new eooz() { // from class: aszb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                asze aszeVar = this.a;
                long j = jNextLong;
                ImsException imsExceptionM58m = aee$$ExternalSyntheticApiModelOutline0.m58m(obj);
                aszeVar.f(j);
                return eijx.d(new assm("[Single Registration] Failed to force the platform to make a network exchange", imsExceptionM58m));
            }
        }, eoscVar).f(SecurityException.class, new eooz() { // from class: aszc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                this.a.f(jNextLong);
                return eijx.d(new assm("[Single Registration] Failed to force the platform to make a network exchange", (SecurityException) obj));
            }
        }, eoscVar);
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }

    @Override // defpackage.aszp
    public final eiju d(final aubq aubqVar) {
        eiju eijuVarB = b(aubqVar);
        eooz eoozVar = new eooz() { // from class: asyu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e(aubqVar, (asts) obj);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarB.i(eoozVar, eoscVar).h(new ejvr() { // from class: asyv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return aszo.ONLINE;
            }
        }, eoqg.a).f(assm.class, new eooz() { // from class: asyw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                assm assmVar = (assm) obj;
                int i = assmVar.b;
                if (i == 3 || i == 4) {
                    return eijx.e(aszo.OFFLINE);
                }
                if (i != 7) {
                    return eijx.d(assmVar);
                }
                aubq aubqVar2 = aubqVar;
                asze aszeVar = this.a;
                return aszeVar.e(aubqVar2, asts.e(aszeVar.e.f())).h(new ejvr() { // from class: asyx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return aszo.NOT_RCS;
                    }
                }, eoqg.a);
            }
        }, eoscVar);
    }

    public final eiju e(final aubq aubqVar, final asts astsVar) {
        return this.h.a(new Function() { // from class: asyt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((asvl) obj).b(aubqVar, astsVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void f(long j) {
        this.f.b(j, -1, -1L);
    }
}
