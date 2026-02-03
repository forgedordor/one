package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajjo {
    public static final /* synthetic */ int d = 0;
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final cqbm F;
    private final fcsu G;
    public final awhr b;
    public final fcsu c;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final eygg i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final eygg m;
    private final fcsu n;
    private final eygg o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final eosc s;
    private final eosc t;
    private final eygg u;
    private final Context v;
    private final asrf w;
    private final eygg x;
    private final fcsu y;
    private final fcsu z;
    private static final cqce e = cqce.g("BugleUsageStatistics", "UsageStatsMessageEventBuilder");
    static final cczi a = cdag.c(cdag.b, "carrier_config_logging_sampling_percent", 1.0d);

    public ajjo(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eygg eyggVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, eygg eyggVar2, fcsu fcsuVar7, eygg eyggVar3, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, eosc eoscVar, eosc eoscVar2, eygg eyggVar4, asrf asrfVar, eygg eyggVar5, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, awhr awhrVar, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, cqbm cqbmVar, fcsu fcsuVar19) {
        this.v = context;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = eyggVar;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.m = eyggVar2;
        this.n = fcsuVar7;
        this.o = eyggVar3;
        this.p = fcsuVar8;
        this.q = fcsuVar9;
        this.r = fcsuVar10;
        this.s = eoscVar;
        this.t = eoscVar2;
        this.u = eyggVar4;
        this.w = asrfVar;
        this.x = eyggVar5;
        this.y = fcsuVar11;
        this.z = fcsuVar12;
        this.A = fcsuVar13;
        this.B = fcsuVar14;
        this.b = awhrVar;
        this.C = fcsuVar15;
        this.c = fcsuVar16;
        this.D = fcsuVar17;
        this.E = fcsuVar18;
        this.F = cqbmVar;
        this.G = fcsuVar19;
    }

    private static boolean m(int i, int i2) {
        return i >= 0 && i2 >= 0;
    }

    public final eiju a(final int i) {
        fcsu fcsuVar = this.E;
        if (!((Optional) fcsuVar.b()).isPresent()) {
            return ((crkw) this.h.b()).b().h(new ejvr() { // from class: ajjn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    crku crkuVar = (crku) obj;
                    eltb eltbVarC = this.a.c(i);
                    boolean z = crkuVar.c;
                    eltbVarC.copyOnWrite();
                    eltf eltfVar = (eltf) eltbVarC.instance;
                    eltf eltfVar2 = eltf.a;
                    eltfVar.b |= 1073741824;
                    eltfVar.F = z;
                    boolean z2 = crkuVar.d;
                    eltbVarC.copyOnWrite();
                    eltf eltfVar3 = (eltf) eltbVarC.instance;
                    eltfVar3.b |= Integer.MIN_VALUE;
                    eltfVar3.G = z2;
                    if (tet.a()) {
                        boolean z3 = crkuVar.e;
                        eltbVarC.copyOnWrite();
                        eltf eltfVar4 = (eltf) eltbVarC.instance;
                        eltfVar4.c |= 1;
                        eltfVar4.H = z3;
                    }
                    return (eltf) eltbVarC.build();
                }
            }, this.s);
        }
        final eiju eijuVarB = ((crkw) this.h.b()).b();
        final eiju eijuVarB2 = ((cgte) ((Optional) fcsuVar.b()).get()).b();
        return eijx.m(eijuVarB, eijuVarB2).a(new Callable() { // from class: ajjm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                crku crkuVar = (crku) eork.q(eijuVarB);
                Boolean bool = (Boolean) eork.q(eijuVarB2);
                eltb eltbVarC = this.a.c(i);
                boolean z = crkuVar.c;
                eltbVarC.copyOnWrite();
                eltf eltfVar = (eltf) eltbVarC.instance;
                eltf eltfVar2 = eltf.a;
                eltfVar.b |= 1073741824;
                eltfVar.F = z;
                boolean z2 = crkuVar.d;
                eltbVarC.copyOnWrite();
                eltf eltfVar3 = (eltf) eltbVarC.instance;
                eltfVar3.b |= Integer.MIN_VALUE;
                eltfVar3.G = z2;
                boolean zBooleanValue = bool.booleanValue();
                eltbVarC.copyOnWrite();
                eltf eltfVar4 = (eltf) eltbVarC.instance;
                eltfVar4.c |= 512;
                eltfVar4.Q = zBooleanValue;
                if (tet.a()) {
                    boolean z3 = crkuVar.e;
                    eltbVarC.copyOnWrite();
                    eltf eltfVar5 = (eltf) eltbVarC.instance;
                    eltfVar5.c |= 1;
                    eltfVar5.H = z3;
                }
                return (eltf) eltbVarC.build();
            }
        }, this.s);
    }

    public final eiju b(MessageCoreData messageCoreData, final elof elofVar) {
        eiju eijuVarE = !messageCoreData.cS() ? eijx.e(messageCoreData.ah()) : ((baqm) this.C.b()).a(messageCoreData.A()).h(new ejvr() { // from class: ajji
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                return ekgbVar.size() != 1 ? Optional.empty() : Optional.of(((alrj) this.a.c.b()).q((ParticipantsTable.BindData) ekgbVar.get(0)));
            }
        }, this.t);
        eooz eoozVar = new eooz() { // from class: ajjg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final awhr awhrVar = this.a.b;
                awhrVar.getClass();
                return (ListenableFuture) ((Optional) obj).map(new Function() { // from class: ajjj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return awhrVar.c((alqm) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(eijx.e(awhp.e()));
            }
        };
        eosc eoscVar = this.t;
        return eijuVarE.i(eoozVar, eoscVar).h(new ejvr() { // from class: ajjh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = ajjo.d;
                enyw enywVar = ((awhp) obj).f(cefn.TACHYGRAM.name()) ? enyw.RCS_TACHYGRAM : enyw.UNKNOWN_RCS_TYPE;
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar.Z = enywVar.h;
                elpgVar.d |= 4194304;
                return null;
            }
        }, eoscVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0443  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eltb c(int r14) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjo.c(int):eltb");
    }

    public final Optional d() {
        if (((Optional) this.i.b()).isPresent()) {
            return Optional.empty();
        }
        try {
            return Optional.of(this.v.getPackageManager().getPackageInfo("com.google.android.ims", 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return Optional.empty();
        }
    }

    public final String e() {
        return (String) d().map(new Function() { // from class: ajjl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = ajjo.d;
                return ((PackageInfo) obj).versionName;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("NOT_AVAILABLE");
    }

    public final void f(elof elofVar, int i) {
        Optional optionalOf;
        boolean z;
        eltg eltgVar = (eltg) eltk.a.createBuilder();
        eltgVar.copyOnWrite();
        eltk eltkVar = (eltk) eltgVar.instance;
        eltkVar.b |= 1;
        eltkVar.c = i;
        eltk eltkVar2 = (eltk) eltgVar.build();
        Optional optionalI = ((cmlb) this.A.b()).i(i);
        if (optionalI.isEmpty()) {
            cqbd cqbdVarA = e.a();
            cqbdVarA.I("No subscription found for subId");
            cqbdVarA.y("subId", i);
            cqbdVarA.r();
            optionalOf = Optional.empty();
        } else {
            optionalOf = Optional.of(((cmmh) optionalI.get()).p);
        }
        eltg eltgVar2 = (eltg) eltkVar2.toBuilder();
        enwr enwrVar = ((dggw) this.D.b()).c(i).a;
        eltgVar2.copyOnWrite();
        eltk eltkVar3 = (eltk) eltgVar2.instance;
        eltkVar3.j = enwrVar.N;
        eltkVar3.b |= 64;
        eltk eltkVar4 = (eltk) eltgVar2.build();
        if (optionalOf.isPresent()) {
            eltg eltgVar3 = (eltg) eltkVar4.toBuilder();
            Object obj = optionalOf.get();
            eltgVar3.copyOnWrite();
            eltk eltkVar5 = (eltk) eltgVar3.instance;
            eltkVar5.b |= 32;
            eltkVar5.i = (String) obj;
            eltkVar4 = (eltk) eltgVar3.build();
        }
        eltg eltgVar4 = (eltg) eltkVar4.toBuilder();
        eltj eltjVar = eltkVar4.f;
        if (eltjVar == null) {
            eltjVar = eltj.a;
        }
        elti eltiVar = (elti) eltjVar.toBuilder();
        fcsu fcsuVar = this.f;
        int iD = ((crny) fcsuVar.b()).d();
        fcsu fcsuVar2 = this.p;
        if (!((aqsj) fcsuVar2.b()).a()) {
            boolean z2 = i == iD;
            eltiVar.copyOnWrite();
            eltj eltjVar2 = (eltj) eltiVar.instance;
            eltjVar2.b |= 1;
            eltjVar2.c = z2;
        } else if (m(i, iD)) {
            boolean z3 = i == iD;
            eltiVar.copyOnWrite();
            eltj eltjVar3 = (eltj) eltiVar.instance;
            eltjVar3.b |= 1;
            eltjVar3.c = z3;
        }
        int iC = ((crny) fcsuVar.b()).c();
        if (!((aqsj) fcsuVar2.b()).a()) {
            boolean z4 = i == iC;
            eltiVar.copyOnWrite();
            eltj eltjVar4 = (eltj) eltiVar.instance;
            eltjVar4.b |= 2;
            eltjVar4.d = z4;
        } else if (m(i, iC)) {
            boolean z5 = i == iC;
            eltiVar.copyOnWrite();
            eltj eltjVar5 = (eltj) eltiVar.instance;
            eltjVar5.b |= 2;
            eltjVar5.d = z5;
        }
        int iB = ((crny) fcsuVar.b()).b();
        if (!((aqsj) fcsuVar2.b()).a()) {
            boolean z6 = i == iB;
            eltiVar.copyOnWrite();
            eltj eltjVar6 = (eltj) eltiVar.instance;
            eltjVar6.b |= 4;
            eltjVar6.e = z6;
        } else if (m(i, iB)) {
            boolean z7 = i == iB;
            eltiVar.copyOnWrite();
            eltj eltjVar7 = (eltj) eltiVar.instance;
            eltjVar7.b |= 4;
            eltjVar7.e = z7;
        }
        int iF = ((crny) fcsuVar.b()).f();
        if (!((aqsj) fcsuVar2.b()).a()) {
            z = i == iF;
            eltiVar.copyOnWrite();
            eltj eltjVar8 = (eltj) eltiVar.instance;
            eltjVar8.b |= 8;
            eltjVar8.f = z;
        } else if (m(i, iF)) {
            z = i == iF;
            eltiVar.copyOnWrite();
            eltj eltjVar9 = (eltj) eltiVar.instance;
            eltjVar9.b |= 8;
            eltjVar9.f = z;
        }
        eltj eltjVar10 = (eltj) eltiVar.build();
        eltgVar4.copyOnWrite();
        eltk eltkVar6 = (eltk) eltgVar4.instance;
        eltjVar10.getClass();
        eltkVar6.f = eltjVar10;
        eltkVar6.b |= 8;
        eltk eltkVar7 = (eltk) eltgVar4.build();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        eltkVar7.getClass();
        elpgVar.m = eltkVar7;
        elpgVar.c |= 32;
    }

    public final void g(elof elofVar) {
        int iY = ((cqey) this.F.a()).y();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.aA = iY - 1;
        elpgVar.e |= 262144;
    }

    public final void h(MessageCoreData messageCoreData, elof elofVar) {
        if (messageCoreData.cX()) {
            int I = ((chwq) this.j.b()).I();
            elofVar.copyOnWrite();
            elpg elpgVar = (elpg) elofVar.instance;
            evsy evsyVar = elpg.a;
            elpgVar.ac = I - 1;
            elpgVar.d |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
    }

    public final void i(MessageCoreData messageCoreData, elof elofVar) {
        elpg elpgVar = (elpg) elofVar.instance;
        if ((elpgVar.d & 2097152) != 0) {
            enyw enywVarB = enyw.b(elpgVar.Y);
            if (enywVarB == null) {
                enywVarB = enyw.UNKNOWN_RCS_TYPE;
            }
            if (enywVarB != enyw.UNKNOWN_RCS_TYPE) {
                return;
            }
        }
        if (messageCoreData == null || messageCoreData.cX()) {
            enyw enywVarA = this.w.a();
            elofVar.copyOnWrite();
            elpg elpgVar2 = (elpg) elofVar.instance;
            elpgVar2.Y = enywVarA.h;
            elpgVar2.d |= 2097152;
            return;
        }
        enyw enywVar = enyw.NOT_RCS;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.Y = enywVar.h;
        elpgVar3.d |= 2097152;
    }

    public final void j(MessageCoreData messageCoreData, final elof elofVar, Optional optional) {
        optional.ifPresent(new Consumer() { // from class: ajjk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar.Y = ((enyw) obj).h;
                elpgVar.d |= 2097152;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        i(messageCoreData, elofVar);
    }

    public final elpl k(List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            elhd elhdVar = (elhd) elhe.a.createBuilder();
            String strR = messagePartCoreData.R();
            if (strR == null) {
                elhc elhcVar = elhc.UNKNOWN_BUGLE_CONTENT_TYPE;
                elhdVar.copyOnWrite();
                elhe elheVar = (elhe) elhdVar.instance;
                elheVar.c = elhcVar.a();
                elheVar.b |= 1;
            } else {
                elhc elhcVarA = cqmg.a(strR);
                elhdVar.copyOnWrite();
                elhe elheVar2 = (elhe) elhdVar.instance;
                elheVar2.c = elhcVarA.a();
                elheVar2.b |= 1;
                if (((aqzu) this.G.b()).a() && elhcVarA == elhc.UNKNOWN_BUGLE_CONTENT_TYPE) {
                    elhdVar.copyOnWrite();
                    elhe elheVar3 = (elhe) elhdVar.instance;
                    elheVar3.b |= 64;
                    elheVar3.h = strR;
                }
            }
            elha elhaVarK = messagePartCoreData.K();
            elhdVar.copyOnWrite();
            elhe elheVar4 = (elhe) elhdVar.instance;
            elheVar4.d = elhaVarK.a();
            int i2 = 4;
            elheVar4.b |= 4;
            elhdVar.copyOnWrite();
            elhe.a((elhe) elhdVar.instance);
            int i3 = 13;
            if (i != 13) {
                i3 = i;
            } else if (((Boolean) ((cczi) ajhd.e.get()).e()).booleanValue()) {
                long jBJ = messagePartCoreData.bJ();
                elhdVar.copyOnWrite();
                elhe elheVar5 = (elhe) elhdVar.instance;
                elheVar5.b |= 32;
                elheVar5.g = jBJ;
            }
            if (messagePartCoreData.bg()) {
                elgt elgtVar = (elgt) elgu.a.createBuilder();
                int i4 = true != messagePartCoreData.aW() ? 3 : 4;
                elgtVar.copyOnWrite();
                elgu elguVar = (elgu) elgtVar.instance;
                elguVar.c = elhs.a(i4);
                elguVar.b |= 1;
                int i5 = messagePartCoreData.p() >= 0 ? 4 : 3;
                elgtVar.copyOnWrite();
                elgu elguVar2 = (elgu) elgtVar.instance;
                elguVar2.d = elhs.a(i5);
                elguVar2.b |= 2;
                elgu elguVar3 = (elgu) elgtVar.build();
                elhdVar.copyOnWrite();
                elhe elheVar6 = (elhe) elhdVar.instance;
                elguVar3.getClass();
                elheVar6.e = elguVar3;
                elheVar6.b |= 8;
                int iA = cqmf.a(messagePartCoreData.p());
                elhdVar.copyOnWrite();
                elhe elheVar7 = (elhe) elhdVar.instance;
                elheVar7.f = elgz.a(iA);
                elheVar7.b |= 16;
            } else {
                elgt elgtVar2 = (elgt) elgu.a.createBuilder();
                elgtVar2.copyOnWrite();
                elgu elguVar4 = (elgu) elgtVar2.instance;
                elguVar4.c = elhs.a(2);
                elguVar4.b |= 1;
                elgtVar2.copyOnWrite();
                elgu elguVar5 = (elgu) elgtVar2.instance;
                elguVar5.d = elhs.a(2);
                elguVar5.b |= 2;
                elgu elguVar6 = (elgu) elgtVar2.build();
                elhdVar.copyOnWrite();
                elhe elheVar8 = (elhe) elhdVar.instance;
                elguVar6.getClass();
                elheVar8.e = elguVar6;
                elheVar8.b |= 8;
            }
            if (i3 == 2 || i3 == 6) {
                elha elhaVarK2 = messagePartCoreData.K();
                fcsu fcsuVar = this.z;
                if (((ajhd) fcsuVar.b()).Y()) {
                    int iOrdinal = elhaVarK2.ordinal();
                    if (iOrdinal == 34) {
                        i2 = 9;
                    } else if (iOrdinal != 46 && iOrdinal != 42 && iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 3:
                            case 4:
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                i2 = 6;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                            default:
                                switch (iOrdinal) {
                                    case 26:
                                    case 27:
                                    case 28:
                                        break;
                                    default:
                                        i2 = 1;
                                        break;
                                }
                            case 11:
                                i2 = 8;
                                break;
                        }
                    }
                    if (i2 != 1) {
                        ellg ellgVar = (ellg) ellh.a.createBuilder();
                        elmy elmyVar = (elmy) elmz.a.createBuilder();
                        elmyVar.copyOnWrite();
                        elmz elmzVar = (elmz) elmyVar.instance;
                        elmzVar.c = 3;
                        elmzVar.b = 1 | elmzVar.b;
                        elmyVar.copyOnWrite();
                        elmz elmzVar2 = (elmz) elmyVar.instance;
                        elmzVar2.d = i2 - 1;
                        elmzVar2.b |= 2;
                        ellgVar.copyOnWrite();
                        ellh ellhVar = (ellh) ellgVar.instance;
                        elmz elmzVar3 = (elmz) elmyVar.build();
                        elmzVar3.getClass();
                        ellhVar.u = elmzVar3;
                        ellhVar.b |= 8192;
                        ((aill) this.r.b()).j(ellgVar);
                    }
                } else {
                    ((ajhd) fcsuVar.b()).n();
                }
            }
            arrayList.add((elhe) elhdVar.build());
        }
        elpk elpkVar = (elpk) elpl.a.createBuilder();
        elpkVar.copyOnWrite();
        elpl elplVar = (elpl) elpkVar.instance;
        elplVar.a();
        evpz.addAll(arrayList, elplVar.b);
        return (elpl) elpkVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.elof r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjo.l(elof, int, int, int):void");
    }
}
