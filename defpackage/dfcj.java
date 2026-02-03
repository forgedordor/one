package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import com.sun.jna.Function;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfcj extends dfcg {
    public static final /* synthetic */ int d = 0;
    private final deyw g;
    static final dfny c = dfnv.b("enable_logging_preferred_service");
    private static final ekgp e = ekgp.l("+g.gsma.rcs.isbot", ewjv.RCS_RBM_BOT_CAPABILITY);
    private static final ekgp f = ekgp.n("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session", ewjx.CPM_SESSION_SERVICE, "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.msg", ewjx.CPM_PAGER_MODE_SERVICE, "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.largemsg", ewjx.CPM_LARGE_MESSAGE_MODE_SERVICE);

    public dfcj(Context context, deyw deywVar) {
        super(context);
        this.g = deywVar;
    }

    public static String d(ebqq ebqqVar) {
        Iterator it = ebqqVar.o().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ebqo ebqoVar = (ebqo) it.next();
            if (dhim.e(ebqoVar.b, "message/cpim")) {
                try {
                    return ebcp.b(ebqoVar.a).g("urn:ietf:params:imdn", "Message-ID");
                } catch (Exception e2) {
                    dhja.i(e2, "Failed to parse CPIM msg to get IMDN msg ID!", new Object[0]);
                    return null;
                }
            }
        }
    }

    @Override // defpackage.dfcg
    public final void a(String str, String str2, int i, int i2, boolean z) {
        int i3;
        ewdp ewdpVar = (ewdp) ewdr.a.createBuilder();
        ewdpVar.copyOnWrite();
        ewdr ewdrVar = (ewdr) ewdpVar.instance;
        ewdrVar.b |= 1;
        ewdrVar.c = str;
        ewdpVar.copyOnWrite();
        ewdr ewdrVar2 = (ewdr) ewdpVar.instance;
        ewdrVar2.b |= 2;
        ewdrVar2.d = str2;
        int i4 = 10;
        switch (i) {
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
            default:
                i3 = 1;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            case 7:
                i3 = 8;
                break;
            case 8:
                i3 = 9;
                break;
            case 9:
                i3 = 10;
                break;
        }
        ewdpVar.copyOnWrite();
        ewdr ewdrVar3 = (ewdr) ewdpVar.instance;
        ewdrVar3.f = i3 - 1;
        ewdrVar3.b |= 64;
        switch (i2) {
            case 1:
                i4 = 2;
                break;
            case 2:
                i4 = 3;
                break;
            case 3:
                i4 = 4;
                break;
            case 4:
                i4 = 5;
                break;
            case 5:
                i4 = 6;
                break;
            case 6:
                i4 = 7;
                break;
            case 7:
                i4 = 8;
                break;
            case 8:
                i4 = 9;
                break;
            case 9:
                break;
            case 10:
                i4 = 11;
                break;
            case 11:
                i4 = 12;
                break;
            case 12:
                i4 = 13;
                break;
            case 13:
                i4 = 14;
                break;
            case 14:
                i4 = 15;
                break;
            case 15:
                i4 = 16;
                break;
            case 16:
                i4 = 17;
                break;
            case 17:
                i4 = 18;
                break;
            case 18:
                i4 = 19;
                break;
            case 19:
                i4 = 20;
                break;
            case 20:
                i4 = 21;
                break;
            case 21:
                i4 = 22;
                break;
            case 22:
                i4 = 23;
                break;
            case 23:
                i4 = 24;
                break;
            case 24:
                i4 = 25;
                break;
            case 25:
                i4 = 26;
                break;
            case 26:
                i4 = 27;
                break;
            case 27:
                i4 = 28;
                break;
            case 28:
                i4 = 29;
                break;
            case 29:
                i4 = 30;
                break;
            case 30:
                i4 = 31;
                break;
            case 31:
                i4 = 32;
                break;
            case 32:
                i4 = 33;
                break;
            case 33:
                i4 = 34;
                break;
            case 34:
                i4 = 35;
                break;
            case 35:
                i4 = 36;
                break;
            case 36:
                i4 = 37;
                break;
            case 37:
                i4 = 38;
                break;
            case 38:
                i4 = 39;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                i4 = 40;
                break;
            case 40:
                i4 = 41;
                break;
            case 41:
                i4 = 42;
                break;
            case 42:
                i4 = 43;
                break;
            case 43:
                i4 = 44;
                break;
            case 44:
                i4 = 45;
                break;
            case 45:
                i4 = 46;
                break;
            case 46:
                i4 = 47;
                break;
            case 47:
                i4 = 48;
                break;
            case 48:
                i4 = 49;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                i4 = 50;
                break;
            case 50:
                i4 = 51;
                break;
            case 51:
                i4 = 52;
                break;
            case 52:
                i4 = 53;
                break;
            case 53:
                i4 = 54;
                break;
            case 54:
                i4 = 55;
                break;
            case 55:
                i4 = 56;
                break;
            case 56:
                i4 = 57;
                break;
            case 57:
                i4 = 58;
                break;
            case 58:
                i4 = 59;
                break;
            case 59:
                i4 = 60;
                break;
            case 60:
                i4 = 61;
                break;
            case 61:
                i4 = 62;
                break;
            case 62:
                i4 = 63;
                break;
            case Function.ALT_CONVENTION /* 63 */:
                i4 = 64;
                break;
            case 64:
                i4 = 65;
                break;
            case 65:
                i4 = 66;
                break;
            case 66:
                i4 = 67;
                break;
            case 67:
            default:
                i4 = 1;
                break;
            case 68:
                i4 = 69;
                break;
            case 69:
                i4 = 70;
                break;
            case 70:
                i4 = 71;
                break;
        }
        ewdpVar.copyOnWrite();
        ewdr ewdrVar4 = (ewdr) ewdpVar.instance;
        ewdrVar4.g = i4 - 1;
        ewdrVar4.b |= 128;
        int i5 = true == z ? 3 : 2;
        ewdpVar.copyOnWrite();
        ewdr ewdrVar5 = (ewdr) ewdpVar.instance;
        ewdrVar5.e = i5 - 1;
        ewdrVar5.b |= 4;
        this.g.d(this.a, (ewdr) ewdpVar.build());
    }

    @Override // defpackage.dfcg
    public final void b(String str, int i) {
        ewdp ewdpVar = (ewdp) ewdr.a.createBuilder();
        ewdpVar.copyOnWrite();
        ewdr ewdrVar = (ewdr) ewdpVar.instance;
        ewdrVar.b |= 2;
        ewdrVar.d = str;
        ewdpVar.copyOnWrite();
        ewdr ewdrVar2 = (ewdr) ewdpVar.instance;
        ewdrVar2.b |= 1;
        ewdrVar2.c = str;
        ewdpVar.copyOnWrite();
        ewdr ewdrVar3 = (ewdr) ewdpVar.instance;
        ewdrVar3.h = i - 1;
        ewdrVar3.b |= 512;
        this.g.d(this.a, (ewdr) ewdpVar.build());
    }

    @Override // defpackage.dfcg
    public final void c(ebqq ebqqVar, Optional optional, int i, int i2, ebqv ebqvVar) throws NumberFormatException {
        int i3;
        int iA;
        String strJ;
        final ewjt ewjtVar = (ewjt) ewjy.a.createBuilder();
        int iA2 = ebqqVar.a();
        ewjtVar.copyOnWrite();
        ewjy ewjyVar = (ewjy) ewjtVar.instance;
        ewjyVar.b |= 64;
        ewjyVar.i = iA2;
        long micros = TimeUnit.MILLISECONDS.toMicros(Calendar.getInstance().getTimeInMillis());
        ewjtVar.copyOnWrite();
        ewjy ewjyVar2 = (ewjy) ewjtVar.instance;
        ewjyVar2.b |= 1;
        ewjyVar2.c = micros;
        int iE = dhjv.E(ebqqVar);
        ewjtVar.copyOnWrite();
        ewjy ewjyVar3 = (ewjy) ewjtVar.instance;
        ewjyVar3.f = iE - 1;
        ewjyVar3.b |= 8;
        ewjtVar.copyOnWrite();
        ewjy ewjyVar4 = (ewjy) ewjtVar.instance;
        ewjyVar4.d = i - 1;
        ewjyVar4.b |= 2;
        String strD = ebqqVar.d();
        if (strD != null) {
            ewjtVar.copyOnWrite();
            ewjy ewjyVar5 = (ewjy) ewjtVar.instance;
            ewjyVar5.b |= 512;
            ewjyVar5.l = strD;
        }
        String strD2 = d(ebqqVar);
        String strE = null;
        if (strD2 == null) {
            strD2 = (String) optional.map(new java.util.function.Function() { // from class: dfci
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ java.util.function.Function mo536andThen(java.util.function.Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return dfcj.d((ebqq) obj);
                }

                public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null);
        }
        if (strD2 != null) {
            ewjtVar.copyOnWrite();
            ewjy ewjyVar6 = (ewjy) ewjtVar.instance;
            ewjyVar6.b |= 4096;
            ewjyVar6.n = strD2;
        }
        final String strE2 = ebqqVar.e();
        if (strE2 != null) {
            Map.EL.forEach(e, new BiConsumer() { // from class: dfch
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ewjv ewjvVar = (ewjv) obj2;
                    int i4 = dfcj.d;
                    if (strE2.contains((String) obj)) {
                        ewjt ewjtVar2 = ewjtVar;
                        ewjtVar2.copyOnWrite();
                        ewjy ewjyVar7 = (ewjy) ewjtVar2.instance;
                        ewjy ewjyVar8 = ewjy.a;
                        ewjvVar.getClass();
                        evsx evsxVar = ewjyVar7.s;
                        if (!evsxVar.c()) {
                            ewjyVar7.s = evsn.mutableCopy(evsxVar);
                        }
                        ewjyVar7.s.h(ewjvVar.B);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
        }
        if (ebqqVar instanceof ebqr) {
            ewjtVar.copyOnWrite();
            ewjy ewjyVar7 = (ewjy) ewjtVar.instance;
            ewjyVar7.e = 1;
            ewjyVar7.b |= 4;
        } else {
            ebqs ebqsVar = (ebqs) ebqqVar;
            ewjtVar.copyOnWrite();
            ewjy ewjyVar8 = (ewjy) ewjtVar.instance;
            ewjyVar8.e = 2;
            ewjyVar8.b |= 4;
            int iY = ebqsVar.y();
            ewjtVar.copyOnWrite();
            ewjy ewjyVar9 = (ewjy) ewjtVar.instance;
            ewjyVar9.b |= 16;
            ewjyVar9.g = iY;
            String strA = ebqsVar.A();
            ewjtVar.copyOnWrite();
            ewjy ewjyVar10 = (ewjy) ewjtVar.instance;
            strA.getClass();
            ewjyVar10.b |= 32;
            ewjyVar10.h = strA;
            int iA3 = ebqp.a(ebqsVar);
            if (iA3 != 0) {
                ewjtVar.copyOnWrite();
                ewjy ewjyVar11 = (ewjy) ewjtVar.instance;
                ewjyVar11.b |= 256;
                ewjyVar11.k = iA3;
            }
            if (((Boolean) dhjt.a.a()).booleanValue() && (i3 = ebqsVar.z().m) != 0) {
                ewjq ewjqVar = (ewjq) ewjs.a.createBuilder();
                ewjqVar.copyOnWrite();
                ewjs ewjsVar = (ewjs) ewjqVar.instance;
                ewjsVar.c = i3 - 1;
                ewjsVar.b |= 1;
                ewjs ewjsVar2 = (ewjs) ewjqVar.build();
                ewjtVar.copyOnWrite();
                ewjy ewjyVar12 = (ewjy) ewjtVar.instance;
                ewjsVar2.getClass();
                ewjyVar12.r = ewjsVar2;
                ewjyVar12.b |= 524288;
            }
        }
        ewjtVar.copyOnWrite();
        ewjy ewjyVar13 = (ewjy) ewjtVar.instance;
        ewjyVar13.o = i2 - 1;
        ewjyVar13.b |= 8192;
        String strJ2 = ebqqVar.j("X-Google-Event-Id");
        if (strJ2 != null) {
            ewjtVar.copyOnWrite();
            ewjy ewjyVar14 = (ewjy) ewjtVar.instance;
            ewjyVar14.b |= 2048;
            ewjyVar14.m = strJ2;
        }
        ebob ebobVarD = ebqqVar.a.d("Reason");
        if (ebobVarD != null) {
            String strA2 = ebobVarD.a();
            ewjtVar.copyOnWrite();
            ewjy ewjyVar15 = (ewjy) ewjtVar.instance;
            strA2.getClass();
            ewjyVar15.b |= 128;
            ewjyVar15.j = strA2;
        }
        int i4 = ((ewjy) ewjtVar.instance).f;
        int iA4 = esxs.a(i4);
        if (((iA4 != 0 && iA4 == 6) || ((iA = esxs.a(i4)) != 0 && iA == 12)) && ebqqVar.v("Contact")) {
            try {
                ebnr ebnrVarB = ebqqVar.b();
                if (ebnrVarB != null) {
                    strE = ebnrVarB.e();
                }
                if (!Objects.isNull(ebnrVarB) && !Objects.isNull(strE)) {
                    int i5 = Integer.parseInt(strE);
                    ewjtVar.copyOnWrite();
                    ewjy ewjyVar16 = (ewjy) ewjtVar.instance;
                    ewjyVar16.b |= 65536;
                    ewjyVar16.q = i5;
                }
            } catch (NumberFormatException unused) {
            }
        }
        ewfd ewfdVar = (ewfd) ewfe.a.createBuilder();
        String strF = ebqvVar.f();
        ewfdVar.copyOnWrite();
        ewfe ewfeVar = (ewfe) ewfdVar.instance;
        ewfeVar.b |= 1;
        ewfeVar.c = strF;
        int iB = ebqvVar.b();
        ewfdVar.copyOnWrite();
        ewfe ewfeVar2 = (ewfe) ewfdVar.instance;
        ewfeVar2.b |= 2;
        ewfeVar2.d = iB;
        int i6 = true != ebqvVar.n() ? 4 : 3;
        ewfdVar.copyOnWrite();
        ewfe ewfeVar3 = (ewfe) ewfdVar.instance;
        ewfeVar3.f = i6 - 1;
        ewfeVar3.b |= 8;
        ebqvVar.c();
        String strC = ebqvVar.c();
        ewfdVar.copyOnWrite();
        ewfe ewfeVar4 = (ewfe) ewfdVar.instance;
        ewfeVar4.b = 4 | ewfeVar4.b;
        ewfeVar4.e = strC;
        ewjtVar.copyOnWrite();
        ewjy ewjyVar17 = (ewjy) ewjtVar.instance;
        ewfe ewfeVar5 = (ewfe) ewfdVar.build();
        ewfeVar5.getClass();
        ewjyVar17.p = ewfeVar5;
        ewjyVar17.b |= 16384;
        if (((Boolean) c.a()).booleanValue() && (strJ = ebqqVar.j("P-Preferred-Service")) != null) {
            ewjx ewjxVar = (ewjx) f.getOrDefault(strJ, ewjx.UNEXPECTED_SERVICE);
            ewjtVar.copyOnWrite();
            ewjy ewjyVar18 = (ewjy) ewjtVar.instance;
            ewjyVar18.t = ewjxVar.f;
            ewjyVar18.b |= 4194304;
        }
        ewjy ewjyVar19 = (ewjy) ewjtVar.build();
        deyw deywVar = this.g;
        Context context = this.a;
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        ewjyVar19.getClass();
        ewseVar.d = ewjyVar19;
        ewseVar.c = 2;
        deywVar.i(context, ewsdVar, ewqu.SIP_EVENT);
    }
}
