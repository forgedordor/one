package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbgw {
    public static final ejxr a = cdag.w(180026785, "no_link_preview_fetched_for_untrusted_sender_in_search");
    public static final cqce b = cqce.g("BugleAnnotation", "LinkPreviewUtils");
    public static final long c = TimeUnit.DAYS.toMillis(29);
    public final cogw d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final ains j;
    public final cenj k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final arhq p;
    public final eosc q;
    public final eosc r;
    public final Object s = new Object();
    public final ejye t;
    private final fcsu u;
    private final fcsu v;

    public bbgw(fcsu fcsuVar, cogw cogwVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, ains ainsVar, cenj cenjVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, arhq arhqVar, eosc eoscVar, eosc eoscVar2) {
        ejyk ejykVar = new ejyk();
        ejykVar.f(100L);
        ejykVar.e(2L, TimeUnit.MINUTES);
        this.t = ejykVar.a();
        this.u = fcsuVar;
        this.d = cogwVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.v = fcsuVar7;
        this.j = ainsVar;
        this.k = cenjVar;
        this.l = fcsuVar8;
        this.m = fcsuVar9;
        this.n = fcsuVar10;
        this.o = fcsuVar11;
        this.p = arhqVar;
        this.q = eoscVar;
        this.r = eoscVar2;
    }

    public static boolean e(eyks eyksVar) {
        return (eyksVar.c.isEmpty() && eyksVar.d.isEmpty() && eyksVar.g.isEmpty() && eyksVar.e.isEmpty() && eyksVar.f.isEmpty()) ? false : true;
    }

    private static int j(String str) {
        return TextUtils.isEmpty(str) ? 3 : 4;
    }

    public final eiju a(final String str, final MessageIdType messageIdType) {
        String strValueOf = String.valueOf(String.valueOf(messageIdType));
        Object obj = this.s;
        final String strConcat = String.valueOf(str).concat(strValueOf);
        synchronized (obj) {
            ejye ejyeVar = this.t;
            eiju eijuVar = (eiju) ejyeVar.b(strConcat);
            if (eijuVar != null) {
                return eijuVar;
            }
            eooy eooyVar = new eooy() { // from class: bbge
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    bbgw bbgwVar = this.a;
                    return (!crxi.a() ? ((csel) bbgwVar.m.b()).e() : ((csei) bbgwVar.n.b()).f()) ? eijx.e(Optional.empty()) : ((crzf) bbgwVar.o.b()).d().h(new ejvr() { // from class: bbgc
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Optional.of((String) obj2);
                        }
                    }, bbgwVar.r);
                }
            };
            eosc eoscVar = this.q;
            final eiju eijuVarH = eijx.h(eooyVar, eoscVar);
            final eiju eijuVarG = eijx.g(new Callable() { // from class: bbgh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bbgw bbgwVar = this.a;
                    MessageCoreData messageCoreDataW = ((baxe) bbgwVar.h.b()).w(messageIdType);
                    csdi csdiVar = new csdi();
                    fcsu fcsuVar = bbgwVar.l;
                    String strA = ((csem) fcsuVar.b()).a();
                    if (strA == null) {
                        throw new NullPointerException("Null countryCode");
                    }
                    csdiVar.a = strA;
                    csdiVar.b = ((csem) fcsuVar.b()).b();
                    csdiVar.b(csdo.b);
                    if (messageCoreDataW == null) {
                        return csdiVar.a();
                    }
                    ParticipantsTable.BindData bindDataB = ((bbca) bbgwVar.i.b()).b(messageCoreDataW.aB());
                    if (bindDataB == null) {
                        return csdiVar.a();
                    }
                    if (bbdl.k(bindDataB)) {
                        csdiVar.b(csdo.a);
                        return csdiVar.a();
                    }
                    csdiVar.b(csem.c(messageCoreDataW.A(), TextUtils.isEmpty(bindDataB.S())));
                    return csdiVar.a();
                }
            }, eoscVar);
            eiju eijuVarB = eijx.m(eijuVarH, eijuVarG).b(new eooy() { // from class: bbgf
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    eiju eijuVar2 = eijuVarG;
                    bbgw bbgwVar = this.a;
                    ezpo ezpoVarA = bbgwVar.k.a("Bugle");
                    csdq csdqVar = (csdq) eork.q(eijuVar2);
                    eykn eyknVar = (eykn) eyko.a.createBuilder();
                    eyknVar.copyOnWrite();
                    eyko eykoVar = (eyko) eyknVar.instance;
                    ezpp ezppVar = (ezpp) ezpoVarA.build();
                    ezppVar.getClass();
                    eykoVar.c = ezppVar;
                    eykoVar.b |= 1;
                    eyknVar.copyOnWrite();
                    ((eyko) eyknVar.instance).d = 1;
                    eykl eyklVar = (eykl) eykm.a.createBuilder();
                    eyklVar.copyOnWrite();
                    eykm eykmVar = (eykm) eyklVar.instance;
                    String str2 = str;
                    str2.getClass();
                    eykmVar.b = 1;
                    eykmVar.c = str2;
                    eyknVar.copyOnWrite();
                    eyko eykoVar2 = (eyko) eyknVar.instance;
                    eykm eykmVar2 = (eykm) eyklVar.build();
                    eykmVar2.getClass();
                    eykoVar2.e = eykmVar2;
                    eykoVar2.b |= 2;
                    eyknVar.copyOnWrite();
                    ((eyko) eyknVar.instance).f = eyki.a(4);
                    eyknVar.copyOnWrite();
                    ((eyko) eyknVar.instance).g = true;
                    boolean zA = bbgwVar.p.a();
                    eyknVar.copyOnWrite();
                    ((eyko) eyknVar.instance).h = zA;
                    String strC = csdqVar.c();
                    eyknVar.copyOnWrite();
                    ((eyko) eyknVar.instance).k = strC;
                    String strB = csdqVar.b();
                    eyknVar.copyOnWrite();
                    ((eyko) eyknVar.instance).j = strB;
                    float fA = csdqVar.a().a();
                    eyknVar.copyOnWrite();
                    ((eyko) eyknVar.instance).i = fA;
                    Optional optional = (Optional) eork.q(eijuVarH);
                    if (optional.isPresent()) {
                        ezpu ezpuVar = (ezpu) ezpx.a.createBuilder();
                        ezpv ezpvVar = (ezpv) ezpw.a.createBuilder();
                        evqs evqsVarY = evqs.y((String) optional.get(), StandardCharsets.US_ASCII);
                        ezpvVar.copyOnWrite();
                        ((ezpw) ezpvVar.instance).b = evqsVarY;
                        int i = crzc.a;
                        crzd crzdVar = crzf.b;
                        int iIntValue = ((Integer) crzd.b.e()).intValue();
                        ezpvVar.copyOnWrite();
                        ((ezpw) ezpvVar.instance).c = iIntValue;
                        ezpuVar.copyOnWrite();
                        ezpx ezpxVar = (ezpx) ezpuVar.instance;
                        ezpw ezpwVar = (ezpw) ezpvVar.build();
                        ezpwVar.getClass();
                        ezpxVar.c = ezpwVar;
                        ezpxVar.b = 1 | ezpxVar.b;
                        eyknVar.copyOnWrite();
                        eyko eykoVar3 = (eyko) eyknVar.instance;
                        ezpx ezpxVar2 = (ezpx) ezpuVar.build();
                        ezpxVar2.getClass();
                        eykoVar3.l = ezpxVar2;
                        eykoVar3.b |= 4;
                    }
                    cpdy cpdyVar = (cpdy) bbgwVar.f.b();
                    eyko eykoVar4 = (eyko) eyknVar.build();
                    long jIntValue = ((Integer) afgs.a.e()).intValue();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    eyzs eyzsVarA = cpdyVar.a();
                    if (eyzsVarA == null) {
                        return eijx.d(new Exception("Cannot initialize smart messaging stub."));
                    }
                    cpdy.a.p("RPC: Fetching link preview");
                    return eiju.g(((eyzs) eyzsVarA.k(jIntValue, timeUnit)).b(eykoVar4));
                }
            }, this.r);
            ejvr ejvrVar = new ejvr() { // from class: bbgi
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    ejxr ejxrVar = bbgw.a;
                    eykk eykkVar = ((eykq) obj2).b;
                    if (eykkVar == null) {
                        eykkVar = eykk.a;
                    }
                    return eykkVar.b == 1 ? (eyks) eykkVar.c : eyks.a;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eiju eijuVarH2 = eijuVarB.h(ejvrVar, eoqgVar);
            ejyeVar.d(strConcat, eijuVarH2);
            eijuVarH2.k(new cqob(new Consumer() { // from class: bbgj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    boolean zE = bbgw.e((eyks) obj2);
                    String str2 = strConcat;
                    if (zE) {
                        return;
                    }
                    bbgw bbgwVar = this.a;
                    synchronized (bbgwVar.s) {
                        bbgwVar.t.c(str2);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: bbgk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    String str2 = strConcat;
                    bbgw bbgwVar = this.a;
                    synchronized (bbgwVar.s) {
                        bbgwVar.t.c(str2);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), eoqgVar);
            return eijuVarH2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju b(defpackage.ezdk r5, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6, final defpackage.ezdj r7) {
        /*
            r4 = this;
            MessageType extends evsn<MessageType, BuilderType> r0 = r7.instance
            ezdk r0 = (defpackage.ezdk) r0
            int r1 = r0.b
            r1 = r1 & 2
            if (r1 == 0) goto L20
            ezdm r0 = r0.e
            if (r0 != 0) goto L10
            ezdm r0 = defpackage.ezdm.a
        L10:
            cogw r1 = r4.d
            long r2 = r0.e
            j$.time.Instant r0 = r1.f()
            long r0 = r0.toEpochMilli()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L3a
        L20:
            java.lang.String r5 = r5.c     // Catch: java.lang.RuntimeException -> L32
            eiju r5 = r4.a(r5, r6)     // Catch: java.lang.RuntimeException -> L32
            bbgg r6 = new bbgg     // Catch: java.lang.RuntimeException -> L32
            r6.<init>()     // Catch: java.lang.RuntimeException -> L32
            eosc r7 = r4.r     // Catch: java.lang.RuntimeException -> L32
            eiju r5 = r5.h(r6, r7)     // Catch: java.lang.RuntimeException -> L32
            return r5
        L32:
            r5 = move-exception
            cqce r6 = defpackage.bbgw.b
            java.lang.String r7 = "Couldn't fetch link preview."
            r6.s(r7, r5)
        L3a:
            r5 = 0
            eiju r5 = defpackage.eijx.e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbgw.b(ezdk, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, ezdj):eiju");
    }

    public final eiju c(final ezdj ezdjVar) {
        return (((ezdk) ezdjVar.instance).b & 1) != 0 ? eijx.e(null) : ((cpez) this.e.b()).c(((ezdk) ezdjVar.instance).c).i(new eooz() { // from class: bbgl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ezdj ezdjVar2 = ezdjVar;
                ezbd ezbdVar = (ezbd) obj;
                if (ezbdVar != null) {
                    ezdjVar2.copyOnWrite();
                    ezdk ezdkVar = (ezdk) ezdjVar2.instance;
                    ezdk ezdkVar2 = ezdk.a;
                    ezdkVar.d = ezbdVar;
                    ezdkVar.b |= 1;
                } else {
                    ezdk ezdkVar3 = (ezdk) ezdjVar2.instance;
                    if ((ezdkVar3.b & 2) != 0) {
                        ezdm ezdmVar = ezdkVar3.e;
                        if (ezdmVar == null) {
                            ezdmVar = ezdm.a;
                        }
                        if (!ezdmVar.c.isEmpty()) {
                            ezdk ezdkVar4 = (ezdk) ezdjVar2.instance;
                            ezdm ezdmVar2 = ezdkVar4.e;
                            if (ezdmVar2 == null) {
                                ezdmVar2 = ezdm.a;
                            }
                            if (!ezdmVar2.c.equals(ezdkVar4.c)) {
                                bbgw bbgwVar = this.a;
                                cpez cpezVar = (cpez) bbgwVar.e.b();
                                ezdm ezdmVar3 = ((ezdk) ezdjVar2.instance).e;
                                if (ezdmVar3 == null) {
                                    ezdmVar3 = ezdm.a;
                                }
                                return cpezVar.c(ezdmVar3.c).h(new ejvr() { // from class: bbgb
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        ezbd ezbdVar2 = (ezbd) obj2;
                                        ejxr ejxrVar = bbgw.a;
                                        if (ezbdVar2 == null) {
                                            return null;
                                        }
                                        ezdj ezdjVar3 = ezdjVar2;
                                        ezdjVar3.copyOnWrite();
                                        ezdk ezdkVar5 = (ezdk) ezdjVar3.instance;
                                        ezdk ezdkVar6 = ezdk.a;
                                        ezdkVar5.d = ezbdVar2;
                                        ezdkVar5.b |= 1;
                                        return null;
                                    }
                                }, bbgwVar.r);
                            }
                        }
                    }
                }
                return eijx.e(null);
            }
        }, this.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju d(final defpackage.ezdj r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbgw.d(ezdj):eiju");
    }

    public final boolean f(bpvd bpvdVar) {
        return this.d.f().toEpochMilli() >= bpvdVar.k();
    }

    public final void g(MessageCoreData messageCoreData, int i, int i2) {
        elmn elmnVar = (elmn) elmr.a.createBuilder();
        elmnVar.copyOnWrite();
        elmr elmrVar = (elmr) elmnVar.instance;
        elmrVar.c = i - 1;
        elmrVar.b |= 1;
        elmnVar.copyOnWrite();
        elmr elmrVar2 = (elmr) elmnVar.instance;
        elmrVar2.d = elhs.a(2);
        elmrVar2.b |= 2;
        elmnVar.copyOnWrite();
        elmr elmrVar3 = (elmr) elmnVar.instance;
        elmrVar3.e = elhs.a(2);
        elmrVar3.b |= 4;
        elmnVar.copyOnWrite();
        elmr elmrVar4 = (elmr) elmnVar.instance;
        elmrVar4.f = elhs.a(2);
        elmrVar4.b |= 8;
        elmnVar.copyOnWrite();
        elmr elmrVar5 = (elmr) elmnVar.instance;
        elmrVar5.g = elhs.a(2);
        elmrVar5.b |= 16;
        cczi ccziVar = ccze.s;
        if (((Boolean) ccziVar.e()).booleanValue()) {
            elmnVar.copyOnWrite();
            elmr elmrVar6 = (elmr) elmnVar.instance;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            elmrVar6.h = i3;
            elmrVar6.b |= 32;
        }
        elmr elmrVar7 = (elmr) elmnVar.build();
        elih elihVar = (elih) elij.a.createBuilder();
        eyzy eyzyVar = eyzy.LINK_PREVIEW_ANNOTATION;
        elihVar.copyOnWrite();
        elij elijVar = (elij) elihVar.instance;
        elijVar.c = eyzyVar.a();
        elijVar.b |= 1;
        elihVar.copyOnWrite();
        elij elijVar2 = (elij) elihVar.instance;
        elmrVar7.getClass();
        elijVar2.g = elmrVar7;
        elijVar2.b |= 16;
        elij elijVar3 = (elij) elihVar.build();
        boolean zEquals = Objects.equals(messageCoreData.aB(), ((SelfIdentityIdImpl) messageCoreData.v()).a);
        if (!((Boolean) afgs.b.e()).booleanValue()) {
            if (zEquals) {
                ((ajhd) this.v.b()).y(messageCoreData, elijVar3);
            } else {
                ((ajhd) this.v.b()).x(messageCoreData, elijVar3);
            }
        }
        if (i == 11 && ((Boolean) ccziVar.e()).booleanValue() && !((Boolean) afgs.c.e()).booleanValue()) {
            this.j.c("Bugle.Share.WebLinkPreview.CreateManualPreviewButton");
        }
    }

    public final void h(MessageCoreData messageCoreData, bpvd bpvdVar, int i) {
        if (bpvdVar == null) {
            return;
        }
        elmn elmnVar = (elmn) elmr.a.createBuilder();
        elmnVar.copyOnWrite();
        elmr elmrVar = (elmr) elmnVar.instance;
        elmrVar.c = 1;
        elmrVar.b |= 1;
        int iJ = j(bpvdVar.r());
        elmnVar.copyOnWrite();
        elmr elmrVar2 = (elmr) elmnVar.instance;
        elmrVar2.d = elhs.a(iJ);
        elmrVar2.b |= 2;
        int iJ2 = j(bpvdVar.o());
        elmnVar.copyOnWrite();
        elmr elmrVar3 = (elmr) elmnVar.instance;
        elmrVar3.e = elhs.a(iJ2);
        elmrVar3.b |= 4;
        int iJ3 = j(bpvdVar.q());
        elmnVar.copyOnWrite();
        elmr elmrVar4 = (elmr) elmnVar.instance;
        elmrVar4.f = elhs.a(iJ3);
        elmrVar4.b |= 8;
        int iJ4 = j(bpvdVar.p());
        elmnVar.copyOnWrite();
        elmr elmrVar5 = (elmr) elmnVar.instance;
        elmrVar5.g = elhs.a(iJ4);
        elmrVar5.b |= 16;
        cczi ccziVar = ccze.s;
        if (((Boolean) ccziVar.e()).booleanValue()) {
            elmnVar.copyOnWrite();
            elmr elmrVar6 = (elmr) elmnVar.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            elmrVar6.h = i2;
            elmrVar6.b |= 32;
        }
        elmr elmrVar7 = (elmr) elmnVar.build();
        elih elihVar = (elih) elij.a.createBuilder();
        eyzy eyzyVar = eyzy.LINK_PREVIEW_ANNOTATION;
        elihVar.copyOnWrite();
        elij elijVar = (elij) elihVar.instance;
        elijVar.c = eyzyVar.a();
        elijVar.b |= 1;
        elihVar.copyOnWrite();
        elij elijVar2 = (elij) elihVar.instance;
        elmrVar7.getClass();
        elijVar2.g = elmrVar7;
        elijVar2.b |= 16;
        elij elijVar3 = (elij) elihVar.build();
        boolean zEquals = Objects.equals(messageCoreData.aB(), ((SelfIdentityIdImpl) messageCoreData.v()).a);
        if (!((Boolean) afgs.b.e()).booleanValue()) {
            if (zEquals) {
                ((ajhd) this.v.b()).y(messageCoreData, elijVar3);
            } else {
                ((ajhd) this.v.b()).x(messageCoreData, elijVar3);
            }
        }
        if (!((Boolean) ccziVar.e()).booleanValue() || ((Boolean) afgs.c.e()).booleanValue()) {
            return;
        }
        this.j.e("Bugle.Share.WebLinkPreview.PreviewGenerated", i != 2 ? 2 : 1);
    }

    public final void i() {
        fcsu fcsuVar = this.u;
        if (((Optional) fcsuVar.b()).isEmpty()) {
            return;
        }
    }
}
